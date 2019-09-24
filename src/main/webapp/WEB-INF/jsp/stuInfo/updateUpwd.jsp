<%@ page 	language="java" 
			contentType="text/html; charset=UTF-8"
    		pageEncoding="UTF-8"
    		deferredSyntaxAllowedAsLiteral="true"
    		%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<script type="text/javascript">
	
	function doUpdate() {
		var uPwd = $("#uPwd").val();
		var uId = $("#uId").val();
		console.info(uPwd);
		console.info(uId);
		if(uPwd == ""){
			layer.msg("内容不能为空", {time:2000, icon:5, shift:6});
			return;
		}else{
			console.info("OK");
		}
		
		var loadingIndex = null;
		$.ajax({
        	type : "POST",
        	url  : "${pageContext.request.contextPath}/stuInfo/doUpdateUpwd",
        	data : {
        		"uId" : uId,
        		"uPwd" : uPwd
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
    	window.location.href = "${pageContext.request.contextPath}/stuInfo/stuInfoCenter?uId="+uId;
	}
		
	
</script>

<div align="center" style="padding-top: 50px;">
	
	<div>
	<h1>修改密码</h1>
	</div>
	<br/>
	<hr/>
	<br/>
	<br/>
	<div class="col-md-offset-3">
	<form action="${pageContext.request.contextPath}/stuInfo/doUpdateUpwd" method="post" accept-charset="utf-8" onsubmit="return doUpdate()">
			
			<div class="row form-group">
                <label class="control-label col-lg-2" for="name">原密码：</label>
                <div class="col-md-6">
                	<input class="form-control" type="text" id="uName" name="uName" value = "${user.uPwd}">
                </div>
            </div>
            
            <div class="row form-group">
                <label class="control-label col-lg-2" for="name">新密码：</label>
                <div class="col-md-6">
                	<input class="form-control" type="text" id="uPwd" name="uPwd" value = "${user.uPwd}">
                </div>
            </div>
            
			<br/>
            
            <div class="col-md-7">
            <div class="row form-group">
            	<input type="hidden" id="uId" name="uId" value="${user.uId}"/> 
					<button type="button" class="btn btn-danger" onclick="doUpdate();">确认</button>
					<button type="button" class="btn btn-danger" onclick="doback();">返回</button>				
            </div>
            </div>

		
	</form>
	</div>
</div>
