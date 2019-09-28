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

<script type="text/javascript">

		$(".sex").change(function() {
		    var val = $('input:radio[name="uSex"]:checked').val();
		    console.log(val);
		    if(val == "男") {
		        return "男";
		    } else if(val == "女") {
		        return "女";
		    }
		})
		
		
		
		$(function(){
			$.ajax({
				   type:"post",
				   url:"${pageContext.request.contextPath}/user/city",
				   dataType:"json",
				   success:function(result){
					   for(var i=0;i<result.length;i++ ){
						   $("#s1").append("<option value='"+result[i].cNum+"'>"+result[i].cNum+"</option>");
					   }
				   }
			   });
			
			$("#s1").change(function(){
				   $("#s2 option:gt(0)").remove();
				   var cNum = $("#s1 option:selected").val();
						$.ajax({
						type:"post",
					   url:"${pageContext.request.contextPath}/user/cCity",
					   data:{"cNum":cNum},
					   dataType:"json",
					   success:function(result){
					   for(var i=0;i<result.length;i++ ){
							   $("#s2").append("<option value='"+result[i].cCity+"'>"+result[i].cCity+"</option>");
					   }
				   }
				  })
			})
		})
		
			  /*  $("#s1").change(function(){
				$("#s2 option:gt(0)").remove();   
			   var cNum = $("#s1 option:selected").val();
			   console.log(cNum);
					$.ajax({
					type:"post",
				   url:"${pageContext.request.contextPath}/user/cCity",
				   data:{"cNum":cNum},
				   dataType:"json",
				   success:function(result){
				   for(var i=0;i<result.length;i++ ){
						   $("#s2").append("<option value='"+result[i].cCity+"'>"+result[i].cCity+"</option>");
				   }
			   }
			  })
		}) */
		 
			



</script>
<div align="center" style="padding-top: 50px;">
	<form action="${pageContext.request.contextPath}/user/doInsertStudent" method="post" accept-charset="utf-8" onsubmit="return doPost()">
		<table class="table table-bordered table-striped" style="width: 500px;">
		<div>
		<h1>新增信息</h1>
	    </div>	
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
				<td class="text-left"  >
				    <lable class="sex">
				    <input id="man" type="radio" value="男" checked="checked" name="uSex" />男   &nbsp;&nbsp;&nbsp;
				    <input id="woman" type="radio"  value="女" name="uSex"/>女
				    </lable>
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
				<!--  	<input class="form-control" type="text" id="cNum" name="cNum" >-->
					<select style="width: 100px" id="s1">
				        <option >--请选择--</option>
				    </select>
				     <select style="width: 100px" id="s2">
				        <option >--请选择--</option>
				    </select>
				</td>
			</tr>
			
			
			
			<tr>
				<td colspan="2" class="text-center">
					<input class="btn btn-default" type="submit" value="提交"/>
				</td>
			</tr>
		</table>
	</form>
</div>