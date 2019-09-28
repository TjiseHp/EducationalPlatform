<%@ page 	language="java" 
			contentType="text/html; charset=UTF-8"
    		pageEncoding="UTF-8"
    		deferredSyntaxAllowedAsLiteral="true"
    		%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

	



<div class="table-responsive text-center">
  		<form action="">
  			<div align="center" style="padding-top: 50px;">
  				<div>
  					<h1 class="title1">会员列表</h1>
  				</div>
  			</div>
  			<br />
			<hr />
			<br />
			<br />

  				<table class="table elegant-aero">
	  			<tr class="demo-table-hover">
	  				<td>详细信息</td>	  								
	  			</tr>
	  			<tr>
	  				<td>
	  				${recruit.recruitText}
	  				
	  				</td>	 
	  			 </tr>
  				</table>
  		</form>
  </div>
<style>
.elegant-aero {
margin-left: auto;
margin-right: auto;
max-width: 500px;
background: #D2E9FF;
padding: 20px 20px 20px 20px;
font: 12px Arial, Helvetica, sans-serif;
color: #666;
}
td{border: 1px solid transparent !important;}
</style>