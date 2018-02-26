<%-- 
    Document   : themhanghoa
    Created on : Oct 2, 2017, 11:01:02 AM
    Author     : Tien
--%>

<%@page import="java.text.SimpleDateFormat"%>
<%@page import="model.HangHoaDAO"%>
<%@page import="model.LoaiHangDAO"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Thêm hàng hóa</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        <script src="//cdn.ckeditor.com/4.7.3/full/ckeditor.js"></script>
        <link href="css/css.css" rel="stylesheet" type="text/css"/>
        <script src="js/myjs.js" type="text/javascript"></script>
    </head>
    <body>
        <%SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");%>
        <%LoaiHangDAO lhDAO = new LoaiHangDAO(); %>
        <%HangHoaDAO hhDAO = new HangHoaDAO(); %>
        <%
            if (session != null) {
                if (session.getAttribute("USERNAME") == null) {
                    response.sendRedirect("login.jsp");
                }
            }
        %>
        <jsp:include page="include/menu-sub.jsp"></jsp:include>
            <div class="container-fluid">
                <div class="col-md-10 title-hanghoa">
                    <h1>Quản lý hàng hoá</h3>
                        <a href="hanghoa.jsp" class="btn btn-default bt-tool-bar"><i class="fa fa-arrow-left" aria-hidden="true"></i><span> Trở về</span></a><br/><br/>
                </div>
                <div class="col-md-10">
                    <form action="ItemServlet" method="post" enctype="multipart/form-data">
                        <div class="col-md-6">
                            <div class="form-group">
                                <label><i class="glyphicon glyphicon-usd"></i> Upload ảnh:</label>
                                <input type="file" id="upAnh" name="upAnh" accept="image/x-png,image/jpeg"  onchange="readURL(this);"/>
                                <img id="hienThiAnh" src="images/${EDIT_HANGHOA.getLinkAnh()}" alt="Ảnh" style="height: 185px; width: auto; border: 1px solid #002752;"/>
                        </div>
                        <div class="form-group">
                            <label><i class="fa fa-list"></i> Danh Mục</label>
                            <select id="" name="idDanhMuc" class="form-control">
                                <c:forEach items="${LIST_LOAIHANG}" var="loaihang">
                                    <option value="${loaihang.id}" ${loaihang.id == EDIT_HANGHOA.getMaLoaiSP().getId() ? 'selected ="selected"' : '' }>${loaihang.name}</option>
                                </c:forEach>
                            </select>
                        </div>
                        <div class="form-group">
                            <label><i class="glyphicon glyphicon-asterisk"></i> Tên hàng:</label>
                            <input id="tenHH" type="text" class="form-control" name="tenHH" placeholder="Xin vui lòng nhập tên hàng hóa" value="${EDIT_HANGHOA.getTenSP()}" onkeyup="ChangeToSlug('tenHH', 'slugHH')" />
                            <input id="idHH" type="hidden" name="MaSP" value="${EDIT_HANGHOA.getMaSP()}"/>
                            <input id="slugHH" type="hidden" name="slugHH" />
                        </div>
                        <div class="form-group">
                            <label><i class="glyphicon glyphicon-sort-by-order"></i> Số lượng:</label>
                            <input id="soLuong" type="number" class="form-control" name="soLuong" placeholder="Xin vui lòng điền số lượng nhập" value="${EDIT_HANGHOA.getSoLuong()}" />
                        </div>
                        <div class="form-group">
                            <label for="Gia"><i class="glyphicon glyphicon-usd"></i> Giá:</label>
                            <input id="Gia" type="text" class="form-control" placeholder="Xin vui lòng điền số tiền nhập" value="${EDIT_HANGHOA.getGia()}" />
                            <input id="GetValue" type="hidden" class="form-control" name="gia" value="${EDIT_HANGHOA.getGia()}" />
                        </div>
                        <div class="form-group">
                            <label><i class="fa fa-desktop"></i> Công nghệ màn hình:</label>
                            <input id="congNgheMH" type="text" class="form-control" name="congNgheMH" placeholder="Xin vui lòng nhập loại công nghệ sử dụng" value="${EDIT_HANGHOA.getCongNgheMH()}" />
                        </div>
                        <div class="form-group">
                            <label><i class="fa fa-television"></i> Độ phân giải:</label>
                            <input id="doPhanGiai" type="text" class="form-control" name="doPhanGiai" placeholder="Xin vui lòng nhập độ phân giải màn hình" value="${EDIT_HANGHOA.getDoPhanGiai()}" />
                        </div>
                        <div class="form-group">
                            <label><i class="fa fa-window-restore"></i> Kích thước màn hình:</label>
                            <input id="kichThuocMH" type="text" class="form-control" name="kichThuocMH" placeholder="Xin vui lòng nhập kích thước màn hình" value="${EDIT_HANGHOA.getKichThuocMH()}" />
                        </div>
                        <div class="form-group">
                            <label><i class="fa fa-hand-pointer-o"></i> Mặt cảm ứng:</label>
                            <input id="matCamUng" type="text" class="form-control" name="matCamUng" placeholder="Xin vui lòng nhập mặt cảm ứng" value="${EDIT_HANGHOA.getMatCamUng()}" />
                        </div>
                        <div class="form-group">
                            <label><i class="fa fa-camera"></i> Camera Sau:</label>
                            <input id="camSau" type="text" class="form-control" name="camSau" placeholder="Xin vui lòng nhập độ phân giải camera sau" value="${EDIT_HANGHOA.getCamSau()}" />
                        </div>
                        <div class="form-group">
                            <label><i class="fa fa-video-camera"></i> Quay phim chuẩn:</label>
                            <input id="quayPhim" type="text" class="form-control" name="quayPhim" placeholder="Xin vui lòng nhập công nghệ quay phim" value="${EDIT_HANGHOA.getQuayPhim()}" />
                        </div>
                        <div class="form-group">
                            <label><i class="fa fa-bolt"></i> Đèn Flash:</label>
                            <input id="denFlash" type="text" class="form-control" name="denFlash" placeholder="Xin vui lòng nhập thông tin đèn flash" value="${EDIT_HANGHOA.getDenFlash()}" />
                        </div>
                        <div class="form-group">
                            <label><i class="fa fa-camera-retro"></i> Chụp ảnh nâng cao:</label>
                            <input id="chupNangCao" type="text" class="form-control" name="chupNangCao" placeholder="Xin vui lòng nhập các chức năng chụp ảnh nâng cao" value="${EDIT_HANGHOA.getChupNangCao()}" />
                        </div>
                        <div class="form-group">
                            <label><i class="fa fa-camera-retro"></i> Camera Trước:</label>
                            <input id="camTruoc" type="text" class="form-control" name="camTruoc" placeholder="Xin vui lòng nhập thông tin Camera trước" value="${EDIT_HANGHOA.getCamTruoc()}" />
                        </div>
                        <div class="form-group">
                            <label><i class="fa fa-video-camera"></i> Video Call:</label>
                            <input id="videoCall" type="text" class="form-control" name="videoCall" placeholder="Xin vui lòng nhập thông tin Video Call" value="${EDIT_HANGHOA.getVideoCall()}" />
                        </div>
                        <div class="form-group">
                            <label><i class="fa fa-info"></i> Thông tin thêm:</label>
                            <input id="infoThem" type="text" class="form-control" name="infoThem" placeholder="Xin vui lòng nhập các thông tin thêm" value="${EDIT_HANGHOA.getInfoThem()}" />
                        </div>
                        <div class="form-group">
                            <label><i class="fa fa-android"></i> Hệ điều hành:</label>
                            <input id="HDH" type="text" class="form-control" name="HDH" placeholder="Xin vui lòng nhập thông tin hệ điều hành" value="${EDIT_HANGHOA.getHDH()}" />
                        </div>
                        <div class="form-group">
                            <label><i class="fa fa-info-circle"></i> Chipset:</label>
                            <input id="chipset" type="text" class="form-control" name="chipset" placeholder="Xin vui lòng nhập thông tin chipset" value="${EDIT_HANGHOA.getChip()}" />
                        </div>
                        <div class="form-group">
                            <label><i class="fa fa-info-circle"></i> Tốc độ CPU:</label>
                            <input id="cpu" type="text" class="form-control" name="cpu" placeholder="Xin vui lòng nhập thông tin cpu" value="${EDIT_HANGHOA.getTocDoCPU()}" />
                        </div>
                    </div>
                    <!--Hết bên trái-->

                    <div class="col-md-6">
                        <div class="form-group">
                            <label><i class="glyphicon glyphicon-usd"></i> Upload ảnh bìa:</label>
                            <input type="file" id="upAnhBia" name="upAnhBia" value="" accept="image/x-png,image/jpeg"  onchange="readURL1(this);"/>
                            <img id="hienThiAnh1" src="images/${EDIT_HANGHOA.getLinkAnhBia()}" alt="Ảnh" style="height: 185px; width: 400px; border: 1px solid #002752;"/>
                        </div>
                        <div class="form-group">
                            <label><i class="fa fa-info-circle"></i> Chip Đồ Hoạ:</label>
                            <input id="chipDoHoa" type="text" class="form-control" name="chipDoHoa" placeholder="Xin vui lòng nhập thông tin chíp đồ hoạ" value="${EDIT_HANGHOA.getChipDoHoa()}" />
                        </div>
                        <div class="form-group">
                            <label><i class="fa fa-info-circle"></i> RAM:</label>
                            <input id="RAM" type="text" class="form-control" name="RAM" placeholder="Xin vui lòng nhập thông số RAM" value="${EDIT_HANGHOA.getRAM()}" />
                        </div>
                        <div class="form-group">
                            <label><i class="fa fa-info-circle"></i> Bộ nhớ trong:</label>
                            <input id="boNhoTrong" type="text" class="form-control" name="boNhoTrong" placeholder="Xin vui lòng nhập thông tin bộ nhớ trong" value="${EDIT_HANGHOA.getBoNhoTrong()}" />
                        </div>
                        <div class="form-group">
                            <label><i class="fa fa-info-circle"></i> Wifi:</label>
                            <input id="wifi" type="text" class="form-control" name="wifi" placeholder="Xin vui lòng nhập thông tin wifi" value="${EDIT_HANGHOA.getWifi()}" />
                        </div>
                        <div class="form-group">
                            <label><i class="fa fa-info-circle"></i> Bluetooth:</label>
                            <input id="bluetooth" type="text" class="form-control" name="bluetooth" placeholder="Xin vui lòng nhập thông tin Bluetooth" value="${EDIT_HANGHOA.getBluetooth()}" />
                        </div>
                        <div class="form-group">
                            <label><i class="fa fa-info-circle"></i> Cổng kết nối:</label>
                            <input id="congKetNoi" type="text" class="form-control" name="congKetNoi" placeholder="Xin vui lòng nhập thông tin cổng kết nối" value="${EDIT_HANGHOA.getCongKetNoi()}" />
                        </div>
                        <div class="form-group">
                            <label><i class="fa fa-info-circle"></i> Kết nối khác:</label>
                            <input id="ketNoiKhac" type="text" class="form-control" name="ketNoiKhac" placeholder="Xin vui lòng nhập thông tin kết nối khác" value="${EDIT_HANGHOA.getKetNoiKhac()}" />
                        </div>
                        <div class="form-group">
                            <label><i class="fa fa-info-circle"></i> Thiết kế:</label>
                            <input id="thietKe" type="text" class="form-control" name="thietKe" placeholder="Xin vui lòng nhập thông tin thiết kế" value="${EDIT_HANGHOA.getThietKe()}" />
                        </div>
                        <div class="form-group">
                            <label><i class="fa fa-info-circle"></i> Chất liệu:</label>
                            <input id="chatLieu" type="text" class="form-control" name="chatLieu" placeholder="Xin vui lòng nhập chất liệu sản phẩm" value="${EDIT_HANGHOA.getChatLieu()}" />
                        </div>
                        <div class="form-group">
                            <label><i class="fa fa-info-circle"></i> Kích thước máy:</label>
                            <input id="kichThuocMay" type="text" class="form-control" name="kichThuocMay" placeholder="Xin vui lòng nhập thông tin kích thước máy" value="${EDIT_HANGHOA.getKichThuoc()}" />
                        </div>
                        <div class="form-group">
                            <label><i class="fa fa-info-circle"></i> Dung lượng Pin:</label>
                            <input id="dungLuongPin" type="text" class="form-control" name="dungLuongPin" placeholder="Xin vui lòng nhập thông tin dung lượng pin" value="${EDIT_HANGHOA.getDLPin()}" />
                        </div>
                        <div class="form-group">
                            <label><i class="fa fa-info-circle"></i> Loại Pin:</label>
                            <input id="loaiPin" type="text" class="form-control" name="loaiPin" placeholder="Xin vui lòng nhập thông tin về pin" value="${EDIT_HANGHOA.getLoaiPin()}" />
                        </div>
                        <div class="form-group">
                            <label><i class="fa fa-info-circle"></i> Công nghệ Pin:</label>
                            <input id="CNPin" type="text" class="form-control" name="CNPin" placeholder="Xin vui lòng nhập thông tin về công nghệ Pin" value="${EDIT_HANGHOA.getCongNghePin()}" />
                        </div>
                        <div class="form-group">
                            <label><i class="fa fa-info-circle"></i> Bảo mật nâng cao:</label>
                            <input id="baoMatNC" type="text" class="form-control" name="baoMatNC" placeholder="Xin vui lòng nhập thông tin về bảo mật nâng cao" value="${EDIT_HANGHOA.getBaoMatNC()}" />
                        </div>
                        <div class="form-group">
                            <label><i class="fa fa-info-circle"></i> Tính năng đặc biệt:</label>
                            <input id="tinhNangDacBiet" type="text" class="form-control" name="tinhNangDacBiet" placeholder="Xin vui lòng nhập các tính năng đặc biệt của sản phẩm" value="${EDIT_HANGHOA.getTinhNangNew()}" />
                        </div>
                        <div class="form-group">
                            <label><i class="fa fa-info-circle"></i> Ngày ra mắt:</label>
                            <input id="ngayRaMat" type="date" class="form-control" name="ngayRaMat" value="${GET_NGAY}" />
                        </div>
                        <div class="form-group">
                            <label><i class="fa fa-info-circle"></i> Công nghệ âm thanh:</label>
                            <input id="CNAmThanh" type="text" class="form-control" name="CNAmThanh" placeholder="Xin vui lòng nhập công nghệ âm thanh" value="${EDIT_HANGHOA.getCNAmThanh()}" />
                        </div>
                        <div class="form-group">
                            <label><i class="fa fa-info-circle"></i> Trọng lượng:</label>
                            <input id="trongLuong" type="text" class="form-control" name="trongLuong" placeholder="Xin vui lòng nhập trọng lượng của sản phẩm" value="${EDIT_HANGHOA.getTrongLuong()}" />
                        </div>
                        <div class="form-group" data-toggle="buttons">
                            <label><i class="fa fa-info-circle"></i> Ưu đãi:</label>
                            <c:choose>
                                <c:when test="${EDIT_HANGHOA.getTrangThai() == 'new'}">
                                    <label class="btn btn-success">
                                        <input type="radio" name="trangThai" value="installment"/>Trả góp 0%
                                    </label>
                                    <label class="btn btn-success">
                                        <input type="radio" name="trangThai" value="shockprice" />Giá rẻ Online
                                    </label>
                                    <label class="btn btn-success active">
                                        <input type="radio" name="trangThai" value="new"/>Mới ra mắt
                                    </label>
                                </c:when>
                                <c:when test="${EDIT_HANGHOA.getTrangThai() == 'shockprice'}">
                                    <label class="btn btn-success">
                                        <input type="radio" name="trangThai" value="installment"/>Trả góp 0%
                                    </label>
                                    <label class="btn btn-success active">
                                        <input type="radio" name="trangThai" value="shockprice" />Giá rẻ Online
                                    </label>
                                    <label class="btn btn-success">
                                        <input type="radio" name="trangThai" value="new"/>Mới ra mắt
                                    </label>
                                </c:when>
                                <c:otherwise>
                                    <label class="btn btn-success active">
                                        <input type="radio" name="trangThai" value="installment"/>Trả góp 0%
                                    </label>
                                    <label class="btn btn-success">
                                        <input type="radio" name="trangThai" value="shockprice" />Giá rẻ Online
                                    </label>
                                    <label class="btn btn-success">
                                        <input type="radio" name="trangThai" value="new"/>Mới ra mắt
                                    </label>
                                </c:otherwise>
                            </c:choose>
                        </div>
                    </div>
                    <!--Hết bên phải-->
                    <div class="col-md-12">
                        <textarea name="chuThich">${EDIT_HANGHOA.getChuThich()}</textarea>
                    </div>
                    <div class="col-md-12">
                        <div class="form-group">
                            <button type="submit" class="btn btn-primary" name="action" value="Add">Thêm sản phẩm</button>
                            <button type="submit" class="btn btn-success" name="action" value="Update">Cập nhật</button>
                        </div>
                    </div>
                </form>
            </div>
        </div>
        <script>
            var editor = CKEDITOR.replace('chuThich');
            function readURL(input) {
                if (input.files && input.files[0]) {
                    var reader = new FileReader();

                    reader.onload = function (e) {
                        document.getElementById('hienThiAnh').src = e.target.result;
                    }

                    reader.readAsDataURL(input.files[0]);
                }
            }
            function readURL1(input) {
                if (input.files && input.files[0]) {
                    var reader = new FileReader();

                    reader.onload = function (e) {
                        document.getElementById('hienThiAnh1').src = e.target.result;
                    }

                    reader.readAsDataURL(input.files[0]);
                }
            }
        </script>
    </body>
</html>
