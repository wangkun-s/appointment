<template>
  <div class="card text-dark bg-light">
    <div class="card-body" style="width: 1200px;margin:0 auto;">
      <el-tabs type="border-card">
        <el-row :gutter="20" style="margin-left: 220px">
          <el-col :span="4"><div class="grid-content bg-purple" @click="dalian" style="cursor: pointer;"
                                 onMouseOver="this.style.color='#1E90FF'" onMouseOut="this.style.color='#000000'">
            大连</div></el-col>
          <el-col :span="4"><div class="grid-content bg-purple" style="cursor: pointer;"
                                 onMouseOver="this.style.color='#1E90FF'" onMouseOut="this.style.color='#000000'">
            沈阳</div></el-col>
          <el-col :span="4"><div class="grid-content bg-purple" @click="jinzhou" style="cursor: pointer;"
                                 onMouseOver="this.style.color='#1E90FF'" onMouseOut="this.style.color='#000000'">
            锦州</div></el-col>
          <el-col :span="4"><div class="grid-content bg-purple" @click="anshan" style="cursor: pointer;"
                                 onMouseOver="this.style.color='#1E90FF'" onMouseOut="this.style.color='#000000'">
            鞍山</div></el-col>
          <el-col :span="4"><div class="grid-content bg-purple" @click="tieling" style="cursor: pointer;"
                                 onMouseOver="this.style.color='#1E90FF'" onMouseOut="this.style.color='#000000'">
            铁岭</div></el-col>
        </el-row>
        <el-container >
          <el-aside style="margin-top:15px">
            <el-table :data="tableData">
              <el-table-column>
                <template slot-scope="scope">
                  <el-button type="text" @click="handleJoinPeople(scope.row)">{{scope.row.olocation}}</el-button>
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
    name: "shenyang",
    data(){
      return {
        //定义指定地点的名称和经纬度
        tableData:[],
        jd: 123.2589397000,  //初始地图中心点的经纬度
        wd: 41.7450385600,
        map: {},
        point: {},
      }
    },
    mounted: function () {
      this.otherArea();
    },
    methods: {
      handleJoinPeople(row){
        console.log(row);
        this.point = new BMap.Point(row.ojd, row.owd);
        this.map.centerAndZoom(this.point, 16);
        var content = "<table>";
        content = content + "<tr><td> 地点："+row.olocation+"</td></tr>";
        content = content + "<tr><td> 预约电话："+row.ophone+"</td></tr>";
        content += "</table>";
        var infoWindow = new BMap.InfoWindow(content);  // 创建信息窗口对象
        this.map.openInfoWindow(infoWindow, this.point); //开启信息窗口
      },
      otherArea(){
        this.$axios({
          method: "get",
          url: "/api/otherarea/otherarea" ,
          params:{
            olocal:"沈阳"
          }
        }).then((res)=>{
          for(let i = 0;i<res.data.length;i++){
            this.tableData.push(res.data[i])
          }
          this.loadmap(this.jd,this.wd);
        })
      },
      loadmap(jd, wd) {
        var _this = this;   //保存此时的this值！！！
        this.map = new BMap.Map("newmap");          // 创建地图实例
        this.point = new BMap.Point(this.jd, this.wd);  // 创建点坐标
        this.map.centerAndZoom(this.point, 12);                 // 初始化地图，设置中心点坐标和地图级别
        //this.map.enableScrollWheelZoom(true);     //开启鼠标滚轮缩放
        for (let i = 0; i < this.tableData.length; i++) {
          console.log(this.tableData[i].ojd)
          var point2 = new BMap.Point(this.tableData[i].ojd, this.tableData[i].owd);
          var marker = new BMap.Marker(point2);        // 创建标注
          _this.map.addOverlay(marker);
        }
      },
      dalian(){
        this.$router.push('/dalian')
      },
      jinzhou(){
        this.$router.push('/jinzhou')
      },
      anshan(){
        this.$router.push('/anshan')
      },
      tieling(){
        this.$router.push('/tieling')
      }
    },
  }
</script>

<style>
  .buildinglist:hover{
    cursor: pointer;
  }

</style>
