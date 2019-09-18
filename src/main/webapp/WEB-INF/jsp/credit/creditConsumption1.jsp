<%@ page 	language="java" 
			contentType="text/html; charset=UTF-8"
    		pageEncoding="UTF-8"
    		deferredSyntaxAllowedAsLiteral="true"
    		%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
	
	<script type="text/javascript">
		
		$(document).ready(function () {
	        $('#table1').bootstrapTable({
	            url: '${pageContext.request.contextPath}/credit/queryAllConsumptionByuId',
	            method: 'post', 
	            columns: [
	                {
	                    sortable: "true",
	                    field: 'uId',
	                    title: 'ID',
	                    align: "center"
	                },
	                {
	                    sortable: "true",
	                    field: 'uName',
	                    title: '用户名',
	                    align: "center"
	                },
	                {
	                    sortable: "true",
	                    field: 'uSex',
	                    title: '性别',
	                    align: "center"
	                },
	                {
	                    field: 'uPhone',
	                    title: '手机号',
	                    align: "center"
	                },
	                {
	                    field: 'uEmail',
	                    title: '邮箱',
	                    align: "center"
	                },
	                {
	                    field: 'city.cCity',
	                    title: '城市',
	                    align: "center"
	                },	            
	                {
	                    sortable: "true",
	                    field: 'credit',
	                    title: '剩余积分',
	                    align: "center"
	                },
	    
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
	            	uId = row.uId;
	            	uName = row.uName;
	            	uSex = row.uSex;
	            	uPhone = row.uPhone;
	            	uEmail = row.uEmail;
	            	credit = row.credit;
	            	cCity = row.city.cCity;	            	
	            }
	        });
	    })
	    	
		
	        
	       
	    }
		
		
		
	</script>
	
	<div class="result-wrap">
        <div class="row">
            <div class="col-md-12">
                <table id="table1"></table>
            </div>
        </div>
    </div>
	