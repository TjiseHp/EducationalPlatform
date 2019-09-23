<%@ page 	language="java" 
			contentType="text/html; charset=UTF-8"
    		pageEncoding="UTF-8"
    		deferredSyntaxAllowedAsLiteral="true"
    		%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<script type="text/javascript">
	function doUpdate(){
		var uName = $("#uName").val();
		var uSex = $("#uSex").val();
		var uPhone = $("#uPhone").val();
		var uEmail = $("#uEmail").val();
		var cNum = $("#cNum").val();
		var classNum = $("#classNum").val();

		
		if(uName == ""||uPhone == ""||uEmail == ""){
			layer.msg("内容不能为空", {time:2000, icon:5, shift:6});
			return false;
		}else{
			return true;
		}
		
    }
		
		
	
</script>

<div align="center" style="padding-top: 50px;">
<div>
	<h1>修改信息</h1>
	</div>
	<br/>
	<hr/>
	<br/>
	<br/>
	<div class="col-md-offset-3">
	<form action="${pageContext.request.contextPath}/user/doUpdateTeacher" method="post" accept-charset="utf-8" onsubmit="return doUpdate()">
			
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
                <label class="control-label col-lg-2" for="name">学科：</label>
                <div class="col-md-6">
					<input class="form-control" type="text" id="classNum" name="classNum" value = "${user.classNum}">
                </div>
            </div>
			
			<div class="row form-group">
                <label class="control-label col-lg-2" for="name">城市：</label>
                <div class="col-md-6">
					<input class="form-control" type="text" id="cNum" name="cNum" value = "${user.cNum}">
                </div>
            </div>
			
			<br/>
            
            <div class="col-md-8">
            <div class="row form-group">
            	<input type="hidden" id=courierNo name="uId" value="${user.uId }"/>
				<input class="btn btn-default" type="submit" value="提交"/>
            </div>
            </div>
			
	</form>
	</div>
</div>
