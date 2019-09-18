<%@ page 	language="java" 
			contentType="text/html; charset=UTF-8"
    		pageEncoding="UTF-8"
    		deferredSyntaxAllowedAsLiteral="true"
    		%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<script type="text/javascript">
	function doUpdate(){
		var uId2 = $("#uId2").val();
		var uId = $("#uId").val();
		var state = $("#state").val();
		var cNum = $("#cNum").val();
		if(cNum == ""||uId == ""||state == ""||courierSex == ""||uId2 == ""){
			layer.msg("完整填写", {time:2000, icon:5, shift:6});
			return false;
		}else{
			return true;
		}
		
    }
		
		
	
</script>

<div align="center" style="padding-top: 50px;">
	<form action="${pageContext.request.contextPath}/appraise/appraiseTeacher" method="post" accept-charset="utf-8" onsubmit="return doUpdate()">
		<table class="table table-bordered table-striped" style="width: 500px;">
			<tr>
				<td class="text-right">
					<strong>教师姓名:</strong>
				</td>
				<td class="text-left">
					<input class="form-control" type="text" id="uName" name="uName" value="${recruit.user2.uName }">
				</td>
			</tr>
			
			<tr>
				<td class="text-right">
					<strong>评价:</strong>
				</td>
				<td class="text-left">
					<input class="form-control" type="text" id="state" name="state" value="${recruit.state}">
				</td>
			</tr>	
			
			<tr>
				<td class="text-right">
					<strong>评分:</strong>
				</td>
				<td class="text-left">
					<select name="cNum" id="cNum">
						<option value="1">很差</option>
						<option value="2">一般</option>
						<option value="3">还行</option>
						<option value="4">不错</option>
						<option value="5" selected="selected">很棒</option>
					</select>
				</td>
			</tr>	
			
			<tr>
				<td colspan="2" class="text-center">
				<input type="hidden" id=uId name="uId" value="${recruit.uId }"/>
				<input class="form-control" type="hidden" id="uId2" name="uId2" value="${recruit.uId2 }">
					<input class="btn btn-default" type="submit" value="提交"/>
				</td>
			</tr>
		</table>
	</form>
</div>


