import Vue from 'vue'
import Router from 'vue-router'
// import Home from '@/components/Home'
import Main1 from "@/components/Main1"
import Main2 from "@/components/main/Main2"
import Login from "@/components/auth/Login"
import Join1 from "@/components/auth/Join1"
import Join2 from "@/components/auth/Join2"
import AuthMgmt from "@/components/mypage/AuthMgmt"
import Alarm from "@/components/mypage/Alarm"
import CusInfo from "@/components/mypage/CusInfo"
import PwdChg from "@/components/mypage/PwdChg"
import RefMgmt from "@/components/mypage/RefMgmt"
import CusInfoChg from "@/components/mypage/CusInfoChg"
// import Mypage from "@/components/Mypage"
import Nav from "@/components/cmm/Nav"
import PostAuth from "@/components/cmm/PostAuth"

Vue.use(Router)

export default new Router({
	mode : 'history',
	routes : [ { path : '/', name : 'mai1', component : Main1 },
				{ path : '/nav', name : 'nav', component : Nav },
				// { path : '/mypage', name : 'mypage', component : Mypage },
				{ path : '/main2', name : 'main2', component : Main2 },
				{ path : '/login', name : 'login', component : Login },
				{ path : '/join1', name : 'join1', component : Join1 },
				{ path : '/join2', name : 'join2', component : Join2 },
				{ path : '/authmgmt', name : 'authmgmt', component : AuthMgmt },
				{ path : '/alarm', name : 'alarm', component : Alarm },
				{ path : '/cusinfo', name : 'cusinfo', component : CusInfo },
				{ path : '/cusinfochg', name : 'cusinfochg', component : CusInfoChg },
				{ path : '/pwdchg', name : 'pwdchg', component : PwdChg },
				{ path : '/refmgmt', name : 'refmgmt', component : RefMgmt },
				{ path : '/postAuth', name : 'postAuth', component : PostAuth }
				//	children : [ { path : '/main2', name : 'main2', component : Main2 } ] }
			]
})