<template>
    <div>
        <head-top :titleItemtest='item'></head-top>
        <div id="content">
            <el-input placeholder="输入关键字进行过滤" v-model="filterText">
            </el-input>
            <el-tree class="filter-tree" v-loading="loading" @node-click="handleNodeClick" :data="data2" :props="defaultProps" :filter-node-method="filterNode" ref="tree2">
            </el-tree>
        </div>
    </div>
</template>

<script>
    import HeadTop from '@/components/HeadTop'
    import Child from '@/components/Child'
    export default {
        components: {
            HeadTop,
            Child
        },
        data() {
            return {
                loading: false,
                item: [{
                    title: '分类',
                    path: '/category'
                }],
                filterText: '',
                data2: [{
                    id: 1,
                    label: '一级 1',
                    children: [{
                        id: 4,
                        label: '二级 1-1',
                        children: [{
                            id: 9,
                            label: '啊'
                        }, {
                            id: 10,
                            label: '三级 1-1-2'
                        }]
                    }]
                }, {
                    id: 2,
                    label: '一级 2',
                    children: [{
                        id: 5,
                        label: '二级 2-1'
                    }, {
                        id: 6,
                        label: '二级 2-2'
                    }]
                }, {
                    id: 3,
                    label: '一级 3',
                    children: [{
                        id: 7,
                        label: '你好'
                    }, {
                        id: 8,
                        label: '是'
                    }]
                }],
                defaultProps: {
                    children: 'id',
                    label: 'name'
                }
            }
        },
        methods: {
            handleOpen(key, keyPath) {
                console.log(key, keyPath);
            },
            handleClose(key, keyPath) {
                console.log(key, keyPath);
            },
            filterNode(value, data) {
                if (!value) return true;
                return data.label.indexOf(value) !== -1;
            },
            handleNodeClick(data, id) {
                console.log(data.id)
            }
        },
        watch: {
            filterText(val) {
                this.$refs.tree2.filter(val);
            }
        },
        mounted() {
            this.$http.get('http://localhost:8888/v1/category').then(res => {
                this.loading = true
                var _this = this
                this.data2 = res.body.data
            })
        }
    }
</script>

<style scoped>
    #content {
        padding: 20px;
        /* height: 100% */
    }
</style>