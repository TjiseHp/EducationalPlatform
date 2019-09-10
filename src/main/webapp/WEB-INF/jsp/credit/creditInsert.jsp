<%@ page 	language="java" 
			contentType="text/html; charset=UTF-8"
    		pageEncoding="UTF-8"
    		deferredSyntaxAllowedAsLiteral="true"
    		%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<script type="text/javascript">
	function doPost(){
		var creditSum = $("#creditSum").val();
		var creditText = $("#creditText").val();
		var creditPreson = $("#creditPreson").val();		
		if(creditSum == ""||creditDate == ""||creditPreson == ""){
			layer.msg("内容不能为空", {time:2000, icon:5, shift:6});
			return false;
		}else{
			return true;
		}
		
    }
		
		
	
</script>

<div align="center" style="padding-top: 50px;">
	<form action="${pageContext.request.contextPath}/credit/doInsertCredit" method="post" accept-charset="utf-8" onsubmit="return doPost()">
		<table class="table table-bordered table-striped" style="width: 500px;">
			
			<tr>
				<td class="text-right">
					<strong>积分操作:</strong>
				</td>
				<td class="text-left">
					<input class="form-control" type="text" id="creditSum" name="creditSum">
				</td>
			</tr>
	  		<tr>
				<td class="text-right">
					<strong>明细:</strong>
				</td>
				<td class="text-left">
					<input class="form-control" type="text" id="creditText" name="creditText" >
				</td>
			</tr>
	
			<tr>
				<td class="text-right">
					<strong>操作人:</strong>
				</td>
				<td class="text-left">
					<input class="form-control" type="text" id="creditPreson" name="creditPreson">
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