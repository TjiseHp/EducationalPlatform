<%@ page 	language="java" 
			contentType="text/html; charset=UTF-8"
    		pageEncoding="UTF-8"
    		deferredSyntaxAllowedAsLiteral="true"
    		%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<script type="text/javascript">
	
	function doUpdate() {
		var uName = $("#uName").val();
		var uPhone = $("#uPhone").val();
		var uEmail = $("#uEmail").val();
		var uSex = $("#uSex").val();
		var cNum = $("#cNum").val();
		var uId = $("#uId").val();
		console.info(uName);
		console.info(uId);
		console.info(uPhone);
		console.info(uEmail);
		console.info(uSex);
		console.info(cNum);
		if(uName == ""||uPhone == ""||uEmail == ""||uSex == ""){
			layer.msg("内容不能为空", {time:2000, icon:5, shift:6});
			return;
		}else{
			console.info("OK");
		}
		
		var loadingIndex = null;
		$.ajax({
        	type : "POST",
        	url  : "${pageContext.request.contextPath}/stuInfo/doUpdateStuInfo",
        	data : {
        		"uId" : uId,
        		"uEmail" : uEmail,
        		"uSex" : uSex,
        		"uName" : uName,
        		"uPhone"  : uPhone,
        		"cNum" : cNum
        	},
        	beforeSend : function(){
        		loadingIndex = layer.msg('处理中', {icon: 16});
        	},
        	success : function(result) {
        		layer.close(loadingIndex);
        		var resObj = JSON.parse(result);
        		console.info(resObj.result);
        		if (resObj.result) {
        			
    	        	window.location.href = "${pageContext.request.contextPath}/stuInfo/stuInfoCenter?uId="+uId;
        			
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
	<div>
	<h1>修改个人信息</h1>
	</div>
	<br/>
	<hr/>
	<br/>
	<br/>
	<div class="col-md-offset-3">
	<form action="${pageContext.request.contextPath}/stuInfo/doUpdateStuInfo" method="post" accept-charset="utf-8" onsubmit="return doUpdate()">
			
			<div class="row form-group">
                <label class="control-label col-lg-2" for="name">姓名：</label>
                <div class="col-md-6">
                	<input class="form-control" type="text" id="uName" name="uName" value = "${user.uName }">
                </div>
            </div>
            
			<div class="row form-group">
                <label class="control-label col-lg-2" for="name">性别：</label>
                <div class="col-md-6">
                  	<input class="form-control" type="text" id="uSex" name="uSex" value = "${user.uSex}">
                </div>
            </div>
            
 			<div class="row form-group">
                <label class="control-label col-lg-2" for="name">手机：</label>
                <div class="col-md-6">
                  	<input class="form-control" type="text" id="uPhone" name="uPhone" value = "${user.uPhone}">
                </div>
            </div>
			
			<div class="row form-group">
                <label class="control-label col-lg-2" for="name">邮箱：</label>
                <div class="col-md-6">
					<input class="form-control" type="text" id="uEmail" name="uEmail" value = "${user.uEmail}">
                </div>
            </div>
            
 			<div class="row form-group">
                <label class="control-label col-lg-2" for="name">城市：</label>
                <div class="col-md-6">
					<input class="form-control" type="text" id="cCity" name="cCity" value = "${user.city.cCity}">
                </div>
            </div>
            
			<br/>
			
			<div class="col-md-8">
            <div class="row form-group">
            	<input type="hidden" id="uId" name="uId" value="${user.uId}"/> 
				<button type="button" class="btn btn-danger" onclick="doUpdate();">提交</button>
            </div>
            </div> 
		
	</form>
	</div>
</div>
