<template>
	<div>
		학생들 목록<br>
		반 : <input type="text" v-model="number" />
		<button @click.prevent="hak_btn">출력</button>
		<table class="table">
			<tr>
				<th>아이디</th>
				<th>이메일</th>
				<th>비번</th>
				<th>이름</th>
				<th>폰 번호</th>
				<th>생일</th>
				<th>성별</th>
				<th>학년</th>
				<th>반</th>
				<th>성적</th>
				<th>역할</th>
			</tr>
			<tr v-for="(j, i) of list" :key="j.id">
				<td>{{i+1}}</td>
				<td>{{j.cemail}}</td>
				<td>{{j.cpwd}}</td>
				<td>{{j.cname}}</td>
				<td>{{j.cphone}}</td>
				<td>{{j.sdate}}</td>
				<td>{{j.gender}}</td>
				<td>{{j.hak}}</td>
				<td>{{j.ban}}</td>
				<td>{{j.score}}</td>
				<td>{{j.role}}</td>
			</tr>
		</table>
	</div>
</template>
<script>
import axios from "axios"
export default {
	data(){
		return {
			context : 'http://localhost:8080/',
			list : [],
			number : ''
		}
	},
	methods : {
		hak_btn(){
			axios
			.get(`${this.context}/ban/${this.number}`)
			.then(res=>{
				this.list = res.data
			})
			.catch(()=>{
				alert('AXIOS 실패')
			})	
		}	
	}
}
</script>
<style scoped>
.table{ border : 1px solid black }
.table tr{ border : 1px solid black }
.table tr th{ border : 1px solid black }
.table tr td{ border : 1px solid black }
</style>