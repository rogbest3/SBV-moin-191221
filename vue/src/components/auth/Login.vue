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
									<input class="fs-block" placeholder="youremail@email.com" type="text" tabindex="0" value="">
								</div>
								<p class="moin-error"></p>
							</div>
							<div class="themoin-password-input moin-input-group password">
								<div class="moin-input">
									<label style="color: rgb(116, 127, 155);">비밀번호 (Password)</label>
									<input class="fs-block" placeholder="비밀번호를 입력해주세요." type="password" tabindex="0" maxlength="20" value="">
								</div>
								<p class="moin-error"></p>
							</div>
							<button class="btn-submit" type="submit" @click="login_btn">로그인</button>
						</form>
						<p style="margin: 30px auto;">
							<a>비밀번호를 잊어버리셨나요?</a>
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
		</div>
	</div>
</template>
<script>
export default{
	methods : {
		login_btn(){
			this.$router.push('/main2')
		},
		join2_btn(){
			this.$router.push('/join2')
		}
	}
}
</script>
<style scoped>
</style>