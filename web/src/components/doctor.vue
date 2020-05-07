<template>
  <div class="col-md-12">
    <el-card class="box-card" style="padding: 20px">
      <div slot="header" class="clearfix">
        <span style="float: left;font-size: 25px">医生介绍</span>
        <el-button style="float: right; padding: 3px 0" type="text">详细</el-button>
      </div>
      <el-popover>
        <el-button slot="reference">
          <div class="text item" style="width: 620px;height: 330px">
            <img src="../assets/doctor/doctor1.jpg" style="height: 300px;width: 200px">
            <h5 class="mt-0" style="float: right;text-align:left;margin-left: 10px;font-size: 18px">
                      姓名：丁云</br>
                      科室：第三门诊部正畸科</br>
                      职务：科主任</br>
                      职称：主治医师</br>
                      专长：舌侧隐形正畸治疗</br>无托槽隐形矫治技术</br>微种植支抗技术</br>青少年严重牙、颌、面畸形的矫治</br>
                      社会任职：第三门诊部党支部书记
                    </h5>
                  </div>
           </el-button>
              </el-popover>
              <el-popover>
                <el-button slot="reference">
                  <div class="text item" style="width: 620px;height: 330px">
                    <img src="../assets/doctor/doctor14.jpg" style="height: 300px;width: 200px">
                    <h5 class="mt-0" style="float: right;text-align:left;margin-left: 10px;font-size: 18px">
                      姓名：晏莉</br>
                      科室：牙体牙髓科</br>
                      职称：主治医师</br>
                      专长：牙体牙髓常见病的诊断与治疗
                    </h5>
                  </div>
                </el-button>
              </el-popover>
              <el-popover>
                <el-button slot="reference">
                  <div class="text item" style="width: 620px;height: 330px">
                    <img src="../assets/doctor/doctor4.jpg" style="height: 300px;width: 200px">
                    <h5 class="mt-0" style="float: right;text-align:left;margin-left: 10px;font-size: 18px">
                      姓名：高学军</br>
                      科室：牙体牙髓科</br>
                      职称：知名专家</br>
                      专长：疑难牙体牙髓病的诊断与治疗</br>
                      龋病的综合管理与治疗
                    </h5>
                  </div>
                </el-button>
              </el-popover>
              <el-popover>
                <el-button slot="reference">
                  <div class="text item" style="width: 620px;height: 330px">
                    <img src="../assets/doctor/doctor5.jpg" style="height: 300px;width: 200px">
                    <h5 class="mt-0" style="float: right;text-align:left;margin-left: 10px;font-size: 18px">
                      姓名：岳林</br>
                      科室：牙体牙髓科</br>
                      职称：知名专家</br>
                      专长：疑难牙体牙髓病的诊断和治疗方案设计</br>
                      复杂根管问题的处理</br>牙体缺损的保存修复
                    </h5>
                  </div>
                </el-button>
              </el-popover>
              <el-popover>
                <el-button slot="reference">
                  <div class="text item" style="width: 620px;height: 330px">
                    <img src="../assets/doctor/doctor6.jpg" style="height: 300px;width: 200px">
                    <h5 class="mt-0" style="float: right;text-align:left;margin-left: 10px;font-size: 18px">
                      姓名：董艳梅</br>
                      科室：牙体牙髓科</br>
                      职称：知名专家</br>
                      专长：牙体牙髓病的诊断与治疗</br>
                      擅长显微根管治疗技术</br>牙体缺损的直接修复技术
                    </h5>
                  </div>
                </el-button>
              </el-popover>
              <el-popover>
                <el-button slot="reference">
                  <div class="text item" style="width: 620px;height: 330px">
                    <img src="../assets/doctor/doctor7.jpg" style="height: 300px;width: 200px">
                    <h5 class="mt-0" style="float: right;text-align:left;margin-left: 10px;font-size: 18px">
                      姓名：王泽泗</br>
                      科室：牙体牙髓科</br>
                      职称：知名专家</br>
                      专长：疑难牙体牙髓病的诊断与治疗</br>
                      心脏病患者监护下开髓
                    </h5>
                  </div>
                </el-button>
              </el-popover>
              <el-popover>
                <el-button slot="reference">
                  <div class="text item" style="width: 620px;height: 330px">
                    <img src="../assets/doctor/doctor8.jpg" style="height: 300px;width: 200px">
                    <h5 class="mt-0" style="float: right;text-align:left;margin-left: 10px;font-size: 18px">
                      姓名：梁宇红</br>
                      科室：牙体牙髓科</br>
                      职称：知名专家</br>
                      专长：复杂疑难牙髓根尖周病诊治</br>
                      疑难根管治疗以及并发症处理
                    </h5>
                  </div>
                </el-button>
              </el-popover>
              <el-popover>
                <el-button slot="reference">
                  <div class="text item" style="width: 620px;height: 330px">
                    <img src="../assets/doctor/doctor9.jpg" style="height: 300px;width: 200px">
                    <h5 class="mt-0" style="float: right;text-align:left;margin-left: 10px;font-size: 18px">
                      姓名：王祖华</br>
                      科室：牙体牙髓科</br>
                      职称：主任医师</br>
                      专长：牙体牙髓病的综合诊治</br>
                      显微根尖手术
                    </h5>
                  </div>
                </el-button>
              </el-popover>
            </el-card>
          </div>
        </div>
      </div>
    </div>
  </div>
</template>

<script>
    export default {
        methods: {
          login() {
            this.$router.push('/login')
          }
        }
    }
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
  .el-menu-demo{
    margin-top: 50px;
  }
  .el-carousel__item h3 {
    color: #475669;
    font-size: 18px;
    opacity: 0.75;
    line-height: 300px;
    margin: 0;
  }

  .el-carousel__item:nth-child(2n) {
    background-color: #99a9bf;
  }

  .el-carousel__item:nth-child(2n+1) {
    background-color: #d3dce6;
  }
  .el-carousel__item h3 {
    color: #475669;
    font-size: 14px;
    opacity: 0.75;
    line-height: 200px;
    margin: 0;
  }

  .el-carousel__item:nth-child(2n) {
    background-color: #99a9bf;
  }

  .el-carousel__item:nth-child(2n+1) {
    background-color: #d3dce6;
  }
  .text {
    font-size: 20px;
  }

  .item {
    margin-bottom: 18px;
  }

  .clearfix:before,
  .clearfix:after {
    display: table;
    content: "";
  }
  .clearfix:after {
    clear: both
  }

  .box-card {
    margin-left: 20px;
    width: 1600px;
  }
</style>
