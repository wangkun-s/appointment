<template>
  <div class="card text-dark bg-light ">
    <div class="card-body" style="width: 1200px;margin:0 auto;">
      <div v-for="(data,i) in tableData" :key="i">
        <div style="font-weight: bold;font-size: 25px;color: #08afaf">{{data.de_name}}>>科室介绍</div>
        <div style="padding-top: 10px">
          {{data.de_description}}
        </div>
      </div>
      <br/>
      <div>
        <p style="font-weight: bold;font-size: 25px;color: #08afaf">医生推荐</p>
        <div>
          <el-popover v-for="(data,i) in doctorList" :key="i">
            <el-button slot="reference">
              <div class="text item" style="width: 200px;height: 200px">
                <img :src="data.demail" style="height: 100px;width: 100px">
                <h5 class="mt-0" style="float: right;text-align:left;margin-left: 10px;font-size: 18px">
                  名字：{{data.dname}}</br>
                  科室：{{data.de_name}}</br>
                  职称：{{data.djob}}</br>
                </h5>
                <router-link :to="{path:'/timelink',query:{eDid:data.did}}">
                  <el-button type="primary" plain>查看时间表</el-button>
                </router-link>
              </div>
            </el-button>
          </el-popover>
        </div>
      </div>
      <br/>
    </div>
  </div>
</template>

