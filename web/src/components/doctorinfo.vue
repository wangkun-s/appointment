<template>
  <div>
    <div style="width: auto;height: auto">
      <img src="../../static/logo.jpg" style="width: 100px;height: 100px">
      <i class="web-font">医好连锁口腔医院</i>
      &nbsp;&nbsp;&nbsp;
      <el-tag type="success">连锁专科</el-tag>
      <el-tag type="info">国营</el-tag>
      <el-tag type="warning">专科医院</el-tag>
    </div>
    <div class="card text-dark bg-light ">
      <div class="card-body" style="width: 1200px;margin:0 auto;">
        <el-tabs type="border-card">
          <el-tab-pane label="所有专家列表">
            <div class="col-md-12">
              <el-card class="box-card" style="padding: 20px">
                <div style=" margin-bottom: 20px; width: 400px; margin-left: 570px">
                  <el-input placeholder="请输入内容" v-model="input" class="input-with-select">
                    <el-select v-model="select" slot="prepend" placeholder="请选择" style="width: 100px;">
                      <el-option label="姓名" value="name"></el-option>
                      <el-option label="科室" value="department"></el-option>
                      <el-option label="职称" value="job"></el-option>
                    </el-select>
                    <el-button slot="append" icon="el-icon-search" @click="selectInput"></el-button>
                  </el-input>
                </div>
                <div>
                  <el-popover v-for="(data,i) in tableData" :key="i">
                  <el-button slot="reference">
                    <div class="text item" style="width: 200px;height: 200px">
                        <img :src="data.img" style="height: 100px;width: 100px">
                      <h5 class="mt-0" style="float: right;text-align:left;margin-left: 10px;font-size: 18px">
                        名字：{{data.dname}}</br>
                        科室：{{data.de_name}}</br>
                        职称：{{data.djob}}</br>
                      </h5>
                      <router-link :to="{path:'/timelink',query:{eDid:data.did}}">
                        <el-button type="primary" plain>查看时间表</el-button>
                      </router-link>
                    </div>
                  </el-button>
                </el-popover>
                </div>
              </el-card>
            </div>
          </el-tab-pane>
        </el-tabs>
      </div>
    </div>
  </div>
</template>

