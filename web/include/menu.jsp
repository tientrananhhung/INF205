<%-- 
    Document   : menu1
    Created on : 13-Oct-2017, 20:19:09
    Author     : Tien Tran
--%>

<%@page import="model.GioHangDAO"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%GioHangDAO ghDAO = new GioHangDAO();%>
<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarTogglerDemo01" aria-controls="navbarTogglerDemo01" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
    </button>
    <div class="container">
        <!-- Thanh menu -->
        <div class="collapse navbar-collapse" id="navbarTogglerDemo01">
            <c:choose>
                <c:when test="${USERNAME != null}">
                    <a class="navbar-brand" href="AdminServlet?action=Backhome&user=${USERNAME}">TIENTAHPD01815</a>
                </c:when>
                <c:when test="${USER != null}">
                    <a class="navbar-brand" href="AdminServlet?action=Backhome&user=${USER}">TIENTAHPD01815</a>
                </c:when>
                <c:otherwise>
                    <a class="navbar-brand" href="index.jsp">TIENTAHPD01815</a>
                </c:otherwise>
            </c:choose>
            <ul class="navbar-nav mr-auto mt-2 mt-lg-0">
                <li class="nav-item">
                    <a class="nav-link" href="#">Điện thoại</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#">Tablet</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#">Laptop</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#">Công nghệ</a>
                </li>
            </ul>
            <!-- Tìm kiếm -->
            <form class="form-inline my-2 my-lg-0">
                <input class="form-control mr-sm-2" type="search" placeholder="Tìm kiếm" aria-label="Tìm kiếm" name="search">
            </form>
            <c:choose>
                <c:when test="${USERNAME != null}">
                    <a href="DelItemsServlet?action=CartID&id=${USERNAME}" class="btn btn-success">Giỏ hàng <span class="badge badge-light">${SL_GIO_HANG}</span></a>
                    </c:when>
                    <c:when test="${USER != null}">
                    <a href="DelItemsServlet?action=CartID&id=${USER}" class="btn btn-success">Giỏ hàng <span class="badge badge-light">${SL_GIO_HANG}</span></a>
                    </c:when>
                </c:choose>
            <!-- Kết thúc tìm kiếm -->
            <!-- Đăng nhập, đăng ký -->
            <c:choose>
                <c:when test="${USERNAME == null && USER == null}">
                    <ul class="nav navbar-nav navbar-right" style="margin-left: 5px">
                        <li>
                            <a class="btn btn-outline-success my-2 my-sm-0" href="login.jsp">Đăng nhập</a>
                        </li>
                        <li>
                            <button type="button" class="btn btn-outline-success my-2 my-sm-0" data-toggle="modal" data-target="#exampleModal" style="margin-left: 5px">Đăng ký</button>
                            <!-- Modal -->
                            <div class="modal fade" id="exampleModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
                                <div class="modal-dialog" role="document">
                                    <div class="modal-content">
                                        <div class="modal-header">
                                            <h5 class="modal-title" id="exampleModalLabel">ĐĂNG KÝ</h5>
                                            <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                                                <span aria-hidden="true">&times;</span>
                                            </button>
                                        </div>
                                        <div class="modal-body">
                                            <form name="fm" action="AdminServlet" onsubmit="return Submit()">
                                                <div id="thongBao" role="alert"></div>
                                                <div class="form-group">
                                                    <label>Tên đăng nhập</label>
                                                    <input type="text" class="form-control" aria-describedby="Tên truy cập" placeholder="Xin vui lòng nhập tên đăng nhập" name="user">
                                                    <input type="hidden" name="role" value="User">
                                                </div>
                                                <div class="form-group">
                                                    <label>Mật khẩu</label>
                                                    <input type="password" class="form-control" placeholder="Xin vui lòng nhập mật khẩu" name="pass">
                                                </div>
                                                <div class="form-group">
                                                    <label>Xác nhận mật khẩu</label>
                                                    <input type="password" class="form-control" placeholder="Xin vui lòng nhập lại mật khẩu" name="repass">
                                                </div>
                                                <div class="form-group">
                                                    <label>Họ và Tên:</label>
                                                    <input type="text" class="form-control" placeholder="Xin vui lòng nhập họ và tên" name="name">
                                                </div>
                                                <div class="form-group">
                                                    <label>Ngày sinh:</label>
                                                    <input type="date" class="form-control" placeholder="Xin vui lòng chọn ngày tháng năm sinh" name="birthday">
                                                </div>
                                                <div class="form-group">
                                                    <label>Giới tính:</label>
                                                    <label class="mobile-card" data-toggle="buttons">
                                                        <label class="btn btn-outline-success active"><input type="radio" name="gioitinh" value="Nam" checked=""/>Nam </label>
                                                        <label class="btn btn-outline-success"><input type="radio" name="gioitinh" value="Nữ"/>Nữ </label>
                                                    </label>
                                                </div>
                                                <div class="form-group">
                                                    <label>Địa chỉ:</label>
                                                    <input type="text" class="form-control" placeholder="Xin vui lòng nhập địa chỉ" name="address">
                                                </div>
                                                <div class="form-group">
                                                    <label>Số điện thoại:</label>
                                                    <input type="tel" class="form-control" placeholder="Xin vui lòng nhập số điện thoại" name="phone">
                                                </div>
                                                <div class="form-group">
                                                    <label>Email:</label>
                                                    <input type="email" class="form-control" placeholder="Xin vui lòng nhập địa chỉ email" name="mail">
                                                </div>
                                                <button type="button" class="btn btn-secondary" data-dismiss="modal">Đóng</button>
                                                <button type="submit" class="btn btn-primary" name="action" value="dangky">Đăng ký</button>
                                            </form>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </li>
                    </ul>
                </c:when>
                <c:when test="${USERNAME != null}">
                    <ul class="nav navbar-nav navbar-right" style="margin-left: 5px">
                        <li>
                            <a href="admin.jsp" class="btn btn-outline-success my-2 my-sm-0" style="margin-left: 5px">${USERNAME}</a>
                        </li>
                        <li>
                            <form action="LogoutServlet">
                                <button type="submit" class="btn btn-outline-success my-2 my-sm-0" style="margin-left: 5px">Đăng xuất</button>
                            </form>
                        </li>
                    </ul>
                </c:when>
                <c:when test="${USER != null}">
                    <ul class="nav navbar-nav navbar-right" style="margin-left: 5px">
                        <li>
                            <button type="submit" class="btn btn-outline-success my-2 my-sm-0" style="margin-left: 5px">${USER}</button>
                        </li>
                        <li>
                            <form action="LogoutServlet">
                                <button type="submit" class="btn btn-outline-success my-2 my-sm-0" style="margin-left: 5px">Đăng xuất</button>
                            </form>
                        </li>
                    </ul>
                </c:when>
            </c:choose>
            <!-- Kết thúc đăng nhập -->
        </div>
        <!-- Kết thúc thanh menu -->
    </div>
    <script>
        $(document).ready(function () {
            var url = window.location;
            // Will only work if string in href matches with location
            $('ul.nav a[href="' + url + '"]').parent().addClass('active');

            // Will also work for relative and absolute hrefs
            $('ul.nav a').filter(function () {
                return this.href == url;
            }).parent().addClass('active').parent().parent().addClass('active');
        }
        );
    </script>
</nav>
