<%@ page 	language="java" 
			contentType="text/html; charset=UTF-8"
    		pageEncoding="UTF-8"
    		deferredSyntaxAllowedAsLiteral="true"
    		%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

	<script type="text/javascript">
		
		$(document).ready(function () {
	        $('#table1').bootstrapTable({
	            url: '${pageContext.request.contextPath}/user/queryTeacherByworking	',
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
	                    title: '教师姓名',
	                    align: "center"
	                },
	                {
	                    sortable: "true",
	                    field: 'uSex',
	                    title: '性别',
	                    align: "center"
	                },
	                {
	                    field: 'uEmail',
	                    title: '邮箱',
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
	                    sortable: "true",
	                    field: 'uExp',
	                    title: '等级',
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
	            	uName = row.uName;
	            	uSex = row.uSex;
	            	uPhone = row.uPhone;
	            	uEmail = row.uEmail;
	            	uExp = row.uExp;
	            	classNum = row.classNum;
	            	cNum = row.cNum;
	            }
	        });
	    })
	    
	    function operateFormatter(value, row, index) {
			return [
		        '<button class="btn btn-info btn-xs rightSize updateBtn" type="button"><i class="fa fa-paste"></i><span class="glyphicon glyphicon-pencil" aria-hidden="true"></span>  聊天</button>&nbsp;',
		        '<button class="btn btn-primary btn-xs rightSize deleteBtn" type="button"><i class="fa fa-envelope"></i><span class="glyphicon glyphicon-search" aria-hidden="true"></span> 手机号码查看</button>'
		    ].join('');
	    }
		
		window.operateEvents1 = {
	        "click .deleteBtn": function (e, value, row, index) {
	        	uId = row.uId;
	        	uId2 = ${loginUser.uId};
	        	layer.confirm('确认查看？', {
					btn: ['确认','取消'] 
				}, function(){
					$.ajax({
	                    type: "post",
	                    url: "${pageContext.request.contextPath}/recruit/lookPhone",
	                    data: {
	                    	"uId": uId2,
	                    	"uId2": uId
                  			},
                  			beforeSend : function(){
       		        		loadingIndex = layer.msg('处理中', {icon: 16});
       		        	},
	                    success: function (result) {
	                    	layer.close(loadingIndex);
	                    	var resObj = JSON.parse(result);
	                    	if (resObj.result) {
	            					$.ajax({
	            	                    type: "post",
	            	                    url: "${pageContext.request.contextPath}/recruit/lookPhone2",
	            	                    data: {
	            	                    	"uId": uId
	                              			},
	                   		        	dataType:"json",
	            	                    success: function (result) {
	            	                    	layer.close(loadingIndex);
	            	                    	alert(result.uName+"的电话号码:"+result.uPhone+'\n'+"(扣除积分300)");
	            	                    },
	            	                    error: function () {
	            	                    	layer.msg("查看失败2！", {time:2000, icon:5, shift:6}, function(){
	            		                    	
	            		                    });
	            	                    }
	            	                })
			        		} else {
			        			//嵌套
			        			
			    					$.ajax({
			    	                    type: "post",
			    	                    url: "${pageContext.request.contextPath}/recruit/lookPhone3",
			    	                    data: {
			    	                    	"uId": uId2,
			    	                    	"uId2": uId
			                      			},
			    	                    success: function (result) {
			    	                    	layer.close(loadingIndex);
			    	                    	var resObj = JSON.parse(result);
			    	                    	if (resObj.result) {
			    	            					$.ajax({
			    	            	                    type: "post",
			    	            	                    url: "${pageContext.request.contextPath}/recruit/lookPhone2",
			    	            	                    data: {
			    	            	                    	"uId": uId
			    	                              			},
			    	                   		        	dataType:"json",
			    	            	                    success: function (result) {
			    	            	                    	layer.close(loadingIndex);
			    	            	                    	alert(result.uName+"的电话号码:"+result.uPhone+'\n'+"(第二次查看，不再重复收费)");
			    	            	                    },
			    	            	                    error: function () {
			    	            	                    	layer.msg("查看失败2！", {time:2000, icon:5, shift:6}, function(){
			    	            		                    	
			    	            		                    });
			    	            	                    }
			    	            	                })
			    			        		} else {    
			    			        			
			    			                    layer.msg("积分不足，请充值", {time:2000, icon:5, shift:6}, function(){
			    			                    	
			    			                    });
			    			        		}
			    	                    },
			    	                    error: function () {
			    	                    	layer.msg("查看失败1！", {time:2000, icon:5, shift:6}, function(){
			    		                    	
			    		                    });
			    	                    }
			    	                })
			        			//嵌套
			        		
			        		}
	                    },
	                    error: function () {
	                    	layer.msg("查看失败1！", {time:2000, icon:5, shift:6}, function(){
		                    	
		                    });
	                    }
	                })
				}, function(){
				  
				});
	        	
                
                operateFormatter();
	        },
	        
	        "click .updateBtn": function (e, value, row, index) {
	        	window.location.href = "${pageContext.request.contextPath}/chat/createMessage";
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







