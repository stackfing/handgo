<template>
    <div id="productList">
        <div>{{currentPrice | priceFilter}}</div>
        <head-top :titleItemtest='item'></head-top>
        <div id='content'>
            <el-table v-loading="loading" :data="tableData" style="width: 100%">
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
      label="账号"
      prop="account">
    </el-table-column>
    <el-table-column
      label="邮箱"
      prop="email">
    </el-table-column>
    <el-table-column
      label="手机号"
      prop="phoneNumber">
    </el-table-column>
    <el-table-column
      label="性别"
      prop="sex">
    </el-table-column>
    <el-table-column
      label="状态"
      prop="status">
    </el-table-column>
    <el-table-column
      label="上次登录时间"
      prop="lastLogin">
<!-- <template slot-scope="scope">
    <div slot="reference" class="name-wrapper">
        <div v-if="scope.row.status == 1">
            <el-tag size="medium" type="danger">上架</el-tag>
        </div>
        <div v-if="scope.row.status == 0">
            <el-tag size="medium" type="info">下架</el-tag>
        </div>
    </div>
</template> -->
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
        <!-- <el-form-item label='产品名' prop='name'>
          <el-input v-model='name'></el-input>
        </el-form-item> -->
         <el-form-item label="状态" prop="delivery">
             <el-switch :active-value="1" :inactive-value="0" v-model="editForm.status"></el-switch>
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
import HeadTop from "@/components/HeadTop";
import Child from "@/components/Child";
export default {
  name: "productList",
  components: {
    HeadTop,
    Child
  },
  data() {
    return {
      prices: 1.2,
      item: [
        {
          title: "用户",
          path: "/users"
        }
      ],
      name: "",
      originalPrice: "",
      currentPrice: "",
      description: "",
      editForm: {},
      tableData: [],
      loading: true,
      dialogTableVisible: false,
      editData: [
        {
          date: "10-10-10",
          name: "asdf",
          address: "asdf"
        }
      ],
      rulet: {
        name: [
          {
            required: true,
            message: "请填写产品名称",
            trigger: "change"
          }
        ],
        currentPrice: [
          {
            required: true,
            message: "请填写修改后的价格",
            trigger: "change"
          }
        ],
        originalPrice: [
          {
            required: true,
            message: "请填写原价",
            trigger: "change"
          }
        ]
      }
    };
  },
  methods: {
    handleEdit(index, row) {
      this.dialogTableVisible = true;
      console.log(this.$refs.editForm);
      this.editForm = Object.assign({}, row);
    },
    submitForm(formName) {
      this.$refs[formName].validate(valid => {
        if (valid) {
          var _this = this;
          var data = _this.editForm;
          console.log(JSON.stringify(data));
          this.$http
            .put(
              "http://localhost:8888/v1/product/" + _this.editForm.id,
              JSON.stringify(data)
            )
            .then(res => {
              if (res.status == 200) {
                _this.$message({
                  type: "success",
                  message: res.body.msg
                });
                _this.dialogTableVisible = false;
                this.$http
                  .get("http://localhost:8888/v1/product?page=1&limit=10")
                  .then(function(data) {
                    this.loading = true;
                    _this.tableData = data.body.data;
                    this.loading = false;
                  });
              }
            })
            .catch(res => {
              _this.$message({
                type: "error",
                message: "网络错误，请重试"
              });
            });
        } else {
          console.log("error submit!!");
          return false;
        }
      });
    },
    resetForm(formName) {
      this.$refs[formName].resetFields();
    },
    handleDelete(index, row, rows) {
      console.log(rows);
      this.$confirm("是否要删除？", "删除询问", {
        confirmButtonText: "确定",
        cancelButtonText: "取消",
        type: "warning"
      })
        .then(() => {
          this.$http
            .delete("http://localhost:8888/   v1/product/" + row.id)
            .then(response => {
              if (response.data.code == 200) {
                rows.splice(index, 1);
                this.$message({
                  type: "success",
                  message: "删除成功"
                });
              }
            })
            .catch(response => {
              this.$message({
                type: "error",
                message: "网络错误"
              });
            });
        })
        .catch(() => {
          this.$message({
            type: "info",
            message: "已取消"
          });
        });
    }
  },
  mounted: function() {
    var _this = this;
    this.$http
      .get("http://localhost:8888/v1/customer")
      .then(function(data) {
        this.loading = true;
        _this.tableData = data.body.data;
        this.loading = false;
      });
  },
  filters: {
    priceFilter: function(value) {}
  }
};
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