<template>
    <div id="loginMain">
        <el-input v-model='username' ></el-input>
        <el-input v-model='password' type="password"></el-input>
        <el-button v-on:click="dologin">degnlu</el-button>
    </div>
</template>

<script>
    export default {
        data() {
            return {
                username: '',
                password: ''
            }
        },
        methods: {
            dologin() {
                if(this.username === 'a' && this.password === 'a') {
                    localStorage.setItem('username', 'username')
                    this.$router.replace('/home')
                }
               
            }
        }
    }
</script>

<style>
    #login {
        height: 100%;
        width: 100%;
        background-color: #2d3a4b;
    }
    body {
        background-color: rgb(250, 250, 250);
    }
    #loginMain {
        margin: 0 auto;
        width: 300px;
        min-height: 300px;
        margin-top: 300px;
        background-color: white;
    }
</style>