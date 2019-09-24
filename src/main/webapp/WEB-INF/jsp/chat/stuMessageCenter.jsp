<%@ page 	language="java" 
			contentType="text/html; charset=UTF-8"
    		pageEncoding="UTF-8"
    		deferredSyntaxAllowedAsLiteral="true"
    		%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
	
	<script type="text/javascript">
		
		$(document).ready(function () {
			var uId=${loginUser.uId};
			console.info(uId);
	        $('#table1').bootstrapTable({
	            url: '${pageContext.request.contextPath}/chat/queryAllReceiveInfoByuId?uId='+uId,
	            method: 'post', 
	            columns: [
	                {
	                    field: 'user1.uName',
	                    title: '发件人',
	                    align: "center"
	                },
	                {
	                    field: 'user1.uEmail',
	                    title: '邮箱',
	                    align: "left"
	                },
	                {
	                    field: 'chatText',
	                    title: '内容',
	                    align: "left"
	                },
	                {
	                    sortable: "true",
	                    field: 'chatDate',
	                    title: '时间',
	                    align: "center"
	                },
	                {
	                    sortable: "true",
	                    field: 'cSNum',
	                    title: '状态',
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
	            	user1.uName = row.user1.uName;
	            	user1.uEmail = row.user1.uEmail;	            	
	            	chatText=row.chatText;
	            	chatDate = row.chatDate;
	            	cSNum = row.cSNum;
	            		            		            	
	            }
	        });
	    })
	    function operateFormatter(value, row, index) {
			return [
				'<button class="btn btn-primary btn-xs rightSize chatBtn" type="button"><i class="fa fa-paste"></i><span class="glyphicon glyphicon-tag" aria-hidden="true"></span>查看</button>&nbsp;',
		        '<button class="btn btn-danger btn-xs rightSize deleteBtn" type="button"><i class="fa fa-envelope"></i><span class="glyphicon glyphicon-remove" aria-hidden="true"></span> 删除</button>'
		    ].join('');
	    }
		
		window.operateEvents1 = {
	        "click .deleteBtn": function (e, value, row, index) {
	        	chatNum = row.chatNum;
	        	console.info(chatNum);
	        	layer.confirm('确认删除？', {
					btn: ['确认','取消'] 
				}, function(){
					$.ajax({
	                    type: "post",
	                    url: "${pageContext.request.contextPath}/chat/deleteChatInfo",
	                    data: {
	                    	"chatNum": chatNum
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
	        
	        "click .chatBtn": function (e, value, row, index) {
				var uId=${loginUser.uId};
	        	console.info(uId);
	            chatNum = row.chatNum;
				console.info("chatNum");
	        	window.location.href = "${pageContext.request.contextPath}/chat/showReceiveInfo?chatNum="+chatNum+"&uId="+uId;
	        }
	        
	    }
		
		function doCreate() {
			console.info("Create");
			window.location.href = "${pageContext.request.contextPath}/user/insertStudent";
		}
		function deSend() {
			console.info("Send");
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
		<a class="btn btn-success btn-default" role="button" href="javascript:;" onclick="doCreate();" >
			<span class="glyphicon glyphicon-plus" aria-hidden="true"></span>新建信息
		</a>
	</div>
	<div id="toolbar" class="btn-group">
		<a class="btn btn-success btn-default" role="button" href="javascript:;" onclick="doSend();" >
			<span class="glyphicon glyphicon-plus" aria-hidden="true"></span>发件箱
		</a>
	</div>