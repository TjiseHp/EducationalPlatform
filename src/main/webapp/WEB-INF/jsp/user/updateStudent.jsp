<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" deferredSyntaxAllowedAsLiteral="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" import="com.hp.bean.User" %>
<script type="text/javascript">
	
		$(function(){
			$.ajax({
				   type:"post",
				   url:"${pageContext.request.contextPath}/user/cProvince",
				   dataType:"json",
				   success:function(result){
					   for(var i=0;i<result.length;i++ ){
						   $("#s1").append("<option value='"+result[i].cProvince+"'>"+result[i].cProvince+"</option>");
					   }
				   }
			   });
			
			 $("#s1").change(function(){
				   $("#s2 option:gt(0)").remove();
				   var cProvince = $("#s1 option:selected").val();
						$.ajax({
						type:"post",
					   url:"${pageContext.request.contextPath}/user/cCity",
					   data:{"cProvince":cProvince},
					   dataType:"json",
					   success:function(result){
					   for(var i=0;i<result.length;i++ ){
							   $("#s2").append("<option value='"+result[i].cNum+"'>"+result[i].cCity+"</option>");
					   }
				   }
				  })
			})  
		})

</script>
<script type="text/javascript">
	function doPost() {
		var uId = "${user.uId}";
		var uName = $("#uName").val();
		var uPhone = $("#uPhone").val();
		var uEmail = $("#uEmail").val();
		var uSex = $('input:radio[name="uSex"]:checked').val();
		var cNum = $("#s2").val();

		if (uName == "" || uPhone == "" || uEmail == "" || uSex == "") {
			layer.msg("内容不能为空", {
				time : 2000,
				icon : 5,
				shift : 6
			});
			return false;
		}
		console.info(uName+" "+cNum+" "+uSex+" "+uPhone+" "+uId);

		var loadingIndex = null;
		$.ajax({
        	type : "POST",
        	url  : "${pageContext.request.contextPath}/user/doUpdateStudent",
        	data : {
        		"uId" : uId,
        		"uName" : uName,
        	    "uPhone" : uPhone,
        		"uEmail" :uEmail,
        		"uSex" : uSex,
        		"cNum" : cNum
        	},
        	beforeSend : function(){
        		loadingIndex = layer.msg('处理中', {icon: 16});
        	},
        	success : function(result) {
        		layer.close(loadingIndex);
        		var resObj = JSON.parse(result);
        		console.info(resObj);
        		console.info(resObj.result);
        		if (resObj.result) {   
					layer.msg("ok", {time:2000, icon:6, shift:6}, function(){
    	        	window.location.href = "${pageContext.request.contextPath}/user/studentTable2";
                    });
        		} else {
        			layer.msg("修改失败", {time:2000, icon:5, shift:6}, function(){
                        
                    });               
        		}
        	},
        	error : function(err){
        		layer.msg("系统错误", {time:2000, icon:5, shift:6}, function(){
                    
                });
        	}
        });
		
		
		

	}
</script>

<div align="center" style="padding-top: 50px;">
	<div>
		<h1  class="title1">修改信息</h1>
	</div>
	<br />
	<hr />
	<br /> <br />
	<div class="col-md-offset-0">
	<div class="elegant-aero">
		<form action="${pageContext.request.contextPath}/user/doUpdateStudent"
			method="post" accept-charset="utf-8" onsubmit="return doPost()">

			<div class="row form-group">
				<label class="control-label col-lg-3" for="name"><span>姓名：</span></label>
				<div class="col-md-7">
					<input class="form-control" type="text" id="uName" name="uName"
						value="${user.uName }">
				</div>
			</div>

			<div class="row form-group">
				<label class="control-label col-lg-3" for="name"><span>性别：</span></label>
				<div class="col-md-7">
					<div style="padding:5px">
						<%-- <lable class="radio-inline"><input class="form-control" type="radio" id="uSex1" name="uSex" value="${user.uSex}" ${user.uSex=="男"?"checked":""}><span>男</span></lable>
						&nbsp;&nbsp;&nbsp;
						<lable class="radio-inline"><input class="form-control" type="radio" id="uSex2" name="uSex" value="${user.uSex}" ${user.uSex=="女"?"checked":""}><span>女</span></lable> --%>
					    <lable class="sex">
						    <input id="man" type="radio" value="男" checked="checked" name="uSex" />男   &nbsp;&nbsp;&nbsp;
						    <input id="woman" type="radio"  value="女" name="uSex"/>女
					    </lable>
					</div>
				</div>
			</div>

			<div class="row form-group">
				<label class="control-label col-lg-3" for="name"><span>手机：</span></label>
				<div class="col-md-7">
					<input class="form-control" type="text" id="uPhone" name="uPhone"
						value="${user.uPhone}">
				</div>
			</div>

			<div class="row form-group">
				<label class="control-label col-lg-3" for="name"><span>邮箱：</span></label>
				<div class="col-md-7">
					<input class="form-control" type="text" id="uEmail" name="uEmail"
						value="${user.uEmail}">
				</div>
			</div>

			<div class="row form-group">
				<label class="control-label col-lg-3" for="name"><span>城市：</span></label>
				<div class="col-md-7">
					<select style="width: 100px" id="s1" >
				        <option >--请选择--</option>
				    </select>
				    <select style="width: 100px" id="s2">
				        <option >--请选择--</option>
				    </select> 	
				</div>
			</div>

			<br />

			<div class="row form-group">
				<%-- <input type="hidden" id=courierNo name="uId" value="${user.uId }" />
				<input class="btn btn-danger" type="submit" value="提交" /> --%>
               <button type="button" class="btn btn-danger" onclick="doPost();">提交</button>				
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
max-width: 500px;
background: #D2E9FF;
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
}
.layui-card.layui-demo-maincard{
	width:auto;
	height:auto;
}
</style>
