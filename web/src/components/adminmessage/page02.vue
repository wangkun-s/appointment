<template>
  <el-form :model="ruleForm" :rules="rules" ref="ruleForm" label-width="100px" class="demo-ruleForm"
           style="margin-left: 300px;margin-top: 100px">
    <el-form-item label="姓名" prop="name">
      <el-input v-model="ruleForm.name" placeholder="请输入医生姓名" style="width: 330px"></el-input>
    </el-form-item>
    <el-form-item label="身份证号" prop="idcard">
      <el-input v-model="ruleForm.idcard" placeholder="请输入身份证号" style="width: 330px"></el-input>
    </el-form-item>
    <el-form-item label="手机号" prop="telephone"  >
      <el-input v-model="ruleForm.telephone" placeholder="请输入手机号" style="width: 330px"></el-input>
    </el-form-item>
    <el-form-item v-if="visible" label="初始密码" prop="password" >
      <el-input  type="password" v-model="ruleForm.password" style="width: 330px;">
        <img src="../../../static/invisiable.png" slot="suffix" title="显示密码" @click="changePass('show')" style="cursor:pointer;"
             class="el-input__icon iconfont icon-xianshi">
      </el-input>
    </el-form-item>

    <el-form-item v-else label="初始密码" prop="password" >
      <el-input type="text" v-model="ruleForm.password" style="width: 330px;">
        <img src="../../../static/visiable.png" slot="suffix" title="隐藏密码" @click="changePass('hide')" style="cursor:pointer;"
             class="el-input__icon iconfont icon-yincang">
      </el-input>
    </el-form-item>
    <el-form-item label="性别" prop="sex">
      <el-radio-group v-model="ruleForm.sex">
        <el-radio label="男"></el-radio>
        <el-radio label="女"></el-radio>
      </el-radio-group>
    </el-form-item>
    <el-form-item prop="email" label="邮箱">
      <el-input v-model="ruleForm.email" placeholder="请输入正确邮箱"  style="width: 330px"></el-input>
    </el-form-item>
    <el-form-item label="科室" prop="keshi">
      <el-select v-model="ruleForm.keshi" placeholder="请选择科室" style="width: 330px">
        <el-option v-for="item in keshiList" :key= "item.de_id" :label="item.de_name" :value="item.de_id" ></el-option>
      </el-select>
    </el-form-item>
    <el-form-item label="职称" prop="job">
      <el-radio-group v-model="ruleForm.job">
        <el-radio label="知名专家"></el-radio>
        <el-radio label="教授"></el-radio>
      </el-radio-group>
    </el-form-item>
    <el-form-item style="margin-left: 100px">
      <el-button type="primary" @click="submitinfo('ruleForm')">提交创建</el-button>
    </el-form-item>
  </el-form>
</template>

<script>
  export default {
    name: "page01",
    data() {
      return {
        ruleForm: {
          name: '',
          idcard:'',
          telephone: '',
          password: '000000',
          sex:'',
          keshi:'',
          job:'',
          email:'',
          identity: 2 ,
        },
        keshiList:[],
        visible: true,
        rules: {
          name: [{required: true, message: '请输入医生姓名', trigger: 'blur'}],
          idcard: [{required: true, message: '请输入医生身份证', trigger: 'blur'},
            {pattern: /^[1-9]\d{5}(18|19|([23]\d))\d{2}((0[1-9])|(10|11|12))(([0-2][1-9])|10|20|30|31)\d{3}[0-9Xx]$/,
              message: '身份证号格式错误', trigger: 'change'}],
          telephone: [{required: true, message: '请输入手机号', trigger: 'blur'},
            {pattern: /^1(3|4|5|7|8|9)\d{9}$/, message: '手机号格式错误', trigger: 'change'}],
          password: [{required: true, message: '请输入初始密码', trigger: 'blur'}],
          sex: [{required: true, message: '请选择性别', trigger: 'blur'}],
          keshi: [{required: true, message: '请选择科室', trigger: 'blur'}],
          job: [{required: true, message: '请选择科室', trigger: 'blur'}],
          email: [{ required:true, message: '请输入邮箱地址', trigger: 'blur' },
            { type: 'email', message: '请输入正确的邮箱地址', trigger: ['blur', 'change'] }]
        }
      }
    },
    mounted(){
      this.selectkeshi();
    },
    methods:{
      selectkeshi(){
        this.$axios({
          method: "get",
          url: "/api/department/selectkeshi" ,
        }).then((res)=>{
          for(let i=0;i<res.data.length;i++){
            this.keshiList.push(res.data[i]);
          }
        })
      },
      submitinfo(formName){
        this.$refs[formName].validate((valid) => {
          if (valid) {
            this.$axios({
              method: "post",
              url: "/api/doctor/addDoctor" ,
              data:{
                dname:this.ruleForm.name,
                didcard:this.ruleForm.idcard,
                dtelephone:this.ruleForm.telephone,
                dpassword:this.ruleForm.password,
                dsex:this.ruleForm.sex,
                dde_id:this.ruleForm.keshi,
                djob:this.ruleForm.job,
                demail:this.ruleForm.email,
                didentity:this.ruleForm.identity,
                dstatus:'true',
              },
            }).then((res)=>{
              console.log(res)
              if(res.status==200){
                this.$myMsg.notify({
                  content: "创建医生账号成功",
                  type: 'success',
                })
                setTimeout(() => {
                  this.$router.push('/page02')
                  // console.log(sessionStorage.getItem("state"))
                  document.body.scrollTop = 0;
                  // firefox
                  document.documentElement.scrollTop = 0;
                  // safari
                  window.pageYOffset = 0;
                  location.reload();
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
      changePass(value) {
        this.visible = !(value === 'show');
      }    //判断渲染，true:暗文显示，false:明文显示
    }
  }
</script>

<style scoped>

</style>
