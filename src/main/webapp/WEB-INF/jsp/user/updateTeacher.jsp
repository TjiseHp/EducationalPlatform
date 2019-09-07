<%@ page 	language="java" 
			contentType="text/html; charset=UTF-8"
    		pageEncoding="UTF-8"
    		deferredSyntaxAllowedAsLiteral="true"
    		%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<script type="text/javascript">
	function doUpdate(){
		var uName = $("#uName").val();
		var uPhone = $("#uPhone").val();
		var uEmail = $("#uEmail").val();
		
		if(uName == ""||uPhone == ""||uEmail == ""){
			layer.msg("内容不能为空", {time:2000, icon:5, shift:6});
			return false;
		}else{
			return true;
		}
		
    }
		
		
	
</script>

<div align="center" style="padding-top: 50px;">
	<h1>修改信息</h1><br/>
	<form action="${pageContext.request.contextPath}/user/doUpdateTeacher" method="post" accept-charset="utf-8" onsubmit="return doUpdate()">
		<table class="table table-bordered table-striped" style="width: 500px;" >
		
			<tr>
				<td class="text-right">
					<strong>姓名:</strong>
				</td>
				<td class="text-left">
					<input class="form-control" type="text" id="uName" name="uName" value = "${user.uName }">
				</td>
			</tr>
			<tr>
				<td class="text-right">
					<strong>手机:</strong>
				</td>
				<td class="text-left">
					<input class="form-control" type="text" id="uPhone" name="uPhone" value = "${user.uPhone}">
				</td>
			</tr>
			<tr>
				<td class="text-right">
					<strong>邮箱:</strong>
				</td>
				<td class="text-left">
					<input class="form-control" type="text" id="uEmail" name="uEmail" value = "${user.uEmail}">
				</td>
			</tr>
			
			<tr>
				<td colspan="2" class="text-center">
				<input type="hidden" id=courierNo name="uId" value="${user.uId }"/>
					<input class="btn btn-default" type="submit" value="提交"/>
				</td>
			</tr>
			
		</table>
		
		
		
	</form>
</div>
