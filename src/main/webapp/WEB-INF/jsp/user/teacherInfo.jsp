<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" deferredSyntaxAllowedAsLiteral="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<style>

</style>



<script type="text/javascript">
		
		function doUpdate(uId) {		
			window.location.href = "${pageContext.request.contextPath}/user/updateTeacherInfo?uId="+uId;
		}

</script>


<div align="center" style="padding-top: 50px;">
  		
	<form >
		<table class="table table-bordered table-striped" style="width: 500px;" >
		    <tr>
				<td colspan="2" class="text-center">
				 <h1>个人信息</h1>
                </td>
			</tr>
			
			<tr>
				<td class="text-right">
					<strong>用户ID:</strong>
				</td>
				<td class="text-left">
					<p>${user.uId}</p>
				</td>
			</tr>
			
			<tr>
				<td class="text-right">
					<strong>用户身份:</strong>
				</td>
				<td class="text-left">
					
					<script type="text/javascript">
					function getuId($uId){
					    $uText = "";
					    if($uId) {
					        switch($uId){
					            case 1:
					                $uText = "";
					                break;
					            case 2:
					                $uText = "教师";
					                break;
					            case 3:
					                $uText = "大学生";
					                break;
					        }
					    }
					    return uText;
					}
					</script>
					
				</td>
			</tr>
			
			
			<tr>
				<td class="text-right">
					<strong>状态:</strong>
				</td>
				<td class="text-left">
			   <script type="text/javascript">
					function getCheckNum($checkNum){
					    $cStatus = "";
					    if($checkNum) {
					        switch($checkNum){
					            case 1:
					                $cStatus = "未通过";
					                break;
					            case 2:
					                $cStatus = "已通过";
					                break;
					        }
					    }
					    return cStatus;
					}
					</script>
					
									
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
					<p>${user.classNum}</p>
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
		
	</form>
  	</div>
	<div>
		<h1>个人信息</h1>
	</div>
	<br />
	<hr />
	<br /> <br />
	<div class="col-md-offset-3">
		<form>

			<div class="row form-group">
				<label class="control-label col-lg-2" for="name">用户ID：</label>
				<div class="col-md-6">
					<label class="form-control" type="text" id="uId" name="uId"
						value="">${user.uId }</label>
				</div>
			</div>

			<div class="row form-group">
				<label class="control-label col-lg-2" for="name">城市：</label>
				<div class="col-md-6">
					<label class="form-control" type="text" id="cNum" name="cNum"
						value="${user.cNum}">${user.cNum}</label>
				</div>
			</div>

			<div class="row form-group">
				<label class="control-label col-lg-2" for="name">学科：</label>
				<div class="col-md-6">
					<label class="form-control" type="text" id="classNum"
						name="classNum" value="${user.classNum}">${user.classNum}</label>
				</div>
			</div>


			<div class="row form-group">
				<label class="control-label col-lg-2" for="name">经验值：</label>
				<div class="col-md-6">
					<div class="progress_bar" data-color="#f60" data-per="90"
						data-width="300"></div>
					<label class="progress_bar_label">${user.uExp }</label>
				</div>
			</div>

			<div class="row form-group">
				<label class="control-label col-lg-2" for="name">姓名：</label>
				<div class="col-md-6">
					<label class="form-control" type="text" id="uName" name="uName"
						value="">${user.uName }</label>
				</div>
			</div>

			<div class="row form-group">
				<label class="control-label col-lg-2" for="name">性别：</label>
				<div class="col-md-6">
					<label class="form-control" type="text" id="uSex" name="uSex"
						value="">${user.uSex}</label>
				</div>
			</div>

			<div class="row form-group">
				<label class="control-label col-lg-2" for="name">手机：</label>
				<div class="col-md-6">
					<label class="form-control" type="text" id="uPhone" name="uPhone"
						value="">${user.uPhone}</label>
				</div>
			</div>

			<div class="row form-group">
				<label class="control-label col-lg-2" for="name">邮箱：</label>
				<div class="col-md-6">
					<label class="form-control" type="text" id="uEmail" name="uEmail"
						value="">${user.uEmail}</label>
				</div>
			</div>


			<div class="row form-group">
				<div class="col-md-10">
					<input type="hidden" id=uId name="uId" value="${user.uId}" /> <a
						class="btn btn-primary btn-xs" role="button" href="javascript:;"
						onclick="doUpdate('${user.uId}');">修改个人信息</a>
				</div>
			</div>

		</form>
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
