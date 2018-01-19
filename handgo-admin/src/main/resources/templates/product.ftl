<!DOCTYPE html>
<html lang="en"/>
<head>
    <meta charset="UTF-8"/>
    <link type="text/css" rel="stylesheet" href="/static/css/layui.css">
    <#--<script src="/static/layui.all.js"></script>-->
    <script src="/static/js/jquery-3.2.1.min.js"></script>
</head>
<body>

<div style="padding: 15px;">
    <button class="layui-btn layui-bg-green" onclick="add()"><i class="layui-icon" style="font-size: 20px;">&#xe608;</i>添加</button>
    <div id="productTable" lay-filter="demo" class="layui-col-md12"></div>
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
            elem: '#productTable'
            , height: 315
            , url: '/product' //数据接口
            , page: true //开启分页
            , request: {
                pageName: 'page' //页码的参数名称，默认：page
                , limitName: 'limit' //每页数据量的参数名，默认：limit
            }
            , response: {
                statusName: 'code' //数据状态的字段名称，默认：code
                , statusCode: 200 //成功的状态码，默认：0
                , msgName: 'msg' //状态信息的字段名称，默认：msg
                , countName: 'total' //数据总数的字段名称，默认：count
                , dataName: 'data' //数据列表的字段名称，默认：data
            }
            , cols: [[ //表头
                {field: 'id', title: 'ID', sort: true, fixed: 'left'}
                , {field: 'name', title: '商品名' }
                , {field: 'price', title: '单价'}
                , {field: 'quantity', title: '库存' }
                , {field: 'productDescription', title: '商品描述'}
                , {field: 'photo', title: '商品小图'}
                , {field: 'status', title: '状态'}
                , {field: 'productCategoryId', title: '类目ID'}
                , {field: 'updateTime', title: '更新时间'}
                , {field: 'createTime', title: '创建时间'}
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
            });
        } else if (layEvent === 'edit') {
            layer.msg('编辑操作');
            edit(obj);
        }
    });


    function add() {
        var index = layer.open({
            type: 2,
            content: '/productEdit',
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

    function edit() {
        var index = layer.open({
            type: 2,
            content: '/product/productEdit',
            title: '编辑中',
            success: function (layero, index) {
                var body = layer.getChildFrame('body', index);
                var iframeWin = window[layero.find('iframe')[0]['name']]; //得到iframe页的窗口对象，执行iframe页的方法：iframeWin.method();
                console.log(body.html()) //得到iframe页的body内容
                body.find('input').val('Hi，我是从父页来的')
            }
        });
        layer.full(index);
    }


</script>

</body>
</html>
