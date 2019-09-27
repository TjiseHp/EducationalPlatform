<%@ page 	language="java" 
			contentType="text/html; charset=UTF-8"
    		pageEncoding="UTF-8"
    		deferredSyntaxAllowedAsLiteral="true"
    		%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<script type="text/javascript" src="${pageContext.request.contextPath}/plug/js/echarts.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/plug/js/echarts.min.js"></script>		

<div><h1>我带你们打</h1></div>

<div id="666" style="width: 95%; height: 400px;">
<script type="text/javascript">
	var myChart=echarts.init(document.getElementById("666"));
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
					        			]
    	                        },
    	                        yAxis:{
    	                            
    	                        },
    	                        series:[
    	                            {
    	                                name:'num',
    	                                type:'bar',
    	                                data:[
    	        						]
    	                            },
    	                        ]
    	        });
    	
    $.ajax({
        type: "post",
        url: "${pageContext.request.contextPath}/echarts/test2",
        dataTepy:"json",
        success: function (data) {
        	 console.log(data) 
             var name=new Array();
             var num=new Array();
             for(var i=0;i<data.length;i++){
               name.push(data[i].classKind);
               num.push(data[i].classNum);
             }
            if (data!=null) {
                   
                   
                   myChart.setOption({		//载入数据
                	   xAxis: {
                           data: name
                       },
                       series: [{
                           // 根据名字对应到相应的系列
                           name: '测试',
                           data: num
                       }]
      		     });
                   
            }
            else {
           	 //返回的数据为空时显示提示信息
           	 alert("图表请求数据为空，可能服务器暂未录入近五天的观测数据，您可以稍后再试！");
             	 myChart.hideLoading();
            }
       
    	},
    	error : function(errorMsg) {
    		//请求失败时执行该函数
       	alert("图表请求数据失败，可能是服务器开小差了");
       	myChart.hideLoading();    	
    	}
        
    }) 
   			
$.ajax({
            type:'post',
            url:"${pageContext.request.contextPath}/echarts/test2",
            dataType: 'json',
            async:true,
            xhrFields: {
                withCredentials: true
            },
            crossDomain: true,
            success:function(data){ 
           	console.log(data) 
              var name=new Array();
              var num=new Array();
              for(var i=0;i<data.length;i++){
                name.push(data[i].classKind);
                num.push(data[i].classNum);
              }
              myChart.setOption({
                    xAxis: {
                        data: name
                    },
                    series: [{
                        // 根据名字对应到相应的系列
                        name: '测试',
                        data: num
                    }]
              }); 
    
    myChart.setOption(option);
    

</script>

</div>

