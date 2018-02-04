<template>
  <el-menu default-active="1-1" class="el-menu-vertical-demo" @open="handleOpen" @close="handleClose" background-color="#545c64" text-color="#fff" active-text-color="#ffd04b" style="padding-top:60px">
    <el-submenu index="1">
      <template slot="title">
                <i class="el-icon-location"></i>
                <span>商城管理</span>
</template>
        <el-menu-item-group>
<template slot="title">
   产品
</template>
          
          <router-link to='product' tag='li'><el-menu-item index="1-1">产品</el-menu-item></router-link>
          <!-- <el-menu-item index="1-2">选项2</el-menu-item> -->
          <router-link to='category' tag='li'><el-menu-item index="1-2">分类</el-menu-item></router-link>
          <router-link to='kill' tag='li'><el-menu-item index="1-3">秒杀</el-menu-item></router-link>
          <!-- <router-link to='commend' tag='li'><el-menu-item index="1-4"></el-menu-item></router-link> -->
        </el-menu-item-group>
        <el-menu-item-group title="首页">
          <el-menu-item index="1-4">公告管理</el-menu-item>
        </el-menu-item-group>
        <el-submenu index="1-5">
<template slot="title">
   推荐管理
</template>
          <router-link to='banner' tag='li'><el-menu-item index="1-5-1">Banner</el-menu-item></router-link>
          <router-link to='banner' tag='li'><el-menu-item index="1-5-2">推荐产品</el-menu-item></router-link>
          <router-link to='banner' tag='li'><el-menu-item index="1-5-3">推荐分类</el-menu-item></router-link>
        </el-submenu>
      </el-submenu>
      <el-menu-item index="2">
        <i class="el-icon-menu"></i>
        <span slot="title">财务管理</span>
      </el-menu-item>
      <el-menu-item index="3">
        <i class="el-icon-setting"></i>
        <span slot="title">会员管理</span>
      </el-menu-item>
    </el-menu>
</template>

<script>
  import 'element-ui/lib/theme-chalk/display.css';
  export default {
    name: 'SideBar',
    data: function() {
      return {
        // index: 1,
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

<style scoped>
  #test {
    /* position:fixed; */
    height: 1000px;
    background-color: rgb(84, 92, 100);
  }
</style>
