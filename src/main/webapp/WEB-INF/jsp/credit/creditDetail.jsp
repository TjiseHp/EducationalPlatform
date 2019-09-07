<%@ page 	language="java" 
			contentType="text/html; charset=UTF-8"
    		pageEncoding="UTF-8"
    		deferredSyntaxAllowedAsLiteral="true"
    		%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<div class="table-responsive text-center">
				  		<form action="">
				  			<div>
				  				<div>
				  					<h1>用户积分详情表</h1>
				  				</div>
				  			
				  			</div>
				  			<div>
				  				<table class="table table-striped table-bordered">
					  			<tr class="demo-table-hover">
					  				<td>积分	</td>
					  				<td>明细	</td>
					  				<td>时间	</td>
					  				<td>操作人</td>
					  				<td>备注</td>
					  			</tr>
					  			<c:forEach items="${pageInfo.list}" var="creditConsumption">
					  				<tr>
						  				<td>${creditConsumption.creditSum}</td>
						  				<td>${creditConsumption.creditText}</td>
						  				<td>${creditConsumption.creditDate}</td>
						  				<td>${creditConsumption.creditPreson}</td>
						  				<td>${creditConsumption.creditText2}</td>
					  				</tr>
					  			</c:forEach>
				  			</table>
				  			</div>
				  		
				  		</form>
				  	</div>
 
				  	<div class="text-center">
				  		<p>当前 ${pageInfo.pageNum}页,&nbsp;总${pageInfo.pages}页,&nbsp;总 ${pageInfo.total}条记录</p>
				  		<a class="btn btn-info" href="creditConsumption?pageNum=1">首&nbsp;页</a>
				        <c:if test="${pageInfo.hasPreviousPage}">
				            <a class="btn btn-info" href="creditConsumption?pageNum=${pageInfo.pageNum-1}">上一页</a>
				        </c:if>
				        <c:if test="${pageInfo.hasNextPage}">
				            <a class="btn btn-info" href="creditConsumption?pageNum=${pageInfo.pageNum+1}">下一页</a>
				        </c:if>
				        <a class="btn btn-info" href="creditConsumption?pageNum=${pageInfo.pages}">尾&nbsp;页</a>
				  	</div>