<script>
  export default {
    name: 'detaile',
    data() {
      return {
        tableData: [],
        doctorList:[],
        imgArr:[
          {imgSrc:require('../assets/doctor/doctor1.jpg')},
          {imgSrc:require('../assets/doctor/doctor2.jpg')},
          {imgSrc:require('../assets/doctor/doctor3.jpg')},
          {imgSrc:require('../assets/doctor/doctor4.jpg')},
          {imgSrc:require('../assets/doctor/doctor5.jpg')},
          {imgSrc:require('../assets/doctor/doctor6.jpg')},
          {imgSrc:require('../assets/doctor/doctor7.jpg')},
          {imgSrc:require('../assets/doctor/doctor8.jpg')},
          {imgSrc:require('../assets/doctor/doctor9.jpg')},
          {imgSrc:require('../assets/doctor/doctor10.jpg')},
          {imgSrc:require('../assets/doctor/doctor11.jpg')},
          {imgSrc:require('../assets/doctor/doctor12.jpg')},
          {imgSrc:require('../assets/doctor/doctor13.jpg')},
          {imgSrc:require('../assets/doctor/doctor14.jpg')},
          {imgSrc:require('../assets/doctor/doctor15.jpg')},
          {imgSrc:require('../assets/doctor/doctor16.jpg')},
          {imgSrc:require('../assets/doctor/doctor17.jpg')},
          {imgSrc:require('../assets/doctor/doctor18.jpg')},
          {imgSrc:require('../assets/doctor/doctor19.jpg')},
          {imgSrc:require('../assets/doctor/doctor20.jpg')},
          {imgSrc:require('../assets/doctor/doctor21.jpg')},
          {imgSrc:require('../assets/doctor/doctor22.jpg')},
          {imgSrc:require('../assets/doctor/doctor23.jpg')},
          {imgSrc:require('../assets/doctor/doctor24.jpg')},
          {imgSrc:require('../assets/doctor/doctor25.jpg')},
          {imgSrc:require('../assets/doctor/doctor26.jpg')},
          {imgSrc:require('../assets/doctor/doctor27.jpg')},
          {imgSrc:require('../assets/doctor/doctor28.jpg')},
          {imgSrc:require('../assets/doctor/doctor29.jpg')},
          {imgSrc:require('../assets/doctor/doctor30.jpg')},
          {imgSrc:require('../assets/doctor/doctor31.jpg')},
          {imgSrc:require('../assets/doctor/doctor32.jpg')},
          {imgSrc:require('../assets/doctor/doctor34.jpg')},
          {imgSrc:require('../assets/doctor3/doctor1.jpg')},
          {imgSrc:require('../assets/doctor3/doctor2.jpg')},
          {imgSrc:require('../assets/doctor3/doctor3.jpg')},
          {imgSrc:require('../assets/doctor3/doctor4.jpg')},
          {imgSrc:require('../assets/doctor3/doctor5.jpg')},
          {imgSrc:require('../assets/doctor3/doctor6.jpg')},
          {imgSrc:require('../assets/doctor3/doctor7.jpg')},
          {imgSrc:require('../assets/doctor3/doctor8.jpg')},
          {imgSrc:require('../assets/doctor3/doctor9.jpg')},
          {imgSrc:require('../assets/doctor3/doctor10.jpg')},
          {imgSrc:require('../assets/doctor3/doctor11.jpg')},
          {imgSrc:require('../assets/doctor3/doctor12.jpg')},
          {imgSrc:require('../assets/doctor3/doctor13.jpg')},
          {imgSrc:require('../assets/doctor3/doctor14.jpg')},
          {imgSrc:require('../assets/doctor3/doctor15.jpg')},
          {imgSrc:require('../assets/doctor3/doctor16.jpg')},
          {imgSrc:require('../assets/doctor3/doctor17.jpg')},
          {imgSrc:require('../assets/doctor3/doctor18.jpg')},
          {imgSrc:require('../assets/doctor3/doctor19.jpg')},
          {imgSrc:require('../assets/doctor3/doctor20.jpg')},
          {imgSrc:require('../assets/doctor3/doctor21.jpg')},
          {imgSrc:require('../assets/doctor3/doctor22.jpg')},
          {imgSrc:require('../assets/doctor3/doctor23.jpg')},
          {imgSrc:require('../assets/doctor3/doctor24.jpg')},
          {imgSrc:require('../assets/doctor3/doctor25.jpg')},
          {imgSrc:require('../assets/doctor3/doctor26.jpg')},
          {imgSrc:require('../assets/doctor3/doctor27.jpg')},
          {imgSrc:require('../assets/doctor3/doctor28.jpg')},
          {imgSrc:require('../assets/doctor3/doctor29.jpg')},
          {imgSrc:require('../assets/doctor3/doctor30.jpg')},
          {imgSrc:require('../assets/doctor3/doctor31.jpg')},
          {imgSrc:require('../assets/doctor3/doctor32.jpg')},
          {imgSrc:require('../assets/doctor3/doctor34.jpg')},
          {imgSrc:require('../assets/doctor2/doctor1.jpg')},
          {imgSrc:require('../assets/doctor2/doctor2.jpg')},
          {imgSrc:require('../assets/doctor2/doctor3.jpg')},
          {imgSrc:require('../assets/doctor2/doctor4.jpg')},
          {imgSrc:require('../assets/doctor2/doctor5.jpg')},
          {imgSrc:require('../assets/doctor2/doctor6.jpg')},
          {imgSrc:require('../assets/doctor2/doctor7.jpg')},
          {imgSrc:require('../assets/doctor2/doctor8.jpg')},
          {imgSrc:require('../assets/doctor2/doctor9.jpg')},
          {imgSrc:require('../assets/doctor2/doctor10.jpg')},
          {imgSrc:require('../assets/doctor2/doctor11.jpg')},
          {imgSrc:require('../assets/doctor2/doctor12.jpg')},
          {imgSrc:require('../assets/doctor2/doctor13.jpg')},
          {imgSrc:require('../assets/doctor2/doctor14.jpg')},
          {imgSrc:require('../assets/doctor2/doctor15.jpg')},
          {imgSrc:require('../assets/doctor2/doctor16.jpg')},
          {imgSrc:require('../assets/doctor2/doctor17.jpg')},
          {imgSrc:require('../assets/doctor2/doctor18.jpg')},
          {imgSrc:require('../assets/doctor2/doctor19.jpg')},
          {imgSrc:require('../assets/doctor2/doctor20.jpg')},
          {imgSrc:require('../assets/doctor2/doctor21.jpg')},
          {imgSrc:require('../assets/doctor2/doctor22.jpg')},
          {imgSrc:require('../assets/doctor2/doctor23.jpg')},
          {imgSrc:require('../assets/doctor2/doctor24.jpg')},
          {imgSrc:require('../assets/doctor2/doctor25.jpg')},
          {imgSrc:require('../assets/doctor2/doctor26.jpg')},
          {imgSrc:require('../assets/doctor2/doctor27.jpg')},
          {imgSrc:require('../assets/doctor2/doctor28.jpg')},
          {imgSrc:require('../assets/doctor2/doctor29.jpg')},
          {imgSrc:require('../assets/doctor2/doctor30.jpg')},
          {imgSrc:require('../assets/doctor2/doctor31.jpg')},
          {imgSrc:require('../assets/doctor2/doctor32.jpg')},
          {imgSrc:require('../assets/doctor2/doctor34.jpg')},
        ]
      }
    },

    methods:{
      idselect(deId){
        this.$axios({
          methods:"get",
          url: "/api/department/selectid",
          params:{
            deId:this.deId
          }
        }).then((res)=>{
          this.tableData.push(res.data)
        })
      },
    selectdoctor(deId){
      this.$axios({
        method: "get",
        url: "/api/doctor/selectdoctor" ,
        params:{
          dDeId:deId,
        }
      }).then((res)=>{
        for(let i=0;i<res.data.length;i++){
          this.doctorList.push(res.data[i]);
        }
        for(let i=0;i<this.doctorList.length;i++){
          this.doctorList[i].demail = this.imgArr[i].imgSrc;
        }
        console.log( this.doctorList)
      })
    }
    },
    created() {
      this.deId = this.$route.query.deId;//获取上个页面传递的id,在下面获取数据的时候先提交id
      this.idselect(this.deId);
      this.selectdoctor(this.deId);
    },
    mounted(){
      // chrome
      document.body.scrollTop = 0;
      // firefox
      document.documentElement.scrollTop = 0;
      // safari
      window.pageYOffset = 0;
    }
  }
</script>

<style>
  .el-table .warning-row {
    background: oldlace;
  }

  .el-table .success-row {
    background: #f0f9eb;
  }

</style>
