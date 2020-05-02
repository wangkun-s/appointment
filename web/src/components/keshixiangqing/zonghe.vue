<template>
  <div class="card text-dark bg-light ">
    <div class="card-body" style="width: 1200px;margin:0 auto;">
      <div>
        <p style="font-weight: bold;font-size: 25px;color: #08afaf">综合科室>>科室简介</p>
        <p>
          综合科位于综合楼七楼东侧，是集教学、临床为一体的综合科室。该中心立足于本科生临床实习，兼顾专业学位研究生住院医师轮转和执业医师培训工作。诊疗项目包括：牙体牙髓、牙周、修复、牙槽外科及放射线，由各学科资深教师指导学生进行临床诊疗工作，教学过程中涉及的诊疗项目治疗费用享受五折优惠，同时开设专家门诊。该科室拥有一支具有高水平、高素质的医疗队伍，固定成员有副主任医师1名，主治医师4名。现有口腔综合治疗椅22台，拥有根管显微镜、机动镍钛根管预备系统、热牙胶充填系统、电子根尖定位仪、超声根管治疗系统、CAD/CAM-Cerec AC椅旁即刻全瓷修复系统、BPS全口义齿制作系统、进口超声波洁牙机、牙周显微外科手术器械、牙周内窥镜等。科室设备先进、环境优雅、服务周到、消毒完善，将定期举办国家级、省级继续教育项目，积极推广牙齿治疗及修复的新技术，科室全体医护人员将以饱满的热情为您提供优质的治疗服务，欢迎广大患者前来就诊。        </p>
      </div>
      <br/>
      <div>
        <p style="font-weight: bold;font-size: 25px;color: #08afaf">医生推荐</p>
        <div class="col-md-12">
          <el-card class="box-card" style="padding: 20px">
            <el-popover>
              <el-button slot="reference">
                <div class="text item" style="width: 200px;height: 200px">
                  <img src="../../assets/doctor/doctor29.jpg" style="height: 100px;width: 100px">
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
                  <img src="../../assets/doctor/doctor28.jpg" style="height: 100px;width: 100px">
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
    name: 'zonghe',
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
