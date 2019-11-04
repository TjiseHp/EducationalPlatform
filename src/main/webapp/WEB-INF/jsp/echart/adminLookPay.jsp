<%@ page 	language="java" 
			contentType="text/html; charset=UTF-8"
    		pageEncoding="UTF-8"
    		deferredSyntaxAllowedAsLiteral="true"
    		%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<script type="text/javascript" src="${pageContext.request.contextPath}/plug/js/echarts.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/plug/js/echarts.min.js"></script>		
<div><h1>积分充值记录</h1></div>


<!-- 直接复制，js可放置到页面最底部，也可在div内，修改复制后修改div id和js内输出id，使之对应 而后修改控制层-->
<div id="main" style="width: 1200px; height: 400px;">
<script type="text/javascript">
	var myChart=echarts.init(document.getElementById("main"));
    var option = ({
    	             
			        title: {
			            text: '营收记录',
			            },
			        tooltip: {
			            trigger: 'axis'
			        },
			        
			        toolbox: {
			            show: true,
			            feature: {
			                dataZoom: {
			                    yAxisIndex: 'none'
			                },
			                dataView: {readOnly: false},
			                magicType: {type: ['line', 'bar']},
			                restore: {},
			                saveAsImage: {}
			            }
			        },
			        xAxis:  {
			            type: 'category',
			            boundaryGap: false,
			            data: [
			            	<c:forEach var="i"  begin="0"  end="${list.size()-1}"> 
		        		'${list[i].payNum}',
				        </c:forEach>
		        		]
			        },
			        yAxis: {
			            type: 'value',
			            axisLabel: {
			                formatter: '{value} 元'
			            }
			        },
			        series: [
			            {
			                name:"月收入",
			                type:'line',
			                data:[
			                	<c:forEach var="i"  begin="0"  end="${list.size()-1}"> 
				        		'${list[i].payText}',
						        </c:forEach>
			                	],
			                markPoint: {
			                    data: [
			                        {type: 'max', name: '最大值'},
			                        {type: 'min', name: '最小值'}
			                    ]
			                },
			                markLine: {
			                    data: [
			                        {type: 'average', name: '平均值'}
			                    ]
			                }
			            },
			           
			        ]
				          
    	        });
    
    myChart.setOption(option);
    

</script>

</div>