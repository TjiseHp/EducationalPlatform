<%@ page 	language="java" 
			contentType="text/html; charset=UTF-8"
    		pageEncoding="UTF-8"
    		deferredSyntaxAllowedAsLiteral="true"
    		%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<script type="text/javascript">
	function doUpdate(){
		var exchangeNum = $("#exchangeNum").val();
		var exchangeE = $("#exchangeE").val();
		
		if(exchangeNum == ""||exchangeE == ""){
			layer.msg("内容不能为空", {time:2000, icon:5, shift:6});
			return false;
		}else{
			return true;
		}
		
    }
		
		
	
</script>

<div align="center" style="padding-top: 50px;">
	<div>
	<h1 class="title1">修改积分比例</h1>
	</div>
	<br/>
	<hr/>
	<br/>
	<br/>
	<div class="col-md-offset-0">
	<div class="elegant-aero">
	<form action="${pageContext.request.contextPath}/exchange/doUpdateExchange" method="post" accept-charset="utf-8" onsubmit="return doUpdate()">
		
			<div class="row form-group">
                <label class="control-label col-lg-3" for="name"><span>编号：</span></label>
                <div class="col-md-7">
                	<input class="form-control" type="text" id="exchangeNum" name="exchangeNum" value = "${exchange.exchangeNum }">
                </div>
            </div>
            
			<div class="row form-group">
                <label class="control-label col-lg-3" for="name"><span>比例：</span></label>
                <div class="col-md-7">
                	<input class="form-control" type="text" id="exchangeE" name="exchangeE" value = "${exchange.exchangeE }">
                </div>
            </div>
            
			<br/>
            
            <div class="row form-group">
				<input class="btn btn-danger" type="submit" value="提交"/>
            </div>
			
	</form>
	</div>
	</div>
</div>
