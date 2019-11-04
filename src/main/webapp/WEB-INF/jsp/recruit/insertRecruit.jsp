<%@ page 	language="java" 
			contentType="text/html; charset=UTF-8"
    		pageEncoding="UTF-8"
    		deferredSyntaxAllowedAsLiteral="true"
    		%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>



<script type="text/javascript">
	function doAdd(){
		
		var uId = $("#uId").val();
		var cNum = $("#s2").val();
		var classNum = $("#classNum").val();
		var recruitText = $("#recruitText").val();
		console.info(uId+"111"+cNum);
		if(uId == ""||cNum == ""||classNum == ""||recruitText == ""){
			layer.msg("内容不能为空", {time:2000, icon:5, shift:6});
		}else{
			layer.confirm('确认发布？', {
				btn: ['确认','取消'] 
			}, function(){
				$.ajax({
					type:"post",
					   url:"${pageContext.request.contextPath}/recruit/add",
					   data:{
						   "cNum":cNum,
						   "uId":uId,
						   "classNum":classNum,
						   "recruitText":recruitText		   
					   },
					   dataType:"json",
					   success:function(result){
						   console.info(result);
						   layer.msg("发布成功！", {time:2000, icon:6, shift:6}, function(){
							   window.location.href = "${pageContext.request.contextPath}/main";						   
				           });
						   
				   },
				   error: function () {
			       	layer.msg("发布失败！", {time:2000, icon:5, shift:6}, function(){
			           });
			      	}
	            })
			
			}, function(){
			  
			});
			
				
		};
		
	}
		
		
		
	  $(function(){
		  
		   $.ajax({
			   type:"post",
			   url:"${pageContext.request.contextPath}/city/city1",
			   dataType:"json",
			   success:function(result){
				   for(var i=0;i<result.length;i++ ){
					   $("#s1").append("<option value='"+result[i].cProvince+"'>"+result[i].cProvince+"</option>");
				   }
			   }			  
		   });		
		   $("#s1").change(function(){
			   $("#s2 option:gt(0)").remove();
			   var cProvince = $("#s1 option:selected").val();
					$.ajax({
					type:"post",
				   url:"${pageContext.request.contextPath}/city/city2",
				   data:{"cProvince":cProvince},
				   dataType:"json",
				   success:function(result){
				   for(var i=0;i<result.length;i++ ){
						   $("#s2").append("<option value='"+result[i].cNum+"'>"+result[i].cCity+"</option>");
				   }
			   }
			  })
		})
		})
	
	
	  $(function course(){
		  
		   $.ajax({
			   type:"post",
			   url:"${pageContext.request.contextPath}/class/class1",
			   dataType:"json",
			   success:function(result){
				   for(var i=0;i<result.length;i++ ){
					   $("#classNum").append("<option value='"+result[i].classNum+"'>"+result[i].classKind+"</option>");
				   }
			   }			  
		   });		   
		})
	
</script>

<div align="center" style="padding-top: 50px;">
	<div>
	<h1>添加信息</h1>
	</div>
	<br/>
	<hr/>
	<br/>
	<br/>
	<div class="col-md-offset-0">
	<div class="elegant-aero">
	<form  method="post" accept-charset="utf-8"  onsubmit="">
			
			
            
			<div class="row form-group">
                <label class="control-label col-lg-3" for="name"><span>所在城市：</span></label>
                <input class="form-control" type="hidden" id="uId" name="uId" value="${loginUser.uId}">
                <div class="col-md-7" style="padding-top:8px">
                			<select style="width: 100px" id="s1" >
						        <option >--请选择--</option>
						    </select> 
						    <select style="width: 100px" id="s2">
						        <option >--请选择--</option>
						    </select>
                	
                </div>
            </div>

			<div class="row form-group">
                <label class="control-label col-lg-3" for="name"><span>辅导科目：</span></label>
                <div class="col-md-7" style="padding-top:8px">                	
                			<select style="width: 100px" id="classNum" >
						        <option >--请选择--</option>						        
						    </select>
                </div>
            </div>

			<div class="row form-group">
                <label class="control-label col-lg-3" for="name"><span>具体需求：</span></label>
                <div class="col-md-7">
                	<textarea class="form-control"  cols="1"   rows="15"   id="recruitText" name="recruitText"></textarea>
                </div>
            </div>
            			
            <br/>
            
            <div class="row form-group">
					<input class="btn btn-danger" type="butten" onclick="doAdd()" value="提交"/>
            </div>
           	<div class="suspensionleft"></div>
			<div class="suspensionright"></div>
	</form>
	</div>
	</div>
	</div>
	
