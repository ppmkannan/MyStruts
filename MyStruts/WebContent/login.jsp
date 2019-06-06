<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>
<%@ taglib uri="http://struts.apache.org/tags-nested" prefix="nested"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>JSP Page</title>
</head>
<body>
<div style="color:red">
<html:errors />

</div>
<html:form action="/Login" method="post" enctype="multipart/form-data">
User Name : <html:text name="LoginForm" property="userName"/> <br>
Password  : <html:password name="LoginForm" property="password"/> <br>
image  : 
<input type="file" name="file"/>
<html:submit value="Login" />
</html:form>
</body>
</html>
