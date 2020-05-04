<template >
  <div id="FullOrderDetailBox">
    <div style="border: 1px solid #99a9bf;width: 1000px;margin-left: 100px">
      <div class="row" style="height: 50px" >
        <div class="col-md-12" style="text-align: center" >
          医好连锁口腔医院
        </div>
      </div>
      <div class="row" style="height: 50px">
        <div class="col-md-12">
          基本信息：
        </div>
      </div>
      <div class="row" style="height: 50px"  id="pdfCentent">
        <div class="col-md-3">
          姓名：
        </div>
        <div class="col-md-3">
          性别：
        </div>
        <div class="col-md-3">
          身份证：
        </div>
        <div class="col-md-3">
          手机号：
        </div>
      </div>
      <hr/>
      <div class="row" style="height: 50px">
        <div class="col-md-12">
          就诊记录：
        </div>
      </div>
      <div class="row" style="height: 50px">
        <div class="col-md-4">
          就诊科室：
        </div>
        <div class="col-md-4">
          主治医生：
        </div>
        <div class="col-md-4">
          就诊时间：
        </div>
      </div>
      <hr/>
      <div class="row" style="height: 50px">
        <div class="col-md-12">
          诊疗数据：
        </div>
      </div>
      <div class="row" style="height: 50px">
        <div class="col-md-12">
          主诉：
        </div>
      </div>
      <div class="row" style="height: 50px">
        <div class="col-md-12">
          类型：
        </div>
      </div>
      <div class="row" style="height: 50px">
        <div class="col-md-12">
          收费项：
        </div>
      </div>
      <div class="row" style="height: 50px">
        <div class="col-md-12">
          医嘱：
        </div>
      </div>
      <el-button type="danger"
                 @click="PrintClick">导出PDF</el-button>
    </div>
  </div>
</template>


<script>
    export default {
        name: "page7",
      data () {
        return {
          htmlTitle: "PDF名称",
          nowTime: "",
        }
      },
      methods:{
        PrintClick() {
          // window.print();//打印全部
          var oldHtml = document.body.innerHTML;//将body内容先行存储
          var printbox = document.getElementById("FullOrderDetailBox").innerHTML;//再将所要打印区域内容赋值给body
          document.body.innerHTML = printbox;//再将所要打印区域内容赋值给body
          window.print();//调用全部打印事件
          document.body.innerHTML = oldHtml;//将body内容再返回原页面
          window.location.reload();//打印取消后刷新页面防止按钮不能点击
        }

      }
    }
</script>

<style scoped>

</style>
