<%@ page 	language="java" 
			contentType="text/html; charset=UTF-8"
    		pageEncoding="UTF-8"
    		deferredSyntaxAllowedAsLiteral="true"
    		%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
	
	<script type="text/javascript">
		
	
		$(document).ready(function () {
			var uId = window.location.search.substring(window.location.search.indexOf("=")+1);
			console.info(uId);
	        $('#table1').bootstrapTable({
	            url: '${pageContext.request.contextPath}/credit/queryAllDetailById?uId='+uId,
	            method: 'post', 
	            columns: [
            	  
	                {
	                    sortable: "true",
	                    field: 'creditDate',
	                    title: '时间',
	                    align: "center",
	                    	formatter: function (value, row, index) {
		                        return changeDateFormat(value)
		                    }
	                },
	                {
	                    sortable: "true",
	                    field: 'creditSum',
	                    title: '积分',
	                    align: "center"
	                },
	                {	          
	                    field: 'creditText',
	                    title: '明细',
	                    align: "center"
	                },
	
	                {
	                    field: 'creditPreson',
	                    title: '操作人',
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
	            	creditNum = row.creditNum;
	            	creditSum = row.creditSum;
	            	creditText = row.creditText;
	            	creditDate = row.creditDate;
	            	creditPreson = row.creditPreson;        	
	            }
	        });
	    })
	    
	    
	    function operateFormatter(value, row, index) {
			return [
		        '<button class="btn btn-danger btn-xs rightSize deleteBtn" type="button"><i class="fa fa-envelope"></i><span class="glyphicon glyphicon-remove" aria-hidden="true"></span> 删除</button>'
		    ].join('');
	    }
		
		function changeDateFormat(cellval) {
		    var dateVal = cellval + "";
		    if (cellval != null) {
		        var date = new Date(parseInt(dateVal.replace("/Date(", "").replace(")/", ""), 10));
		        var month = date.getMonth() + 1 < 10 ? "0" + (date.getMonth() + 1) : date.getMonth() + 1;
		        var currentDate = date.getDate() < 10 ? "0" + date.getDate() : date.getDate();
		 
		        var hours = date.getHours() < 10 ? "0" + date.getHours() : date.getHours();
		        var minutes = date.getMinutes() < 10 ? "0" + date.getMinutes() : date.getMinutes();
		        var seconds = date.getSeconds() < 10 ? "0" + date.getSeconds() : date.getSeconds();
		 
		        return date.getFullYear() + "-" + month + "-" + currentDate + " " + hours + ":" + minutes + ":" + seconds;
		    }
		}
		
		window.operateEvents1 = {
	        "click .deleteBtn": function (e, value, row, index) {
            	creditNum = row.creditNum;	
	        	console.info(creditNum);
	        	layer.confirm('确认删除？', {
					btn: ['确认','取消'] 
				}, function(){
					$.ajax({
	                    type: "post",
	                    url: "${pageContext.request.contextPath}/credit/deleteCredit2",
	                    data: {
	                    	"creditNum": creditNum
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
	        
	    }
		
		function doAdd() {
			console.info("ADD");
			window.location.href = "${pageContext.request.contextPath}/credit/creditInsert";
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
			<span class="glyphicon glyphicon-plus" aria-hidden="true"></span>新增
		</a>
	</div>