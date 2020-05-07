<template>
  <el-dialog
    title="提示"
    :visible.sync="dialogVisible"
    width="30%"
    :before-close="handleClose">
    <span>确定退出吗?</span>
    <span slot="footer" class="dialog-footer">
    <el-button @click="dialogVisible = false">取 消</el-button>
    <el-button type="primary" @click="quit">确 定</el-button>
  </span>
  </el-dialog>

</template>

<script>
  export default {
    data() {
      return {
        dialogVisible: true,
      };
    },
    methods: {
      handleClose(done) {
        this.$confirm('确认关闭？')
          .then(_ => {
            done();
          })
          .catch(_ => {});
      },
      quit(){
        window.sessionStorage.removeItem("state");
        window.sessionStorage.removeItem("identity");
        window.sessionStorage.removeItem("idcard");
        window.sessionStorage.removeItem("id");
        this.$myMsg.notify({
          content: "退出成功",
          type: 'success',
        })
        setTimeout(() => {
          this.$router.push('/home')
          location.reload();
        }, 1400)
      }
    }
  };
</script>
