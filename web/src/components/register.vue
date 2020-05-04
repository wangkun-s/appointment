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
          <el-tab-pane label="注册">
            <el-form :model="ruleForm" :rules="rules" ref="ruleForm" label-width="100px" class="demo-ruleForm">
              <el-form-item label="姓名" prop="name">
                <el-input v-model="ruleForm.name" placeholder="请输入真实姓名"></el-input>
              </el-form-item>
              <el-form-item label="身份证" prop="idcard">
                <el-input v-model="ruleForm.idcard" placeholder="请输入身份证号码"></el-input>
              </el-form-item>
              <el-form-item label="手机号" prop="telephone">
                <el-input v-model="ruleForm.telephone" placeholder="请输入手机号" :maxlength="11" show-word-limit clearable
                          prefix-icon='el-icon-mobile'  style="width: 330px"></el-input>
                <el-button type="info" style="padding: 12px 8px;" plain :disabled="disabled" @click="sendcode" class="btns">{{btntxt}}</el-button>
              </el-form-item>
              <el-form-item label="验证码" prop="checkPhone">
                <el-input v-model="ruleForm.checkPhone" placeholder="请输入正确验证码"></el-input>
              </el-form-item>
              <el-form-item v-if="visible" label="密码" prop="password" >
                <el-input type="password" v-model="ruleForm.password" autocomplete="off" placeholder="请输入密码">
                    <img src="../../static/invisiable.png" slot="suffix" title="显示密码" @click="pass('show')" style="cursor:pointer;"
                         class="el-input__icon iconfont icon-xianshi">
                </el-input>
              </el-form-item>
              <el-form-item v-else label="密码" prop="password" >
                <el-input type="text" v-model="ruleForm.password" autocomplete="off" placeholder="请输入密码">
                    <img src="../../static/visiable.png" slot="suffix" title="显示密码" @click="pass('hide')" style="cursor:pointer;"
                         class="el-input__icon iconfont icon-xianshi">
                </el-input>
              </el-form-item>
              <el-form-item  v-if="visiable" label="确认密码" prop="checkPass">
                <el-input type="password" v-model="ruleForm.checkPass" autocomplete="off" placeholder="请确认密码">
                    <img src="../../static/invisiable.png" slot="suffix" title="显示密码" @click="changePass('show')" style="cursor:pointer;"
                         class="el-input__icon iconfont icon-xianshi">
                </el-input>
              </el-form-item>
              <el-form-item v-else label="确认密码" prop="checkPass">
                <el-input type="text" v-model="ruleForm.checkPass" autocomplete="off" placeholder="请确认密码">
                  <img src="../../static/visiable.png" slot="suffix" title="显示密码" @click="changePass('hide')" style="cursor:pointer;"
                       class="el-input__icon iconfont icon-xianshi">
                </el-input>
              </el-form-item>
              <el-form-item label="性别" prop="sex">
                <el-radio-group v-model="ruleForm.sex">
                  <el-radio label="男"></el-radio>
                  <el-radio label="女"></el-radio>
                </el-radio-group>
              </el-form-item>
                <el-form-item prop="email" label="邮箱">
                  <el-input v-model="ruleForm.email" placeholder="请输入正确邮箱"></el-input>
                </el-form-item>
              <el-form-item style="margin-left: 100px">
                <el-button type="primary" @click="register('ruleForm')">立即注册</el-button>
                <span @click="login" style="color: dodgerblue;font-size: 13px;cursor: pointer">已有账号？马上去登录</span>
              </el-form-item>
            </el-form>
          </el-tab-pane>
        </el-tabs>
      </div>
    </div>
  </div>

</template>

