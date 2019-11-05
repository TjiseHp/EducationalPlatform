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
	<div>
	<h1 class="title1">新建信息</h1>
	</div>
	<br/>
	<hr/>
	<br/>
	<br/>
	<div class="col-md-offset-0">
	<div class="elegant-aero">
	<form action="${pageContext.request.contextPath}/chat/doInsertChatInfo"
		method="post" accept-charset="utf-8" onsubmit="return doPost()">
		
		<div class="row form-group">
                <label class="control-label col-lg-3" for="name"><span>收件人：</span></label>
                <input class="form-control" type="text" id="uEmail" name="uEmail" style="height:100px;width:500px;">

        </div>
		<div class="row form-group">
                <label class="control-label col-lg-3" for="name"><span>内容：</span></label>
                <input class="form-control" type="text"
					id="chatText" name="chatText" style="height:100px;width:500px;">

        </div>	
		<div class="row form-group">
				<input type="hidden" id="uId" name="uId" value="${loginUser.uId}" /> 
				<button type="button" class="btn btn-danger" onclick="doPost();">发送</button>
					<button type="button" class="btn btn-danger" onclick="doback();">取消</button>
        </div>
        
	</form>
	</div>
	</div>

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
<style type="text/css">
input[type=radio] {
    margin-right: 5px;
    cursor: pointer;
    font-size: 14px;
    width: 15px;
    height: 12px;
    position: relative;
}

input[type=radio]:after {
    position: absolute;
    width: 15px;
    height: 15px;
    top: 0;
    content: " ";
    background-color: #fff;
    color: #fff;
    display: inline-block;
    visibility: visible;
    padding: 0px 3px;
    border-radius: 50%;
    border: 1px solid #ebebeb;
}

input[type=radio]:checked:before {
    content: " ";
    display: block;
    position: relative;
    top: 0;
    width: 15px;
    height: 15px;
    color: #fff;
    font-weight: 400;
    z-index: 1;
    border-radius: 50%;
    background-color: #40c8c4;
}
input:focus{
	box-shadow:0 0 5px 2px rgba(0,0,0,0.3);
}
box-shadow: 0 0 35px 15px rgba(29,43,100,0.9) inset; 
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
	max-width: 80% ;
	padding: 20px 20px 20px 20px;
	font: 12px Arial, Helvetica, sans-serif;
	color: #666;
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
	font-size :20px;
}
.layui-card.layui-demo-maincard{
	width:auto;
	height:auto;
}
input[type="text"]{
	margin-top:6px;
}
select{
	width:130px;
	height:20px;
	margin-top:4px;
}
</style>