<%@ page 	language="java" 
			contentType="text/html; charset=UTF-8"
    		pageEncoding="UTF-8"
    		deferredSyntaxAllowedAsLiteral="true"
    		%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
	
	<script type="text/javascript">
		
		$(document).ready(function () {
	        $('#table1').bootstrapTable({
	            url: '${pageContext.request.contextPath}/exchange/queryAllExchange',
	            method: 'post', 
	            columns: [
	                {
	                    sortable: "true",
	                    field: 'exchangeNum',
	                    title: '编号',
	                    align: "center"
	                },
	                {
	                    sortable: "true",
	                    field: 'exchangeE',
	                    title: '比例',
	                    align: "center"
	                },
	                {
	                	field: 'option',
	                    title: '操作',
	                    align: "center",
	                    formatter: operateFormatter,
	                    events: operateEvents1
	                }
	            ],
	            height: 580,
	            pagination: true,
	            pageList: [10, 15],
	            search: true,
	            showHeader: true,
	            pageNumber: 1,
	            pageSize: 10,
	            striped: false,
	            toolbar: '#toolbar',
	            showRefresh: true,
	            paginationPreText: "上一页",
	            paginationNextText: "下一页",
	            clickToSelect: true, //是否启用点击选中行
	            smartDisplay: false,//智能显示分页按钮
	            queryParams: function (params) {
	                return {
	                    rows: this.pageSize,
	                    page: this.pageNumber,
	                    sort: this.sortName,
	                    order: this.sortOrder
	                };
	            },
	            onLoadSuccess: function () {  
	                console.info("加载成功");
	            },
	            onLoadError: function () {  
	                console.info("加载数据失败");
	            },
	            onClickRow: function (row) {
	            	exchangeNum = row.exchangeNum;
	            	exchangeE = row.exchangeE;
	            }
	        });
	    })
	    
	    function operateFormatter(value, row, index) {
			return [
		        '<button class="btn btn-info btn-xs rightSize updateBtn" type="button"><i class="fa fa-paste"></i><span class="glyphicon glyphicon-pencil" aria-hidden="true"></span> 修改</button>&nbsp;'
		    ].join('');
	    }
		
		window.operateEvents1 = {
	        "click .updateBtn": function (e, value, row, index) {
	        	window.location.href = "${pageContext.request.contextPath}/exchange/updateExchange?exchangeNum="+exchangeNum;
	        }
	    }
		
	</script>
	
	<div class="result-wrap">
        <div class="row">
            <div class="col-md-12">
                <table id="table1"></table>
            </div>
        </div>
    </div>
