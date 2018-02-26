<%-- 
    Document   : sanpham
    Created on : 23-Oct-2017, 17:27:27
    Author     : Tien Tran
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="java.text.DecimalFormat"%>
<%@page import="model.HangHoaDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%HangHoaDAO hhDAO = new HangHoaDAO();%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>${SAN_PHAM_CT.getTenSP()} - tientahpd01815</title>
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
        <jsp:include page="include/menu.jsp"></jsp:include><br/>
            <div class="container san-pham">
                <h2>Điện thoại ${SAN_PHAM_CT.getTenSP()}</h2>
            <hr/>
            <div class="row">
                <div class="col-md-6 anh-san-pham">
                    <img src="images/${SAN_PHAM_CT.getLinkAnh()}" alt="" style="width: 400px; max-height: 460px; height: 460px; border-radius: 5px;">
                </div>
                <div class="col-md-6 gia-ban-san-pham">
                    <h4>${GIA_SAN_PHAM_CT}<span>đ</span></h4>
                    <!-- Giá sản phẩm -->
                    <table border="1" class="bang-khuyen-mai">
                        <tr>
                            <td><b>3 KHUYẾN MÃI ÁP DỤNG ĐẾN 31/10</b></td>
                        </tr>
                        <tr>
                            <td>
                                <ul>
                                    <li>Áo khoác (Nếu không có quà sẽ hoàn 100,000đ)</li>
                                    <li>Cơ hội trúng xe Honda SH150i (chỉ áp dụng 1 số tỉnh)</li>
                                    <li>Trả góp 0% qua thẻ tín dụng</li>
                                </ul>
                            </td>
                        </tr>
                    </table>
                    <!-- Khuyến mãi -->
                    <c:choose>
                        <c:when test="${USERNAME == null && USER == null}">
                            <a href="login.jsp" class="btn btn-danger" style="margin: 15px 0;">Thêm vào giỏ hàng</a>
                        </c:when>
                        <c:when test="${USERNAME != null}">
                            <a href="DelItemsServlet?action=Cart&MaSP=${SAN_PHAM_CT.getMaSP()}&id=${USERNAME}" class="btn btn-danger" style="margin: 15px 0;">Thêm vào giỏ hàng</a>
                        </c:when>
                        <c:when test="${USER != null}">
                            <a href="DelItemsServlet?action=Cart&MaSP=${SAN_PHAM_CT.getMaSP()}&id=${USER}" class="btn btn-danger" style="margin: 15px 0;">Thêm vào giỏ hàng</a>
                        </c:when>
                    </c:choose>

                    <div class="ct">
                        <span>Gọi đặt mua: <a href="tel:18001060">1800.1060</a> (Miễn phí).</span> <span><a href="tel:02836221060">028.3622.1060</a> (7:30-22:00)</span>

                        <hr>
                        <ul>
                            <li>Trong hộp có: Sạc, Tai nghe, Sách hướng dẫn, Cáp OTG, Bút cảm ứng, Cáp, Cây lấy sim, Ốp lưng</li>
                            <li>Bảo hành chính hãng: thân máy 12 tháng, pin 12 tháng, sạc 6 tháng, tai nghe 6 tháng</li>
                            <li>Giao hàng tận nơi miễn phí trong 30 phút.</li>
                            <li>1 đổi 1 trong 1 tháng với sản phẩm lỗi.</li>
                        </ul>
                    </div>
                    <!-- Phụ kiện kèm theo -->
                </div>
            </div>
            <hr>
            <!-- Hết header -->
            <div class="row">
                <div class="col-md-8">
                    <div class="thong-tin-san-pham">
                        ${SAN_PHAM_CT.getChuThich()}
                    </div>
                </div>
                <div class="col-md-4 thong-so-ky-thuat">
                    <h3 style="font-size: 20px;">Thông số kỹ thuật</h3>
                    <hr>
                    <div class="row">
                        <div class="col-md-4">
                            <span>Màn hình:</span>
                        </div>
                        <div class="col-md-8">
                            <span>${SAN_PHAM_CT.getCongNgheMH()}</span>
                        </div>
                    </div>
                    <hr>
                    <div class="row">
                        <div class="col-md-4">
                            <span>Hệ điều hành:</span>
                        </div>
                        <div class="col-md-8">
                            <span>${SAN_PHAM_CT.getHDH()}</span>
                        </div>
                    </div>
                    <hr>
                    <div class="row">
                        <div class="col-md-4">
                            <span>Tốc độ CPU:</span>
                        </div>
                        <div class="col-md-8">
                            <span>${SAN_PHAM_CT.getTocDoCPU()}</span>
                        </div>
                    </div>
                    <hr>
                    <div class="row">
                        <div class="col-md-4">
                            <span>Camera sau:</span>
                        </div>
                        <div class="col-md-8">
                            <span>${SAN_PHAM_CT.getCamSau()}</span>P
                        </div>
                    </div>
                    <hr>
                    <div class="row">
                        <div class="col-md-4">
                            <span>Camera trước:</span>
                        </div>
                        <div class="col-md-8">
                            <span>${SAN_PHAM_CT.getCamTruoc()}</span>
                        </div>
                    </div>
                    <hr>
                    <div class="row">
                        <div class="col-md-4">
                            <span>CPU:</span>
                        </div>
                        <div class="col-md-8">
                            <span>${SAN_PHAM_CT.getChip()}</span>
                        </div>
                    </div>
                    <hr>
                    <div class="row">
                        <div class="col-md-4">
                            <span>RAM:</span>
                        </div>
                        <div class="col-md-8">
                            <span>${SAN_PHAM_CT.getRAM()}</span>
                        </div>
                    </div>
                    <hr>
                    <div class="row">
                        <div class="col-md-4">
                            <span>Bộ nhớ trong:</span>
                        </div>
                        <div class="col-md-8">
                            <span>${SAN_PHAM_CT.getBoNhoTrong()}</span>
                        </div>
                    </div>
                    <hr>
                    <div class="row">
                        <div class="col-md-4">
                            <span>Dung lượng pin:</span>
                        </div>
                        <div class="col-md-8">
                            <span>${SAN_PHAM_CT.getDLPin()}</span>
                        </div>
                    </div>
                    <hr>


                    <!-- Large modal -->
                    <button type="button" class="btn btn-outline-info" data-toggle="modal" data-target=".bd-example-modal-lg">Xem cấu hình chi tiết</button><br/><br/><br/>

                    <div class="modal fade bd-example-modal-lg" tabindex="-1" role="dialog" aria-labelledby="myLargeModalLabel" aria-hidden="true">
                        <div class="modal-dialog modal-lg">
                            <div class="modal-content">

                                <div class="modal-header">
                                    <h5 class="modal-title" id="exampleModalLongTitle">Thông số kỹ thuật chi tiết ${SAN_PHAM_CT.getTenSP()}</h5>
                                    <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                                        <span aria-hidden="true">&times;</span>
                                    </button>
                                </div>
                                <!-- Hết thẻ tiêu đề -->
                                <div class="modal-body thong-tin-chi-tiet">

                                    <table style="width: 100%;">
                                        <tr>
                                            <td colspan="2"><h3>Màn hình</h3></td>
                                        </tr>
                                        <tr>
                                            <td>Công nghệ màn hình</td>
                                            <td>${SAN_PHAM_CT.getCongNgheMH()}</td>
                                        </tr>
                                        <tr>
                                            <td>Độ phân giải</td>
                                            <td>${SAN_PHAM_CT.getDoPhanGiai()}</td>
                                        </tr>
                                        <tr>
                                            <td>Màn hình rộng</td>
                                            <td>${SAN_PHAM_CT.getKichThuocMH()}</td>
                                        </tr>
                                        <tr>
                                            <td>Mặt kính cảm ứng</td>
                                            <td>${SAN_PHAM_CT.getMatCamUng()}</td>
                                        </tr>
                                        <tr>
                                            <td colspan="2"><h3>Camera sau</h3></td>
                                        </tr>
                                        <tr>
                                            <td>Độ phân giải</td>
                                            <td>${SAN_PHAM_CT.getCamSau()}</td>
                                        </tr>
                                        <tr>
                                            <td>Quay phim</td>
                                            <td>${SAN_PHAM_CT.getQuayPhim()}</td>
                                        </tr>
                                        <tr>
                                            <td>Đèn Flash</td>
                                            <td>${SAN_PHAM_CT.getDenFlash()}</td>
                                        </tr>
                                        <tr>
                                            <td>Chụp ảnh nâng cao</td>
                                            <td>${SAN_PHAM_CT.getChupNangCao()}</td>
                                        </tr>
                                        <tr>
                                            <td colspan="2"><h3>Camera trước</h3></td>
                                        </tr>
                                        <tr>
                                            <td>Độ phân giải</td>
                                            <td>${SAN_PHAM_CT.getCamTruoc()}</td>
                                        </tr>
                                        <tr>
                                            <td>Videocall</td>
                                            <td>${SAN_PHAM_CT.getVideoCall()}</td>
                                        </tr>
                                        <tr>
                                            <td>Thông tin khác</td>
                                            <td>${SAN_PHAM_CT.getInfoThem()}</td>
                                        </tr>
                                        <tr>
                                            <td colspan="2"><h3>Hệ điều hành - CPU</h3></td>
                                        </tr>
                                        <tr>
                                            <td>Hệ điều hành</td>
                                            <td>${SAN_PHAM_CT.getHDH()}</td>
                                        </tr>
                                        <tr>
                                            <td>Chipset (hãng SX CPU)</td>
                                            <td>${SAN_PHAM_CT.getChip()}</td>
                                        </tr>
                                        <tr>
                                            <td>Tốc độ CPU</td>
                                            <td>${SAN_PHAM_CT.getTocDoCPU()}</td>
                                        </tr>
                                        <tr>
                                            <td>Chip đồ họa (GPU)</td>
                                            <td>${SAN_PHAM_CT.getChipDoHoa()}</td>
                                        </tr>
                                        <tr>
                                            <td colspan="2"><h3>Bộ nhớ & Lưu trữ</h3></td>
                                        </tr>
                                        <tr>
                                            <td>RAM</td>
                                            <td>${SAN_PHAM_CT.getRAM()}</td>
                                        </tr>
                                        <tr>
                                            <td>Bộ nhớ trong</td>
                                            <td>${SAN_PHAM_CT.getBoNhoTrong()}</td>
                                        </tr>
                                        <tr>
                                            <td colspan="2"><h3>Kết nối</h3></td>
                                        </tr>
                                        <tr>
                                            <td>Wifi</td>
                                            <td>${SAN_PHAM_CT.getWifi()}</td>
                                        </tr>
                                        <tr>
                                            <td>Bluetooth</td>
                                            <td>${SAN_PHAM_CT.getBluetooth()}</td>
                                        </tr>
                                        <tr>
                                            <td>Cổng kết nối/sạc</td>
                                            <td>${SAN_PHAM_CT.getCongKetNoi()}</td>
                                        </tr>
                                        <tr>
                                            <td>Kết nối khác</td>
                                            <td>${SAN_PHAM_CT.getKetNoiKhac()}</td>
                                        </tr>
                                        <tr>
                                            <td colspan="2"><h3>Thiết kế & Trọng lượng</h3></td>
                                        </tr>
                                        <tr>
                                            <td>Thiết kế</td>
                                            <td>${SAN_PHAM_CT.getThietKe()}</td>
                                        </tr>
                                        <tr>
                                            <td>Chất liệu</td>
                                            <td>${SAN_PHAM_CT.getChatLieu()}</td>
                                        </tr>
                                        <tr>
                                            <td>Kích thước</td>
                                            <td>${SAN_PHAM_CT.getKichThuoc()}</td>
                                        </tr>
                                        <tr>
                                            <td>Trọng lượng</td>
                                            <td>${SAN_PHAM_CT.getTrongLuong()}</td>
                                        </tr>
                                        <tr>
                                            <td colspan="2"><h3>Thông tin pin & Sạc</h3></td>
                                        </tr>
                                        <tr>
                                            <td>Dung lượng pin</td>
                                            <td>${SAN_PHAM_CT.getDLPin()}</td>
                                        </tr>
                                        <tr>
                                            <td>Loại pin</td>
                                            <td>${SAN_PHAM_CT.getLoaiPin()}</td>
                                        </tr>
                                        <tr>
                                            <td>Công nghệ pin</td>
                                            <td>${SAN_PHAM_CT.getCongNghePin()}</td>
                                        </tr>
                                        <tr>
                                            <td colspan="2"><h3>Tiện ích</h3></td>
                                        </tr>
                                        <tr>
                                            <td>Bảo mật nâng cao</td>
                                            <td>${SAN_PHAM_CT.getBaoMatNC()}</td>
                                        </tr>
                                        <tr>
                                            <td>Tính năng đặc biệt</td>
                                            <td>${SAN_PHAM_CT.getTinhNangNew()}</td>
                                        </tr>
                                        <tr>
                                            <td>Nghe nhạc</td>
                                            <td>${SAN_PHAM_CT.getCNAmThanh()}</td>
                                        </tr>
                                        <tr>
                                            <td>Thời điểm ra mắt</td>
                                            <td>${TG_SAN_PHAM_CT}</td>
                                        </tr>
                                    </table>

                                </div>
                                <!-- Hết thẻ thân -->
                            </div>
                        </div>
                    </div>
                    <!-- Hết button chi tiết -->
                </div>
            </div>
        </div>
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
        <jsp:include page="include/footer.jsp"></jsp:include>
    </body>
</html>
