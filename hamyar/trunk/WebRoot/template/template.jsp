<%@ page session="false"
%><%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="f" uri="http://java.sun.com/jsf/core" %>
<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html" %>
<%@ taglib uri="http://myfaces.apache.org/extensions" prefix="x"%>
<%@ taglib prefix="tiles" uri="http://struts.apache.org/tags-tiles"
 %><!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html dir="RTL">
 <%@include file="/inc/head.inc"%>
<f:loadBundle basename="com.tarhyar.resources.example_messages" var="example_messages"/>
<f:loadBundle basename="com.tarhyar.resources.messages" var="messages"/>
 <f:view>
<body>
    <x:panelLayout id="page" layout="#{globalOptions.pageLayout}"
            styleClass="pageLayout"
            headerClass="pageHeader"
            navigationClass="pageNavigation"
            bodyClass="pageBody"
            footerClass="pageFooter" >

<f:facet name="header">
    <f:subview id="header">
      <tiles:insert attribute="menu" flush="false" />
    </f:subview>
</f:facet>
<f:facet name="navigation">
    <f:subview id="menu">
      <tiles:insert attribute="leftMenu" flush="false" />
    </f:subview>
</f:facet>
<f:facet name="body">
<f:subview id="body">
	<tiles:insert attribute="body" flush="false"/>
</f:subview>
</f:facet>
<f:facet name="footer">
    <f:subview id="footer">
    <f:facet name="footer1">
      <tiles:insert attribute="footer" flush="false" />
      </f:facet>
    </f:subview>
</f:facet>
</x:panelLayout>
</body>
</f:view>
</html>
