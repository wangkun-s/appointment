// The Vue build version to load with the `import` command
// (runtime-only or standalone) has been set in webpack.base.conf with an alias.
import Vue from 'vue'
import App from './App'
import router from './router'
import  BaiduMap from 'vue-baidu-map'
import VModal from 'vue-js-modal'
import ElementUI from 'element-ui'
import 'element-ui/lib/theme-chalk/index.css'
import axios from 'axios'
import message from "@/components/myMsg/index"


Vue.use(message.register);
Vue.use(ElementUI)
Vue.config.productionTip = false
Vue.prototype.$axios = axios;

Vue.use(BaiduMap,{
  ak:'zYt5bpYICAzLDolibzurWW41sGU8TqGk'
});

Vue.use(VModal, {
  dialog: true,
  dynamic: true
})
/* eslint-disable no-new */
new Vue({
  el: '#app',
  router,
  components: { App },
  template: '<App/>'
})
