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
<title>Insert title here</title>
</head>
<body>
	login
	<html:form action="/Login" method="get">
User Name : <html:text name="LoginSampleForm" property="username" value="enter username"/>
		<br>
Password  : <html:password name="LoginSampleForm" property="password" value="enter passoword" />
		<br>

		<html:submit value="Login" />
	</html:form>
	
<script type="text/javascript">
console.log("zoho");
document.form[0].

</script>
</body>
</html>