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
<%@ taglib uri="http://myfaces.apache.org/tomahawk" prefix="t"%>
<h:panelGrid id="main">

   <h:form>
       <h:panelGrid  id="grid" columns="2">
            <h:outputLabel  for="name" value="#{messages.name}"/>
            <h:inputText id="name" value="#{project.name}"/>
            <h:outputLabel for="description" value="#{messages.description}"/>
            <h:inputText id="description" value="#{project.description}"/>
            <h:outputLabel for="nickName" value="#{messages.nickName}"/>
            <h:inputText id="nickName" value="#{project.nickname}"/>
            <h:outputLabel for="budget" value="#{messages.budget}"/>
            <h:inputText id = "budget" value="#{project.budget}"/>
            <h:outputLabel for="manager" value="#{messages.manager}"/>
            <h:selectOneMenu  style="width:120px;" id="manager" value="#{project.manager}">
                <f:selectItems  value="#{manager.managers}"/>
            </h:selectOneMenu>
            <h:commandButton value="#{messages.submit}" action="#{project.save}"/>
       </h:panelGrid >
  </h:form>
</h:panelGrid>
