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




<td><c:out value="${user.role}"/></td>
<td class="center"></td>
<td class="center"></td>
<td class="center"></td>
<td class="center"></td>


<div class="page-content">
    <div class="row">


        <jsp:include page="../element/doctorMenu.jsp" />

        <div class="col-md-10">

           <%--         <div class="content-box-large">--%>


                        <div class="panel-heading">
                            <div class="panel-title"><fmt:message key="note" bundle="${rb}" />
                                    TEST
                                <%--<%= request.getAttribute("note").toString()%>
                                <c:out value= '${requestScope.note.login}' />--%>

                            </div>
                        </div>
                        <div class="panel-body">

                            <div class="row">
                                <div class="col-md-10 panel-info">
                                    <div class="content-box-header">
                                        <div class="panel-title">New vs Returning Visitors</div>


                                    </div>
                                    <div class="content-box-large box-with-header">
                                        <div>


                                            <hr>





                                            <div class="row">


                                                <label class="col-sm-2 control-label">Id</label>
                                                <div class="col-sm-4">
                                                    <span class="form-control"><c:out value="${sessionScope.patient.id}"/></span>
                                                </div>




                                                <label class="col-sm-2 control-label">Text Field</label>
                                                <div class="col-sm-4">
                                                    <span class="form-control"><c:out value="${sessionScope.patient.login}"/></span>
                                                </div>



                                            </div>

                                            <hr>

                                            <div class="row">


                                                <label class="col-sm-2 control-label">Text Field</label>
                                                <div class="col-sm-4">
                                                    <span class="form-control"><c:out value="${sessionScope.patient.name_uk}"/></span>
                                                </div>




                                                <label class="col-sm-2 control-label">Text Field</label>
                                                <div class="col-sm-4">
                                                    <span class="form-control"><c:out value="${sessionScope.patient.name_en}"/></span>
                                                </div>



                                            </div>

                                            <hr>


                                            <div class="row">


                                                <label class="col-sm-2 control-label">Text Field</label>
                                                <div class="col-sm-4">
                                                    <span class="form-control"><c:out value="${sessionScope.patient.surname_uk}"/></span>
                                                </div>




                                                <label class="col-sm-2 control-label">Text Field</label>
                                                <div class="col-sm-4">
                                                    <span class="form-control"><c:out value="${sessionScope.patient.surname_en}"/></span>
                                                </div>



                                            </div>

                                            <hr>
                                           
                                            <%--<div class="row">


                                                <label class="control-label col-md-2">Default Select</label>
                                                <div class="col-md-4">
                                                    <select class="form-control">
                                                        <option>Amsterdam</option>
                                                        <option>Atlanta</option>
                                                        <option>Baltimore</option>
                                                        <option>Miami</option>
                                                        <option>Minneapolis</option>
                                                    </select>
                                                </div>




                                                <label class="control-label col-md-2">Default Select</label>
                                                <div class="col-md-4">
                                                    <select class="form-control">
                                                        <option>Amsterdam</option>
                                                        <option>Atlanta</option>
                                                        <option>Baltimore</option>
                                                        <option>Miami</option>
                                                        <option>Minneapolis</option>
                                                    </select>
                                                </div>




                                            </div>--%>










                                        </div>
                                    </div>
                                    <%--<div class="content-box-large box-with-header">
                                        <div>


                                            <hr>





                                            <div class="row">


                                                <label class="col-sm-2 control-label">Id</label>
                                                <div class="col-sm-4">
                                                    <span class="form-control"><c:out value="${sessionScope.patient.id}"/></span>
                                                </div>




                                                <label class="col-sm-2 control-label">Text Field</label>
                                                <div class="col-sm-4">
                                                    <span class="form-control"><c:out value="${sessionScope.patient.login}"/></span>
                                                </div>



                                            </div>

                                            <hr>

                                            <div class="row">


                                                <label class="col-sm-2 control-label">Text Field</label>
                                                <div class="col-sm-4">
                                                    <span class="form-control"><c:out value="${sessionScope.patient.name_uk}"/></span>
                                                </div>




                                                <label class="col-sm-2 control-label">Text Field</label>
                                                <div class="col-sm-4">
                                                    <span class="form-control"><c:out value="${sessionScope.patient.name_en}"/></span>
                                                </div>



                                            </div>

                                            <hr>

                                            <div class="row">


                                                <label class="col-sm-2 control-label">Text Field</label>
                                                <div class="col-sm-4">
                                                    <span class="form-control"><c:out value="${sessionScope.patient.surname_uk}"/></span>
                                                </div>




                                                <label class="col-sm-2 control-label">Text Field</label>
                                                <div class="col-sm-4">
                                                    <span class="form-control"><c:out value="${sessionScope.patient.surname_en}"/></span>
                                                </div>



                                            </div>





                                            <hr>









                                            <div class="content-box-large">
                                                <div class="panel-heading">
                                                    <div class="panel-title">Диагнозы для пациента</div>
                                                </div>
                                                <div class="panel-body" >
                                                    <table cellpadding="0" cellspacing="0" border="0" class="table table-striped table-bordered" >
                                                        <thead>
                                                        <tr class="mySuprerClass" >
                                                            <th>Id</th>
                                                            <th><fmt:message key="login" bundle="${rb}" /></th>
                                                            <th><fmt:message key="position" bundle="${rb}" /></th>
                                                            <th><fmt:message key="name.uk" bundle="${rb}" /></th>
                                                            <th><fmt:message key="name.eng" bundle="${rb}" /></th>
                                                            <th><fmt:message key="surname.uk" bundle="${rb}" /></th>
                                                            <th><fmt:message key="surname.eng" bundle="${rb}" /></th>
                                                            <th><fmt:message key="edit" bundle="${rb}" /></th>
                                                            <th><fmt:message key="block" bundle="${rb}" /></th>


                                                        </tr>
                                                        </thead>
                                                        <tbody>

                                                        <c:forEach var="diagnosesInfoList" items='${requestScope.diagnosesInfoList}' >
                                                            <tr >
                                                                <td>
                                                                    <c:out value="${diagnosesInfoList.Diagnoses_uk}"/>
                                                                    &lt;%&ndash;<c:out value="${diagnosesInfoList.Diagnoses_en}"/>&ndash;%&gt;
                                                                </td>
                                                                &lt;%&ndash;<td><c:out value="${user.login}"/></td>
                                                                <td><c:out value="${user.role}"/></td>
                                                                <td class="center"><c:out value="${user.name_uk}"/></td>
                                                                <td class="center"><c:out value="${user.name_en}"/></td>
                                                                <td class="center"><c:out value="${user.surname_uk}"/></td>
                                                                <td class="center"><c:out value="${user.surname_en}"/></td>&ndash;%&gt;


                                                                <form method="post" action="${pageContext.request.contextPath}/takePatient">
                                                                    <input name="patient_id" type="hidden" value="${user.id}"/>
                                                                    <td class="center">
                                                                        <input class="btn btn-success btn-sm" type="submit" value="Delete">

                                                                    </td>
                                                                </form>




                                                                <form method="post" action="${pageContext.request.contextPath}/diagnosisList">
                                                                    <input name="patient_id" type="hidden" value="${user.id}"/>
                                                                    <td class="center">
                                                                        <input class="btn btn-danger btn-sm" type="submit" >

                                                                    </td>
                                                                </form>

                                                            </tr>
                                                        </c:forEach>









                                                        </tbody>
                                                    </table>
                                                </div>
                                            </div>

                                           &lt;%&ndash; <--%
                                                <label class="control-label col-md-2">Default Select</label>
                                                <div class="col-md-4">
                                                    <select class="form-control">
                                                        <option>Amsterdam</option>
                                                        <option>Atlanta</option>
                                                        <option>Baltimore</option>
                                                        <option>Miami</option>
                                                        <option>Minneapolis</option>
                                                    </select>
                                                </div>




                                                <label class="control-label col-md-2">Default Select</label>
                                                <div class="col-md-4">
                                                    <select class="form-control">
                                                        <option>Amsterdam</option>
                                                        <option>Atlanta</option>
                                                        <option>Baltimore</option>
                                                        <option>Miami</option>
                                                        <option>Minneapolis</option>
                                                    </select>
                                                </div>




                                            </div>&ndash;%&gt;&ndash;%&gt;










                                        </div>
                                    </div>--%>
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