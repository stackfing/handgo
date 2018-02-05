<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
        "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <meta name="viewport"
          content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=no">

    <title>首页</title>

    <link href="../AmazeUI-2.4.2/assets/css/amazeui.css" rel="stylesheet" type="text/css"/>
    <link href="../AmazeUI-2.4.2/assets/css/admin.css" rel="stylesheet" type="text/css"/>

    <link href="../basic/css/demo.css" rel="stylesheet" type="text/css"/>

    <link href="../css/hmstyle.css" rel="stylesheet" type="text/css"/>
    <script src="../AmazeUI-2.4.2/assets/js/jquery.min.js"></script>
    <script src="../AmazeUI-2.4.2/assets/js/amazeui.min.js"></script>

</head>

<body>
<#include "../common/header.ftl">
<b class="line"></b>
<div class="shopNav">
    <div class="slideall" style="height: auto;">

        <div class="long-title"><span class="all-goods">全部分类</span></div>
    <#--<div class="nav-cont">-->
    <#--<ul>-->
    <#--<li class="index"><a href="#">首页</a></li>-->
    <#--<li class="qc"><a href="#">闪购</a></li>-->
    <#--<li class="qc"><a href="#">限时抢</a></li>-->
    <#--<li class="qc"><a href="#">团购</a></li>-->
    <#--<li class="qc last"><a href="#">大包装</a></li>-->
    <#--</ul>-->
    <#--<div class="nav-extra">-->
    <#--<i class="am-icon-user-secret am-icon-md nav-user"></i><b></b>我的福利-->
    <#--<i class="am-icon-angle-right" style="padding-left: 10px;"></i>-->
    <#--</div>-->
    <#--</div>-->
        <#include "../common/nav-content.ftl">
        <div class="bannerTwo">
            <!--轮播 -->
            <div class="am-slider am-slider-default scoll" data-am-flexslider id="demo-slider-0">
                <ul class="am-slides">
                    <li class="banner1"><a href="introduction.html"><img src="../images/aa5.jpg"/></a></li>
                    <li class="banner2"><a><img src="../images/aa6.jpg"/></a></li>
                    <li class="banner3"><a><img src="../images/aa7.jpg"/></a></li>
                    <li class="banner4"><a><img src="../images/aa8.jpg"/></a></li>
                </ul>
            </div>

            <div class="clear"></div>
        </div>

        <!--侧边导航 -->
        <div id="nav" class="navfull" style="position: static;">
            <div class="area clearfix">
                <div class="category-content" id="guide_2">

                    <div class="category" style="box-shadow:none ;margin-top: 2px;">
                        <ul class="category-list navTwo" id="js_climit_li">
                                            <#list categorys as item>
                                                <li data-url="${item.id!}">
                                                    <div class="category-info">
                                                        <h3 class="category-name b-category-name"><i><img
                                                                src="../images/cake.png"></i><a class="ml-22"
                                                                                                title="点心">${item.name!}</a>
                                                        </h3>
                                                        <em>&gt;</em></div>
                                                    <div class="menu-item menu-in top">
                                                        <div class="area-in">
                                                            <div class="area-bg">
                                                                <div class="menu-srot">
                                                                    <div class="sort-side">
                                                                    <#--<dl class="dl-sort">-->
                                                                    <#--<dt><span title="蛋糕">蛋糕</span></dt>-->
                                                                    <#--<dd><a title="蒸蛋糕" href="#"><span>蒸蛋糕</span></a></dd>-->
                                                                    <#--<dd><a title="脱水蛋糕" href="#"><span>脱水蛋糕</span></a></dd>-->
                                                                    <#--<dd><a title="瑞士卷" href="#"><span>瑞士卷</span></a></dd>-->
                                                                    <#--<dd><a title="软面包" href="#"><span>软面包</span></a></dd>-->
                                                                    <#--<dd><a title="马卡龙" href="#"><span>马卡龙</span></a></dd>-->
                                                                    <#--<dd><a title="千层饼" href="#"><span>千层饼</span></a></dd>-->
                                                                    <#--<dd><a title="甜甜圈" href="#"><span>甜甜圈</span></a></dd>-->
                                                                    <#--<dd><a title="蒸三明治" href="#"><span>蒸三明治</span></a></dd>-->
                                                                    <#--<dd><a title="铜锣烧" href="#"><span>铜锣烧</span></a></dd>-->
                                                                    <#--</dl>-->
                                                                    <#--<dl class="dl-sort">-->
                                                                    <#--<dt><span title="蛋糕">点心</span></dt>-->
                                                                    <#--<dd><a title="蒸蛋糕" href="#"><span>蒸蛋糕</span></a></dd>-->
                                                                    <#--<dd><a title="脱水蛋糕" href="#"><span>脱水蛋糕</span></a></dd>-->
                                                                    <#--<dd><a title="瑞士卷" href="#"><span>瑞士卷</span></a></dd>-->
                                                                    <#--<dd><a title="软面包" href="#"><span>软面包</span></a></dd>-->
                                                                    <#--<dd><a title="马卡龙" href="#"><span>马卡龙</span></a></dd>-->
                                                                    <#--<dd><a title="千层饼" href="#"><span>千层饼</span></a></dd>-->
                                                                    <#--<dd><a title="甜甜圈" href="#"><span>甜甜圈</span></a></dd>-->
                                                                    <#--<dd><a title="蒸三明治" href="#"><span>蒸三明治</span></a></dd>-->
                                                                    <#--<dd><a title="铜锣烧" href="#"><span>铜锣烧</span></a></dd>-->
                                                                    <#--</dl>-->

                                                                    </div>
                                                                    <div class="brand-side">
                                                                        <dl class="dl-sort">
                                                                            <dt><span>实力商家</span></dt>
                                                                            <dd><a rel="nofollow" title="呵官方旗舰店"
                                                                                   target="_blank" href="#"
                                                                                   rel="nofollow"><span
                                                                                    class="red">呵官方旗舰店</span></a></dd>
                                                                            <dd><a rel="nofollow" title="格瑞旗舰店"
                                                                                   target="_blank" href="#"
                                                                                   rel="nofollow"><span>格瑞旗舰店</span></a>
                                                                            </dd>
                                                                            <dd><a rel="nofollow" title="飞彦大厂直供"
                                                                                   target="_blank" href="#"
                                                                                   rel="nofollow"><span
                                                                                    class="red">飞彦大厂直供</span></a></dd>
                                                                            <dd><a rel="nofollow" title="红e·艾菲妮"
                                                                                   target="_blank" href="#"
                                                                                   rel="nofollow"><span>红e·艾菲妮</span></a>
                                                                            </dd>
                                                                            <dd><a rel="nofollow" title="本真旗舰店"
                                                                                   target="_blank" href="#"
                                                                                   rel="nofollow"><span
                                                                                    class="red">本真旗舰店</span></a></dd>
                                                                            <dd><a rel="nofollow" title="杭派女装批发网"
                                                                                   target="_blank" href="#"
                                                                                   rel="nofollow"><span
                                                                                    class="red">杭派女装批发网</span></a></dd>
                                                                        </dl>
                                                                    </div>
                                                                </div>
                                                            </div>
                                                        </div>
                                                    </div>
                                                    <b class="arrow"></b>
                                                </li>
                                            </#list>

                        <#--<li >-->
                        <#--<div class="category-info">-->
                        <#--<h3 class="category-name b-category-name"><i><img src="../images/fish.png"></i><a class="ml-22" title="海味、河鲜">海味/河鲜</a></h3>-->
                        <#--<em>&gt;</em></div>-->
                        <#--<div class="menu-item menu-in top">-->
                        <#--<div class="area-in">-->
                        <#--<div class="area-bg">-->
                        <#--<div class="menu-srot">-->
                        <#--<div class="sort-side">-->
                        <#--<dl class="dl-sort">-->
                        <#--<dt><span title="海带丝">海带丝</span></dt>-->
                        <#--<dd><a title="蒸蛋糕" href="#"><span>蒸蛋糕</span></a></dd>-->
                        <#--<dd><a title="脱水蛋糕" href="#"><span>脱水蛋糕</span></a></dd>-->
                        <#--<dd><a title="瑞士卷" href="#"><span>瑞士卷</span></a></dd>-->
                        <#--<dd><a title="软面包" href="#"><span>软面包</span></a></dd>-->
                        <#--<dd><a title="马卡龙" href="#"><span>马卡龙</span></a></dd>-->
                        <#--<dd><a title="千层饼" href="#"><span>千层饼</span></a></dd>-->
                        <#--<dd><a title="甜甜圈" href="#"><span>甜甜圈</span></a></dd>-->
                        <#--<dd><a title="蒸三明治" href="#"><span>蒸三明治</span></a></dd>-->
                        <#--<dd><a title="铜锣烧" href="#"><span>铜锣烧</span></a></dd>-->
                        <#--</dl>-->
                        <#--<dl class="dl-sort">-->
                        <#--<dt><span title="小鱼干">小鱼干</span></dt>-->
                        <#--<dd><a title="蒸蛋糕" href="#"><span>蒸蛋糕</span></a></dd>-->
                        <#--<dd><a title="脱水蛋糕" href="#"><span>脱水蛋糕</span></a></dd>-->
                        <#--<dd><a title="瑞士卷" href="#"><span>瑞士卷</span></a></dd>-->
                        <#--<dd><a title="软面包" href="#"><span>软面包</span></a></dd>-->
                        <#--</dl>-->
                        <#--<dl class="dl-sort">-->
                        <#--<dt><span title="鱿鱼丝">鱿鱼丝</span></dt>-->
                        <#--<dd><a title="蒸蛋糕" href="#"><span>蒸蛋糕</span></a></dd>-->
                        <#--<dd><a title="脱水蛋糕" href="#"><span>脱水蛋糕</span></a></dd>-->
                        <#--<dd><a title="瑞士卷" href="#"><span>瑞士卷</span></a></dd>-->
                        <#--<dd><a title="软面包" href="#"><span>软面包</span></a></dd>-->
                        <#--</dl>-->
                        <#--</div>-->
                        <#--<div class="brand-side">-->
                        <#--<dl class="dl-sort"><dt><span>实力商家</span></dt>-->
                        <#--<dd><a rel="nofollow" title="歌芙品牌旗舰店" target="_blank" href="#" rel="nofollow"><span  class="red" >歌芙品牌旗舰店</span></a></dd>-->
                        <#--<dd><a rel="nofollow" title="爱丝蓝内衣厂" target="_blank" href="#" rel="nofollow"><span >爱丝蓝内衣厂</span></a></dd>-->
                        <#--<dd><a rel="nofollow" title="炫点服饰" target="_blank" href="#" rel="nofollow"><span >炫点服饰</span></a></dd>-->
                        <#--<dd><a rel="nofollow" title="雪茵美内衣厂批发" target="_blank" href="#" rel="nofollow"><span >雪茵美内衣厂批发</span></a></dd>-->
                        <#--<dd><a rel="nofollow" title="金钻夫人" target="_blank" href="#" rel="nofollow"><span >金钻夫人</span></a></dd>-->
                        <#--<dd><a rel="nofollow" title="伊美莎内衣" target="_blank" href="#" rel="nofollow"><span  class="red" >伊美莎内衣</span></a></dd>-->
                        <#--<dd><a rel="nofollow" title="粉客内衣旗舰店" target="_blank" href="#" rel="nofollow"><span >粉客内衣旗舰店</span></a></dd>-->
                        <#--<dd><a rel="nofollow" title="泽芳行旗舰店" target="_blank" href="#" rel="nofollow"><span >泽芳行旗舰店</span></a></dd>-->
                        <#--<dd><a rel="nofollow" title="彩婷" target="_blank" href="#" rel="nofollow"><span  class="red" >彩婷</span></a></dd>-->
                        <#--<dd><a rel="nofollow" title="黛兰希" target="_blank" href="#" rel="nofollow"><span >黛兰希</span></a></dd>-->
                        <#--<dd><a rel="nofollow" title="香港优蓓尔防辐射" target="_blank" href="#" rel="nofollow"><span >香港优蓓尔防辐射</span></a></dd>-->
                        <#--<dd><a rel="nofollow" title="蓉莉娜内衣批发" target="_blank" href="#" rel="nofollow"><span >蓉莉娜内衣批发</span></a></dd>-->
                        <#--</dl>-->
                        <#--</div>-->
                        <#--</div>-->
                        <#--</div>-->
                        <#--</div>-->
                        <#--</div>-->
                        <#--<b class="arrow"></b>-->
                        <#--</li>-->

                        </ul>
                    </div>
                </div>

            </div>
        </div>
        <!--导航 -->
        <script type="text/javascript">

            // if(!window.localStorage){
            //     alert("浏览器支持localstorage");
            // }else{
            //     var storage=window.localStorage;
            //     //写入a字段
            //     storage["a"]=1;
            //     //写入b字段
            //     storage.b=1;
            //     //写入c字段
            //     storage.setItem("c",3);
            //     console.log(storage.a);
            //     // console.log(typeof storage["a"]);
            //     // console.log(typeof storage["b"]);
            //     // console.log(typeof storage["c"]);
            //     /*分割线*/
            //     storage.a=4;
            //     console.log(storage.a);
            //     if (storage.a != null) {
            //         alert('not null');
            //     }
            //     storage.clear();
            //     // if (storage.a == null) {
            //     //     alert('null');
            //     // }
            // }


            (function () {
                $('.am-slider').flexslider();
            });

            $(document).ready(function () {
                //拿到storage
                var storage = window.localStorage;
                //清空storage
                storage.clear();
                //鼠标经过事件
                $(".category-list li").hover(function () {
                    //在这里添加动态显示菜单栏
                    // sort-side
                    var hoverTag = $(this).attr('data-url');
                    if (!storage) {
                        alert('您的浏览器不支持localStorage!');
                    } else {
                        //在这里添加数据渲染
                        // $(".sort-side .dl-sort").append('<button>asdfasdf</button>');

                        if (storage[hoverTag] == null) {
                            //localStorage为空
                            $.ajax({
                                url: '/v1/category/' + $(this).attr('data-url'),
                                cache: true,
                                type: 'get',
                                success: function (data) {
                                    var content = '<dl class="dl-sort"><dt><span title="' + data.name + '">' + data.name + '</span></dt>';
                                    var sub = data.subCategories;
                                    for (var i = 0; i < sub.length; i++) {
                                        content += '<dd><a title="' + sub[i].name + '" href="/category/' + sub[i].id + '"><span>' + sub[i].name + '</span></a></dd>';
                                    }
                                    content += '<dl>';
                                    $("li .menu-srot .sort-side").append(content);
                                    storage[hoverTag] = content;
                                }
                            });
                        } else {
                            //不为空
                            $("li .menu-srot .sort-side").append(storage[$(this).attr('data-url')]);
                        }
                    }

                    $(".category-content .category-list li.first .menu-in").css("display", "none");
                    $(".category-content .category-list li.first").removeClass("hover");
                    $(this).addClass("hover");
                    $(this).children("div.menu-in").css("display", "block")
                }, function () {
                    $(this).removeClass("hover")
                    $(this).children("div.menu-in").css("display", "none")
                    $(".menu-srot .sort-side").html('');
                });
            })
        </script>


        <!--小导航 -->
        <div class="am-g am-g-fixed smallnav">
            <div class="am-u-sm-3">
                <a href="sort.html"><img src="../images/navsmall.jpg"/>
                    <div class="title">商品分类</div>
                </a>
            </div>
            <div class="am-u-sm-3">
                <a href="#"><img src="../images/huismall.jpg"/>
                    <div class="title">大聚惠</div>
                </a>
            </div>
            <div class="am-u-sm-3">
                <a href="http://i.stackfing.com/"><img src="../images/mansmall.jpg"/>
                    <div class="title">个人中心</div>
                </a>
            </div>
            <div class="am-u-sm-3">
                <a href="#"><img src="../images/moneysmall.jpg"/>
                    <div class="title">投资理财</div>
                </a>
            </div>
        </div>


        <!--各类活动-->
        <div class="row">
            <li><a><img src="../images/row1.jpg"/></a></li>
            <li><a><img src="../images/row2.jpg"/></a></li>
            <li><a><img src="../images/row3.jpg"/></a></li>
            <li><a><img src="../images/row4.jpg"/></a></li>
        </div>
        <div class="clear"></div>
        <!--走马灯 -->

        <div class="marqueenTwo">
            <span class="marqueen-title"><i class="am-icon-volume-up am-icon-fw"></i>商城头条<em
                    class="am-icon-angle-double-right"></em></span>
            <div class="demo">

                <ul>
                <#--<li class="title-first"><a target="_blank" href="#">-->
                <#--<img src="../images/TJ2.jpg"></img>-->
                <#--<span>[特惠]</span>洋河年末大促，低至两件五折-->
                <#--</a></li>-->
                <#--<li class="title-first"><a target="_blank" href="#">-->
                <#--<span>[公告]</span>商城与广州市签署战略合作协议-->
                <#--<img src="../images/TJ.jpg"></img>-->
                <#--<p>XXXXXXXXXXXXXXXXXX</p>-->
                <#--</a></li>-->

                    <#list Notices as notice>
                        <#if (notice.photo) ??>
                        <#--不存在-->
                         <li><a target="_blank" href="/"><span>${notice.type!}</span>${notice.title}</a></li>
                        <#else>
                        <#--存在-->
                    <li class="title-first"><a target="_blank" href="/">
                        <img src="${notice.photo!}"></img>
                        <span>${notice.type!}</span>${notice.title!}
                    </a></li>
                        </#if>
                    </#list>

                </ul>

            </div>
        </div>
        <div class="clear"></div>

    </div>


    <script type="text/javascript">
        if ($(window).width() < 640) {
            function autoScroll(obj) {
                $(obj).find("ul").animate({
                    marginTop: "-39px"
                }, 500, function () {
                    $(this).css({
                        marginTop: "0px"
                    }).find("li:first").appendTo(this);
                })
            }

            $(function () {
                setInterval('autoScroll(".demo")', 3000);
            })
        }
    </script>
