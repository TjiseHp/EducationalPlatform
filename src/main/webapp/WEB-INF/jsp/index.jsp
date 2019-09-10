<%@ page 	language="java" 
			contentType="text/html; charset=UTF-8"
    		pageEncoding="UTF-8"
    		deferredSyntaxAllowedAsLiteral="true"
    		%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE HTML>
<html lang="zh-CN">

	<head>
		<meta charset="utf-8">
		<meta http-equiv="X-UA-Compatible" content="IE=edge">
		<title>欢迎登陆天软教育平台</title>
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<meta name="description" content="" />
		<meta name="keywords" content="" />
		<meta name="author" content="" />
		<meta property="og:title" content="" />
		<meta property="og:image" content="" />
		<meta property="og:url" content="" />
		<meta property="og:site_name" content="" />
		<meta property="og:description" content="" />
		<meta name="twitter:title" content="" />
		<meta name="twitter:image" content="" />
		<meta name="twitter:url" content="" />
		<meta name="twitter:card" content="" />
		<!-- <link href="https://fonts.googleapis.com/css?family=Roboto:300,400,700" rel="stylesheet"> -->
		<link rel="stylesheet" href="${pageContext.request.contextPath}/plug/css/login/animate.css">
		<link rel="stylesheet" href="${pageContext.request.contextPath}/plug/css/login/icomoon.css">
		<link rel="stylesheet" href="${pageContext.request.contextPath}/plug/css/login/themify-icons.css">
		<link rel="stylesheet" href="${pageContext.request.contextPath}/plug/css/login/bootstrap.css">
		<link rel="stylesheet" href="${pageContext.request.contextPath}/plug/css/login/magnific-popup.css">
		<link rel="stylesheet" href="${pageContext.request.contextPath}/plug/css/login/owl.carousel.min.css">
		<link rel="stylesheet" href="${pageContext.request.contextPath}/plug/css/login/owl.theme.default.min.css">
		<link rel="stylesheet" href="${pageContext.request.contextPath}/plug/css/login/style.css">
		<link rel="stylesheet" href="${pageContext.request.contextPath}/plug/layer/skin/default/layer.css">
		<script src="${pageContext.request.contextPath}/plug/js/login/jquery.min.js" type="text/javascript"></script>
		<script src="${pageContext.request.contextPath}/plug/layer/layer.js" type="text/javascript" ></script>
		<script src="${pageContext.request.contextPath}/plug/js/login/modernizr-2.6.2.min.js"></script>
		<script src="${pageContext.request.contextPath}/plug/js/login/jquery.easing.1.3.js"></script>
		<script src="${pageContext.request.contextPath}/plug/js/login/bootstrap.min.js"></script>
		<script src="${pageContext.request.contextPath}/plug/js/login/jquery.waypoints.min.js"></script>
		<script src="${pageContext.request.contextPath}/plug/js/login/owl.carousel.min.js"></script>
		<script src="${pageContext.request.contextPath}/plug/js/login/jquery.countTo.js"></script>
		<script src="${pageContext.request.contextPath}/plug/js/login/jquery.magnific-popup.min.js"></script>
		<script src="${pageContext.request.contextPath}/plug/js/login/magnific-popup-options.js"></script>
		<script src="${pageContext.request.contextPath}/plug/js/login/main.js"></script>
	</head>

	<body>

		<div class="gtco-loader"></div>

		<div id="page" style="width: 100%;">

			<div class="page-inner">
				<nav class="gtco-nav" role="navigation">
					<div class="gtco-container">

						<div class="row">
							<div class="col-sm-4 col-xs-12">
								<!-- 左上角图标位 -->
							</div>
							<div class="col-xs-8 text-right menu-1">
								<ul>
									<li></li>
									<li></li>
									<li class="has-dropdown">
										<ul class="dropdown">
											<li></li>
											<li></li>
											<li></li>
											<li></li>
										</ul>
									</li>
									<li></li>
									<li></li>
									<li class="btn-cta">
										<!-- <a href="#"><span>后台管理系统</span></a> -->
									</li>
								</ul>
							</div>
						</div>

					</div>
				</nav>

				<header id="gtco-header" class="gtco-cover" role="banner" style="background-image: url(${pageContext.request.contextPath}/plug/img/login/img_4.jpg)">
					<div class="overlay"></div>
					<div class="gtco-container">
						<div class="row">
							<div class="col-md-12 col-md-offset-0 text-left">

								<div class="row row-mt-15em">
									<div class="col-md-7 mt-text animate-box" data-animate-effect="fadeInUp">
										<span class="intro-text-small">欢迎登陆天软教育平台</span>
										<h1>业精于勤荒于嬉<br/>&nbsp;&nbsp;&nbsp;&nbsp;行成于思毁于随</h1>
									</div>
									<div class="col-md-4 col-md-push-1 animate-box" data-animate-effect="fadeInRight">
										<div class="form-wrap">
											<div class="tab">
												
												<ul class="tab-menu">
													<li class="active gtco-first">
														<a href="#" data-tab="login">登录</a>
													</li>
													<li class="gtco-second">
														<a href="#" data-tab="signup">注册</a>
													</li>
												</ul>
												
												<div class="tab-content">
													
													<!-- 登录  -->
													<div class="tab-content-inner active" data-content="login">
														<form action="#">
															<div class="row form-group">
																<div class="col-md-12">
																	<label for="username">账号：</label>
																	<input type="text" class="form-control" id="loginUsername" name="loginUsername">
																</div>
															</div>
															<div class="row form-group">
																<div class="col-md-12">
																	<label for="password">密码：</label>
																	<input type="password" class="form-control" id="loginPassword" name="loginPassword">
																</div>
															</div>

															<div class="row form-group">
																<div class="col-md-12 text-center">
																	<!--<input type="submit" class="btn btn-primary" value="登录">-->
																	<button type="button" class="btn btn-danger" onclick="doLogin()">登录</button>
																</div>
															</div>
														</form>
													</div>
													
													<!-- 注册  -->
													<div class="tab-content-inner" data-content="signup">
														<form action="#">
															<div class="row form-group">
																<div class="col-md-12">
																	<label for="username">账号：</label>
																	<input type="text" class="form-control" id="registerUname" name="registerUname">
																</div>
															</div>
															<div class="row form-group">
																<div class="col-md-12">
																	<label for="password">密码：</label>
																	<input type="password" class="form-control" id="registerPwd" name="registerPwd">
																</div>
															</div>
															<div class="row form-group">
																<div class="col-md-12">
																	<label for="password2">再次输入密码：</label>
																	<input type="password" class="form-control" id="registerPwd2" name="registerPwd2">
																</div>
															</div>

															<div class="row form-group">
																<div class="col-md-12 text-center">
																	<!--<input type="submit" class="btn btn-primary" value="Sign up">-->
																	<button type="button" class="btn btn-danger" onclick="doReg()">注册</button>
																</div>
															</div>
														</form>
													</div>
													
												</div>
											</div>
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>
				</header>

			</div>

		</div>

		<script type="text/javascript">
		
			function doLogin() {
				var uAcc = $("#loginUsername").val();
				var uPwd = $("#loginPassword").val();
				if(uAcc == null || uAcc == "") {
					layer.msg("请输入账号！", {time:2000, icon:5, shift:6}, function(){
	                });
					return;
				} else if(uPwd == null || uPwd == "") {
					layer.msg("请输入密码！", {time:2000, icon:5, shift:6}, function(){
	                });
					return;
				}
				
				var loadingIndex = null;
				$.ajax({
		        	type : "POST",
		        	url  : "doUserLogin",
		        	//async: false,
		        	data : {
		        		"uAcc" : uAcc,
		        		"uPwd"  : uPwd
		        	},
		        	beforeSend : function(){
		        		loadingIndex = layer.msg('处理中', {icon: 16});
		        	},
		        	success : function(result) {
		        		layer.close(loadingIndex);
		        		var resObj = JSON.parse(result);
		        		
		        		if (resObj.result) {
		        			
		        			window.location.href = "main";
		        			
		        		} else {
		                    layer.msg("用户登录账号或密码不正确，请重新输入", {time:2000, icon:5, shift:6}, function(){
		                    	
		                    });
		        		}
		        	},
		        	error : function(err){
		        		
		        	}
		        });
			}
			
			
			function doReg() {
				var uAcc = $("#registerUname").val();
				var uPwd = $("#registerPwd").val();
				var uPwd2 = $("#registerPwd2").val();
				
				if(uAcc == null || uAcc == "") {
					layer.msg("请输入账号！", {time:2000, icon:5, shift:6}, function(){
	                });
					return;
				} else if(uPwd == null || uPwd == "") {
					layer.msg("请输入密码！", {time:2000, icon:5, shift:6}, function(){
	                });
					return;
				}else if (uPwd != uPwd2) {
					layer.msg("两次输入的密码不同，请重新输入！", {time:2000, icon:5, shift:6}, function(){
	                });
					return;
				}
				
			
				
				var loadingIndex = null;
				$.ajax({
		        	type : "POST",
		        	url  : "doUserReg",
		        	data : {
		        		"uAcc" : uAcc,
		        		"uPwd"  : uPwd
		        	},
		        	beforeSend : function(){
		        		loadingIndex = layer.msg('处理中', {icon: 16});
		        	},
		        	success : function(result) {
		        		layer.close(loadingIndex);
		        		var resObj = JSON.parse(result);
		        		
		        		if (resObj.result) {
							layer.msg("注册成功", {time:2000, icon:6, shift:6}, function(){
		                    });
		        		} else {
		                    layer.msg("该账号已重复，请重新输入", {time:2000, icon:5, shift:6}, function(){
		                    	
		                    });
		        		}
		        	},
		        	error : function(err){
		        		
		        	}
		        });
			}
		
		</script>

	</body>

</html>