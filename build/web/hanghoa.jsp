<%-- 
    Document   : hanghoa
    Created on : Oct 1, 2017, 11:55:23 PM
    Author     : Tien
--%>

<%@page import="model.HangHoaDAO"%>
<%@page import="java.text.DecimalFormat"%>
<%@page import="java.util.Vector"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Hàng hóa</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        <link href="css/css.css" rel="stylesheet" type="text/css"/>
        <script src="css/myjs.js" type="text/javascript"></script>
    </head>
    <%HangHoaDAO hhDAO = new HangHoaDAO();%>
    <% DecimalFormat formatter = new DecimalFormat("###,###,###"); %>
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
                <div class="title-hanghoa">
                    <div class="col-md-10">
                        <h3>Hàng hóa</h3>
                        <a href="DelItemsServlet?action=AddNewSP" class="btn btn-primary bt-tool-bar"><i class="fa fa-plus"></i><span> Thêm hàng hóa</span></a>
                    </div>
                </div>
                <div class="col-md-10">
                    <table class="table table-hover" style="background: white">
                        <thead>
                            <tr>
                                <th>Mã hàng hóa</th>
                                <th>Tên hàng hóa</th>
                                <th>Số lượng</th>
                                <th>Giá bán</th>
                                <th>Loại sản phẩm</th>
                                <th></th>
                            </tr>
                        </thead>
                        <tbody>
                        <%
                            for (int i = 0; i < hhDAO.getAllItems().size(); i++) {

                        %>
                        <tr>
                            <td><%=hhDAO.getAllItems().get(i).getMaSP()%></td>
                            <td><%=hhDAO.getAllItems().get(i).getTenSP()%></td>
                            <td><%=hhDAO.getAllItems().get(i).getSoLuong()%></td>
                            <td><%=formatter.format(hhDAO.getAllItems().get(i).getGia()) + " VNĐ"%></td>
                            <td><%=hhDAO.getAllItems().get(i).getMaLoaiSP().getName()%></td>
                            <td>
                                <a href='<%="DelItemsServlet?action=Edit&MaSP=" + hhDAO.getAllItems().get(i).getMaSP()%>'><span class="fa fa-pencil" title="Cập nhật hàng hóa"></span></a>
                                <a href='<%="DelItemsServlet?action=Del&MaSP=" + hhDAO.getAllItems().get(i).getMaSP()%>'><span class="fa fa-trash" title="Xóa hàng hóa"></span></a>
                            </td>
                        </tr>
                        <%
                            }
                        %>
                    </tbody>
                </table>
            </div>
        </div>
    </body>
</html>
