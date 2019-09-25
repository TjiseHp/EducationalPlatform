<%@ page 	language="java" 
			contentType="text/html; charset=UTF-8"
    		pageEncoding="UTF-8"
    		deferredSyntaxAllowedAsLiteral="true"
    		%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<script type="text/javascript">
	function doInsertRole(){
		var roName = $("#roName").val();
		var roText = $("#roText").val();
		console.info(roName);
		console.info(roText);
		
		if(roName == "" ||roText == "" ){
			layer.msg("内容不能为空", {time:2000, icon:5, shift:6});
			return;
		}else{
			console.info("OK");
		}
		
		var loadingIndex = null;
		$.ajax({
        	type : "POST",
        	url  : "${pageContext.request.contextPath}/role/insertRole",
        	data : {        		
        		"roName" : roName,
        		"roText" : roText
        	},
        	beforeSend : function(){
        		loadingIndex = layer.msg('处理中', {icon: 16});
        	},
        	success : function(result) {
        		layer.close(loadingIndex);
        		var resObj = JSON.parse(result);
        		console.info(resObj.result);
        		if (resObj.result) {
        			
    	        	window.location.href = "${pageContext.request.contextPath}/role/roleTable?roNo="+roNo;
        			
        		} else {
                    layer.msg("用户登录账号或密码不正确，请重新输入", {time:2000, icon:5, shift:6}, function(){
                    	
                    });
        		}
        	},
        	error : function(err){
        		layer.close("err");
        	}
        });
		
    }
		
		
	
</script>

<div align="center" style="padding-top: 50px;">
	<h1>新增角色</h1><br/>
	<form action="${pageContext.request.contextPath}/role/doInsertRole" method="post" accept-charset="utf-8" onsubmit="return doInsertRole()">
		<table class="table table-bordered table-striped" style="width: 500px;" >
		
			<tr>
				<td class="text-right">
					<strong>角色名称:</strong>
				</td>
				<td class="text-left">
					<input class="form-control" type="text" id="roName" name="roName" value = "${role.roName}">
				</td>
			</tr>
			
			<tr>
				<td class="text-right">
					<strong>注释:</strong>
				</td>
				<td class="text-left">
					<input class="form-control" type="text" id="roText" name="roText" value = "${role.roText}">
				</td>
			</tr>
			
			<tr>
				<td colspan="2" class="text-center">
				    <input type="hidden" id=courierNo name="roNo" value="${role.roNo }" />
					<input class="btn btn-default" type="submit" value="提交"/>
				</td>
			</tr>
			
		</table>
		
		
		
	</form>
</div>
