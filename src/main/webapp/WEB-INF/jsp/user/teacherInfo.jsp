<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" deferredSyntaxAllowedAsLiteral="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>



<script type="text/javascript">
		
		function doUpdate(uId) {
			window.location.href = "${pageContext.request.contextPath}/user/updateTeacherInfo?uId="+uId;
		}
		
		function doUpdateUpwd(uId){
			window.location.href = "${pageContext.request.contextPath}/user/updateTeacherUpwd?uId="+uId;		
		}

</script>



<div align="center" style="padding-top: 50px;">
  	<div>
	<h1 class="title1">个人信息</h1>
	</div>
	<br />
	<hr />
	<br /> <br />


	<div class="col-md-offset-0">
	<div class="elegant-aero">
	
			<div class="row form-group">
                <label class="control-label col-lg-3" for="name"><span class="spanstyle">用户ID：</span></label>
                <div class="col-md-7">
                	<label class="form-control" type="text" id="uID" name="uID" value = "${user.uId}"><span style="font-size:15px;font-weight:normal;">${user.uId}</span></label>
                </div>
            </div>


			<div class="row form-group">
                <label class="control-label col-lg-3" for="name"><span class="spanstyle">用户身份：</span></label>
                <div class="col-md-7">
                	<label class="form-control" type="text" id="roName" name="roName" value = "${user.group.role.roName }"><span style="font-size:15px;font-weight:normal;">${user.group.role.roName }</span></label>
                </div>
            </div>
			
			<div class="row form-group">
                <label class="control-label col-lg-3" for="name"><span class="spanstyle">状态：</span></label>
                <div class="col-md-7">
                				      
                <!-- 
				<c:if test="${user.check.cStatus=='未审核'}">
					<form action="${pageContext.request.contextPath}/file/upload?uId=${loginUser.uId}" method="post" enctype="multipart/form-data" onsubmit="return doCheck()">
						<input class="btn btn-default" type="file" id="file" name="file" width="120px" value="选择文件" accept="image/*">
						<input class="btn btn-info" type="submit" value="上传">
					</form>
				</c:if>
				<c:if test="${user.check.cStatus=='审核通过'}">
				<label class="form-control" type="text" id="uSex" name="uSex"><span>${user.check.cStatus}</span></label>
				</c:if>
				 -->
				<c:if test="${user.checkNum==1}">
					<form action="${pageContext.request.contextPath}/file/upload?uId=${loginUser.uId}" method="post" enctype="multipart/form-data" onsubmit="return doCheck()">
						<input class="btn btn-default" type="file" id="file" name="file" width="120px" value="选择文件" accept="image/*">
						<input class="btn btn-info" type="submit" value="上传">
					</form>
				</c:if>
				<c:if test="${user.checkNum==2}">
				<label class="form-control" type="text" id="uSex" name="uSex"><span>审核通过</span></label>
				</c:if>
				
				
                </div>
            </div>
            
			<div class="row form-group">
                <label class="control-label col-lg-3" for="name"><span class="spanstyle">城市：</span></label>
                <div class="col-md-7">
                	<label class="form-control" type="text" id="cProvince" name="cProvince" value = ""><span style="font-size:15px;font-weight:normal;">${user.city.cProvince}&nbsp;${user.city.cCity}</span></label>
                </div>
            </div>
			
			<div class="row form-group">
                <label class="control-label col-lg-3" for="name"><span class="spanstyle">学科：</span></label>
                <div class="col-md-7">
                	<label class="form-control" type="text" id="classKind" name="classKind" value = ""><span style="font-size:15px;font-weight:normal;">${user.uClass.classKind}</span></label>
                </div>
            </div>
            
			<div class="row form-group">
                <label class="control-label col-lg-3" for="name"><span class="spanstyle">等级：</span></label>
                <div class="col-md-7">
                	<label class="form-control" type="text" id="uExp" name="uExp" value = ""><span style="font-size:15px;font-weight:normal;">${user.leave}</span></label>
                </div>
            </div>
            
			<div class="row form-group">
                <label class="control-label col-lg-3" for="name"><span class="spanstyle">姓名：</span></label>
                <div class="col-md-7">
                	<label class="form-control" type="text" id="uName" name="uName" value = "${user.uName }"><span style="font-size:15px;font-weight:normal;">${user.uName }</span></label>
                </div>
            </div>	
            	

			<div class="row form-group">
                <label class="control-label col-lg-3" for="name"><span class="spanstyle">性别：</span></label>
                <div class="col-md-7">
                	<label class="form-control" type="text" id="uSex" name="uSex" value = "${user.uSex}"><span style="font-size:15px;font-weight:normal;">${user.uSex}</span></label>
                </div>
            </div>		

			<div class="row form-group">
                <label class="control-label col-lg-3" for="name"><span class="spanstyle">手机：</span></label>
                <div class="col-md-7">
                	<label class="form-control" type="text" id="uPhone" name="uPhone" value = "${user.uPhone}"><span style="font-size:15px;font-weight:normal;">${user.uPhone}</span></label>
                </div>
            </div>		

			<div class="row form-group">
                <label class="control-label col-lg-3" for="name"><span class="spanstyle">邮箱：</span></label>
                <div class="col-md-7">
                	<label class="form-control" type="text" id="uEmail" name="uEmail" value = "${user.uEmail}"><span style="font-size:15px;font-weight:normal;">${user.uEmail}</span></label>
                </div>
            </div>		
			
			<br />

			<div class="row form-group">
				 <input type="hidden" id=uId name="uId" value="${user.uId}"/> 
                 
                 <div style="padding-right:65px;">
                 <a class="btn btn-primary btn-xs" role="button" href="javascript:;" onclick="doUpdate('${user.uId}');">修改个人信息</a>	
                  <a class="btn btn-primary btn-xs" role="button" href="javascript:;" onclick="doUpdateUpwd('${user.uId}');">修改密码</a>
				 </div>
			
</div>
</div>
		</div>
  	</div>
 

<script type="text/javascript">
	function doCheck(){
		var fileName = $("#file").val();
		if(fileName==""||fileName==null||fileName.length<1){
			layer.msg("请先选择文件！", {time:2000, icon:5, shift:6}, function(){
               });
			return false;
		}else{
			return true;
		}
	}
</script>
<style>
td{border: 1px solid transparent !important;}
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
max-width:80%;
max-width: 80%;
padding: 20px 20px 20px 60px;
font: 12px Arial, Helvetica, sans-serif;
color: #666;
}

.elegant-aero label>span {
float: left;
color: #5E5E5E;
}

.elegant-aero label {
display: block;
margin: 0px 0px 5px;
}

.elegant-aero label>span {
float: left;
width: 100%;
text-align: left;
padding-right: 15px;
font-weight: bold;
font-size :20px;
}
.layui-card.layui-demo-maincard{
	width:auto;
	height:auto;
}
</style>