<%@ page 	language="java" 
			contentType="text/html; charset=UTF-8"
    		pageEncoding="UTF-8"
    		deferredSyntaxAllowedAsLiteral="true"
    		%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

	<script type="text/javascript">

		function doDel(uId) {
			layer.confirm('确认删除？', {
				btn: ['确认','取消'] //按钮
			}, function(){
				window.location.href = "${pageContext.request.contextPath}/exchange/deleteExchange?exchangeNum="+exchangeNum;
			}, function(){
			  
			});
		}
		
		function doUpdate(exchangeNum) {		
			window.location.href = "${pageContext.request.contextPath}/exchange/updateExchange?exchangeNum="+exchangeNum;
		}
		
		function dodetail(uId){
			window.location.href = "${pageContext.request.contextPath}/exchange/exchangeDetail?exchangeNum="+exchangeNum;
		}
	
		function doSearch(){
			var search = $("#search").val();
			if(search == ""){
				window.location.href = "${pageContext.request.contextPath}/exchange/exchangeTable";
			}else{
				window.location.href = "${pageContext.request.contextPath}/exchange/searchExchange?search="+search;
			}
		}
		
		function doAdd() {
			window.location.href = "${pageContext.request.contextPath}/exchange/insertExchange";
		}
		
	</script>
	
<div class="table-responsive text-center">
				  		<form action="">
				  			<div>
				  				<div>
				  					<h1>积分比例列表</h1>
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
					  				<td>编号		</td>
					  				<td>比例		</td>
					  			
					  				<td>
					  					<a class="btn btn-success btn-xs" role="button" href="javascript:;" onclick="doAdd();" >详细信息</a>
					  				</td>
					  			</tr>
					  			<c:forEach items="${pageInfo.list}" var="exchanges">
					  				<tr>
						  				<td>${exchanges.exchangeNum}</td>
						  				<td>${exchanges.exchangeE}</td>
						  				
						  				<td>
						  					<a class="btn btn-primary btn-xs" role="button" href="javascript:;" onclick="doUpdate('${exchanges.exchangeNum}');">修改</a>
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