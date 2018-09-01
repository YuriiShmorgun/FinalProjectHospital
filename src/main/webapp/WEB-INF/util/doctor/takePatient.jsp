<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<%@ page contentType="text/html; charset=UTF-8" language="java"%>
<%@ page isELIgnored="false" %>

<c:set var="language" value="${not empty param.language ? param.language : not empty language ? language: pageContext.request.locale}" scope="session"/>
<fmt:setLocale value="${language}"/>
<fmt:setBundle basename="resource" var="rb"/>



<!DOCTYPE html>
<html>
<head>
    <title>SunMedicom</title>

    <link rel="shortcut icon" href="../../favicon.ico" type="image/x-icon">


    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <!-- Bootstrap -->
    <link href="../../bootstrap/css/bootstrap.min.css" rel="stylesheet">
    <!-- styles -->
    <link href="../../css/styles.css" rel="stylesheet">

    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
    <script src="https://oss.maxcdn.com/libs/respond.js/1.3.0/respond.min.js"></script>
    <![endif]-->
</head>
<body>

<jsp:include page="../element/header.jsp" />





<div class="page-content">
    <div class="row">


        <jsp:include page="../element/doctorMenu.jsp" />

        <div class="col-md-10">
            <div class="row">
                <div class="col-md-9">
                    <div class="content-box-large">
                        <div class="panel-heading">
                            <div class="panel-title"><fmt:message key="note" bundle="${rb}" />
                                    TEST
                                <%--<%= request.getAttribute("note").toString()%>
                                <c:out value= '${requestScope.note.login}' />--%>

                            </div>
                        </div>
                        <div class="panel-body">
                            <form method="post" class="form-horizontal" action="${pageContext.request.contextPath}/newUser" >

                                <fieldset>
                                    <legend><fmt:message key="input.new.user" bundle="${rb}" /></legend>

                                    <div class="form-group">




                                       <%-- <c:out value="${note.login}"/>--%>

                                        <label for="login" class="col-sm-2 control-label"><fmt:message key="LOGIN" bundle="${rb}" /></label>
                                        <div class="col-sm-10">
                                            <input name="login" type="text" class="form-control" id="login" placeholder=<fmt:message key="LOGIN" bundle="${rb}" /> >
                                        </div>
                                    </div>

                                    <div class="form-group">
                                        <label for="password" class="col-sm-2 control-label"><fmt:message key="PASSWORD" bundle="${rb}" /></label>
                                        <div class="col-sm-10">
                                            <input name="password" type="text" class="form-control" id="password" placeholder=<fmt:message key="PASSWORD" bundle="${rb}" /> >
                                        </div>
                                    </div>

                                    <div class="form-group">
                                        <label class="col-md-2 control-label" ><fmt:message key="position" bundle="${rb}" /></label>
                                        <div class="col-md-10">
                                            <input name="role" class="form-control" placeholder=<fmt:message key="position" bundle="${rb}" /> type="text" list="list">
                                            <datalist id="list" >
                                                <option value="PATIENT"></option>
                                                <option value="NURSE"></option>
                                                <option value="DOCTOR"></option>
                                                <option value="ADMINISTRATOR"></option>
                                            </datalist>
                                            <p class="note"><strong><fmt:message key="attention" bundle="${rb}" />:</strong><fmt:message key="note.instruction" bundle="${rb}" /></p>
                                        </div>
                                    </div>

                                    <div class="form-group">
                                        <label for="name_uk" class="col-sm-2 control-label"><fmt:message key="name.uk" bundle="${rb}" /></label>
                                        <div class="col-sm-10">
                                            <input name="name_uk" type="text" class="form-control" id="name_uk" placeholder=<fmt:message key="name.uk" bundle="${rb}" /> >
                                        </div>
                                    </div>

                                     <div class="form-group">
                                            <label for="name_en" class="col-sm-2 control-label"><fmt:message key="name.eng" bundle="${rb}" /></label>
                                            <div class="col-sm-10">
                                                <input name="name_en" type="text" class="form-control" id="name_en" placeholder=<fmt:message key="name.eng" bundle="${rb}" />>
                                        </div>
                                    </div>

                                    <div class="form-group">
                                        <label for="surname_uk" class="col-sm-2 control-label"><fmt:message key="surname.uk" bundle="${rb}" /></label>
                                        <div class="col-sm-10">
                                            <input name="surname_uk" type="text" class="form-control" id="surname_uk" placeholder=<fmt:message key="surname.uk" bundle="${rb}" />>
                                        </div>
                                    </div>

                                    <div class="form-group">
                                        <label for="surname_en" class="col-sm-2 control-label"><fmt:message key="surname.eng" bundle="${rb}"/></label>
                                        <div class="col-sm-10">
                                            <input name="surname_en" type="text" class="form-control" id="surname_en" placeholder=<fmt:message key="surname.eng" bundle="${rb}"/>>
                                        </div>
                                    </div>

                                </fieldset>
                                <div class="form-actions">
                                    <div class="row">
                                        <div class="col-md-12">
                                            <button class="btn btn-primary" type="submit">
                                                <fmt:message key="create" bundle="${rb}"/>
                                            </button>
                                        </div>
                                    </div>
                                </div>
                            </form>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>





    <!-- bootstrap-datetimepicker -->
    <link href="vendors/bootstrap-datetimepicker/datetimepicker.css" rel="stylesheet">
    <script src="vendors/bootstrap-datetimepicker/bootstrap-datetimepicker.js"></script>


    <link href="//cdnjs.cloudflare.com/ajax/libs/x-editable/1.5.0/bootstrap3-editable/css/bootstrap-editable.css" rel="stylesheet"/>
    <script src="//cdnjs.cloudflare.com/ajax/libs/x-editable/1.5.0/bootstrap3-editable/js/bootstrap-editable.min.js"></script>

    <script src="js/custom.js"></script>
    <script src="js/forms.js"></script>
</body>

</html>