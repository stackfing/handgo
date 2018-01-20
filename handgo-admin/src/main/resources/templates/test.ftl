<!DOCTYPE html>
<html lang="en" />
<head>
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <meta name="apple-mobile-web-app-status-bar-style" content="black">
    <meta name="apple-mobile-web-app-capable" content="yes">
    <meta name="format-detection" content="telephone=no">
    <link type="text/css" rel="stylesheet" href="/static/css/layui.css">
    <script src="/static/layui.all.js"></script>
    <script src="/static/js/jquery-3.2.1.min.js"></script>
</head>
<body>


<div id="header" class="layui-show-lg-block layui-col-xs12 layui-col-sm12 layui-col-lg12">
    <ul class="layui-nav" id="bars" lay-filter="">
        <li class="layui-nav-item layui-hide-xs"><a href="">最新活动</a></li>
        <li class="layui-nav-item layui-hide-xs layui-this"><a href="">产品</a></li>
        <li class="layui-nav-item layui-hide-xs"><a href="">大数据</a></li>
        <li class="layui-nav-item layui-hide-xs">
            <a href="javascript:;">解决方案</a>
            <dl class="layui-nav-child"> <!-- 二级菜单 -->
                <dd><a href="">移动模块</a></dd>
                <dd><a href="">后台模版</a></dd>
                <dd><a href="">电商平台</a></dd>
            </dl>
        </li>
        <li class="layui-nav-item layui-hide-xs"><a href="">社区</a></li>
        <li class="layui-nav-item layui-hide-xs">
            <a href="">控制台<span class="layui-badge">9</span></a>
        </li>
        <li class="layui-nav-item layui-hide-xs">
            <a href="">个人中心<span class="layui-badge-dot"></span></a>
        </li>
        <li class="layui-nav-item">
            <a href=""><img src="" class="layui-nav-img">我</a>
            <dl class="layui-nav-child">
                <dd><a href="javascript:;">修改信息</a></dd>
                <dd><a href="javascript:;">安全管理</a></dd>
                <dd><a href="javascript:;">退了</a></dd>
            </dl>
        </li>
    </ul>
</div>
<div id="sideBar" class="layui-col-md2">
    <ul class="layui-nav layui-nav-tree layui-show-md-block layui-bg-black" style="width: 100%;!important;float: left;" lay-filter="demo">
        <li class="layui-nav-item layui-nav-itemed">
            <a href="javascript:;">默认展开</a>
            <dl class="layui-nav-child">
                <dd><a href="javascript:;">选项一</a></dd>
                <dd><a href="javascript:;">选项二</a></dd>
                <dd><a href="javascript:;">选项三</a></dd>
                <dd><a href="">跳转项</a></dd>
            </dl>
        </li>
        <li class="layui-nav-item">
            <a href="javascript:;">解决方案</a>
            <dl class="layui-nav-child">
                <dd><a href="">移动模块</a></dd>
                <dd><a href="">后台模版</a></dd>
                <dd><a href="">电商平台</a></dd>
            </dl>
        </li>
        <li class="layui-nav-item"><a href="">云市场</a></li>
        <li class="layui-nav-item"><a href="">社区</a></li>
    </ul>
</div>
<div id="mybody" class="layui-col-md10">
    <iframe width="100%" src="http://baidu.com"></iframe>
</div>
<script>
    $('.layui-nav-child').children('dd').children('a').on('click', function () {
        $('#framecontent').attr('src', $(this).attr('data-url'));
    });
</script>
<script src="/static/layui.all.js"></script>
</body>
</html>
