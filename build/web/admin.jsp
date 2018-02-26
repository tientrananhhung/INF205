<%-- 
    Document   : admin
    Created on : Oct 1, 2017, 8:15:46 PM
    Author     : Tien
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Admin</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <link href="css/css.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <%
            if (session != null) {
                if (session.getAttribute("USERNAME") == null) {
                    response.sendRedirect("login.jsp");
                }
            }
        %>
        <jsp:include page="include/menu-sub.jsp"></jsp:include>
        <div class="container-fluid">
            <div class="col-md-10">
                <div class="alert alert-info">
                    <strong>Thông báo!</strong> Trang chủ đang trong giai đoạn hoàn thiện.
                </div>
                <div class="alert alert-warning">
                    <strong>Thông báo!</strong> Hiện website đang trong giai đoạn hoàn thiện, xin vui lòng đóng góp ý kiến để
                    website được hoàn thiện hơn.
                </div>
            </div>
        </div>
    </body>
</html>
