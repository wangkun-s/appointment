<template>
  <div class="card text-dark bg-light ">
    <div class="card-body" style="width: 1200px;margin:0 auto;">
      <div>
        <p style="font-weight: bold;font-size: 25px;color: #08afaf">口腔麻醉>>科室简介</p>
        <p>
          麻醉科业务技术范围：全身麻醉（含吸入麻醉、静脉复合麻醉及静吸复合麻醉）、颌面外科创伤，肿瘤，面部瘢痕手术麻醉、婴幼儿唇、腭裂病人的麻醉、颌面外科重症急救病人的麻醉、上、下颌骨联合整畸术的麻醉，美容整形手术麻醉,以及术后镇痛。
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
                  <img src="../../assets/doctor/doctor26.jpg" style="height: 100px;width: 100px">
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
                  <img src="../../assets/doctor/doctor25.jpg" style="height: 100px;width: 100px">
                  <h5 class="mt-0" style="float: right;text-align:left;margin-left: 10px;font-size: 18px">
                    姓名：王嘉林</br>
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
                  <img src="../../assets/doctor/doctor30.jpg" style="height: 100px;width: 100px">
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
          </el-card>
        </div>
      </div>
      <br/>
      <div>
        <p style="font-weight: bold;font-size: 25px;color: #08afaf">专科排班表</p>
        <div>
          <full-calendar
            :events="events"
            :config="config"
            class="test-fc"
            locale="fr"
            @event-drop="eventDrop">
          </full-calendar>
        </div>
      </div>
    </div>
  </div>
</template>

<script>
  import { FullCalendar } from 'vue-full-calendar';
  import 'fullcalendar/dist/fullcalendar.css';
  export default {
    name: 'mazui',
    components: {FullCalendar},
    data() {
      return {
        events: [
          {title: '赵子龙', start: '2019-07-01T12:30', end: '2019-07-01T13:30',},
          {title: '刘备', start: '2019-07-02T10:20', end: '2019-07-02T11:00', color: 'red'},
          {title: '关羽', start: '2019-07-03T14:20', end: '2019-07-03T15:20', backgroundColor: 'green',},
          {title: '张飞', start: '2019-07-04T16:00', end: '2019-07-04T17:00', color: 'orange', editable: true},
          {title: '曹操', start: '2019-07-05T18:40', end: '2019-07-05T19:20',}
        ],
        config: {
          firstDay: 1,
          locale: 'zh-cn',
          defaultView: 'agendaWeek',

          height: 'auto',
          header: {
            left: 'title',
            center: '',
            right: 'prev,today,next',
          },
          /* agenda 模式 */
          allDaySlot: false,
          slotLabelFormat: 'H:mm', // axisFormat 'H(:mm)'
          slotLabelInterval: 1,
          slotDuration: '00:30:00',
          minTime: '8:00',
          maxTime: '20:00',
          editable: true,
          /* 设置按钮文字 */
          buttonText: {
            today: '今天',
          }
        }
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
