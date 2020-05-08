<template>
  <div class="card text-dark bg-light ">
    <div class="card-header">科室导诊</div>
    <div class="card-body">
      <el-table
        :data="tableData"
        :span-method="objectSpanMethod"
        border
        style="width: 100%; margin-top: 20px" max-height="900">
        <el-table-column
          prop="de_remark"
          label="总室"
          width="280" >
        </el-table-column>
        <el-table-column
          label="科室" width="280" >
          <template slot-scope="scope">
            <router-link :to="{path:'/detaile',query:{deId:scope.row.de_id}}">
              <a href="#" >{{scope.row.de_name}}</a>
            </router-link>
          </template>
        </el-table-column>
        <el-table-column
          prop="de_time"
          label="建立时间" width="280">
        </el-table-column>
      </el-table>
    </div>
    </el-tab-pane>
    </el-tabs>
  </div>
  </div>
</template>

<script>
  export default {
    data() {
      return {
        tableData: [],
        spanArr:[]
      };
    },

    mounted(){
      this.getData();
    },
    methods: {
      // tableRowClassName({row, rowIndex}) {
      //   if (rowIndex %2 === 0 ) {
      //     return 'warning-row';
      //   } else if (rowIndex %2 === 1) {
      //     return 'success-row';
      //   }
      //   return '';
      // },
      getData(){
        this.$axios({
          method: "get",
          url: "/api/department/selectkeshi"
        }).then((res) => {
          for (let i = 0; i < res.data.length; i++) {
            this.tableData.push(res.data[i]);
          }
          console.log(this.tableData)
          this.getSpanArr(this.tableData)
        })
      },
      getSpanArr(data) {
        for (var i = 0; i < data.length; i++) {
          if (i === 0) {
            this.spanArr.push(1);
            this.pos = 0
          } else {
            // 判断当前元素与上一个元素是否相同
            if (data[i].de_remark === data[i - 1].de_remark) {
              this.spanArr[this.pos] += 1;
              this.spanArr.push(0);
            } else {
              this.spanArr.push(1);
              this.pos = i;
            }
          }
        }
      },
      objectSpanMethod({ row, column, rowIndex, columnIndex }) {
        if (columnIndex === 0) {
          const _row = this.spanArr[rowIndex];
          const _col = _row > 0 ? 1 : 0;
          return {
            rowspan: _row,
            colspan: _col
          }
        }

      }
    }
  };
</script>
<style>
  /*.el-table .warning-row {*/
    /*background: oldlace;*/
  /*}*/

  /*.el-table .success-row {*/
    /*background: #f0f9eb;*/
  /*}*/
</style>
