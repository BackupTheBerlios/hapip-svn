<%@ page import="java.math.BigDecimal,
                 java.util.Date"%>
<%@ page session="false" contentType="text/html;charset=utf-8"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@ taglib uri="http://myfaces.apache.org/extensions" prefix="x"%>
<html>

<%@include file="inc/head.inc" %>

<!--
/*
 * Copyright 2004 The Apache Software Foundation.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
//-->

<body>

<!--
managed beans used:
    calcForm
    ucaseForm
-->
    <x:saveState id="ss1" value="#{tabbedPaneBean}" />
            <h:panelGroup >

                <x:messages id="messageList" showSummary="true" showDetail="true" summaryFormat="{0}:" />

                <x:panelTabbedPane bgcolor="#FFFFCC" >

                    <f:verbatim><p></f:verbatim>
                        <h:outputText value="#{example_messages['tabbed_common']}"/>
                    <f:verbatim></p></f:verbatim>


                    <x:panelTab id="tab1" label="#{example_messages['tabbed_tab1']}" rendered="#{tabbedPaneBean.tab1Visible}">
   	                    <h:selectBooleanCheckbox id="testCheckBox" value="#{testCheckBox.checked}"/><h:outputLabel for="testCheckBox" value="A checkbox"/>
	                    <f:verbatim><br/><br/></f:verbatim>
                        <h:inputText id="inp1"/><f:verbatim><br></f:verbatim>
                        <h:inputText id="inp2" required="true" /><h:message for="inp2" showSummary="false" showDetail="true" />
                    </x:panelTab>

                    <f:subview id="tab2" >
                        <jsp:include page="tab2.jsp"/>
                    </f:subview>

                    <x:panelTab id="tab3" label="#{example_messages['tabbed_tab3']}" rendered="#{tabbedPaneBean.tab3Visible}">
						<x:selectOneRadio value="#{testRadioButton.choice}">
							<f:selectItem itemValue="0" itemLabel="First Choice" />
							<f:selectItem itemValue="1" itemLabel="Second Choice" />
                        </x:selectOneRadio>
                        
	                    <f:verbatim><br/><br/></f:verbatim>

                        <x:dataTable id="xxx" value="#{testCheckList.testCheckBoxes}"
                                    var="checkBox"
                                    preserveDataModel="true"
                                    rowIndexVar="rowNumber">
                            <h:column>
                                <f:facet name="header">
                                    <h:outputText id="list" value="Check boxes list" />
                                </f:facet>
                                <h:selectBooleanCheckbox value="#{checkBox.checked}"/>
                                <h:outputText  id="romNo" value="Check box #{rowNumber}"/>
                            </h:column>
                            <h:column>
                                <f:facet name="header">
                                    <h:outputText  id="tte" value="Text" />
                                </f:facet>
                                <h:inputText value="#{checkBox.text}"/>
                            </h:column>
                        </x:dataTable>
		                
						<f:verbatim><br/><br/></f:verbatim>

                        <h:inputText id="inp3"/><f:verbatim><br/></f:verbatim>
                    </x:panelTab>

                    <f:verbatim><br/><hr/><br/></f:verbatim>

                    <h:selectBooleanCheckbox value="#{tabbedPaneBean.tab1Visible}"/>
                    <h:outputText value="#{example_messages['tabbed_visible1']}"/>
                    <f:verbatim><br></f:verbatim>
                    <h:selectBooleanCheckbox value="#{tabbedPaneBean.tab2Visible}"/>
                    <h:outputText value="#{example_messages['tabbed_visible2']}" />
                    <f:verbatim><br></f:verbatim>
                    <h:selectBooleanCheckbox value="#{tabbedPaneBean.tab3Visible}"/>
                    <h:outputText value="#{example_messages['tabbed_visible3']}" />
                    <f:verbatim><br></f:verbatim>

                    <h:commandButton value="#{example_messages['tabbed_submit']}" />

                </x:panelTabbedPane>

            </h:panelGroup>


