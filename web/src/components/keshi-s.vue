<template>
  <div class="card text-dark bg-light ">
    <div class="card-header">科室导诊</div>
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
      <el-button type="primary" style="width: 825px" plain @click="keshiinfo">全部科室详情-->></el-button>
    </div>
  </div>
</template>
<script>
  export default {
    name: "keshi-s",
    methods: {
      keshiinfo(){
        this.$router.push('/keshiinfo');
        // chrome
        document.body.scrollTop = 0;
        // firefox
        document.documentElement.scrollTop = 0;
        // safari
        window.pageYOffset = 0;
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
    }
  }
</script>

<style scoped>
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
