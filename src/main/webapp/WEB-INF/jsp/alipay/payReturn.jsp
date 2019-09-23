<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" deferredSyntaxAllowedAsLiteral="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<div class="text-center">
	<h1>购买订单</h1>
</div>
<div class="text-center" align="center">
	<c:if test="${result==true}">
		<table class="table table-bordered table-striped"
			style="width: 500px; margin-top: 100px; text-align: center;">
			<tr>
				<td colspan="2">
					<strong>支付成功</strong>
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
		<h1>支付失败</h1>
	</c:if>
</div>