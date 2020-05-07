<template>
  <div class="card text-dark bg-light ">
    <div class="card-body" style="width: 1200px;margin:0 auto;">
      <div>
        <p style="font-weight: bold;font-size: 25px;color: #08afaf">种植科>>科室简介</p>
        <p>
          　种植后的上部结构以固定式修复为主，修复材料可为银铂合金烤瓷牙、金合金烤瓷牙及全瓷修复体等。对无牙颌患者可在种植体植入后，行磁性固位体、球帽固位体、杆卡固位体或套筒冠等覆盖 义齿修复。
          　　<br/>业务范围：<br/>
          　　1、各类牙缺失的种植修复。<br/>
          　　2、即刻种植修复，美学种植修复。<br/>
          　　3、全口牙缺失的种植修复：全口固定种植修复、全口覆盖种植修复。<br/>
          　　4、骨量不足的患者的骨增量手术技能。<br/>
          　　5、颌面缺损患者种植体支持赝复体修复。<br/>
          　　6、微创拔牙及拔牙创位点保存术。
        </p>
      </div>
      <br/>
      <div>
        <p style="font-weight: bold;font-size: 25px;color: #08afaf">医生推荐</p>
        <div class="col-md-12">
          <el-card class="box-card" style="padding: 20px">
            <el-popover>
              <el-button slot="reference">
                <div class="text item" style="width: 200px;height: 200px">
                  <img src="../../assets/doctor/doctor2.jpg" style="height: 100px;width: 100px">
                  <h5 class="mt-0" style="float: right;text-align:left;margin-left: 10px;font-size: 18px">
                    姓名：赵宝红</br>
                    科室：种植科</br>
                    职称：知名专家</br>
                  </h5>
                  <el-button type="primary" plain>立即预约</el-button>
                </div>
              </el-button>
            </el-popover>
            <el-popover>
              <el-button slot="reference">
                <div class="text item" style="width: 200px;height: 200px">
                  <img src="../../assets/doctor/doctor3.jpg" style="height: 100px;width: 100px">
                  <h5 class="mt-0" style="float: right;text-align:left;margin-left: 10px;font-size: 18px">
                    姓名：邓春富</br>
                    科室：种植科</br>
                    职称：知名专家</br>
                  </h5>
                  <el-button type="primary" plain>立即预约</el-button>
                </div>
              </el-button>
            </el-popover>
          </el-card>
        </div>
      </div>
      <br/>
    </div>
  </div>
</template>

<script>

  export default {
    name: 'zhongzhi',
    data() {
      return {
      }
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
    width: 1200px;
  }
</style>
