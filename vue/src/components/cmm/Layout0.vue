<template>
	<div id="wrapper">
		<header>
			<slot name="header" :title="headerTitle"></slot>
		</header>
		<!-- 시멘틱 -->
		<aside id="sidebar">
			<slot name="sidebar" :title="sidebarTitle"></slot>
		</aside>
		<section id="content">
               <div>
                    <slot name="content" :title="contentTitle"></slot>
               </div>
		</section>
		<footer>
			<slot name="footer" :title="footerTitle"></slot>
		</footer>
	</div>
</template>
<script>
export default{
	data(){
		return {
			headerTitle : '머리글 제목',
			sidebarTitle : '사이드바 제목',
			contentTitle : '내용 제목',
			footerTitle : '바닥글 제목'
		}
	}
}
</script>
<style scoped>
/* 전체 구조 */
#wrapper {
     padding: 5px;
     width: 960px;
     margin: 20px auto;
}
header {
     height: 100px;
     padding: 0 15px;
}
#content {
     width: 696px;
     float: left;
     padding: 5px 15px;
    min-height: 300px;
}
#sidebar {
     width: 200px;
     padding: 5px 15px;
     float: left;
}
footer {
     clear: both;
     padding: 0 15px;
}
/* 가로폭 980보다 작을 때 사용할 @media query */
@media screen and (max-width: 980px) {     
     #wrapper {
           width: 94%;
     }
     #content {
           clear: both;
           padding: 1% 4%;
           width: auto;
           float: none;
     }
     #sidebar {
           clear: both;
           padding: 1% 4%;
           width: auto;
           float: none;
     }
     header, footer {
           padding: 1% 4%;
     }
}
/* 공통 */
#content {
     background: #f8f8f8;
}
#sidebar {
     background: #f0efef;
}
header, #content, #middle, #sidebar {
     margin-bottom: 5px;
}
#wrapper, header, #content, #middle, #sidebar, footer {
     border: solid 1px #ccc;
}
</style>