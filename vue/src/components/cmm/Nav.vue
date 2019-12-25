<template>
	<nav class="themoin-header">
		<div>
			<a class="logo">
				<img src="https://img.themoin.com/public/img/img-new-moin-logo.svg">
			</a>
			<div class="spacer"></div>
			<a class="menu">
				<div class="line1"></div>
				<div class="line2"></div>
			</a>
			<ul class="">
				<li><router-link to="/login">로그인</router-link></li>
				<li><router-link to="/join1">회원가입</router-link></li>
				<li class="mobile">
				<div class="themoin-language-dropdown" tabindex="0">
					<img class="ic-flag" src="https://img.themoin.com/public/img/ic-flag-ko.svg">
					<a> 한국어 </a>
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
				<a> 한국어 </a>
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
		</div>
	</nav>
</template>
<script>
export default{

}
</script>
<style scoped>

</style>