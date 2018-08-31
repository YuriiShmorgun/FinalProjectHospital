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
    <title>SunMedicom Doctor</title>

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



        <div class="col-md-10">
            <div class="row">
                <div class="col-md-6">
                    <div class="content-box-large">
                        <div class="panel-heading">
                            <div class="panel-title">


                                <c:out value= '${sessionScope.user.role}' />

                            </div>




                            <div class="panel-options">
                                <a href="#" data-rel="collapse"><i class="glyphicon glyphicon-refresh"></i></a>
                                <a href="#" data-rel="reload"><i class="glyphicon glyphicon-cog"></i></a>
                            </div>
                        </div>
                        <div class="panel-body">
                            Ut tristique adipiscing mauris, sit amet suscipit metus porta quis. Donec dictum tincidunt erat, eu blandit ligula. Nam sit amet dolor sapien. Quisque velit erat, congue sed suscipit vel, feugiat sit amet enim. Suspendisse interdum enim at mi tempor commodo. Sed tincidunt sed tortor eu scelerisque. Donec luctus malesuada vulputate. Nunc vel auctor metus, vel adipiscing odio. Aliquam aliquet rhoncus libero, at varius nisi pulvinar nec. Aliquam erat volutpat. Donec ut neque mi. Praesent enim nisl, bibendum vitae ante et, placerat pharetra magna. Donec facilisis nisl turpis, eget facilisis turpis semper non. Maecenas luctus ligula tincidunt iasdsd vitae ante et,
                            <br /><br />
                            Interdum et malesuada fames ac ante ipsum primis in faucibus. Quisque sed consectetur erat. Maecenas in elementum libero. Sed consequat pellentesque ultricies. Ut laoreet vehicula nisl sed placerat. Duis posuere lectus n, eros et hendrerit pellentesque, ante magna condimentum sapien, eget ultrices eros libero non orci. Etiam varius diam lectus.
                            <br /><br />
                        </div>
                    </div>
                </div>

                <div class="col-md-6">
                    <div class="row">
                        <div class="col-md-12">
                            <div class="content-box-header">
                                <div class="panel-title">New vs Returning Visitors</div>

                                <div class="panel-options">
                                    <a href="#" data-rel="collapse"><i class="glyphicon glyphicon-refresh"></i></a>
                                    <a href="#" data-rel="reload"><i class="glyphicon glyphicon-cog"></i></a>
                                </div>
                            </div>
                            <div class="content-box-large box-with-header">

                                Pellentesque luctus quam quis consequat vulputate. Sed sit amet diam ipsum. Praesent in pellentesque diam, sit amet dignissim erat. Aliquam erat volutpat. Aenean laoreet metus leo, laoreet feugiat enim suscipit quis. Praesent mauris mauris, ornare vitae tincidunt sed, hendrerit eget augue. Nam nec vestibulum nisi, eu dignissim nulla.
                                <br /><br />
                            </div>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-md-12">
                            <div class="content-box-header">
                                <div class="panel-title">New vs Returning Visitors</div>

                                <div class="panel-options">
                                    <a href="#" data-rel="collapse"><i class="glyphicon glyphicon-refresh"></i></a>
                                    <a href="#" data-rel="reload"><i class="glyphicon glyphicon-cog"></i></a>
                                </div>
                            </div>
                            <div class="content-box-large box-with-header">

                                Pellentesque luctus quam quis consequat vulputate. Sed sit amet diam ipsum. Praesent in pellentesque diam, sit amet dignissim erat. Aliquam erat volutpat. Aenean laoreet metus leo, laoreet feugiat enim suscipit quis. Praesent mauris mauris, ornare vitae tincidunt sed, hendrerit eget augue. Nam nec vestibulum nisi, eu dignissim nulla.
                                <br /><br />
                            </div>
                        </div>
                    </div>
                </div>
            </div>

            <div class="row">
                <div class="col-md-12 panel-warning">
                    <div class="content-box-header panel-heading">
                        <div class="panel-title ">New vs Returning Visitors</div>

                        <div class="panel-options">
                            <a href="#" data-rel="collapse"><i class="glyphicon glyphicon-refresh"></i></a>
                            <a href="#" data-rel="reload"><i class="glyphicon glyphicon-cog"></i></a>
                        </div>
                    </div>
                    <div class="content-box-large box-with-header">
                        Pellentesque luctus quam quis consequat vulputate. Sed sit amet diam ipsum. Praesent in pellentesque diam, sit amet dignissim erat. Aliquam erat volutpat. Aenean laoreet metus leo, laoreet feugiat enim suscipit quis. Praesent mauris mauris, ornare vitae tincidunt sed, hendrerit eget augue. Nam nec vestibulum nisi, eu dignissim nulla.
                        <br /><br />
                    </div>
                </div>
            </div>

            <div class="content-box-large">
                <div class="panel-heading">
                    <div class="panel-title">Bootstrap dataTables</div>
                </div>
                <div class="panel-body">
                    <table cellpadding="0" cellspacing="0" border="0" class="table table-striped table-bordered" >
                        <thead>
                        <tr class="mySuprerClass">
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

                        <c:forEach var="note" items="${requestScope.userList}">
                            <tr >
                                <td><c:out value="${note.id}"/></td>
                                <td><c:out value="${note.login}"/></td>
                                <td><c:out value="${note.role}"/></td>
                                <td class="center"><c:out value="${note.name_uk}"/></td>
                                <td class="center"><c:out value="${note.name_en}"/></td>
                                <td class="center"><c:out value="${note.surname_uk}"/></td>
                                <td class="center"><c:out value="${note.surname_en}"/></td>

                                <td class="center"><label><a href="/takePatient">
                                    <button class="btn btn-success btn-sm"><fmt:message key="edit" bundle="${rb}" /></button>
                                </a></label>
                                </td>
                                <td class="center"><button class="btn btn-danger btn-sm"><fmt:message key="block" bundle="${rb}" /></button></td>
                            </tr>
                        </c:forEach>








                        <%--
                                      <tr class="even gradeC">
                                          <td>Trident</td>
                                          <td>Internet
                                              Explorer 5.0</td>
                                          <td>Win 95+</td>
                                          <td class="center">5</td>
                                          <td class="center">C</td>
                                      </tr>--%>

                        </tbody>
                    </table>
                </div>
            </div>





                <%--===============--%>
            </div>
        </div>
    </div>
</div>

<jsp:include page="../element/footer.jsp" />

<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<script src="https://code.jquery.com/jquery.js"></script>
<!-- Include all compiled plugins (below), or include individual files as needed -->
<script src="bootstrap/js/bootstrap.min.js"></script>
<script src="js/custom.js"></script>
</body>
</html>