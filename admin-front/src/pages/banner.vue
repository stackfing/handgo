<template>
    <div id='banner'>
        <head-top :titleItemtest='item'></head-top>
        <div id='content'>
            <el-table :data="tableData" border style="width: 100%;">
            <el-table-column prop="id" label="ID" width="180">
            </el-table-column>
            <el-table-column prop="photo" label="图片" width="180">
            </el-table-column>
            <el-table-column label="地址">
                <template slot-scope="scope">
                    <a :href='scope.row.url' target="_blank">{{scope.row.url}}</a>
                </template>
            </el-table-column>
        </el-table>
        </div>
    </div>
</template>

<script>
    import HeadTop from '@/components/HeadTop'
    export default {
        components: {
            HeadTop
            // Child
        },
        data() {
            return {
                item: [{
                    title: 'Banner',
                    path: '/commend'
                }],
                 tableData: []
            }
        },
        methods: {
            handleOpen(key, keyPath) {
                console.log(key, keyPath);
            },
            handleClose(key, keyPath) {
                console.log(key, keyPath);
            }
        },
        mounted() {
            this.$http.get('http://localhost:8888/v1/banner').then(res=>{
                this.tableData = res.body.data
            }).catch(res=>{
                
            })
        }
    }
</script>

<style scoped>
</style>