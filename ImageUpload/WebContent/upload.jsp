<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>
<%@ taglib uri="http://struts.apache.org/tags-nested" prefix="nested"%>

<!DOCTYPE html>
<html:html>
<head>
<meta charset="ISO-8859-1">
<title>UploadFormJSP</title>
</head>
<body>
	<html:form action="/Upload" method="get">
User Name : <html:text name="UploadForm" property="userName" />
		<br>
Password  : <html:password name="UploadForm" property="password" />
		<br>
Image  :  <html:file name="UploadForm" property="file"></html:file>
		<html:submit value="Upload" />
		
		<a href="GetImages.me">GetImages</a>
	</html:form>
</body>
</html:html>