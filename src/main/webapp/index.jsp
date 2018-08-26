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


    <!-- Bootstrap core CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
    <%--<link href="source/bootstrap/css/bootstrap.min.css" rel="stylesheet">--%>

    <!-- Custom styles for this template -->
    <link href="https://getbootstrap.com/docs/4.1/examples/sign-in/signin.css" rel="stylesheet">


    <title>Hospital</title>


</head>
<body class="text-center">



<div class="mb-4">
    <form>
        <input name="language" type="image" value="en_US"
        ${language=='en_US' ? 'selected' : '' } src = "http://icons.iconarchive.com/icons/custom-icon-design/all-country-flag/128/United-States-Flag-icon.png" style="height: 30px; width: 30px;">
        <input name="language" type="image" value="uk_UA"
        ${language=='uk_UA' ? 'selected' : '' } src = "http://icons.iconarchive.com/icons/custom-icon-design/all-country-flag/128/Ukraine-Flag-icon.png" style="height: 30px; width: 30px;">
    </form>
</div>



<form method="post" action="${pageContext.request.contextPath}/login" class="form-signin">

        <h1 class="h3 mb-3 font-weight-normal"><fmt:message key="SIGN_IN" bundle="${rb}" /></h1>
    <label for="login" class="sr-only">Login</label>
        <input name="login" type="login" id="login" class="form-control" placeholder=<fmt:message key="LOGIN" bundle="${rb}" /> required autofocus <%--pattern="(?=^.{8,}$)((?=.*\d)|(?=.*\W+))(?![.\n])(?=.*[A-Z])(?=.*[a-z]).*$"--%>>
    <label for="inputPassword" class="sr-only">Password</label>
        <input name="password" type="password" id="inputPassword" class="form-control" placeholder=<fmt:message key="PASSWORD" bundle="${rb}" /> required autofocus>

    <div class="checkbox mb-3">
        <label>
            <input type="checkbox" value="remember-me"> <fmt:message key="REMEMBER_ME" bundle="${rb}" />
        </label>
    </div>
    <button class="btn btn-lg btn-primary btn-block" type="submit"><fmt:message key="ENTER" bundle="${rb}" /></button>
    <p class="mt-5 mb-3 text-muted">&copy; 2018</p>
</form>













<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
    <script src="source/bootstrap/js/bootstrap.min.js"></script>
</body>
</html>



