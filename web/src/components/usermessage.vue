<template>
  <div style="background-color: #EBEBEB;min-height:900px">
    <div style="margin-top:5px" >
      <el-row>
        <el-col :xs="4" :sm="4" :md="4" :lg="4">
          <div style="background-color: white">
            <el-menu default-active="1" class="el-menu-vertical-demo" style="margin-left:50px;min-height:900px" @select="handleSelect">
              <el-menu-item index="1"><img src="../../static/usermessage.png" style="width: 20px;height: 20px" >个人信息卡</el-menu-item>
              <el-menu-item index="2"><i class="el-icon-menu"></i>预约信息</el-menu-item>
              <el-menu-item index="3"><img src="../../static/passwordmessage.png" style="width: 20px;height: 20px">修改密码</el-menu-item>
              <el-menu-item index="4"><img src="../../static/phonemessage.png" style="width: 20px;height: 20px">修改手机号</el-menu-item>
              <el-menu-item index="5"><img src="../../static/emailmessage.png" style="width: 20px;height: 20px">修改邮箱</el-menu-item>
              <el-menu-item index="6"><img src="../../static/quit.png" style="width: 20px;height: 20px">退出</el-menu-item>
            </el-menu>
          </div>
        </el-col>
        <el-col :xs="20" :sm="20" :md="20" :lg="20">
          <div>
            <div style="border: 1px solid #A6A6A6; border-radius:6px; padding:5px; margin:2px; background-color: white">
              <el-breadcrumb separator="/">
                <el-breadcrumb-item v-for="item in breadcrumbItems">{{item}}</el-breadcrumb-item>
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
        // searchCriteria: '',
        // breadcrumbItems: ['个人信息卡'],
      }
    },
    mounted(){
      this.$router.push('/page1');
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
          case '6':
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
