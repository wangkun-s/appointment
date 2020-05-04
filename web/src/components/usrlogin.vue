<template>
  <div>
    <div class="login">
      <div class="row">
        <div id="home" class="col-sm-12 text-center">
          <div class="background">
            <a style="margin: 50px auto;font-size: 30px">登录</a>
            <el-form :model="ruleForm" :rules="rules" ref="ruleForm" label-width="100px" class="demo-ruleForm" style="margin-top: 50px;">
              <el-form-item label="手机号" prop="telephone" style="width: 400px;">
                <el-input v-model="ruleForm.telephone"></el-input>
              </el-form-item>

              <el-form-item v-if="visible" label="密码" prop="password" style="width: 400px;">
                <el-input  type="password" v-model="ruleForm.password">
                  <img src="../../static/invisiable.png" slot="suffix" title="显示密码" @click="changePass('show')" style="cursor:pointer;"
                     class="el-input__icon iconfont icon-xianshi">
                </el-input>
              </el-form-item>

              <el-form-item v-else label="密码" prop="password" style="width: 400px;">
                <el-input type="text" v-model="ruleForm.password">
                  <img src="../../static/visiable.png" slot="suffix" title="隐藏密码" @click="changePass('hide')" style="cursor:pointer;"
                     class="el-input__icon iconfont icon-yincang">
                </el-input>
              </el-form-item>

              <el-form-item style="margin-left: -80px;margin-top: 30px">
                <el-button type="primary" @click="submitForm('ruleForm')">立即登录</el-button>
                <span @click="" style="font-size: 14px;color: dodgerblue">忘记密码？</span>
              </el-form-item>
            </el-form>
          </div>
        </div>
      </div>
    </div>
  </div>


</template>

<script>
  export default {
    name: "usrlogin",
    data:function () {
      return{
        ruleForm: {
          telephone: '',
          password: ''
        },
        visible: true,
        pstate:true,
        rules: {
          telephone: [{ required: true, message: '请输入手机号', trigger: 'blur' },],
          password: [{ required: true, message: '请输入密码', trigger: 'change' }]
        }
      };
    },
    methods: {
      submitForm(formName) {
        this.$refs[formName].validate((valid) => {
          if (valid) {
            this.$axios({
              method: "get",
              url: "/api/patient/login" ,
              params: {
                ptelephone:this.ruleForm.telephone,
                ppassword:this.ruleForm.password,
              }
            }).then((res)=>{
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
              sessionStorage.setItem("pstate", this.pstate);
              sessionStorage.setItem("pid", res.data.pid);
              // sessionStorage.setItem("pname", res.data.pname);
              // sessionStorage.setItem("ptelephone", res.data.ptelephone);
              sessionStorage.setItem("pidcard", res.data.pidcard);
              // sessionStorage.setItem("pemail", res.data.pemail);
              // sessionStorage.setItem("psex", res.data.psex);
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
      changePass(value) {
        this.visible = !(value === 'show');
      }    //判断渲染，true:暗文显示，false:明文显示
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
    max-width: 30vw;
    height: 380px;
    margin: 0 auto;
    padding: 20px 0;
  }
</style>

