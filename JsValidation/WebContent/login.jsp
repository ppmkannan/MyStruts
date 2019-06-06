<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>
<%@ taglib uri="http://struts.apache.org/tags-nested" prefix="nested"%>
<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">


<html:html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>JS Validation</title>
</head>
<body>
	<html:form action="/Login" onsubmit="validateLoginForm(this);">
	<!--  -->
		<html:javascript formName="LoginForm"/>
            User Name : <html:text name="LoginForm" property="userName" />
		<br>
            Password  : <html:password name="LoginForm"
			property="password" />
		<br>
		<html:submit value="Login" />
	</html:form>
</body>
</html:html>
