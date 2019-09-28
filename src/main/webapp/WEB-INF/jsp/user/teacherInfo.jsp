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
		<table class="table elegant-aero" style="width: 500px;" >

			<tr>
				<td class="text-right">
					<strong>用户ID:</strong>
				</td>
				<td class="text-middle">
					<p>${user.uId}</p>
				</td>
			</tr>
			
			<tr>
				<td class="text-right">

					<strong>用户身份:</strong>
				</td>
				<td class="text-left">
					<p>${user.group.role.roName }</p>
				</td>
			</tr>
			
			
			<tr>
				<td class="text-right">

					<strong>状态:</strong>
				</td>
				<td class="text-left">
				<c:if test="${user.check.cStatus=='未审核'}">
					<form action="${pageContext.request.contextPath}/file/upload?uId=${loginUser.uId}" method="post" enctype="multipart/form-data" onsubmit="return doCheck()">
						<input class="btn btn-default" type="file" id="file" name="file" width="120px" value="选择文件" accept="image/*">
						<input class="btn btn-info" type="submit" value="上传">
					</form>
				</c:if>
				<c:if test="${user.check.cStatus=='审核通过'}">
				<p>${user.check.cStatus}</p>
				</c:if>
				
				</td>
			</tr>
			
			<tr>
				<td class="text-right">
					<strong>城市:</strong>
				</td>
				<td class="text-left">
					<p>${user.cNum}</p>
				</td>
			</tr>
			
			<tr>
				<td class="text-right">
					<strong>学科:</strong>
				</td>
				<td class="text-left">
					<p>${user.group.role.roText}</p>
				</td>
			</tr>
			
			<tr>
				<td class="text-right">
					<strong>经验值:</strong>
				</td>
				<td class="text-left">
				<p>${user.uExp}</p>      	
				</td>
			</tr>
					
			<tr>
				<td class="text-right">
					<strong>姓名:</strong>
				</td>
				<td class="text-left">
					<p>${user.uName }</p>
				</td>
			</tr>
			
			<tr>
				<td class="text-right">
					<strong>性别:</strong>
				</td>
				<td class="text-left">
					<p>${user.uSex}</p>
				</td>
			</tr>
			
			<tr>
				<td class="text-right">
					<strong>手机:</strong>
				</td>
				<td class="text-left">
					<p>${user.uPhone}</p>
				</td>
			</tr>
			
			<tr>
				<td class="text-right">
					<strong>邮箱:</strong>
				</td>
				<td class="text-left">
				<p>	${user.uEmail}</p>
				</td>
			</tr>
			
			<tr>
				<td colspan="2" class="text-center">
                      <input type="hidden" id=uId name="uId" value="${user.uId}"/> 
                      <a class="btn btn-primary btn-xs" role="button" href="javascript:;" onclick="doUpdate('${user.uId}');">修改个人信息</a>			
                </td>
			</tr>
			
		</table>
		
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
.elegant-aero {
margin-left: auto;
margin-right: auto;
max-width: 500px;
background: #D2E9FF;
padding: 20px 20px 20px 20px;
font: 12px Arial, Helvetica, sans-serif;
color: #666;
}
td{border: 1px solid transparent !important;}
.layui-card.layui-demo-maincard{
	width:auto;
	height:auto;
}
</style>