<template>
	<div>
		<layout>
			<!-- slot은 template으로 바뀜 -->
			<template #header="header">
				<h1>{{header.title}}</h1>
				<ul class="menu">
					<li v-for="i of hmenu" :key="i.menu">
						<router-link :to="i.link">{{i.menu}}</router-link>
					</li>
				</ul>
			</template>
			<template #sidebar="sidebar">
				<h3>{{sidebar.title}}</h3>
				<ul class="menu">
					<li v-for="i of sidebars" :key="i.menu">
						<router-link :to="i.link">{{i.menu}}</router-link>
					</li>
				</ul>
			</template>
			<template #content="content">
				<h2>{{content.title}}</h2>
				<router-view/>
			</template>
			<template #footer="footer">
				<h3>{{footer.title}}</h3>
			</template>
		</layout>
	</div>
</template>
<script>
import Layout from "@/components/cmm/Layout.vue"
export default{
	components : {
		Layout
	},
	data(){
		return{
			hmenu :[ { menu : '로그인', link : '/login'},
					{ menu : '회원가입', link : '/join'} ],
					
			sidebars : [{ menu : "글쓰기", link : '/write' },
						{ menu : "목록", link : '/list' },
						{ menu : "글수정", link : '/update' },
						{ menu : "글삭제", link : '/remove' },
						{ menu : "검색", link : '/search' } ]
		}
	}
}
</script>  
<style scoped>
ul.menu {
    position:relative;
    padding: 5px 5px 5px 5px;
    list-style: none;
    font-style: italic;
}
ul.menu a {
    text-decoration:none;
}
</style>