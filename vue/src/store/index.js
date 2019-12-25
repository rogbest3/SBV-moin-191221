import Vue from 'vue'
import Vuex from 'vuex'	// Vuex - 생성자 함수
//import axios from 'axios'

Vue.use(Vuex)

export const store = new Vuex.Store({
  state: {
    customer : {},
    authCheck : false
    /* loginedCemail : '',
    loginedCpwd : '',
    id : '',
    cname : '',
    cphone : '',
    sdate : '',
    gender : '',
    hak : '',
    ban : '',
    score : '' */
  }
})