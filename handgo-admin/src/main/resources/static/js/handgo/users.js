//创建用户列表
layui.use('table', function () {
    var table = layui.table;
    table.render({
        elem: '#userlist'
        , height: 500
        , limit: 10
        , url: '/admin/users/allUser' //数据接口
        , page: true //开启分页
        , cols: [[ //表头
            {field: 'uid', title: 'ID', width: 80, sort: true, fixed: 'left', align: 'center'}
            , {field: 'account', title: '用户名', width: 100, align: 'center'}
            , {field: 'password', title: '密码', width: 100, sort: true, align: 'center'}
            , {field: 'phoneNumber', title: '手机号', width: 100, align: 'center'}
            , {field: 'email', title: '邮箱', width: 100, align: 'center'}
            , {field: 'permission', title: '权限', width: 100, sort: true, align: 'center'}
            , {field: 'createDate', title: '创建时间', width: 100, sort: true, align: 'center'}
            , {field: 'headPhoto', title: '头像', width: 100, align: 'center',templet: '<div><img src="/happy.jpg"/></div>'}
            , {field: 'lastLogin', title: '上次登录时间', width: 100, align: 'center'}
            , {field: 'status', title: '状态', width: 100, sort: true, align: 'center'}
            , {title: '操作', width: 250, toolbar: "#toolBar"}
        ]]
    });
    table.on('tool(test)', function (obj) {
        var data = obj.data; //获得当前行数据
        var layEvent = obj.event; //获得 lay-event 对应的值（也可以是表头的 event 参数对应的值）
        var tr = obj.tr; //获得当前行 tr 的DOM对象
        if (layEvent === 'detail') { //查看
            //do somehing
            detail(data.uid);
        } else if (layEvent === 'del') { //删除
            layer.confirm('真的删除行么', function (index) {
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
        } else if (layEvent === 'edit') { //编辑
            //do something
            editUser(data.uid,obj);
            //同步更新缓存对应的值

            // obj.update({
            //     account: '123213'
            //     , title: 'xxx'
            // });
        }
    });
});


$.fn.serializeObject = function () {
    var o = {};
    var a = this.serializeArray();
    $.each(a, function () {
        if (o[this.name]) {
            if (!o[this.name].push) {
                o[this.name] = [o[this.name]];
            }
            o[this.name].push(this.value || '');
        } else {
            o[this.name] = this.value || '';
        }
    });
    return o;
}

//编辑用户
function editUser(uid,obj) {
    $.ajax({
        url: '/admin/users/' + uid,
        type: 'get',
        success: function (data) {   //成功后回调
            var contents = '<form id="updateEditor" method="post" action="/admin/users/update" class=layui-form lay-filter=formDemo>\n' +
                '            <div class="layui-form-item">\n' +
                '                <label class="layui-form-label">用户 ID</label>\n' +
                '                <div class="layui-input-block">\n' +
                '                    <input type="text" readonly name="uid" autocomplete="off" placeholder="请输入用户 ID" class="layui-input" value="'+ data.data.uid +'" />\n' +
                '                </div>\n' +
                '            </div>\n' +
                '            <div class="layui-form-item">\n' +
                '                <label class="layui-form-label">账号</label>\n' +
                '                <div class="layui-input-block">\n' +
                '                    <input type="text" name="account" autocomplete="off" placeholder="请输入账号" class="layui-input" value="' + data.data.account + '" />\n' +
                '                </div>\n' +
                '            </div>\n' +
                '            <div class="layui-form-item">\n' +
                '                <label class="layui-form-label">密码</label>\n' +
                '                <div class="layui-input-block">\n' +
                '                    <input type="text" name="password" autocomplete="off" placeholder="请输入密码" class="layui-input" value="' + data.data.password + '"/>\n' +
                '                </div>\n' +
                '            </div>\n' +
                '            <div class="layui-form-item">\n' +
                '                <label class="layui-form-label">手机号</label>\n' +
                '                <div class="layui-input-block">\n' +
                '                    <input type="tel" name="phoneNumber" autocomplete="off" placeholder="请输入手机号" class="layui-input" value="'+ data.data.phoneNumber +'" />\n' +
                '                </div>\n' +
                '            </div>\n' +
                '            <div class="layui-form-item">\n' +
                '                <label class="layui-form-label">邮箱</label>\n' +
                '                <div class="layui-input-block">\n' +
                '                    <input type="email" name="email" autocomplete="off" placeholder="请输入邮箱" class="layui-input" value="'+ data.data.email +'" />\n' +
                '                </div>\n' +
                '            </div>\n' +
                '            <div class="layui-form-item">\n' +
                '                <label class="layui-form-label">权限</label>\n' +
                '                <div class="layui-input-block">\n' +
                '                    <input type="text" name="permission" autocomplete="off" placeholder="请输入权限" class="layui-input" value="'+ data.data.permission +'" />\n' +
                '                </div>\n' +
                '            </div>\n' +
                '            <div class="layui-form-item">\n' +
                '                <label class="layui-form-label">创建时间</label>\n' +
                '                <div class="layui-input-block">\n' +
                '                    <!--<input th:type="text" th:value="${userDetail.phoneNumber}" name="uid" autocomplete="off" placeholder="请输入用户 ID" class="layui-input" />-->\n' +
                '                    <input type="text" name="createDate" id="createDate" lay-verify="date" placeholder="yyyy-MM-dd" autocomplete="off" class="layui-input" lay-key="1" value="'+ data.data.createDate +'" />\n' +
                '                </div>\n' +
                '            </div>\n' +
                '            <div class="layui-form-item">\n' +
                '                <label class="layui-form-label">上次登录时间</label>\n' +
                '                <div class="layui-input-block">\n' +
                '                    <input type="text" id="lastLogin" name="lastLogin" autocomplete="off" placeholder="yyyy-MM-dd" class="layui-input" value="'+ data.data.lastLogin +'" />\n' +
                '                </div>\n' +
                '            </div>\n' +
                '            <div class="layui-form-item">\n' +
                '                <label class="layui-form-label">头像</label>\n' +
                '                <div class="layui-input-block">\n' +
                '                    <input type="text" name="headPhoto" autocomplete="off" placeholder="请输入头像" class="layui-input" value="' + data.data.headPhoto + '" />\n' +
                '                </div>\n' +
                '            </div>\n' +
                '            <div class="layui-form-item">\n' +
                '                <label class="layui-form-label">状态</label>\n' +
                '                <div class="layui-input-block">\n' +
                '                    <input type="text" name="status" autocomplete="off" placeholder="请输入状态" class="layui-input" value="'+ data.data.status +'" />\n' +
                '                </div>\n' +
                '            </div>\n' +
                // '            <div class="layui-form-item" >\n' + '<label class="layui-form-label"></label>\n'+
                // '                <button class="layui-btn" lay-submit="" id="sub" style="margin: auto;">修改</button>\n' +
                // '            </div>\n' +
                '        </form>';
            if (data.msg === 'SUCCESS') {
                var index = layer.open({
                    type: 1 //Page层类型
                    ,area: ['500px', '600px;']
                    ,title: '编辑用户'
                    ,shade: 0.6 //遮罩透明度
                    ,maxmin: true //允许全屏最小化
                    ,anim: 5 //0-6的动画形式，-1不开启
                    ,content: contents
                    ,btn: ['提交']
                    ,yes: function() {
                        $.ajax({
                            type: "post",
                            url: "/admin/users/update",
                            contentType: "application/json; charset=utf-8",
                            data: JSON.stringify($("#updateEditor").serializeObject()),
                            dataType: "json",
                            success:function () {
                                // alert("success");
                                layer.msg("提交修改成功");
                                layer.close(index);
                                obj.update($("#updateEditor").serializeObject());
                            },
                            error: function () {
                                layer.msg("提交修改失败");
                            }
                        });

                    }
                });
                layui.use('laydate', function(){
                    var laydate = layui.laydate;
                    laydate.render({
                        elem: "#createDate"
                    });
                    laydate.render({
                        elem: "#lastLogin"
                    });
                });

                return;
            } else {
                alert("失败");
                return;
            }


        },
        error: function (data) {    //失败后回调
            // alert(e);
            layer.msg('网络错误，请重试！');
        },
        beforeSend: function () {  //发送请求前调用，可以放一些"正在加载"之类额话
            layer.msg('正在查询');
        }
    });
    // layer.open({
    //     type: 1,
    //     title: false,
    //     closeBtn: 0,
    //     shadeClose: true,
    //     skin: 'yourclass',
    //     content: '自定义HTML内容'
    // });
}

function addUser() {
    var indexs = layer.open({
        type: 1,
        area: ['500px', '600px'],
        title: '添加用户',
        shade: 0.6,
        anim: 5,
        content: '<form id="updateEditor" lay-verify="editors" method="post" action="/admin/users/update" class=layui-form lay-filter=formDemo>\n' +
            '            <div class="layui-form-item">\n' +
            '                <label class="layui-form-label">用户 ID</label>\n' +
            '                <div class="layui-input-block">\n' +
            '                    <input type="text" readonly name="uid" autocomplete="off" placeholder="请输入用户 ID" class="layui-input" value="" />\n' +
            '                </div>\n' +
            '            </div>\n' +
            '            <div class="layui-form-item">\n' +
            '                <label class="layui-form-label">账号</label>\n' +
            '                <div class="layui-input-block">\n' +
            '                    <input type="text" name="account" autocomplete="off" placeholder="请输入账号" class="layui-input" value="" />\n' +
            '                </div>\n' +
            '            </div>\n' +
            '            <div class="layui-form-item">\n' +
            '                <label class="layui-form-label">密码</label>\n' +
            '                <div class="layui-input-block">\n' +
            '                    <input type="text" name="password" autocomplete="off" placeholder="请输入密码" class="layui-input" value=""/>\n' +
            '                </div>\n' +
            '            </div>\n' +
            '            <div class="layui-form-item">\n' +
            '                <label class="layui-form-label">手机号</label>\n' +
            '                <div class="layui-input-block">\n' +
            '                    <input type="tel" name="phoneNumber" autocomplete="off" placeholder="请输入手机号" class="layui-input" value="" />\n' +
            '                </div>\n' +
            '            </div>\n' +
            '            <div class="layui-form-item">\n' +
            '                <label class="layui-form-label">邮箱</label>\n' +
            '                <div class="layui-input-block">\n' +
            '                    <input type="email" name="email" autocomplete="off" placeholder="请输入邮箱" class="layui-input" value="" />\n' +
            '                </div>\n' +
            '            </div>\n' +
            '            <div class="layui-form-item">\n' +
            '                <label class="layui-form-label">权限</label>\n' +
            '                <div class="layui-input-block">\n' +
            '                    <input type="text" name="permission" autocomplete="off" placeholder="请输入权限" class="layui-input" value="" />\n' +
            '                </div>\n' +
            '            </div>\n' +
            '            <div class="layui-form-item">\n' +
            '                <label class="layui-form-label">创建时间</label>\n' +
            '                <div class="layui-input-block">\n' +
            '                    <!--<input th:type="text" th:value="${userDetail.phoneNumber}" name="uid" autocomplete="off" placeholder="请输入用户 ID" class="layui-input" />-->\n' +
            '                    <input type="text" name="createDate" id="createDate" lay-verify="date" placeholder="yyyy-MM-dd" autocomplete="off" class="layui-input" lay-key="1" value="" />\n' +
            '                </div>\n' +
            '            </div>\n' +
            '            <div class="layui-form-item">\n' +
            '                <label class="layui-form-label">上次登录时间</label>\n' +
            '                <div class="layui-input-block">\n' +
            '                    <input type="text" name="lastLogin" autocomplete="off" placeholder="请输入用户 ID" class="layui-input" value="" />\n' +
            '                </div>\n' +
            '            </div>\n' +
            '            <div class="layui-form-item">\n' +
            '                <label class="layui-form-label">头像</label>\n' +
            '                <div class="layui-input-block">\n' +
            '                    <input type="text" name="headPhoto" autocomplete="off" placeholder="请输入头像" class="layui-input" value="" />\n' +
            '                </div>\n' +
            '            </div>\n' +
            '            <div class="layui-form-item">\n' +
            '                <label class="layui-form-label">状态</label>\n' +
            '                <div class="layui-input-block">\n' +
            '                    <input type="text" name="status" autocomplete="off" placeholder="请输入状态" class="layui-input" value="" />\n' +
            '                </div>\n' +
            '            </div>\n' +
            // '            <div class="layui-form-item" >\n' + '<label class="layui-form-label"></label>\n'+
            // '                <button class="layui-btn" lay-submit="" id="sub" style="margin: auto;">修改</button>\n' +
            // '            </div>\n' +
            '        </form>',
        btn: ['添加'],
        yes: function () {
            $.ajax({
                type: "post",
                url: "/admin/users/add",
                contentType: "application/json; charset=utf-8",
                data: JSON.stringify($("#updateEditor").serializeObject()),
                dataType: "json",
                success:function (data) {
                    // alert("success");
                    if (data.code == 200) {
                        layer.msg("提交修改成功");
                        layer.close(indexs);
                        obj.update($("#updateEditor").serializeObject());
                    }
                },
                error: function () {
                    layer.msg("提交修改失败");
                }
            });
        }
    });
}

//用户详情
function detail(uid) {
    // $.get("/admin/users/" + uid, function (data, status) {
    //     // '用户ID：' + data.uid + '用户名：' + data.account +
    //     // '密码：' + data.password +
    //     // '手机号：' + data.phoneNumber +
    //     // '邮箱：' + data.email +
    //     // '权限：' + data.permission +
    //     // '创建时间：' + data.createDate +
    //     // '上次登录时间：' + data.lastLogin +
    //     // '状态：' + data.status
    //     var contents = '<table class="site-table"><thead><tr><th>项目</th><th>信息</th></tr></thead><tbody><tr><td>用户名</td><td>123</td></tr></tbody></table>';
    //     layer.open({
    //         title: '详情信息ssssssss'
    //         ,content: contents
    //         ,yes: function(index) {
    //             layer.close(index);
    //         }
    //     });
    // });

    $.ajax({
        url: "/admin/users/" + uid,
        type: "get",
        success: function (data) {
           // var contents = '<table class="site-table"><thead><tr><th>项目</th><th>信息</th></tr></thead><tbody><tr><td>用户名</td><td>123</td></tr></tbody></table>';
            // layer.open({
            //     title: '详情信息'
            //     , content: contents
            //     , yes: function (index) {
            //         layer.close(index);
            //     }
            // });
            var contents = '<div style="width: 500px;margin: auto;" id="hg-editor"><div style="margin-top: 30px;"><span style="font-size: 18px;">UID: </span>'+ data.data.email + '</div>' +
                '<div style="margin-top: 30px;"><span style="font-size: 18px;">Email: </span> '+ data.data.email + ' </div>' +
                '<div style="margin-top: 30px;"><span style="font-size: 18px;">用户名: </span>'+ data.data.account + '</div>' +
                '<div style="margin-top: 30px;"><span style="font-size: 18px;">密码: </span>'+ data.data.password + '</div>' +
                '<div style="margin-top: 30px;"><span style="font-size: 18px;">手机号: </span>'+ data.data.phoneNumber + '</div>' +
                '<div style="margin-top: 30px;"><span style="font-size: 18px;">权限: </span>'+ data.data.permission + '</div>' +
                '<div style="margin-top: 30px;"><span style="font-size: 18px;">创建时间: </span>'+ data.data.createDate + '</div>' +
                '<div style="margin-top: 30px;"><span style="font-size: 18px;">上次登录时间: </span>'+ data.data.lastLogin + '</div>' +
                '<div style="margin-top: 30px;"><span style="font-size: 18px;">状态: </span>'+ data.data.status + '</div>' +
                '</div>';
            layer.open({
                type: 1 //Page层类型
                ,area: ['800px', '800px;']
                ,title: '用户详情'
                ,shade: 0.6 //遮罩透明度
                ,maxmin: true //允许全屏最小化
                ,anim: 5 //0-6的动画形式，-1不开启
                ,content: contents
            });
        },
        error: function () {
            alert("网络错误，请重试！");
        },
        beforeSend: function () {  //发送请求前调用，可以放一些"正在加载"之类额话
            layer.msg('正在查询');
        }
    });
}