<%@ page 	language="java" 
			contentType="text/html; charset=UTF-8"
    		pageEncoding="UTF-8"
    		deferredSyntaxAllowedAsLiteral="true"
    		%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<script type="text/javascript">

		function doDel(creditNum) {
			layer.confirm('确认删除？', {
				btn: ['确认','取消'] //按钮
			}, function(){
				window.location.href = "${pageContext.request.contextPath}/credit/deleteCredit?creditNum="+creditNum;
			}, function(){
			  
			});
		}
		
		function doAdd(){
			window.location.href = "${pageContext.request.contextPath}/credit/creditInsert";
		}
		
		
		
	</script>
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
					  			    <td>序号</td>
					  				<td>积分	</td>
					  				<td>明细	</td>
					  				<td>时间	</td>
					  				<td>操作人</td>
					  				<td>
					  				    <a class="btn btn-primary btn-xs" role="button" href="javascript:;" onclick="doAdd('${creditDetail.uId}');">新增</a>					     
					  				</td>
					  			</tr>
					  			<c:forEach items="${pageInfo.list}" var="creditDetail">
					  				<tr>
					  					<td>${creditDetail.creditNum}</td>
						  				<td>${creditDetail.creditSum}</td>
						  				<td>${creditDetail.creditText}</td>
						  				<td>${creditDetail.creditDate}</td>
						  				<td>${creditDetail.creditPreson}</td>
						  				<td>
			  					            <a class="btn btn-danger btn-xs" role="button" href="javascript:;" onclick="doDel('${creditDetail.creditNum}');">删除</a>
						  				</td>
					  				</tr>
					  			</c:forEach>
				  			</table>
				  			</div>
				  		
				  		</form>
				  	</div>
 
				  	<div class="text-center">
				  		<p>当前 ${pageInfo.pageNum}页,&nbsp;总${pageInfo.pages}页,&nbsp;总 ${pageInfo.total}条记录</p>
				  		<a class="btn btn-info" href="creditDetail?pageNum=1">首&nbsp;页</a>
				        <c:if test="${pageInfo.hasPreviousPage}">
				            <a class="btn btn-info" href="creditDetail?pageNum=${pageInfo.pageNum-1}">上一页</a>
				        </c:if>
				        <c:if test="${pageInfo.hasNextPage}">
				            <a class="btn btn-info" href="creditDetail?pageNum=${pageInfo.pageNum+1}">下一页</a>
				        </c:if>
				        <a class="btn btn-info" href="creditDetail?pageNum=${pageInfo.pages}">尾&nbsp;页</a>
				  	</div>