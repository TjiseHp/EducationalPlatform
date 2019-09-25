<%@ page 	language="java" 
			contentType="text/html; charset=UTF-8"
    		pageEncoding="UTF-8"
    		deferredSyntaxAllowedAsLiteral="true"
    		%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<script type="text/javascript">
	function doInsertPay(){
		var payText = $("#payText").val();
		console.info(pText);
		if(payText == ""){
			layer.msg("内容不能为空", {time:2000, icon:5, shift:6});
			return;
		}else{
			console.info("OK");
		}
		
		var loadingIndex = null;
		$.ajax({
        	type : "POST",
        	url  : "${pageContext.request.contextPath}/pay/doInsertPay",
        	data : {        		
        		
        		"pText" : pText
        	},
        	beforeSend : function(){
        		loadingIndex = layer.msg('处理中', {icon: 16});
        	},
        	success : function(result) {
        		layer.close(loadingIndex);
        		var resObj = JSON.parse(result);
        		console.info(resObj.result);
        		if (resObj.result) {
        			
    	        	window.location.href = "${pageContext.request.contextPath}/pay/payTable2?payNum="+payNum;
        			
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
	<h1>新增营收信息</h1>
	</div>
	<br/>
	<hr/>
	<br/>
	<br/>
	
	<div class="col-md-offset-3">
	<form action="${pageContext.request.contextPath}/pay/doInsertPay" method="post" accept-charset="utf-8" onsubmit="return doInsertPay()">

		<table class="table table-bordered table-striped" style="width: 500px;" >

			<tr>
				<td class="text-right">
					<strong>金额:</strong>
				</td>
				<td class="text-left">
					<input class="form-control" type="text" id="payText" name="payText" value = "${pay.payText}">
				</td>
			</tr>
			
			<tr>
				<td colspan="2" class="text-center">
				<input type="hidden" id=courierNo name="payNum" value="${pay.payNum }" />
					<input class="btn btn-default" type="submit" value="提交"/>
				</td>
			</tr>
			
		</table>
		
	</form>
	</div>
</div>
