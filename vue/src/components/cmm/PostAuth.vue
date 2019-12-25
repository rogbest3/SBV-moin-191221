<template>
  <div>
		<layout>
			<!-- slot은 template으로 바뀜 -->
			<template #header="header">
				<nav class="themoin-header">
					<div>
						<a class="logo"><img src="https://img.themoin.com/public/img/img-new-moin-logo.svg"></a>
						<div class="spacer"></div>
						<a class="menu">
							<div class="line1"></div>
							<div class="line2"></div>
						</a>
						<ul class="">
							<li><router-link to="/cusinfo">내 계정 관리</router-link></li>
							<li><a @click.prevent="logout">로그아웃</a></li>
							<li><a @click.prevent="withdrawal">회원탈퇴</a></li>
							<li class="mobile">
								<div class="themoin-language-dropdown" tabindex="0">
									<img class="ic-flag" src="https://img.themoin.com/public/img/ic-flag-ko.svg">
									<a> <!-- -->한국어<!-- --> </a>
									<img class="btn-open-list-blue" src="https://img.themoin.com/public/img/btn-open-list-blue.svg">
									<ul>
										<li>
											<div class="spacer"></div>
											<a><img src="https://img.themoin.com/public/img/ic-flag-ko.svg">한국어</a>
										</li>
										<li>
											<div class="spacer"></div>
											<a><img src="https://img.themoin.com/public/img/ic-flag-en.svg">English</a>
										</li>
									</ul>
								</div>
							</li>
						</ul>
						<div class="language">
							<div class="themoin-language-dropdown" tabindex="0">
								<img class="ic-flag" src="https://img.themoin.com/public/img/ic-flag-ko.svg">
								<a> <!-- -->한국어<!-- --> </a>
								<img class="btn-open-list-blue" src="https://img.themoin.com/public/img/btn-open-list-blue.svg">
								<ul>
									<li>
										<div class="spacer"></div>
										<a><img src="https://img.themoin.com/public/img/ic-flag-ko.svg">한국어</a>
									</li>
									<li>
										<div class="spacer"></div>
										<a><img src="https://img.themoin.com/public/img/ic-flag-en.svg">English</a>
									</li>
								</ul>
							</div>
						</div>
						<div class="notification">
							<button>
								<img src="https://img.themoin.com/public/img/noticenter-icon.svg">
								<span class="">0</span>
							</button>
						</div>
					</div>
				</nav>		
			</template>
			<template #sidebar="sidebar">
				<!-- <h3>{{sidebar.title}}</h3>
				<ul class="menu">
					<li v-for="i of sidebars" :key="i.menu">
						<router-link :to="i.link">{{i.menu}}</router-link>
					</li>
				</ul> -->
			</template>
			<template #content="content">
				<router-view/>
			</template>
			<template #footer="footer">
				<div class="themoin-footer">
					<div>
						<div class="section top">
							<div class="contact">
								<h3>언어별 고객 센터</h3>
								<h3 class="phone ko">한국어<!-- --> <br> 02-2088-1583 / 070-5089-2017</h3>
								<p><span>평일 : 09:00 ~ 19:00 (주말/공휴일 휴무)</span><br>팩스 : 0504-393-9687<br>이메일 : support@themoin.com<br>카카오톡 플러스친구 : @모인 MOIN</p>
								<h3 class="phone np">नेपाली<!-- --> <br> 070-4367-0297</h3>
								<p><span>Weekday : 12:45 ~ 21:45</span><br>email : support_nepal@themoin.com</p>
								<h3 class="business">비즈니스 및 제휴 문의 <br> 070-4367-0113</h3>
							</div>
							<div class="spacer"></div>
							<div class="social">
								<h3 class="desktop">Follow Us</h3>
								<a href="https://www.facebook.com/moincompany" target="new">
									<img src="https://img.themoin.com/public/img/btn-facebook.svg">
									<span class="desktop">모인 페이스북 페이지</span>
								</a>
								<a href="http://blog.naver.com/moin_company" target="new">
									<img src="https://img.themoin.com/public/img/btn-blog.svg">
									<span class="desktop">모인 네이버 블로그</span>
								</a>
								<a href="https://plus.kakao.com/home/ne7qlhac" target="new">
									<img src="https://img.themoin.com/public/img/btn-kakaotalk.svg">
									<span class="desktop">모인 카카오톡 플러스친구</span>
								</a>
							</div>
							<div class="spacer"></div>
							<div class="links">
								<h3 class="desktop">Company</h3>
								<a class="caption">회사 소개</a>
								<a class="caption">서비스 소개</a>
								<a class="caption">이용약관</a>
								<a class="caption">개인정보 취급방침</a>
								<a class="caption">F A Q</a>
								<a class="caption">공지사항</a>
								<h3 class="event-univ">학생 및 기관 할인</h3>
								<a class="caption">학생 및 기관 할인등록 페이지</a>
							</div>
						</div>
						<div class="section bottom">
							<div class="company">
								<img src="https://img.themoin.com/public/img/footer-logo-2.svg">
								<p>(주)모인 | 대표이사 : 서일석 | 사업자등록번호 : 636-81-00400<br>소액해외송금업 등록번호 : 2018-2<br>주소 : 서울시 서초구 서초대로 78길 22 홍우2빌딩 613호<br>© 2016 MOIN, Inc. All Rights Reserved.</p>
							</div>
							<div class="spacer"></div>
						</div>
					</div>
				</div>
				<div style="display:none"></div>				
			</template>
		</layout>
	</div>
</template>

<script>
import Layout from "@/components/cmm/Layout.vue"
import {store} from "../../store"
import Axios from 'axios'
export default{
	components : {
		Layout
	},
	data(){
		return {
			cname : store.state.customer.cname,
			context : 'http://localhost:8080/'
		}
	},
	methods : {
		logout(){
			store.state.customer.cemail = ''
			store.state.customer.cpwd = ''
			store.state.customer.cname = ''
			store.state.customer.cphone = ''
			store.state.customer.id = ''
			store.state.authCheck = false
			alert(`loginedCemail : ${store.state.customer.cemail}, loginedCpwd : ${store.state.customer.cpwd}`)
			this.$router.push('/')
		},
		withdrawal(){	// 자바에 정보가 하나도 없기 때문에 정보를 전부 줘야함 -> POST 사용
			alert('회원탈퇴')
			
			Axios
			.delete(`${this.context}/withdrawal/${store.state.customer.cemail}`)
			.then(()=>{
				alert(`회원탈퇴 성공`)
				store.state.authCheck = false
				this.$router.push('/')
			})
			.catch(()=>{
				alert('AXIOS 실패')
			})
			
		}
	}
}
</script>