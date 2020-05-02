<template>
  <div  >
    <div class="bottom1 bg-info">

      <div style="margin-top:10px;display: flex;width: 100%" class="row" >
        <div class="col-md-2"></div>

        <div class="col-md-2">
          <div style="margin-top:20px">
          <img src="../../static/local.png" style="width: 30px;height: 30px;">
          <a style="font-size: 14px"> 地址：大连市长江路935号 </a>
          </div>
        </div>
        <div style="float:left;margin-top: 20px;width: 1px;height: 30px; background: #000000;"></div>
        <div class="col-md-2">
          <div style="margin-top:20px">
          <img src="../../static/email.png" style="width: 30px;height: 30px;">
          <a style="margin-top: 10px;font-size: 14px"> 邮箱:1692697115@qq.com </a>
          </div>
        </div>
        <div style="float:left;margin-top: 20px;width: 1px;height: 30px; background: #000000;"></div>

        <div class="col-md-2">
          <div style="margin-top:20px">
          <img src="../../static/qq.png" style="width: 30px;height: 30px;">
          <a style="margin-right: 30px;margin-left: 10px;font-size: 14px"> qq：1692697115 </a>
          </div>
        </div>
        <div style="float:left;margin-top: 20px;width: 1px;height: 30px; background: #000000;"></div>

        <div class="col-md-2">
          <div style="margin-top:20px">
          <img src="../../static/phone.png" style="width: 30px;height: 30px;">
          <a style="margin-right: 30px;margin-left: 10px;margin-top: 10px;font-size: 14px"> 电话：022-2323 2323 </a>
          </div>
        </div>

      </div>


      <hr class="hrbo">

    </div>
    <div class="bottom2">
      <div style="text-align:center">2020/2/28 design by @wangkun</div>
    </div>
  </div>
</template>

<script>
  export default {
    name: "bottom"
  }
</script>

<style scoped>
  .hrbo {
    width: 70%;
    background: black;

  }

  .bottom1 {
    width: 100%;
    height: 70px;

  }

  .bottom2 {
    width: 100%;
    height: 30px;
    background-color: #003f80;
  }
</style>
