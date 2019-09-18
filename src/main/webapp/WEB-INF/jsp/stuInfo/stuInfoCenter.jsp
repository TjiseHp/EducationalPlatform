<%@ page 	language="java" 
			contentType="text/html; charset=UTF-8"
    		pageEncoding="UTF-8"
    		deferredSyntaxAllowedAsLiteral="true"
    		%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>

<script type="text/javascript">
		
		function doUpdate(uId) {		
			window.location.href = "${pageContext.request.contextPath}/stuInfo/updateStuInfo?uId="+uId;
		}
		
	
</script>

<div class="table-responsive text-center">  		
	<form >
		<table class="table table-bordered table-striped" style="width: 500px;" >
		    <tr>
				<td colspan="2" class="text-center">
				 <h1>个人信息</h1>
                </td>
			</tr>		
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
					<strong>性别:</strong>
				</td>
				<td class="text-left">
					<input class="form-control" type="text" id="uSex" name="uSex" value = "${user.uSex}">
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
				<td class="text-right">
					<strong>城市:</strong>
				</td>
				<td class="text-left">
					<input class="form-control" type="text" id="cNum" name="cNum" value = "${user.cNum}">
				</td>
			</tr>
		<!-- 	<tr>
				<td class="text-right">
					<strong>账号:</strong>
				</td>
				<td class="text-left">
					<input class="form-control" type="text" id="uAcc" name="uAcc" value = "${user.uAcc}">
				</td>
			</tr>
			<tr>
				<td class="text-right">
					<strong>密码:</strong>
				</td>
				<td class="text-left">
					<input class="form-control" type="text" id="uPwd" name="uPwd" value = "${user.uPwd}">
				</td>
			</tr>
			 -->
			
			<tr>
				<td colspan="2" class="text-center">
                      <input type="hidden" id=uId name="uId" value="${user.uId}"/> 
                      <a class="btn btn-primary btn-xs" role="button" href="javascript:;" onclick="doUpdate('${user.uId}');">修改个人信息</a>			
                </td>
			</tr>
			<tr>
				<td colspan="2" class="text-center">
                      <input type="hidden" id=uPwd name="uPwd" value="${user.uPwd}"/> 
                      <a class="btn btn-primary btn-xs" role="button" href="javascript:;" onclick="doUpdate('${user.uPwd}');">修改密码</a>			
                </td>
			</tr>
			
			
		</table>
		
		
		
	</form>
  	</div>