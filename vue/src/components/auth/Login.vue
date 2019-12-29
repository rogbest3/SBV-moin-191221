<template>
	<div id="root">
		<div>
			<div class="themoin-login">
				<div>
					<div class="image-box">
						<img src="https://img.themoin.com/public/img/moin-logo.svg">
					</div>
				</div>
				<div>
					<div class="moin-login">
						<div class="newmoin-text-header">로그인</div>
						<form class="login" method="post" action="/a/v1/member/login">
							<div class="moin-input-group">
								<div class="moin-input">
									<label style="color: rgb(116, 127, 155);">이메일 (Email)</label>
									<input v-model="cemail" class="fs-block" placeholder="youremail@email.com" type="text" tabindex="0" value="">
								</div>
								<p class="moin-error"></p>
							</div>
							<div class="themoin-password-input moin-input-group password">
								<div class="moin-input">
									<label style="color: rgb(116, 127, 155);">비밀번호 (Password)</label>
									<input v-model="cpwd" class="fs-block" placeholder="비밀번호를 입력해주세요." type="password" tabindex="0" maxlength="20" value="">
								</div>
								<p class="moin-error"></p>
							</div>
							<button class="btn-submit" type="submit" @click.prevent="login_btn">로그인</button>
						</form>
						<p style="margin: 30px auto;">
							<a @click="pwd_rem">비밀번호를 잊어버리셨나요?</a>
						</p>
						<div class="divider"></div>
						<p class="or">or</p>
						<div class="buttons">
							<button @click="join2_btn">
								<img src="https://img.themoin.com/public/img/login-email.svg">
								<p class="newmoin-text-text-button">이메일로<br>시작하기</p>
							</button>
							<button>
								<img src="https://img.themoin.com/public/img/login-facebook-2.svg">
								<p class="newmoin-text-text-button">페이스북으로<br>시작하기</p>
							</button>
							<button>
								<img src="https://img.themoin.com/public/img/login-naver-2.svg">
								<p class="newmoin-text-text-button">네이버로<br>시작하기</p>
							</button>
						</div><br><br>
					</div>
				</div>
			</div>
			<div style="display:none"></div>
			<div id="popup-root" v-show="is_show">
				<div class="moin-popup">
					<div class="themoin-reset-password-popup">
						<div class="new-content">
							<a class="moin-close" @click="pwd_rem">
								<img src="https://img.themoin.com/public/img/btn-close.png">
							</a>
							<h1>비밀번호 재설정</h1>
							<p>비밀번호를 변경하고자 하는 아이디를 입력해주세요.</p>
							<form action="/a/v1/member/password/reset/link" method="POST">
								<div class="moin-input-group">
									<div class="moin-input">
										<label style="color: rgb(116, 127, 155);">이메일 (Email)</label>
										<input class="fs-block" placeholder="youremail@email.com" type="text" tabindex="0" value="">
									</div>
									<p class="moin-error"></p>
								</div>
								<input class="popup-btn" type="submit" value="비밀번호 재설정 링크 보내기">
							</form>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</template>
<script>
import axios from "axios"
import {store} from "../../store"
export default{
	data(){
		return {
			is_show : false,
			context : 'http://localhost:8080/',
			result : '',
			cemail : '',
			cpwd : '',
			customer : {} 	
		}
	},
	methods : {
		join2_btn(){
			this.$router.push('/join2')
		},
		pwd_rem(){
			this.is_show = !this.is_show
		},
		login_btn(){//
			// alert(`USERID : ${this.userid}, PASSWORD : ${this.passwd}`)
			
			let url = `${this.context}/login`
			let data = {
				cemail : this.cemail,
				cpwd : this.cpwd
			}
			let headers = {
				'authorization': 'JWT fefege..',	// local이라 test용으로 사용됨
				'Accept' : 'application/json',
				'Content-Type': 'application/json' }
			// let dest = ''
			axios
			.post(url, data, headers)
			.then(res=>{	// res.data => d
				// alert(`${res.data.result}`)
				if(res.data.result === "SUCCESS"){
					// alert(`로그인 성공 - result : ${res.data.person.userid}`)
					store.state.customer = res.data.customer
					store.state.authCheck = true
					alert(`cemail : ${store.state.customer.cemail}, cpwd : ${store.state.customer.cpwd}`)
					if(store.state.customer.role !== 'student'){
						store.state.sidebar = 'managerSidebar'
						this.$router.push({path : '/main2'})
					}else{
						store.state.sidebar = 'studentSidebar'
						this.$router.push({path : '/main2'})
					}
				
				}else{
					alert(`로그인 실패`)
					this.$router.push({path : '/login'})
				}
			})
			.catch(()=>{
				alert('AXIOS 실패')
			})

		}
	}
}
</script>
<style scoped>
</style>