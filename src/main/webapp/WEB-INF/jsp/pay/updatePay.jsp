<%@ page 	language="java" 
			contentType="text/html; charset=UTF-8"
    		pageEncoding="UTF-8"
    		deferredSyntaxAllowedAsLiteral="true"
    		%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<script type="text/javascript">
	function doUpdate(){
		var payNum = $("#payNum").val();
		var uId = $("#uId").val();
		var pText = $("#pText").val();
		
		if(payNum == ""||uId == ""||pText == ""){
			layer.msg("内容不能为空", {time:2000, icon:5, shift:6});
			return false;
		}else{
			return true;
		}
		
    }
		
		
	
</script>

<div align="center" style="padding-top: 50px;">

	<div>
	<h1>修改营收信息</h1>
	</div>
	<br/>
	<hr/>
	<br/>
	<br/>
	<div class="col-md-offset-3">
	<form action="${pageContext.request.contextPath}/pay/doUpdatePay" method="post" accept-charset="utf-8" onsubmit="return doUpdate()">
		
			<div class="row form-group">
                <label class="control-label col-lg-2" for="name">编号：</label>
                <div class="col-md-6">
                	<input class="form-control" type="text" id="payNum" name="payNum" value = "${pay.payNum }">
                </div>
            </div>

			<div class="row form-group">
                <label class="control-label col-lg-2" for="name">用户ID：</label>
                <div class="col-md-6">
                	<input class="form-control" type="text" id="uId" name="uId" value = "${pay.uId}">
                </div>
            </div>
            
            <div class="row form-group">
                <label class="control-label col-lg-2" for="name">金额：</label>
                <div class="col-md-6">
                	<input class="form-control" type="text" id="payText" name="payText" value = "${pay.payText}">
                </div>
            </div>
            
			<br/>
            
            <div class="col-md-8">
            <div class="row form-group">
				<input class="btn btn-default" type="submit" value="提交"/>
            </div>
            </div>
		
	</form>
	</div>
</div>
