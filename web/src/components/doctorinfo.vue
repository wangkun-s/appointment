<template>
  <div>
    <div style="width: auto;height: auto">
      <img src="../../static/logo.jpg" style="width: 100px;height: 100px">
      <i class="web-font">医好连锁口腔医院</i>
      &nbsp;&nbsp;&nbsp;
      <el-tag type="success">连锁专科</el-tag>
      <el-tag type="info">国营</el-tag>
      <el-tag type="warning">专科医院</el-tag>
    </div>
    <div class="card text-dark bg-light ">
      <div class="card-body" style="width: 1200px;margin:0 auto;">
        <el-tabs type="border-card">
          <el-tab-pane label="所有专家列表">
            <div class="col-md-12">
              <el-card class="box-card" style="padding: 20px">
                <el-popover>
                  <el-button slot="reference">
                    <div class="text item" style="width: 200px;height: 200px">
                      <img src="../assets/doctor/doctor29.jpg" style="height: 100px;width: 100px">
                      <h5 class="mt-0" style="float: right;text-align:left;margin-left: 10px;font-size: 18px">
                        姓名：王强</br>
                        科室：综合科</br>
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
                    <div class="text item" style="width: 200px;height: 200px">
                      <img src="../assets/doctor/doctor28.jpg" style="height: 100px;width: 100px">
                      <h5 class="mt-0" style="float: right;text-align:left;margin-left: 10px;font-size: 18px">
                        姓名：林洛</br>
                        科室：综合科</br>
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
                    <div class="text item" style="width: 200px;height: 200px">
                      <img src="../assets/doctor/doctor2.jpg" style="height: 100px;width: 100px">
                      <h5 class="mt-0" style="float: right;text-align:left;margin-left: 10px;font-size: 18px">
                        姓名：赵宝红</br>
                        科室：种植科</br>
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
                    <div class="text item" style="width: 200px;height: 200px">
                      <img src="../assets/doctor/doctor3.jpg" style="height: 100px;width: 100px">
                      <h5 class="mt-0" style="float: right;text-align:left;margin-left: 10px;font-size: 18px">
                        姓名：邓春富</br>
                        科室：种植科</br>
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
                    <div id="侯志明" name="侯志明" ref="侯志明" class="text item" style="width: 200px;height: 200px">
                      <img src="../assets/doctor/doctor20.jpg" style="height: 100px;width: 100px">
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
                      <img src="../assets/doctor/doctor3.jpg" style="height: 100px;width: 100px">
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
                      <img src="../assets/doctor/doctor16.jpg" style="height: 100px;width: 100px">
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
                      <img src="../assets/doctor/doctor15.jpg" style="height: 100px;width: 100px">
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
                      <img src="../assets/doctor/doctor14.jpg" style="height: 100px;width: 100px">
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
                      <img src="../assets/doctor/doctor13.jpg" style="height: 100px;width: 100px">
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
                      <img src="../assets/doctor/doctor11.jpg" style="height: 100px;width: 100px">
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
                      <img src="../assets/doctor/doctor8.jpg" style="height: 100px;width: 100px">
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
                      <img src="../assets/doctor/doctor15.jpg" style="height: 100px;width: 100px">
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
                      <img src="../assets/doctor/doctor9.jpg" style="height: 100px;width: 100px">
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
                      <img src="../assets/doctor/doctor31.jpg" style="height: 100px;width: 100px">
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
                      <img src="../assets/doctor/doctor7.jpg" style="height: 100px;width: 100px">
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
                      <img src="../assets/doctor/doctor6.jpg" style="height: 100px;width: 100px">
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
                      <img src="../assets/doctor/doctor4.jpg" style="height: 100px;width: 100px">
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
                      <img src="../assets/doctor/doctor5.jpg" style="height: 100px;width: 100px">
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
                      <img src="../assets/doctor/doctor2.jpg" style="height: 100px;width: 100px">
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
                      <img src="../assets/doctor/doctor9.jpg" style="height: 100px;width: 100px">
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
                <el-popover>
                  <el-button slot="reference">
                    <div class="text item" style="width: 200px;height: 200px">
                      <img src="../assets/doctor/doctor19.jpg" style="height: 100px;width: 100px">
                      <h5 class="mt-0" style="float: right;text-align:left;margin-left: 10px;font-size: 18px">
                        姓名：于静涛</br>
                        科室：牙体牙髓科</br>
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
                    <div class="text item" style="width: 200px;height: 200px">
                      <img src="../assets/doctor/doctor3.jpg" style="height: 100px;width: 100px">
                      <h5 class="mt-0" style="float: right;text-align:left;margin-left: 10px;font-size: 18px">
                        姓名：詹福良</br>
                        科室：牙体牙髓科</br>
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
                    <div class="text item" style="width: 200px;height: 200px">
                      <img src="../assets/doctor/doctor18.jpg" style="height: 100px;width: 100px">
                      <h5 class="mt-0" style="float: right;text-align:left;margin-left: 10px;font-size: 18px">
                        姓名：薛明</br>
                        科室：牙体牙髓科</br>
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
                    <div class="text item" style="width: 200px;height: 200px">
                      <img src="../assets/doctor/doctor15.jpg" style="height: 100px;width: 100px">
                      <h5 class="mt-0" style="float: right;text-align:left;margin-left: 10px;font-size: 18px">
                        姓名：仇丽鸿</br>
                        科室：牙体牙髓科</br>
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
                    <div class="text item" style="width: 200px;height: 200px">
                      <img src="../assets/doctor/doctor14.jpg" style="height: 100px;width: 100px">
                      <h5 class="mt-0" style="float: right;text-align:left;margin-left: 10px;font-size: 18px">
                        姓名：周彩滨</br>
                        科室：牙体牙髓科</br>
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
                    <div class="text item" style="width: 200px;height: 200px">
                      <img src="../assets/doctor/doctor13.jpg" style="height: 100px;width: 100px">
                      <h5 class="mt-0" style="float: right;text-align:left;margin-left: 10px;font-size: 18px">
                        姓名：邵丽娜</br>
                        科室：牙体牙髓科</br>
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
                    <div class="text item" style="width: 200px;height: 200px">
                      <img src="../assets/doctor/doctor20.jpg" style="height: 100px;width: 100px">
                      <h5 class="mt-0" style="float: right;text-align:left;margin-left: 10px;font-size: 18px">
                        姓名：李伟</br>
                        科室：牙体牙髓科</br>
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
                    <div class="text item" style="width: 200px;height: 200px">
                      <img src="../assets/doctor/doctor17.jpg" style="height: 100px;width: 100px">
                      <h5 class="mt-0" style="float: right;text-align:left;margin-left: 10px;font-size: 18px">
                        姓名：曲柳</br>
                        科室：牙体牙髓科</br>
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
                    <div class="text item" style="width: 200px;height: 200px">
                      <img src="../assets/doctor/doctor16.jpg" style="height: 100px;width: 100px">
                      <h5 class="mt-0" style="float: right;text-align:left;margin-left: 10px;font-size: 18px">
                        姓名：张晓丽</br>
                        科室：牙体牙髓科</br>
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
                    <div class="text item" style="width: 200px;height: 200px">
                      <img src="../assets/doctor/doctor9.jpg" style="height: 100px;width: 100px">
                      <h5 class="mt-0" style="float: right;text-align:left;margin-left: 10px;font-size: 18px">
                        姓名：鲁班</br>
                        科室：牙体牙髓科</br>
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
                    <div class="text item" style="width: 200px;height: 200px">
                      <img src="../assets/doctor/doctor8.jpg" style="height: 100px;width: 100px">
                      <h5 class="mt-0" style="float: right;text-align:left;margin-left: 10px;font-size: 18px">
                        姓名：张媛媛</br>
                        科室：牙体牙髓科</br>
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
                    <div class="text item" style="width: 200px;height: 200px">
                      <img src="../assets/doctor/doctor7.jpg" style="height: 100px;width: 100px">
                      <h5 class="mt-0" style="float: right;text-align:left;margin-left: 10px;font-size: 18px">
                        姓名：王明明</br>
                        科室：牙体牙髓科</br>
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
                    <div class="text item" style="width: 200px;height: 200px">
                      <img src="../assets/doctor/doctor6.jpg" style="height: 100px;width: 100px">
                      <h5 class="mt-0" style="float: right;text-align:left;margin-left: 10px;font-size: 18px">
                        姓名：于恩江</br>
                        科室：牙体牙髓科</br>
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
                    <div class="text item" style="width: 200px;height: 200px">
                      <img src="../assets/doctor/doctor4.jpg" style="height: 100px;width: 100px">
                      <h5 class="mt-0" style="float: right;text-align:left;margin-left: 10px;font-size: 18px">
                        姓名：李振向</br>
                        科室：牙体牙髓科</br>
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
                    <div class="text item" style="width: 200px;height: 200px">
                      <img src="../assets/doctor/doctor2.jpg" style="height: 100px;width: 100px">
                      <h5 class="mt-0" style="float: right;text-align:left;margin-left: 10px;font-size: 18px">
                        姓名：王惠琼</br>
                        科室：口腔黏膜科</br>
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
                    <div class="text item" style="width: 200px;height: 200px">
                      <img src="../assets/doctor/doctor4.jpg" style="height: 100px;width: 100px">
                      <h5 class="mt-0" style="float: right;text-align:left;margin-left: 10px;font-size: 18px">
                        姓名：张凌</br>
                        科室：口腔黏膜科</br>
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
                    <div class="text item" style="width: 200px;height: 200px">
                      <img src="../assets/doctor/doctor5.jpg" style="height: 100px;width: 100px">
                      <h5 class="mt-0" style="float: right;text-align:left;margin-left: 10px;font-size: 18px">
                        姓名：王贤辐</br>
                        科室：口腔黏膜科</br>
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
                    <div class="text item" style="width: 200px;height: 200px">
                      <img src="../assets/doctor/doctor15.jpg" style="height: 100px;width: 100px">
                      <h5 class="mt-0" style="float: right;text-align:left;margin-left: 10px;font-size: 18px">
                        姓名：赵戬</br>
                        科室：口腔黏膜科</br>
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
                    <div class="text item" style="width: 200px;height: 200px">
                      <img src="../assets/doctor/doctor14.jpg" style="height: 100px;width: 100px">
                      <h5 class="mt-0" style="float: right;text-align:left;margin-left: 10px;font-size: 18px">
                        姓名：唐晓琳</br>
                        科室：口腔黏膜科</br>
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
                    <div class="text item" style="width: 200px;height: 200px">
                      <img src="../assets/doctor/doctor7.jpg" style="height: 100px;width: 100px">
                      <h5 class="mt-0" style="float: right;text-align:left;margin-left: 10px;font-size: 18px">
                        姓名：王文军</br>
                        科室：口腔黏膜科</br>
                        职称：知名专家</br>
                      </h5>
                      <router-link :to="{name:'appointmentmainlink'}">
                        <el-button type="primary" plain>立即预约</el-button>
                      </router-link>                    </div>
                  </el-button>
                </el-popover>
                <el-popover>
                  <el-button slot="reference">
                    <div class="text item" style="width: 200px;height: 200px">
                      <img src="../assets/doctor/doctor20.jpg" style="height: 100px;width: 100px">
                      <h5 class="mt-0" style="float: right;text-align:left;margin-left: 10px;font-size: 18px">
                        姓名：寇育荣</br>
                        科室：口腔黏膜科</br>
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
                    <div class="text item" style="width: 200px;height: 200px">
                      <img src="../assets/doctor/doctor6.jpg" style="height: 100px;width: 100px">
                      <h5 class="mt-0" style="float: right;text-align:left;margin-left: 10px;font-size: 18px">
                        姓名：林莉</br>
                        科室：口腔黏膜科</br>
                        职称：知名专家</br>
                      </h5>
                      <router-link :to="{name:'appointmentmainlink'}">
                        <el-button type="primary" plain>立即预约</el-button>
                      </router-link>                    </div>
                  </el-button>
                </el-popover>
                <el-popover>
                  <el-button slot="reference">
                    <div class="text item" style="width: 200px;height: 200px">
                      <img src="../assets/doctor/doctor26.jpg" style="height: 100px;width: 100px">
                      <h5 class="mt-0" style="float: right;text-align:left;margin-left: 10px;font-size: 18px">
                        姓名：王爽</br>
                        科室：麻醉科</br>
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
                    <div class="text item" style="width: 200px;height: 200px">
                      <img src="../assets/doctor/doctor25.jpg" style="height: 100px;width: 100px">
                      <h5 class="mt-0" style="float: right;text-align:left;margin-left: 10px;font-size: 18px">
                        姓名：王嘉林</br>
                        科室：麻醉科</br>
                        职称：知名专家</br>
                      </h5>
                      <router-link :to="{name:'appointmentmainlink'}">
                        <el-button type="primary" plain>立即预约</el-button>
                      </router-link>                    </div>
                  </el-button>
                </el-popover>
                <el-popover>
                  <el-button slot="reference">
                    <div class="text item" style="width: 200px;height: 200px">
                      <img src="../assets/doctor/doctor30.jpg" style="height: 100px;width: 100px">
                      <h5 class="mt-0" style="float: right;text-align:left;margin-left: 10px;font-size: 18px">
                        姓名：苏玉亮</br>
                        科室：麻醉科</br>
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
                    <div class="text item" style="width: 200px;height: 200px">
                      <img src="../assets/doctor/doctor2.jpg" style="height: 100px;width: 100px">
                      <h5 class="mt-0" style="float: right;text-align:left;margin-left: 10px;font-size: 18px">
                        姓名：包扬</br>
                        科室：口腔修复</br>
                        职称：知名专家</br>
                      </h5>
                      <router-link :to="{name:'appointmentmainlink'}">
                        <el-button type="primary" plain>立即预约</el-button>
                      </router-link>                    </div>
                  </el-button>
                </el-popover>
                <el-popover>
                  <el-button slot="reference">
                    <div class="text item" style="width: 200px;height: 200px">
                      <img src="../assets/doctor/doctor3.jpg" style="height: 100px;width: 100px">
                      <h5 class="mt-0" style="float: right;text-align:left;margin-left: 10px;font-size: 18px">
                        姓名：杨晓东</br>
                        科室：口腔修复</br>
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
                    <div class="text item" style="width: 200px;height: 200px">
                      <img src="../assets/doctor/doctor16.jpg" style="height: 100px;width: 100px">
                      <h5 class="mt-0" style="float: right;text-align:left;margin-left: 10px;font-size: 18px">
                        姓名：杭晓东</br>
                        科室：口腔修复</br>
                        职称：知名专家</br>
                      </h5>
                      <router-link :to="{name:'appointmentmainlink'}">
                        <el-button type="primary" plain>立即预约</el-button>
                      </router-link>                    </div>
                  </el-button>
                </el-popover>
                <el-popover>
                  <el-button slot="reference">
                    <div class="text item" style="width: 200px;height: 200px">
                      <img src="../assets/doctor/doctor15.jpg" style="height: 100px;width: 100px">
                      <h5 class="mt-0" style="float: right;text-align:left;margin-left: 10px;font-size: 18px">
                        姓名：艾红军</br>
                        科室：口腔修复</br>
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
                    <div class="text item" style="width: 200px;height: 200px">
                      <img src="../assets/doctor/doctor14.jpg" style="height: 100px;width: 100px">
                      <h5 class="mt-0" style="float: right;text-align:left;margin-left: 10px;font-size: 18px">
                        姓名：周依</br>
                        科室：口腔修复</br>
                        职称：知名专家</br>
                      </h5>
                      <router-link :to="{name:'appointmentmainlink'}">
                        <el-button type="primary" plain>立即预约</el-button>
                      </router-link>                    </div>
                  </el-button>
                </el-popover>
                <el-popover>
                  <el-button slot="reference">
                    <div class="text item" style="width: 200px;height: 200px">
                      <img src="../assets/doctor/doctor13.jpg" style="height: 100px;width: 100px">
                      <h5 class="mt-0" style="float: right;text-align:left;margin-left: 10px;font-size: 18px">
                        姓名：依哲</br>
                        科室：口腔修复</br>
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
                    <div class="text item" style="width: 200px;height: 200px">
                      <img src="../assets/doctor/doctor20.jpg" style="height: 100px;width: 100px">
                      <h5 class="mt-0" style="float: right;text-align:left;margin-left: 10px;font-size: 18px">
                        姓名：李秉鸿</br>
                        科室：口腔修复</br>
                        职称：知名专家</br>
                      </h5>
                      <router-link :to="{name:'appointmentmainlink'}">
                        <el-button type="primary" plain>立即预约</el-button>
                      </router-link>                    </div>
                  </el-button>
                </el-popover>
                <el-popover>
                  <el-button slot="reference">
                    <div class="text item" style="width: 200px;height: 200px">
                      <img src="../assets/doctor/doctor11.jpg" style="height: 100px;width: 100px">
                      <h5 class="mt-0" style="float: right;text-align:left;margin-left: 10px;font-size: 18px">
                        姓名：钟秀丽</br>
                        科室：口腔修复</br>
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
                    <div class="text item" style="width: 200px;height: 200px">
                      <img src="../assets/doctor/doctor15.jpg" style="height: 100px;width: 100px">
                      <h5 class="mt-0" style="float: right;text-align:left;margin-left: 10px;font-size: 18px">
                        姓名：阎旭</br>
                        科室：口腔修复</br>
                        职称：知名专家</br>
                      </h5>
                      <router-link :to="{name:'appointmentmainlink'}">
                        <el-button type="primary" plain>立即预约</el-button>
                      </router-link>                    </div>
                  </el-button>
                </el-popover>
                <el-popover>
                  <el-button slot="reference">
                    <div class="text item" style="width: 200px;height: 200px">
                      <img src="../assets/doctor/doctor9.jpg" style="height: 100px;width: 100px">
                      <h5 class="mt-0" style="float: right;text-align:left;margin-left: 10px;font-size: 18px">
                        姓名：郝玉全</br>
                        科室：口腔修复</br>
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
                    <div class="text item" style="width: 200px;height: 200px">
                      <img src="../assets/doctor/doctor8.jpg" style="height: 100px;width: 100px">
                      <h5 class="mt-0" style="float: right;text-align:left;margin-left: 10px;font-size: 18px">
                        姓名：刘峰</br>
                        科室：口腔修复</br>
                        职称：知名专家</br>
                      </h5>
                      <router-link :to="{name:'appointmentmainlink'}">
                        <el-button type="primary" plain>立即预约</el-button>
                      </router-link>                    </div>
                  </el-button>
                </el-popover>
                <el-popover>
                  <el-button slot="reference">
                    <div class="text item" style="width: 200px;height: 200px">
                      <img src="../assets/doctor/doctor7.jpg" style="height: 100px;width: 100px">
                      <h5 class="mt-0" style="float: right;text-align:left;margin-left: 10px;font-size: 18px">
                        姓名：马军</br>
                        科室：口腔修复</br>
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
                    <div class="text item" style="width: 200px;height: 200px">
                      <img src="../assets/doctor/doctor6.jpg" style="height: 100px;width: 100px">
                      <h5 class="mt-0" style="float: right;text-align:left;margin-left: 10px;font-size: 18px">
                        姓名：闫雪松</br>
                        科室：口腔修复</br>
                        职称：知名专家</br>
                      </h5>
                      <router-link :to="{name:'appointmentmainlink'}">
                        <el-button type="primary" plain>立即预约</el-button>
                      </router-link>                    </div>
                  </el-button>
                </el-popover>
                <el-popover>
                  <el-button slot="reference">
                    <div class="text item" style="width: 200px;height: 200px">
                      <img src="../assets/doctor/doctor4.jpg" style="height: 100px;width: 100px">
                      <h5 class="mt-0" style="float: right;text-align:left;margin-left: 10px;font-size: 18px">
                        姓名：李语晶</br>
                        科室：口腔修复</br>
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
                    <div class="text item" style="width: 200px;height: 200px">
                      <img src="../assets/doctor/doctor5.jpg" style="height: 100px;width: 100px">
                      <h5 class="mt-0" style="float: right;text-align:left;margin-left: 10px;font-size: 18px">
                        姓名：吴宝琳</br>
                        科室：口腔修复</br>
                        职称：知名专家</br>
                      </h5>
                      <router-link :to="{name:'appointmentmainlink'}">
                        <el-button type="primary" plain>立即预约</el-button>
                      </router-link>                    </div>
                  </el-button>
                </el-popover>
                <el-popover>
                  <el-button slot="reference">
                    <div class="text item" style="width: 200px;height: 200px">
                      <img src="../assets/doctor/doctor21.jpg" style="height: 100px;width: 100px">
                      <h5 class="mt-0" style="float: right;text-align:left;margin-left: 10px;font-size: 18px">
                        姓名：春娇</br>
                        科室：口腔颌面</br>
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
                    <div class="text item" style="width: 200px;height: 200px">
                      <img src="../assets/doctor/doctor22.jpg" style="height: 100px;width: 100px">
                      <h5 class="mt-0" style="float: right;text-align:left;margin-left: 10px;font-size: 18px">
                        姓名：徐中飞</br>
                        科室：口腔颌面</br>
                        职称：知名专家</br>
                      </h5>
                      <router-link :to="{name:'appointmentmainlink'}">
                        <el-button type="primary" plain>立即预约</el-button>
                      </router-link>                    </div>
                  </el-button>
                </el-popover>
                <el-popover>
                  <el-button slot="reference">
                    <div class="text item" style="width: 200px;height: 200px">
                      <img src="../assets/doctor/doctor23.jpg" style="height: 100px;width: 100px">
                      <h5 class="mt-0" style="float: right;text-align:left;margin-left: 10px;font-size: 18px">
                        姓名：刘强</br>
                        科室：口腔颌面</br>
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
                    <div class="text item" style="width: 200px;height: 200px">
                      <img src="../assets/doctor/doctor24.jpg" style="height: 100px;width: 100px">
                      <h5 class="mt-0" style="float: right;text-align:left;margin-left: 10px;font-size: 18px">
                        姓名：赵南震</br>
                        科室：口腔颌面</br>
                        职称：知名专家</br>
                      </h5>
                      <router-link :to="{name:'appointmentmainlink'}">
                        <el-button type="primary" plain>立即预约</el-button>
                      </router-link>                    </div>
                  </el-button>
                </el-popover>
                <el-popover>
                  <el-button slot="reference">
                    <div class="text item" style="width: 200px;height: 200px">
                      <img src="../assets/doctor/doctor14.jpg" style="height: 100px;width: 100px">
                      <h5 class="mt-0" style="float: right;text-align:left;margin-left: 10px;font-size: 18px">
                        姓名：周韦滨</br>
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
                    <div class="text item" style="width: 200px;height: 200px">
                      <img src="../assets/doctor/doctor11.jpg" style="height: 100px;width: 100px">
                      <h5 class="mt-0" style="float: right;text-align:left;margin-left: 10px;font-size: 18px">
                        姓名：方敏敏</br>
                        科室：口腔正畸科</br>
                        职称：知名专家</br>
                      </h5>
                      <router-link :to="{name:'appointmentmainlink'}">
                        <el-button type="primary" plain>立即预约</el-button>
                      </router-link>                    </div>
                  </el-button>
                </el-popover>
                <el-popover>
                  <el-button slot="reference">
                    <div class="text item" style="width: 200px;height: 200px">
                      <img src="../assets/doctor/doctor13.jpg" style="height: 100px;width: 100px">
                      <h5 class="mt-0" style="float: right;text-align:left;margin-left: 10px;font-size: 18px">
                        姓名：朱军</br>
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
                    <div class="text item" style="width: 200px;height: 200px">
                      <img src="../assets/doctor/doctor.jpg" style="height: 100px;width: 100px">
                      <h5 class="mt-0" style="float: right;text-align:left;margin-left: 10px;font-size: 18px">
                        姓名：高梅</br>
                        科室：鼾症中心</br>
                        职称：知名专家</br>
                        <br/>
                      </h5>
                      <router-link :to="{name:'appointmentmainlink'}">
                        <el-button type="primary" plain>立即预约</el-button>
                      </router-link>
                    </div>
                  </el-button>
                </el-popover>
              </el-card>
            </div>
          </el-tab-pane>
        </el-tabs>
      </div>
    </div>
  </div>
