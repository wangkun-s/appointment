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
import admink from '../components/admink'
import doc from '../components/doc'
import medoc from '../components/medoc'
import jiaohao from '../components/jiaohao'
import workerinfo from '../components/maxadmink/workerinfo'
import yaopininfo from '../components/maxadmink/yaopininfo'
import keshiadmin from '../components/keshiadmin'
import future7doc from  '../components/keshiadmin/future7doc'
import future7yuyue from  '../components/keshiadmin/future7yuyue'
import usrlogin from '../components/usrlogin'
import workerlogin from '../components/workerlogin'
import  chufang from '../components/docm/chufang'
import jiaohaodoc from  '../components/docm/jiaohaodoc'
import nurse from '../components/nurse'
import doctor from '../components/doctor'
import doctors from '../components/doctors'
import hanzheng from '../components/keshixiangqing/hanzheng'
import kouqiangxiufu from '../components/keshixiangqing/kouqiangxiufu'
import zhongzhi from '../components/keshixiangqing/zhongzhi'
import yasui from '../components/keshixiangqing/yasui'
import nianmo from '../components/keshixiangqing/nianmo'
import zhengji from '../components/keshixiangqing/zhengji'
import mazui from '../components/keshixiangqing/mazui'
import zonghe from '../components/keshixiangqing/zonghe'
import hemian from '../components/keshixiangqing/hemian'
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
    {path:'/admink',name:'adminklink',redirect:'/workerinfo',component:admink,children:[
            {path:'/keshiinfp',name:'keshiinfolink',component:keshiinfo},
        {path:'/workerinfo',name:'workerinfolink',component:workerinfo},
        {path:'/yaopininfo',name:'yaopininfolink',component:yaopininfo},
      ]},
    {path:'/doc',name:'doclink',component:doc,redirect:'/jiaohaodoc',children:[
        {path:'/jiaohaodoc',name:'jiaohaodoclink',component:jiaohaodoc},
        {path:'/chufang',name:'chufanglink',component:chufang},
      ]},
    {path:'/medoc',name:'medoclink',component:medoc},
    {path:'/jiaohao',name:'jiaohaolink',component:jiaohao},
    {path:'/keshiadmin',name:'keshiadminlink',redirect:'/future7yuyue',component:keshiadmin,children:[
        {path:'/future7yuyue',name:'future7yuyuelink',component:future7yuyue},
        {path:'/future7doc',name:'future7doclink',component:future7doc},
      ]},
    {path:'/usrlogin',name:'usrloginlink',component:usrlogin},
    {path:'/workerlogin',name:'workerloginlink',component:workerlogin},
    {path:'/nurse',name:'nurselink',component:nurse},
    {
      path: '/doctor',
      name: 'doctor',
      component: doctor
    },
    {path:'/hanzheng',name:'hanzheng',component:hanzheng},
    {path:'/kouqiangxiufu',name:'kouqiangxiufu',component:kouqiangxiufu},
    {path:'/zhongzhi',name:'zhongzhi',component:zhongzhi},
    {path:'/yasui',name:'yasui',component:yasui},
    {path:'/nianmo',name:'nianmo',component:nianmo},
    {path:'/zhengji',name:'zhengji',component:zhengji},
    {path:'/hemian',name:'hemian',component:hemian},
    {path:'/mazui',name:'mazui',component:mazui},
    {path:'/zonghe',name:'zonghe',component:zonghe},
    {path:'/usermessage',name:'usermessage',component:usermessage},
    {path: '/usermessage', name: 'usermessage', redirect:'/page1', component: usermessage, children:[
        {path: '/page1', name: 'page1', component: page1},
        {path: '/page2', name: 'page2', component: page2},
        {path: '/page3', name: 'page3', component: page3},
        {path: '/page4', name: 'page4', component: page4},
        {path: '/page5', name: 'page5', component: page5},
        {path: '/page6', name: 'page5', component: page6},
      ]},


    {path: '*', redirect: '/'}, //如果用户输错路由，默认跳入主页




  ]
})
