<template>
<div id="root">
	<div>
		<nav class="themoin-header">
			<div>
				<a class="logo"><img src="https://img.themoin.com/public/img/img-new-moin-logo.svg"></a>
				<div class="spacer"></div>
				<a class="menu">
					<div class="line1"></div>
					<div class="line2"></div>
				</a>
				<ul class="">
					<li>
						<a>내 계정 관리</a>
					</li>
					<li>
						<a>로그아웃</a>
					</li>
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

		<div class="themoin-mypage">
			<div class="tab-container">
				<div class="tab">
					<a class="" @click.prevent="cusinfo_a">회원 정보</a>
					<a class="" @click.prevent="pwdchg_a">비밀번호 변경</a>
					<a class="" @click.prevent="authmgmt_a">인증관리</a>
					<a class="active" @click.prevent="alarm_a">알림설정</a>
					<a class="" @click.prevent="refmgmt_a">추천인 관리</a>
					<div class="spacer"></div>
					<img src="https://img.themoin.com/public/img/img-man-s.svg">
					<p>rogbest@naver.com</p>
				</div>
			</div>
			<div class="themoin-mypage-notification">
				<div class="content">
					<h1>알림 설정 안내</h1>
					<p>이벤트, 할인 소식 등 다양한 모인의 소식 및 알림을 받기 위한 설정을 할 수 있습니다.<br>송금 진행상황과 관련된 사항은 알림 동의 여부와 상관없이 발송됩니다.</p>
					<form action="/a/v1/member/update" method="post">
						<div class="form-row">
							<div>
								<div class="moin-input">
									<label style="color: rgb(116, 127, 155);">알림을 받을 이메일</label>
									<input disabled="" class="fs-block" type="text" tabindex="0" readonly="" value="rogbest@naver.com">
								</div>
								<p class="moin-error"></p>
							</div>
						</div>
						<div class="form-row">
							<div>
								<div class="moin-input">
									<label style="color: rgb(116, 127, 155);">알림을 받을 휴대전화번호</label>
									<input disabled="" class="fs-block" type="text" tabindex="0" readonly="" value="01042234683">
								</div>
								<p class="moin-error"></p>
							</div>
						</div>
						<div class="form-row">
							<div class="checkbox">
								<input type="checkbox">
								<span class="caption">위의 연락처로 이벤트, 할인 소식 등 다양한 모인의 소식 및 알림을 받겠습니다.</span>
							</div>
						</div>
						<div class="form-row submit-row">
							<div class="submit">
								<button class="account-send-btn" type="submit" tabindex="0">저장</button>
							</div>
						</div>
					</form>
				</div>
			</div>
		</div>

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
	</div>
</div>
</template>

<script>

export default {
	methods : {	// cusinfo_a, pwdchg_a, authmgmt_a, alarm_a, refmgmt_a
		
		cusinfo_a(){
			this.$router.push('/cusinfo')
		},
		pwdchg_a(){
			this.$router.push('/pwdchg')
		},
		authmgmt_a(){
			this.$router.push('/authmgmt')
		},
		alarm_a(){
			this.$router.push('/alarm')
		},
		refmgmt_a(){
			this.$router.push('/refmgmt')
		}
	}
}
</script>

<style scoped>
</style>
