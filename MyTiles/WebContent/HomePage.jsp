<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>
<%@ taglib uri="http://struts.apache.org/tags-nested" prefix="nested"%>
<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles" %>

<tiles:insert page="/Layout.jsp" flush="true">
   <tiles:put name="title" type="string" value="Welcome Page" />
   <tiles:put name="header" value="/header.jsp" />
   <tiles:put name="menu" value="/menu.jsp" />
   <tiles:put name="body" value="/body.jsp" />
   <tiles:put name="footer" value="/footer.jsp" /> 
</tiles:insert>
