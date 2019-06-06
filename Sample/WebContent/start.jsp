<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>
<%@ taglib uri="http://struts.apache.org/tags-nested" prefix="nested"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Start</title>
</head>
<body>
<h1>Struts</h1>
<h4>Sample Struts</h4>

<a href="toStart.do?parameter=toLogin">Go to LogIN</a>
<br/>
<a href="toStart.do?parameter=toSignup">Go to SignUP</a>
<br/><br/>-----------<br/>
<a href="myCheck.me?value=one">Go to one</a>
<br/>
<a href="myCheck.me?value=two">Go to Two</a>
<a href="Login.me">Go </a>
<button id="btn">
go
</button>






<script>
$("#btn").click(function(e){
	   window.location.href="HelloWorld.me";
	});
</script>
</body>
</html>