<%@ page 	language="java" 
			contentType="text/html; charset=UTF-8"
    		pageEncoding="UTF-8"
    		deferredSyntaxAllowedAsLiteral="true"
    		%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
	
<div><h1>测试页面-主页</h1></div>

<div>
<a href="${pageContext.request.contextPath}/user/studentTable2">学生列表</a>
<br/>
<a href="${pageContext.request.contextPath}/user/teacherTable2">教师列表</a>
<br/>
<a href="${pageContext.request.contextPath}/credit/creditConsumption">积分消费记录明细查询</a>
<br/>
<a href="${pageContext.request.contextPath}/credit/creditBuy">历史购买订单查询表</a>
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
<a href="${pageContext.request.contextPath}/role/assignTable?roNo=4">权限回调</a>
<br/>
<a href="${pageContext.request.contextPath}/chat/stuMessageCenter">学生消息中心</a>
<br/>
<a href="${pageContext.request.contextPath}/role/roleTable">角色列表</a>
<br/>
<a href="${pageContext.request.contextPath}/exchange/exchangeTable2">积分比例</a>
<br/>
<a href="${pageContext.request.contextPath}/group/groupTable">角色组列表</a>
<br/>
<a href="${pageContext.request.contextPath}/chat/stuMessageCenter?uId=${loginUser.uId}">学生消息中心</a>
<br/>
<a href="${pageContext.request.contextPath}/alipay/payMenu">支付测试</a>
<br/>
<a href="${pageContext.request.contextPath}/file/fileList">审核列表</a>
<br/>
<a href="${pageContext.request.contextPath}/user/teacherReturn">教师个人资料</a>
<br/>
<a href="${pageContext.request.contextPath}/user/studentReturn">学生个人资料</a>
<br/>
<a href="${pageContext.request.contextPath}/role/assignTable2?roNo=4">权限回调</a>
<br/>
<a href="${pageContext.request.contextPath}/user/returnTest">跳转测试</a>
<br/>
</div>