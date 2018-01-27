<!DOCTYPE html>
<html>

	<head>
		<meta charset="utf-8">
		<meta name="viewport" content="width=device-width, initial-scale=1.0,maximum-scale=1.0, user-scalable=0">

		<title>个人中心</title>

		<link href="../AmazeUI-2.4.2/assets/css/admin.css" rel="stylesheet" type="text/css">
		<link href="../AmazeUI-2.4.2/assets/css/amazeui.css" rel="stylesheet" type="text/css">
		<link href="../css/personal.css" rel="stylesheet" type="text/css">
		<link href="../css/vipstyle.css" rel="stylesheet" type="text/css">
		<script src="../AmazeUI-2.4.2/assets/js/jquery.min.js"></script>
		<script src="../AmazeUI-2.4.2/assets/js/amazeui.js"></script>
	</head>

	<body>
		<!--头 -->
        <#include "../common/header.ftl">
		<div class="nav-table">
			<div class="long-title"><span class="all-goods">全部分类</span></div>
            <#include "../common/nav-content.ftl">
		</div>
		<b class="line"></b>
		<div class="center">
			<div class="col-main">
				<div class="main-wrap">
					<div class="wrap-left">
						<div class="wrap-list">
							<div class="m-user">
								<!--个人信息 -->

								<div class="m-userinfo">
									<a href="news.html">
										<div class="tipsBox"><i class="am-icon-envelope"></i></div>
									</a>
									<div class="m-baseinfo">
										<a class="m-pic" href="information.html">
											<img src="../images/getAvatar.do.jpg">
										</a>
										<div class="m-info">
											<em class="s-name">小叮当</em>
											<div class="vip1"><a href="#"><span></span><em>会员专享</em></a></div>
											<div class="safeText"><a href="safety.html">账户安全:<em style="margin-left:20px ;">60</em>分</a>
												<div class="progressBar"><span style="left: -95px;" class="progress"></span></div>
											</div>
											<div class="m-address">
												<a href="address.html" class="i-trigger">收货地址<i class="am-icon-angle-right" style="padding-left:5px ;"></i></a>
											</div>
										</div>
									</div>
									<div class="m-right">
										<div class="m-new">
											<a href="news.html"><i class="am-icon-dropbox  am-icon-md" style="padding-right:5px ;"></i>消息盒子</a>
										</div>

									</div>
								</div>

								<!--个人资产-->
								<div class="m-userproperty">
									<div class="s-bar">
										<i class="s-icon"></i>个人资产
									</div>
									<p class="m-coupon">
										<a href="coupon.html">
											<em class="m-num">2</em>
											<span class="m-title">优惠券</span>
										</a>
									</p>
									<p class="m-wallet">
										<a href="wallet.html">
											<em class="m-num">0.00</em>
											<span class="m-title">账户余额</span>
										</a>
									</p>
									<p class="m-bill">
										<a href="pointnew.html">
											<em class="m-num">10</em>
											<span class="m-title">总积分</span>
										</a>
									</p>
								</div>

								<!--我的钱包-->
								<div class="wallet">
									<div class="s-bar">
										<i class="s-icon"></i>商城钱包
									</div>
									<p class="m-big squareS">
										<a href="#">
											<i><img src="../images/shopping.png"/></i>
											<span class="m-title">能购物</span>
										</a>
									</p>
									<p class="m-big squareA">
										<a href="#">
											<i><img src="../images/safe.png"/></i>
											<span class="m-title">够安全</span>
										</a>
									</p>
									<p class="m-big squareL">
										<a href="#">
											<i><img src="../images/profit.png"/></i>
											<span class="m-title">很灵活</span>
										</a>
									</p>
								</div>

							</div>
							<div class="box-container-bottom"></div>

							<!--订单 -->
							<div class="m-order">
								<div class="s-bar">
									<i class="s-icon"></i>我的订单
									<a class="i-load-more-item-shadow" href="order.html">全部订单</a>
								</div>
								<ul>
									<li><a href="order.html"><i><img src="../images/pay.png"/></i><span>待付款</span></a></li>
									<li><a href="order.html"><i><img src="../images/send.png"/></i><span>待发货<em class="m-num">1</em></span></a></li>
									<li><a href="order.html"><i><img src="../images/receive.png"/></i><span>待收货</span></a></li>
									<li><a href="order.html"><i><img src="../images/comment.png"/></i><span>待评价<em class="m-num">3</em></span></a></li>
									<li><a href="change.html"><i><img src="../images/refund.png"/></i><span>退换货</span></a></li>
								</ul>
								<div class="orderContentBox">
									<div class="orderContent">
										<div class="orderContentpic">
											<div class="imgBox">
												<a href="orderinfo.html"><img src="../images/youzi.jpg"></a>
											</div>
										</div>
										<div class="detailContent">
											<a href="orderinfo.html" class="delivery">签收</a>
											<div class="orderID">
												<span class="time">2016-03-09</span>
												<span class="splitBorder">|</span>
												<span class="time">21:52:47</span>
											</div>
											<div class="orderID">
												<span class="num">共1件商品</span>
											</div>
										</div>
										<div class="state">待评价</div>
										<div class="price"><span class="sym">¥</span>23.<span class="sym">80</span></div>

									</div>
									<a href="javascript:void(0);" class="btnPay">再次购买</a>
								</div>

								<div class="orderContentBox">
									<div class="orderContent">
										<div class="orderContentpic">
											<div class="imgBox">
												<a href="orderinfo.html"><img src="../images/heart.jpg"></a>
											</div>
										</div>
										<div class="detailContent">
											<a href="orderinfo.html" class="delivery">派件</a>
											<div class="orderID">
												<span class="time">2016-03-09</span>
												<span class="splitBorder">|</span>
												<span class="time">21:52:47</span>
											</div>
											<div class="orderID">
												<span class="num">共2件商品</span>
											</div>
										</div>
										<div class="state">已发货</div>
										<div class="price"><span class="sym">¥</span>246.<span class="sym">50</span></div>

									</div>
									<a href="javascript:void(0);" class="btnPay">再次购买</a>
								</div>
							</div>
							<!--九宫格-->
							<div class="user-squaredIcon">
								<div class="s-bar">
									<i class="s-icon"></i>我的常用
								</div>
								<ul>
									<a href="order.html">
										<li class="am-u-sm-4"><i class="am-icon-truck am-icon-md"></i>
											<p>物流查询</p>
										</li>
									</a>
									<a href="collection.html">
										<li class="am-u-sm-4"><i class="am-icon-heart am-icon-md"></i>
											<p>我的收藏</p>
										</li>
									</a>
									<a href="foot.html">
										<li class="am-u-sm-4"><i class="am-icon-paw am-icon-md"></i>
											<p>我的足迹</p>
										</li>
									</a>
									<a href="#">
										<li class="am-u-sm-4"><i class="am-icon-gift am-icon-md"></i>
											<p>为你推荐</p>
										</li>
									</a>
									<a href="blog.html">
										<li class="am-u-sm-4"><i class="am-icon-share-alt am-icon-md"></i>
											<p>我的分享</p>
										</li>
									</a>
									<a href="../home/home2.ftl">
										<li class="am-u-sm-4"><i class="am-icon-clock-o am-icon-md"></i>
											<p>限时活动</p>
										</li>
									</a>

								</ul>
							</div>

							<div class="user-suggestion">
								<div class="s-bar">
									<i class="s-icon"></i>会员中心
								</div>
								<div class="s-bar">
									<a href="suggest.html"><i class="s-icon"></i>意见反馈</a>
								</div>
							</div>

							<!--优惠券积分-->
							<div class="twoTab">
								<div class="twoTabModel Coupon">
									<h5 class="squareTitle"><a href="#"><span class="splitBorder"></span>优惠券<i class="am-icon-angle-right"></i></a></h5>
									<div class="Box">
										<div class="CouponList">
											<span class="price">¥<strong class="num">50</strong></span>
	                                        <p class="brandName"><a href="#">ABC品牌499减50</a></p>
	                                        <p class="discount">满<span>499</span>元抵扣</p>
                                            <a  href="#" class="btnReceive">立即领取</a>
										</div>
									</div>
								</div>
								<div class="twoTabModel credit">
									<h5 class="squareTitle"><a href="#"><span class="splitBorder"></span>积分商城<i class="am-icon-angle-right"></i></a></h5>
									<div class="Box">
										<p class="countDown">
											<span class="hour">12</span>：<span class="minute">09</span>：<span class="second">02</span><em class="txtStart">即将开始</em>
										</p>
										<div class="am-slider am-slider-default am-slider-carousel" data-am-flexslider="{itemWidth:108, itemMargin:3, slideshow: false}">
											<ul class="am-slides">
												<li><a href="#"><img src="../images/333.jpg" /></a></li>
												<li><a href="#"><img src="../images/222.jpg" /></a></li>
												<li><a href="#"><img src="../images/111.jpg" /></a></li>
												<li><a href="#"><img src="../images/333.jpg" /></a></li>
												<li><a href="#"><img src="../images/222.jpg" /></a></li>
												<li><a href="#"><img src="../images/111.jpg" /></a></li>
											</ul>
										</div>
									</div>
								</div>
							</div>

						</div>
					</div>
					<div class="wrap-right">

						<!-- 日历-->
						<div class="day-list">
							<div class="s-title">
								每日新鲜事
							</div>
							<div class="s-box">
								<ul>
									<li><a><p>粮油冲锋周 满128减18</p></a></li>
									<li><a><p>防晒这么重要的事怎能随意</p></a></li>
									<li><a><p>春日护肤面膜不可少，你选对了吗？</p></a></li>
									<li><a><p>纯粹时尚，摩登出游，吸睛美衣</p></a></li>
									<li><a><p>粮油冲锋周 满128减18</p></a></li>
									<li><a><p>春日护肤面膜不可少，你选对了吗？</p></a></li>									
								</ul>
							</div>
						</div>
						<!--新品 -->
						<div class="new-goods">
							<div class="s-bar">
								<i class="s-icon"></i>今日新品
								<a class="i-load-more-item-shadow">15款新品</a>
							</div>
							<div class="new-goods-info">
								<a class="shop-info" href="#">
									<div class="face-img-panel">
										<img src="../images/imgsearch1.jpg" alt="">
									</div>
									<span class="new-goods-num ">4</span>
									<span class="shop-title">剥壳松子</span>
								</a>
								<a class="follow">收藏</a>
							</div>
						</div>						

						<!--热卖推荐 -->
						<div class="new-goods">
							<div class="s-bar">
								<i class="s-icon"></i>热卖推荐
							</div>
							<div class="new-goods-info">
								<a class="shop-info" href="#" target="_blank">
									<div >
										<img src="../images/666.jpg" alt="">
									</div>
                                    <span class="one-hot-goods">￥189.60</span>
								</a>
							</div>
						</div>						
     				</div>
     				<div class="clear"></div>
     				
     				<!--收藏和足迹-->
     				 <div data-am-widget="tabs" class="am-tabs collection">
                         <ul class="am-tabs-nav am-cf">
                         	<li class="am-active"><a href="[data-tab-panel-0]"><i class="am-icon-heart"></i>商品收藏</a></li>
                            <li class=""><a href="[data-tab-panel-1]"><i class="am-icon-paw"></i>购物足迹</a></li>
                        </ul>
                        <div class="am-tabs-bd">

                            <div data-tab-panel-0 class="am-tab-panel am-active">
                        		<div class="am-slider am-slider-default am-slider-carousel" data-am-flexslider="{itemWidth:155,slideshow: false}">
									<ul class="am-slides">
                                       <li>
                                       	  <a><img class="am-thumbnail" src="../images/EZA27501.jpg" /></a>
                                       	  <strong class="price">¥32.9</strong>
                                       </li>
                                       <li>
                                       	  <a><img class="am-thumbnail" src="../images/BxJk6.jpg" /></a>
                                       	  <strong class="price">¥32.9</strong>
                                       </li>
                                       <li>
                                       	  <a><img class="am-thumbnail" src="../images/Hxcag60.jpg" /></a>
                                       	  <strong class="price">¥32.9</strong>
                                       </li>
                                       <li>
                                       	  <a><img class="am-thumbnail" src="../images/youzi.jpg" /></a>
                                       	  <strong class="price">¥32.9</strong>
                                       </li>
                                       <li>
                                       	  <a><img class="am-thumbnail" src="../images/EZA27501.jpg" /></a>
                                       	  <strong class="price">¥32.9</strong>
                                       </li>
                                       <li>
                                       	  <a><img class="am-thumbnail" src="../images/BxJk6.jpg" /></a>
                                       	  <strong class="price">¥32.9</strong>
                                       </li>
                                       <li>
                                       	  <a><img class="am-thumbnail" src="../images/Hxcag60.jpg" /></a>
                                       	  <strong class="price">¥32.9</strong>
                                       </li>
                                       <li>
                                       	  <a><img class="am-thumbnail" src="../images/youzi.jpg" /></a>
                                       	  <strong class="price">¥32.9</strong>
                                       </li>

									</ul>
								</div>
                            </div>
                            <div data-tab-panel-1 class="am-tab-panel "> 
                        		<div class="am-slider am-slider-default am-slider-carousel" data-am-flexslider="{itemWidth:155, slideshow: false}">
									<ul class="am-slides">
                                       <li>
                                       	  <a><img class="am-thumbnail" src="../images/BxJk6.jpg" /></a>
                                       	  <strong class="price">¥32.9</strong>
                                       </li>
                                       <li>
                                       	  <a><img class="am-thumbnail" src="../images/Hxcag60.jpg" /></a>
                                       	  <strong class="price">¥32.9</strong>
                                       </li>
                                       <li>
                                       	  <a><img class="am-thumbnail" src="../images/youzi.jpg" /></a>
                                       	  <strong class="price">¥32.9</strong>
                                       </li>
                                       <li>
                                       	  <a><img class="am-thumbnail" src="../images/EZA27501.jpg" /></a>
                                       	  <strong class="price">¥32.9</strong>
                                       </li>
                                       <li>
                                       	  <a><img class="am-thumbnail" src="../images/BxJk6.jpg" /></a>
                                       	  <strong class="price">¥32.9</strong>
                                       </li>
                                       <li>
                                       	  <a><img class="am-thumbnail" src="../images/Hxcag60.jpg" /></a>
                                       	  <strong class="price">¥32.9</strong>
                                       </li>
                                       <li>
                                       	  <a><img class="am-thumbnail" src="../images/youzi.jpg" /></a>
                                       	  <strong class="price">¥32.9</strong>
                                       </li>
                                       <li>
                                       	  <a><img class="am-thumbnail" src="../images/EZA27501.jpg" /></a>
                                       	  <strong class="price">¥32.9</strong>
                                       </li>
									</ul>
								</div>                            	
                            </div>
                        </div>
                     </div>


				</div>
				<!--底部-->
				<#include "../common/footer.ftl">

			</div>

			<#include "../common/person/aside-menu.ftl">
		</div>
		<!--引导 -->
		<div class="navCir">
			<li><a href="/"><i class="am-icon-home "></i>首页</a></li>
			<li><a href="../home/sort.html"><i class="am-icon-list"></i>分类</a></li>
			<li><a href="../home/shopcart.ftl"><i class="am-icon-shopping-basket"></i>购物车</a></li>
			<li class="active"><a href="index.html"><i class="am-icon-user"></i>我的</a></li>
		</div>
	</body>

</html>