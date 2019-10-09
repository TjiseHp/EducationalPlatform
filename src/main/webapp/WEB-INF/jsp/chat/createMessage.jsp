<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" deferredSyntaxAllowedAsLiteral="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<script type="text/javascript">
	
	
	function doback(){
		var uId = $("#uId").val();
		console.info(uId);
    	window.location.href = "${pageContext.request.contextPath}/chat/stuMessageCenter?uId="+uId;
	}
		
	
</script>

<div align="center" style="padding-top: 50px;">
	<form action="${pageContext.request.contextPath}/chat/doInsertChatInfo"
		method="post" accept-charset="utf-8" onsubmit="return doPost()">
		<table class="table table-bordered table-striped"
			style="width: 500px;">
			<tr>
				<td colspan="2" class="text-center"><strong>新建信息</strong></td>
			</tr>
			<tr>
				<td class="text-right"><strong>收件人:</strong></td>
				<td class="text-left">
					<div>
						<input class="form-control" type="text" id="uEmail" name="uEmail">
					</div>
				</td>
			</tr>
			<tr>
				<td class="text-right"><strong>内容:</strong></td>
				<td class="text-left"><input class="form-control" type="text"
					id="chatText" name="chatText"></td>
			</tr>

			<tr>
				<td colspan="2" class="text-center"><input type="hidden"
					id="uId" name="uId" value="${loginUser.uId}" /> 
					<button type="button" class="btn btn-danger" onclick="doPost();">发送</button>
					<button type="button" class="btn btn-danger" onclick="doback();">取消</button>
				</td>
			</tr>
		</table>
	</form>

	<script type="text/javascript">
	function getUrlParam(name) {
		var reg = new RegExp("(^|&)" + name + "=([^&]*)(&|$)");
		var r = window.location.search.substr(1).match(reg); 
		if (r != null) return unescape(r[2]);return null; 
		}
	</script>
	<script type="text/javascript">
		var uId = getUrlParam('uId');
		var uEmail = getUrlParam('uEmail');
		window.onload = function(){
			$("#uId").val(uId);
			$("#uEmail").val(uEmail);
		}
	</script>
	<script type="text/javascript">
	
	function doPost() {
		var uEmail = $("#uEmail").val();
		var chatText = $("#chatText").val();
		var uId=$("#uId").val();
		console.info(uId+" "+uEmail+" "+chatText);
		if(uEmail == null || uEmail == "") {
			layer.msg("请输入收件人邮箱！", {time:2000, icon:5, shift:6}, function(){
            });
			return;
		} else if(chatText == null || chatText == "") {
			layer.msg("请输入信息！", {time:2000, icon:5, shift:6}, function(){
            });
			return;
		}
		
		var loadingIndex = null;
		$.ajax({
        	type : "POST",
        	url  : "${pageContext.request.contextPath}/chat/docheck",
        	data : {
        		"uId":uId,
        		"uEmail" :uEmail,
        		"chatText" :chatText
        	},
        	beforeSend : function(){
        		loadingIndex = layer.msg('处理中', {icon: 16});
        	},
        	success : function(result) {
        		layer.close(loadingIndex);
        		var resObj = JSON.parse(result);
        		console.info(resObj);
        		console.info(resObj.result);
        		if (resObj.result==0) {   
					layer.msg("ok", {time:2000, icon:6, shift:6}, function(){
    	        	window.location.href = "${pageContext.request.contextPath}/chat/stuMessageCenter";
                    });
        		} else {
        			switch(resObj.result){
        			case 1:
        				 layer.msg("系统错误", {time:2000, icon:5, shift:6}, function(){
       
                         });
        				 break;
        			case 2:
       				 layer.msg("积分不足", {time:2000, icon:5, shift:6}, function(){
       	                    
                        });
       				 break;
        			case 3:
       				 layer.msg("收件人不存在", {time:2000, icon:5, shift:6}, function(){
       	                    
                        });
       				 break;
        			}                 
        		}
        	},
        	error : function(err){
        		layer.msg("系统错误", {time:2000, icon:5, shift:6}, function(){
                    
                });
        	}
        });
	}

	</script>
</div>
