<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsf/core" %>
<h:panelGroup id="main">
    <h:outputLabel for="name" value="#{messages.name}"/>
    <h:inputText id="nameId" value="#{document.name}"/>
    <h:commandButton value="#{messages.submit}" action=""/>
</h:panelGroup>

