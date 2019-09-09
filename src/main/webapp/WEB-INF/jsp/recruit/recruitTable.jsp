<%@ page 	language="java" 
			contentType="text/html; charset=UTF-8"
    		pageEncoding="UTF-8"
    		deferredSyntaxAllowedAsLiteral="true"
    		%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

	<script type="text/javascript">

		function dotext(recruitText) {		
				window.location.href = "${pageContext.request.contextPath}/recruit/recruitText?recruitText="+recruitText;
			
		}
		
	
	</script>
	
	
	<div class="table-responsive text-center">
  		<form action="">
  			<div>
  				<div>
  					<h1>会员列表</h1>
  				</div>
  				
  				<div class="container" >
					<div class="input-group col-xs-3">
						<input type="text" class="form-control input-sm" id="search" name="search">
						<span class="input-group-addon btn btn-primary" href="javascript:;" onclick="doSearch();">搜索</span>
					</div>
				</div>
  			</div>
  			<div>
  				<table class="table table-striped table-bordered">
	  			<tr class="demo-table-hover">
	  				<td>发布人	</td>
	  				<td>教师</td>
	  				<td>所在城市</td>
	  				<td>科目</td>
	  				<td>详细信息</td>
	  				<td>
	  					
	  				</td>
	  			</tr>
	  			<c:forEach items="${pageInfo.list}" var="recruits">
	  				<tr>
		  				<td>${recruits.uId}</td>
		  				<td>${recruits.uId2}</td>
		  				<td>${recruits.cNum}</td>
		  				<td>${recruits.classNum}</td>
		  				<td>${recruits.recruitText}</td>
		  				<td>
		  					<a class="btn btn-primary btn-xs" role="button" href="javascript:;" onclick="dotext('${recruits.recruitText}');">详细信息</a>
		  				</td>
	  				</tr>
	  			</c:forEach>
  			</table>
  			</div>
  		
  		</form>
  	</div>

  	<div class="text-center">
  		<p>当前 ${pageInfo.pageNum}页,&nbsp;总${pageInfo.pages}页,&nbsp;总 ${pageInfo.total}条记录</p>
  		<a class="btn btn-info" href="studentTable?pageNum=1">首&nbsp;页</a>
        <c:if test="${pageInfo.hasPreviousPage}">
            <a class="btn btn-info" href="studentTable?pageNum=${pageInfo.pageNum-1}">上一页</a>
        </c:if>
        <c:if test="${pageInfo.hasNextPage}">
            <a class="btn btn-info" href="studentTable?pageNum=${pageInfo.pageNum+1}">下一页</a>
        </c:if>
        <a class="btn btn-info" href="studentTable?pageNum=${pageInfo.pages}">尾&nbsp;页</a>
  	</div>
