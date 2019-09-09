<%@ page 	language="java" 
			contentType="text/html; charset=UTF-8"
    		pageEncoding="UTF-8"
    		deferredSyntaxAllowedAsLiteral="true"
    		%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>



<script type="text/javascript">
	function doPost(){
		var uId = $("#uId").val();
		var cNum = $("#cNum").val();
		var classNum = $("#classNum").val();
		var recruitText = $("#recruitText").val();
		if(uId == ""||cNum == ""||classNum == ""||recruitText == ""){
			layer.msg("内容不能为空", {time:2000, icon:5, shift:6});
			return false;
		}else{
			return true;
		}
		
    }
		
		
	
</script>

<div align="center" style="padding-top: 50px;">
	<form action="${pageContext.request.contextPath}/recruit/add" method="post" accept-charset="utf-8" onsubmit="return doPost()">
		<table class="table table-bordered table-striped" style="width: 500px;">				
			<tr>
				<td class="text-right">
					<strong>家长姓名:</strong>
				</td>
				<td class="text-left">
					<input class="form-control" type="text" id="uId" name="uId" value="填id,仅做功能测试，之后再改">
				</td>
			</tr>
			<tr>
				<td class="text-right">
					<strong>所在城市:</strong>
				</td>
				<td class="text-left">
					<input class="form-control" type="text" id="cNum" name="cNum" value="同上">
				</td>
			</tr>
			<tr>
				<td class="text-right">
					<strong>辅导科目:</strong>
				</td>
				<td class="text-left">
					<input class="form-control" type="text" id="classNum" name="classNum" value="同上">
				</td>
			</tr>
			<tr>
				<td class="text-right">
					<strong>具体需求:</strong>
				</td>				
				<td class="text-left">
					<textarea class="form-control"  cols="1"   rows="20"  type="text" id="recruitText" name="recruitText"></textarea>
				</td>
			</tr>							
			<tr>
				<td colspan="2" class="text-center">
					<input class="form-control" type="hidden" id="uId" name="uId" value="1">
					<input class="btn btn-default" type="submit" value="提交"/>
				</td>
			</tr>
		</table>
	</form>
</div>