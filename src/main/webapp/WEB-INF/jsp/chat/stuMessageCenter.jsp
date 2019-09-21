<%@ page 	language="java" 
			contentType="text/html; charset=UTF-8"
    		pageEncoding="UTF-8"
    		deferredSyntaxAllowedAsLiteral="true"
    		%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
	
	<script type="text/javascript">
		
		$(document).ready(function () {
	        $('#table1').bootstrapTable({
	            url: '${pageContext.request.contextPath}/chat/queryAllTeacher',
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
	                    field: 'uAcc',
	                    title: '昵称',
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
	            	uId = row.uId;
	            	uAcc = row.uAcc;
	            		            	
	            }
	        });
	    })
	    
	    function operateFormatter(value, row, index) {
			return [
				'<button class="btn btn-primary btn-xs rightSize chatBtn" type="button"><i class="fa fa-paste"></i><span class="glyphicon glyphicon-tag" aria-hidden="true"></span>聊天</button>&nbsp;',
		    ].join('');
	    }
		
		window.operateEvents1 = {
	       <!--聊天跳转页面-->
	        "click .chatBtn": function (e, value, row, index) {
	        	window.location.href = "${pageContext.request.contextPath}/chat/chatInfo?uId="+uId;
	        }
	        
	    }
		
		function doAdd() {
			console.info("ADD");
			window.location.href = "${pageContext.request.contextPath}/user/insertStudent";
		}
		
	</script>
	
	<div class="result-wrap">
        <div class="row">
            <div class="col-md-12">
                <table id="table1"></table>
            </div>
        </div>
    </div>
	<div id="toolbar" class="btn-group">
		<a class="btn btn-success btn-default" role="button" href="javascript:;" onclick="doAdd();" >
			<span class="glyphicon glyphicon-plus" aria-hidden="true"></span>历史消息
		</a>
	</div>