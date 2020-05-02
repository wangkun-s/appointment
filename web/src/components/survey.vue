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
        <el-tab-pane label="医院概况">
          <el-row :gutter="20">
            <el-col :span="6"><div class="grid-content bg-purple">主任医师：60</div></el-col>
            <el-col :span="6"><div class="grid-content bg-purple">副主任医师：48</div></el-col>
            <el-col :span="6"><div class="grid-content bg-purple">床位数：162张</div></el-col>
            <el-col :span="6"><div class="grid-content bg-purple">门诊量：603次</div></el-col>
          </el-row>
          <el-row :gutter="20">
            <el-col :span="6"><div class="grid-content bg-purple">电话：</div></el-col>
            <el-col :span="6"><div class="grid-content bg-purple">医院总机：022-2323 2323</div></el-col>
          </el-row>
          <el-row :gutter="20">
            <el-col :span="6"><div class="grid-content bg-purple">地址：</div></el-col>
            <el-col :span="6"><div class="grid-content bg-purple">辽宁省大连市沙河口区长江路935号</div></el-col>
            <el-col :span="6">
              <div class="grid-content bg-purple">
              <img src="../../static/map.png" class= "map"@click="map">
              <a class="map" style="color: #08afaf" @click="map">查看地图</a>
                <div class="mapbox"  v-if="showMap">

                  <baidu-map :center="center" :zoom="zoom" @ready="handler" style="height:400px;width: 600px"@click="getClickInfo">
                    <bm-navigation anchor="BMAP_ANCHOR_TOP_RIGHT"></bm-navigation>
                    <!--<bm-map-type :map-types="['BMAP_NORMAL_MAP', 'BMAP_HYBRID_MAP']"></bm-map-type>-->
                    <bm-geolocation anchor="BMAP_ANCHOR_BOTTOM_RIGHT" :showAddressBar="true" :autoLocation="true"></bm-geolocation>
                    <bm-city-list anchor="BMAP_ANCHOR_TOP_LEFT"></bm-city-list>

                  </baidu-map>
                </div>
            </div>
            </el-col>
          </el-row>
          <hr style="height:1px;border:none;border-top:1px dashed #DDDDDD;" />
          <div>
            <span style="color: #08afaf; font-size: 20px; font-weight: bold">简介</span>
            <span><br/>
              &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;医好连锁口腔医院是大连市建院全面、规模最大的口腔专科医院，是医疗保险定点和非营利性医院。<br/><br/>
              &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;该院始建于1951年，经过53年的发展，已成为一所环境优美、设备一流、技术先进，集医疗、教学、科研、预防于一体的现代化口腔专科医院，跻身国内同行业先进行列。荣获了辽宁省文明单位、大连市先进集体、规范服务红旗单位等称号。现有职工108名，其中高级职称48名。
              医好连锁口腔医院总院坐落在沙河口区长江路935号，建筑面积1.1万平方米。全院设牙科综合治疗椅142台，床位50张。有牙体牙髓病科、口腔颌面外科、口腔修复科、正畸科、牙周粘膜病科等临床科室和4个医技科室。其中口腔修复科和口腔颌面外科是市一级重点医学专科，技术力量雄厚。<br/><br/>　
              医好连锁口腔医院的设备是国内一流的，如纯钛铸造机、激光焊接机、计算机辅助设计和制作系统，以及外科先进配套的手术设备等；加强国内外学术交流，不断开发新的医疗项目，所开展的内科根管治疗技术、外科手术技术、精密附着体修复技术、激光治疗技术等，达到国内先进水平，并与国际先进水平接轨；引进了卡式高压蒸汽消毒设备，在全国同行中率先实现了一患一机一高压消毒，彻底解决口腔医疗中的交叉感染问题；空调化的诊室和病房，宽敞明亮配有闭路电视、饮水机等设施的候诊室，处处体现"以人为本"的服务理念，患者就医环境不断改善。<br/><br/>
