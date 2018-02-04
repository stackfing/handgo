<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <!-- 引入样式 -->
    <link rel="stylesheet" href="https://unpkg.com/element-ui/lib/theme-chalk/index.css">
    <style>
        * {
            margin: 0;
            padding: 0;
        }
    </style>
</head>

<body>
<div id="app">
    <el-table
            highlight-current-row="true"
            align="center"
            stripe
            border
            @selection-change="handleSelectionChange"
            :data="tableData"
            style="width: 100%">
        <el-table-column
                type="selection"
                width="55">
        </el-table-column>
        <el-table-column
                align="center"
                fixed
                prop="id"
                label="产品 ID">
            <#--<template slot-scope="scope">-->
                <#--<el-popover trigger="hover" placement="top">-->
                    <#--<p>图片地址: {{ scope.row.photo }}</p>-->
                    <#--&lt;#&ndash;<p>住址: {{ scope.row.address }}</p>&ndash;&gt;-->
                    <#--&lt;#&ndash;<div slot="reference" class="name-wrapper">&ndash;&gt;-->
                        <#--&lt;#&ndash;<el-tag size="medium">{{ scope.row.id }}</el-tag>&ndash;&gt;-->
                    <#--&lt;#&ndash;</div>&ndash;&gt;-->
                <#--</el-popover>-->
            <#--</template>-->
        </el-table-column>
        <el-table-column
                fixed
                prop="name"
                label="产品名">

        </el-table-column>
        <el-table-column
                fixed
                prop="currentPrice"
                label="现价">
        </el-table-column>
        <el-table-column
                fixed
                prop="stock"
                label="库存">
        </el-table-column>
        <el-table-column
                fixed
                prop="saleAmount"
                label="出售数量">
        </el-table-column>
        <el-table-column
                fixed
                prop="categoryId"
                label="分类 ID">

        </el-table-column>
        <el-table-column
                align="center"
                fixed
                prop="photos"
                label="图片">
            <template slot-scope="scope">
                <img :src="scope.row.photos" height="50" width="50">
            </template>
        </el-table-column>
        <el-table-column
                align="center"
                fixed
                prop="createTime"
                label="创建时间">
        </el-table-column>
        <el-table-column
                align="center"
                fixed
                prop="updateTime"
                label="更新时间">
        </el-table-column>
        <el-table-column
                align="center"
                fixed
                prop="status"
                label="状态">
        </el-table-column>
        <el-table-column label="操作">
            <template slot-scope="scope">
                <el-button
                        size="mini"
                        @click="handleEdit(scope.$index, scope.row)">编辑
                </el-button>
                <el-button
                        size="mini"
                        type="danger"
                        @click="handleDelete(scope.$index, scope.row)">删除
                </el-button>
            </template>
        </el-table-column>
    </el-table>
    <div style="margin-top: 50px">
        <el-pagination
                @size-change="handleSizeChange"
                @current-change="handleCurrentChange"
                background
                layout="prev, pager, next"
                :total="20">
        </el-pagination>
    </div>
</div>
</body>
<!-- 先引入 Vue -->
<script src="/static/js/vue.js"></script>
<script type="text/javascript" src="/static/js/vue-resource.js"></script>
<!-- 引入组件库 -->
<script src="https://unpkg.com/element-ui/lib/index.js"></script>
<script>
    var vue = new Vue({
        el: '#app',
        data: {
            tableData: []
        },
        created: function () {
            // this.$message('loading');
            this.$http.get('/v1/product?page=1&limit=10').then(response => {
                // console.log(response.bodyText);
                this.tableData = response.body.data;
            }, response => {

            })
        },
        methods: {
            handleSizeChange(val){
                console.log(val)
            },
            handleEdit (val,val1) {
                vue.$message('点击的 ID: ' + val1.id);
                console.log('点击的 ID: ' + val1.id)
            },
            handleDelete(index, val) {
                console.log(index)
            },
            handleCurrentChange(val) {
                console.log('当前页: ' + val);
                this.open4()
            },
            cli: function(row, column, cell, event){
                alert('asdfsadf')
            },
            handleSelectionChange(flag) {
                console.log(flag)
                console.log('asdf')
            },
            open4() {
                const h = this.$createElement;
                this.$msgbox({
                    title: '消息',
                    message: h('p', null, [
                        h('span', null, '内容可以是 '),
                        h('i', { style: 'color: teal' }, 'VNode')
                    ]),
                    showCancelButton: true,
                    confirmButtonText: '确定',
                    cancelButtonText: '取消',
                    beforeClose: (action, instance, done) => {
                        if (action === 'confirm') {
                            instance.confirmButtonLoading = true;
                            instance.confirmButtonText = '执行中...';
                            setTimeout(() => {
                                done();
                                setTimeout(() => {
                                    instance.confirmButtonLoading = false;
                                }, 300);
                            }, 3000);
                        } else {
                            done();
                        }
                    }
                }).then(action => {
                    this.$message({
                        type: 'info',
                        message: 'action: ' + action
                    });
                });
            },
            open3() {
                this.$prompt('请输入邮箱', '提示', {
                    confirmButtonText: '确定',
                    cancelButtonText: '取消',
                    inputPattern: /[\w!#$%&'*+/=?^_`{|}~-]+(?:\.[\w!#$%&'*+/=?^_`{|}~-]+)*@(?:[\w](?:[\w-]*[\w])?\.)+[\w](?:[\w-]*[\w])?/,
                    inputErrorMessage: '邮箱格式不正确'
                }).then(({ value }) => {
                    this.$message({
                        type: 'success',
                        message: '你的邮箱是: ' + value
                    });
                }).catch(() => {
                    this.$message({
                        type: 'info',
                        message: '取消输入'
                    });
                });
            }
        }
    })
</script>

</html>