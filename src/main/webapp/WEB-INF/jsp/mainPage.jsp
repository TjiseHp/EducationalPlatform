<%@ page 	language="java" 
			contentType="text/html; charset=UTF-8"
    		pageEncoding="UTF-8"
    		deferredSyntaxAllowedAsLiteral="true"
    		%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
	

		<div>

			<div id="carousel-example-generic" class="carousel slide" data-ride="carousel">
			  <!-- Indicators -->
			  <ol class="carousel-indicators">
			    <li data-target="#carousel-example-generic" data-slide-to="0" class="active"></li>
			    <li data-target="#carousel-example-generic" data-slide-to="1"></li>
			    <li data-target="#carousel-example-generic" data-slide-to="2"></li>
			  </ol>
			
			  <!-- Wrapper for slides -->
			  <div class="carousel-inner" role="listbox">
			    <div class="item active">
			      <img src="${pageContext.request.contextPath}/plug/img/t/1.png" alt="...">
			      <div class="carousel-caption">
			      </div>
			    </div>
			    <div class="item">
			      <img src="${pageContext.request.contextPath}/plug/img/t/2.png" alt="...">
			      <div class="carousel-caption">
			      </div>
			    </div>
			    			    <div class="item">
			      <img src="${pageContext.request.contextPath}/plug/img/t/3.png" alt="...">
			      <div class="carousel-caption">
			      </div>
			    </div>
			  </div>

			  <!-- Controls -->
			  <a class="left carousel-control" href="#carousel-example-generic" role="button" data-slide="prev">
			    <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
			    <span class="sr-only">Previous</span>
			  </a>
			  <a class="right carousel-control" href="#carousel-example-generic" role="button" data-slide="next">
			    <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
			    <span class="sr-only">Next</span>
			  </a>
			</div>
			
				<div class="notice">
					<div class="title2">
						<h3>新闻信息</h3>
					</div>
					<div class="tzgg_news">
						<table width="100%" border="0" cellspacing="0" cellpadding="0">
							<tbody>
								<tr>
									<td class="tzdate" width="20%" style="border-right:1px solid #b5b5b5; height:30px; line-height:30px;">2019/09/17</td>
									<td width="6%">&nbsp;</td>
									<td class="tztitle" width="74%"><a href="#" target="_blank" title="">2020考研网上报名时间:10月10日至10月31日</a></td>
								</tr>
							</tbody>
						</table>
						<table width="100%" border="0" cellspacing="0" cellpadding="0">
							<tbody>
								<tr>
									<td class="tzdate" width="20%" style="border-right:1px solid #b5b5b5; height:30px; line-height:30px;">2019/09/17</td>
									<td width="6%">&nbsp;</td>
									<td class="tztitle" width="74%"><a href="#" target="_blank" title="">2020年统考考生需准备的网报信息 </a></td>
								</tr>
							</tbody>
						</table>
					</div>
				</div>

				<div class="part">
					<div class="title2">
						<h3>公告信息</h3>
					</div>
					<div class="tzgg_news">
						<table width="100%" border="0" cellspacing="0" cellpadding="0">
							<tbody>
								<tr>
									<td class="tzdate" width="20%" style="border-right:1px solid #b5b5b5; height:30px; line-height:30px;">2019/09/21</td>
									<td width="6%">&nbsp;</td>
									<td class="tztitle" width="74%"><a href="#" target="_blank" title="">习近平致第三届世界智能大会的贺信</a></td>
								</tr>
							</tbody>
						</table>
						<table width="100%" border="0" cellspacing="0" cellpadding="0">
							<tbody>
								<tr>
									<td class="tzdate" width="20%" style="border-right:1px solid #b5b5b5; height:30px; line-height:30px;">2019/09/03</td>
									<td width="6%">&nbsp;</td>
									<td class="tztitle" width="74%"><a href="#" target="_blank" title="">习近平对信访工作作出重要指示强调 </a></td>
								</tr>
							</tbody>
						</table>
					</div>
				</div>
			</div>
			
<style>
	.picture {
		width: 100%;
		height: 400px;
	}

	.notice {
		width: 50%;
		height: 215px;
		float: left;
		padding-left: 20px;
		padding-top: 20px;
	}

	.part {
		width: 50%;
		height: 215px;
		float: left;
		padding-left: 20px;
		padding-top: 20px;
	}
	.layui-nav-img{width:30px;height:30px;margin-right:10px;border-radius:50%;margin-top: 15px;}
</style>
<style>
	* {
		margin: 0;
		padding: 0;
	}

	/*<--清除底部三像素距离-->*/
	img {
		vertical-align: top;
	}

	.all {
		width: 100%;
		height: 400px;
		position: relative;
		margin-bottom: 5px;
	}

	.inner {
		position: relative;
		width: 100%;
		height: 400px;
		overflow: hidden;
	}

	.inner ul {
		width: 1000%;
		list-style: none;
		position: absolute;
		top: 0;
		left: 0;
	}

	.inner ul li {
		float: left;
	}

	.focusD {
		position: absolute;
		left: 0;
		top: 50%;
		width: 1079px;
		padding: 0 10px;
		height: 30px;
		box-sizing: border-box;
		display: none;
	}

	.inner ol {
		position: absolute;
		right: 30px;
		bottom: 10px;
	}

	.inner ol li {
		width: 15px;
		display: inline-block;
		height: 15px;
		margin: 0 3px;
		cursor: pointer;
		line-height: 15px;
		text-align: center;
		background-color: #fff;
	}

	/*当前的高亮的小圆点*/
	.inner ol .current {
		background-color: orange;
		color: #fff;
	}

	.focusD span {
		display: inline-block;
		width: 25px;
		font-size: 24px;
		height: 30px;
		color: #ccc;
		line-height: 30px;
		text-align: center;
		background: rgba(255, 255, 255, 0.3);
		cursor: pointer;
	}

	#left {
		float: left;
	}

	#right {
		float: right;
	}

	.title2 {
		width: 100%;
		height: 31px;
		border-bottom: 2px solid #0c7dd9;
	}

	.tzgg_news {
		width: 100%;
		padding-top: 20px;
	}

	.tzdate {
		font-family: Georgia;
		font-size: 16px;
		color: #8c0000;
	}

	.tztitle a:link {
		font-family: 'Microsoft Yahei', "Lucida Grande", "Tahoma", "Arial", "Helvetica", "sans-serif";
		font-size: 14px;
		line-height: 22px;
		color: #323232;
		text-decoration: none;
	}

	.tztitle a:visited {
		font-family: 'Microsoft Yahei', "Lucida Grande", "Tahoma", "Arial", "Helvetica", "sans-serif";
		font-size: 14px;
		line-height: 22px;
		color: #323232;
		text-decoration: none;
	}

	.mttitle {
		font-family: å¾®è½¯é›…é»‘;
		font-size: 16px;
		color: #005d6c;
		text-decoration: none;
		line-height: 40px;
	}

	.mttitle a:link {
		font-family: å¾®è½¯é›…é»‘;
		font-size: 16px;
		color: #005d6c;
		text-decoration: none;
		line-height: 40px;
	}

	.mttitle a:visited {
		font-family: å¾®è½¯é›…é»‘;
		font-size: 16px;
		color: #005d6c;
		text-decoration: none;
		line-height: 40px;
	}
</style>