<%@ page 	language="java" 
			contentType="text/html; charset=UTF-8"
    		pageEncoding="UTF-8"
    		deferredSyntaxAllowedAsLiteral="true"
    		%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

	



<div class="table-responsive text-center">
  		<form action="">
  			<div align="center" style="padding-top: 50px;">
  				<div>
  					<h1 class="title1">会员列表</h1>
  				</div>
  			</div>
  			<br />
			<hr />
			<br />
			<br />

  				<table class="table elegant-aero">
	  			<tr class="demo-table-hover">
	  				<td class="threed">详细信息</td>	  								
	  			</tr>
	  			<tr>
	  				<td style="font-family: Helvetica, 'Hiragino Sans GB', 'Microsoft Yahei', '微软雅黑', Arial, sans-serif;text-align:left;font-size:29px">
	  				${recruit.recruitText}
	  				
	  				</td>	 
	  			 </tr>
  				</table>
  		</form>
  </div>
<style>
.elegant-aero {
margin-left: auto;
margin-right: auto;
max-width: 1000px;
background: #D2E9FF;
padding: 20px 20px 20px 20px;
font: 12px Arial, Helvetica, sans-serif;
color: #666;
}
td{border: 1px solid transparent !important;}
.threed{
font-size:30px;
color: transparent;
-webkit-text-stroke: 1px black;
letter-spacing: 0.04em;
background-color:  }
.layui-card.layui-demo-maincard{
	width:auto;
	height:auto;
}
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
input:focus{
	box-shadow:0 0 5px 2px rgba(0,0,0,0.3);
}
box-shadow: 0 0 35px 15px rgba(29,43,100,0.9) inset; 
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
.title1{

       background: #EEE url(data:image/gif;base64,iVBORw0KGgoAAAANSUhEUgAAAAQAAAAECAIAAAAmkwkpAAAAHklEQVQImWNkYGBgYGD4//8/A5wF5SBYyAr+//8PAPOCFO0Q2zq7AAAAAElFTkSuQmCC) repeat;

         text-shadow: 3px -3px black, 2px -2px white;

         font-weight: bold;

         -webkit-text-fill-color: transparent;

         -webkit-background-clip: text;

}
.title2{

        color: transparent;

        -webkit-text-stroke: 1px black;

        letter-spacing: 0.04em;

}
.elegant-aero {
    margin-left:auto;
	margin-right:auto;
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
</style>