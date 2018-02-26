<%-- 
    Document   : index
    Created on : 12-Oct-2017, 16:30:43
    Author     : Tien Tran
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>tientahpd01815 - Trang chủ</title>
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
    <body>
        <jsp:include page="include/menu.jsp"></jsp:include>
        <jsp:include page="include/header.jsp"></jsp:include>
        <jsp:include page="include/homeproduct.jsp"></jsp:include>
        <jsp:include page="include/themchucnang.jsp"></jsp:include>
        <jsp:include page="include/footer.jsp"></jsp:include>
        <a href="#" id="back-to-top" title="Back to top">&uarr;</a>
        <script>
            if ($('#back-to-top').length) {
                var scrollTrigger = 100, // px
                        backToTop = function () {
                            var scrollTop = $(window).scrollTop();
                            if (scrollTop > scrollTrigger) {
                                $('#back-to-top').addClass('show');
                            } else {
                                $('#back-to-top').removeClass('show');
                            }
                        };
                backToTop();
                $(window).on('scroll', function () {
                    backToTop();
                });
                $('#back-to-top').on('click', function (e) {
                    e.preventDefault();
                    $('html,body').animate({
                        scrollTop: 0
                    }, 700);
                });
            }
        </script>
    </body>
</html>
