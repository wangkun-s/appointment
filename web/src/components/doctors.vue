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
        name1: '侯志明',
        name2: '刘奕',
        name3: '戚琳',
        name4: '赵震锦',
      }, {
        mingcheng: 'hemian',
        jibing: '颌面',
        name1: '春娇',
        name2: '徐中飞',
        name3: '刘强',
        name4: '赵南震',
      }, {
        mingcheng: 'nianmo',
        jibing: '牙周病',
        name1: '王文军',
        name2: '赵戬',
        name3: '张扬',
        name4: '唐晓琳',
      }, {
        mingcheng: 'yasui',
        jibing: '牙髓病',
        name1: '于静涛',
        name2: '薛明',
        name3: '仇丽鸿',
        name4: '邵丽娜',
      }, {
        mingcheng:'kouqiangxiufu',
        jibing: '口腔修复',
        name1: '闫雪松',
        name2: '李语晶',
        name3: '郝玉全',
        name4: '李秉鸿',
      }],
      tableData1:[{
        mingcheng:'hemian',
        keshi: '口腔颌面外科',
        name1: '方敏敏',
        name2: '周韦滨',
        name3: '朱军',
        name4: '赵南震',
      }, {
        mingcheng:'zhengji',
        keshi: '口腔正畸科',
        name1: '戚琳',
        name2: '赵震锦',
        name3: '于滨',
        name4: '王式安',
      }, {
        mingcheng:'yasui',
        keshi: '牙体牙髓科',
        name1: '周彩滨',
        name2: '邵丽娜',
        name3: '李伟',
        name4: '张晓丽',
      }, {
        mingcheng: 'nianmo',
        keshi: '牙周粘膜病科  ',
        name1: '林莉',
        name2: '寇育荣',
        name3: '唐晓琳',
        name4: '赵戬',
      }, {
        mingcheng:'kouqiangxiufu',
        keshi: '口腔修复科',
        name1: '杭晓东',
        name2: '包扬',
        name3: '艾红军',
        name4: '周依',
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
