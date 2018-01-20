<!DOCTYPE html>
<html lang="en"/>
<head>
    <meta charset="UTF-8"/>
    <link type="text/css" rel="stylesheet" href="/static/css/layui.css">
    <#--<script src="/static/layui.all.js"></script>-->
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

    <div id="productTable" lay-filter="demo" class="layui-col-md12" style="margin-top: 10px"></div>
</div>

<script type="text/html" id="barDemo">
    <a class="layui-btn layui-btn-xs" lay-event="edit">编辑</a>
    <a class="layui-btn layui-btn-danger layui-btn-xs" lay-event="del">删除</a>
</script>
<script type="text/html" id="statusTpl">
    {{#  if(d.status === 0){ }}
    <span class="layui-badge layui-bg-gray">下架</span>
    {{#  } else { }}
    <span class="layui-badge layui-bg-red">上架</span>
    {{#  } }}
</script>
<script type="text/html" id="photoTpl">
    <img src="{{d.photo}}" width="100" height="100">
</script>
<script src="/static/layui.all.js"></script>
<script>
    var table = layui.table;
    layui.use('table', function () {
        // var table = layui.table;
        //第一个实例
        table.render({
            elem: '#productTable'
            , height: 'full-100'
            , url: '/product' //数据接口
            , page: true //开启分页
            , id: 'productTables'
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
                {type:'checkbox'}
                , {field: 'id', title: 'ID', sort: true, fixed: ''}
                , {field: 'name', title: '商品名' }
                , {field: 'price', title: '单价'}
                , {field: 'quantity', title: '库存' }
                , {field: 'productDescription', title: '商品描述'}
                , {field: 'photo', title: '商品小图', templet: '#photoTpl'}
                , {field: 'status', title: '状态', templet: '#statusTpl'}
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
