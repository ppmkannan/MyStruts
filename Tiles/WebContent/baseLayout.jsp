<%-- 
    Document   : baseLayout
    Created on : Dec 19, 2008, 1:28:41 AM
    Author     : eswar@vaannila.com
--%>

<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>
<%@ taglib uri="http://struts.apache.org/tags-nested" prefix="nested"%>
<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title><tiles:getAsString name="title" ignore="true" /></title>
</head>
<body>
	<table border="1" cellpadding="2" cellspacing="2" align="center">
		<tr>
			<td height="100" width="1000" colspan="2"><tiles:insert
					attribute="header" ignore="true" /></td>
		</tr>
		<tr>
			<td width="20%" height="700"><tiles:insert attribute="menu" />
			</td>
			<td><tiles:insert attribute="body" /></td>
		</tr>
		<tr>
			<td height="20%" colspan="2"><tiles:insert attribute="footer" />
			</td>
		</tr>
	</table>
</body>
</html>
