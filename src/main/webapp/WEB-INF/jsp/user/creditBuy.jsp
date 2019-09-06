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
				  					<h1>历史购买订单查询表</h1>
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
					  				<td>充值积分	</td>
					  			<!--  	<td>明细	</td>-->
					  				<td>时间	</td>
					  			</tr>
					  			<c:forEach items="${pageInfo.list}" var="creditBuy">
					  				<tr>
						  				<td>${creditBuy.creditSum}</td>
						  			<!--  	<td>${creditConsumption.creditText}</td>-->
						  				<td>${creditBuy.creditDate}</td>
					  				</tr>
					  			</c:forEach>
				  			</table>
				  			</div>
				  		
				  		</form>
				  	</div>
 
				  	<div class="text-center">
				  		<p>当前 ${pageInfo.pageNum}页,&nbsp;总${pageInfo.pages}页,&nbsp;总 ${pageInfo.total}条记录</p>
				  		<a class="btn btn-info" href="creditBuy?pageNum=1">首&nbsp;页</a>
				        <c:if test="${pageInfo.hasPreviousPage}">
				            <a class="btn btn-info" href="creditBuy?pageNum=${pageInfo.pageNum-1}">上一页</a>
				        </c:if>
				        <c:if test="${pageInfo.hasNextPage}">
				            <a class="btn btn-info" href="creditBuy?pageNum=${pageInfo.pageNum+1}">下一页</a>
				        </c:if>
				        <a class="btn btn-info" href="creditBuy?pageNum=${pageInfo.pages}">尾&nbsp;页</a>
				  	</div>