<template>
  <div class="card text-dark bg-light ">
    <div class="card-body" style="width: 1500px;margin:0 auto;">
      <el-tabs type="border-card">
  <el-container>
    <el-header style="color: deepskyblue; font-size: 25px">一周时间安排表</el-header>
    <el-container>
      <el-aside width="700px">
        <div>预约时间表</div>
        <el-table :data="tableData" border style="height: 500px;"  max-height="500">
          <el-table-column sortable prop="adate" label="日期" width="180"></el-table-column>
          <el-table-column sortable prop="astart" label="开始时间" width="180"></el-table-column>
          <el-table-column sortable prop="aend" label="结束时间"  width="180"></el-table-column>
          <el-table-column prop="status" label="排班"  width="180"></el-table-column>
        </el-table>
      </el-aside>
      <el-main style="padding-top: 0px;">
        <div>调休时间表</div>
        <el-table :data="tableData1" border style="height: 500px;"  max-height="500">
          <el-table-column sortable prop="edate" label="日期" width="180"></el-table-column>
          <el-table-column sortable prop="estart" label="开始时间" width="180"></el-table-column>
          <el-table-column sortable prop="eend" label="结束时间"  width="180"></el-table-column>
          <el-table-column sortable prop="eregion" label="排班"  width="180"></el-table-column>
        </el-table>
      </el-main>
    </el-container>
  </el-container>
      </el-tabs>
    </div>
  </div>
</template>

<script>
    export default {
        name: "timelink",
      data(){
          return{
            tableData: [],
            tableData1:[],
          }
      },
      methods:{
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
          if(month.toString().length == 1){
            m = month;
          }
          return m;
        },
        getexchange(eDid){
          this.$axios({
            method: "get",
            url: "/api/exchange/getexchange",
            params:{
              eDid: eDid,
              eDate1: this.fun_date(1),
              eDate2: this.fun_date(2),
              eDate3: this.fun_date(3),
              eDate4: this.fun_date(4),
              eDate5: this.fun_date(5),
              eDate6: this.fun_date(6),
              eDate7: this.fun_date(7),
            }
          }).then((res)=>{
            for (let i = 0; i < res.data.length; i++) {
              this.tableData1.push(res.data[i])
            }
          })
        },
        all(eDid) {
          this.$axios({
            method: "get",
            url: "/api/appointment/doctorAppointment",
            params: {
              did: eDid,
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
       created() {
        this.eDid = this.$route.query.eDid;//获取上个页面传递的id,在下面获取数据的时候先提交id
         this.all(this.eDid);
         this.getexchange(this.eDid)
      },
    }
</script>

<style scoped>

</style>