</div>
<div class="shopMainbg">
    <div class="shopMain" id="shopmain">

        <!--热门活动 -->

        <#if (killList??)>
            <div class="am-container">

                <div class="sale-mt">
                    <i></i>
                    <em class="sale-title">限时秒杀</em>
                    <div class="s-time" id="countdown">
                        <span class="hh">01</span>
                        <span class="mm">20</span>
                        <span class="ss">59</span>
                    </div>
                </div>

                        <#list killList as item>
                        <div class="am-u-sm-3 sale-item">
                            <div class="s-img">
                                <a href="http://go.stackfing.com/item/${item.id!}"><img src="${item.photo!}"/></a>
                            </div>
                            <div class="s-info">
                                <a href="http://go.stackfing.com/item/${item.id}"><p class="s-title">${item.name!}</p>
                                </a>
                                <div class="s-price">￥<b>${item.price!}</b>
                                    <a class="s-buy" href="${item.id!}">秒杀</a>
                                </div>
                            </div>
                        </div>
                        </#list>


            </div>
        </#if>
    </div>
    <div class="clear "></div>




    <#if (commendList??) >
        <#list commendList as commend>
        <div class="f${commend_index!}">
            <!--甜点-->

            <div class="am-container ">
                <div class="shopTitle ">
                    <h4 class="floor-title">${commend.title!}</h4>
                    <div class="floor-subtitle"><em class="am-icon-caret-left"></em>
                        <h3>${commend.subtitle}</h3></div>
                <#--<div class="today-brands " style="right:0px ;top:13px;">-->
                <#--<a href="# ">桂花糕</a>|-->
                <#--<a href="# ">奶皮酥</a>|-->
                <#--<a href="# ">栗子糕 </a>|-->
                <#--<a href="# ">马卡龙</a>|-->
                <#--<a href="# ">铜锣烧</a>|-->
                <#--<a href="# ">豌豆黄</a>-->
                <#--</div>-->

                </div>
            </div>

        <div class="am-g am-g-fixed floodSix ">
        <div class="am-u-sm-5 am-u-md-3 text-one list">
            <div class="word">
                        <#list (commend.categoryList) as item>
                            <a class="outer" href="#"><span class="inner"><b class="text">${item.name}</b></span></a>
                        </#list>
            </div>
                    <#list (commend.starProduct) as start>

                        <#if (start_index) == 0>
                        <a href="/item/${start.id!}">
                            <img src="../images/5.jpg"/>
                            <div class="outer-con ">
                                <div class="title ">
                                    ${start.title!}
                                </div>
                                <div class="sub-title ">
                                    ￥${start.price!}
                                </div>
                            </div>
                        </a>
                    <div class="triangle-topright"></div>
                </div>
                        <#elseif (start_index) == 1>
                    <div class="am-u-sm-7 am-u-md-5 am-u-lg-2 text-two big">

                        <div class="outer-con ">
                            <div class="title ">
                                ${start.title!}
                            </div>
                            <div class="sub-title ">
                                ¥${start.price!}
                            </div>

                        </div>
                        <a href="/item/${start.id!}"><img src="${start.photo!}"/></a>
                    </div>
                        <#elseif (start_index == 2)>
                <li>
                    <div class="am-u-md-2 am-u-lg-2 text-three">
                        <div class="boxLi"></div>
                        <div class="outer-con ">
                            <div class="title ">
                                ${start.title!}
                            </div>
                            <div class="sub-title ">
                                ¥${start.price!}
                            </div>

                        </div>
                        <a href="/item/${start.id!}"><img src="${start.photo!}"/></a>
                    </div>
                </li>
                        <#elseif (start_index == 3)>
                    <li>
                        <div class="am-u-md-2 am-u-lg-2 text-three sug">
                            <div class="boxLi"></div>
                            <div class="outer-con ">
                                <div class="title ">
                                    ${start.title!}
                                </div>
                                <div class="sub-title ">
                                    ¥${start.price!}
                                </div>

                            </div>
                            <a href="/item/${start.id!}"><img src="${start.photo!}"/></a>
                        </div>
                    </li>
                        <#elseif (start_index == 4)>
                    <li>
                        <div class="am-u-sm-4 am-u-md-5 am-u-lg-4 text-five">
                            <div class="boxLi"></div>
                            <div class="outer-con ">
                                <div class="title ">
                                    ${start.title!}
                                </div>
                                <div class="sub-title ">
                                    ¥${start.price!}
                                </div>

                            </div>
                            <a href="/item/${start.id!}"><img src="${start.photo!}"/></a>
                        </div>
                    </li>
                        <#elseif (start_index == 5)>
                    <li>
                        <div class="am-u-sm-4 am-u-md-2 am-u-lg-2 text-six">
                            <div class="boxLi"></div>
                            <div class="outer-con ">
                                <div class="title ">
                                    ${start.title!}
                                </div>
                                <div class="sub-title ">
                                    ¥${start.price!}
                                </div>

                            </div>
                            <a href="/item/${start.id!}"><img src="${start.photo!}"/></a>
                        </div>
                    </li>
                        <#elseif (start_index == 6)>
                    <li>
                        <div class="am-u-sm-4 am-u-md-2 am-u-lg-4 text-six">
                            <div class="boxLi"></div>
                            <div class="outer-con ">
                                <div class="title ">
                                    ${start.title!}
                                </div>
                                <div class="sub-title ">
                                    ¥${start.price!}
                                </div>

                            </div>
                            <a href="/item/${start.id!}"><img src="${start.photo!}"/></a>
                        </div>
                    </li>
            </div>
                        </#if>

                    </#list>

            <div class="clear "></div>
        </div>
        </#list>
    </#if>

