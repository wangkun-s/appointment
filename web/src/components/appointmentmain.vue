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
          <el-form :model="ruleForm" :rules="rules" ref="ruleForm" label-width="330px" class="demo-ruleForm" >
            <el-form-item label="科室" prop="keshi">
              <el-select v-model="ruleForm.keshi" placeholder="请选择预约科室" style="width: 330px" @change='leave'>
                <el-option v-for="item in keshiList" :key= "item.de_id" :label="item.de_name" :value="item.de_id" ></el-option>
              </el-select>
            </el-form-item>
            <el-form-item label="医生" prop="doctor" >
              <el-select v-model="ruleForm.doctor" placeholder="请选择预约医生" style="width: 330px">
                <el-option v-for="(item,i) in doctorList" :key="i" :label="item.dname" :value="item.did"></el-option>
              </el-select>
            </el-form-item>
            <el-form-item label="预约日期" prop="seleDate" >
              <el-select v-model="ruleForm.seleDate" placeholder="请选择预约日期" style="width: 330px">
                <el-option v-for="(item,index) in list" :key="index" @click="fn(index)" :class="{active:ide ==index}" :value="item"></el-option>
              </el-select>
            </el-form-item>
            <el-form-item label="预约时间" prop="seleTime">
              <el-select v-model="ruleForm.seleTime" placeholder="请选择预约日期" style="width: 330px" >
                <el-option v-for="item in stateList" :value="item.value" :key="item.value" :label="item.label"></el-option>
              </el-select>
            </el-form-item>
            <el-form-item label="手机号" prop="ptelephone">
              <el-input v-model="ruleForm.ptelephone" placeholder="请输入手机号" :maxlength="11" show-word-limit clearable
                        prefix-icon='el-icon-mobile'  style="width: 330px"></el-input>
              <el-button type="info" style="padding: 12px 8px;" plain :disabled="disabled" @click="sendcode" class="btns">{{btntxt}}</el-button>
            </el-form-item>
            <el-form-item label="验证码" prop="checkPhone">
              <el-input v-model="ruleForm.checkPhone" placeholder="请输入正确验证码" style="width: 330px"></el-input>
            </el-form-item>
            <el-form-item>
              <el-button type="primary" @click="submitForm('ruleForm')">立即预约</el-button>
              <el-button @click="resetForm('ruleForm')">重置</el-button>
            </el-form-item>

          </el-form>
        </el-tabs>
      </div>
    </div>
  </div>
</template>

<script>
    export default {
        name: "appointmentmain",
      data() {
        return {
          list: [],
          ide: 0,//默认选择第一个
          days: [],
          btntxt:"获取验证码",
          disabled:false,
          ruleForm: {
            seleDate: '',
            seleTime:'',
            keshi: '',
            doctor:'',
            ptelephone:'',
            checkPhone:'',
          },
          stateList: [{value: '8:00am-10:00am', label: '8:00am-10:00am'},
            {value: '10:00am-12:00am', label: '10:00am-12:00am'},
            {value: '1:00pm-3:00pm', label: '1:00pm-3:00pm'},
            {value: '3:00pm-5:00pm', label: '3:00pm-5:00pm'}],
          doctorList:[],
          keshiList:[],
          rules: {
            keshi: [{required: true, message: '请选择预约科室', trigger: 'blur'}],
            ptelephone: [{required: true, message: '请输入手机号', trigger: 'blur'},
              {pattern: /^1(3|4|5|7|8|9)\d{9}$/, message: '手机号格式错误', trigger: 'blur'}],
            checkPhone: [{required: true, message: '请输入有效验证码', trigger: 'blur'}],
            seleDate: [{required: true, message: '请选择预约日期', trigger: 'change'}],
            doctor: [{required: true, message: '请选择医生', trigger: 'blur'}],
            seleTime: [{required: true, message: '请选择预约时间', trigger: 'change'}],
          }
        };
      },
      created(){ //created:在模板渲染成html前调用，即通常初始化某些属性值，然后再渲染成视图。
        var dateObj = {};
        for(var i = 1; i <= 7; i++) {
          dateObj = this.getDate(i); //把返回的日期赋值给对象
          this.list.push(dateObj); //把对象添加到数组里面，然后渲染到页面
        }
      },
      methods: {
        ipaddrArray(){
          var time = this.ruleForm.seleTime.split('-')
          return time;
        },
        fn(index) {
          this.ide = index;
          this.seleDate = document.getElementsByClassName('div')[index].innerHTML; //获取当前选中的时间
        },
        getDate(n) {
          var ss = 24 * 60 * 60 * 1000; //一天的毫秒数86400
          var timestamp = new Date().getTime(); //获取当前时间戳
          var date1 = new Date(ss * n + timestamp) //加上n天的国际标准日期
          var newTime = date1.toLocaleString(); //把日期转换成2018/6/4 下午10:45:19 格式
          var arr = newTime.split(" "); //把2018/6/4提取出来
          var arr2 = arr[0].split('/'); //把年月日数字单独提出来
          return arr2[0] + '年' + arr2[1] + '月' + arr2[2] + '日'; //拼接成我们需要的格式返回
        },
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
        leave(){
          this.doctorList = [];
          this.$axios({
            method: "get",
            url: "/api/doctor/selectdoctor" ,
            params:{
              dDeId:this.ruleForm.keshi,
            }
          }).then((res)=>{
            for(let i=0;i<res.data.length;i++){
              this.doctorList.push(res.data[i]);
            }
          })
        },
        submitForm(formName) {
          this.$refs[formName].validate((valid) => {
            if (valid) {
              if(sessionStorage.getItem("pstate") === "true"){
                var time =this.ipaddrArray();
                this.$axios({
                  method: "post",
                  url: "/api/appointment/addAppointment" ,
                  data:{
                    adate: this.ruleForm.seleDate,
                    adeid: this.ruleForm.keshi,
                    adid: this.ruleForm.doctor,
                    aend: time[1],
                    astart: time[0],
                    atelephone: this.ruleForm.ptelephone,
                    apid:sessionStorage.getItem("pid")
                  },
                }).then((res)=>{
                  if(res.status==200){
                    this.$myMsg.notify({
                      content: "预约成功，您可以在个人信息中查看",
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
              }else{
                this.$myMsg.notify({
                  content: "请先前往登录",
                  type: 'error',
                })
                setTimeout(() => {
                  this.$router.push('/login')
                }, 1400)
              }
            }
          });
        },
        resetForm(formName) {
          this.$refs[formName].resetFields();
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
      mounted(){
        this.selectkeshi();
      },
    }
</script>

<style>
  /*h5,.div {*/
    /*width: 20px;*/
    /*line-height: 60px;*/
    /*text-align: center;*/
    /*margin: 0 auto;*/
    /*border: 1px solid #ddd;*/
  /*}*/

  /*.active {*/
    /*color: red;*/
    /*background-color: #ddd;*/
  /*}*/
</style>
