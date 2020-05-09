import Vue from 'vue'
import Router from 'vue-router'
import home from '../components/home'
import survey from '../components/survey'
import surveys from '../components/survey-s'
import newss from  '../components/news-s'
import keshis from '../components/keshi-s'
import appointment from '../components/appointment'
import appointmentmain from '../components/appointmentmain'
import register from '../components/register'
import login from '../components/login'
import usrlogin from '../components/usrlogin'
import workerlogin from '../components/workerlogin'
import doctors from '../components/doctors'
import keshiinfo from '../components/keshiinfo'
import doctorinfo from '../components/doctorinfo'
import chain from '../components/chain'
import shenyang from '../components/otherarea/shenyang'
import dalian from '../components/otherarea/dalian'
import anshan from '../components/otherarea/anshan'
import jinzhou from '../components/otherarea/jinzhou'
import tieling from '../components/otherarea/tieling'
import usermessage from '../components/usermessage'
import page1 from '../components/usermessage/page1'
import page2 from '../components/usermessage/page2'
import page3 from '../components/usermessage/page3'
import page4 from '../components/usermessage/page4'
import page5 from '../components/usermessage/page5'
import page6 from '../components/usermessage/page6'
import page01 from '../components/adminmessage/page01'
import page02 from '../components/adminmessage/page02'
import page03 from '../components/adminmessage/page03'
import page04 from '../components/adminmessage/page04'
import page21 from '../components/doctormessage/page21'
import page22 from '../components/doctormessage/page22'
import page23 from '../components/doctormessage/page23'
import page24 from '../components/doctormessage/page24'
import page25 from '../components/doctormessage/page25'
import page26 from '../components/doctormessage/page26'
import time from '../components/time'
import detaile from  '../components/detaile'
import  forgetPassword from '../components/forgetPassword'



Vue.use(Router);

export default new Router({
  routes: [

    {path:'/',name:'homelink',redirect:'/doctors',component:home,children:[
        {path:'/newss',name:'newsslink',component:newss},
        {path:'/keshis',name:'keshislink',component:keshis},
        {path:'/surveys',name:'surveyslink',component:surveys},
        {path:'/doctors',name:'doctorslink',component:doctors}
      ]},
    {path:'/chain',name:'chainlink',component:chain},
    {path:'/dalian',name:'dalian',component:dalian},
    {path:'/shenyang',name:'shenyang',component:shenyang},
    {path:'/anshan',name:'anshan',component:anshan},
    {path:'/jinzhou',name:'jinzhou',component:jinzhou},
    {path:'/tieling',name:'tieling',component:tieling},

    {path:'/survey',name:'surveylink',component:survey},
    {path:'/keshiinfo',name:'keshiinfolink',component:keshiinfo},
    {path:'/doctorinfo',name:'doctorinfolink',component:doctorinfo},
    {path:'/appointment',name:'appointmentlink',component:appointment},
    {path:'/appointmentmain',name:'appointmentmainlink',component:appointmentmain,
      // beforeEnter:(to,from,next)=>{
      //   // 路由独享
      //   alert("您还没有登陆，不能使用此功能");
      //   next(false )
      //   // 判断
      //   store.gettes.isLogin ===false
      //   if(to.path =='/login' || to.path == '/patient'){
      //     next();
      //   }else {
      //     alert("还没有登陆，请先登陆！");
      //     next('/login');
      //   }
      // }
     },
    {path:'/patient',name:'registerlink',component:register},
    {path:'/login',name:'loginlink',component:login},
    {path:'/usrlogin',name:'usrloginlink',component:usrlogin},
    {path:'/workerlogin',name:'workerloginlink',component:workerlogin},
    {path:'/detaile',name:'detaile',component:detaile},
    {path:'/usermessage',name:'usermessage',component:usermessage},
    {path: '/usermessage', name: 'usermessage',component: usermessage, children:[
        {path: '/page1', name: 'page1', component: page1},
        {path: '/page2', name: 'page2', component: page2},
        {path: '/page3', name: 'page3', component: page3},
        {path: '/page4', name: 'page4', component: page4},
        {path: '/page5', name: 'page5', component: page5},
        {path: '/page6', name: 'page5', component: page6},
        {path: '/page01', name: 'page01', component: page01},
        {path: '/page02', name: 'page02', component: page02},
        {path: '/page03', name: 'page03', component: page03},
        {path: '/page04', name: 'page04', component: page04},
        {path: '/page21', name: 'page21', component: page21},
        {path: '/page22', name: 'page22', component: page22},
        {path: '/page23', name: 'page23', component: page23},
        {path: '/page24', name: 'page24', component: page24},
        {path: '/page25', name: 'page25', component: page25},
        {path: '/page26', name: 'page26', component: page26},
      ]},
    {path:'/timelink',name:'timelink',component:time},
    {path:'/forgetPassword',name:'forgetPassword',component:forgetPassword},



    {path: '*', redirect: '/'}, //如果用户输错路由，默认跳入主页




  ]
})
