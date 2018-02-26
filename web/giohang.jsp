<%-- 
    Document   : giohang
    Created on : 23-Oct-2017, 21:14:23
    Author     : Tien Tran
--%>

<%@page import="java.text.DecimalFormat"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="model.GioHangDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
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
    <% DecimalFormat formatter = new DecimalFormat("###,###,###"); %>
    <body>
        <%
            if (session != null) {
                if (session.getAttribute("USERNAME") == null && session.getAttribute("USER") == null) {
                    response.sendRedirect("login.jsp");
                }
            }
        %>
        <%GioHangDAO ghDAO = new GioHangDAO();%>
        <jsp:include page="include/menu.jsp"></jsp:include>
            <br><br>
            <div class="container" style="min-height: 700px;">
                <div class="row">
                    <div class="col-md-12" style="text-align: center; background: #212529;padding: 10px;color: white;margin-bottom: 30px;"><h3>Chào mừng đến với website tientahpd01815. Chúc bạn kiếm được món đồ ưng ý.</h3></div>
                </div>
                <div class="row" style="border-bottom: 1px solid rgba(108, 117, 125, 0.45);">
                    <div class="col-md-4">SẢN PHẨM</div>
                    <div class="col-md-2">ĐƠN GIÁ</div>
                    <div class="col-md-2">SỐ LƯỢNG</div>
                    <div class="col-md-2">SỐ TIỀN</div>
                    <div class="col-md-2">THAO TÁC</div>
                </div>


            <c:forEach items="${GIO_HANG}" var="a">
                <form action="DelItemsServlet">
                    <div class="row" style="margin-top: 20px;border-bottom: 1px solid rgba(108, 117, 125, 0.45);padding: 10px 0; background: rgba(0, 0, 0, 0.07);">
                        <div class="col-md-1" style="width: 50px;height: 50px;">
                            <img src="images/${a.get(3)}" alt="" style="width: 100%;height: 100%;">
                        </div>
                        <div class="col-md-3">
                            <a href="#">${a.get(2)}</a>
                            <input type="hidden" value="${a.get(1)}" name="MaSP" />
                        </div>
                        <div class="col-md-2">
                            ${a.get(4)}
                            <input type="hidden" value="${a.get(0)}" name="id" />
                        </div>
                        <div class="col-md-2">
                            <div class="bt-up-down"><button type="submit" class="bt-up btn btn-dark" name="action" value="CartUp">+</button><input type="text" value="${a.get(5)}" name="soLuong" /><button type="submit" class="btn btn-dark" name="action" value="CartDown">-</button></div>
                        </div>
                        <div class="col-md-2" style="color: #ff5200;" id="tongTien">${a.get(6)}</div>
                        <div class="col-md-2">
                            <button type="submit" class="delGH" name="action" value="DelGH"><span class="fa fa-trash" title="Xoá sản phẩm khỏi giỏ hàng"></span></button>
                        </div>
                    </div>
                </form>
            </c:forEach>

            <div class="row" style="background: rgba(0, 0, 0, 0.07);margin-top: 50px;padding-bottom: 30px;">
                <div class="col-md-8" style="text-align: center;margin-top: 30px;">
                    <h3>Tổng tiền hàng (${TONG_HANG} sản phẩm):</h3>
                    <p>Tổng giá: ${TONG_TIEN}đ</p>
                    <span>Lựa chọn giảm giá có thể được tìm thấy ở trang Thanh Toán</span>
                </div>
                <div class="col-md-4" style="text-align: center;margin-top: 30px;">
                    <c:choose>
                        <c:when test="${USERNAME != null}">
                            <a href="DelItemsServlet?action=CartPay&id=${USERNAME}&tt=${TONG_TIEN1}" class="btn btn-primary" style="font-size: 40px;">Mua hàng</a>
                        </c:when>
                        <c:when test="${USER != null}">
                            <a href="DelItemsServlet?action=CartPay&id=${USER}&tt=${TONG_TIEN1}" class="btn btn-primary" style="font-size: 40px;">Mua hàng</a>
                        </c:when>
                    </c:choose>
                </div>
            </div>
        </div>
        <jsp:include page="include/footer.jsp"></jsp:include>
    </body>
</html>
