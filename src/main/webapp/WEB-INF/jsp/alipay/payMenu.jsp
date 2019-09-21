<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" deferredSyntaxAllowedAsLiteral="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<script src="${pageContext.request.contextPath}/plug/js/payMenu/googlegg.js"></script>
<style type="text/css">
* {
	margin: 0;
	padding: 0;
	list-style-type: none;
}

a, img {
	border: 0;
	text-decoration: none;
}

.clearfix:after {
	visibility: hidden;
	display: block;
	font-size: 0;
	content: " ";
	clear: both;
	height: 0
}

* html .clearfix {
	height: 1%
}

.solution-list {
	position: relative;
	height: 412px;
	z-index: 9;
	width: 1200px;
	margin: 0 auto;
}

.short-bar {
	position: absolute;
	top: 187px;
	left: 50%;
	margin-left: -15px;
	width: 30px;
	height: 3px;
	background-color: #fff
}

.active .short-bar {
	top: 201px;
	background-color: #009dff
}

.solution-list ul li {
	float: left;
	width: 240px;
	position: relative;
	height: 412px;
	transition: all .5s;
	-moz-transition: all .5s;
	-webkit-transition: all .5s;
	-o-transition: all .5s
}

.solution-item-wrapper {
	width: 240px;
	height: 412px;
	background:
		url(${pageContext.request.contextPath}/plug/img/payMenu/solution_item_bg_01.jpg)
		center no-repeat
}

.solution-item-02 {
	background-image:
		url(${pageContext.request.contextPath}/plug/img/payMenu/solution_item_bg_02.jpg)
}

.solution-item-03 {
	background-image:
		url(${pageContext.request.contextPath}/plug/img/payMenu/solution_item_bg_03.jpg)
}

.solution-item-04 {
	background-image:
		url(${pageContext.request.contextPath}/plug/img/payMenu/solution_item_bg_04.jpg)
}

.solution-item-05 {
	background-image:
		url(${pageContext.request.contextPath}/plug/img/payMenu/solution_item_bg_05.jpg)
}

.active .solution-item-wrapper {
	position: absolute;
	z-index: 9;
	top: -62px;
	left: -51px;
	width: 341px;
	height: 526px;
	background:
		url(${pageContext.request.contextPath}/plug/img/payMenu/solution_item_bg_active_01.jpg)
		no-repeat;
	-webkit-box-shadow: 0 5px 40px rgba(0, 0, 0, .5);
	-moz-box-shadow: 0 5px 40px rgba(0, 0, 0, .5);
	box-shadow: 0 5px 40px rgba(0, 0, 0, .5)
}

@media only screen and (max-width:1400px) {
	.product-special-li-5.active .solution-item-wrapper {
		left: -102px
	}
}

.active .solution-item-02 {
	background-image:
		url(${pageContext.request.contextPath}/plug/img/payMenu/solution_item_bg_active_02.jpg)
}

.active .solution-item-03 {
	background-image:
		url(${pageContext.request.contextPath}/plug/img/payMenu/solution_item_bg_active_03.jpg)
}

.active .solution-item-04 {
	background-image:
		url(${pageContext.request.contextPath}/plug/img/payMenu/solution_item_bg_active_04.jpg)
}

.active .solution-item-05 {
	background-image:
		url(${pageContext.request.contextPath}/plug/img/payMenu/solution_item_bg_active_05.jpg)
}

.solution-list ul li p.solution-title {
	position: absolute;
	top: 211px;
	width: 100%;
	text-align: center;
	color: #fff;
	font-size: 18px;
	z-index: 2
}

.solution-list ul li p.solution-intro {
	position: absolute;
	top: 282px;
	left: 50%;
	margin-left: -121px;
	width: 242px;
	overflow: hidden;
	color: #eee;
	line-height: 2;
	z-index: 2;
	opacity: 0;
	filter: alpha(opacity = 0);
	font-size: 14px;
	text-align: justify
}

.solution-list ul li a {
	display: none;
	position: absolute;
	top: 452px;
	left: 50%;
	margin-left: -87px;
	width: 174px;
	height: 40px;
	line-height: 40px;
	text-align: center;
	font-size: 14px;
	color: #fff;
	z-index: 2;
	background-color: #0af
}

.solution-list ul li a:hover {
	background-color: #0099e5;
	transition: all .6s;
	-moz-transition: all .6s;
	-webkit-transition: all .6s;
	-o-transition: all .6s
}

.solution-list ul li.active p.solution-title {
	top: 158px;
	font-size: 22px
}

.solution-list ul li.active p.solution-intro {
	top: 230px;
	opacity: 1;
	filter: alpha(opacity = 100)
}

.solution-list ul li.active a {
	top: 50%;
	display: block
}
</style>
<div class="text-center">
	<h1>积分购买</h1>
</div>
<div style="height: 50px;"></div>
<br/>
<div class="solution-list">
	<ul id="solutionList" class="clearfix">
		<li>
			<div class="solution-item-wrapper solution-item-01">
				<p class="solution-title">30元</p>
				<div class="short-bar"></div>
				<a href="${pageContext.request.contextPath}/alipay/payPage?money=30">立即充值</a>
			</div>
		</li>
		<li>
			<div class="solution-item-wrapper solution-item-02">
				<p class="solution-title">60元</p>
				<div class="short-bar"></div>
				<a href="${pageContext.request.contextPath}/alipay/payPage?money=60">立即充值</a>
			</div>
		</li>
		<li class="active">
			<div class="solution-item-wrapper solution-item-03">
				<p class="solution-title">100元</p>
				<div class="short-bar"></div>
				<a
					href="${pageContext.request.contextPath}/alipay/payPage?money=100">立即充值</a>
			</div>
		</li>
		<li>
			<div class="solution-item-wrapper solution-item-04">
				<p class="solution-title">200元</p>
				<div class="short-bar"></div>
				<a
					href="${pageContext.request.contextPath}/alipay/payPage?money=200">立即充值</a>
			</div>
		</li>
		<li class="product-special-li-5">
			<div class="solution-item-wrapper solution-item-05">
				<p class="solution-title">自定义充值</p>
				<div class="short-bar"></div>
				<a href="${pageContext.request.contextPath}/alipay/payPage?money=0">立即充值</a>
			</div>
		</li>
	</ul>
</div>
<script type="text/javascript">
	$(document).ready(function() {
		var b = $("#solutionList li");
		b.mouseover(function() {
			var e = $(this);
			b.removeClass("active");
			e.addClass("active")
		});
	});
</script>