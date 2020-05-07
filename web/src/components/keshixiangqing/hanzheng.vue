<template>
  <div class="card text-dark bg-light ">
    <div class="card-body" style="width: 1200px;margin:0 auto;">
      <div>
        <p style="font-weight: bold;font-size: 25px;color: #08afaf">鼾症中心>>科室简介</p>
        <p>
          鼾症是睡眠中由于各种原因造成上气道阻力增高，上气道的高速气流使周围软组织发生振动所致。<br/>
          其发病原因可能与鼻甲肥大、鼻窦炎、扁桃体肥大、软腭肥大、舌根后坠、会厌病变、劳累、饮酒等有关。
        </p>
      </div>
      <br/>
      <div>
        <p style="font-weight: bold;font-size: 25px;color: #08afaf">医生推荐</p>
        <p>
          <el-popover>
            <el-button slot="reference">
              <div class="text item" style="width: 200px;height: 200px">
                <img src="../../assets/doctor/doctor1.jpg" style="height: 100px;width: 100px">
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
        </p>
      </div>
      <br/>
  </div>
  </div>
</template>

<script>
  export default {
    name: 'hanzheng',
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
  .el-table .warning-row {
    background: oldlace;
  }

  .el-table .success-row {
    background: #f0f9eb;
  }

</style>
