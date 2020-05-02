<template>
  <el-form ref="form" :model="form" label-width="200px" style="margin-top: 80px">
    <el-form-item label="姓名：" style="width: 200px;">
      <el-input v-model="form.name" disabled style="width: 700px"></el-input>
    </el-form-item>
    <el-form-item label="手机号码：" style="width: 200px;">
      <el-input v-model="form.telephone" disabled style="width: 700px"></el-input>
    </el-form-item>
    <el-form-item label="身份证号：" style="width: 200px;">
      <el-input v-model="form.idcard" disabled style="width: 700px"></el-input>
    </el-form-item>
    <el-form-item label="电子邮箱：" style="width: 200px;">
      <el-input v-model="form.email" disabled style="width: 700px"></el-input>
    </el-form-item>
    <el-form-item label="性别：" style="width: 200px;">
      <el-input v-model="form.sex" disabled style="width: 700px"></el-input>
    </el-form-item>
  </el-form>
</template>
<script>
  export default {
    name:'page1',
    data() {
      return {
        form: {
          name: sessionStorage.getItem("pname"),
          telephone: sessionStorage.getItem("ptelephone"),
          idcard: sessionStorage.getItem("pidcard"),
          email: '',
          sex:sessionStorage.getItem("psex")
        }
      }
    },
    methods: {
      validemail(){
        if(sessionStorage.getItem("pemail")!=undefined||sessionStorage.getItem("pemail")!=null){
          this.email = sessionStorage.getItem("pemail")
        }else {
          this.email = ''
        }
      }
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