　　          医好连锁口腔医院全体医务人员秉承“以病人为中心，以健康为宗旨，以预防为重点，防治切实结合”的医疗服务理念，不断努力和拼搏，为口腔医学事业的发展做出贡献，为广大人民群众的口腔健康保驾护航。<br/>
            </span>
            <hr style="height:1px;border:none;border-top:1px dashed #DDDDDD;" />
            <span style="color: #08afaf; font-size: 20px; font-weight: bold">科研成果</span>
            <span><br/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
              医好连锁口腔医院近年来获国家自然基金项目(面上项目)9项，“863计划”、“国家科技支撑计划”等一级协作科研项目6项，部省级基金项目165 项，市级基金项目33项。在各级专业杂志发表科研、教学论文1558篇。现有29人分别担任中华医学会、中华口腔医学会、中华预防医学会各专业委员会副主任委员、常务委员、委员，26人在各类学术刊物分别担任主编、副主编、常务编委、编委，拥有国际牙医师学院院士6人。学院获得卫生部科技进步二等奖1项、三等奖1项，教育部科技进步三等奖1项，辽宁省科技进步二等奖8项、三等奖20项，沈阳市科技进步一等奖1项、二等奖1项、三等奖6项;获中华人民共和国专利2项，辽宁省发明创造一等奖1项。为加强口腔医学院学科建设，挖掘优秀科技人才和鼓励青年科技人员的科研、教学创新，学院设立学科发展基金、青年科研启动基金、教学研究基金等院级基金项目，每年资助约20项。
            <br/>
            </span>
            <hr style="height:1px;border:none;border-top:1px dashed #DDDDDD;" />
            <span style="color: #08afaf; font-size: 20px; font-weight: bold">获奖荣誉</span>
            <span><br/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
              医院被国际“微笑列车”、中华慈善总会确定为“微笑列车唇腭裂矫治项目”定点医院。从 2005年3月起，已诊治唇腭裂患者350余人次，为社会做出了较大贡献，同时也增强了医务人员的社会责任感。被中华慈善总会评为“中华慈善奖”。医院于 2005年1月被批准为沈阳市基本医疗保险定点医院。医院积极创建医疗保险患者的就医环境，建立健全医疗保险管理制度，获得沈阳市医疗保险管理工作先进单位。沈阳铁路医疗保险定点医院也于2006年12月1日正式开通。2011年被评为“国家口腔考官培训医师实践技能考试基地”。
            <br/>
            </span>
            <hr style="height:1px;border:none;border-top:1px dashed #DDDDDD;" />
            <span style="color: #08afaf; font-size: 20px; font-weight: bold">先进设备</span>
            <span><br/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
              医院拥有先进的医疗设备，如CAD/CAM计算机全瓷修复系统、根管显微镜系统、牙周内窥镜系统、数字全景X光机、超声骨刀、手术显微镜、摆动锯、颞下关节镜及等离子手术系统、手术室微动力系统、等离子低温灭菌系统等。该院在国内较早开展口腔及头颈肿瘤的综合治疗、唇腭裂序列治疗，复杂颌骨骨折等颌面部重症创伤的救治及颅颌面畸形整复、正颌外科治疗等;应用显微外科技术行各类组织缺损及器官再造修复;在国内较早开展口内进路的髁状突骨折内固定术;开展根管显微镜治疗技术，热凝牙胶充填技术;开展牙周序列治疗SPT、GTR、GBR、牙周微创治疗及牙周美容手术，同时还应用牙周超声综合治疗机、 Florida探针牙周自动检测系统、显微牙周外科手术器械、牙周内窥镜系统等进行重度疑难牙周疾病的诊治;率先开展了CAD-CAM义齿制作技术、各种烤瓷修复体及附着体义齿、纯钛、金合金铸造义齿支架制作技术;开展各类错合畸形的矫治、隐形矫治技术舌侧矫治器，种植体支抗的应用等。
              <br/>
            </span>
          </div>
        </el-tab-pane>
        <el-tab-pane label="医院环境">
          <div class="carousel slide" id="carousel-906357">
            <el-carousel indicator-position="outside">
              <el-carousel-item>
                <img src="../../static/lunbo00.jpg" class="carousel_image_type" style="width: 1200px;height: 300px;">
              </el-carousel-item>
              <el-carousel-item>
                <img src="../../static/lunbo06.jpg" class="carousel_image_type" style="width: 1200px;height: 300px;">
              </el-carousel-item>
              <el-carousel-item>
                <img src="../../static/lunbo05.jpg" class="carousel_image_type" style="width: 1200px;height: 300px;">
              </el-carousel-item>
              <el-carousel-item>
                <img src="../../static/lunbo07.jpg" class="carousel_image_type" style="width: 1200px;height: 300px;">
              </el-carousel-item>
              <el-carousel-item>
                <img src="../../static/lunbo08.jpg" class="carousel_image_type" style="width: 1200px;height: 300px;">
              </el-carousel-item>
              <el-carousel-item>
                <img src="../../static/lunbo09.jpg" class="carousel_image_type" style="width: 1200px;height: 300px;">
              </el-carousel-item>
            </el-carousel>
          </div>
        </el-tab-pane>
      </el-tabs>
    </div>
      </div>
  </div>
</template>

<script>
  export default {
    name: "survey",
    data() {
      return {
        activeName: 'first',
        center: {lng: 0, lat: 0},
        zoom: 16,
        showMap:false,
      };
    },
    methods: {
      handleClick(tab, event) {
        console.log(tab, event);
      },
      map:function(){
        this.showMap = !this.showMap;
      },
      handler({BMap, map}) {
        console.log(BMap, map)
        this.center.lng = 121.593477781
        this.center.lat = 38.9487099383
        this.zoom = this.zoom
        let icon = new BMap.Icon(require("../../static/dilocal.png"),new BMap.Size(100,100),{
          imageSize:new BMap.Size(40,40),
          anchor: new BMap.Size(30,30)
        });
        //设置标注的经纬度
        var marker = new BMap.Marker(new BMap.Point(121.593477781,38.9487099383),{icon:icon});
        //把标注添加到地图上
        map.addOverlay(marker);
      }, getClickInfo(e) {
        console.log(e.point.lng)
        console.log(e.point.lat)
        this.center.lng = e.point.lng
        this.center.lat = e.point.lat
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
  .el-tabs__item{
    padding:0 70px !important;
  }
  .map{
    height: 27px;
    width: 27px;
    font-size: 14px;
  }
  .map:hover{
    cursor:pointer;
  }
  .mapbox{
    margin-right: 100px;
    margin-top: 30px;
    width: 100px;
    height: 400px;
  }
  .el-carousel__item h3 {
    color: #475669;
    font-size: 14px;
    opacity: 0.75;
    line-height: 200px;
    margin: 0;
  }
</style>
