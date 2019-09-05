<!DOCTYPE html>
<html>

	<head>
		<meta charset="utf-8" />
		<script src ="${pageContext.request.contextPath}/plug/jquery/jquery-2.1.1.min.js"></script>
		<script src="${pageContext.request.contextPath}/plug/js/echarts.js"></script>
		<script src="${pageContext.request.contextPath}/plug/js/echarts.min.js"></script>
		<title></title>
		
	</head>
	<body>
		<h1>Hello,World!4444</h1>
		
		
		
	<div style="width:500px;height:500px;top: 40px; left:10px" id="xdd">
		
		<script type="text/javascript">
		var myChart = echarts.init(document.getElementById("xdd"));
		option = {
				  title:{
	                     text:'echarts入门示例'
	                 },
	                 legend:{
	                     data:['销量']
	                 },
	                 xAxis:{
	                     data:[“一月”，“二月”，“三月”，“四月”，“五月”]
	                 },
	                 yAxis:{
	                     
	                 },
	                 series:[
	                     {
	                         name:'销量',
	                         type:'bar',
	                         data:[“15”，“16”，“17”，“18”,“19”]
	                 ]
	
			}
	 };
		myChart.setOption(option);
		
		
		<%-- myChart.setOption({
			                title:{
			                    text:'echarts入门示例'
			                },
			                tooltip:{
			                    
			                },
			                legend:{
			                    data:['销量']
			                },
			                xAxis:{
			                    data:[]
			                },
			                yAxis:{
			                    
			                },
			                series:[
			                    {
			                        name:'销量',
			                        type:'bar',
			                        data:[]
			                    },
			                ]
			        });                        
			 
			 
			                        $.post(
							"<%=request.getContextPath()%>/xiaoliang/getXiaoliangList.action",
							{},
							function(data){
								myChart.setOption({
									xAxis:{
										data:data.xname
									},
									series:[
										{
											name:'销量',
											data:data.xcount
										},
									]
								});
							},
							"json"
						) --%>
			
</script>
	</div>

	</body>
</html>