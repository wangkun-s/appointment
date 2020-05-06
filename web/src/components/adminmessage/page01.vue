<template>
  <el-form :model="ruleForm" :rules="rules" ref="ruleForm" label-width="100px" class="demo-ruleForm"
           style="margin-left: 300px;margin-top: 100px">
    <el-form-item label="科室名称" prop="name">
      <el-input v-model="ruleForm.name" placeholder="请输入科室名称" style="width: 330px"></el-input>
    </el-form-item>
    <el-form-item label="创建时间" prop="date">
      <el-input v-model="ruleForm.date" disabled style="width: 330px"></el-input>
    </el-form-item>
    <el-form-item label="科室详情" prop="description"  >
      <el-input type="textarea" v-model="ruleForm.description" placeholder="请输入科室详情" style="width: 330px"></el-input>
    </el-form-item>
    <el-form-item label="总科室" prop="remark">
      <el-select v-model="ruleForm.remark" placeholder="请输入总科室名称" style="width: 330px">
        <el-option label="内科" value="內科"></el-option>
        <el-option label="口腔科" value="口腔科"></el-option>
        <el-option label="麻醉科" value="麻醉科"></el-option>
        <el-option label="急诊医学科" value="急诊医学科"></el-option>
      </el-select>
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
            date: this.getTime(),
            description: '',
            remark: '',
          },
          rules: {
            name: [
              {required: true, message: '请输入科室名称', trigger: 'blur'},
            ],
            description: [
              {required: true, message: '请输入详情描述', trigger: 'blur'},
            ],
            remark: [
              {required: true, message: '请输入总科室名称', trigger: 'blur'},
            ],
          }
        }
      },
      methods:{
        getTime(){
          var date1=new Date();
          var year=date1.getFullYear();
          var month=date1.getMonth()+1;
          var day=date1.getDate();
          var hours=date1.getHours();
          var minutes=date1.getMinutes();
          var seconds=date1.getSeconds();
          return year+"年"+month+"月"+day+"日"+hours+":"+minutes+":"+seconds
        },
        submitinfo(formName){
          this.$refs[formName].validate((valid) => {
            if (valid) {
              this.$axios({
                method: "post",
                url: "/api/department/addDepartment" ,
                data:{
                  de_name:this.ruleForm.name,
                  de_time:this.ruleForm.date,
                  de_description:this.ruleForm.description,
                  de_remark:this.ruleForm.remark
                },
              }).then((res)=>{
                console.log(res)
                if(res.status==200){
                  this.$myMsg.notify({
                    content: "创建科室成功",
                    type: 'success',
                  })
                  setTimeout(() => {
                    this.$router.push('/page01')
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
      }
    }
</script>

<style scoped>

</style>
