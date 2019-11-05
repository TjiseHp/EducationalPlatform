<%@ page 	language="java" 
			contentType="text/html; charset=UTF-8"
    		pageEncoding="UTF-8"
    		deferredSyntaxAllowedAsLiteral="true"
    		%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

	<script type="text/javascript">
		
		$(document).ready(function () {
	        $('#table1').bootstrapTable({
	            url: '${pageContext.request.contextPath}/recruit/queryRecruitByCity?uId=${loginUser.uId}',
	            method: 'post', 
	            columns: [
	                {
	                    sortable: "true",
	                    field: 'user1.uName',
	                    title: '发布人',
	                    align: "center"
	                },
	                {
	                    field: 'recruitText',
	                    title: '详细信息',
	                    align: "center"
	                },
	                {
	                    field: 'state',
	                    title: '发布时间',
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
	            	recruitText = row.recruitText;
	            	recruitSTime = row.recruitSTime;
	            	recruitNum = row.recruitNum;
	            }
	        });
	    })
	    
	    function operateFormatter(value, row, index) {
			return [
		        '<button class="btn btn-info btn-xs rightSize updateBtn" type="button"><i class="fa fa-paste"></i><span class="glyphicon glyphicon-hand-up" aria-hidden="true"></span> 申请</button>&nbsp;'
		    ].join('');
	    }
		
		window.operateEvents1 = {
	        "click .deleteBtn": function (e, value, row, index) {
	        	uId = row.uId;
	        	console.info(uId);
	        	layer.confirm('确认删除？', {
					btn: ['确认','取消'] 
				}, function(){
					$.ajax({
	                    type: "post",
	                    url: "${pageContext.request.contextPath}/",
	                    data: {
	                    	"uId": uId
                  			},
                  			beforeSend : function(){
       		        		loadingIndex = layer.msg('处理中', {icon: 16});
       		        	},
	                    success: function (result) {
	                    	layer.close(loadingIndex);
	                    	var resObj = JSON.parse(result);
	                    	if (resObj.result) {
	                    		 layer.msg("删除成功", {time:2000, icon:6, shift:6}, function(){
				                    	
			                    });
			        		} else {
			                    layer.msg("删除失败", {time:2000, icon:5, shift:6}, function(){
			                    	
			                    });
			        		}
	                        $("#table1").bootstrapTable('refresh');
	                    },
	                    error: function () {
	                    	layer.msg("删除失败！", {time:2000, icon:5, shift:6}, function(){
		                    	
		                    });
	                    }
	                })
				}, function(){
				  
				});
	        	
                
                operateFormatter();
	            $("#table1").bootstrapTable('refresh');
	        },
	        
	        "click .updateBtn": function (e, value, row, index) {
	        	layer.confirm('确认申请？', {
					btn: ['确认','取消'] 
				}, function(){
	            	recruitNum = row.recruitNum;
					window.location.href = "${pageContext.request.contextPath}/recruit/teacherApplyRecruit?recruitNum="+recruitNum;
				}, function(){
				  
				});
	        	
	        }
	    }
		
		function doAdd() {
			console.info("ADD");
			window.location.href = "${pageContext.request.contextPath}/";
		}
		
	</script>
	
	<div class="result-wrap">
        <div class="row">
            <div class="col-md-12">
                <table id="table1"></table>
            </div>
        </div>
    </div>





