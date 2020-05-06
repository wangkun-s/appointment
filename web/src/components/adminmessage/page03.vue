<template>
  <div>
  <el-table :data="tableData" style="width: 100%" max-height="800">
    <el-table-column fixed prop="dname" label="姓名" width="180">
    </el-table-column>
    <el-table-column prop="dtelephone" label="电话" width="180">
    </el-table-column>
    <el-table-column prop="demail" label="邮箱" width="180">
    </el-table-column>
    <el-table-column prop="didcard" label="身份证" width="180">
    </el-table-column>
    <el-table-column prop="dsex" label="性别" width="100">
    </el-table-column>
    <el-table-column prop="djob" label="职称" width="180">
    </el-table-column>
    <el-table-column prop="de_name" label="科室" width="180">
    </el-table-column>
    <el-table-column fixed="right" label="操作" width="150" prop="did">
      <template slot-scope="scope">
        <el-button @click.native.prevent="deleteRow(scope.$index, tableData)" type="text" size="small">
          移除
        </el-button>
      </template>
    </el-table-column>
  </el-table>
  <div class="block">
    <el-pagination @size-change="handleSizeChange" @current-change="handleCurrentChange"
      :current-page="current" :page-sizes="[10, 20, 30, 40]"
      :page-size="size" layout="total, sizes, prev, pager, next, jumper" :total="total">
    </el-pagination>
  </div>
</div>
</template>

<script>
    export default {
      name: "page03",
      methods: {
        deleteRow(index, rows) {
          console.log(index)
          console.log(rows)
          rows.splice(index, 1);
          this.$axios({
            method: "put",
            url: "/api/doctor/updateStatus",
            params: {
              did: rows[index].did,
            }
          }).then((res) => {
            if (res.status == 200) {
              this.$myMsg.notify({
                content: "移除成功",
                type: 'success',
              })
            }
          });
        },
        handleSizeChange(val) {
          this.selectAll(this.current,val);
          console.log(`每页 ${val} 条`);
        },
        handleCurrentChange(val) {
          this.selectAll(val,this.size);
          console.log(`当前页: ${val}`);
        },
        selectAll(current, size){
          this.$axios({
            method: "get",
            url: "/api/doctor/selectAll",
            params:{current, size}
          }).then((res)=>{
            this.tableData = [];
            for(let i= 0;i<res.data.records.length;i++){
              this.tableData.push(res.data.records[i])
            }
            this.current = parseInt(res.data.current);
            this.size = parseInt(res.data.size);
            this.total = parseInt(res.data.total);
            this.pages =parseInt(res.data.pages);
            document.body.scrollTop = 0;
            // firefox
            document.documentElement.scrollTop = 0;
            // safari
            window.pageYOffset = 0;
            console.log(this.tableData);
            console.log(this.current,this.size,this.total,this.pages);
          })
        }
      },
      mounted(){
        this.selectAll(1,10);
      },
      data() {
        return {
          tableData: [],
          current: 1,
          total:this.total,
          size:this.size,
          pages:this.pages,
        };
      },
    }
</script>

<style scoped>

</style>
