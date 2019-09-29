<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" deferredSyntaxAllowedAsLiteral="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<div align="center" style="padding-top: 50px;">
	<form>
		<table class="table table-bordered table-striped"
			style="width: 500px;">
			<tr>
				<td colspan="2" class="text-center">
					<h1>信息</h1>
				</td>
			</tr>

			<tr>
				<td class="text-right"><strong>发件人:</strong></td>
				<td class="text-left"><strong>${chat.user1.uName}&nbsp;${chat.user1.uEmail}</strong>
				</td>
			</tr>
			<tr>
				<td class="text-right"><strong>时间:</strong></td>
				<td class="text-left"><fmt:formatDate value="${chat.chatDate}"
						pattern="yyyy-MM-dd HH:mm:ss" /></td>
			</tr>
			<tr>
				<td class="text-right"><strong>收件人:</strong></td>
				<td class="text-left"><strong>${chat.user2.uName}&nbsp;${chat.user2.uEmail}</strong>
				</td>
			</tr>
			<tr>
				<td class="text-left" colspan="2"><strong>${chat.chatText}</strong>

				</td>
			</tr>

			<tr>
				<td colspan="2" class="text-center"><a
					class="btn btn-primary btn-xs" role="button" href="javascript:;"
					onclick="doReply();">回复</a> <a class="btn btn-primary btn-xs"
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

