<template>
  <el-container>
    <el-aside width="500px">
      <div style="height: 900px; background-color: white">
        <el-button type="primary" plain @click="restTime('ruleForm')" >申请调休</el-button>
          <el-form :model="ruleForm" :rules="rules" ref="ruleForm" label-width="100px" class="demo-ruleForm" style="margin-top: 50px">
            <el-form-item label="调休日期" prop="seleDate" >
              <el-select v-model="ruleForm.seleDate" placeholder="请选择调休日期">
                <el-option v-for="(item,index) in list" :key="index" @click="fn(index)"
                           :class="{active:ide ==index}" :value="item"></el-option>
              </el-select>
            </el-form-item>
            <el-form-item label="调休时间" :rules="[{ required: true, message: '请选择调休时间', trigger: 'blur' }]" >
              <el-time-select style="width:165px ;" placeholder="起始时间" v-model="startTime" :picker-options="{start: '08:00',step: '01:00',end: '18:00'}">
              </el-time-select>
              <el-time-select style="width:165px ;" placeholder="结束时间" v-model="endTime" :picker-options="{start: '08:00',step: '01:00',end: '18:00',minTime: startTime}">
              </el-time-select>
            </el-form-item>
            <el-form-item label="排班" prop="region" style="width: 330px;">
              <el-select v-model="ruleForm.region" placeholder="请选择事件">
                <el-option label="调休" value="调休"></el-option>
              </el-select>
            </el-form-item>
          </el-form>
      </div>
    </el-aside>
    <el-main style="padding-top: 0px;">
      <div>预约时间表</div>
      <el-table :data="tableData" border style="width: 720px;height: 300px;" class="el-col-md-12"  max-height="300">
        <el-table-column sortable prop="adate" label="日期" width="180"></el-table-column>
        <el-table-column sortable prop="astart" label="开始时间" width="180"></el-table-column>
        <el-table-column sortable prop="aend" label="结束时间"  width="180"></el-table-column>
        <el-table-column prop="status" label="排班"  width="180"></el-table-column>
      </el-table>
      <div>调休时间表</div>
      <el-table :data="tableData1" border style="width: 720px;height: 550px;" class="el-col-md-12"  max-height="550">
        <el-table-column sortable prop="edate" label="日期" width="180"></el-table-column>
        <el-table-column sortable prop="estart" label="开始时间" width="180"></el-table-column>
        <el-table-column sortable prop="eend" label="结束时间"  width="180"></el-table-column>
        <el-table-column sortable prop="eregion" label="排班"  width="180"></el-table-column>
      </el-table>
    </el-main>
  </el-container>
</template>

<script>
  export default {
    data() {
      return {
        tableData: [],
        tableData1:[],
        list: [],
        ide: 0,//默认选择第一个
        startTime: '',
        endTime: '',
        ruleForm: {
          seleDate: '',
          seleTime:'',
          region:'',
        },
        rules: {
          region: [{required: true, message: '请选择调休安排', trigger: 'blur'}],
          seleDate: [{required: true, message: '请选择调休日期', trigger: 'change'}],
        }
      }
    },
    created(){ //created:在模板渲染成html前调用，即通常初始化某些属性值，然后再渲染成视图。
      var dateObj = {};
      for(var i = 1; i <= 7; i++) {
        dateObj = this.getDate(i); //把返回的日期赋值给对象
        this.list.push(dateObj); //把对象添加到数组里面，然后渲染到页面//
        }
      },
    methods: {
      fun_date(aa){
        var today = new Date();
         　　var targetday_milliseconds=today.getTime() + 1000*60*60*24*aa;
         　　today.setTime(targetday_milliseconds); //注意，这行是关键代码
         　　var tYear = today.getFullYear();
         　　var tMonth = today.getMonth();
         　　var tDate = today.getDate();
         　　tMonth = this.doHandleMonth(tMonth + 1);
         　　tDate = this.doHandleMonth(tDate);
         　　return tYear+"年"+tMonth+"月"+tDate+"日";
         },
      doHandleMonth(month){
        var m = month;
        if(month.toString().length === 1){
          m = month;
        }
        return m;
      },
      restTime(form){
        this.$refs[form].validate((valid) => {
          if (valid) {
            this.$axios({
              method: "post",
              url: "/api/exchange/exchange",
              data:{
                edid: sessionStorage.getItem("id"),
                edate: this.ruleForm.seleDate,
                estart:this.startTime,
                eend:this.endTime,
                eregion:this.ruleForm.region,
              }
            }).then((res)=>{
              if(res.status==200) {
                this.$myMsg.notify({
                  content: "申请调休成功",
                  type: 'success',
                })
              }
              this.getexchange();
            },error =>{
              console.log(error.response.data.message)
              this.$myMsg.notify({
                content: error.response.data.message,
                type: 'error',
              })
            })
          }
        })
      },
      getexchange(){
        console.log(sessionStorage.getItem("id"))
        this.$axios({
          method: "get",
          url: "/api/exchange/getexchange",
          params:{
            eDid: sessionStorage.getItem("id"),
            eDate1: this.fun_date(1),
            eDate2: this.fun_date(2),
            eDate3: this.fun_date(3),
            eDate4: this.fun_date(4),
            eDate5: this.fun_date(5),
            eDate6: this.fun_date(6),
            eDate7: this.fun_date(7),
          }
        }).then((res)=>{
          this.tableData1 = [];
          for (let i = 0; i < res.data.length; i++) {
            this.tableData1.push(res.data[i])
          }
        })
      },
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
      all() {
        this.$axios({
          method: "get",
          url: "/api/appointment/doctorAppointment",
          params: {
            did: sessionStorage.getItem("id"),
          },
        }).then((res) => {
          console.log(res)
          for (let i = 0; i < res.data.length; i++) {
            this.tableData.push(res.data[i])
          }
          for(let i=0;i<res.data.length;i++){
            this.tableData[i].status="坐诊"
          }
        })
      }
    },
    mounted(){
      this.all();
      this.getexchange();
    }
  }
</script>
<style>
  .el-select{
    width: 330px;
  }
</style>
