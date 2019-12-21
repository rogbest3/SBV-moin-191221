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
                      <a class="">회원 정보</a>
                      <a class="">비밀번호 변경</a>
                      <a class="active">인증관리</a>
                      <a class="">알림설정</a>
                      <a class="">추천인 관리</a>
                      <div class="spacer"></div>
                      <img src="https://img.themoin.com/public/img/img-man-s.svg">
                      <p>rogbest@naver.com</p>
                  </div>
              </div>
              <div><br>
                  <h1>인증관리</h1><br>
                  <div class="themoin-info-preview">
                      <div class="head">신분증 관리</div>
                      <ol>
                          <li>
                              <p>분류</p>
                              <p class="fs-block">한국인/개인사업자</p>
                          </li>
                          <li>
                              <p>인증상태</p>
                              <p class="fs-block">인증완료</p>
                          </li>
                          <li class="control">
                              <button disabled="">인증됨</button>
                          </li>
                      </ol>
                      <div class="head">계좌인증관리</div>
                      <ol>
                          <li class="sub-title">자동출금 인증</li>
                          <li>
                              <p>계좌번호</p>
                              <p class="fs-block">자동출금 인증을 해주세요.</p>
                          </li>
                          <li>
                              <p>인증상태</p>
                              <p class="fs-block"></p>
                          </li>
                          <li class="control">
                              <button>인증하기</button>
                          </li>
                          <li class="sub-title">계좌이체 인증</li>
                          <li>
                              <p>계좌번호</p>
                              <p class="fs-block">기업은행 23210816702025</p>
                          </li>
                          <li>
                              <p>인증상태</p>
                              <p class="fs-block">인증완료</p>
                          </li>
                          <li class="control">
                              <button disabled="">인증됨</button>
                          </li>
                      </ol>
                      <div class="head">발급된 가상계좌</div>
                      <ol>
                          <li>
                              <p>계좌번호</p>
                              <p class="fs-block">광주은행 9427010261003 김민국_모인</p>
                          </li>
                          <li class="control">
                              <button class="text">가상계좌복사하기</button>
                          </li>
                      </ol>
                  </div>
                  <p class="warning">계좌이체는 계좌변경이 불가능 합니다. 인증계좌 변경 희망시 홈페이지 1:1문의하기로 연락주세요.</p><br><br>
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

}
</script>

<style scoped>
</style>