</template>

<script>
  export default {
    name:"doctorinfo",
    methods: {
      dingbu(){
        this.$router.push('/doctorinfo');
        // chrome
        document.body.scrollTop = 0;
        // firefox
        document.documentElement.scrollTop = 0;
        // safari
        window.pageYOffset = 0;
      },
    },
    mounted(){
      this.dingbu();
    },
    data() {
      return {
      }
    }
  }
</script>

<style>
  @font-face {
    font-family: 'webfont';
    font-display: swap;
    src: url('../css/webfont.eot'); /* IE9 */
    src: url('../css/webfont.eot?#iefix') format('embedded-opentype'), /* IE6-IE8 */ url('../css/webfont.woff2') format('woff2'),
    url('../css/webfont.woff') format('woff'), /* chrome、firefox */ url('../css/webfont.ttf') format('truetype'), /* chrome、firefox、opera、Safari, Android, iOS 4.2+*/ url('../css/webfont.svg#webfont') format('svg'); /* iOS 4.1- */
  }

  .web-font {
    font-family: "webfont" !important;
    font-size: 30px;
    font-style: normal;
    padding-left: 20px;
    -webkit-font-smoothing: antialiased;
    -moz-osx-font-smoothing: grayscale;
  }
  .el-table .warning-row {
    background: oldlace;
  }

  .el-table .success-row {
    background: #f0f9eb;
  }

</style>
