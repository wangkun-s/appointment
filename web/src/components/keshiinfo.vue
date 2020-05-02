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
          <el-tab-pane label="科室列表">
            <div class="card-body">
              <el-row :gutter="20">
                <el-col :span="6"><div class="grid-content bg-purple" >内科</div></el-col>
                <el-col :span="6"><div class="grid-content bg-purple" @click="hanzheng" style="cursor: pointer;"
                                       onMouseOver="this.style.color='#1E90FF'" onMouseOut="this.style.color='#000000'">鼾症中心(1人)</div></el-col>
              </el-row>
              <hr style="height:1px;border:none;border-top:1px solid #DDDDDD;" />
              <el-row :gutter="20">
                <el-col :span="6"><div class="grid-content bg-purple">口腔科</div></el-col>
                <el-col :span="6"><div class="grid-content bg-purple" @click="kouqiangxiufu" style="cursor: pointer;"
                                       onMouseOver="this.style.color='#1E90FF'" onMouseOut="this.style.color='#000000'">口腔修复科(15人)</div></el-col>
                <el-col :span="6"><div class="grid-content bg-purple" @click="zhongzhi" style="cursor: pointer;"
                                       onMouseOver="this.style.color='#1E90FF'" onMouseOut="this.style.color='#000000'">种植科(2人)</div></el-col>
                <el-col :span="6"><div class="grid-content bg-purple" @click="yasui" style="cursor: pointer;"
                                       onMouseOver="this.style.color='#1E90FF'" onMouseOut="this.style.color='#000000'">牙体牙髓病科(14人)</div></el-col>
              </el-row>
              <el-row :gutter="20">
                <el-col :span="6"><div class="grid-content bg-purple"></div></el-col>
                <el-col :span="6"><div class="grid-content bg-purple" @click="nianmo" style="cursor: pointer;"
                                       onMouseOver="this.style.color='#1E90FF'" onMouseOut="this.style.color='#000000'">牙周粘膜病科(8人)</div></el-col>
                <el-col :span="6"><div class="grid-content bg-purple" @click="zhengji" style="cursor: pointer;"
                                       onMouseOver="this.style.color='#1E90FF'" onMouseOut="this.style.color='#000000'">口腔正畸科(17人)</div></el-col>
                <el-col :span="6"><div class="grid-content bg-purple" @click="hemian" style="cursor: pointer;"
                                       onMouseOver="this.style.color='#1E90FF'" onMouseOut="this.style.color='#000000'">口腔颌面外科(7人)</div></el-col>
              </el-row>
              <hr style="height:1px;border:none;border-top:1px solid #DDDDDD;" />
              <el-row :gutter="20">
                <el-col :span="6"><div class="grid-content bg-purple">麻醉科</div></el-col>
                <el-col :span="6"><div class="grid-content bg-purple" @click="mazui" style="cursor: pointer;"
                                       onMouseOver="this.style.color='#1E90FF'" onMouseOut="this.style.color='#000000'">麻醉手术科(3人)</div></el-col>
              </el-row>
              <hr style="height:1px;border:none;border-top:1px solid #DDDDDD;" />
              <el-row :gutter="20">
                <el-col :span="6"><div class="grid-content bg-purple">急诊医学科</div></el-col>
                <el-col :span="6"><div class="grid-content bg-purple" @click="zonghe"style="cursor: pointer;"
                                       onMouseOver="this.style.color='#1E90FF'" onMouseOut="this.style.color='#000000'">综合急诊(2人)</div></el-col>
              </el-row>
            </div>
          </el-tab-pane>
        </el-tabs>
      </div>
    </div>
  </div>
</template>
<script>
  export default {
    name: "keshi-s",
    methods: {
      dingbu(){
        // console.log(sessionStorage.getItem("state"))
        document.body.scrollTop = 0;
        // firefox
        document.documentElement.scrollTop = 0;
        // safari
        window.pageYOffset = 0;
      },
      keshiinfo(){
        this.$router.push('/keshiinfo');
        // chrome
      },
      hanzheng(){
        this.$router.push('/hanzheng');
        // chrome
        document.body.scrollTop = 0;
        // firefox
        document.documentElement.scrollTop = 0;
        // safari
        window.pageYOffset = 0;
      },
      kouqiangxiufu(){
        this.$router.push('/kouqiangxiufu');
        // chrome
        document.body.scrollTop = 0;
        // firefox
        document.documentElement.scrollTop = 0;
        // safari
        window.pageYOffset = 0;
      },
      zhongzhi(){
        this.$router.push('/zhongzhi');
        document.body.scrollTop = 0;
        // firefox
        document.documentElement.scrollTop = 0;
        // safari
        window.pageYOffset = 0;
      },
      yasui(){
        this.$router.push('/yasui');
        document.body.scrollTop = 0;
        // firefox
        document.documentElement.scrollTop = 0;
        // safari
        window.pageYOffset = 0;
      },
      nianmo(){
        this.$router.push('/nianmo');
        document.body.scrollTop = 0;
        // firefox
        document.documentElement.scrollTop = 0;
        // safari
        window.pageYOffset = 0;
      },
      zhengji(){
        this.$router.push('/zhengji');
        document.body.scrollTop = 0;
        // firefox
        document.documentElement.scrollTop = 0;
        // safari
        window.pageYOffset = 0;
      },
      hemian(){
        this.$router.push('/hemian');
        document.body.scrollTop = 0;
        // firefox
        document.documentElement.scrollTop = 0;
        // safari
        window.pageYOffset = 0;
      },
      mazui(){
        this.$router.push('/mazui');
        document.body.scrollTop = 0;
        // firefox
        document.documentElement.scrollTop = 0;
        // safari
        window.pageYOffset = 0;
      },
      zonghe(){
        this.$router.push('/zonghe');
        document.body.scrollTop = 0;
        // firefox
        document.documentElement.scrollTop = 0;
        // safari
        window.pageYOffset = 0;
      },
    },
    mounted(){
      this.dingbu();
    }
  }
</script>

<style scoped>
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
  /*.el-row {*/
    /*margin-bottom: 20px;*/
  /*&:last-child {*/
     /*margin-bottom: 0;*/
   /*}*/
  /*}*/
  .el-col {
    border-radius: 4px;
  }
  .bg-purple-dark {
    background: #99a9bf;
  }
  .bg-purple-light {
    background: #e5e9f2;
  }
  .grid-content {
    border-radius: 4px;
    min-height: 36px;
  }
  .row-bg {
    padding: 10px 0;
    background-color: #f9fafc;
  }

</style>
