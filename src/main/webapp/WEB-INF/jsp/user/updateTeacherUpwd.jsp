<%@ page 	language="java" 
			contentType="text/html; charset=UTF-8"
    		pageEncoding="UTF-8"
    		deferredSyntaxAllowedAsLiteral="true"
    		%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<script type="text/javascript">
	function doback(){
		var uId = $("#uId").val();
		console.info(uId);
    	window.location.href = "${pageContext.request.contextPath}/user/teacherReturn";
	}
	
	
	//修改密码
	function doUpdate(){
        var submit = true;
        var oldPwd=$("#oldPwd").val(); /*原始密码*/
        var newPwd=$("#newPwd").val(); /*新密码1*/
        var newPwd2=$("#newPwd2").val(); /*新密码2*/
        var uId=$("#uId").val(); /*新密码2*/
        
 
        if((oldPwd && newPwd && newPwd2)=='' ){
           
            submit=false;
            layer.msg("密码不能为空", {
				time : 2000,
				icon : 5,
				shift : 6
			});
        }
        
        if(newPwd!=newPwd2){
        	submit=false;
        	layer.msg("两次输入的新密码不相同", {
				time : 2000,
				icon : 5,
				shift : 6
			});
        }
        var loadingIndex = null;
        if(submit){
            $.ajax({
                type:"post",
                url:"${pageContext.request.contextPath}/user/updatePwd",
                data:{
                	"oldPwd":oldPwd,
                	"newPwd":newPwd,
                	"uId":uId
                	},
               	beforeSend : function(){
               		loadingIndex = layer.msg('处理中', {icon: 16});
               	},
                success:function (result){
                    
                    layer.close(loadingIndex);
            		var resObj = JSON.parse(result);
            		if (resObj.result) {   
    					layer.msg("修改成功", {time:2000, icon:6, shift:6}, function(){
        	        		window.location.href = "${pageContext.request.contextPath}/user/teacherReturn";
                        });
            		} else {
            			layer.msg("原密码错误", {time:2000, icon:5, shift:6}, function(){
                            
                        });               
            		}
                
                },
            	error : function(err){
            		layer.msg("系统错误", {time:2000, icon:5, shift:6}, function(){
                        
                    });
            	}
            });
 
    }
}

	
</script>

<div align="center" style="padding-top: 50px;">
	
	<div>
	<h1 class="title1">修改密码</h1>
	</div>
	<br/>
	<hr/>
	<br/>
	<br/>
	<div class="col-md-offset-0">
	<div class="elegant-aero">
	<form action="${pageContext.request.contextPath}/user/doUpdateTeacherUpwd" method="post" accept-charset="utf-8" onsubmit="return doUpdate()">
				
			<div class="row form-group">
              <label for="oldPwd" class="control-label col-lg-3"><span>输入原始密码</span></label>
                  <div class="col-md-7">
                      <input id="oldPwd" type="password" name="oldPwd" data-validate-length-range="4,12"  class="form-control col-md-7 col-xs-12" required="required" style="margin-top:7px">
                   </div>
                    </div>
                     <div class="row form-group">
                         <label for="newPwd" class="control-label col-lg-3"><span>输入新密码</span></label>
                          <div class="col-md-7">
                               <input id="newPwd" type="password" name="newPwd" data-validate-length-range="5,12" class="form-control col-md-7 col-xs-12" required="required" style="margin-top:7px">
                                </div>
                      </div>
                      <div class="row form-group">
                          <label for="newPwd2" class="control-label col-lg-3"><span>确认新密码</span></label>
                           <div class="col-md-7">
                                <input id="newPwd2" type="password" name="newPwd2" data-validate-linked="newPwd" class="form-control col-md-7 col-xs-12" required="required" style="margin-top:7px">
                            </div>
                        </div>
			<br/>
            
            <div class="row form-group">
            	<input type="hidden" id="courierNo" name="uId" value="${loginUser.uId}" />
            	<input type="hidden" id="uId" name="uId" value="${user.uId}"/> 
					<button type="button" class="btn btn-danger" id="pwd_btn" name ="pwd_btn" onclick="doUpdate();">确认</button>
					<button type="button" class="btn btn-danger" onclick="doback();">返回</button>				
            </div>

	</form>
	</div>
	</div>
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

input:focus {
box-shadow: 0 0 5px 2px rgba(0, 0, 0, 0.3);
}

box-shadow: 0 0 35px 15px rgba(29, 43, 100, 0.9) inset;

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

.title1 {

background: #EEE url(data:image/gif;base64,iVBORw0KGgoAAAANSUhEUgAAAAQAAAAECAIAAAAmkwkpAAAAHklEQVQImWNkYGBgYGD4//8/A5wF5SBYyAr+//8PAPOCFO0Q2zq7AAAAAElFTkSuQmCC) repeat;

text-shadow: 3px -3px black, 2px -2px white;

font-weight: bold;

-webkit-text-fill-color: transparent;

-webkit-background-clip: text;

}

.title2 {

color: transparent;

-webkit-text-stroke: 1px black;

letter-spacing: 0.04em;

}

.elegant-aero {
margin-left: auto;
margin-right: auto;
max-width: 80%;
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
</style>