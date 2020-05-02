<template>
  <div class="card text-dark bg-light">
    <div class="card-body" style="width: 1200px;margin:0 auto;">
      <el-tabs type="border-card">
        <el-row :gutter="20" style="margin-left: 220px">
          <el-col :span="4"><div class="grid-content bg-purple" @click="dalian" style="cursor: pointer;"
                                 onMouseOver="this.style.color='#1E90FF'" onMouseOut="this.style.color='#000000'">
            大连</div></el-col>
          <el-col :span="4"><div class="grid-content bg-purple" @click="shenyang" style="cursor: pointer;"
                                 onMouseOver="this.style.color='#1E90FF'" onMouseOut="this.style.color='#000000'">
            沈阳</div></el-col>
          <el-col :span="4"><div class="grid-content bg-purple" @click="jinzhou" style="cursor: pointer;"
                                 onMouseOver="this.style.color='#1E90FF'" onMouseOut="this.style.color='#000000'">
            锦州</div></el-col>
          <el-col :span="4"><div class="grid-content bg-purple" @click="anshan" style="cursor: pointer;"
                                 onMouseOver="this.style.color='#1E90FF'" onMouseOut="this.style.color='#000000'">
            鞍山</div></el-col>
          <el-col :span="4"><div class="grid-content bg-purple" style="cursor: pointer;"
                                 onMouseOver="this.style.color='#1E90FF'" onMouseOut="this.style.color='#000000'">
            铁岭</div></el-col>
        </el-row>
        <el-container>
          <el-aside style="margin-top:15px">
            <el-table :data="buildinglist" @row-click="skiptomap" fit highlight-current-row stripe border class="buildinglist">
              <el-table-column prop="name" lable="name" align="center"></el-table-column>
              <el-table-column>
                <template slot-scope="scope">
                  <a href="scope.row.details" class="buttonText">{{scope.row.details}}</a>
                </template>
              </el-table-column>
            </el-table>
          </el-aside>
          <el-container id="newmap" style="margin-top:20px;margin-left:20px; height:600px;"></el-container>
        </el-container>
      </el-tabs>
    </div>
  </div>
</template>

<script>
  export default {
    name: "tieling",
    data(){
      return {
        //定义指定地点的名称和经纬度
        buildinglist: [{ name: '铁岭市银州区市府路分诊所',details:'详情', j: 123.8487797000, w: 42.2925559300 },
          { name: '铁岭市银州区光荣街南段分诊所',details:'详情', j: 123.8383206400, w:42.2813317900},
          { name: '铁岭市银州区阳光小区分诊所', details:'详情',j: 123.8293793500, w: 42.2926480600}],
        jd: 123.8487797000,  //初始地图中心点的经纬度
        wd: 42.2925559300,
        map: {},
        point: {},
      }
    },
    mounted: function () {
      this.loadmap(this.jd,this.wd);
    },
    methods: {
      loadmap(jd, wd) {
        var _this = this;   //保存此时的this值！！！
        this.map = new BMap.Map("newmap");          // 创建地图实例
        this.point = new BMap.Point(jd, wd);  // 创建点坐标
        this.map.centerAndZoom(this.point, 12);                 // 初始化地图，设置中心点坐标和地图级别
        //this.map.enableScrollWheelZoom(true);     //开启鼠标滚轮缩放
        this.buildinglist.forEach(function (item) {    //创建多标注
          var point2 = new BMap.Point(item.j, item.w);
          var marker = new BMap.Marker(point2);        // 创建标注
          _this.map.addOverlay(marker);                    // 将标注添加到地图中
        })
      },
      skiptomap(row, event, column) {
        this.point = new BMap.Point(row.j, row.w);
        this.map.centerAndZoom(this.point, 14);
        var infoWindow = new BMap.InfoWindow(row.name);  // 创建信息窗口对象
        this.map.openInfoWindow(infoWindow, this.point); //开启信息窗口
      },
      dalian(){
        this.$router.push('/dalian')
      },
      shenyang(){
        this.$router.push('/shenyang')
      },
      jinzhou(){
        this.$router.push('/jinzhou')
      },
      anshan(){
        this.$router.push('/anshan')
      },
    },
  }
</script>

<style>
  .buildinglist:hover{
    cursor: pointer;
  }

</style>
