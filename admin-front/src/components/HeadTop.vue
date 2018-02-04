<template>
    <div>
        <div class="header_container">
        <el-breadcrumb separator-class="el-icon-arrow-right">
            <el-breadcrumb-item :to="{ path: '/' }">首页</el-breadcrumb-item>
            <!-- <el-breadcrumb-item>活动管理</el-breadcrumb-item>
            <el-breadcrumb-item>活动列表</el-breadcrumb-item>
            <el-breadcrumb-item>活动详情</el-breadcrumb-item> -->
            <el-breadcrumb-item v-for="item in titleItemtest">{{item.title}}</el-breadcrumb-item>
        </el-breadcrumb>
    </div>
    </div>
    
</template>

<script>
    export default {
        name: 'HeadTop',
        props: ['titleItemtest'],
    }
</script>

<style>
    * {
        margin: 0;
        padding: 0;
    }
    .el-header {
        padding: 0;
    }
    .header_container {
        background-color: #EFF2F7;
        height: 60px;
        display: flex;
        justify-content: space-between;
        align-items: center;
        padding-left: 20px;
    }
</style>