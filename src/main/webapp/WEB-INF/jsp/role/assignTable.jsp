<%@ page 	language="java" 
			contentType="text/html; charset=UTF-8"
    		pageEncoding="UTF-8"
    		deferredSyntaxAllowedAsLiteral="true"
    		%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
	
	
	
	<div class="container" align="center">
		<div class="text-center"><h1>权限修改</h1></div>
		<br/>
		<div>
			<button class="btn btn-success" onclick="doAjaxAssign()">提交修改</button>
		</div>
		<br/>
		<div class="col-md-offset-5">
			<ul id="permissionTree" class="ztree"></ul>
		</div>
	</div>
	
	
	
	<script type="text/javascript" >
			$(function(){
				var setting = {
						async: {
				            enable: true,
				            type: 'post',
				            dataType: "json",
				            url: "${pageContext.request.contextPath}/menu/loadAssignData?roNo=${param.roNo}",
				            autoParam: ["id"],
				        },
				        data: {
				            simpleData: {
				                enable: true,
				                idKey: "menuNo",
				                pIdKey: "menuUpperNo",
				                rootPId: -1
				            },
				            key:{
				                name:"menuName" //节点显示的值
				               }
				        },
				        view: {
							selectedMulti: true,
							addDiyDom: function(treeId, treeNode){
								var icoObj = $("#" + treeNode.tId + "_ico");
								if ( treeNode.icon ) {
									icoObj.removeClass("button ico_docu ico_open").addClass(treeNode.icon).css("background","");
								}
							}
						},
						check: {
							enable : true 
						}
				};
				$.fn.zTree.init($("#permissionTree"), setting);
			})
			
		</script>
		
		<script type="text/javascript">
			function doAjaxAssign() {
				var treeObj = $.fn.zTree.getZTreeObj("permissionTree");
				var nodes = treeObj.getCheckedNodes(true);
				var length = nodes.length;
				if (nodes.length == 0) {
					layer.msg("权限不能为空，请重新输入！", {time:2000, icon:5, shift:6}, function(){
                    });
				}else {
					var roNo = "roNo=${param.roNo}";
					$.each(nodes,function(i,node){
						roNo += "&menuNo=" + node.menuNo
					});
					$.ajax({
						type	:"POST",
						url		:"${pageContext.request.contextPath}/role/doAjaxAssign",
						data	:roNo,
						success	:function(result){
							if(result){
								layer.msg("修改成功！", {time:2000, icon:6, shift:6}, function(){
									window.location.href = "${pageContext.request.contextPath}/role/roleTable";
			                    });
							}else{
								layer.msg("修改失败！", {time:2000, icon:5, shift:6}, function(){
			                    });
							}
						}
					});
				}
			}
		</script>