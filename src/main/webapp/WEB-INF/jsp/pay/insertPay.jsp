<%@ page 	language="java" 
			contentType="text/html; charset=UTF-8"
    		pageEncoding="UTF-8"
    		deferredSyntaxAllowedAsLiteral="true"
    		%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<script type="text/javascript">
	function doUpdate(){
		var pNum = $("#pNum").val();
		var uId = $("#uId").val();
		var pText = $("#pText").val();
		var pDate = $("#pDate").val();
		
		if(pNum == ""||uId == ""||pText == ""||pDate == ""){
			layer.msg("内容不能为空", {time:2000, icon:5, shift:6});
			return false;
		}else{
			return true;
		}
		
    }
		
		
	
</script>

<div align="center" style="padding-top: 50px;">
	<h1>新增营收信息</h1><br/>
	<form action="${pageContext.request.contextPath}/pay/doUpdatePay" method="post" accept-charset="utf-8" onsubmit="return doUpdate()">
		<table class="table table-bordered table-striped" style="width: 500px;" >
		
			<tr>
				<td class="text-right">
					<strong>编号:</strong>
				</td>
				<td class="text-left">
					<input class="form-control" type="text" id="pNum" name="pNum" value = "${pay.pNum }">
				</td>
			</tr>
			<tr>
				<td class="text-right">
					<strong>用户ID:</strong>
				</td>
				<td class="text-left">
					<input class="form-control" type="text" id="uId" name="uId" value = "${pay.uId}">
				</td>
			</tr>
			<tr>
				<td class="text-right">
					<strong>金额:</strong>
				</td>
				<td class="text-left">
					<input class="form-control" type="text" id="pText" name="pText" value = "${pay.pText}">
				</td>
			</tr>
			
			<tr>
				<td class="text-right">
					<strong>日期:</strong>
				</td>
				<td class="text-left">
					<input class="form-control" type="text" id="pDate" name="pDate" value = "${pay.pDate}">
				</td>
			</tr>
			
			<tr>
				<td colspan="2" class="text-center">
					<input class="btn btn-default" type="submit" value="提交"/>
				</td>
			</tr>
			
		</table>
		
		
		
	</form>
</div>