<script>
  export default {
    name:"doctorinfo",
    methods: {
      selectInput(){
        this.$axios({
          method:"get",
          url: "/api/doctor/selectInput",
          params: {
            input: this.input,
            select: this.select,
          }
          }).then((res)=>{
            this.tableData = [];
            for(let i=0;i<res.data.length;i++){
              this.tableData.push(res.data[i]);
              this.tableData[i].img = '';
            }
            for(let i=0;i<this.imgArr.length;i++){
              this.tableData[i].img = this.imgArr[i].imgSrc;
            }
          })
      },
      dingbu(){
        this.$router.push('/doctorinfo');
        // chrome
        document.body.scrollTop = 0;
        // firefox
        document.documentElement.scrollTop = 0;
        // safari
        window.pageYOffset = 0;
      },
      all(){
        this.$axios({
          method:"get",
          url: "/api/doctor/doctorsinfo",
        }).then((res)=>{
          for(let i=0;i<res.data.length;i++){
            this.tableData.push(res.data[i])
            this.tableData[i].img = '';
          }
          for(let i=0;i<this.tableData.length;i++){
              this.tableData[i].img = this.imgArr[i].imgSrc;
          }
        })
      }
    },

    mounted(){
      this.dingbu();
      this.all();
    },
    data() {
      return {
        input: '',
        select: '',
        img:'',
        tableData:[],
        imgArr:[
          {imgSrc:require('../assets/doctor/doctor1.jpg')},
          {imgSrc:require('../assets/doctor/doctor2.jpg')},
          {imgSrc:require('../assets/doctor/doctor3.jpg')},
          {imgSrc:require('../assets/doctor/doctor4.jpg')},
          {imgSrc:require('../assets/doctor/doctor5.jpg')},
          {imgSrc:require('../assets/doctor/doctor6.jpg')},
          {imgSrc:require('../assets/doctor/doctor7.jpg')},
          {imgSrc:require('../assets/doctor/doctor8.jpg')},
          {imgSrc:require('../assets/doctor/doctor9.jpg')},
          {imgSrc:require('../assets/doctor/doctor10.jpg')},
          {imgSrc:require('../assets/doctor/doctor11.jpg')},
          {imgSrc:require('../assets/doctor/doctor12.jpg')},
          {imgSrc:require('../assets/doctor/doctor13.jpg')},
          {imgSrc:require('../assets/doctor/doctor14.jpg')},
          {imgSrc:require('../assets/doctor/doctor15.jpg')},
          {imgSrc:require('../assets/doctor/doctor16.jpg')},
          {imgSrc:require('../assets/doctor/doctor17.jpg')},
          {imgSrc:require('../assets/doctor/doctor18.jpg')},
          {imgSrc:require('../assets/doctor/doctor19.jpg')},
          {imgSrc:require('../assets/doctor/doctor20.jpg')},
          {imgSrc:require('../assets/doctor/doctor21.jpg')},
          {imgSrc:require('../assets/doctor/doctor22.jpg')},
          {imgSrc:require('../assets/doctor/doctor23.jpg')},
          {imgSrc:require('../assets/doctor/doctor24.jpg')},
          {imgSrc:require('../assets/doctor/doctor25.jpg')},
          {imgSrc:require('../assets/doctor/doctor26.jpg')},
          {imgSrc:require('../assets/doctor/doctor27.jpg')},
          {imgSrc:require('../assets/doctor/doctor28.jpg')},
          {imgSrc:require('../assets/doctor/doctor29.jpg')},
          {imgSrc:require('../assets/doctor/doctor30.jpg')},
          {imgSrc:require('../assets/doctor/doctor31.jpg')},
          {imgSrc:require('../assets/doctor/doctor32.jpg')},
          {imgSrc:require('../assets/doctor/doctor34.jpg')},
          {imgSrc:require('../assets/doctor3/doctor1.jpg')},
          {imgSrc:require('../assets/doctor3/doctor2.jpg')},
          {imgSrc:require('../assets/doctor3/doctor3.jpg')},
          {imgSrc:require('../assets/doctor3/doctor4.jpg')},
          {imgSrc:require('../assets/doctor3/doctor5.jpg')},
          {imgSrc:require('../assets/doctor3/doctor6.jpg')},
          {imgSrc:require('../assets/doctor3/doctor7.jpg')},
          {imgSrc:require('../assets/doctor3/doctor8.jpg')},
          {imgSrc:require('../assets/doctor3/doctor9.jpg')},
          {imgSrc:require('../assets/doctor3/doctor10.jpg')},
          {imgSrc:require('../assets/doctor3/doctor11.jpg')},
          {imgSrc:require('../assets/doctor3/doctor12.jpg')},
          {imgSrc:require('../assets/doctor3/doctor13.jpg')},
          {imgSrc:require('../assets/doctor3/doctor14.jpg')},
          {imgSrc:require('../assets/doctor3/doctor15.jpg')},
          {imgSrc:require('../assets/doctor3/doctor16.jpg')},
          {imgSrc:require('../assets/doctor3/doctor17.jpg')},
          {imgSrc:require('../assets/doctor3/doctor18.jpg')},
          {imgSrc:require('../assets/doctor3/doctor19.jpg')},
          {imgSrc:require('../assets/doctor3/doctor20.jpg')},
          {imgSrc:require('../assets/doctor3/doctor21.jpg')},
          {imgSrc:require('../assets/doctor3/doctor22.jpg')},
          {imgSrc:require('../assets/doctor3/doctor23.jpg')},
          {imgSrc:require('../assets/doctor3/doctor24.jpg')},
          {imgSrc:require('../assets/doctor3/doctor25.jpg')},
          {imgSrc:require('../assets/doctor3/doctor26.jpg')},
          {imgSrc:require('../assets/doctor3/doctor27.jpg')},
          {imgSrc:require('../assets/doctor3/doctor28.jpg')},
          {imgSrc:require('../assets/doctor3/doctor29.jpg')},
          {imgSrc:require('../assets/doctor3/doctor30.jpg')},
          {imgSrc:require('../assets/doctor3/doctor31.jpg')},
          {imgSrc:require('../assets/doctor3/doctor32.jpg')},
          {imgSrc:require('../assets/doctor3/doctor34.jpg')},
          {imgSrc:require('../assets/doctor2/doctor1.jpg')},
          {imgSrc:require('../assets/doctor2/doctor2.jpg')},
          {imgSrc:require('../assets/doctor2/doctor3.jpg')},
          {imgSrc:require('../assets/doctor2/doctor4.jpg')},
          {imgSrc:require('../assets/doctor2/doctor5.jpg')},
          {imgSrc:require('../assets/doctor2/doctor6.jpg')},
          {imgSrc:require('../assets/doctor2/doctor7.jpg')},
          {imgSrc:require('../assets/doctor2/doctor8.jpg')},
          {imgSrc:require('../assets/doctor2/doctor9.jpg')},
          {imgSrc:require('../assets/doctor2/doctor10.jpg')},
          {imgSrc:require('../assets/doctor2/doctor11.jpg')},
          {imgSrc:require('../assets/doctor2/doctor12.jpg')},
          {imgSrc:require('../assets/doctor2/doctor13.jpg')},
          {imgSrc:require('../assets/doctor2/doctor14.jpg')},
          {imgSrc:require('../assets/doctor2/doctor15.jpg')},
          {imgSrc:require('../assets/doctor2/doctor16.jpg')},
          {imgSrc:require('../assets/doctor2/doctor17.jpg')},
          {imgSrc:require('../assets/doctor2/doctor18.jpg')},
          {imgSrc:require('../assets/doctor2/doctor19.jpg')},
          {imgSrc:require('../assets/doctor2/doctor20.jpg')},
          {imgSrc:require('../assets/doctor2/doctor21.jpg')},
          {imgSrc:require('../assets/doctor2/doctor22.jpg')},
          {imgSrc:require('../assets/doctor2/doctor23.jpg')},
          {imgSrc:require('../assets/doctor2/doctor24.jpg')},
          {imgSrc:require('../assets/doctor2/doctor25.jpg')},
          {imgSrc:require('../assets/doctor2/doctor26.jpg')},
          {imgSrc:require('../assets/doctor2/doctor27.jpg')},
          {imgSrc:require('../assets/doctor2/doctor28.jpg')},
          {imgSrc:require('../assets/doctor2/doctor29.jpg')},
          {imgSrc:require('../assets/doctor2/doctor30.jpg')},
          {imgSrc:require('../assets/doctor2/doctor31.jpg')},
          {imgSrc:require('../assets/doctor2/doctor32.jpg')},
          {imgSrc:require('../assets/doctor2/doctor34.jpg')},
        ]
      }
    }
  }
</script>

<style>
  @font-face {
    font-family: 'webfont';
    font-display: swap;
    src: url('../css/webfont.eot'); /* IE9 */
    src: url('../css/webfont.eot?#iefix') format('embedded-opentype'), /* IE6-IE8 */ url('../css/webfont.woff2') format('woff2'),
    url('../css/webfont.woff') format('woff'), /* chrome、firefox */ url('../css/webfont.ttf') format('truetype'), /* chrome、firefox、opera、Safari, Android, iOS 4.2+*/ url('../css/webfont.svg#webfont') format('svg'); /* iOS 4.1- */
  }

  .web-font {
    font-family: "webfont" !important;
    font-size: 30px;
    font-style: normal;
    padding-left: 20px;
    -webkit-font-smoothing: antialiased;
    -moz-osx-font-smoothing: grayscale;
  }
  .el-table .warning-row {
    background: oldlace;
  }

  .el-table .success-row {
    background: #f0f9eb;
  }

</style>
