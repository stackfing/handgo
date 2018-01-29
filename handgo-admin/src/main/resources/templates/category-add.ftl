<!DOCTYPE html>
<html lang="en"/>
<head>
    <meta charset="UTF-8"/>
    <link type="text/css" rel="stylesheet" href="/static/css/layui.css">
    <script src="/static/js/jquery-3.2.1.min.js"></script>
    <script src="/static/js/vue.js"></script>
    <script src="/static/js/vue-resource.js"></script>
</head>
<body class="layui-col-md12">

<form id="formBox">
    <div class="layui-form-item">
        <label class="layui-form-label"><span style="color: red;">*</span>&nbsp产品名称</label>
        <div class="layui-inline">
            <input type="hidden" v-model="id">
            </span><input type="text" name="name" id="product-name" lay-verify="required" placeholder="请输入产品名称" autocomplete="off" class="layui-input">
        </div>
    </div>
    <div style="width: 100px;height: 100px;background-color: red" @click="clickme"></div>
</form>
<script src="/static/layui.all.js"></script>
<script>
    new Vue({
        el: '#formBox',
        data: {
            message: '',
            // click: 'click me'
        },
        created: function() {
            if (this.id==null) {
                this.id = '';
                // alert('asdfsdf');
            }
            this.click = '惦记我';

        },
        methods: {
            clickme: function () {
                // this.$http.get('/v1/category?page=1&limit=10').then(response=>{alert(response.body.total)},response=>{alert('加载失败！')});
                this.$http.get('/v1/category?page=1&limit=10').then(data=>{alert(data.status)});
                return false;
            }
        }

    });
</script>

</body>
</html>
