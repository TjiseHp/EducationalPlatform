<%@ page 	language="java" 
			contentType="text/html; charset=UTF-8"
    		pageEncoding="UTF-8"
    		deferredSyntaxAllowedAsLiteral="true"
    		%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<script type="text/javascript">
	function doUpdate(){
		var exchangeNum = $("#exchangeNum").val();
		var exchangeE = $("#exchangeE").val();
		
		if(exchangeNum == ""||exchangeE == ""){
			layer.msg("内容不能为空", {time:2000, icon:5, shift:6});
			return false;
		}else{
			return true;
		}
		
    }
		
		
	
</script>

<div align="center" style="padding-top: 50px;">
	<div>
	<h1 class="title1">修改积分比例</h1>
	</div>
	<br/>
	<hr/>
	<br/>
	<br/>
	<div class="col-md-offset-0">
	<div class="elegant-aero">
	<form action="${pageContext.request.contextPath}/exchange/doUpdateExchange" method="post" accept-charset="utf-8" onsubmit="return doUpdate()">
		
			<div class="row form-group">
                <label class="control-label col-lg-3" for="name"><span>编号：</span></label>
                <div class="col-md-7">
                	<span>${exchange.exchangeNum}</span>
                </div>
            </div>
            
			<div class="row form-group">
                <label class="control-label col-lg-3" for="name"><span>比例：</span></label>
                <div class="col-md-7">
                	<input class="form-control" type="text" id="exchangeE" name="exchangeE" onkeyup="value=value.replace(/^(0+)|[^\d]+/g,'')"  value = "${exchange.exchangeE }">
                </div>
            </div>
            
			<br/>
            
            <div class="row form-group">
				<input class="btn btn-danger" type="submit" value="提交"/>
            </div>
			
	</form>
	</div>
	</div>
</div>
<style>
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
</style>