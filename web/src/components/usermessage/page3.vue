<template>
  <el-form :model="ruleForm" :rules="rules" ref="ruleForm" label-width="100px" class="demo-ruleForm"
           style="margin-left: 300px;margin-top: 100px">
    <el-form-item label="手机号" prop="telephone">
      <el-input v-model="ruleForm.telephone" placeholder="请输入手机号" :maxlength="11" show-word-limit clearable
                prefix-icon='el-icon-mobile'  style="width: 330px"></el-input>
      <el-button type="info" style="padding: 12px 8px;" plain :disabled="disabled" @click="sendcode" class="btns">{{btntxt}}</el-button>
    </el-form-item>
    <el-form-item label="验证码" prop="checkPhone">
      <el-input v-model="ruleForm.checkPhone" placeholder="请输入正确验证码" style="width: 330px"></el-input>
    </el-form-item>
    <el-form-item v-if="visible" label="新密码" prop="password" >
      <el-input type="password" v-model="ruleForm.password" autocomplete="off" placeholder="请输入新密码" style="width: 330px">
        <img src="../../../static/invisiable.png" slot="suffix" title="显示密码" @click="pass('show')" style="cursor:pointer;"
             class="el-input__icon iconfont icon-xianshi">
      </el-input>
    </el-form-item>
    <el-form-item v-else label="新密码" prop="password" >
      <el-input type="text" v-model="ruleForm.password" autocomplete="off" placeholder="请输入新密码" style="width: 330px">
        <img src="../../../static/visiable.png" slot="suffix" title="显示密码" @click="pass('hide')" style="cursor:pointer;"
             class="el-input__icon iconfont icon-xianshi">
      </el-input>
    </el-form-item>
    <el-form-item  v-if="visiable" label="确认新密码" prop="checkPass">
      <el-input type="password" v-model="ruleForm.checkPass" autocomplete="off" placeholder="请确认新密码" style="width: 330px">
        <img src="../../../static/invisiable.png" slot="suffix" title="显示密码" @click="changePass('show')" style="cursor:pointer;"
             class="el-input__icon iconfont icon-xianshi">
      </el-input>
    </el-form-item>
    <el-form-item v-else label="确认新密码" prop="checkPass">
      <el-input type="text" v-model="ruleForm.checkPass" autocomplete="off" placeholder="请确认新密码" style="width: 330px">
        <img src="../../../static/visiable.png" slot="suffix" title="显示密码" @click="changePass('hide')" style="cursor:pointer;"
             class="el-input__icon iconfont icon-xianshi">
      </el-input>
    </el-form-item>
    <el-form-item style="margin-left: 100px">
      <el-button type="primary" @click="changeinfo('ruleForm')">提交修改</el-button>
    </el-form-item>
  </el-form>
</template>

<script>
    export default {
        name: "page3",
      data() {
        var validatePass = (rule, value, callback) => {
          if (value === '') {
            callback(new Error('请输入新密码'));
          } else {
            if (this.ruleForm.checkPass !== '') {
              this.$refs.ruleForm.validateField('checkPass');
            }
            callback();
          }
        };
        var validatePass2 = (rule, value, callback) => {
          if (value === '') {
            callback(new Error('请再次输入新密码'));
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
            telephone: '',
            password: '',
            checkPass: '',
            checkPhone:'',
          },
          rules: {
            telephone: [{required: true, message: '请输入手机号', trigger: 'blur'},
              {pattern: /^1(3|4|5|7|8|9)\d{9}$/, message: '手机号格式错误', trigger: 'change'}],
            password: [{ required: true, validator: validatePass, trigger: 'blur' }],
            checkPass: [{ required: true, validator: validatePass2, trigger: 'blur' }],
            checkPhone: [{required: true, message: '请输入有效验证码', trigger: 'blur'}],
          }
        };
      },
      methods:{
        changeinfo(formName){
          this.$refs[formName].validate((valid) => {
            if (valid) {
              this.$axios({
                method: "put",
                url: "/api/patient/updatePassword" ,
                params:{
                  pidcard:sessionStorage.getItem("idcard"),
                  pid:sessionStorage.getItem("id"),
                  ptelephone: this.ruleForm.telephone,
                  ppassword: this.ruleForm.password,
                },
              }).then((res)=>{
                // console.log(res);
                if(res.status==200){
                  this.$myMsg.notify({
                    content: "修改密码成功",
                    type: 'success',
                  })
                  setTimeout(() => {
                    this.$router.push('/home')
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

<style scoped>

</style>
