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
    	                color: ['#3398DB'],
				        tooltip : {
				            trigger: 'axis',
				            axisPointer : {            // 坐标轴指示器，坐标轴触发有效
				                type : 'shadow'        // 默认为直线，可选为：'line' | 'shadow'
				            }
				        },
				        grid: {    //整体大小
				            left: '3%',
				            right: '4%',
				            bottom: '6%',
				            containLabel: true
				        },
				        xAxis : [
				            {
				                type : 'category',
				                data : [
				                	
				                	<c:forEach var="i"  begin="0"  end="${list.size()-1}"> 
					        		'${list[i].creditText2}',
						        </c:forEach>
				                ],
				                axisTick: {
				                    alignWithLabel: true
				                }
				            }
				        ],
				        yAxis : [
				            {
				                type : 'value'
				            }
				        ],
				        series : [
				            {
				                name:'充值积分',
				                type:'bar',
				                barWidth: '60%',//柱子宽度
				                label: {
				                    normal: {
				                        show: true,
				                        position: 'top'
				                    }
				                },
				                data:[
				                	<c:forEach var="i"  begin="0"  end="${list.size()-1}"> 
					        		'${list[i].creditSum}',
						        </c:forEach>
				                	]
				            }
				            ]
				          
    	        });
    
    myChart.setOption(option);
    

</script>

</div>