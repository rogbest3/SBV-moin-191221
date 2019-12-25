<template>
  <div>
      <component :is="!loginCheck ? 'pre-auth' : 'post-auth'"></component>
  </div>
</template>

<script>
import PreAuth from "@/components/cmm/PreAuth.vue"
import PostAuth from "@/components/cmm/PostAuth.vue"
import {store} from "../store"
export default{
    components : {PreAuth, PostAuth},
    computed:{
        loginCheck: function(){
            return store.state.authCheck
        }
    }
}
</script>

<style scoped>
</style>
