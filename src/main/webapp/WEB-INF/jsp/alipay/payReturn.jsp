<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" deferredSyntaxAllowedAsLiteral="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<div class="text-center" style="padding-top: 50px;">
  	<div>
	<h1 class="title1">购买订单</h1>
	</div>
	<br />
	<hr />
	<br /> <br />
</div>

	<div class="col-md-offset-0">
	<div class="elegant-aero">
	
	<c:if test="${result==true}">
	
	<div class="row form-group" align="center">
	  <div>
      		<span>（づ￣3￣）づ╭❤～支付成功ヽ(✿ﾟ▽ﾟ)ノ</span>
      </div>
    </div>
	<div class="row form-group">
		<label class="control-label col-lg-3" for="name"><span class="spanstyle">商户订单号：</span></label>
        	<div class="col-md-7">
            	<span>${out_trade_no}</span>
           	</div>
   	</div>
   	<div class="row form-group">
		<label class="control-label col-lg-3" for="name"><span class="spanstyle">支付宝交易号：</span></label>
        	<div class="col-md-7">
            	<span>${trade_no}</span>
           	</div>
   	</div>
   	<div class="row form-group">
		<label class="control-label col-lg-3" for="name"><span class="spanstyle">订单金额：</span></label>
        	<div class="col-md-7">
            	<span>${total_amount} 元</span>
           	</div>
   	</div>
   	<div class="row form-group">
		<label class="control-label col-lg-3" for="name"><span class="spanstyle">获得积分：</span></label>
        	<div class="col-md-7">
            	<span>${creditSum}</span>
           	</div>
   	</div>

	</c:if>
	
	<c:if test="${result==false}">
			<div class="point">
        		<div class="expression">
           				 o(╥﹏╥)o
        		</div>
	        	<div>
	        	啊哦~支付失败了~
	        	</div>
			</div>
	</c:if>
	
</div>
</div>

<style>
.middle{
	margin:0 auto;
}
.point {
    text-align: center;
    width: 252px;
    color: #5c5c5c;
}

.point {
    width: 300px!important;
}
.point .text {
    font-size: 36px;
    line-height: 72px;
    font-weight: 700;
}
.point .expression {
    font-size: 48px;
    line-height: 50px;
    margin-bottom: 50px;
}
.elegant-aero {
margin-left: auto;
margin-right: auto;
max-width: 500px;
background: #D2E9FF;
padding: 20px 20px 20px 20px;
font: 12px Arial, Helvetica, sans-serif;
color: #666;
}
td{border: 1px solid transparent !important;}
.title1 {

background: #EEE url(data:image/gif;base64,iVBORw0KGgoAAAANSUhEUgAAAAQAAAAECAIAAAAmkwkpAAAAHklEQVQImWNkYGBgYGD4//8/A5wF5SBYyAr+//8PAPOCFO0Q2zq7AAAAAElFTkSuQmCC) repeat;

text-shadow: 3px -3px black, 2px -2px white;

font-weight: bold;

-webkit-text-fill-color: transparent;

-webkit-background-clip: text;

}

.title2 {

color: transparent;

-webkit-text-stroke: 1px black;

letter-spacing: 0.04em;

}

.elegant-aero label>span {
float: left;
color: #5E5E5E;
}

.elegant-aero label {
display: block;
margin: 0px 0px 5px;
}

.elegant-aero label>span {
float: left;
width: 100%;
text-align: left;
padding-right: 15px;
font-weight: bold;
}
.layui-card.layui-demo-maincard{
	width:auto;
	height:auto;
}
.spanstyle{
	padding-top:7px;
	text-align:left;
	font-weight: normal;
}

</style>