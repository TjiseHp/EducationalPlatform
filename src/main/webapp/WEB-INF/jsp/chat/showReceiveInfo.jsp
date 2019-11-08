<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" deferredSyntaxAllowedAsLiteral="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<div align="center" style="padding-top: 50px;">
<div>
		<h1 class="title1">信息</h1>
	    </div>	
	    <br/>
	    <hr/>
	    <br/>
	    <br/>
	<form>
		<table width="100%">
			<tr>
				<td class="text-right" style="color: #999;font-size:10px; background-color: #E4F3FB	;"><strong>发件人：</strong></td>
				<td class="text-left" style="color: #999;font-size:10px; background-color: #E4F3FB	;"><strong>${chat.user1.uName}&nbsp;<span style="color: #999;font-size:10px;">${chat.user1.uEmail}</span></strong>
				</td>
			</tr>
			<tr>
				<td class="text-right" style="color: #999;font-size:10px; background-color: #E4F3FB	;"><strong>时间：</strong></td>
				<td class="text-left" style="color: #999;font-size:10px; background-color: #E4F3FB	;"><strong><fmt:formatDate value="${chat.chatDate}"
						pattern="yyyy-MM-dd HH:mm:ss" /></strong></td>
			</tr>
			<tr>
				<td class="text-right" style="color: #999;font-size:10px; background-color: #E4F3FB	;"><strong>收件人：</strong></td>
				<td class="text-left" style="color: #999;font-size:10px; background-color: #E4F3FB ;"><strong>${chat.user2.uName}&nbsp;<span style="color: #999;font-size:10px;">${chat.user2.uEmail}</span></strong>
				</td>
			</tr>
			<tr>
				<td class="text-right" style="color: #999;font-size:10px;"><strong>内容：</strong></td>
				<td><strong style="font-size: 15px;">${chat.chatText}</strong></td>
			</tr>
			<tr>
				<td colspan="2" class="text-center"><a
					class="btn btn-danger" role="button" href="javascript:;"
					onclick="doReply();">回复</a> <a class="btn btn-danger"
					role="button" href="javascript:;" onclick="doback('${chat.uId}');">返回</a>
				</td>
			</tr>


		</table>
	</form>
	<script type="text/javascript">
		function doback(uId) {
			window.location.href = "${pageContext.request.contextPath}/chat/stuMessageCenter?uId="
					+ uId;
		}

		function doReply() {
			var uId = "${loginUser.uId}";
			console.info(uId);
			var uEmail = "${chat.user1.uEmail}";
			console.info(uEmail);
			window.location.href = "${pageContext.request.contextPath}/chat/createMessage?uId="
					+ uId + "&uEmail=" + uEmail;
		}
	</script>
</div>
<style>
tr{
	height: 60px;
}
strong{
	font-size:10px;
}
.layui-card.layui-demo-maincard{
	width:auto;
	height:auto;
}
</style>