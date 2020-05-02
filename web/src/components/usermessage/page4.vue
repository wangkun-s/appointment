<template>
  <el-form :model="ruleForm" :rules="rules" ref="ruleForm" label-width="100px" class="demo-ruleForm"
           style="margin-left: 300px;margin-top: 100px">
    <el-form-item label="旧手机号" prop="jtelephone" >
      <el-input v-model="ruleForm.name" placeholder="请输入旧手机号" style="width: 330px"></el-input>
    </el-form-item>
    <el-form-item label="新手机号" prop="xtelephone">
      <el-input v-model="ruleForm.telephone" placeholder="请输入新手机号" :maxlength="11" show-word-limit clearable
                prefix-icon='el-icon-mobile'  style="width: 330px"></el-input>
      <el-button type="info" style="padding: 12px 8px;" plain :disabled="disabled" @click="sendcode" class="btns">{{btntxt}}</el-button>
    </el-form-item>
    <el-form-item label="验证码" prop="checkPhone">
      <el-input v-model="ruleForm.checkPhone" placeholder="请输入正确验证码" style="width: 330px"></el-input>
    </el-form-item>
    <el-form-item style="margin-left: 100px">
      <el-button type="primary" @click="changeinfo('ruleForm')">提交修改</el-button>
    </el-form-item>
  </el-form>
</template>

<script>
    export default {
        name: "page4",
      data() {
        return {
          btntxt:"获取验证码",
          visiable: true,
          visible:true,
          ruleForm: {
            jtelephone:'',
            xtelephone: '',
            checkPhone:'',
          },
          rules: {
            jtelephone: [{required: true, message: '请输入手机号', trigger: 'blur'},
              {pattern: /^1(3|4|5|7|8|9)\d{9}$/, message: '手机号格式错误', trigger: 'blur'}],
            xtelephone: [{required: true, message: '请输入手机号', trigger: 'blur'},
              {pattern: /^1(3|4|5|7|8|9)\d{9}$/, message: '手机号格式错误', trigger: 'blur'}],
            checkPhone: [{required: true, message: '请输入有效验证码', trigger: 'blur'}],
          }
        };
      },
      methods:{
        changeinfo(formName){
          this.$refs[formName].validate((valid) => {
            if (valid) {

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
      },
    }
</script>

<style scoped>

</style>
