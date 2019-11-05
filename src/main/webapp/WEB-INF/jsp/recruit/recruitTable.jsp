<%@ page 	language="java" 
			contentType="text/html; charset=UTF-8"
    		pageEncoding="UTF-8"
    		deferredSyntaxAllowedAsLiteral="true"
    		%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

	<script type="text/javascript">
		
		$(document).ready(function () {
	        $('#table1').bootstrapTable({
	            url: '${pageContext.request.contextPath}/recruit/queryRecruitTable?uId=${loginUser.uId}',
	            method: 'post', 
	            columns: [
	                {
	                    sortable: "true",
	                    field: 'user1.uName',
	                    title: '发布人',
	                    align: "center"
	                },
	                {
	                    sortable: "true",
	                    field: 'user2.uName',
	                    title: '教师',
	                    align: "center"
	                },
	                {
	                    field: 'city.cCity',
	                    title: '所在城市',
	                    align: "center"
	                },
	                {
	                    field: 'uClass.classKind',
	                    title: '科目',
	                    align: "center"
	                },
	                {
	                    field: 'state',
	                    title: '完成时间',
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
	            	uId2 = row.uId2;
	            	cNum = row.cNum;
	            	classNum = row.classNum;
	            	recruitText = row.recruitText;
	            }
	        });
	    })
	    
	    function operateFormatter(value, row, index) {
			return [
		        '<button class="btn btn-info btn-xs rightSize updateBtn" type="button"><i class="fa fa-paste"></i><span class="glyphicon glyphicon-pencil" aria-hidden="true"></span> 详细要求</button>&nbsp;',
		        '<button class="btn btn-danger btn-xs rightSize deleteBtn" type="button"><i class="fa fa-envelope"></i><span class="glyphicon glyphicon-remove" aria-hidden="true"></span> 结束课程</button>'
		    ].join('');
	    }
		
		window.operateEvents1 = {
	        "click .deleteBtn": function (e, value, row, index) {
	        	uId = row.uId;
	        	console.info(uId);
	        	layer.confirm('确认结束？', {
					btn: ['确认','取消'] 
				}, function(){
	            	recruitNum = row.recruitNum;
					window.location.href = "${pageContext.request.contextPath}/recruit/endTeacher?recruitNum="+recruitNum;
				}, function(){
				  
				});
	        	
                
                operateFormatter();
	            $("#table1").bootstrapTable('refresh');
	        },
	        
	        "click .updateBtn": function (e, value, row, index) {
            	recruitNum = row.recruitNum;
	        	window.location.href = "${pageContext.request.contextPath}/recruit/recruitTextInfo?recruitNum="+recruitNum;
	        }
	    }
		
		function doAdd() {
			console.info("ADD");
			window.location.href = "${pageContext.request.contextPath}/recruit/insertRecruit";
		}
		
	</script>
	
	<div class="result-wrap">
        <div class="row">
            <div class="col-md-12">
                <table id="table1"></table>
            </div>
        </div>
    </div>



