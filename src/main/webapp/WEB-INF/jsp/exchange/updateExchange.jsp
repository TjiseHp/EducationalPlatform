<%@ page 	language="java" 
			contentType="text/html; charset=UTF-8"
    		pageEncoding="UTF-8"
    		deferredSyntaxAllowedAsLiteral="true"
    		%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<script type="text/javascript">
	function doUpdate(){
		var eNum = $("#eNum").val();
		var eE = $("#eE").val();
		
		if(eNum == ""||eE == ""){
			layer.msg("内容不能为空", {time:2000, icon:5, shift:6});
			return false;
		}else{
			return true;
		}
		
    }
		
		
	
</script>

<div align="center" style="padding-top: 50px;">
	<h1>修改积分比例</h1><br/>
	<form action="${pageContext.request.contextPath}/exchange/doUpdateExchange" method="post" accept-charset="utf-8" onsubmit="return doUpdate()">
		<table class="table table-bordered table-striped" style="width: 500px;" >
		
			<tr>
				<td class="text-right">
					<strong>编号</strong>
				</td>
				<td class="text-left">
					<input class="form-control" type="text" id="exchangeNum" name="exchangeNum" value = "${exchange.exchangeNum }">
				</td>
			</tr>
			<tr>
				<td class="text-right">
					<strong>比例</strong>
				</td>
				<td class="text-left">
					<input class="form-control" type="text" id="exchangeE" name="exchangeE" value = "${exchange.exchangeE}">
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
