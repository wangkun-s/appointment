<template>
    <el-tabs type="border-card" v-model="activename" @tab-click="handleClick">
      <el-tab-pane label="全部预约" name="appointment" style="height: 800px">
        <el-table :data="tableData" border style="width: 100%">
          <el-table-column prop="aid" label="预约号" width="220"></el-table-column>
          <el-table-column prop="pname" label="患者姓名" width="220"></el-table-column>
          <el-table-column prop="de_name" label="科室" width="220"></el-table-column>
          <el-table-column prop="adate" label="日期" width="220"></el-table-column>
          <el-table-column prop="astart" label="开始时间" width="120"></el-table-column>
          <el-table-column prop="aend" label="结束时间" width="120"></el-table-column>
          <el-table-column label="操作" width="150">
            <template slot-scope="scope">
              <el-button @click="handle(scope.row)" type="text">填写病历</el-button>
            </template>
          </el-table-column>
        </el-table>
      </el-tab-pane>

      <el-tab-pane label="填写电子病历" name="bingli">
        <span class="row">基本信息：</span>
        <el-form ref="form" :model="form" label-width="80px" style="padding-top: 20px">
          <div class="row">
            <el-form-item label="姓名">
              <el-input v-model="form.name" disabled></el-input>
            </el-form-item>
            <el-form-item label="性别">
              <el-input v-model="form.sex" disabled></el-input>
            </el-form-item>
            <el-form-item label="身份证">
              <el-input v-model="form.idcard" disabled></el-input>
            </el-form-item>
            <el-form-item label="手机号" >
              <el-input v-model="form.telephone" disabled></el-input>
            </el-form-item>
          </div>
          <span class="row">就诊记录：</span>
          <div class="row" style="padding-top: 20px;margin-right: 50px">
            <el-form-item label="就诊科室" class="el-col-6">
              <el-input v-model="form.keshi" disabled></el-input>
            </el-form-item>
            <el-form-item label="主治医生" class="el-col-6">
              <el-input v-model="form.doctor" disabled></el-input>
            </el-form-item>
            <el-form-item label="就诊时间" class="el-col-6">
              <el-input v-model="form.time" disabled></el-input>
            </el-form-item>
          </div>
          <span class="row">诊疗数据：</span>
            <el-form-item label="主诉" >
              <el-input type="textarea" v-model="form.zhusu" ></el-input>
            </el-form-item>
          <br/>
            <el-form-item label="类型" >
              <el-input type="textarea" v-model="form.type"></el-input>
            </el-form-item>
          <br/>
            <el-form-item label="收费项" >
              <el-input type="textarea" v-model="form.shoufei"></el-input>
            </el-form-item>
          <br/>
            <el-form-item label="医嘱" >
              <el-input type="textarea" v-model="form.yizhu"></el-input>
            </el-form-item>
          <br/>
        </el-form>
        <div style="text-align:center">
          <el-button type="primary" round @click="dialogVisible = true" v-bind:disabled="state">提交病历</el-button>
        </div>
        <el-dialog
          title="提示"
          :visible.sync="dialogVisible"
          width="30%"
          :before-close="handleClose">
          <span>请进行详细检查，提交后不可更改</span>
          <span slot="footer" class="dialog-footer">
    <el-button @click="dialogVisible = false">取 消</el-button>
    <el-button type="primary" @click="submit">确 定</el-button>
  </span>
        </el-dialog>
      </el-tab-pane>

      <el-tab-pane label="已完成就诊患者" name="patient" style="height: 800px">
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


      <el-tab-pane label="查看病历" name="chakan" style="height: 800px">
        <template >
          <div>
            <div  id="FullOrderDetailBox" style="border: 1px solid #99a9bf;width: 1000px;margin-left: 100px">
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
    name:"page22",
    methods: {
      handle(row) {
            this.activename="bingli"
            document.body.scrollTop = 0;
            document.documentElement.scrollTop = 0;
            window.pageYOffset = 0;
            this.$axios({
              method:"get",
              url: "/api/appointment/appointmentinfo" ,
              params:{
                pid: row.apid,
                aid: row.aid,
              },
            }).then((res)=> {
              this.form.keshi = res.data.de_name,
                this.form.time = res.data.adate,
                this.form.sex = res.data.psex,
                this.form.telephone = res.data.atelephone,
                this.form.doctor = res.data.dname,
                this.form.idcard = res.data.pidcard,
                this.form.name = res.data.pname,
                this.form.pid = res.data.apid,
                this.form.deid = res.data.adeid,
                this.form.did = res.data.adid,
                this.form.aid = res.data.aid
            })
        },
      chakansubmit(row){
        this.activename = "chakan",
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
      submit(){
        this.dialogVisible = false;
        // console.log(sessionStorage.getItem("state"))
        document.body.scrollTop = 0;
        // firefox
        document.documentElement.scrollTop = 0;
        // safari
        window.pageYOffset = 0;
        this.$axios({
          method:"post",
          url: "/api/caseh/addcaseh" ,
          data:{
            cadate: this.form.time,
            cpname: this.form.name,
            cdeid: this.form.deid,
            cdename: this.form.keshi,
            cdid: this.form.did,
            cdname:  this.form.doctor,
            caid: this.form.aid,
            cpid: this.form.pid,
            cpidcard: this.form.idcard,
            cpsex: this.form.sex,
            cptelephone: this.form.telephone,
            cshoufei: this.form.shoufei,
            ctype: this.form.type,
            cyizhu: this.form.yizhu,
            czhusu: this.form.zhusu
          },
        }).then((res)=> {
          if(res.status==200) {
            this.$myMsg.notify({
              content: "提交成功",
              type: 'success',
            })
            this.state = true;
            this.$axios({
              method: "put",
              url: "/api/appointment/updateStatus",
              params: {
                aid: this.form.aid,
              }
            })
          }
          this.activename="patient";
          this.finish();
        })
      },
      finish(){
        this.$axios({
          method: "get",
          url: "/api/appointment/falsepatient",
          params: {
            aStatus:'false',
            aDid:sessionStorage.getItem("id")
          }
        }).then((res)=> {
          this.tableData1=[];
          for (let i = 0; i < res.data.length; i++) {
            this.tableData1.push(res.data[i])
          }
        })
      },

      handleClose(done) {
        this.$confirm('确认关闭？')
          .then(_ => {
            done();
          })
          .catch(_ => {});
      },
      doctorAppointment(){
        this.$axios({
          method: "get",
          url: "/api/appointment/doctorAppointment",
          params:{
            did: sessionStorage.getItem("id")
          }
        }).then((res)=> {
          this.tableData=[];
          for (let i = 0; i < res.data.length; i++) {
            this.tableData.push(res.data[i])
          }
        })
      },
      handleClick(){
        if(this.activename='appointment'){
          this.doctorAppointment();
        }else if(this.activename="patient"){
          this.finish();
        }
      }
    },
    data() {
      return {
        state:false,
        activename:"appointment",
        tableData: [],
        tableData1:[],
        dialogVisible:false,
        form:{
          name:'',
          sex:'',
          telephone:'',
          idcard:'',
          keshi:'',
          doctor:'',
          time:'',
          zhusu:'',
          type:'',
          shoufei:'',
          yizhu:'',
          deid:'',
          did:'',
          aid:'',
          pid:''
        },
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
      }
    },
    mounted(){
      this.doctorAppointment()
    }
  }
</script>
<style>
  .el-textarea__inner{
    height: 100px;
  }
</style>
