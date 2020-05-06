<template>
    <div class="login">
        <div id="home" class="col-sm-12 text-center">
          <div class="background">
            <a style="margin: 20px auto;font-size: 30px">登录</a>
            <el-form :model="ruleForm" :rules="rules" ref="ruleForm" label-width="100px" class="demo-ruleForm" style="margin-top: 50px;">
              <el-form-item label="工号" prop="jobnumber" >
                <el-input v-model="ruleForm.jobnumber" placeholder="请输入工号" style="width: 340px;margin-left: -50px;"></el-input>
              </el-form-item>

              <el-form-item v-if="visible" label="密码" prop="password">
                <el-input  type="password" v-model="ruleForm.password" style="width: 340px;margin-left: -50px;" placeholder="请输入密码">
                  <img src="../../static/invisiable.png" slot="suffix" title="显示密码" @click="changePass('show')" style="cursor:pointer;"
                       class="el-input__icon iconfont icon-xianshi">
                </el-input>
              </el-form-item>

              <el-form-item v-else label="密码" prop="password" >
                <el-input type="text" v-model="ruleForm.password" style="width: 340px; margin-left: -50px;" placeholder="请输入密码">
                  <img src="../../static/visiable.png" slot="suffix" title="隐藏密码" @click="changePass('hide')" style="cursor:pointer;"
                       class="el-input__icon iconfont icon-yincang">
                </el-input>
              </el-form-item>

              <el-form-item label="身份选择" prop="identity" >
                <el-select v-model="ruleForm.identity" placeholder="请选择身份"  style="width: 340px; margin-left: -50px;">
                  <el-option  v-for="item in identityList" :key= "item.value" :label="item.label" :value="item.value" ></el-option>
                </el-select>
              </el-form-item>

              <el-form-item style="margin-left: -60px;margin-top: 30px">
                <el-button type="primary" @click="submitForm('ruleForm')">立即登录</el-button>
              </el-form-item>
            </el-form>
          </div>
        </div>
      </div>
</template>


<script>
  export default {
    name: "workerlogin",
    data(){
      return {
        ruleForm: {
          jobnumber: '',
          password: '',
          identity:'',
        },
        identityList:[{value:"2",label:"医生"},{value:"0",label:"管理员"}],
        visible: true,
        pstate: true,
        rules: {
          jobnumber: [{required: true, message: '请输入工号', trigger: 'blur'},],
          password: [{required: true, message: '请输入密码', trigger: 'change'}],
          identity: [{required: true, message: '请选择预身份', trigger: 'blur'}],
        }
      }
    },
    methods: {
      changePass(value) {
        this.visible = !(value === 'show');
      },   //判断渲染，true:暗文显示，false:明文显示
      submitForm(formName) {
        this.$refs[formName].validate((valid) => {
          if (valid) {
            console.log(this.ruleForm.jobnumber)
            this.$axios({
              method: "get",
              url: "/api/doctor/admin",
              params: {
                did: this.ruleForm.jobnumber,
                dpassword: this.ruleForm.password,
                didentity: this.ruleForm.identity,
              },
            }).then((res)=> {
              console.log(res)
              if(res.status == 200){
                this.$myMsg.notify({
                  content: "登录成功",
                  type: 'success',
                })
                setTimeout(() => {
                  this.$router.push('/home')
                  location.reload();
                }, 1400)
              }
              sessionStorage.setItem("identity", res.data.didentity);
              sessionStorage.setItem("pstate", this.pstate);
            },error =>{
              console.log(error.response.data.message)
              this.$myMsg.notify({
                content: error.response.data.message,
                type: 'error',
              })
            })
          } else {
            console.log('error submit!!');
            return false;
          }
        });
      },
    }
  }

</script>

<style scoped>
  .login {
    background: url("../../static/login-bkg.jpg ");
    width: 100%;
    height: 100vh;
    margin: 0 auto;
    padding: 10%;
  }

  .background {
    background: #eee;
    opacity: 0.8;
    width: 500px;
    height: 500px;
    margin: 0 auto;
    padding: 20px 0;
  }
</style>

