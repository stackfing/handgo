<template>
    <div id="productList">
        <div>{{currentPrice | priceFilter}}</div>
        <head-top :titleItemtest='item'></head-top>
        <div id='content'>
            <el-table :data="tableData" style="width: 100%">
                <el-table-column type="expand">
                    <template slot-scope="props">
                                                                                                            <el-form label-position="left" inline class="demo-table-expand">
                                                                                                              <el-form-item label="商品名称">
                                                                                                                <span>{{ props.row.name }}</span>
                                                                                                              </el-form-item>
                                                                                                              <el-form-item label="库存">
                                                                                                                <span>{{ props.row.stock }}</span>
                                                                                                              </el-form-item>
                                                                                                              <el-form-item label="已售数量">
                                                                                                                <span>{{ props.row.saleAmount }}</span>
                                                                                                              </el-form-item>
                                                                                                              <el-form-item label="创建时间">
                                                                                                                <span>{{ props.row.createTime }}</span>
                                                                                                              </el-form-item>
                                                                                                              <el-form-item label="更新时间">
                                                                                                                <span>{{ props.row.updateTime }}</span>
                                                                                                              </el-form-item>
                                                                                                              <el-form-item label="状态">
                                                                                                                <span>{{ props.row.status }}</span>
                                                                                                              </el-form-item>
                                                                                                              <el-form-item label="商品描述">
                                                                                                                <span>{{ props.row.desc }}</span>
                                                                                                              </el-form-item>
                                                                                                            </el-form>
</template>
    </el-table-column>
    <el-table-column
      label="商品 ID"
      prop="id">
    </el-table-column>
    <el-table-column
      label="商品名称"
      prop="name">
    </el-table-column>
    <el-table-column
      label="现价"
      prop="currentPrice">
    </el-table-column>
    <el-table-column
      label="原价"
      prop="originalPrice">
    </el-table-column>
    <el-table-column
      label="描述"
      prop="description">
    </el-table-column>
    <el-table-column label="操作">
<template slot-scope="scope">
    <el-button size="mini" @click="handleEdit(scope.$index, scope.row)">
        编辑</el-button>
    <el-button size="mini" type="danger" @click.native.prevent="handleDelete(scope.$index, scope.row,tableData)">删除</el-button>
</template>
    </el-table-column>
  </el-table>
        </div>
        
<el-dialog :close-on-press-escape='true' :close-on-click-modal='false' title="编辑" :visible.sync="dialogTableVisible">
  <el-form ref='editForm' :rules='rulet' :model='editForm' label-width='100px' style='width:400px'>
        <el-form-item label='产品名' prop='name'>
          <el-input v-model='editForm.name'></el-input>
        </el-form-item>
        <el-form-item label='现价' prop='currentPrice'>
          <el-input v-model='editForm.currentPrice'></el-input>
        </el-form-item>
        <el-form-item label='原价' prop='originalPrice'>
          <el-input v-model='editForm.originalPrice'></el-input>
        </el-form-item>
        <el-form-item label='描述' prop='description'>
          <el-input v-model='editForm.description'></el-input>
        </el-form-item>
        <el-form-item label='产品名' prop='name'>
          <el-input v-model='name'></el-input>
        </el-form-item>
         <el-form-item label="状态" prop="delivery">
             <el-switch v-model="editForm.status"></el-switch>
         </el-form-item>
        <el-form-item>
         <el-button type="primary" @click="submitForm('editForm')">提交修改</el-button>
         <el-button @click="resetForm('editForm')">重置</el-button>
        </el-form-item>
  </el-form>
</el-dialog>
    </div>
</template>

<script>
    import HeadTop from '@/components/HeadTop'
    import Child from '@/components/Child'
    export default {
        name: 'productList',
        components: {
            HeadTop,
            Child
        },
        data() {
            return {
                prices: 1.2,
                item: [{
                    title: '产品',
                    path: '/product'
                }],
                name: '',
                originalPrice: '',
                currentPrice: '',
                description: '',
                editForm: {},
                tableData: [],
                dialogTableVisible: false,
                editData: [{
                    date: '10-10-10',
                    name: 'asdf',
                    address: 'asdf'
                }],
                rulet: {
                    name: [{
                        required: true,
                        message: 'required',
                        // trigger: 'blur'
                    }],
                    currentPrice: [{
                        required: true,
                        message: 'required'
                    }]
                }
            }
        },
        methods: {
            // handleOpen(key, keyPath) {
            //     console.log(key, keyPath);
            // },
            // handleClose(key, keyPath) {
            //     console.log(key, keyPath);
            // },
            handleEdit(index, row) {
                this.dialogTableVisible = true
                console.log(this.$refs.editForm)
                // this.editForm = row
                this.editForm = Object.assign({}, row)
                // console.log(this.editForm)
            },
            submitForm(formName) {
                this.$refs[formName].validate((valid) => {
                    if (valid) {
                        alert('submit!');
                    } else {
                        console.log('error submit!!');
                        return false;
                    }
                });
                // console.log(this.$refs[formName])
            },
            resetForm(formName) {
                this.$refs[formName].resetFields();
            },
            handleDelete(index, row, rows) {
                console.log(rows)
                this.$confirm('是否要删除？', '删除询问', {
                    confirmButtonText: '确定',
                    cancelButtonText: '取消',
                    type: 'warning'
                }).then(() => {
                    // alert('sdf')
                    
                    this.$http.delete('/v1/product/' + row.id).then(response => {
                        if (response.data.code == 200) {
                            rows.splice(index, 1);
                            this.$message({
                                type: 'success',
                                message: '删除成功'
                            });
                        }
                    }).catch(response=>{
                        this.$message({
                            type:'error',
                            message: '网络错误'
                        })
                    });
                }).catch(() => {
                    this.$message({
                        type: 'info',
                        message: '已取消'
                    });
                });
            }
        },
        created: function() {
            // console.log(vm.$data)
        },
        mounted: function() {
            var _this = this;
            this.$http.get('/v1/product?page=1&limit=10').then(function(data) {
                console.log(data)
                _this.tableData = data.body.data
                // alert(data.body.data)
            })
        },
        filters: {
            priceFilter: function(value) {}
        },
    }
</script>

<style scoped>
    .demo-table-expand {
        font-size: 0;
    }
    .demo-table-expand label {
        width: 90px;
        color: #99a9bf;
    }
    .demo-table-expand .el-form-item {
        margin-right: 0;
        margin-bottom: 0;
        width: 50%;
    }
</style>