<#--footer-->
    <#include "../common/footer.ftl">
</div>

<!--引导 -->
<div class="navCir">
    <li class="active"><a href="http://go.stackfing.com/"><i class="am-icon-home "></i>首页</a></li>
    <li><a href="sort.html"><i class="am-icon-list"></i>分类</a></li>
    <li><a href="shopcart"><i class="am-icon-shopping-basket"></i>购物车</a></li>
    <li><a href="http://i.stackfing.com/"><i class="am-icon-user"></i>我的</a></li>
</div>
<!--菜单 -->
<div class=tip>
    <div id="sidebar">
        <div id="wrap">
            <div id="prof" class="item ">
                <a href="# ">
                    <span class="setting "></span>
                </a>
                <div class="ibar_login_box status_login ">
                    <div class="avatar_box ">
                        <p class="avatar_imgbox "><img src="../images/no-img_mid_.jpg "/></p>
                        <ul class="user_info ">
                            <li>用户名：sl1903</li>
                            <li>级&nbsp;别：普通会员</li>
                        </ul>
                    </div>
                    <div class="login_btnbox ">
                        <a href="# " class="login_order ">我的订单</a>
                        <a href="# " class="login_favorite ">我的收藏</a>
                    </div>
                    <i class="icon_arrow_white "></i>
                </div>

            </div>
            <div id="shopCart " class="item ">
                <a href="# ">
                    <span class="message "></span>
                </a>
                <p>
                    购物车
                </p>
                <p class="cart_num ">0</p>
            </div>
            <div id="asset " class="item ">
                <a href="# ">
                    <span class="view "></span>
                </a>
                <div class="mp_tooltip ">
                    我的资产
                    <i class="icon_arrow_right_black "></i>
                </div>
            </div>

            <div id="foot " class="item ">
                <a href="# ">
                    <span class="zuji "></span>
                </a>
                <div class="mp_tooltip ">
                    我的足迹
                    <i class="icon_arrow_right_black "></i>
                </div>
            </div>

            <div id="brand " class="item ">
                <a href="#">
                    <span class="wdsc "><img src="../images/wdsc.png "/></span>
                </a>
                <div class="mp_tooltip ">
                    我的收藏
                    <i class="icon_arrow_right_black "></i>
                </div>
            </div>

            <div id="broadcast " class="item ">
                <a href="# ">
                    <span class="chongzhi "><img src="../images/chongzhi.png "/></span>
                </a>
                <div class="mp_tooltip ">
                    我要充值
                    <i class="icon_arrow_right_black "></i>
                </div>
            </div>

            <div class="quick_toggle ">
                <li class="qtitem ">
                    <a href="# "><span class="kfzx "></span></a>
                    <div class="mp_tooltip ">客服中心<i class="icon_arrow_right_black "></i></div>
                </li>
                <!--二维码 -->
                <li class="qtitem ">
                    <a href="#none "><span class="mpbtn_qrcode "></span></a>
                    <div class="mp_qrcode " style="display:none; "><img src="../images/weixin_code_145.png "/><i
                            class="icon_arrow_white "></i></div>
                </li>
                <li class="qtitem ">
                    <a href="#top " class="return_top "><span class="top "></span></a>
                </li>
            </div>

            <!--回到顶部 -->
            <div id="quick_links_pop " class="quick_links_pop hide "></div>

        </div>

    </div>
    <div id="prof-content " class="nav-content ">
        <div class="nav-con-close ">
            <i class="am-icon-angle-right am-icon-fw "></i>
        </div>
        <div>
            我
        </div>
    </div>
    <div id="shopCart-content " class="nav-content ">
        <div class="nav-con-close ">
            <i class="am-icon-angle-right am-icon-fw "></i>
        </div>
        <div>
            购物车
        </div>
    </div>
    <div id="asset-content " class="nav-content ">
        <div class="nav-con-close ">
            <i class="am-icon-angle-right am-icon-fw "></i>
        </div>
        <div>
            资产
        </div>

        <div class="ia-head-list ">
            <a href="# " target="_blank " class="pl ">
                <div class="num ">0</div>
                <div class="text ">优惠券</div>
            </a>
            <a href="# " target="_blank " class="pl ">
                <div class="num ">0</div>
                <div class="text ">红包</div>
            </a>
            <a href="# " target="_blank " class="pl money ">
                <div class="num ">￥0</div>
                <div class="text ">余额</div>
            </a>
        </div>

    </div>
    <div id="foot-content " class="nav-content ">
        <div class="nav-con-close ">
            <i class="am-icon-angle-right am-icon-fw "></i>
        </div>
        <div>
            足迹
        </div>
    </div>
    <div id="brand-content " class="nav-content ">
        <div class="nav-con-close ">
            <i class="am-icon-angle-right am-icon-fw "></i>
        </div>
        <div>
            收藏
        </div>
    </div>
    <div id="broadcast-content " class="nav-content ">
        <div class="nav-con-close ">
            <i class="am-icon-angle-right am-icon-fw "></i>
        </div>
        <div>
            充值
        </div>
    </div>
</div>
<script>
    window.jQuery || document.write('<script src="basic/js/jquery.min.js "><\/script>');
</script>
<script type="text/javascript " src="../basic/js/quick_links.js "></script>
</body>

</html>