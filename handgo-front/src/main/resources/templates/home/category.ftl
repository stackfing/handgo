<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">

	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
		<meta name="viewport" content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=no">

		<title>分类</title>

		<link href="/AmazeUI-2.4.2/assets/css/amazeui.css" rel="stylesheet" type="text/css" />
		<link href="/AmazeUI-2.4.2/assets/css/admin.css" rel="stylesheet" type="text/css" />

		<link href="/basic/css/demo.css" rel="stylesheet" type="text/css" />

		<link href="/css/seastyle.css" rel="stylesheet" type="text/css" />
        <script type="text/javascript" src="/js/vue.js"></script>
		<script type="text/javascript" src="/basic/js/jquery-1.7.min.js"></script>
		<script type="text/javascript" src="/js/script.js"></script>
        <script type="text/javascript" src="/js/vue-resource.js"></script>
	</head>

	<body>

        <#include "../common/header.ftl">
    <div id="app">
			<div class="clear"></div>
			<b class="line"></b>
           <div class="search">
			<div class="search-list">
			<div class="nav-table">
					   <div class="long-title"><span class="all-goods">全部分类</span></div>
					   <div class="nav-cont">
							<ul>
								<li class="index"><a href="#">首页</a></li>
                                <li class="qc"><a href="#">闪购</a></li>
                                <li class="qc"><a href="#">限时抢</a></li>
                                <li class="qc"><a href="#">团购</a></li>
                                <li class="qc last"><a href="#">大包装</a></li>
							</ul>
						    <div class="nav-extra">
						    	<i class="am-icon-user-secret am-icon-md nav-user"></i><b></b>我的福利
						    	<i class="am-icon-angle-right" style="padding-left: 10px;"></i>
						    </div>
						</div>
			</div>
			
				
					<div class="am-g am-g-fixed">
						<div class="am-u-sm-12 am-u-md-12">
	                  	<div class="theme-popover">														
							<div class="searchAbout">
								<span class="font-pale">相关搜索：</span>
								<a title="坚果" href="#">坚果</a>
								<a title="瓜子" href="#">瓜子</a>
								<a title="鸡腿" href="#">豆干</a>

							</div>
							<ul class="select">
								<p class="title font-normal">
									<span class="fl">松子</span>
									<span class="total fl">搜索到<strong class="num">997</strong>件相关商品</span>
								</p>
								<div class="clear"></div>
								<li class="select-result">
									<dl>
										<dt>已选</dt>
										<dd class="select-no"></dd>
										<p class="eliminateCriteria">清除</p>
									</dl>
								</li>
								<div class="clear"></div>
								<li class="select-list">
									<dl id="select1">
										<dt class="am-badge am-round">品牌</dt>	
									
										 <div class="dd-conent">										
											<dd class="select-all selected"><a href="#">全部</a></dd>
											<dd><a href="#">百草味</a></dd>
											<dd><a href="#">良品铺子</a></dd>
											<dd><a href="#">新农哥</a></dd>
											<dd><a href="#">楼兰蜜语</a></dd>
											<dd><a href="#">口水娃</a></dd>
											<dd><a href="#">考拉兄弟</a></dd>
										 </div>
						
									</dl>
								</li>
								<li class="select-list">
									<dl id="select2">
										<dt class="am-badge am-round">种类</dt>
										<div class="dd-conent">
											<dd class="select-all selected"><a href="#">全部</a></dd>
											<dd><a href="#">东北松子</a></dd>
											<dd><a href="#">巴西松子</a></dd>
											<dd><a href="#">夏威夷果</a></dd>
											<dd><a href="#">松子</a></dd>
										</div>
									</dl>
								</li>
								<li class="select-list">
									<dl id="select3">
										<dt class="am-badge am-round">选购热点</dt>
										<div class="dd-conent">
											<dd class="select-all selected"><a href="#">全部</a></dd>
											<dd><a href="#">手剥松子</a></dd>
											<dd><a href="#">薄壳松子</a></dd>
											<dd><a href="#">进口零食</a></dd>
											<dd><a href="#">有机零食</a></dd>
										</div>
									</dl>
								</li>
					        
							</ul>
							<div class="clear"></div>
                        </div>
							<div class="search-content">
								<div class="sort">
									<li class="first"><a title="综合">综合排序</a></li>
									<li><a title="销量">销量排序</a></li>
									<li><a title="价格">价格优先</a></li>
									<li class="big"><a title="评价" href="#">评价为主</a></li>
								</div>
								<div class="clear"></div>

								<ul class="am-avg-sm-2 am-avg-md-3 am-avg-lg-4 boxes">
                                    <li v-for="item in items">
                                        <div class="i-pic limit">
                                            <a :href="'http://go.stackfing.com/item/' + item.id">
                                            <img src="/images/imgsearch1.jpg" />
                                            <p class="title fl">{{item.name}}</p>
                                            </a>
                                            <p class="price fl">
                                                <b>¥</b>
                                                <strong>{{item.currentPrice}}</strong>
                                            </p>
                                            <p class="number fl">
                                                销量<span>{{item.mothSale}}</span>
                                            </p>
                                        </div>
                                    </li>
									<#--<li>-->
										<#--<div class="i-pic limit">-->
											<#--<img src="/images/imgsearch1.jpg" />-->
											<#--<p class="title fl">【良品铺子旗舰店】手剥松子218g 坚果炒货零食新货巴西松子包邮</p>-->
											<#--<p class="price fl">-->
												<#--<b>¥</b>-->
												<#--<strong>56.90</strong>-->
											<#--</p>-->
											<#--<p class="number fl">-->
												<#--销量<span>1110</span>-->
											<#--</p>-->
										<#--</div>-->
									<#--</li>-->
									<#--<li>-->
										<#--<div class="i-pic limit">-->
											<#---->
											<#--<img src="/images/imgsearch1.jpg" />-->
											<#--<p class="title fl">手剥松子218g 坚果炒货零食新货巴西松子包邮</p>-->
											<#--<p class="price fl">-->
												<#--<b>¥</b>-->
												<#--<strong>56.90</strong>-->
											<#--</p>-->
											<#--<p class="number fl">-->
												<#--销量<span>1110</span>-->
											<#--</p>-->
										<#--</div>-->
									<#--</li>-->
									<#--<li>-->
										<#--<div class="i-pic limit">-->
											<#---->
											<#--<img src="/images/imgsearch1.jpg" />-->
											<#--<p class="title fl">【良品铺子旗舰店】手剥松子218g 坚果炒货零食新货巴西松子包邮</p>-->
											<#--<p class="price fl">-->
												<#--<b>¥</b>-->
												<#--<strong>56.90</strong>-->
											<#--</p>-->
											<#--<p class="number fl">-->
												<#--销量<span>1110</span>-->
											<#--</p>-->
										<#--</div>-->
									<#--</li>-->
									<#--<li>-->
										<#--<div class="i-pic limit">-->
											<#---->
											<#--<img src="/images/imgsearch1.jpg" />-->
											<#--<p class="title fl">手剥松子218g 坚果炒货零食新货巴西松子包邮</p>-->
											<#--<p class="price fl">-->
												<#--<b>¥</b>-->
												<#--<strong>56.90</strong>-->
											<#--</p>-->
											<#--<p class="number fl">-->
												<#--销量<span>1110</span>-->
											<#--</p>-->
										<#--</div>-->
									<#--</li>-->
									<#--<li>-->
										<#--<div class="i-pic limit">-->
											<#---->
											<#--<img src="/images/imgsearch1.jpg" />-->
											<#--<p class="title fl">【良品铺子旗舰店】手剥松子218g 坚果炒货零食新货巴西松子包邮</p>-->
											<#--<p class="price fl">-->
												<#--<b>¥</b>-->
												<#--<strong>56.90</strong>-->
											<#--</p>-->
											<#--<p class="number fl">-->
												<#--销量<span>1110</span>-->
											<#--</p>-->
										<#--</div>-->
									<#--</li>-->
									<#--<li>-->
										<#--<div class="i-pic limit">-->
											<#---->
											<#--<img src="/images/imgsearch1.jpg" />-->
											<#--<p class="title fl">【良品铺子旗舰店】手剥松子218g 坚果炒货零食新货巴西松子包邮</p>-->
											<#--<p class="price fl">-->
												<#--<b>¥</b>-->
												<#--<strong>56.90</strong>-->
											<#--</p>-->
											<#--<p class="number fl">-->
												<#--销量<span>1110</span>-->
											<#--</p>-->
										<#--</div>-->
									<#--</li>-->
									<#--<li>-->
										<#--<div class="i-pic limit">-->
											<#---->
											<#--<img src="/images/imgsearch1.jpg" />-->
											<#--<p class="title fl">【良品铺子旗舰店】手剥松子218g 坚果炒货零食新货巴西松子包邮</p>-->
											<#--<p class="price fl">-->
												<#--<b>¥</b>-->
												<#--<strong>56.90</strong>-->
											<#--</p>-->
											<#--<p class="number fl">-->
												<#--销量<span>1110</span>-->
											<#--</p>-->
										<#--</div>-->
									<#--</li>-->
									<#--<li>-->
										<#--<div class="i-pic limit">-->
											<#---->
											<#--<img src="/images/imgsearch1.jpg" />-->
											<#--<p class="title fl">【良品铺子旗舰店】手剥松子218g 坚果炒货零食新货巴西松子包邮</p>-->
											<#--<p class="price fl">-->
												<#--<b>¥</b>-->
												<#--<strong>56.90</strong>-->
											<#--</p>-->
											<#--<p class="number fl">-->
												<#--销量<span>1110</span>-->
											<#--</p>-->
										<#--</div>-->
									<#--</li>-->
									<#--<li>-->
										<#--<div class="i-pic limit">-->
											<#---->
											<#--<img src="/images/imgsearch1.jpg" />-->
											<#--<p class="title fl">【良品铺子旗舰店】手剥松子218g 坚果炒货零食新货巴西松子包邮</p>-->
											<#--<p class="price fl">-->
												<#--<b>¥</b>-->
												<#--<strong>56.90</strong>-->
											<#--</p>-->
											<#--<p class="number fl">-->
												<#--销量<span>1110</span>-->
											<#--</p>-->
										<#--</div>-->
									<#--</li>-->
									<#--<li>-->
										<#--<div class="i-pic limit">-->
											<#---->
											<#--<img src="/images/imgsearch1.jpg" />-->
											<#--<p class="title fl">【良品铺子旗舰店】手剥松子218g 坚果炒货零食新货巴西松子包邮</p>-->
											<#--<p class="price fl">-->
												<#--<b>¥</b>-->
												<#--<strong>56.90</strong>-->
											<#--</p>-->
											<#--<p class="number fl">-->
												<#--销量<span>1110</span>-->
											<#--</p>-->
										<#--</div>-->
									<#--</li>-->
									<#--<li>-->

                                            <#--<div class="i-pic limit">-->
                                                <#--<a href="http://go.stackfing.com/item/2">-->
                                                <#--<img src="/images/imgsearch1.jpg" />-->
                                                <#--<p class="title fl">【良品铺子旗舰店】手剥松子218g 坚果炒货零食新货巴西松子包邮</p>-->
                                                <#--</a>-->
                                                <#--<p class="price fl">-->
                                                    <#--<b>¥</b>-->
                                                    <#--<strong>56.90</strong>-->
                                                <#--</p>-->
                                                <#--<p class="number fl">-->
                                                    <#--销量<span>1110</span>-->
                                                <#--</p>-->
                                            <#--</div>-->

									<#--</li>-->
									<#--<li>-->
										<#--<div class="i-pic limit">-->
											<#---->
											<#--<img src="/images/imgsearch1.jpg" />-->
											<#--<p class="title fl">【良品铺子旗舰店】手剥松子218g 坚果炒货零食新货巴西松子包邮</p>-->
											<#--<p class="price fl">-->
												<#--<b>¥</b>-->
												<#--<strong>56.90</strong>-->
											<#--</p>-->
											<#--<p class="number fl">-->
												<#--销量<span>1110</span>-->
											<#--</p>-->
										<#--</div>-->
									<#--</li>-->
								<#--</ul>-->
							<#--</div>-->
							<#--<div class="search-side">-->

								<#--<div class="side-title">-->
									<#--经典搭配-->
								<#--</div>-->

								<#--<li>-->
									<#--<div class="i-pic check">-->
										<#--<img src="/images/cp.jpg" />-->
										<#--<p class="check-title">萨拉米 1+1小鸡腿</p>-->
										<#--<p class="price fl">-->
											<#--<b>¥</b>-->
											<#--<strong>29.90</strong>-->
										<#--</p>-->
										<#--<p class="number fl">-->
											<#--销量<span>1110</span>-->
										<#--</p>-->
									<#--</div>-->
								<#--</li>-->
								<#--<li>-->
									<#--<div class="i-pic check">-->
										<#--<img src="/images/cp2.jpg" />-->
										<#--<p class="check-title">ZEK 原味海苔</p>-->
										<#--<p class="price fl">-->
											<#--<b>¥</b>-->
											<#--<strong>8.90</strong>-->
										<#--</p>-->
										<#--<p class="number fl">-->
											<#--销量<span>1110</span>-->
										<#--</p>-->
									<#--</div>-->
								<#--</li>-->
								<#--<li>-->
									<#--<div class="i-pic check">-->
										<#--<img src="/images/cp.jpg" />-->
										<#--<p class="check-title">萨拉米 1+1小鸡腿</p>-->
										<#--<p class="price fl">-->
											<#--<b>¥</b>-->
											<#--<strong>29.90</strong>-->
										<#--</p>-->
										<#--<p class="number fl">-->
											<#--销量<span></span>-->
										<#--</p>-->
									<#--</div>-->
								<#--</li>-->

							</div>
							<div class="clear"></div>
							<!--分页 -->
							<ul class="am-pagination am-pagination-right">
								<li class="am-disabled"><a href="#">&laquo;</a></li>
								<li class="am-active"><a href="#">1</a></li>
								<li><a href="#">2</a></li>
								<li><a href="#">3</a></li>
								<li><a href="#">4</a></li>
								<li><a href="#">5</a></li>
								<li><a href="#">&raquo;</a></li>
							</ul>

						</div>
					</div>
					<#include "../common/footer.ftl">
				</div>

			</div>

		<!--引导 -->
		<div class="navCir">
			<li><a href="home2.ftl"><i class="am-icon-home "></i>首页</a></li>
			<li><a href="sort.html"><i class="am-icon-list"></i>分类</a></li>
			<li><a href="shopcart.ftl"><i class="am-icon-shopping-basket"></i>购物车</a></li>
			<li><a href="/person/index.html"><i class="am-icon-user"></i>我的</a></li>
		</div>

		<!--菜单 -->
		<div class=tip>
			<div id="sidebar">
				<div id="wrap">
					<div id="prof" class="item">
						<a href="#">
							<span class="setting"></span>
						</a>
						<div class="ibar_login_box status_login">
							<div class="avatar_box">
								<p class="avatar_imgbox"><img src="/images/no-img_mid_.jpg" /></p>
								<ul class="user_info">
									<li>用户名：sl1903</li>
									<li>级&nbsp;别：普通会员</li>
								</ul>
							</div>
							<div class="login_btnbox">
								<a href="#" class="login_order">我的订单</a>
								<a href="#" class="login_favorite">我的收藏</a>
							</div>
							<i class="icon_arrow_white"></i>
						</div>

					</div>
					<div id="shopCart" class="item">
						<a href="#">
							<span class="message"></span>
						</a>
						<p>
							购物车
						</p>
						<p class="cart_num">0</p>
					</div>
					<div id="asset" class="item">
						<a href="#">
							<span class="view"></span>
						</a>
						<div class="mp_tooltip">
							我的资产
							<i class="icon_arrow_right_black"></i>
						</div>
					</div>

					<div id="foot" class="item">
						<a href="#">
							<span class="zuji"></span>
						</a>
						<div class="mp_tooltip">
							我的足迹
							<i class="icon_arrow_right_black"></i>
						</div>
					</div>

					<div id="brand" class="item">
						<a href="#">
							<span class="wdsc"><img src="/images/wdsc.png" /></span>
						</a>
						<div class="mp_tooltip">
							我的收藏
							<i class="icon_arrow_right_black"></i>
						</div>
					</div>

					<div id="broadcast" class="item">
						<a href="#">
							<span class="chongzhi"><img src="/images/chongzhi.png" /></span>
						</a>
						<div class="mp_tooltip">
							我要充值
							<i class="icon_arrow_right_black"></i>
						</div>
					</div>

					<div class="quick_toggle">
						<li class="qtitem">
							<a href="#"><span class="kfzx"></span></a>
							<div class="mp_tooltip">客服中心<i class="icon_arrow_right_black"></i></div>
						</li>
						<!--二维码 -->
						<li class="qtitem">
							<a href="#none"><span class="mpbtn_qrcode"></span></a>
							<div class="mp_qrcode" style="display:none;"><img src="/images/weixin_code_145.png" /><i class="icon_arrow_white"></i></div>
						</li>
						<li class="qtitem">
							<a href="#top" class="return_top"><span class="top"></span></a>
						</li>
					</div>

					<!--回到顶部 -->
					<div id="quick_links_pop" class="quick_links_pop hide"></div>

				</div>

			</div>
			<div id="prof-content" class="nav-content">
				<div class="nav-con-close">
					<i class="am-icon-angle-right am-icon-fw"></i>
				</div>
				<div>
					我
				</div>
			</div>
			<div id="shopCart-content" class="nav-content">
				<div class="nav-con-close">
					<i class="am-icon-angle-right am-icon-fw"></i>
				</div>
				<div>
					购物车
				</div>
			</div>
			<div id="asset-content" class="nav-content">
				<div class="nav-con-close">
					<i class="am-icon-angle-right am-icon-fw"></i>
				</div>
				<div>
					资产
				</div>

				<div class="ia-head-list">
					<a href="#" target="_blank" class="pl">
						<div class="num">0</div>
						<div class="text">优惠券</div>
					</a>
					<a href="#" target="_blank" class="pl">
						<div class="num">0</div>
						<div class="text">红包</div>
					</a>
					<a href="#" target="_blank" class="pl money">
						<div class="num">￥0</div>
						<div class="text">余额</div>
					</a>
				</div>

			</div>
			<div id="foot-content" class="nav-content">
				<div class="nav-con-close">
					<i class="am-icon-angle-right am-icon-fw"></i>
				</div>
				<div>
					足迹
				</div>
			</div>
			<div id="brand-content" class="nav-content">
				<div class="nav-con-close">
					<i class="am-icon-angle-right am-icon-fw"></i>
				</div>
				<div>
					收藏
				</div>
			</div>
			<div id="broadcast-content" class="nav-content">
				<div class="nav-con-close">
					<i class="am-icon-angle-right am-icon-fw"></i>
				</div>
				<div>
					充值
				</div>
			</div>
		</div>
		<script>
			window.jQuery || document.write('<script src="basic/js/jquery-1.9.min.js"><\/script>');
		</script>
		<script type="text/javascript" src="/basic/js/quick_links.js"></script>

<div class="theme-popover-mask"></div>
    </div>
    <script type="text/javascript">
        new Vue({
            el: '#app',
            data: {
                items: []
            },
            mounted() {
                this.$http.get('http://go.stackfing.com/category/page/1').then(res=>{
                    //这里写数据渲染
                    this.items = res.body.data
                })
            }
        })
    </script>
	</body>

</html>