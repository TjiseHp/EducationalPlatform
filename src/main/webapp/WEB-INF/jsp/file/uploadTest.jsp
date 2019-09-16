<%@ page 	language="java" 
			contentType="text/html; charset=UTF-8"
    		pageEncoding="UTF-8"
    		deferredSyntaxAllowedAsLiteral="true"
    		%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

	<form action="${pageContext.request.contextPath}/file/upload.chao" method="post" enctype="multipart/form-data">
		<input class="btn btn-default" type="file" name="file" width="120px" value="选择文件">
		<input class="btn btn-info" type="submit" value="上传">
	</form>
	<hr>
	<form action="${pageContext.request.contextPath}/file/down.chao" method="get">
		<input class="btn btn-info" type="submit" value="下载">
	</form>