<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" deferredSyntaxAllowedAsLiteral="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<div class="text-center">
	<h1>购买订单</h1>
</div>
<div class="text-center" align="center">
	<c:if test="${result==true}">
		<table class="table elegant-aero"
			style="width: 500px; margin-top: 100px; text-align: center;">
			<tr>
				<td colspan="2">
					<strong>（づ￣3￣）づ╭❤～支付成功ヽ(✿ﾟ▽ﾟ)ノ</strong>
				</td>
			</tr>
			<tr>
				<td>
					<strong>商户订单号:</strong>
				</td>
				<td>
					<strong>${out_trade_no}</strong>
				</td>
			</tr>
			<tr>
				<td>
					<strong>支付宝交易号:</strong>
				</td>
				<td>
					<strong>${trade_no}</strong>
				</td>
			</tr>
			<tr>
				<td>
					<strong>订单金额:</strong>
				</td>
				<td>
					<strong>${total_amount} 元</strong>
				</td>
			</tr>
			<tr>
				<td>
					<strong>获得积分:</strong>
				</td>
				<td>
					<strong>${creditSum}</strong>
				</td>
			</tr>
			
		</table>
	</c:if>
	<c:if test="${result==false}">
		<div class="col-md-offset-5">
			<div class="point">
        		<div class="expression">
           				 o(╥﹏╥)o
        		</div>
	        	<div>
	        	啊哦~支付失败了~
	        	</div>
			</div>
		</div>
	</c:if>
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
</style>