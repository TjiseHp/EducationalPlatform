<%@ page 	language="java" 
			contentType="text/html; charset=UTF-8"
    		pageEncoding="UTF-8"
    		deferredSyntaxAllowedAsLiteral="true"
    		%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>

<script type="text/javascript">
		
		function doUpdate(uId) {		
			window.location.href = "${pageContext.request.contextPath}/stuInfo/updateStuInfo?uId="+uId;
		}
		
		function doUpdateUpwd(uId){
			window.location.href = "${pageContext.request.contextPath}/stuInfo/updateUpwd?uId="+uId;		
		}
		
		function doCredit(uId){
			window.location.href = "${pageContext.request.contextPath}/credit/sCreditDetail?uId="+uId;		
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
	<form>
	
			<div class="row form-group">
                <label class="control-label col-lg-3" for="name"><span class="spanstyle">账号：</span></label>
                <div class="col-md-7">
                	<label class="form-control" type="text" id="uID" name="uID" value = "${user.uAcc}"><span>${user.uAcc}</span></label>
                </div>
            </div>
				
			<div class="row form-group">
                <label class="control-label col-lg-3" for="name"><span class="spanstyle">姓名：</span></label>
                <div class="col-md-7">
                	<label class="form-control" type="text" id="uID" name="uID" value = "${user.uName }"><span>${user.uName }</span></label>
                </div>
            </div>
            
			<div class="row form-group">
                <label class="control-label col-lg-3" for="name"><span class="spanstyle">性别：</span></label>
                <div class="col-md-7">
                	<label class="form-control" type="text" id="uID" name="uID" value = "${user.uSex}"><span>${user.uSex}</span></label>
                </div>
            </div>
            
			<div class="row form-group">
                <label class="control-label col-lg-3" for="name"><span class="spanstyle">手机：</span></label>
                <div class="col-md-7">
                	<label class="form-control" type="text" id="uID" name="uID" value = "${user.uPhone}"><span>${user.uPhone}</span></label>
                </div>
            </div>

			<div class="row form-group">
                <label class="control-label col-lg-3" for="name"><span class="spanstyle">邮箱：</span></label>
                <div class="col-md-7">
                	<label class="form-control" type="text" id="uID" name="uID" value = "${user.uEmail}"><span>${user.uEmail}</span></label>
                </div>
            </div>
			
			<div class="row form-group">
                <label class="control-label col-lg-3" for="name"><span class="spanstyle">城市：</span></label>
                <div class="col-md-7">
                	<label class="form-control" type="text" id="uID" name="uID" value = "${user.city.cCity}"><span>${user.city.cCity}</span></label>
                </div>
            </div>
            
			<div class="row form-group">
                <label class="control-label col-lg-3" for="name"><span class="spanstyle">剩余积分：</span></label>
                <div class="col-md-7">
                	<label class="form-control" type="text" id="uID" name="uID" value = "${user.credit}"><span>${user.credit}</span>
                	<a style="margin-left:250px;margin-top: -43px;" class="btn btn-primary btn-xs" role="button" href="javascript:;" onclick="doCredit('${user.uId}');">积分详情</a>
                	</label>
                </div>
            </div>
			
			<div class="row form-group">
                 <div style="padding-right:10px;">
                 <a class="btn btn-primary btn-xs" role="button" href="javascript:;" onclick="doUpdate('${user.uId}');">修改个人信息</a>			                                 
                      <a class="btn btn-primary btn-xs" role="button" href="javascript:;" onclick="doUpdateUpwd('${user.uId}');">修改密码</a>			
				 </div>
			</div>

	</form>
  	</div>
  	</div>
  	</div>
<style>
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
}
.layui-card.layui-demo-maincard{
	width:auto;
	height:auto;
}
.spanstyle{
	padding-top:7px;
	text-align:left;
	font-weight: normal;
}
td{border: 1px solid transparent !important;}
.layui-card.layui-demo-maincard{
	width:auto;
	height:auto;
}

.title1 {

background: #EEE url(data:image/gif;base64,iVBORw0KGgoAAAANSUhEUgAAAAQAAAAECAIAAAAmkwkpAAAAHklEQVQImWNkYGBgYGD4//8/A5wF5SBYyAr+//8PAPOCFO0Q2zq7AAAAAElFTkSuQmCC) repeat;

text-shadow: 3px -3px black, 2px -2px white;

font-weight: bold;

-webkit-text-fill-color: transparent;

-webkit-background-clip: text;

}
</style>