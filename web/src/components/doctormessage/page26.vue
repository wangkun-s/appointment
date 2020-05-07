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
    <el-form-item label="电子邮箱" prop="pemail">
      <el-input v-model="ruleForm.email" placeholder="请输入电子邮箱" style="width: 330px"></el-input>
    </el-form-item>
    <el-form-item style="margin-left: 100px">
      <el-button type="primary" @click="changeinfo('ruleForm')">提交修改</el-button>
    </el-form-item>
  </el-form>
</template>

<script>
  export default {
    name: "page5",
    data() {
      return {
        disabled:false,
        btntxt:"获取验证码",
        ruleForm: {
          telephone:'',
          email: '',
          checkPhone:'',
        },
        rules: {
          telephone: [{required: true, message: '请输入手机号', trigger: 'blur'},
            {pattern: /^1(3|4|5|7|8|9)\d{9}$/, message: '手机号格式错误', trigger: 'change'}],
          email: [{ message: '请输入邮箱地址', trigger: 'blur' },
            { type: 'email', message: '请输入正确的邮箱地址', trigger: ['blur', 'change'] }],
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
              url: "/api/doctor/updateEmail" ,
              params:{
                didcard:sessionStorage.getItem("idcard"),
                did:sessionStorage.getItem("id"),
                dtelephone: this.ruleForm.telephone,
                demail: this.ruleForm.email,
              },
            }).then((res)=>{
              if(res.status==200){
                this.$myMsg.notify({
                  content: "修改邮箱成功",
                  type: 'success',
                })
                setTimeout(() => {
                  this.$router.push('/home')
                }, 1400)}
            },error =>{
              console.log(error.response.data.message)
              this.$myMsg.notify({
                content: error.response.data.message,
                type: 'error',
              })
            })
          }else {
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
    },
  }
</script>

<style scoped>

</style>