<script src="https://unpkg.com/axios/dist/axios.min.js"></script>
<script>
  export default {
    name: "register",
    // components: {},
    // props: [],
    data() {
      var validatePass = (rule, value, callback) => {
        if (value === '') {
          callback(new Error('请输入密码'));
        } else {
          if (this.ruleForm.checkPass !== '') {
            this.$refs.ruleForm.validateField('checkPass');
          }
          callback();
        }
      };
      var validatePass2 = (rule, value, callback) => {
        if (value === '') {
          callback(new Error('请再次输入密码'));
        } else if (value !== this.ruleForm.password) {
          callback(new Error('两次输入密码不一致!'));
        } else {
          callback();
        }
      };
      return {
        show:false,
        errorshow:false,
        disabled:false,
        time:0,
        btntxt:"获取验证码",
        error:'',
        visiable: true,
        visible:true,
        ruleForm: {
          name: '',
          telephone: '',
          password: '',
          checkPass: '',
          checkPhone:'',
          idcard:'',
          identity: '1',
          sex:'',
          email:'',
        },
        rules: {
          name: [{required: true, message: '请输入真实姓名', trigger: 'blur'},
            { min: 1, max: 5, message: '长度在 1 到 5 个字符', trigger: 'blur' }],
          idcard: [{required: true, message: '请输入有效身份证号', trigger: 'blur'},
            {pattern: /^[1-9]\d{5}(18|19|([23]\d))\d{2}((0[1-9])|(10|11|12))(([0-2][1-9])|10|20|30|31)\d{3}[0-9Xx]$/,
              message: '身份证号格式错误', trigger: 'blur'}],
          telephone: [{required: true, message: '请输入手机号', trigger: 'blur'},
            {pattern: /^1(3|4|5|7|8|9)\d{9}$/, message: '手机号格式错误', trigger: 'blur'}],
          password: [{ required: true, validator: validatePass, trigger: 'blur' }],
          checkPass: [{ required: true, validator: validatePass2, trigger: 'blur' }],
          checkPhone: [{required: true, message: '请输入有效验证码', trigger: 'blur'}],
          sex: [{required: true, message: '请选择性别', trigger: 'blur'}],
          email: [{ message: '请输入邮箱地址', trigger: 'blur' },
            { type: 'email', message: '请输入正确的邮箱地址', trigger: ['blur', 'change'] }]
        }
      };
    },
    methods:{
      login(){
        this.$router.push('/login');
        // chrome
        document.body.scrollTop = 0;
        // firefox
        document.documentElement.scrollTop = 0;
        // safari
        window.pageYOffset = 0;
      },
      register(formName){
        this.$refs[formName].validate((valid) => {
          if (valid) {
            this.$axios({
              method: "post",
              url: "/api/patient/register" ,
              data:{
                pname:this.ruleForm.name,
                pidcard:this.ruleForm.idcard,
                ptelephone: this.ruleForm.telephone,
                ppassword: this.ruleForm.password,
                pemail:this.ruleForm.email,
                pidentity: '1',
                psex:this.ruleForm.sex,
              },
            }).then((res)=>{
              console.log(res);
              debugger;
              if(res.status==200){
                this.$myMsg.notify({
                  content: "注册成功",
                  type: 'success',
                })
                setTimeout(() => {
                  this.$router.push('/login')
                }, 1400)
              }
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
      sendcode() {
          this.time = 120;
          this.disabled = true;
          this.timer();
          this.$axios({
            method: "get",
            url: "/api/fitness/code" ,
            params: {
              telephone:this.ruleForm.telephone
            }
          }).then((res)=>{
          })
      },
      timer() {
        if (this.time > 0) {
          this.time--;
          this.btntxt=this.time+"s后重新获取";
          setTimeout(this.timer, 1000);
        } else{
          this.time=0;
          this.btntxt="获取验证码";
          this.disabled=false;
        }
      },
      changePass(value) {
        this.visiable = !(value === 'show');
      },    //判断渲染，true:暗文显示，false:明文显示
      pass(value) {
        this.visible = !(value === 'show');
      }    //判断渲染，true:暗文显示，false:明文显示
    },
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
  .demo-ruleForm{
    width: 550px;
    margin: 0 auto;
  }

</style>
