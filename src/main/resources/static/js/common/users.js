function editUser(uid) {

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