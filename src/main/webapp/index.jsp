<!doctype html>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<%@ page contentType="text/html; charset=UTF-8" language="java"%>
<%@ page isELIgnored="false" %>

<c:set var="language" value="${not empty param.language ? param.language : not empty language ? language: pageContext.request.locale}" scope="session"/>
<fmt:setLocale value="${language}"/>
<fmt:setBundle basename="resource" var="rb"/>

<html>
<head>

    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">


    <link rel="icon" type="image/ico" href="/favicon.ico"/>

    <!-- Bootstrap core CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
    <%--<link href="source/bootstrap/css/bootstrap.min.css" rel="stylesheet">--%>

    <!-- Custom styles for this template -->
   <%-- <link href="https://getbootstrap.com/docs/4.1/examples/sign-in/signin.css" rel="stylesheet">--%>
    <link href="css/signin.css" rel="stylesheet">


    <title>SunMedicom</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <!-- Bootstrap -->
    <link href="bootstrap/css/bootstrap.min.css" rel="stylesheet">
    <!-- styles -->
    <link href="css/styles.css" rel="stylesheet">

    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
    <script src="https://oss.maxcdn.com/libs/respond.js/1.3.0/respond.min.js"></script>
    <![endif]-->


</head>
<body class="text-center">


<%--<jsp:include page="util/element/header.jsp" />--%>
<div class="header">
    <div class="container">
        <div class="row">
            <div class="col-md-3">
                <!-- Logo -->
                <div class="logo">
                    <h1><a href="index.html">SunMedicom </a></h1>
                </div>
            </div>
            <div class="col-md-2">
                <div class="col-lg-12">
                    <div class="input-group form">
                        <form>
                            <input name="language" type="image" value="en_US"
                            ${language=='en_US' ? 'selected' : '' } src = "http://icons.iconarchive.com/icons/custom-icon-design/all-country-flag/128/United-States-Flag-icon.png" style="height: 35px; width: 35px;">
                            <input name="language" type="image" value="uk_UA"
                            ${language=='uk_UA' ? 'selected' : '' } src = "http://icons.iconarchive.com/icons/custom-icon-design/all-country-flag/128/Ukraine-Flag-icon.png" style="height: 35px; width: 35px;">
                        </form>
                    </div>
                </div>
            </div>

            <div class="col-md-5">
                <div class="row">
                    <div class="col-lg-12">
                        <div class="input-group form">
                            <%--<input type="text" class="form-control" placeholder="Search...">
                            <span class="input-group-btn">
	                         <button class="btn btn-primary" type="button">Search</button>
	                       </span>--%>
                        </div>
                    </div>
                </div>
            </div>
            <div class="col-md-2">
                <div class="navbar navbar-inverse" role="banner">
                    <nav class="collapse navbar-collapse bs-navbar-collapse navbar-right" role="navigation">
                        <ul class="nav navbar-nav">
                            <li class="dropdown">
                              <a href="/logout"><fmt:message key="refresh" bundle="${rb}" /></a>
                        </ul>
                        </li>
                        </ul>
                    </nav>
                </div>
            </div>
        </div>
    </div>
</div>


<%--href="${pageContext.request.contextPath}/index.jsp"--%>



<form method="post" action="${pageContext.request.contextPath}/login" class="form-signin" >
<div>
        <h1 class="h3 mb-3 font-weight-normal"><fmt:message key="SIGN_IN" bundle="${rb}" /></h1>
    <label for="login" class="sr-only">Login</label>
        <input name="login" type="login" id="login" class="form-control" placeholder=<fmt:message key="LOGIN" bundle="${rb}" /> required autofocus <%--pattern="(?=^.{8,}$)((?=.*\d)|(?=.*\W+))(?![.\n])(?=.*[A-Z])(?=.*[a-z]).*$"--%>>
    <label for="inputPassword" class="sr-only">Password</label>
        <input name="password" type="password" id="inputPassword" class="form-control" placeholder=<fmt:message key="PASSWORD" bundle="${rb}" /> required autofocus>



            <div class="mb-4">


            </div>

    <button class="btn btn-lg btn-primary btn-block" type="submit"><fmt:message key="ENTER" bundle="${rb}" /></button>
    <p class="mt-5 mb-3 text-muted">&copy; 2018</p>
</div>
</form>













<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
    <script src="source/bootstrap/js/bootstrap.min.js"></script>
</body>
</html>



