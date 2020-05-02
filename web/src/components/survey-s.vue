<template>
  <div class="card text-dark bg-light ">
    <div class="card-header">医院概况</div>
    <div class="card-body">
      <p class="card-text">
        <img src="../../static/hospital.png" style="height: 30px;width: 30px">医院介绍：&nbsp;&nbsp;&nbsp;
        医好连锁口腔医院是大连市建院最先进、规模最大的口腔专科医院，是医疗保险定点和非营利性医院。
        该院始建于2020年，已成为一所环境优美、设备一流、技术先进，集医疗、教学、科研、预防于一体的现代化口腔专科医院，
        跻身国内同行业先进行列。荣获了辽宁省文明单位、大连市先进集体、规范服务红旗单位等称号。现有职工324名，其中高级职称57名。
        医好口腔坐落在沙河口区长江路935号，建筑面积1.1万平方米。
        <img class="map" src="../../static/book.png" style="height: 30px;width: 30px" @click="survey">
        <a class="map" style="color: #08afaf" @click="survey">详细介绍</a>
      </p>
      <p>
        <img src="../../static/position.png" style="height: 30px;width: 30px">医院地址：&nbsp;&nbsp;&nbsp;
        总院：辽宁省大连市沙河口区长江路935号&nbsp;&nbsp;&nbsp;
        <img src="../../static/map.png" class= "map"@click="map">
        <a class="map" style="color: #08afaf" @click="map">查看地图</a>
      <div class="mapbox"  v-if="showMap">

        <baidu-map :center="center" :zoom="zoom" @ready="handler" style="height:400px;width: 600px"@click="getClickInfo">
          <bm-navigation anchor="BMAP_ANCHOR_TOP_RIGHT"></bm-navigation>
          <!--<bm-map-type :map-types="['BMAP_NORMAL_MAP', 'BMAP_HYBRID_MAP']"></bm-map-type>-->
          <bm-geolocation anchor="BMAP_ANCHOR_BOTTOM_RIGHT" :showAddressBar="true" :autoLocation="true"></bm-geolocation>
          <bm-city-list anchor="BMAP_ANCHOR_TOP_LEFT"></bm-city-list>

        </baidu-map>
      </div>

      </p>
      <p>
        <img src="../../static/telphone.png" style="height: 30px;width: 30px">医院电话：&nbsp;&nbsp;&nbsp;
        医院总机：022-2323 2323
      </p>
    </div>
  </div>
</template>

<script>
  export default {
    name: "survey-s",
    data() {
      return {
        center: {lng: 0, lat: 0},
        zoom: 16,
        showMap:false,
      }
    },
    methods: {
      survey(){
        this.$router.push("/survey");
        document.body.scrollTop = 0;
        // firefox
        document.documentElement.scrollTop = 0;
        // safari
        window.pageYOffset = 0;
      },
      map:function(){
        this.showMap = !this.showMap;
      },
      handler({BMap, map}) {
        console.log(BMap, map)
        this.center.lng = 121.593477781
        this.center.lat = 38.9487099383
        this.zoom = this.zoom
        let icon = new BMap.Icon(require("../../static/dilocal.png"),new BMap.Size(100,100),{
          imageSize:new BMap.Size(40,40),
          anchor: new BMap.Size(30,30)
        });
        //设置标注的经纬度
        var marker = new BMap.Marker(new BMap.Point(121.593477781,38.9487099383),{icon:icon});
        //把标注添加到地图上
        map.addOverlay(marker);
      }, getClickInfo(e) {
        console.log(e.point.lng)
        console.log(e.point.lat)
        this.center.lng = e.point.lng
        this.center.lat = e.point.lat
      }
    }
  }
</script>

<style scoped>
  .map{
    height: 27px;
    width: 27px;
    font-size: 14px;
  }
  .map:hover{
    filter: drop-shadow(0 0 0 dodgerblue);
    cursor:pointer;
  }
  .mapbox{
    margin-left: 60px;
    margin-top: 30px;
    width: 900px;
    height: 400px;
  }
</style>
