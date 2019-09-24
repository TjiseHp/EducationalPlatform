<%@ page 	language="java" 
			contentType="text/html; charset=UTF-8"
    		pageEncoding="UTF-8"
    		deferredSyntaxAllowedAsLiteral="true"
    		%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>



<script type="text/javascript">
	function doPost(){
		var uId = $("#uId").val();
		var cNum = $("#cNum").val();
		var classNum = $("#classNum").val();
		var recruitText = $("#recruitText").val();
		if(uId == ""||cNum == ""||classNum == ""||recruitText == ""){
			layer.msg("内容不能为空", {time:2000, icon:5, shift:6});
			return false;
		}else{
			return true;
		}
		
    }
		
		
	
</script>

<div align="center" style="padding-top: 50px;">
	<div>
	<h1>添加信息</h1>
	</div>
	<br/>
	<hr/>
	<br/>
	<br/>
	<div class="col-md-offset-3">
	<form action="${pageContext.request.contextPath}/recruit/add" method="post" accept-charset="utf-8" onsubmit="return doPost()">
			
			<div class="row form-group">
                <label class="control-label col-lg-2" for="name">家长姓名：</label>
                <div class="col-md-6">
                	<input class="form-control" type="text" id="uId" name="uId" value="填id,仅做功能测试，之后再改">
                </div>
            </div>
            
			<div class="row form-group">
                <label class="control-label col-lg-2" for="name">所在城市：</label>
                <div class="col-md-6">
                	<input class="form-control" type="text" id="cNum" name="cNum" value="同上">
                </div>
            </div>

			<div class="row form-group">
                <label class="control-label col-lg-2" for="name">辅导科目：</label>
                <div class="col-md-6">
                	<input class="form-control" type="text" id="classNum" name="classNum" value="同上">
                </div>
            </div>

			<div class="row form-group">
                <label class="control-label col-lg-2" for="name">具体需求：</label>
                <div class="col-md-6">
                	<textarea class="form-control"  cols="1"   rows="20"  type="text" id="recruitText" name="recruitText"></textarea>
                </div>
            </div>
            			
            <br/>
            
            <div class="col-md-8">
            <div class="row form-group">
            		<input class="form-control" type="hidden" id="uId" name="uId" value="">
					<input class="btn btn-default" type="submit" value="提交"/>
            </div>
            </div>
            				
	</form>
	</div>
</div>