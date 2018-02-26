<%-- 
    Document   : donhang
    Created on : 25-Oct-2017, 02:52:35
    Author     : Tien Tran
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="java.text.DecimalFormat"%>
<%@page import="java.util.Vector"%>
<%@page import="model.GioHangDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Admin - duyệt đơn hàng</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        <link href="css/css.css" rel="stylesheet" type="text/css"/>
        <script src="css/myjs.js" type="text/javascript"></script>
    </head>
    <body>
        <%
            if (session != null) {
                if (session.getAttribute("USERNAME") == null) {
                    response.sendRedirect("login.jsp");
                }
            }
        %>
        <%GioHangDAO ghDAO = new GioHangDAO(); %>
        <% DecimalFormat formatter = new DecimalFormat("###,###,###"); %>
        <jsp:include page="include/menu-sub.jsp"></jsp:include>
            <div class="container-fluid">
                <div class="row">
                    <div class="col-md-10">
                        <h3>Đơn hàng</h3>
                    </div>
                    <div class="col-md-10">
                        <table class="table table-hover" style="background: white;">
                            <thead>
                                <tr>
                                    <th>Tài khoản</th>
                                    <th>Tên người đặt</th>
                                    <th>Địa chỉ</th>
                                    <th>Số điện thoại</th>
                                    <th>Tổng tiền hàng</th>
                                    <th>Trạng thái</th>
                                    <th></th>
                                </tr>
                            </thead>
                            <tbody>
                            <%
                                for (int i = 0; i < ghDAO.getAllOrder().size(); i++) {
                                    Vector t = (Vector) ghDAO.getAllOrder().get(i);
                            %>
                            <tr>
                                <td><%=t.get(1)%></td>
                                <td><%=t.get(2)%></td>
                                <td><%=t.get(3)%></td>
                                <td><%=t.get(4)%></td>
                                <td><%=formatter.format(Integer.parseInt(t.get(5).toString())) + " VNĐ"%></td>
                                <td>
                                    <c:choose>
                                        <c:when test="${TRANG_THAI == 2}">
                                            <span class="glyphicon glyphicon-check"></span>
                                        </c:when>
                                        <c:otherwise>
                                            <span class="glyphicon glyphicon-share"></span>
                                        </c:otherwise>
                                    </c:choose>
                                </td>
                                <td>
                                    <a href='<%="DelItemsServlet?action=Confirm&id=" + t.get(1)%>'><span class="fa fa-check-square-o" title="Xác nhận đơn hàng" style="margin-right: 10px;"></span></a>
                                    <a href='<%="DelItemsServlet?action=DelOrder&id=" + t.get(1)%>'><span class="fa fa-trash" title="Xóa đơn hóa"></span></a>
                                </td>
                            </tr>
                            <%}%>

                        </tbody>
                </div>
            </div>
        </div>
    </body>
</html>
