<!DOCTYPE html>
<html lang="en" />
<head>
    <meta charset="UTF-8" />
    <link type="text/css" rel="stylesheet" href="/static/css/layui.css">
    <script src="/static/layui.all.js"></script>
    <script src="/static/js/jquery-3.2.1.min.js"></script>
</head>
<body>
<div class="layui-layout layui-layout-admin">
    <div class="layui-header">
        <div class="layui-logo layui-bg-red">HandGo 管理后台</div>
        <!-- 头部区域（可配合layui已有的水平导航） -->
        <ul class="layui-nav layui-layout-right">
        <#--<li class="layui-nav-item">-->
        <#--<a href="javascript:;">-->
        <#--<img src="http://t.cn/RCzsdCq" class="layui-nav-img">-->
        <#--贤心-->
        <#--<span class="layui-nav-more"></span></a>-->
        <#--<dl class="layui-nav-child">-->
        <#--<dd><a href="">基本资料</a></dd>-->
        <#--<dd><a href="">安全设置</a></dd>-->
        <#--</dl>-->
        <#--</li>-->
            <li class="layui-nav-item"><a href="">退出系统</a></li>
            <span class="layui-nav-bar" style="left: 131.891px; top: 55px; width: 0px; opacity: 0;"></span></ul>
    </div>

    <div class="layui-side layui-bg-black">
        <div class="layui-side-scroll">
            <!-- 左侧导航区域（可配合layui已有的垂直导航） -->
            <ul class="layui-nav layui-nav-tree" lay-filter="test">
                <li class="layui-nav-item layui-nav-itemed">
                    <a class="" href="javascript:;">商品管理<span class="layui-nav-more"></span></a>
                    <dl class="layui-nav-child">
                        <dd class="layui-this"><a href="javascript:;" data-url="/productPage">商品列表</a></dd>
                        <dd><a href="javascript:;" data-url="/admin/addProduct">添加商品</a></dd>
                    </dl>
                </li>
                <li class="layui-nav-item layui-nav-itemed">
                    <a href="javascript:;">商品分类管理<span class="layui-nav-more"></span></a>
                    <dl class="layui-nav-child">
                        <dd><a href="javascript:;" data-url="/admin/productCategory">分类列表</a></dd>
                        <dd><a href="javascript:;" data-url="/admin/addProductCategory">添加分类</a></dd>
                    </dl>
                </li>
                <li class="layui-nav-item layui-nav-itemed">
                    <a href="javascript:;">会员管理<span class="layui-nav-more"></span></a>
                    <dl class="layui-nav-child">
                        <dd><a href="javascript:;" data-url="/admin/vipMember">会员列表</a></dd>
                    <#--<dd><a href="javascript:;" data-url="/admin/vipCard">会员卡列表</a></dd>-->
                    <#--<dd><a href="javascript:;" data-url="/admin/addVipMember">添加会员</a></dd>-->
                    </dl>
                </li>
                <li class="layui-nav-item layui-nav-itemed">
                    <a href="javascript:;">订单管理<span class="layui-nav-more"></span></a>
                    <dl class="layui-nav-child">
                        <dd><a href="javascript:;" data-url="/admin/order">订单列表</a></dd>
                    <#--<dd><a href="javascript:;" data-url="/admin/addOrder">添加订单</a></dd>-->
                    </dl>
                </li>
            <#--<li class="layui-nav-item layui-nav-itemed">-->
            <#--<a href="javascript:;">商品分类<span class="layui-nav-more"></span></a>-->
            <#--<dl class="layui-nav-child">-->
            <#--<dd><a href="javascript:;">分类列表</a></dd>-->
            <#--<dd><a href="javascript:;">添加分类</a></dd>-->
            <#--</dl>-->
            <#--</li>-->
            <#--<li class="layui-nav-item"><a href="">云市场</a></li>-->
            <#--<li class="layui-nav-item"><a href="">发布商品</a></li>-->
                <span class="layui-nav-bar"></span></ul>
        </div>
    </div>
    <div class="layui-body" overflow="auto">
        <!-- 内容主体区域 -->
        <iframe id="framecontent" class="layui-col-md12" src="/productPage" height="99%" overflow="auto" frameborder=0 marginheight=0 marginwidth=0 scrolling=no></iframe>
    </div>

</div>
<script>
    $('.layui-nav-child').children('dd').children('a').on('click', function () {
        $('#framecontent').attr('src', $(this).attr('data-url'));
    });
</script>
<script src="/static/layui.all.js"></script>
</body>
</html>
