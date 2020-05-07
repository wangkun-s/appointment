<template>
  <div class="card text-dark bg-light ">
    <div class="card-body" style="width: 1200px;margin:0 auto;">
      <div>
        <p style="font-weight: bold;font-size: 25px;color: #08afaf">口腔正畸>>科室简介</p>
        <p>
          科室现有三个诊室，共13台椅位，配备有点焊机，弓丝热处理仪，真空压模成型器，真空搅拌机等先进仪器。正畸临床装备有国际先进的Winceph8.0正畸诊断设计病例管理系统，每椅位配备计算机网络终端通过主机服务器互通并与放射线科的Planmeca promax数字化X光机相连，快速获取诊断数据资料、计算机头影测量分析和治疗预测、图文诊断治疗报告，可方便地进行治疗前后的对比和效果评价，同时科学规范的管理正畸治疗病例资料。        </p>
      </div>
      <br/>
      <div>
        <p style="font-weight: bold;font-size: 25px;color: #08afaf">医生推荐</p>
        <div class="col-md-12">
          <el-card class="box-card" style="padding: 20px">
            <el-popover>
              <el-button slot="reference">
                <div id="侯志明" name="侯志明" ref="侯志明" class="text item" style="width: 200px;height: 200px">
                  <img src="../../assets/doctor/doctor20.jpg" style="height: 100px;width: 100px">
                  <a class="mt-0" style="float: right;text-align:left;margin-left: 10px;font-size: 18px">
                    姓名：侯志明</br>
                    科室：口腔正畸科</br>
                    职称：知名专家</br>
                  </a>
                  <router-link :to="{name:'appointmentmainlink'}">
                    <el-button type="primary" plain>立即预约</el-button>
                  </router-link>
                </div>
              </el-button>
            </el-popover>
            <el-popover>
              <el-button slot="reference">
                <div id="刘奕" name="刘奕" ref="刘奕" class="text item" style="width: 200px;height: 200px">
                  <img src="../../assets/doctor/doctor3.jpg" style="height: 100px;width: 100px">
                  <h5 class="mt-0" style="float: right;text-align:left;margin-left: 10px;font-size: 18px">
                    姓名：刘奕</br>
                    科室：口腔正畸科</br>
                    职称：知名专家</br>
                  </h5>
                  <router-link :to="{name:'appointmentmainlink'}">
                    <el-button type="primary" plain>立即预约</el-button>
                  </router-link>
                </div>
              </el-button>
            </el-popover>
            <el-popover>
              <el-button slot="reference">
                <div id="戚琳" name="戚琳" ref="戚琳" class="text item" style="width: 200px;height: 200px">
                  <img src="../../assets/doctor/doctor16.jpg" style="height: 100px;width: 100px">
                  <h5 class="mt-0" style="float: right;text-align:left;margin-left: 10px;font-size: 18px">
                    姓名：戚琳</br>
                    科室：口腔正畸科</br>
                    职称：知名专家</br>
                  </h5>
                  <router-link :to="{name:'appointmentmainlink'}">
                    <el-button type="primary" plain>立即预约</el-button>
                  </router-link>
                </div>
              </el-button>
            </el-popover>
            <el-popover>
              <el-button slot="reference">
                <div id="赵震锦" name="赵震锦" ref="赵震锦" class="text item" style="width: 200px;height: 200px">
                  <img src="../../assets/doctor/doctor15.jpg" style="height: 100px;width: 100px">
                  <h5 class="mt-0" style="float: right;text-align:left;margin-left: 10px;font-size: 18px">
                    姓名：赵震锦</br>
                    科室：口腔正畸科</br>
                    职称：知名专家</br>
                  </h5>
                  <router-link :to="{name:'appointmentmainlink'}">
                    <el-button type="primary" plain>立即预约</el-button>
                  </router-link>
                </div>
              </el-button>
            </el-popover>
            <el-popover>
              <el-button slot="reference">
                <div id="于滨" name="于滨" ref="于滨" class="text item" style="width: 200px;height: 200px">
                  <img src="../../assets/doctor/doctor14.jpg" style="height: 100px;width: 100px">
                  <h5 class="mt-0" style="float: right;text-align:left;margin-left: 10px;font-size: 18px">
                    姓名：于滨</br>
                    科室：口腔正畸科</br>
                    职称：知名专家</br>
                  </h5>
                  <router-link :to="{name:'appointmentmainlink'}">
                    <el-button type="primary" plain>立即预约</el-button>
                  </router-link>
                </div>
              </el-button>
            </el-popover>
            <el-popover>
              <el-button slot="reference">
                <div id="王式安" name="王式安" ref="王式安" class="text item" style="width: 200px;height: 200px">
                  <img src="../../assets/doctor/doctor13.jpg" style="height: 100px;width: 100px">
                  <h5 class="mt-0" style="float: right;text-align:left;margin-left: 10px;font-size: 18px">
                    姓名：王式安</br>
                    科室：口腔正畸科</br>
                    职称：知名专家</br>
                  </h5>
                  <router-link :to="{name:'appointmentmainlink'}">
                    <el-button type="primary" plain>立即预约</el-button>
                  </router-link>
                </div>
              </el-button>
            </el-popover>
            <el-popover>
              <el-button slot="reference">
                <div id="肖素英" name="肖素英" ref="肖素英" class="text item" style="width: 200px;height: 200px">
                  <img src="../../assets/doctor/doctor11.jpg" style="height: 100px;width: 100px">
                  <h5 class="mt-0" style="float: right;text-align:left;margin-left: 10px;font-size: 18px">
                    姓名：肖素英</br>
                    科室：口腔正畸科</br>
                    职称：知名专家</br>
                  </h5>
                  <router-link :to="{name:'appointmentmainlink'}">
                    <el-button type="primary" plain>立即预约</el-button>
                  </router-link>
                </div>
              </el-button>
            </el-popover>
            <el-popover>
              <el-button slot="reference">
                <div id="孙膑" name="孙膑" ref="孙膑" class="text item" style="width: 200px;height: 200px">
                  <img src="../../assets/doctor/doctor8.jpg" style="height: 100px;width: 100px">
                  <h5 class="mt-0" style="float: right;text-align:left;margin-left: 10px;font-size: 18px">
                    姓名：孙膑</br>
                    科室：口腔正畸科</br>
                    职称：知名专家</br>
                  </h5>
                  <router-link :to="{name:'appointmentmainlink'}">
                    <el-button type="primary" plain>立即预约</el-button>
                  </router-link>
                </div>
              </el-button>
            </el-popover>
            <el-popover>
              <el-button slot="reference">
                <div id="伽罗" name="伽罗" ref="伽罗" class="text item" style="width: 200px;height: 200px">
                  <img src="../../assets/doctor/doctor15.jpg" style="height: 100px;width: 100px">
                  <h5 class="mt-0" style="float: right;text-align:left;margin-left: 10px;font-size: 18px">
                    姓名：伽罗</br>
                    科室：口腔正畸科</br>
                    职称：知名专家</br>
                  </h5>
                  <router-link :to="{name:'appointmentmainlink'}">
                    <el-button type="primary" plain>立即预约</el-button>
                  </router-link>
                </div>
              </el-button>
            </el-popover>
            <el-popover>
              <el-button slot="reference">
                <div id="蔡文姬" name="蔡文姬" ref="蔡文姬" class="text item" style="width: 200px;height: 200px">
                  <img src="../../assets/doctor/doctor9.jpg" style="height: 100px;width: 100px">
                  <h5 class="mt-0" style="float: right;text-align:left;margin-left: 10px;font-size: 18px">
                    姓名：蔡文姬</br>
                    科室：口腔正畸科</br>
                    职称：知名专家</br>
                  </h5>
                  <router-link :to="{name:'appointmentmainlink'}">
                    <el-button type="primary" plain>立即预约</el-button>
                  </router-link>
                </div>
              </el-button>
            </el-popover>
            <el-popover>
              <el-button slot="reference">
                <div id="卢娜" name="卢娜" ref="卢娜" class="text item" style="width: 200px;height: 200px">
                  <img src="../../assets/doctor/doctor31.jpg" style="height: 100px;width: 100px">
                  <h5 class="mt-0" style="float: right;text-align:left;margin-left: 10px;font-size: 18px">
                    姓名：卢娜</br>
                    科室：口腔正畸科</br>
                    职称：知名专家</br>
                  </h5>
                  <router-link :to="{name:'appointmentmainlink'}">
                    <el-button type="primary" plain>立即预约</el-button>
                  </router-link>
                </div>
              </el-button>
            </el-popover>
            <el-popover>
              <el-button slot="reference">
                <div id="孙思哲" name="孙思哲" ref="孙思哲" class="text item" style="width: 200px;height: 200px">
                  <img src="../../assets/doctor/doctor7.jpg" style="height: 100px;width: 100px">
                  <h5 class="mt-0" style="float: right;text-align:left;margin-left: 10px;font-size: 18px">
                    姓名：孙思哲</br>
                    科室：口腔正畸科</br>
                    职称：知名专家</br>
                  </h5>
                  <router-link :to="{name:'appointmentmainlink'}">
                    <el-button type="primary" plain>立即预约</el-button>
                  </router-link>
                </div>
              </el-button>
            </el-popover>
            <el-popover>
              <el-button slot="reference">
                <div id="洪世贤" name="洪世贤" ref="洪世贤" class="text item" style="width: 200px;height: 200px">
                  <img src="../../assets/doctor/doctor6.jpg" style="height: 100px;width: 100px">
                  <h5 class="mt-0" style="float: right;text-align:left;margin-left: 10px;font-size: 18px">
                    姓名：洪世贤</br>
                    科室：口腔正畸科</br>
                    职称：知名专家</br>
                  </h5>
                  <router-link :to="{name:'appointmentmainlink'}">
                    <el-button type="primary" plain>立即预约</el-button>
                  </router-link>
                </div>
              </el-button>
            </el-popover>
            <el-popover>
              <el-button slot="reference">
                <div id="周安安" name="周安安" ref="周安安" class="text item" style="width: 200px;height: 200px">
                  <img src="../../assets/doctor/doctor4.jpg" style="height: 100px;width: 100px">
                  <h5 class="mt-0" style="float: right;text-align:left;margin-left: 10px;font-size: 18px">
                    姓名：周安安</br>
                    科室：口腔正畸科</br>
                    职称：知名专家</br>
                  </h5>
                  <router-link :to="{name:'appointmentmainlink'}">
                    <el-button type="primary" plain>立即预约</el-button>
                  </router-link>
                </div>
              </el-button>
            </el-popover>
            <el-popover>
              <el-button slot="reference">
                <div id="朱有才" name="朱有才" ref="朱有才" class="text item" style="width: 200px;height: 200px">
                  <img src="../../assets/doctor/doctor5.jpg" style="height: 100px;width: 100px">
                  <h5 class="mt-0" style="float: right;text-align:left;margin-left: 10px;font-size: 18px">
                    姓名：朱有才</br>
                    科室：口腔正畸科</br>
                    职称：知名专家</br>
                  </h5>
                  <router-link :to="{name:'appointmentmainlink'}">
                    <el-button type="primary" plain>立即预约</el-button>
                  </router-link>
                </div>
              </el-button>
            </el-popover>
            <el-popover>
              <el-button slot="reference">
                <div id="冯灿灿" name="冯灿灿" ref="冯灿灿" class="text item" style="width: 200px;height: 200px">
                  <img src="../../assets/doctor/doctor2.jpg" style="height: 100px;width: 100px">
                  <h5 class="mt-0" style="float: right;text-align:left;margin-left: 10px;font-size: 18px">
                    姓名：冯灿灿</br>
                    科室：口腔正畸科</br>
                    职称：知名专家</br>
                  </h5>
                  <router-link :to="{name:'appointmentmainlink'}">
                    <el-button type="primary" plain>立即预约</el-button>
                  </router-link>
                </div>
              </el-button>
            </el-popover>
            <el-popover>
              <el-button slot="reference">
                <div id="赵阳" name="赵阳" ref="赵阳" class="text item" style="width: 200px;height: 200px">
                  <img src="../../assets/doctor/doctor9.jpg" style="height: 100px;width: 100px">
                  <h5 class="mt-0" style="float: right;text-align:left;margin-left: 10px;font-size: 18px">
                    姓名：赵阳</br>
                    科室：口腔正畸科</br>
                    职称：知名专家</br>
                  </h5>
                  <router-link :to="{name:'appointmentmainlink'}">
                    <el-button type="primary" plain>立即预约</el-button>
                  </router-link>
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
    name: 'zhengji',
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