<script type="text/javascript">                
              
		
		
		
		
		
	
</script>	
	
<style>


input[type=radio] {
margin-right: 5px;
cursor: pointer;
font-size: 14px;
width: 15px;
height: 12px;
position: relative;
}

input[type=radio]:after {
position: absolute;
width: 15px;
height: 15px;
top: 0;
content: " ";
background-color: #fff;
color: #fff;
display: inline-block;
visibility: visible;
padding: 0px 3px;
border-radius: 50%;
border: 1px solid #ebebeb;
}

input[type=radio]:checked:before {
content: " ";
display: block;
position: relative;
top: 0;
width: 15px;
height: 15px;
color: #fff;
font-weight: 400;
z-index: 1;
border-radius: 50%;
background-color: #40c8c4;
}

input:focus {
box-shadow: 0 0 5px 2px rgba(0, 0, 0, 0.3);
}

box-shadow: 0 0 35px 15px rgba(29, 43, 100, 0.9) inset;

input[type=text] {
width: 300px;
color: #404040;
background: white;
border: 1px solid;
border-color: #c4c4c4 #d1d1d1 #d4d4d4;
border-radius: 2px;
outline: 5px solid #eff4f7;
-moz-outline-radius: 3px;
-webkit-box-shadow: inset 0 1px 3px rgba(0, 0, 0, 0.12);
box-shadow: inset 0 1px 3px rgba(0, 0, 0, 0.12);
}

.title1 {

background: #EEE url(data:image/gif;base64,iVBORw0KGgoAAAANSUhEUgAAAAQAAAAECAIAAAAmkwkpAAAAHklEQVQImWNkYGBgYGD4//8/A5wF5SBYyAr+//8PAPOCFO0Q2zq7AAAAAElFTkSuQmCC) repeat;

text-shadow: 3px -3px black, 2px -2px white;

font-weight: bold;

-webkit-text-fill-color: transparent;

-webkit-background-clip: text;

}

.title2 {

color: transparent;

-webkit-text-stroke: 1px black;

letter-spacing: 0.04em;

}

.elegant-aero {
margin-left: auto;
margin-right: auto;
max-width: 500px;
background: #D2E9FF;
padding: 20px 20px 20px 20px;
font: 12px Arial, Helvetica, sans-serif;
color: #666;
}

.elegant-aero label>span {
float: left;
margin-top: 10px;
color: #5E5E5E;
}

.elegant-aero label {
display: block;
margin: 0px 0px 5px;
}

.elegant-aero label>span {
float: left;
width: 100%;
text-align: right;
padding-right: 15px;
margin-top: 10px;
font-weight: bold;
}
.layui-card.layui-demo-maincard{
	width:auto;
	height:auto;
}
.suspensionleft{width:20%;height:100%;background:url("${pageContext.request.contextPath}/plug/img/t/t15.jpg") no-repeat;
padding-top:100px;position:absolute;left:2%;top:23%;}
.suspensionright{width:20%;height:100%;background:url("${pageContext.request.contextPath}/plug/img/t/t16.jpg") no-repeat;
padding-top:100px;position:absolute;left:80%;top:23%;}
</style>