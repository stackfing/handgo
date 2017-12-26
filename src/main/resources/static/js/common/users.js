layui.use('table', function(){
    var table = layui.table;
    table.render({
        elem: '#userlist'
        ,height: 530
        ,limit: 10
        ,url: '/admin/users/allUser' //数据接口
        ,page: true //开启分页
        ,cols: [[ //表头
            {field: 'uid', title: 'ID', width:80, sort: true, fixed: 'left', align: 'center'}
            ,{field: 'account', title: '用户名',width:150, align: 'center'}
            ,{field: 'password', title: '密码',width:150, sort: true, align: 'center'}
            ,{field: 'phoneNumber', title: '手机号',width:150, align: 'center'}
            ,{field: 'email', title: '邮箱',width:150, align: 'center'}
            ,{field: 'permission', title: '权限',width:150, sort: true, align: 'center'}
            ,{field: 'createDate', title: '创建时间',width:150, sort: true, align: 'center'}
            ,{field: 'lastLogin', title: '上次登录时间',width:150, align: 'center'}
            ,{field: 'status', title: '状态',width:150, sort: true, align: 'center'}
            ,{title: '操作',width:250, toolbar:"#toolBar"}
        ]]
    });
    table.on('tool(test)', function(obj){
        var data = obj.data; //获得当前行数据
        var layEvent = obj.event; //获得 lay-event 对应的值（也可以是表头的 event 参数对应的值）
        var tr = obj.tr; //获得当前行 tr 的DOM对象
        if(layEvent === 'detail'){ //查看
            //do somehing
            detail(data.uid);
        } else if(layEvent === 'del'){ //删除
            layer.confirm('真的删除行么', function(index){
                $.ajax({
                    url: '/admin/users/del/' + data.uid,
                    type: 'post',
                    success: function (e) {   //成功后回调
                        if (e.message === 'SUCCESS') {
                            obj.del(); //删除对应行（tr）的DOM结构，并更新缓存
                            layer.close(index);
                            layer.msg('删除成功！');
                            return;
                        } else {
                            layer.close(index);
                            layer.msg('删除失败，请重试！');
                            return;
                        }
                    },
                    error: function (e) {    //失败后回调
                        // alert(e);
                        layer.msg('网络错误，请重试！');
                    },
                    beforeSend: function () {  //发送请求前调用，可以放一些"正在加载"之类额话
                        layer.msg('正在删除');
                    }
                });

            });
        } else if(layEvent === 'edit'){ //编辑
            //do something
            editUser(data.uid);
            //同步更新缓存对应的值
            obj.update({
                username: '123'
                ,title: 'xxx'
            });
        }
    });
});

function editUser(uid) {
    var con = '<div class="layui-form-item">\n' +
        '    <label class="layui-form-label">长输入框</label>\n' +
        '    <div class="layui-input-block">\n' +
        '      <input type="text" name="title" autocomplete="off" placeholder="请输入标题" class="layui-input">\n' +
        '    </div>\n' +
        '  </div>';
    layer.open({
        type: 2,
        area: ['700px', '450px'],
        fixed: false, //不固定
        maxmin: true,
        content: '/admin/users/edit'
    });
}

function detail(uid) {
    $.get("/admin/users/" + uid, function (data, status) {
        // '用户ID：' + data.uid + '用户名：' + data.account +
        // '密码：' + data.password +
        // '手机号：' + data.phoneNumber +
        // '邮箱：' + data.email +
        // '权限：' + data.permission +
        // '创建时间：' + data.createDate +
        // '上次登录时间：' + data.lastLogin +
        // '状态：' + data.status
        var contents = '<table class="site-table"><thead><tr><th>项目</th><th>信息</th></tr></thead><tbody><tr><td>用户名</td><td>123</td></tr></tbody></table>';
        layer.open({
            title: '详情信息'
            ,content: contents
            ,yes: function(index) {
                layer.close(index);
            }
        });
    });
}