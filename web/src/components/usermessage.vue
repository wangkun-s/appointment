<template>
  <div style="background-color: #EBEBEB;min-height:900px">
    <div style="margin-top:5px" v-if="identity==='1'">
      <el-row>
        <el-col :xs="4" :sm="4" :md="4" :lg="4">
          <div style="background-color: white">
            <el-menu default-active="1" class="el-menu-vertical-demo" style="margin-left:50px;min-height:900px" @select="handleSelect">
              <el-menu-item index="1"><img src="../../static/usermessage.png" style="width: 20px;height: 20px" >个人信息卡</el-menu-item>
              <el-menu-item index="2"><i class="el-icon-menu"></i>预约信息</el-menu-item>
              <el-menu-item index="3"><img src="../../static/passwordmessage.png" style="width: 20px;height: 20px">修改密码</el-menu-item>
              <el-menu-item index="4"><img src="../../static/phonemessage.png" style="width: 20px;height: 20px">修改手机号</el-menu-item>
              <el-menu-item index="5"><img src="../../static/emailmessage.png" style="width: 20px;height: 20px">修改邮箱</el-menu-item>
              <el-menu-item index="7"><img src="../../static/bingli.png" style="width: 25px;height: 25px">电子病历</el-menu-item>
              <el-menu-item index="6"><img src="../../static/quit.png" style="width: 20px;height: 20px">退出</el-menu-item>
            </el-menu>
          </div>
        </el-col>
        <el-col :xs="20" :sm="20" :md="20" :lg="20">
          <div>
            <div style="border: 1px solid #A6A6A6; border-radius:6px; padding:5px; margin:2px; background-color: white">
              <el-breadcrumb separator="/">
                <el-breadcrumb-item v-for="item in breadcrumbItems"  :key="item" >{{item}}</el-breadcrumb-item>
              </el-breadcrumb>
            </div>
          </div>

          <div style="margin-top:10px">
            <router-view></router-view>
          </div>
        </el-col>
      </el-row>
    </div>

    <div style="margin-top:5px" v-if="identity==='0'">
      <el-row>
        <el-col :xs="4" :sm="4" :md="4" :lg="4">
          <div style="background-color: white">
            <el-menu default-active="1" class="el-menu-vertical-demo" style="margin-left:50px;min-height:900px" @select="handleSelect0">
              <el-menu-item index="1"><img src="../../static/keshian.png" style="width: 20px;height: 20px" >创建新科室</el-menu-item>
              <el-menu-item index="2"><img src="../../static/yishengan.png" style="width: 20px;height: 20px">创建医生账号</el-menu-item>
              <el-menu-item index="3"><img src="../../static/patietan.png" style="width: 20px;height: 20px">医生档案管理</el-menu-item>
              <el-menu-item index="4"><img src="../../static/doctoran.png" style="width: 20px;height: 20px">患者档案管理</el-menu-item>
              <el-menu-item index="6"><img src="../../static/quit.png" style="width: 20px;height: 20px">退出</el-menu-item>
            </el-menu>
          </div>
        </el-col>
        <el-col :xs="20" :sm="20" :md="20" :lg="20">
          <div>
            <div style="border: 1px solid #A6A6A6; border-radius:6px; padding:5px; margin:2px; background-color: white">
              <el-breadcrumb separator="/">
                <el-breadcrumb-item v-for="item in breadcrumbItems"  :key="item" >{{item}}</el-breadcrumb-item>
              </el-breadcrumb>
            </div>
          </div>

          <div style="margin-top:10px">
            <router-view></router-view>
          </div>
        </el-col>
      </el-row>
    </div>

    <div style="margin-top:5px" v-if="identity==='2'">
      <el-row>
        <el-col :xs="4" :sm="4" :md="4" :lg="4">
          <div style="background-color: white">
            <el-menu default-active="1" class="el-menu-vertical-demo" style="margin-left:50px" @select="handleSelect2">
              <el-menu-item index="1"><img src="../../static/usermessage.png" style="width: 20px;height: 20px" >个人信息卡</el-menu-item>
              <el-menu-item index="2"><i class="el-icon-menu"></i>查看预约</el-menu-item>
              <el-menu-item index="3"><img src="../../static/time.png" style="width: 20px;height: 20px" >安排时间</el-menu-item>
              <el-menu-item index="4"><img src="../../static/phonemessage.png" style="width: 20px;height: 20px">修改手机号</el-menu-item>
              <el-menu-item index="5"><img src="../../static/passwordmessage.png" style="width: 20px;height: 20px">修改密码</el-menu-item>
              <el-menu-item index="6"><img src="../../static/emailmessage.png" style="width: 20px;height: 20px">修改邮箱</el-menu-item>
              <el-menu-item index="7"><img src="../../static/quit.png" style="width: 20px;height: 20px">退出</el-menu-item>
            </el-menu>
          </div>
        </el-col>
        <el-col :xs="20" :sm="20" :md="20" :lg="20">
          <div>
            <div style="border: 1px solid #A6A6A6; border-radius:6px; padding:5px; margin:2px; background-color: white">
              <el-breadcrumb separator="/">
                <el-breadcrumb-item v-for="item in breadcrumbItems"  :key="item" >{{item}}</el-breadcrumb-item>
              </el-breadcrumb>
            </div>
          </div>

          <div style="margin-top:10px">
            <router-view></router-view>
          </div>
        </el-col>
      </el-row>
    </div>
  </div>
