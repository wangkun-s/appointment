<template>
  <el-form ref="form" :model="form" label-width="200px" style="margin-top: 70px;margin-left: 80px;">
    <el-form-item label="姓名：" style="width: 200px;">
      <el-input v-model="form.name" disabled style="width: 700px"></el-input>
    </el-form-item>
    <el-form-item label="工号：" style="width: 200px;">
      <el-input v-model="form.jobnumber" disabled style="width: 700px"></el-input>
    </el-form-item>
    <el-form-item label="职称：" style="width: 200px;">
      <el-input v-model="form.job" disabled style="width: 700px"></el-input>
    </el-form-item>
    <el-form-item label="科室：" style="width: 200px;">
      <el-input v-model="form.keshi" disabled style="width: 700px"></el-input>
    </el-form-item>
    <el-form-item label="手机号码：" style="width: 200px;">
      <el-input v-model="form.telephone" disabled style="width: 700px"></el-input>
    </el-form-item>
    <el-form-item label="身份证号：" style="width: 200px;">
      <el-input v-model="form.idcard" disabled style="width: 700px"></el-input>
    </el-form-item>
    <el-form-item label="性别：" style="width: 200px;">
      <el-input v-model="form.sex" disabled style="width: 700px"></el-input>
    </el-form-item>
    <el-form-item label="电子邮箱：" style="width: 200px;">
      <el-input v-model="form.email" disabled style="width: 700px"></el-input>
    </el-form-item>
  </el-form>
</template>
<script>
  export default {
    name:'page21',
    data() {
      return {
        form: {
          name: '',
          telephone: '',
          idcard: sessionStorage.getItem("idcard"),
          email: '',
          sex:'',
          jobnumber:'',
          job:'',
          keshi:'',
        }
      }
    },
    mounted(){
      this.userinfo();
    },
    methods: {
      // validemail(){
      //   if(this.form.email!==undefined||this.form.email!==null){
      //     this.form.email = this.form.email
      //   }else {
      //     this.form.email = ''
      //   }
      // },
      userinfo(){
        this.$axios({
          method: "get",
          url: "/api/doctor/doctorinfo" ,
          params:{
            did:sessionStorage.getItem("id"),
          },
        }).then((res)=> {
          this.form.jobnumber = res.data.did;
          this.form.name = res.data.dname;
          this.form.telephone = res.data.dtelephone;
          this.form.email = res.data.demail;
          this.form.sex = res.data.dsex;
          this.form.job = res.data.djob;
          this.form.keshi = res.data.de_name;
        })
      },
    }
  }
</script>
<style>
  .el-input.is-disabled .el-input__inner{
    color: black;
    font-size: 18px;
    text-align: center;
  }
</style>
