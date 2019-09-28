<%@ page 	language="java" 
			contentType="text/html; charset=UTF-8"
    		pageEncoding="UTF-8"
    		deferredSyntaxAllowedAsLiteral="true"
    		%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<script type="text/javascript">
	function doPost(){
		var creditSum = $("#creditSum").val();
		var creditText = $("#creditText").val();
		var creditPreson = $("#creditPreson").val();		
		if(creditSum == ""||creditDate == ""||creditPreson == ""){
			layer.msg("内容不能为空", {time:2000, icon:5, shift:6});
			return false;
		}else{
			return true;
		}
		
    }
		
		
	
</script>

<div align="center" style="padding-top: 50px;">
	<div>
	<h1 class="title1">积分操作</h1>
	</div>
	<br />
	<hr />
	<br />
	<br />
	<div class="col-md-offset-0">
	<div class="elegant-aero">
	<form action="${pageContext.request.contextPath}/credit/doInsertCredit" method="post" accept-charset="utf-8" onsubmit="return doPost()">
			
			<div class="row form-group">
			<label class="control-label col-lg-3" for="name"><span>积分数量：</span></label>
				<div class="col-md-7">
				<input class="form-control" type="text" id="creditSum" name="creditSum">
				</div>
			</div>
			
			<div class="row form-group">
			<label class="control-label col-lg-3" for="name"><span>明细：</span></label>
				<div class="col-md-7">
				<input class="form-control" type="text" id="creditText" name="creditText" >
				</div>
			</div>

	  		<div class="row form-group">
			<label class="control-label col-lg-3" for="name"><span>操作人：</span></label>
				<div class="col-md-7">
				<input class="form-control" type="text" id="creditPreson" name="creditPreson">
				</div>
			</div>
		
			<div class="row form-group">
				<input class="btn btn-danger" type="submit" value="提交"/>
			</div>
			
	</form>
	</div>
	</div>
</div>