</template>
<script>
  export default {
    name:'usermessage',
    data(){
      return {
        searchCriteria: '',
        breadcrumbItems: [],
        identity:sessionStorage.getItem("identity"),
      }
    },
    mounted(){
      if(this.identity==="1"){
        this.$router.push('/page1');
      }else if(this.identity==="0"){
        this.$router.push('/page01');
      }else{
        this.$router.push('/page21');
      }
    },
    methods:{
      handleIconClick(ev) {
        console.log(ev);
      },

      handleSelect(key, keyPath){
        switch(key){
          case '1':
            this.$router.push('/page1');
            this.breadcrumbItems  = ['个人信息卡']
            break;
          case '2':
            this.$router.push('/page2')
            this.breadcrumbItems  = ['预约信息']
            break;
          case '3':
            this.$router.push('/page3')
            this.breadcrumbItems  = ['修改密码']
            break;
          case '4':
            this.$router.push('/page4')
            this.breadcrumbItems  = ['修改密码']
            break;
          case '5':
            this.$router.push('/page5')
            this.breadcrumbItems  = ['修改邮箱']
            break;
          case '7':
            this.$router.push('/page7')
            this.breadcrumbItems  = ['电子病历']
            break;
          case '6':
            this.$router.push('/page6')
            this.breadcrumbItems  = ['退出']
            break;
        }
      },
      handleSelect0(key, keyPath){
        switch(key){
          case '1':
            this.$router.push('/page01');
            this.breadcrumbItems  = ['创建新科室']
            break;
          case '2':
            this.$router.push('/page02')
            this.breadcrumbItems  = ['创建医生账号']
            break;
          case '3':
            this.$router.push('/page03')
            this.breadcrumbItems  = ['医生档案管理']
            break;
          case '4':
            this.$router.push('/page04')
            this.breadcrumbItems  = ['患者档案管理']
            break;
          case '6':
            this.$router.push('/page6')
            this.breadcrumbItems  = ['退出']
            break;
        }
      },

      handleSelect2(key, keyPath){
        switch(key){
          case '1':
            this.$router.push('/page21');
            this.breadcrumbItems  = ['个人信息卡']
            break;
          case '2':
            this.$router.push('/page22')
            this.breadcrumbItems  = ['查看预约']
            break;
          case '3':
            this.$router.push('/page23')
            this.breadcrumbItems  = ['安排时间']
            break;
          case '4':
            this.$router.push('/page24')
            this.breadcrumbItems  = ['修改手机号']
            break;
          case '5':
            this.$router.push('/page25')
            this.breadcrumbItems  = ['修改密码']
            break;
          case '6':
            this.$router.push('/page26')
            this.breadcrumbItems  = ['修改邮箱']
            break;
          case '7':
            this.$router.push('/page6')
            this.breadcrumbItems  = ['退出']
            break;
        }
      },
    },
  }
</script>

<style scoped>

</style>
