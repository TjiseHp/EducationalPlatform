<%@ page 	language="java" 
			contentType="text/html; charset=UTF-8"
    		pageEncoding="UTF-8"
    		deferredSyntaxAllowedAsLiteral="true"
    		%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
	
<div><h1>测试页面-主页</h1></div>

<div>
<a href="user/studentTable2">学生列表</a>
<br/>
<a href="user/teacherTable2">教师列表</a>
<br/>
<a href="credit/creditConsumption">积分消费记录明细查询</a>
<br/>
<a href="credit/creditBuy">历史购买订单查询表</a>
<br/>
<a href="${pageContext.request.contextPath}/recruit/insertRecruit">招聘信息发布</a>
<br/>
<a href="${pageContext.request.contextPath}/recruit/recruitByCity">根据城市科目查询招聘信息</a>
<br/>
<a href="${pageContext.request.contextPath}/recruit/recruitTable">历史招聘信息</a>
<br/>

<a href="${pageContext.request.contextPath}/exchange/exchangeTable2">积分记录</a>
<br/>
<a href="${pageContext.request.contextPath}/recruit/recruitTeacher">教师记录</a>
<br/>
<a href="${pageContext.request.contextPath}/recruit/recruitByCity">招聘中心</a>
<br/>
<a href="${pageContext.request.contextPath}/pay/payTable2">营收记录</a>
<br/>


</div>