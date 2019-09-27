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
<a href="${pageContext.request.contextPath}/recruit/recruitTable">历史招聘信息</a>
<br/>

<a href="${pageContext.request.contextPath}/exchange/exchangeTable2">积分记录</a>
<br/>
<a href="${pageContext.request.contextPath}/recruit/recruitTeacher">教师记录</a>
<br/>
<a href="${pageContext.request.contextPath}/recruit/recruitByCity">招聘中心通过城市科目查询</a>
<br/>
<a href="${pageContext.request.contextPath}/user/teacherByworking">在职教师查询</a>
<br/>
<a href="${pageContext.request.contextPath}/pay/payTable2">营收记录</a>
<br/>
<a href="${pageContext.request.contextPath}/file/uploadTest">审核测试</a>
<br/>
<a href="${pageContext.request.contextPath}/file/fileList">审核列表</a>
<br/>
<a href="${pageContext.request.contextPath}/alipay/payMenu">支付测试</a>
<br/>
<a href="${pageContext.request.contextPath}/echart/test3">我带你们打</a>
<br/>
<a href="${pageContext.request.contextPath}/echart/test">ajaxecharttest</a>
<br/>
<a href="${pageContext.request.contextPath}/echart/creditEchart">积分充值图表</a>
<br/>
<a href="${pageContext.request.contextPath}/echart/payEchart">积分消费图表</a>
<br/>
<a href="${pageContext.request.contextPath}/echart/adminLookPay">查看积分充值</a>
<br/>
</div>