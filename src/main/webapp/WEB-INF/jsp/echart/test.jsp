<%@ page 	language="java" 
			contentType="text/html; charset=UTF-8"
    		pageEncoding="UTF-8"
    		deferredSyntaxAllowedAsLiteral="true"
    		%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<script type="text/javascript" src="${pageContext.request.contextPath}/plug/js/echarts.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/plug/js/echarts.min.js"></script>		
<div><h1>我带你们打</h1></div>

<div id="main" style="width: 95%; height: 400px;">
<script type="text/javascript">
	var myChart=echarts.init(document.getElementById("main"));
    var option = ({
    	                title:{
    	                        text:'echarts入门示例'
    	                        },
    	                        tooltip:{
    	                            
    	                        },
    	                        legend:{
    	                            data:[
						    	        	
						    	        ]
    	                        },
    	                        xAxis:{
    	                            data:[
    	        	
					    	        	<c:forEach var="i"  begin="0"  end="${list.size()-1}"> 
							        		'${list[i].classKind}',
								        </c:forEach>
					        			]
    	                        },
    	                        yAxis:{
    	                            
    	                        },
    	                        series:[
    	                            {
    	                                name:'num',
    	                                type:'bar',
    	                                data:[
					    	        	<c:forEach var="i" begin="0"  end="${list.size()-1}"> 
					    	        	'${list[i].classNum}', 
					    	        	</c:forEach>
    	        						]
    	                            },
    	                        ]
    	        });
    
    myChart.setOption(option);
    

</script>

</div>