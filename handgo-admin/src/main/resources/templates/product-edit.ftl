<!DOCTYPE html>
<html lang="en"/>
<head>
    <meta charset="UTF-8"/>
    <link type="text/css" rel="stylesheet" href="/static/css/layui.css">
    <script src="/static/layui.all.js"></script>
    <script src="/static/js/jquery-3.2.1.min.js"></script>
</head>
<body class="layui-col-md12">
<h1 class="layui-header"><i class="layui-icon" style="font-size: 30px;">&#xe60a;</i>编辑</h1>
<hr>
<form class="layui-form layui-col-md12" style="margin: auto;" lay-filter="formDemo"> <!-- 提示：如果你不想用form，你可以换成div等任何一个普通元素 -->
    <div class="layui-form-item">
        <label class="layui-form-label"><span style="color: red;">*</span>&nbsp产品名称</label>
        <div class="layui-inline">
            <input name="id" type="hidden" id="product-id" class="layui-input">
            </span><input type="text" name="name" id="product-name" lay-verify="required" placeholder="请输入产品名称" autocomplete="off" class="layui-input">
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label"><span style="color: red;">*</span>&nbsp价格</label>
        <div class="layui-inline">
            <input type="text" id="product-price" name="price" lay-verify="required" placeholder="￥" autocomplete="off" class="layui-input">
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label"><span style="color: red;">*</span>&nbsp价格</label>
        <div class="layui-inline">
            <input type="text" id="product-quantity" name="quantity" lay-verify="required" placeholder="￥" autocomplete="off" class="layui-input">
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label"><span style="color: red;">*</span>&nbsp分类</label>
            <div class="layui-inline">
                <select id="categorySelector" name="" lay-verify="required" lay-filter="category">
                    <option value="">请选择一个分类</option>
                </select>
            </div>
            <div class="layui-inline">
                <select id="categorySubSelector" name="" lay-verify="required" lay-filter="subCategory">
                    <option value="">请选择一个子分类</option>
                </select>
            </div>
            <div class="layui-inline">
                <input type="hidden" name="productCategoryId" id="product-cagegory" class="text-selector">
                <div class="layui-form-mid layui-word-aux" id="text-selector-div"></div>
            </div>
    </div>

    <div class="layui-form-item">
        <label class="layui-form-label"><span style="color: red;">*</span>&nbsp产品图片</label>
        <div class="layui-input-block">
            <div class="layui-upload">
                <button type="button" class="layui-btn" id="test1">上传图片</button>
                <div class="layui-upload-list">
                    <img class="layui-upload-img" height="100px" width="100px" id="demo1">
                    <p id="photo"></p>
                    <input class="layui-input" id="photoInput" name="photo" type="hidden">
                </div>
            </div>
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">是否上架</label>
        <div class="layui-input-block">
            <input type="checkbox" checked lay-skin="switch">
        </div>
    </div>
    <div class="layui-form-item layui-form-text">
        <label class="layui-form-label">请填写描述</label>
        <div class="layui-input-block">
            <#--<textarea placeholder="请输入内容" class="layui-textarea"></textarea>-->
                <textarea id="description" name="description" style="display: none;"></textarea>
        </div>
    </div>
    <div class="layui-form-item">
        <div class="layui-input-block">
            <button class="layui-btn" lay-submit lay-filter="sub"><i class="layui-icon">&#xe609;</i> 立即提交</button>
            <button type="reset" class="layui-btn layui-btn-primary">重置</button>
        </div>
    </div>
</form>
<button onclick="shows()">sadfsdf</button>
<script src="/static/layui.all.js"></script>
<script>

    var editor;
    var layedit;
    layui.use('layedit', function(){
        layedit = layui.layedit;
        // layedit.build('description'); //建立编辑器
        layedit.set({
            uploadImage: {
                url: '/upload' //接口url
            }
        });
        editor = layedit.build('description'); //建立编辑器
    });

    layui.use('form', function(){
        var form = layui.form;
        //一级选择框点击
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


        //一级选择框初始化
        $.getJSON('/category/list', function (data) {
            var list = data.data;
            var content;
            $.each(list, function(i, item) {
                content += '<option value=' + item.id + '>' + item.name + '</option>';
            });
            $("#categorySelector").html(content);
            form.render('select');
        });

        //选择框点击
        form.on('select(subCategory)', function (data) {
            // layer.msg(data.value);
            $("#text-selector").attr('value', data.value);
            $("#product-cagegory").attr('value', data.value);
        });

        //表单提交
        form.on('submit(sub)', function(data){
            data.field.description = layedit.getContent(editor)
            if (data.field.id === "") {
                //添加
                var data = JSON.stringify(data.field);
                data = data.replace(',"file":""','');
                $.ajax({
                    url: '/product',
                    type: 'post',
                    contentType: 'application/json; charset=utf-8',
                    data: data,
                    success: function(data) {
                        if (data.code == 200){
                            layer.msg("提交成功");
                        }
                    }
                })
            } else {
                return false;
            }
            return false;
        });
    });

    //上传文件
    layui.use('upload', function() {
        var $ = layui.jquery
                , upload = layui.upload;
        var load;
        //普通图片上传
        var uploadInst = upload.render({
            elem: '#test1'
            , url: '/upload'
            , before: function (obj) {
                load = layer.load(1);
            }
            , done: function (res) {
                //如果上传失败
                if (res.code > 0) {
                    return layer.msg('上传失败');
                }
                //上传成功
                layer.close(load);
                layer.msg('上传成功');
                $('#demo1').attr('src', res.data.src);
                $('#photoInput').attr('value', res.data.src);
            }
            , error: function () {
                //演示失败状态，并实现重传
                var demoText = $('#photo');
                demoText.html('<span style="color: #FF5722;">上传失败</span> <a class="layui-btn layui-btn-mini demo-reload">重试</a>');
                demoText.find('.demo-reload').on('click', function () {
                    uploadInst.upload();
                });
            }
        });
    });
</script>
</body>
</html>
