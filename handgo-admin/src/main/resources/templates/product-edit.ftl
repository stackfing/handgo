<!DOCTYPE html>
<html lang="en"/>
<head>
    <meta charset="UTF-8"/>
    <link type="text/css" rel="stylesheet" href="/static/css/layui.css">
    <script src="/static/layui.all.js"></script>
    <script src="/static/js/jquery-3.2.1.min.js"></script>
</head>
<body>
<h1 class="layui-header"><i class="layui-icon" style="font-size: 30px;">&#xe60a;</i>添加产品</h1>
<hr>
<form class="layui-form layui-col-md12" style="margin: auto;" lay-filter="formDemo"> <!-- 提示：如果你不想用form，你可以换成div等任何一个普通元素 -->
    <div class="layui-form-item">
        <label class="layui-form-label"><span style="color: red;">*</span>&nbsp产品名称</label>
        <div class="layui-input-block">
            </span><input type="text" name="" lay-verify="required" placeholder="请输入产品名称" autocomplete="off" class="layui-input">
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label"><span style="color: red;">*</span>&nbsp价格</label>
        <div class="layui-input-block">
            <input type="text" name="price" lay-verify="required" placeholder="￥" autocomplete="off" class="layui-input">
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label"><span style="color: red;">*</span>&nbsp分类</label>
        <div class="layui-input-block">
            <select id="categorySelector" name="" lay-verify="required" lay-filter="category">
                <option value="">请选择一个分类</option>
            </select>
            <select id="categorySubSelector" name="" lay-verify="required" lay-filter="subCategory">
                <option value="">请选择一个子分类</option>
            </select>
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">开关关</label>
        <div class="layui-input-block">
            <input type="checkbox" lay-skin="switch">
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">开关开</label>
        <div class="layui-input-block">
            <input type="checkbox" checked lay-skin="switch">
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">单选框</label>
        <div class="layui-input-block">
            <input type="radio" name="sex" value="0" title="男">
            <input type="radio" name="sex" value="1" title="女" checked>
        </div>
    </div>
    <div class="layui-form-item layui-form-text">
        <label class="layui-form-label">请填写描述</label>
        <div class="layui-input-block">
            <textarea placeholder="请输入内容" class="layui-textarea"></textarea>
        </div>
    </div>
    <div class="layui-form-item">
        <div class="layui-input-block">
            <button class="layui-btn" lay-submit lay-filter="sub"><i class="layui-icon">&#xe609;</i> 立即提交</button>
            <button type="reset" class="layui-btn layui-btn-primary">重置</button>
        </div>
    </div>
    <!-- 更多表单结构排版请移步文档左侧【页面元素-表单】一项阅览 -->
</form>
<script src="/static/layui.all.js"></script>
<script>


    layui.use('form', function(){
        var form = layui.form;
        form.on('select(category)', function (data){
            $.getJSON('/category/' + data.value + '/subCategory', function (d) {
                var list = d.data;
                if (list.length == 0) {
                    $("#categorySubSelector").html('<option value="">请选择一个子分类</option>');
                    form.render('select');
                }
                var content;
                $.each(list, function(i, item) {
                    content += '<option value=' + item.id + '>' + item.name + '</option>';
                });
                $("#categorySubSelector").html(content);
                form.render('select');
            });
        });
        $.getJSON('/category/list', function (data) {
            var list = data.data;
            var content;
            $.each(list, function(i, item) {
                content += '<option value=' + item.id + '>' + item.name + '</option>';
            });
            $("#categorySelector").html(content);
            form.render('select');
        });
    });
</script>
</body>
</html>
