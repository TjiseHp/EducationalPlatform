<%@ page 	language="java" 
			contentType="text/html; charset=UTF-8"
    		pageEncoding="UTF-8"
    		deferredSyntaxAllowedAsLiteral="true"
    		%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<script type="text/javascript">
		
	$(document).ready(function(){
		var uId=${loginUser.uId};
		console.info(uId);
		window.location.href = "${pageContext.request.contextPath}/stuInfo/stuInfoCenter?uId="+uId;
	})

</script>