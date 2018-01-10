<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
<html lang="en"/>
<head>
    <meta charset="UTF-8"/>
    <script src="/jquery.min.js"></script>
    <title>乌云后台登录</title>
    <!-- Custom Theme files -->
    <link href="/style.css" rel="stylesheet" type="text/css" media="all"/>
    <!-- Custom Theme files -->
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1"/>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <meta name="keywords" content="后台登录"/>
</head>
<body>
<!--登录-->
<!--<form id="login">-->
<!--<input type="text" id="account" name="account"/>-->
<!--<input type="password" id="password" name="password"/>-->
<!--<button id="button">登录</button>-->
<!--</form>-->

<!--<a href="javascript:(0)" id="doLogin">登录</a>-->

<div class="login-form">
    <div class="top-login">
        <span><img src="images/group.png" alt=""/></span>
    </div>
    <h1>登录</h1>
    <div class="login-top">
        <form id="login" method="post">
            <div class="login-ic">
                <i></i>
                <input type="text" name="account" value="User name" onFocus="this.value = '';"
                       onBlur="if (this.value == '') {this.value = 'User name';}"/>
                <div class="clear"></div>
            </div>
            <div class="login-ic">
                <i class="icon"></i>
                <input type="password" name="password" value="password" onFocus="this.value = '';"
                       onBlur="if (this.value == '') {this.value = 'password';}"/>
                <div class="clear"></div>
            </div>
            <div class="log-bwn">
                <button id="button">登录</button>
            </div>
        </form>
    </div>
    <p class="copy">© 2018 stackfing.com</p>
</div>


<script>
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

    <#--// <![CDATA[-->
    <#--/*[[${redirect}]]*/-->
    <#--// ]]>-->
    $(function () {
        $("#button").on('click', function () {
            $.ajax(
                {
                    type: "post",
                    url: "/login",
                    contentType: "application/json; charset=utf-8",
                    data: JSON.stringify($("#login").serializeObject()),
                    dataType: "json",
                    success: function (data) {
                        var redirect = '${redirect!}';
                        if (data.code == 200) {
                            if (redirect == '') {
                                 location.href = "http://localhost:8888";
                            } else {
                                location.href = redirect;
                            }
                        } else {
                            alert(data.message);
                        }
                    }
                }
            );
            return false;
        });
    });
</script>
</body>
</html>