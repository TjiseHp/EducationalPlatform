<%@page import="java.awt.Window"%>
<%@ page 	language="java" 
			contentType="text/html; charset=UTF-8"
    		pageEncoding="UTF-8"
    		deferredSyntaxAllowedAsLiteral="true"
    		%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>

<html>
	<head>
		<meta 	charset="utf-8">
		<meta 	name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1，user-scalable=no">
		<meta 	http-equiv="X-UA-Compatible" content="IE=edge">
		<!-- <meta 	name="viewport" content="width=device-width, initial-scale=1 , user-scalable=no"> -->
		<meta 	name="description" content="">
		<meta 	name="author" content="">
	  <title>教育平台</title>
	  <script type="text/javascript" src="${pageContext.request.contextPath}/plug/jquery/jquery-2.1.1.min.js"></script>
	  <script type="text/javascript" src="${pageContext.request.contextPath}/plug/layui/layui.js"></script>
	  <script type="text/javascript" src="${pageContext.request.contextPath}/plug/bootstrap/js/bootstrap.min.js"></script>
	  <script type="text/javascript" src="${pageContext.request.contextPath}/plug/bt/js/bootstrap-table.min.js"></script>
	  <script type="text/javascript" src="${pageContext.request.contextPath}/plug/bt/js/bootstrap-table-zh-CN.min.js"></script>
	  <script type="text/javascript" src="${pageContext.request.contextPath}/plug/datetime/js/bootstrap-datetimepicker.min.js"></script>
	  <script type="text/javascript" src="${pageContext.request.contextPath}/plug/datetime/js/bootstrap-datetimepicker.zh-CN.js"></script>
	  <script type="text/javascript" src="${pageContext.request.contextPath}/plug/layer/layer.js"></script>
	  <script type="text/javascript" src="${pageContext.request.contextPath}/plug/zTree/js/jquery.ztree.all.min.js"></script>
	  <link 	rel="stylesheet" 	href="${pageContext.request.contextPath}/plug/layer/skin/default/layer.css">
	  <link 	rel="stylesheet" 	href="${pageContext.request.contextPath}/plug/bootstrap/css/bootstrap.min.css">
	  <link 	rel="stylesheet" 	href="${pageContext.request.contextPath}/plug/bt/css/bootstrap-table.min.css">
	  <link 	rel="stylesheet" 	href="${pageContext.request.contextPath}/plug/datetime/css/bootstrap-datetimepicker.min.css">
	  <link 	rel="stylesheet" 	href="${pageContext.request.contextPath}/plug/layui/css/layui.css">
	  <link		rel="stylesheet"	href="${pageContext.request.contextPath}/plug/zTree/css/zTreeStyle/zTreeStyle.css">
	  <style 	type="text/css">
	  	.layui-demo-maincard{
	  		margin: 20px 20px;
	  		height: 99%;
	  	}
	  	
	  	table tr:hover td{
	  		background:#e7eaf6;
	  	}
	  	
	  </style>
	  
	  <%
		  if(session.getAttribute("loginUser")==null){
				response.sendRedirect(request.getContextPath()+"/index");
				return;
			}
	
			String mainPage=(String)request.getAttribute("mainPage");
	  		
			if(mainPage==null || mainPage.equals("")){
				mainPage="mainPage.jsp";
			}
	  %>
	  
	</head>

		<body class="layui-layout-body">
		<div class="layui-layout layui-layout-admin">
		  <div class="layui-header">
		    <div class="layui-logo">天软教育平台</div>
		    
		    <!-- 头部区域（可配合水平导航） -->
		    
		    <ul class="layui-nav layui-layout-right">
		      <li class="layui-nav-item">
		      	<!-- 顶部右上角用户框 -->
		        <a href="javascript:;">
		          <img src="${pageContext.request.contextPath}/plug/img/icon/Icon (71).png" class="layui-nav-img">
		          ${loginUser.uName} ,欢迎您
		        </a>
		        
		        <dl class="layui-nav-child">
		          <dd><a href="${pageContext.request.contextPath}/worker/admin?uId=${loginUser.uId}">个人资料</a></dd>
		          <dd style="margin-top:10px ;"><a onclick="loginOut()" >退出登录</a></dd>
		        </dl>
		        
		      </li>
		    </ul>
		  </div>
		  
		  <!-- 左侧导航最高层 -->
		  <div class="layui-side layui-bg-black">
		    <div class="layui-side-scroll">
		    	<ul class="layui-nav layui-nav-tree"  lay-filter="test">
		    	<!-- 动态权限菜单 -->
		    	<li class="layui-nav-item"><a href="${pageContext.request.contextPath }/main">主页</a></li>
		    	
		    	<!-- 【由于暂时没做权限模型，9.6日更新后暂时废弃，后续增加权限后再进行修改】
		    	<c:forEach items="${rootMenu.children}" var="menu">
		    	
		    		<c:if test="${empty menu.children}">
		    			<li class="layui-nav-item"><a href="${pageContext.request.contextPath}/${menu.menuUrl}">${menu.menuName}</a></li>
		    		</c:if>
		    		
		    		<c:if test="${not empty menu.children}">
		    			<li class="layui-nav-item">
		    			
				          <a href="javascript:;">${menu.menuName}</a>
				          <dl class="layui-nav-child">
				          
				          	<c:forEach items="${menu.children}" var="child">
				          		<dd><a href="${pageContext.request.contextPath}/${child.menuUrl}">${child.menuName}</a></dd>
				          	</c:forEach>
				            
				          </dl>
				        </li>
		    		</c:if>
		    	</c:forEach>
		    	 -->
		    	 
		    	</ul>
		    	
		      <!-- 左侧导航区域（可配合垂直导航） 【已废弃，但请勿删除】
		      <ul class="layui-nav layui-nav-tree"  lay-filter="test">		      	
		      	<li class="layui-nav-item"><a href="${pageContext.request.contextPath }/adminMain">主页</a></li>
		      	
		        <li class="layui-nav-item">
		          <a href="javascript:;">企业信息管理</a>
		          <dl class="layui-nav-child">
		            <dd><a href="javascript:;">列表一</a></dd>
		            <dd><a href="javascript:;">列表二</a></dd>
		            <dd><a href="javascript:;">列表三</a></dd>
		            <dd><a href="">超链接</a></dd>
		          </dl>
		        </li>
		        
		        <li class="layui-nav-item">
		          <a href="javascript:;">人员信息管理</a>
		          <dl class="layui-nav-child">
		            <dd><a href="javascript:;">列表一</a></dd>
		            <dd><a href="javascript:;">列表二</a></dd>
		            <dd><a href="javascript:;">列表三</a></dd>
		            <dd><a href="${pageContext.request.contextPath }/courier/courierTable">快递员列表</a></dd>
		          </dl>
		        </li>
		        
		        <li class="layui-nav-item"><a href="">云市场</a></li>
		        
		        <li class="layui-nav-item"><a href="">发布商品</a></li>
		      </ul>
		      -->
		      
		    </div>
		  </div>
		  
		  
		  
		  <div class="layui-body layui-bg-gray">
		  	
		    <!-- 内容主体区域 -->
		    <!--<div style="padding: 15px;">内容主体区域</div>-->
		    <div class="layui-card layui-demo-maincard">
		    
				  
				  
				  <!-- 正式编写内容区域 -->
				  <div class="layui-card-body">
				  		
				  <!--此处往上请勿编辑-->
				  
				  	<jsp:include page="<%=mainPage%>"/>
				  
				  <!--此处往下请勿编辑-->
				  		
				  </div>
				</div>
		  </div>
		  

		  <div class="layui-footer">
		  	<!-- 底部固定区域 -->
		    <div class="text-center">© 2019-天软教育平台版权所有</div>
		  </div>
		  
		  
		</div>
		
		
		
		<script>
		//layui代码区域,其他js代码请写在底下
		layui.use('element', function(){
		  var element = layui.element;
		});
		</script>
		
		
	</body>

		<script type="text/javascript">
			//退出登录功能
			function loginOut() {
				layer.confirm('确认退出登录？', {
					  btn: ['确认','取消'] 
					}, function(){
						window.location.href = "${pageContext.request.contextPath}/loginOut";
					}, function(){
					  
					});
			}
		</script>
</html>