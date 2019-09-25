<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" deferredSyntaxAllowedAsLiteral="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<div class="table-responsive text-center">
	<div class="text-center">
		<h1>积分购买</h1>
	</div>
	<form name="alipayment" id="alipayment" action="${pageContext.request.contextPath}/alipay/doPay?uId=${loginUser.uId}" method="post" accept-charset="utf-8" onsubmit="return doPay()">
		<div align="center">
			<table class="table table-bordered table-striped elegant-aero"
				style="width: 500px; margin-top: 100px; text-align: center;">
				<tr>
					<td><strong>商户订单号 ：</strong></td>
					<td><input id="WIDout_trade_no" name="WIDout_trade_no" /></td>
				</tr>
				<tr>
					<td><strong>订单名称 ：</strong></td>
					<td><input id="WIDsubject" name="WIDsubject" /></td>
				</tr>
				<tr>
					<td><strong>付款金额 ：</strong></td>
					<td><input id="WIDtotal_amount" name="WIDtotal_amount" /></td>
				</tr>
				<tr>
					<td colspan="2">
						<span class="new-btn-login-sp">
							<input class="btn btn-success new-btn-login" type="submit" value="支付">
						</span>
					</td>
				</tr>
			</table>
		</div>
		<input id="WIDbody" name="WIDbody" type="hidden" />
	</form>
</div>
<script type="text/javascript">
	function GetDateNow() {
		var vNow = new Date();
		var sNow = "";
		var money = ${money};
		sNow += String(vNow.getFullYear());
		sNow += String(vNow.getMonth() + 1);
		sNow += String(vNow.getDate());
		sNow += String(vNow.getHours());
		sNow += String(vNow.getMinutes());
		sNow += String(vNow.getSeconds());
		sNow += String(vNow.getMilliseconds());
		document.getElementById("WIDout_trade_no").value = sNow;
		document.getElementById("WIDsubject").value = "积分充值";
		document.getElementById("WIDtotal_amount").value = money;
	}
	GetDateNow();
</script>
<script type="text/javascript">
	function doPay() {
		var money = document.getElementById("WIDtotal_amount").value;
		console.info(money+typeof money);
		if (money < 10) {
			layer.msg("充值金额必须大于10元！", {
				time : 2000,
				icon : 5,
				shift : 6
			}, function() {
			});
			return false;
		} else {
			if (money >= 10000) {
				layer.msg("充值金额不可大于10000！", {
					time : 2000,
					icon : 5,
					shift : 6
				}, function() {
				});
				return false;
			}
			return true;
		}
	}
</script>
<style>
.elegant-aero {
margin-left: auto;
margin-right: auto;
max-width: 500px;
background: #D2E9FF;
padding: 20px 20px 20px 20px;
font: 12px Arial, Helvetica, sans-serif;
color: #666;
}
</style>