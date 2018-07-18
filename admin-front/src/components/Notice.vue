<template>
    <div id="productList">
        <div>{{currentPrice | priceFilter}}</div>
        <head-top :titleItemtest='item'></head-top>
        <div id='content'>

        </div>
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
        item: [
        {
          title: "公告",
          path: "/notice"
        }
      ],
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
    this.$http.get("http://localhost:8888/v1/customer").then(function(data) {
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