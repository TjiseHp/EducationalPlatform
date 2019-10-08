<%@ page 	language="java" 
			contentType="text/html; charset=UTF-8"
    		pageEncoding="UTF-8"
    		deferredSyntaxAllowedAsLiteral="true"
    		%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<script type="text/javascript" src="${pageContext.request.contextPath}/plug/js/echarts.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/plug/js/echarts.min.js"></script>		
<div><h1>我带你们打</h1></div>

<div >	
                     <label for="inputPassword3" class="col-md-2 control-label">寄件人地址</label>
                  <div class="col-md-10">
                  		 	<select style="width: 100px" id="s1" >
						        <option >--请选择--</option>
						    </select> 
						    <select style="width: 100px" id="s2">
						        <option >--请选择--</option>
						    </select>
						    <select style="width: 100px" id="s3">
						        <option >--请选择--</option>
						    </select>
                </div>
      </div>          
               

<script type="text/javascript">                
                $(function(){
			  
			   $.ajax({
				   type:"post",
				   url:"${pageContext.request.contextPath}/echart/user",
				   dataType:"json",
				   success:function(result){
					   for(var i=0;i<result.length;i++ ){
						   $("#s1").append("<option value='"+result[i].uId+"'>"+result[i].uId+"</option>");
					   }
				   }
			   });
		})
		
			 $("#s1").change(function(){
			   $("#s2 option:gt(0)").remove();
			   $("#s3 option:gt(0)").remove();
			   var uId = $("#s1 option:selected").val();
					$.ajax({
					type:"post",
				   url:"${pageContext.request.contextPath}/echart/user2",
				   data:{"uId":uId},
				   dataType:"json",
				   success:function(result){
				   for(var i=0;i<result.length;i++ ){
						   $("#s2").append("<option value='"+result[i].uName+"'>"+result[i].uName+"</option>");
				   }
			   }
			  })
		})
		
		 $("#s2").change(function(){
			   $("#s3 option:gt(0)").remove();
			   var uName = $("#s2 option:selected").val();
					$.ajax({
					type:"post",
				   url:"${pageContext.request.contextPath}/echart/user3",
				   data:{"uName":uName},
				   dataType:"json",
				   success:function(result){
				   for(var i=0;i<result.length;i++ ){
						   $("#s3").append("<option value='"+result+"'>"+result+"</option>");
				   }
			   }
			  })
		})
		
		
		
		
		
	
</script>