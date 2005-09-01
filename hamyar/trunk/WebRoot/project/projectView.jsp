<%--
  Created by IntelliJ IDEA.
  User: as
  Date: Aug 29, 2005
  Time: 2:43:06 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page session="true" contentType="text/html;charset=utf-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@ taglib uri="http://myfaces.apache.org/extensions" prefix="x"%>
<html>
<f:loadBundle basename="com.tarhyar.messages" var="messages"/>
  <h:outputText value="#{messages.Hello}"/> 

</html>