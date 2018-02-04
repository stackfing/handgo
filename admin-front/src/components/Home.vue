<template>
    <div id="home">
        <side-bar id="sideBar" />
        <div style="padding-left:300px">
            <head-nav/>
            <tabs/>
            <!-- <welcome/> -->
            <transition name='fade' mode="out-in">
                <router-view/>
            </transition>
        </div>
    </div>
</template>

<script>
    import sideBar from '@/components/SideBar'
    import headNav from '@/components/HeadNavBar'
  export default {
    name: 'home',
    components: {
        sideBar,
        headNav
    },
    data: function() {
      return {
        index: 0,
        title: '你好'
      }
    },
    methods: {
      handleOpen(key, keyPath) {
        console.log(key, keyPath);
      },
      handleClose(key, keyPath) {
        console.log(key, keyPath);
      }
    }
  }
</script>