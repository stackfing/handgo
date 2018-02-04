<template>
  <div id="app">
    <transition name='fade' mode="out-in">
      <router-view/>
    </transition>
  </div>
</template>

<script>
  export default {
    name: 'App',
    components: {
     
    }
  }
</script>

<style>
  * {
    margin: 0;
    padding: 0;
  }
  .el-container .is-vertical {
    padding: 0;
  }
  .el-main {
    padding: 0;
  }
  #sideBar {
    height: 100%;
    width: 300px;
    position: fixed;
  }
  #app {
    font-family: 'Avenir', Helvetica, Arial, sans-serif;
    -webkit-font-smoothing: antialiased;
    -moz-osx-font-smoothing: grayscale;
    /* text-align: center; */
    color: #2c3e50;
    /* margin-top: 60px; */
  }
  .fade-enter-active,
  .fade-leave-active {
    transition: all .2s ease;
  }
  .fade-enter,
  .fade-leave-active {
    opacity: 0;
  }
  #content{
    padding: 30px;
  }
</style>
