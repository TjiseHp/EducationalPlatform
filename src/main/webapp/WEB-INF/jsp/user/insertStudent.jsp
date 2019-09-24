<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" deferredSyntaxAllowedAsLiteral="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<script type="text/javascript">
	function doPost() {
		var uName = $("#uName").val();
		var uPhone = $("#uPhone").val();
		var uEmail = $("#uEmail").val();
		var uSex = $("#uSex").val();
		var cNum = $("#cNum").val();

		if (uName == "" || uPhone == "" || uEmail == "") {
			layer.msg("内容不能为空", {
				time : 2000,
				icon : 5,
				shift : 6
			});
			return false;
		} else {
			return true;
		}

	}
</script>

<div align="center" style="padding-top: 50px;">
	<form action="${pageContext.request.contextPath}/user/doInsertStudent" method="post" accept-charset="utf-8" onsubmit="return doPost()">
		<table class="table table-bordered table-striped" style="width: 500px;">
			
			<tr>
				<td class="text-right">
					<strong>姓名:</strong>
				</td>
				<td class="text-left">
					<input class="form-control" type="text" id="uName" name="uName">
				</td>
			</tr>
			<tr>
				<td class="text-right">
					<strong>性别:</strong>
				</td>
				<td class="text-left">
					<lable><input class="form-control" type="radio" id="uSex1" name="uSex" value = "${user.uSex}">男</lable>
					<lable><input class="form-control" type="radio" id="uSex2" name="uSex" value = "${user.uSex}">女</lable>			    
				</td>
			</tr>
			<tr>
				<td class="text-right">
					<strong>手机:</strong>
				</td>
				<td class="text-left">
					<input class="form-control" type="text" id="uPhone" name="uPhone">
				</td>
			</tr>
			<tr>
				<td class="text-right">
					<strong>邮箱:</strong>
				</td>
				<td class="text-left">
					<input class="form-control" type="text" id="uEmail" name="uEmail">
				</td>
			</tr>
			<tr>
				<td class="text-right">
					<strong>城市:</strong>
				</td>
				<td class="text-left">
					<input class="form-control" type="text" id="cNum" name="cNum" >
				</td>
			</tr>
			
			
			
			<tr>
				<td colspan="2" class="text-center">
					<input class="btn btn-default" type="submit" value="提交"/>
				</td>
			</tr>
		</table>
	</form>
	<div>
		<h1>新增信息</h1>
	</div>
	<br />
	<hr />
	<br /> <br />
	<div class="col-md-offset-3">
		<form action="${pageContext.request.contextPath}/user/doInsertStudent"
			method="post" accept-charset="utf-8" onsubmit="return doPost()">

			<div class="row form-group">
				<label class="control-label col-lg-2" for="name">姓名：</label>
				<div class="col-md-6">
					<input class="form-control" type="text" id="uName" name="uName"
						value="${user.uName }">
				</div>
			</div>
			<div class="row form-group">
				<label class="control-label col-lg-2" for="name">性别：</label>
				<div class="col-md-6">
					<input class="form-control" type="text" id="uSex" name="uSex"
						value="${user.uSex}">
				</div>
			</div>
			<div class="row form-group">
				<label class="control-label col-lg-2" for="name">手机：</label>
				<div class="col-md-6">
					<input class="form-control" type="text" id="uPhone" name="uPhone"
						value="${user.uPhone}">
				</div>
			</div>
			<div class="row form-group">
				<label class="control-label col-lg-2" for="name">邮箱：</label>
				<div class="col-md-6">
					<input class="form-control" type="text" id="uEmail" name="uEmail"
						value="${user.uEmail}">
				</div>
			</div>

			<div class="row form-group">
				<label class="control-label col-lg-2" for="name">城市：</label>
				<div class="col-md-6">
					<input class="form-control" type="text" id="cNum" name="cNum"
						value="${user.cNum}">
				</div>
			</div>

			<br />

			<div class="col-md-8">
				<div class="row form-group">
					<input type="hidden" id=courierNo name="uId" value="${user.uId }" />
					<input class="btn btn-default" type="submit" value="提交" />
				</div>
			</div>
		</form>
	</div>
</div>