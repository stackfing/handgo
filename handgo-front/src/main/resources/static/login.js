//获得当前用户信息
$(function () {
    //做请求
    $.ajax({
        url: '/test',
        body: '',
        error: function() {
            console.log('网络错误')
        }
    })
})