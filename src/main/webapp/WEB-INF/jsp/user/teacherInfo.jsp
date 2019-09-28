<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" deferredSyntaxAllowedAsLiteral="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<style>
/* 进度条样式设置 开始 */
.progress_bar {
	display: inline-block;
	width: 200px;
	height: 20px;
	border-radius: 8px;
	border: 1px solid #eee;
	overflow: hidden;
	box-shadow: 0 0 1px #ccc;
	margin: 0px 10px;
}

.progress_bar span {
	display: inline-block;
	height: 100%;
	width: 0;
	line-height: 20px;
	vertical-align: top;
	transition: all .6s;
}

.progress_bar_label {
	font-size: 14px;
	font-weight: bold;
	vertical-align: top;
	margin: 0 5px;
}
/* 进度条样式设置 结束 */
</style>



<script type="text/javascript">
		
		function doUpdate(uId) {		
			window.location.href = "${pageContext.request.contextPath}/user/updateTeacherInfo?uId="+uId;
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
                <label class="control-label col-lg-3" for="name"><span class="spanstyle">用户ID：</span></label>
                <div class="col-md-7">
                	<label class="form-control" type="text" id="uID" name="uID" value = "${user.uId}"><span>${user.uId}</span></label>
                </div>
            </div>

			<div class="row form-group">
                <label class="control-label col-lg-3" for="name"><span class="spanstyle">用户身份：</span></label>
                <div class="col-md-7">
                	<label class="form-control" type="text" id="roName" name="roName" value = "${user.group.role.roName }"><span>${user.group.role.roName }</span></label>
                </div>
            </div>
			
			<div class="row form-group">
                <label class="control-label col-lg-3" for="name"><span class="spanstyle">状态：</span></label>
                <div class="col-md-7">
                	<label class="form-control" type="text">			      
                	<script type="text/javascript">
			      		var exp = null;
			      		if (isNull(exp))
			      		{
			      			alert("请认证");
			     		}
                  	</script>
					</label>
                </div>
            </div>
            
			<div class="row form-group">
                <label class="control-label col-lg-3" for="name"><span class="spanstyle">城市：</span></label>
                <div class="col-md-7">
                	<label class="form-control" type="text" id="cNum" name="cNum" value = "${user.cNum}"><span class="spanstyle">${user.cNum}</span></label>
                </div>
            </div>
			
			<div class="row form-group">
                <label class="control-label col-lg-3" for="name"><span class="spanstyle">学科：</span></label>
                <div class="col-md-7">
                	<label class="form-control" type="text" id="classNum" name="classNum" value = "${user.classNum}"><span class="spanstyle">${user.classNum}</span></label>
                </div>
            </div>
            
			<div class="row form-group">
                <label class="control-label col-lg-3" for="name"><span class="spanstyle">经验值：</span></label>
                <div class="col-md-7">
                	<label class="form-control" type="text" id="uExp" name="uExp" value = "${user.uExp}"><span>${user.uExp}</span></label>
                </div>
            </div>
            
			<div class="row form-group">
                <label class="control-label col-lg-3" for="name"><span class="spanstyle">姓名：</span></label>
                <div class="col-md-7">
                	<label class="form-control" type="text" id="uName" name="uName" value = "${user.uName }"><span>${user.uName }</span></label>
                </div>
            </div>		

			<div class="row form-group">
                <label class="control-label col-lg-3" for="name"><span class="spanstyle">性别：</span></label>
                <div class="col-md-7">
                	<label class="form-control" type="text" id="uSex" name="uSex" value = "${user.uSex}"><span>${user.uSex}</span></label>
                </div>
            </div>		

			<div class="row form-group">
                <label class="control-label col-lg-3" for="name"><span class="spanstyle">手机：</span></label>
                <div class="col-md-7">
                	<label class="form-control" type="text" id="uPhone" name="uPhone" value = "${user.uPhone}"><span>${user.uPhone}</span></label>
                </div>
            </div>		

			<div class="row form-group">
                <label class="control-label col-lg-3" for="name"><span class="spanstyle">邮箱：</span></label>
                <div class="col-md-7">
                	<label class="form-control" type="text" id="uEmail" name="uEmail" value = "${user.uEmail}"><span>${user.uEmail}</span></label>
                </div>
            </div>		
			
			<br />

			<div class="row form-group">
				 <input type="hidden" id=uId name="uId" value="${user.uId}"/> 
                 
                 <div style="padding-right:65px;">
                 <a class="btn btn-primary btn-xs" role="button" href="javascript:;" onclick="doUpdate('${user.uId}');">修改个人信息</a>	
				 </div>
			</div>
		</form>
		</div>
  	</div>
  	</div>

<script>
	function updataProgressBar() { //更新进度条信息
		//进度条设置
		var $color = $('.progress_bar').attr('#ff6600'); //data-color 为进度条颜色 例#ff6600
		$('.progress_bar').each(function() {
			var per = $(this).attr('100'); //data-per 为进度条 进度值  1-100
			var barWidth = $(this).attr('10px'); //data-width 为进度条宽度 值自定义 单位自动填充px
			$(this).find('span').css({
				'#ff6600' : $color,
				'10px' : per + '%'
			})//修改进度条颜色和进度条占比
			.parent().css({
				'width' : barWidth
			})//修改进度整体宽度
			.next().text(per + '%');//修改进度条文字
		})
	}

	$(function() {
		updataProgressBar();
	})
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
max-width: 500px;
background: #D2E9FF;
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

</style>