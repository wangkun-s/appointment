<template>
  <el-table :data="tableData" border style="width: 100%">
    <el-table-column prop="de_name" label="科室" width="160"></el-table-column>
    <el-table-column prop="dname" label="医生" width="160"></el-table-column>
    <el-table-column prop="adate" label="日期"></el-table-column>
    <el-table-column prop="astart" label="开始时间"></el-table-column>
    <el-table-column prop="aend" label="结束时间"></el-table-column>
  </el-table>
</template>

<script>
    export default {
      name: "page2",
      data() {
        return {
          tableData: [],
        }
      },
      methods:{
        yuyue(){
          this.$axios({
            method: "get",
            url: "/api/appointment/selectAppointment" ,
            params:{
              pid:sessionStorage.getItem("pid")
            },
          }).then((res)=>{
            for(let i=0;i<res.data.length;i++){
              this.tableData.push(res.data[i])
            }
          })
        }
      },
      mounted(){
        this.yuyue();
      }
    }
</script>

<style scoped>

</style>
