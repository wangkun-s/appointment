<template>
  <div class="card text-dark bg-light ">
    <div class="card-header">医生列表</div>
    <div style="margin-top: 5px" class="card-body">
      <el-tabs v-model="activeName" @tab-click="handleClick">
        <el-tab-pane label="按疾病找专家" name="first">
          <template>
            <el-table
              :data="tableData"
              style="width: 100%">
              <el-table-column
                prop="jibing"
                width="180">
              </el-table-column>
                <el-table-column
                  width="180">
                  <template slot-scope="scope">
                    <a :href="'/#/'+scope.row.mingcheng+'?name='+scope.row.name1" class="buttonText">{{scope.row.name1}}</a>
                  </template>
                </el-table-column>
              <el-table-column
                width="180">
                <template slot-scope="scope">
                  <a :href="'/#/'+scope.row.mingcheng+'?name='+scope.row.name2" class="buttonText">{{scope.row.name2}}</a>
                </template>
              </el-table-column>
              <el-table-column
                width="180">
                <template slot-scope="scope">
                  <a :href="'/#/'+scope.row.mingcheng+'?name='+scope.row.name3" class="buttonText">{{scope.row.name3}}</a>
                </template>
              </el-table-column>
              <el-table-column
                width="180">
                <template slot-scope="scope">
                  <a :href="'/#/'+scope.row.mingcheng+'?name='+scope.row.name4" class="buttonText">{{scope.row.name4}}</a>
                </template>
              </el-table-column>
            </el-table>
            <el-button type="primary" style="width: 825px" plain @click="doctorinfo">全部疾病推荐专家详情-->></el-button>
          </template>
        </el-tab-pane>
        <el-tab-pane label="按科室找专家" name="second">
          <template>
            <el-table
              :data="tableData1"
              style="width: 100%">
              <el-table-column
                prop="keshi"
                width="180">
              </el-table-column>
              <el-table-column
                width="180">
                <template slot-scope="scope">
                  <a :href="'/#/'+scope.row.mingcheng+'?name='+scope.row.name1" class="buttonText">{{scope.row.name1}}</a>
                </template>
              </el-table-column>
              <el-table-column
                width="180">
                <template slot-scope="scope">
                  <a :href="'/#/'+scope.row.mingcheng+'?name='+scope.row.name2" class="buttonText">{{scope.row.name2}}</a>
                </template>
              </el-table-column>
              <el-table-column
                width="180">
                <template slot-scope="scope">
                  <a :href="'/#/'+scope.row.mingcheng+'?name='+scope.row.name3" class="buttonText">{{scope.row.name3}}</a>
                </template>
              </el-table-column>
              <el-table-column
                width="180">
                <template slot-scope="scope">
                  <a :href="'/#/'+scope.row.mingcheng+'?name='+scope.row.name4" class="buttonText">{{scope.row.name4}}</a>
                </template>
              </el-table-column>
            </el-table>
            <el-button type="primary" style="width: 825px" plain @click="doctorinfo">全部科室推荐专家详情-->></el-button>
          </template>
        </el-tab-pane>
      </el-tabs>
    </div>
  </div>
</template>

<script>
  export default {
    name: "doctors",
  data() {
    return {
      activeName: 'first',
      tableData: [{
        mingcheng: 'zhengji',
        jibing: '牙齿畸形',
        name1: '戚琳',
        name2: '王式安',
        name3: '于滨',
        name4: '赵震锦',
      }, {
        mingcheng: 'hemian',
        jibing: '颌面',
        name1: '陈念铮',
        name2: '丁润松',
        name3: '应方淦',
        name4: '钱亦春',
      }, {
        mingcheng: 'nianmo',
        jibing: '牙周病',
        name1: '陈梦莹',
        name2: '章文瑾',
        name3: '田文静',
        name4: '伍晓明',
      }, {
        mingcheng: 'yasui',
        jibing: '牙髓病',
        name1: '吴子丹',
        name2: '张俊峰',
        name3: '耿晓峰',
        name4: '曹文娟',
      }, {
        mingcheng:'kouqiangxiufu',
        jibing: '口腔修复',
        name1: '秦志聆',
        name2: '霍秀琴',
        name3: '堵孝华',
        name4: '孙慧琴',
      }],
      tableData1:[{
        mingcheng:'hemian',
        keshi: '口腔颌面外科',
        name1: '陈念铮',
        name2: '丁润松',
        name3: '钱亦春',
        name4: '应方淦',
      }, {
        mingcheng:'zhengji',
        keshi: '口腔正畸科',
        name1: '陈道欢',
        name2: '何莉芳',
        name3: '史琼芳',
        name4: '李俊彦',
      }, {
        mingcheng:'yasui',
        keshi: '牙体牙髓科',
        name1: '雷大为',
        name2: '傅世琼',
        name3: '张海滨',
        name4: '韩春樑',
      }, {
        mingcheng: 'nianmo',
        keshi: '牙周粘膜病科  ',
        name1: '赵凯歌',
        name2: '李晓芳',
        name3: '李培君',
        name4: '宋晶晶',
      }, {
        mingcheng:'kouqiangxiufu',
        keshi: '口腔修复科',
        name1: '陶晓晶',
        name2: '孙慧琴',
        name3: '堵孝华',
        name4: '霍秀琴',
      }]
    };
  },
  methods: {
    handleClick(tab, event) {
      console.log(tab, event);
    },
    doctorinfo(){
      this.$router.push('/doctorinfo');
        // chrome
        document.body.scrollTop = 0;
      // firefox
      document.documentElement.scrollTop = 0;
      // safari
      window.pageYOffset = 0;
    }
  }
  }
</script>

<style scoped>
  a{
    color: black;
  }
  a:hover{
    text-decoration:none;
    color: dodgerblue;

  }
</style>
