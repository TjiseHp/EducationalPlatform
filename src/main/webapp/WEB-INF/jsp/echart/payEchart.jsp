<%@ page 	language="java" 
			contentType="text/html; charset=UTF-8"
    		pageEncoding="UTF-8"
    		deferredSyntaxAllowedAsLiteral="true"
    		%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<script type="text/javascript" src="${pageContext.request.contextPath}/plug/js/echarts.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/plug/js/echarts.min.js"></script>		
<div>


<div  id="toolbar" class="btn-group">
		<a class="btn btn-success btn-default" role="button" href="javascript:;" onclick="doHref();" >
			<span class="glyphicon glyphicon-circle-arrow-left" aria-hidden="true"></span>返回
		</a>
	</div><div style = "text-align:center;font-size:50px">消费记录</div>	
</div>

<script type="text/javascript">
		function doHref() {
			var uId = ${loginUser.uId};
			window.location.href = "${pageContext.request.contextPath}/credit/creditConsumption1?uId="+uId;
		}
</script>

<!-- 直接复制，js可放置到页面最底部，也可在div内，修改复制后修改div id和js内输出id，使之对应 而后修改控制层-->
<!--
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
				                name:'积分月消费',
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
  -->
  <!-- 
<div id="666" style="width: 600px; height: 400px;">
<script type="text/javascript">
	var myChart=echarts.init(document.getElementById("666"));
    var option = ({
    	    backgroundColor: '#2c343c',

    	    title: {
    	        text: '我带你们打',
    	        left: 'center',
    	        top: 20,
    	        textStyle: {
    	            color: '#ccc'
    	        }
    	    },

    	    tooltip : {
    	        trigger: 'item',
    	        formatter: "{a} <br/>{b} : {c} ({d}%)"
    	    },

    	    visualMap: {
    	        show: false,
    	        //扇形颜色，最大最小值影响颜色
    	        min: 1000,
    	        max: 50000,
    	        inRange: {
    	            colorLightness: [0, 1]
    	        }
    	    },
    	    series : [
    	        {
    	            name:'消费类别',
    	            type:'pie',
    	            radius : '55%',
    	            center: ['50%', '50%'],
    	            data:[
    	            	<c:forEach var="i"  begin="0"  end="${list.size()-1}"> 
    	            	{value:'${list2[i].creditSum}',
    	            	name:'${list2[i].creditText}'},
			        </c:forEach>
    	            ].sort(function (a, b) { return a.value - b.value; }),
    	            roseType: 'radius',
    	            label: {
    	                normal: {
    	                    textStyle: {
    	                        color: 'rgba(255, 255, 255, 0.3)'
    	                    }
    	                }
    	            },
    	            labelLine: {
    	                normal: {
    	                    lineStyle: {
    	                        color: 'rgba(255, 255, 255, 0.3)'
    	                    },
    	                    smooth: 0.2,
    	                    length: 10,
    	                    length2: 20
    	                }
    	            },
    	            itemStyle: {
    	                normal: {
    	                    color: '#c23531',
    	                    shadowBlur: 200,
    	                    shadowColor: 'rgba(0, 0, 0, 0.5)'
    	                }
    	            },

    	            animationType: 'scale',
    	            animationEasing: 'elasticOut',
    	            animationDelay: function (idx) {
    	                return Math.random() * 200;
    	            }
    	        }
    	    ]
    	});
    
    myChart.setOption(option);
    

</script>

</div>
 -->
<div id="main" style="width: 1200px; height: 400px;">
<script type="text/javascript">
	var myChart=echarts.init(document.getElementById("main"));
    var option = ({
    	             
			        title: {
			            text: '消费记录',
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
			        		'${list[i].creditText2}',
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
			                name:"月消费",
			                type:'line',
			                data:[
			                	<c:forEach var="i"  begin="0"  end="${list.size()-1}"> 
				        		'${list[i].creditSum}',
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
