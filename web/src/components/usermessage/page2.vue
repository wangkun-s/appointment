<template>
  <el-tabs type="border-card" v-model="activename" @tab-click="handleClick">
    <el-tab-pane label="未完成预约就诊" name="first">
      <el-table :data="tableData" border style="width: 100%">
        <el-table-column sortable prop="aid" label="预约号" width="100"></el-table-column>
        <el-table-column prop="de_name" label="科室" width="160"></el-table-column>
        <el-table-column prop="atelephone" label="手机号" width="160"></el-table-column>
        <el-table-column prop="pidcard" label="身份证" width="200"></el-table-column>
        <el-table-column prop="dname" label="医生" width="160"></el-table-column>
        <el-table-column sortable prop="adate" label="日期"></el-table-column>
        <el-table-column sortable prop="astart" label="开始时间"></el-table-column>
        <el-table-column sortable prop="aend" label="结束时间"></el-table-column>
      </el-table>
    </el-tab-pane>
    <el-tab-pane label="已完成预约就诊" name="second">
      <el-table :data="tableData1" border style="width: 100%">
        <el-table-column prop="aid" label="预约号" width="220"></el-table-column>
        <el-table-column prop="pname" label="患者姓名" width="220"></el-table-column>
        <el-table-column prop="de_name" label="科室" width="220"></el-table-column>
        <el-table-column prop="adate" label="日期" width="220"></el-table-column>
        <el-table-column prop="astart" label="开始时间" width="120"></el-table-column>
        <el-table-column prop="aend" label="结束时间" width="120"></el-table-column>
        <el-table-column label="操作" width="150">
          <template slot-scope="scope">
            <el-button @click="chakansubmit(scope.row)" type="text">查看病历</el-button>
          </template>
        </el-table-column>
      </el-table>
    </el-tab-pane>
    <el-tab-pane label="查看病历" name="third" style="height: 800px">
      <template >
        <div>
          <el-button type="danger"
                     @click="PrintClick" style="margin-bottom: 10px">导出或打印PDF</el-button>
          <div id="FullOrderDetailBox" style="border: 1px solid #99a9bf;width: 1000px;margin-left: 100px">
            <div class="row" style="height: 50px" >
              <div class="col-md-12" style="text-align: center" >
                医好连锁口腔医院
              </div>
            </div>
            <div class="row" style="height: 50px">
              <div class="col-md-12">基本信息：</div>
            </div>
            <div class="row" style="height: 50px">
              <div class="col-md-3">姓名：{{cpname}}</div>
              <div class="col-md-3">性别：{{cpsex}}</div>
              <div class="col-md-3">身份证：{{cpidcard}}</div>
              <div class="col-md-3">手机号：{{cptelephone}}</div>
            </div>
            <hr/>
            <div class="row" style="height: 50px">
              <div class="col-md-12">就诊记录：</div>
            </div>
            <div class="row" style="height: 50px">
              <div class="col-md-4">就诊科室：{{cdename}}</div>
              <div class="col-md-4">主治医生：{{cdname}}</div>
              <div class="col-md-4">就诊时间：{{cadate}}</div>
            </div>
            <hr/>
            <div class="row" style="height: 50px">
              <div class="col-md-12">诊疗数据：</div>
            </div>
            <div class="row" style="height: 50px">
              <div class="col-md-12">主诉：{{czhusu}}</div>
            </div>
            <div class="row" style="height: 50px">
              <div class="col-md-12">类型：{{ctype}}</div>
            </div>
            <div class="row" style="height: 50px">
              <div class="col-md-12">收费项：{{cshoufei}}</div>
            </div>
            <div class="row" style="height: 50px">
              <div class="col-md-12">医嘱：{{cyizhu}}</div>
            </div>
          </div>
        </div>
      </template>
    </el-tab-pane>
  </el-tabs>
</template>

<script>
    export default {
      name: "page2",
      data() {
        return {
          activename:"first",
          cpsex:'',
          czhusu:'',
          cadate:'',
          ctype:'',
          cdename:'',
          cyizhu:'',
          cdname:'',
          cpidcard:'',
          cpname:'',
          cptelephone:'',
          cshoufei:'',
          htmlTitle: "PDF名称",
          nowTime: "",
          tableData: [],
          tableData1: [],
        }
      },
      methods:{
        handleClick(tab) {
          if(tab.name === "first") {
            this.yuyue();
          } else if(tab.name === "second") {
            this.finish();
          } else if(tab.name === "third") {
          }
        },
        chakansubmit(row){
          this.activename="third";
          document.body.scrollTop = 0;
          // firefox
          document.documentElement.scrollTop = 0;
          // safari
          window.pageYOffset = 0;
          this.$axios({
            method: "get",
            url: "/api/caseh/watchbingli",
            params: {caid: row.aid,}
          }).then((res)=>{
            this.cpsex = res.data.cpsex;
            this.cyizhu = res.data.cyizhu;
            this.cshoufei = res.data.cshoufei;
            this.czhusu = res.data.czhusu;
            this.cadate = res.data.cadate;
            this.cdname = res.data.cdname;
            this.cdename = res.data.cdename;
            this.cptelephone = res.data.cptelephone;
            this.cpidcard = res.data.cpidcard;
            this.cpname = res.data.cpname;
            this.ctype = res.data.ctype;
          })
        },
        finish(){
          this.$axios({
            method: "get",
            url: "/api/appointment/falsep",
            params: {
              aStatus:'false',
              apid:sessionStorage.getItem("id")
            }
          }).then((res)=> {
            this.tableData1=[];
            for (let i = 0; i < res.data.length; i++) {
              this.tableData1.push(res.data[i])
            }
          })
        },
        yuyue(){
          this.$axios({
            method: "get",
            url: "/api/appointment/selectAppointment" ,
            params:{
              pid:sessionStorage.getItem("id")
            },
          }).then((res)=>{
            this.tableData=[]
            for(let i=0;i<res.data.length;i++){
              this.tableData.push(res.data[i])
            }
          })
        },
        PrintClick() {
          // window.print();//打印全部
          var oldHtml = document.body.innerHTML;//将body内容先行存储
          var printbox = document.getElementById("FullOrderDetailBox").innerHTML;//再将所要打印区域内容赋值给body
          document.body.innerHTML = printbox;//再将所要打印区域内容赋值给body
          window.print();//调用全部打印事件
          document.body.innerHTML = oldHtml;//将body内容再返回原页面
          window.location.reload();//打印取消后刷新页面防止按钮不能点击
        }
      },
      mounted(){
        this.yuyue();
      }
    }
</script>

<style scoped>

</style>
