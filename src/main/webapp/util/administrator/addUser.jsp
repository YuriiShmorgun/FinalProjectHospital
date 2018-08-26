<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ page contentType="text/html; charset=UTF-8" language="java"%>
<%@ page isELIgnored="false" %>

<c:set var="language" value="${not empty param.language ? param.language : not empty language ? language: pageContext.request.locale}" scope="session"/>
<fmt:setLocale value="${language}"/>
<fmt:setBundle basename="resource" var="rb"/>

<html>
<head>
    <title>Title</title>
</head>
<body>
<%--<form method="post" action="${pageContext.request.contextPath}/addUser" class="addUser">

    <h1><fmt:message key="SIGN_IN" bundle="${rb}" /></h1>
    <label for="login" class="sr-only">Login</label>
    <input name="login" type="login" id="login" class="form-control" placeholder=<fmt:message key="LOGIN" bundle="${rb}" /> required autofocus>
    <label for="inputPassword" class="sr-only">Password</label>
    <input name="password" type="password" id="inputPassword" class="form-control" placeholder=<fmt:message key="PASSWORD" bundle="${rb}" /> required autofocus>

    <div class="checkbox mb-3">
        <label>
            <input type="checkbox" value="remember-me"> <fmt:message key="REMEMBER_ME" bundle="${rb}" />
        </label>
    </div>
    <button class="btn btn-lg btn-primary btn-block" type="submit"><fmt:message key="ENTER" bundle="${rb}" /></button>
    <p class="mt-5 mb-3 text-muted">&copy; 2018</p>
</form>--%>

<div class="mb-4">
    <form>
        <input name="language" type="image" value="en_US"
        ${language=='en_US' ? 'selected' : '' } src = "http://icons.iconarchive.com/icons/custom-icon-design/all-country-flag/128/United-States-Flag-icon.png" style="height: 30px; width: 30px;">
        <input name="language" type="image" value="uk_UA"
        ${language=='uk_UA' ? 'selected' : '' } src = "http://icons.iconarchive.com/icons/custom-icon-design/all-country-flag/128/Ukraine-Flag-icon.png" style="height: 30px; width: 30px;">
    </form>
</div>

<a href="${pageContext.request.contextPath}/logout">Log out</a>

<form method="post" action="${pageContext.request.contextPath}/addUser" >
    <label><fmt:message key="input.new.user" bundle="${rb}" /></label>

    <br>
    <%--<input name="login" type="text" value="${own_food_name}" required>--%>
    <input name="login" type="text" placeholder=<fmt:message key="LOGIN" bundle="${rb}" />>
    <br>

    <br>
    <input name="password" type="text" placeholder=<fmt:message key="PASSWORD" bundle="${rb}" />>
    <br>

    <br>
    <input name="name_uk" type="text" placeholder=<fmt:message key="name.uk" bundle="${rb}" />>
    <br>

    <br>
    <input name="name_en" type="text" placeholder=<fmt:message key="name.eng" bundle="${rb}" />>
    <br>

    <br>
    <input name="surname_uk" type="text" placeholder=<fmt:message key="surname.uk" bundle="${rb}" />>
    <br>

    <br>
    <input name="surname_en" type="text" placeholder=<fmt:message key="surname.eng" bundle="${rb}"/>>
    <br>
    <br>
    Administrator <input type="radio" name="role" value="ADMINISTRATOR">
    Doctor <input type="radio" name="role" value="DOCTOR">
    Nurse <input type="radio" name="role" value="NURSE">
    Patient <input type="radio" name="role" value="PATIENT" <%--checked="checked"--%>>

    <input class="button" type="submit" value=<fmt:message key="create" bundle="${rb}"/>>
</form>









</body>
</html>




<%--16--%>
