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
		window.location.href = "${pageContext.request.contextPath}/user/updateTeacherInfo?uId="
				+ uId;
	}
</script>


<div align="center" style="padding-top: 50px;">
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