<%@ page 	language="java" 
			contentType="text/html; charset=UTF-8"
    		pageEncoding="UTF-8"
    		deferredSyntaxAllowedAsLiteral="true"
    		%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

	



<div class="table-responsive text-center">
  		<form action="">
  			<div>
  				<div>
  					<h1>会员列表</h1>
  				</div>
  			</div>
  			<div>
  				<table class="table table-striped table-bordered">
	  			<tr class="demo-table-hover">
	  				<td>详细信息</td>	  								
	  			</tr>
	  			<tr>
	  				<td>
	  				${recruit.recruitText}
	  				
	  				</td>	 
	  			 </tr>
  				</table>
  			</div>  		
  		</form>
  </div>