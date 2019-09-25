<%@ page 	language="java" 
			contentType="text/html; charset=UTF-8"
    		pageEncoding="UTF-8"
    		deferredSyntaxAllowedAsLiteral="true"
    		%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
	
<script type="text/javascript">
	
	function doUpdate() {
		
		var loadingIndex = null;
		$.ajax({
        	type : "POST",
        	url  : "${pageContext.request.contextPath}/stuInfo/doUpdateUpwd",
        	data : {
        		"uId" : uId,
        		"chatText" : chatText
        	},
        	beforeSend : function(){
        		loadingIndex = layer.msg('处理中', {icon: 16});
        	},
        	success : function(result) {
        		layer.close(loadingIndex);
        		var resObj = JSON.parse(result);
        		console.info(resObj.result);
        		if (resObj.result) {      			
    	        	window.location.href = "${pageContext.request.contextPath}/index?uId="+uId;
        			
        		} else {
                    layer.msg("密码格式不正确，请重新输入", {time:2000, icon:5, shift:6}, function(){
                    	
                    });
        		}
        	},
        	error : function(err){
        		layer.close("err");
        	}
        });
	}
		
	
	function doback(){
		var uId = $("#uId").val();
		console.info(uId);
    	window.location.href = "${pageContext.request.contextPath}/chat/showReceiveInfo?uId="+uId;
	}
		
	
</script>
<div align="center" style="padding-top: 50px;">
	<form action="${pageContext.request.contextPath}/user/doInsertChatInfo" method="post" accept-charset="utf-8" onsubmit="return doPost()">
		<table class="table table-bordered table-striped" style="width: 500px;">
			<tr>
				<td colspan="2" class="text-right">
					<strong>新建信息</strong>
				</td>
			</tr>
				<tr>
				<td class="text-right">
					<strong>收件人:</strong>
				</td>
				<td class="text-left">
 				<div>	    
 					<select style="width: 100px" id="s1" >
						        <option >--请选择--</option>
				    </select> 
 				</div>	            
				</td>
                  		 	
			</tr>	
			<tr>
				<td class="text-right">
					<strong>内容:</strong>
				</td>
				<td class="text-left">
					<input class="form-control" type="chatText" id="chatText" name="chatText">
				</td>
			</tr>	
			<tr>
				<td class="text-right">
					<strong>发件人:</strong>
				</td>
				<td class="text-left">
				<strong>${chat.user2.uName}&nbsp;${chat.user2.uEmail}</strong>

				</td>
			</tr>
			
		
									
			<tr>
				<td colspan="2" class="text-center">				
					<input type="hidden" id="uId" name="uId" value="${user.uId}"/> 
					<button type="button" class="btn btn-danger" onclick="doUpdate();">发送</button>
					<button type="button" class="btn btn-danger" onclick="doback();">取消</button>										
				</td >
			</tr>
		</table>
	</form>
</div>