<%-- 
    Document   : login
    Created on : Sep 29, 2017, 2:25:23 PM
    Author     : Tien
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Admin - Login</title>
        <link rel="stylesheet" href="css/jquery.scrolltop.min.css">
        <link rel="stylesheet"s href="css/bootstrap.css">
        <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.11.0/umd/popper.min.js" integrity="sha384-b/U6ypiBEHpOf/4+1nzFpr53nxSS+GLCkfwBdFNTxtclqqenISfwAzpKaMNFNmj4" crossorigin="anonymous"></script>
        <script src="js/bootstrap.min.js"></script>
        <script type="text/javascript" src="js/bootstrap.js"></script>
        <link rel="stylesheet" href="css/css.css">
        <script src="js/myjs.js" type="text/javascript"></script>
        <link href="css/font-awesome.css" rel="stylesheet" type="text/css"/>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    </head>
    <%
        if (session != null) {
            if (session.getAttribute("USERNAME") != null || session.getAttribute("USER") != null) {
                response.sendRedirect("index.jsp");
            }
        }
    %>
    <body style="background: #388ad6">
        <jsp:include page="include/menu.jsp"></jsp:include>
        <div class="container-fluid">
            <div class="row">
                <div class="col-md-4"></div>
                <div class="col-md-4 login-admin">
                    <h1><span class="fa fa-text-width">ientahpd01815</span></h1>
                    <div class="login-form">
                        <div class="title-login-admin">
                            <h2 class="fa fa-briefcase"> Đăng nhập</h2>
                        </div>
                        <form action="AdminServlet" method="post">
                            <div class="input-group input-login">
                                <span class="input-group-btn">
                                    <button class="btn btn-secondary" type="button"><i class="fa fa-user-circle"></i></button>
                                </span>
                                <input type="text" class="form-control" placeholder="Xin vui lòng nhập tên đăng nhập" aria-label="Search for..." name="user">
                            </div>
                            <div class="input-group input-login">
                                <span class="input-group-btn">
                                    <button class="btn btn-secondary" type="button"><i class="fa fa-key"></i></button>
                                </span>
                                <input type="password" class="form-control" placeholder="Xin vui lòng nhập mật khẩu" aria-label="Search for..." name="pass">
                            </div>
                            <button type="submit" class="btn btn-outline-primary" name="action" value="login">Submit</button>
                        </form>
                    </div>
                </div>
                <div class="col-md-4"></div>
            </div>
        </div>
    </body>
</html>
