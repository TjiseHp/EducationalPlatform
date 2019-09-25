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
		
		function doUpdateUpwd(uId){
			window.location.href = "${pageContext.request.contextPath}/stuInfo/updateUpwd?uId="+uId;		
		}
		
		function doCredit(uId){
			window.location.href = "${pageContext.request.contextPath}/credit/sCreditDetail?uId="+uId;		
		}
	
</script>

<div align="center" style="padding-top: 50px;">
	<div>
	<h1 class="title1">个人信息</h1>
	</div>
	<br />
	<hr />
	<br /> <br />
	<form >
		<table class="table table-bordered table-striped elegant-aero" style="width: 500px;" >
				
		    <tr>
				<td class="text-right">
					<strong>账号:</strong>
				</td>
				<td class="text-left">
				   <strong>${user.uAcc}</strong>
					
				</td>
			</tr>		
			<tr>
				<td class="text-right">
					<strong>姓名:</strong>
				</td>
				<td class="text-left">
				    <strong>${user.uName }</strong>
				</td>
			</tr>
			<tr>
				<td class="text-right">
					<strong>性别:</strong>
				</td>
				<td class="text-left">
				    <strong>${user.uSex}</strong>
				</td>
			</tr>
			<tr>
				<td class="text-right">
					<strong>手机:</strong>
				</td>
				<td class="text-left">
				    <strong>${user.uPhone}</strong>
				</td>
			</tr>
			
			<tr>
				<td class="text-right">
					<strong>邮箱:</strong>
				</td>
				<td class="text-left">
				    <strong>${user.uEmail}</strong>
				</td>
			</tr>
			<tr>
				<td class="text-right">
					<strong>城市:</strong>
				</td>
				<td class="text-left">
				    <strong>${user.city.cCity}</strong>
				</td>
			</tr>
			<tr>
				<td class="text-right">
					<strong>剩余积分:</strong>
				</td>
				<td class="text-left">
				    <strong>${user.credit}</strong>
       	            <a class="btn btn-primary btn-xs" role="button" href="javascript:;" onclick="doCredit('${user.uId}');">积分详情</a>			                                 				    
				</td>
			</tr>			
			<tr>
				<td colspan="2" class="text-center">
                      <a class="btn btn-primary btn-xs" role="button" href="javascript:;" onclick="doUpdate('${user.uId}');">修改个人信息</a>			                                 
                      <a class="btn btn-primary btn-xs" role="button" href="javascript:;" onclick="doUpdateUpwd('${user.uId}');">修改密码</a>			
                </td>
			</tr>
			
			
		</table>
		
		
		
	</form>
  	</div>
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