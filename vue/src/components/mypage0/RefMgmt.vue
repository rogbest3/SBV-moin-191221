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
					<a class="" @click.prevent="alarm_a">알림설정</a>
					<a class="active" @click.prevent="refmgmt_a">추천인 관리</a>
					<div class="spacer"></div>
					<img src="https://img.themoin.com/public/img/img-man-s.svg">
					<p>rogbest@naver.com</p>
				</div>
			</div>
			<div class="themoin-mypage-refer">
				<div class="content">
					<h1>나의 추천인 코드</h1>
					<p>1. 친구에게 추천코드를 알려준다.(무제한으로 가능)<br>2. 친구가 가입시 추천코드를 넣고 첫 송금 완료시, 수수료 감면 쿠폰을 받는다.</p><br><br>
					<p class="fs-block">FNO9W</p>
					<input type="text" value="FNO9W" style="opacity: 0; height: 0px;">
					<form>
						<div class="form-row submit-row">
							<div class="submit" style="margin-top: 0px;">
								<button class="account-send-btn" type="submit" tabindex="0">추천인 코드 복사하기</button>
							</div>
						</div>
						<br>
						<p style="padding: 0px 10px;">- 모인을 사용해 본 이력이 없는 사용자만 추천코드를 등록할 수 있습니다.<br>- 본인이 본인을 추천한 경우 리워드로 지급된 쿠폰 사용이 불가합니다.<br>- 친구 추천 이벤트는 사전에 통지 없이 변경 또는 중지 될 수 있습니다.</p>
					</form>
					<div class="horizontal-divider"></div>
					<h1>추천인 등록</h1>
					<p>추천인 코드를 등록해 모인 해외송금 시 수수료 혜택을 받아보세요!<br>첫 송금 완료시 수수료 감면 쿠폰이 발급되며, 추천인에게는 감사쿠폰이 발급됩니다.<br>추천인 코드는 첫 송금전 단, 1회 등록할 수 있습니다. </p>
					<form action="/a/v1/member/update" method="post">
						<div class="form-row">
							<div class="code">
								<div class="moin-input">
									<label style="color: rgb(116, 127, 155);">추천인 코드</label>
									<input class="fs-block" placeholder="영문 숫자 조합 5자" type="text" tabindex="0" maxlength="5" value="">
								</div>
								<p class="moin-error"></p>
							</div>
						</div>
						<div class="form-row submit-row">
							<div class="submit">
								<button class="account-send-btn" type="submit" tabindex="0">확인</button>
							</div>
						</div>
						<br>
						<p style="padding: 0px 10px;">- 모인을 사용해 본 이력이 없는 사용자를 추천할 경우에만 리워드가 지급됩니다.<br>- 제휴업체 추천코드와 추천인 코드 중복 사용은 불가능합니다.<br>- 본인이 본인을 추천한 경우 리워드로 지급된 쿠폰사용이 불가합니다.<br>- 친구 추천 이벤트는 사전에 통지 없이 변경 또는 중지 될 수 있습니다.</p>
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
