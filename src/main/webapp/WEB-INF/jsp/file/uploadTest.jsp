<%@ page 	language="java" 
			contentType="text/html; charset=UTF-8"
    		pageEncoding="UTF-8"
    		deferredSyntaxAllowedAsLiteral="true"
    		%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

	<form action="${pageContext.request.contextPath}/file/upload?uId=${loginUser.uId}" method="post" enctype="multipart/form-data" onsubmit="return doCheck()">
		<input class="btn btn-default" type="file" id="file" name="file" width="120px" value="选择文件" accept="image/*">
		<input class="btn btn-info" type="submit" value="上传">
		<!-- <button type="button" class="btn btn-danger" onclick="check()">检测</button> -->
	</form>
	<hr>
	<form action="${pageContext.request.contextPath}/file/down.chao" method="get">
		<input class="btn btn-info" type="submit" value="下载">
	</form>
	
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
		/*	前期用于检测的函数，暂时废弃
		function check() {
			var fileName = $("#file").val();
			console.info(fileName);
			if(fileName==""||fileName==null){
				console.info(fileName.length+" null");
			}else{
				console.info(fileName.length+" true")
			}
		}
		*/
	</script>