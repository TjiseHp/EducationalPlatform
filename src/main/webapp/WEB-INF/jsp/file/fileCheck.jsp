<%@ page 	language="java" 
			contentType="text/html; charset=UTF-8"
    		pageEncoding="UTF-8"
    		deferredSyntaxAllowedAsLiteral="true"
    		%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<script type="text/javascript">
			<!--${user.uId2}-->
	function checkPs(){
		var listName = "${check_list.listName}";
		var uId2 = 110;
		
			layer.confirm('确认通过？', {
				  btn: ['确认','取消'] //按钮
				}, function(){
					
					$.ajax({
	                    type: "post",
	                    url: "${pageContext.request.contextPath}/file/fileCheckYes",
	                    data: {
	                    	"listName": listName,
	                    	"uId2": uId2
                  			},
                  			beforeSend : function(){
       		        		loadingIndex = layer.msg('处理中', {icon: 16});
       		        	},
	                    success: function (result) {
	                    	layer.close(loadingIndex);
	                    	var resObj = JSON.parse(result);
	                    	if(resObj.result){
	                    		layer.msg("审核成功", {time:2000, icon:6, shift:6}, function(){
	                    			window.location.href = "${pageContext.request.contextPath}/file/fileList";
			                    });
	                    		
	                    	}else{
	                    		layer.msg("审核无法通过", {time:2000, icon:5, shift:6}, function(){
	                    			
			                    });
	                    	}
	                        $("#table1").bootstrapTable('refresh');
	                    },
	                    error: function () {
	                    	layer.msg("审核失败！", {time:2000, icon:5, shift:6}, function(){
		                    	
		                    });
	                    }
	                }) 
				}, function(){
					
				});
		
    }
		
	function checkNoPs(){
		var listName = "${check_list.listName}";
		var uId2 = 110;
		
			layer.confirm('确认审核不通过？', {
				  btn: ['确认','取消'] //按钮
				}, function(){
					
					$.ajax({
	                    type: "post",
	                    url: "${pageContext.request.contextPath}/file/fileCheckNo",
	                    data: {
	                    	"listName": listName,
	                    	"uId2": uId2
                  			},
                  			beforeSend : function(){
       		        		loadingIndex = layer.msg('处理中', {icon: 16});
       		        	},
	                    success: function (result) {
	                    	layer.close(loadingIndex);
	                    	var resObj = JSON.parse(result);
	                    	if(resObj.result){
	                    		layer.msg("审核成功", {time:2000, icon:4, shift:6}, function(){
	                    			window.location.href = "${pageContext.request.contextPath}/file/fileList";
			                    });
	                    		
	                    	}else{
	                    		layer.msg("审核错误", {time:2000, icon:5, shift:6}, function(){
	                    			
			                    });
	                    	}
	                        $("#table1").bootstrapTable('refresh');
	                    },
	                    error: function () {
	                    	layer.msg("审核失败！", {time:2000, icon:5, shift:6}, function(){
		                    	
		                    });
	                    }
	                }) 
				}, function(){
					
				});
		
		
    }
		
		
	
</script>

<div align="center" style="padding-top: 50px;">
		<table class="table table-bordered table-striped" style="width: 500px;">		
			
			<tr>
				<td class="text-right">
					<strong>文件信息</strong>
				</td>		
			</tr>		
			<tr>
				<td class="text-left">
					<img alt="${check_list.listName}" src="/img777/${check_list.listName}">
				</td>
			</tr>						
			<tr>
				<td colspan="2" class="text-center">
					<button  onclick="checkPs()">通过</button>
					<button  onclick="checkNoPs()">不通过</button>
				</td>
			</tr>
		</table>   
		
</div>