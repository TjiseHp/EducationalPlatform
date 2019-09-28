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
        			  for(var i=0;i<result.length;i++ ){
						   $("#s1").append("<option value='"+result[i].cProvince+"'>"+result[i].cProvince+"</option>");
					   }
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
	<div>
	<h1 class="title1">新建信息</h1>
	</div>
	<br />
	<hr />
	<br />
	<br />
	<div class="col-md-offset-0">
	<div class="elegant-aero">
	<form action="${pageContext.request.contextPath}/user/doInsertChatInfo" method="post" accept-charset="utf-8" onsubmit="return doPost()">
			
			<div class="row form-group">
				<label class="control-label col-lg-3" for="name" ><span>收件人：</span></label>
				<div class="col-md-7" style="padding-top:7px;">
					<select style="width: 100px" id="s1" >
						        <option >--请选择--</option>
				    </select> 
				</div>
			</div>
	
			<div class="row form-group">
				<label class="control-label col-lg-3" for="name" ><span>内容：</span></label>
				<div class="col-md-7">
					<input class="form-control" type="chatText" id="chatText" name="chatText">
				</div>
			</div>
			
			<div class="row form-group">
				<label class="control-label col-lg-3" for="name" ><span>发件人：</span></label>
				<div class="col-md-7">
					<input class="form-control" type="chatText" id="chatText" name="chatText" value="${chat.user2.uName}&nbsp;${chat.user2.uEmail}">
				</div>
			</div>
			<br/>
			<br/>
            <div class="col-md-12">
            <div class="row form-group">
            	<input type="hidden" id=courierNo name="uId" value="${user.uId }"/>
				<button type="button" class="btn btn-danger" onclick="doUpdate();">发送</button>
				<button type="button" class="btn btn-danger" onclick="doback();">取消</button>	
            </div>
            </div>			
			
	</form>
</div>
</div>
</div>
<style>
input[type=text] {
  width: 300px;
  color: #404040;
  background: white;
  border: 1px solid;
  border-color: #c4c4c4 #d1d1d1 #d4d4d4;
  border-radius: 2px;
  outline: 5px solid #eff4f7;
  -moz-outline-radius: 3px;
  -webkit-box-shadow: inset 0 1px 3px rgba(0, 0, 0, 0.12);
  box-shadow: inset 0 1px 3px rgba(0, 0, 0, 0.12);
}
.title1{

       background: #EEE url(data:image/gif;base64,iVBORw0KGgoAAAANSUhEUgAAAAQAAAAECAIAAAAmkwkpAAAAHklEQVQImWNkYGBgYGD4//8/A5wF5SBYyAr+//8PAPOCFO0Q2zq7AAAAAElFTkSuQmCC) repeat;

         text-shadow: 3px -3px black, 2px -2px white;

         font-weight: bold;

         -webkit-text-fill-color: transparent;

         -webkit-background-clip: text;

}
.title2{

        color: transparent;

        -webkit-text-stroke: 1px black;

        letter-spacing: 0.04em;

}
.elegant-aero {
    margin-left:auto;
	margin-right:auto;
	max-width: 500px;
	background: #D2E9FF;
	padding: 20px 20px 20px 20px;
	font: 12px Arial, Helvetica, sans-serif;
	color: #666;
	height:300px;
}
.elegant-aero label>span {
	float: left;
	margin-top: 10px;
	color: #5E5E5E;
}
.elegant-aero label {
	display: block;
	margin: 0px 0px 5px;
}
.elegant-aero label>span {
	float: left;
	width: 100%;
	text-align: right;
	padding-right: 15px;
	margin-top: 10px;
	font-weight: bold;
}
.layui-card.layui-demo-maincard{
	width:auto;
	height:auto;
}
</style>