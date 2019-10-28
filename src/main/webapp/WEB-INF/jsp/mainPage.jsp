<%@ page 	language="java" 
			contentType="text/html; charset=UTF-8"
    		pageEncoding="UTF-8"
    		deferredSyntaxAllowedAsLiteral="true"
    		%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
	

		<div>

			<div class="picture">
				<div id="box" class="all">
					<div class="inner">
						<!-- 相框-->
						<ul>
							<li><a href="#"><img src="${pageContext.request.contextPath}/plug/img/mainpage/timg.jpg" width="1079" height="350" alt=""></a></li>
							<li><a href="#"><img src="${pageContext.request.contextPath}/plug/img/mainpage/timg2.jpg" width="1079" height="350" alt=""></a></li>
							<li><a href="#"><img src="${pageContext.request.contextPath}/plug/img/mainpage/timg3.jpg" width="1079" height="350" alt=""></a></li>
							<li><a href="#"><img src="${pageContext.request.contextPath}/plug/img/mainpage/timg4.jpg" width="1079" height="350" alt=""></a></li>
						</ul>
						<ol>
							<!--里面存放小圆点-->

						</ol>
					</div>
					<div class="focusD" id="arr">
						<span id="left">
							<</span> <span id="right">>
						</span>
					</div>
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
		</div>
				<style>
	.picture {
		width: 1079px;
		height: 350px;
	}

	.notice {
		width: 500px;
		height: 215px;
		float: left;
		padding-left: 20px;
		padding-top: 20px;
	}

	.part {
		width: 530px;
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
		width: 1079px;
		height: 350px;
		position: relative;
		margin-bottom: 5px;
	}

	.inner {
		position: relative;
		width: 1079px;
		height: 350px;
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
<script>
	var index = 0;
	//获取最外面的div
	var box = my$("box");
	//获取相框
	var inner = box.children[0];
	//获取去相框的宽度
	var imgWidth = inner.offsetWidth;
	// 获取ul
	var ulObj = inner.children[0];
	//获取ul中所有的li
	var list = ulObj.children;
	//获取ol
	var olObj = inner.children[1];
	//获取焦点
	var arr = my$("arr");

	//创建小按钮-----根据ul中li的个数
	for (var i = 0; i < list.length; i++) {
		var liObjs = document.createElement("li");
		olObj.appendChild(liObjs);
		liObjs.innerHTML = (i + 1);
		//在ol中每个li中增加自定义属性，添加索引值
		liObjs.setAttribute("index", i);
		//注册鼠标进入事件
		liObjs.onmouseover = function() {
			//先干掉所有背景颜色
			for (var j = 0; j < olObj.children.length; j++) {
				olObj.children[j].removeAttribute("class");
			}
			//设置当前鼠标进来的类样式
			this.className = "current";
			//获取ol中li的索引值
			index = this.getAttribute("index");
			//移动ul
			animate(ulObj, -index * imgWidth); //移动动画函数
		};
	}
	//设置第一个ol中li的背景颜色
	olObj.children[0].className = "current";
	//克隆ol中第一个li放到最后一个
	ulObj.appendChild(ulObj.children[0].cloneNode(true));


	var timeId = setInterval(clickHandle, 5000);

	my$("box").onmouseover = function() {
		arr.style.display = "block";
		clearInterval(timeId);
	};
	//点击右边按钮
	my$("right").onclick = clickHandle;

	function clickHandle() {
		if (index == ulObj.children.length - 1) {
			ulObj.style.left = 0 + "px";
			index = 0;
		}
		index++;
		animate(ulObj, -index * imgWidth);
		if (index == list.length - 1) {
			olObj.children[0].className = "current";
			olObj.children[olObj.children.length - 1].className = "";
		} else {
			for (var i = 0; i < olObj.children.length; i++) {
				olObj.children[i].className = "";
			}
			olObj.children[index].className = "current";
		}
	};
	//点击左边按钮
	my$("left").onclick = function() {
		if (index == 0) {
			index = list.length - 1;
			ulObj.style.left = -index * imgWidth + "px";
		}
		index--;
		animate(ulObj, -index * imgWidth);
		for (var i = 0; i < olObj.children.length; i++) {
			olObj.children[i].className = "";
		}
		olObj.children[index].className = "current";
	};

	my$("box").onmouseout = function() {
		arr.style.display = "none";
		timeId = setInterval(clickHandle, 5000);
	};



	// 设置一个元素，移动到指定位置
	function animate(element, target) {
		clearInterval(element.timeId);
		element.timeId = setInterval(function() {
			var current = element.offsetLeft;
			var step = 9;
			step = current > target ? -step : step;
			current += step;
			if (Math.abs(target - current) > Math.abs(step)) {
				element.style.left = current + "px";
			} else {
				clearInterval(element.timeId);
				element.style.left = target + "px";
			}
		}, 10);
	}

	function my$(id) {
		return document.getElementById(id);
	}
</script>