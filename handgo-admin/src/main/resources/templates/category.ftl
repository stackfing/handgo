<!DOCTYPE html>
<html lang="en"/>
<head>
    <meta charset="UTF-8"/>
    <link type="text/css" rel="stylesheet" href="/static/css/layui.css">
    <script src="/static/js/jquery-3.2.1.min.js"></script>
</head>
<body class="layui-col-md12">

<div style="padding: 30px;">
    <div class="layui-col-md12">
        <button class="layui-btn layui-bg-green" onclick="add()"><i class="layui-icon" style="font-size: 20px;">&#xe608;</i>添加</button>
        <div class="layui-inline" style="margin-left: 100px;">
            <input type="text" class="layui-input" placeholder="搜索商品名">
        </div>
        <button class="layui-btn">sadf</button>
        <button class="layui-btn layui-bg-green layui-layout-right" onclick="refresh()"><i class="layui-icon" style="font-size: 20px;">&#x1002;</i></button>
    </div>

    <div id="categoryTable" lay-filter="demo" class="layui-col-md12" style="margin-top: 10px"></div>
</div>

<script type="text/html" id="barDemo">
    <a class="layui-btn layui-btn-xs" lay-event="edit">编辑</a>
    <a class="layui-btn layui-btn-danger layui-btn-xs" lay-event="del">删除</a>
</script>

<script src="/static/layui.all.js"></script>
<script>
    var table = layui.table;
    layui.use('table', function () {
        // var table = layui.table;
        //第一个实例
        table.render({
            elem: '#categoryTable'
            , height: 'full-100'
            , url: '/v1/category' //数据接口
            , page: true //开启分页
            , id: 'categoryTable'
            , request: {
                pageName: 'page' //页码的参数名称，默认：page
                , limitName: 'limit' //每页数据量的参数名，默认：limit
            }
            , response: {
                statusName: 'code' //数据状态的字段名称，默认：code
                , statusCode: 200 //成功的状态码，默认：0
                , msgName: 'message' //状态信息的字段名称，默认：msg
                , countName: 'total' //数据总数的字段名称，默认：count
                , dataName: 'data' //数据列表的字段名称，默认：data
            }
            , cols: [[ //表头
                {type:'checkbox'}
                , {field: 'id', title: 'ID', sort: true, fixed: ''}
                , {field: 'name', title: '分类名' }
                , {field: 'parent', title: '父节点 ID'}
                , {field: 'avaliable', title: '可用' }
                , {fixed: '', title: '操作', width: 165, align: 'center', toolbar: '#barDemo'}
            ]]
        });
    });


    table.on('tool(demo)', function (obj) { //注：tool是工具条事件名，test是table原始容器的属性 lay-filter="对应的值"
        var data = obj.data //获得当前行数据
                , layEvent = obj.event; //获得 lay-event 对应的值
        if (layEvent === 'del') {
            layer.confirm('真的删除行么', function (index) {
                obj.del(); //删除对应行（tr）的DOM结构
                layer.close(index);
                //向服务端发送删除指令
                deleteData(obj);
            });
        } else if (layEvent === 'edit') {
            layer.msg('编辑操作');
            edit(obj);
        }
    });

    function deleteData(obj) {
        $.ajax({
            url: '/v1/product/' + obj.data.id
            ,type: 'delete'
            ,data: null
            ,success: function(data) {
                layer.msg(data.msg);
            }
        });
    }

    function add() {
        var index = layer.open({
            type: 2,
            content: '/categoryEdit',
            title: '添加产品',
            success: function (layero, index) {
                // var body = layer.getChildFrame('body', index);
                // var iframeWin = window[layero.find('iframe')[0]['name']]; //得到iframe页的窗口对象，执行iframe页的方法：iframeWin.method();
                // console.log(body.html()) //得到iframe页的body内容
                // body.find('input').val('Hi，我是从父页来的')
            }
        });
        layer.full(index);
    }

    function edit(obj) {
        var index = layer.open({
            type: 2,
            content: '/productEdit',
            title: '编辑产品',
            success: function (layero, index) {
                var body = layer.getChildFrame('body', index);
                var iframeWin = window[layero.find('iframe')[0]['name']]; //得到iframe页的窗口对象，执行iframe页的方法：iframeWin.method();
                // console.log(body.html()) //得到iframe页的body内容
                var data = obj.data;
                body.find('#product-name').val(data.name);
                body.find('#product-id').val(data.id);
                body.find('#product-price').val(data.price);
                body.find('#product-quantity').val(data.quantity);
            }
        });
        layer.full(index);
    }

    function refresh() {
        table.reload('productTables', {
            page: {
                curr: 1
            }
        });
    }


</script>

</body>
</html>
