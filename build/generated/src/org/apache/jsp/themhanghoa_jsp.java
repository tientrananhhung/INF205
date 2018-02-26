package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.text.SimpleDateFormat;
import model.HangHoaDAO;
import model.LoaiHangDAO;

public final class themhanghoa_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_choose;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_otherwise;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_when_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_choose = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_otherwise = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_when_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_c_choose.release();
    _jspx_tagPool_c_otherwise.release();
    _jspx_tagPool_c_when_test.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Thêm hàng hóa</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("        <script src=\"//cdn.ckeditor.com/4.7.3/full/ckeditor.js\"></script>\n");
      out.write("        <link href=\"css/css.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <script src=\"js/myjs.js\" type=\"text/javascript\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
      out.write("\n");
      out.write("        ");
LoaiHangDAO lhDAO = new LoaiHangDAO(); 
      out.write("\n");
      out.write("        ");
HangHoaDAO hhDAO = new HangHoaDAO(); 
      out.write("\n");
      out.write("        ");

            if (session != null) {
                if (session.getAttribute("USERNAME") == null) {
                    response.sendRedirect("login.jsp");
                }
            }
        
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "include/menu-sub.jsp", out, false);
      out.write("\n");
      out.write("            <div class=\"container-fluid\">\n");
      out.write("                <div class=\"col-md-10 title-hanghoa\">\n");
      out.write("                    <h1>Quản lý hàng hoá</h3>\n");
      out.write("                        <a href=\"hanghoa.jsp\" class=\"btn btn-default bt-tool-bar\"><i class=\"fa fa-arrow-left\" aria-hidden=\"true\"></i><span> Trở về</span></a><br/><br/>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-10\">\n");
      out.write("                    <form action=\"ItemServlet\" method=\"get\" enctype=\"multipart/form-data\">\n");
      out.write("                        <div class=\"col-md-6\">\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label><i class=\"glyphicon glyphicon-usd\"></i> Upload ảnh:</label>\n");
      out.write("                                <input type=\"file\" id=\"upAnh\" name=\"upAnh\" accept=\"image/x-png,image/jpeg\"  onchange=\"readURL(this);\"/>\n");
      out.write("                                <img id=\"hienThiAnh\" src=\"images/");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${EDIT_HANGHOA.getLinkAnh()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" alt=\"Ảnh\" style=\"height: 185px; width: auto; border: 1px solid #002752;\"/>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label><i class=\"fa fa-list\"></i> Danh Mục</label>\n");
      out.write("                            <select id=\"\" name=\"idDanhMuc\" class=\"form-control\">\n");
      out.write("                                ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                            </select>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label><i class=\"glyphicon glyphicon-asterisk\"></i> Tên hàng:</label>\n");
      out.write("                            <input id=\"tenHH\" type=\"text\" class=\"form-control\" name=\"tenHH\" placeholder=\"Xin vui lòng nhập tên hàng hóa\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${EDIT_HANGHOA.getTenSP()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" onkeyup=\"ChangeToSlug('tenHH', 'slugHH')\" />\n");
      out.write("                            <input id=\"idHH\" type=\"hidden\" name=\"MaSP\" />\n");
      out.write("                            <input id=\"slugHH\" type=\"hidden\" name=\"slugHH\" />\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label><i class=\"glyphicon glyphicon-sort-by-order\"></i> Số lượng:</label>\n");
      out.write("                            <input id=\"soLuong\" type=\"number\" class=\"form-control\" name=\"soLuong\" placeholder=\"Xin vui lòng điền số lượng nhập\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${EDIT_HANGHOA.getSoLuong()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" />\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label for=\"Gia\"><i class=\"glyphicon glyphicon-usd\"></i> Giá:</label>\n");
      out.write("                            <input id=\"Gia\" type=\"text\" class=\"form-control\" placeholder=\"Xin vui lòng điền số tiền nhập\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${EDIT_HANGHOA.getGia()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" />\n");
      out.write("                            <input id=\"GetValue\" type=\"hidden\" class=\"form-control\" name=\"gia\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${EDIT_HANGHOA.getGia()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" />\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label><i class=\"fa fa-desktop\"></i> Công nghệ màn hình:</label>\n");
      out.write("                            <input id=\"congNgheMH\" type=\"text\" class=\"form-control\" name=\"congNgheMH\" placeholder=\"Xin vui lòng nhập loại công nghệ sử dụng\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${EDIT_HANGHOA.getCongNgheMH()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" />\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label><i class=\"fa fa-television\"></i> Độ phân giải:</label>\n");
      out.write("                            <input id=\"doPhanGiai\" type=\"text\" class=\"form-control\" name=\"doPhanGiai\" placeholder=\"Xin vui lòng nhập độ phân giải màn hình\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${EDIT_HANGHOA.getDoPhanGiai()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" />\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label><i class=\"fa fa-window-restore\"></i> Kích thước màn hình:</label>\n");
      out.write("                            <input id=\"kichThuocMH\" type=\"text\" class=\"form-control\" name=\"kichThuocMH\" placeholder=\"Xin vui lòng nhập kích thước màn hình\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${EDIT_HANGHOA.getKichThuocMH()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" />\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label><i class=\"fa fa-hand-pointer-o\"></i> Mặt cảm ứng:</label>\n");
      out.write("                            <input id=\"matCamUng\" type=\"text\" class=\"form-control\" name=\"matCamUng\" placeholder=\"Xin vui lòng nhập mặt cảm ứng\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${EDIT_HANGHOA.getMatCamUng()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" />\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label><i class=\"fa fa-camera\"></i> Camera Sau:</label>\n");
      out.write("                            <input id=\"camSau\" type=\"text\" class=\"form-control\" name=\"camSau\" placeholder=\"Xin vui lòng nhập độ phân giải camera sau\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${EDIT_HANGHOA.getCamSau()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" />\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label><i class=\"fa fa-video-camera\"></i> Quay phim chuẩn:</label>\n");
      out.write("                            <input id=\"quayPhim\" type=\"text\" class=\"form-control\" name=\"quayPhim\" placeholder=\"Xin vui lòng nhập công nghệ quay phim\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${EDIT_HANGHOA.getQuayPhim()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" />\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label><i class=\"fa fa-bolt\"></i> Đèn Flash:</label>\n");
      out.write("                            <input id=\"denFlash\" type=\"text\" class=\"form-control\" name=\"denFlash\" placeholder=\"Xin vui lòng nhập thông tin đèn flash\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${EDIT_HANGHOA.getDenFlash()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" />\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label><i class=\"fa fa-camera-retro\"></i> Chụp ảnh nâng cao:</label>\n");
      out.write("                            <input id=\"chupNangCao\" type=\"text\" class=\"form-control\" name=\"chupNangCao\" placeholder=\"Xin vui lòng nhập các chức năng chụp ảnh nâng cao\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${EDIT_HANGHOA.getChupNangCao()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" />\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label><i class=\"fa fa-camera-retro\"></i> Camera Trước:</label>\n");
      out.write("                            <input id=\"camTruoc\" type=\"text\" class=\"form-control\" name=\"camTruoc\" placeholder=\"Xin vui lòng nhập thông tin Camera trước\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${EDIT_HANGHOA.getCamTruoc()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" />\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label><i class=\"fa fa-video-camera\"></i> Video Call:</label>\n");
      out.write("                            <input id=\"videoCall\" type=\"text\" class=\"form-control\" name=\"videoCall\" placeholder=\"Xin vui lòng nhập thông tin Video Call\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${EDIT_HANGHOA.getVideoCall()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" />\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label><i class=\"fa fa-info\"></i> Thông tin thêm:</label>\n");
      out.write("                            <input id=\"infoThem\" type=\"text\" class=\"form-control\" name=\"infoThem\" placeholder=\"Xin vui lòng nhập các thông tin thêm\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${EDIT_HANGHOA.getInfoThem()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" />\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label><i class=\"fa fa-android\"></i> Hệ điều hành:</label>\n");
      out.write("                            <input id=\"HDH\" type=\"text\" class=\"form-control\" name=\"HDH\" placeholder=\"Xin vui lòng nhập thông tin hệ điều hành\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${EDIT_HANGHOA.getHDH()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" />\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label><i class=\"fa fa-info-circle\"></i> Chipset:</label>\n");
      out.write("                            <input id=\"chipset\" type=\"text\" class=\"form-control\" name=\"chipset\" placeholder=\"Xin vui lòng nhập thông tin chipset\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${EDIT_HANGHOA.getChip()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" />\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label><i class=\"fa fa-info-circle\"></i> Tốc độ CPU:</label>\n");
      out.write("                            <input id=\"cpu\" type=\"text\" class=\"form-control\" name=\"cpu\" placeholder=\"Xin vui lòng nhập thông tin cpu\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${EDIT_HANGHOA.getTocDoCPU()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" />\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <!--Hết bên trái-->\n");
      out.write("\n");
      out.write("                    <div class=\"col-md-6\">\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label><i class=\"glyphicon glyphicon-usd\"></i> Upload ảnh bìa:</label>\n");
      out.write("                            <input type=\"file\" id=\"upAnhBia\" name=\"upAnhBia\" value=\"\" accept=\"image/x-png,image/jpeg\"  onchange=\"readURL1(this);\"/>\n");
      out.write("                            <img id=\"hienThiAnh1\" src=\"images/");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${EDIT_HANGHOA.getLinkAnhBia()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" alt=\"Ảnh\" style=\"height: 185px; width: 400px; border: 1px solid #002752;\"/>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label><i class=\"fa fa-info-circle\"></i> Chip Đồ Hoạ:</label>\n");
      out.write("                            <input id=\"chipDoHoa\" type=\"text\" class=\"form-control\" name=\"chipDoHoa\" placeholder=\"Xin vui lòng nhập thông tin chíp đồ hoạ\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${EDIT_HANGHOA.getChipDoHoa()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" />\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label><i class=\"fa fa-info-circle\"></i> RAM:</label>\n");
      out.write("                            <input id=\"RAM\" type=\"text\" class=\"form-control\" name=\"RAM\" placeholder=\"Xin vui lòng nhập thông số RAM\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${EDIT_HANGHOA.getRAM()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" />\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label><i class=\"fa fa-info-circle\"></i> Bộ nhớ trong:</label>\n");
      out.write("                            <input id=\"boNhoTrong\" type=\"text\" class=\"form-control\" name=\"boNhoTrong\" placeholder=\"Xin vui lòng nhập thông tin bộ nhớ trong\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${EDIT_HANGHOA.getBoNhoTrong()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" />\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label><i class=\"fa fa-info-circle\"></i> Wifi:</label>\n");
      out.write("                            <input id=\"wifi\" type=\"text\" class=\"form-control\" name=\"wifi\" placeholder=\"Xin vui lòng nhập thông tin wifi\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${EDIT_HANGHOA.getWifi()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" />\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label><i class=\"fa fa-info-circle\"></i> Bluetooth:</label>\n");
      out.write("                            <input id=\"bluetooth\" type=\"text\" class=\"form-control\" name=\"bluetooth\" placeholder=\"Xin vui lòng nhập thông tin Bluetooth\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${EDIT_HANGHOA.getBluetooth()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" />\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label><i class=\"fa fa-info-circle\"></i> Cổng kết nối:</label>\n");
      out.write("                            <input id=\"congKetNoi\" type=\"text\" class=\"form-control\" name=\"congKetNoi\" placeholder=\"Xin vui lòng nhập thông tin cổng kết nối\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${EDIT_HANGHOA.getCongKetNoi()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" />\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label><i class=\"fa fa-info-circle\"></i> Kết nối khác:</label>\n");
      out.write("                            <input id=\"ketNoiKhac\" type=\"text\" class=\"form-control\" name=\"ketNoiKhac\" placeholder=\"Xin vui lòng nhập thông tin kết nối khác\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${EDIT_HANGHOA.getKetNoiKhac()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" />\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label><i class=\"fa fa-info-circle\"></i> Thiết kế:</label>\n");
      out.write("                            <input id=\"thietKe\" type=\"text\" class=\"form-control\" name=\"thietKe\" placeholder=\"Xin vui lòng nhập thông tin thiết kế\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${EDIT_HANGHOA.getThietKe()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" />\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label><i class=\"fa fa-info-circle\"></i> Chất liệu:</label>\n");
      out.write("                            <input id=\"chatLieu\" type=\"text\" class=\"form-control\" name=\"chatLieu\" placeholder=\"Xin vui lòng nhập chất liệu sản phẩm\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${EDIT_HANGHOA.getChatLieu()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" />\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label><i class=\"fa fa-info-circle\"></i> Kích thước máy:</label>\n");
      out.write("                            <input id=\"kichThuocMay\" type=\"text\" class=\"form-control\" name=\"kichThuocMay\" placeholder=\"Xin vui lòng nhập thông tin kích thước máy\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${EDIT_HANGHOA.getKichThuoc()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" />\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label><i class=\"fa fa-info-circle\"></i> Dung lượng Pin:</label>\n");
      out.write("                            <input id=\"dungLuongPin\" type=\"text\" class=\"form-control\" name=\"dungLuongPin\" placeholder=\"Xin vui lòng nhập thông tin dung lượng pin\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${EDIT_HANGHOA.getDLPin()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" />\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label><i class=\"fa fa-info-circle\"></i> Loại Pin:</label>\n");
      out.write("                            <input id=\"loaiPin\" type=\"text\" class=\"form-control\" name=\"loaiPin\" placeholder=\"Xin vui lòng nhập thông tin về pin\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${EDIT_HANGHOA.getLoaiPin()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" />\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label><i class=\"fa fa-info-circle\"></i> Công nghệ Pin:</label>\n");
      out.write("                            <input id=\"CNPin\" type=\"text\" class=\"form-control\" name=\"CNPin\" placeholder=\"Xin vui lòng nhập thông tin về công nghệ Pin\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${EDIT_HANGHOA.getCongNghePin()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" />\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label><i class=\"fa fa-info-circle\"></i> Bảo mật nâng cao:</label>\n");
      out.write("                            <input id=\"baoMatNC\" type=\"text\" class=\"form-control\" name=\"baoMatNC\" placeholder=\"Xin vui lòng nhập thông tin về bảo mật nâng cao\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${EDIT_HANGHOA.getBaoMatNC()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" />\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label><i class=\"fa fa-info-circle\"></i> Tính năng đặc biệt:</label>\n");
      out.write("                            <input id=\"tinhNangDacBiet\" type=\"text\" class=\"form-control\" name=\"tinhNangDacBiet\" placeholder=\"Xin vui lòng nhập các tính năng đặc biệt của sản phẩm\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${EDIT_HANGHOA.getTinhNangNew()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" />\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label><i class=\"fa fa-info-circle\"></i> Ngày ra mắt:</label>\n");
      out.write("                            <input id=\"ngayRaMat\" type=\"date\" class=\"form-control\" name=\"ngayRaMat\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${GET_NGAY}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" />\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label><i class=\"fa fa-info-circle\"></i> Công nghệ âm thanh:</label>\n");
      out.write("                            <input id=\"CNAmThanh\" type=\"text\" class=\"form-control\" name=\"CNAmThanh\" placeholder=\"Xin vui lòng nhập công nghệ âm thanh\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${EDIT_HANGHOA.getCNAmThanh()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" />\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label><i class=\"fa fa-info-circle\"></i> Trọng lượng:</label>\n");
      out.write("                            <input id=\"trongLuong\" type=\"text\" class=\"form-control\" name=\"trongLuong\" placeholder=\"Xin vui lòng nhập trọng lượng của sản phẩm\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${EDIT_HANGHOA.getTrongLuong()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" />\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\" data-toggle=\"buttons\">\n");
      out.write("                            <label><i class=\"fa fa-info-circle\"></i> Ưu đãi:</label>\n");
      out.write("                            ");
      if (_jspx_meth_c_choose_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <!--Hết bên phải-->\n");
      out.write("                    <div class=\"col-md-12\">\n");
      out.write("                        <textarea name=\"chuThich\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${EDIT_HANGHOA.getChuThich()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</textarea>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-md-12\">\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <button type=\"submit\" class=\"btn btn-primary\" name=\"action\" value=\"Add\">Thêm sản phẩm</button>\n");
      out.write("                            <button type=\"submit\" class=\"btn btn-success\" name=\"action\" value=\"Update\">Cập nhật</button>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <script>\n");
      out.write("            var editor = CKEDITOR.replace('chuThich');\n");
      out.write("            function readURL(input) {\n");
      out.write("                if (input.files && input.files[0]) {\n");
      out.write("                    var reader = new FileReader();\n");
      out.write("\n");
      out.write("                    reader.onload = function (e) {\n");
      out.write("                        document.getElementById('hienThiAnh').src = e.target.result;\n");
      out.write("                    }\n");
      out.write("\n");
      out.write("                    reader.readAsDataURL(input.files[0]);\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("            function readURL1(input) {\n");
      out.write("                if (input.files && input.files[0]) {\n");
      out.write("                    var reader = new FileReader();\n");
      out.write("\n");
      out.write("                    reader.onload = function (e) {\n");
      out.write("                        document.getElementById('hienThiAnh1').src = e.target.result;\n");
      out.write("                    }\n");
      out.write("\n");
      out.write("                    reader.readAsDataURL(input.files[0]);\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${LIST_LOAIHANG}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("loaihang");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                    <option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${loaihang.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write(' ');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${loaihang.id == EDIT_HANGHOA.getMaLoaiSP().getId() ? 'selected =\"selected\"' : '' }", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${loaihang.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</option>\n");
          out.write("                                ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }

  private boolean _jspx_meth_c_choose_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_0 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _jspx_tagPool_c_choose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_choose_0.setPageContext(_jspx_page_context);
    _jspx_th_c_choose_0.setParent(null);
    int _jspx_eval_c_choose_0 = _jspx_th_c_choose_0.doStartTag();
    if (_jspx_eval_c_choose_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                ");
        if (_jspx_meth_c_when_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                                ");
        if (_jspx_meth_c_when_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                                ");
        if (_jspx_meth_c_otherwise_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                            ");
        int evalDoAfterBody = _jspx_th_c_choose_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_choose_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_0);
      return true;
    }
    _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_0);
    return false;
  }

  private boolean _jspx_meth_c_when_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_0 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_0.setPageContext(_jspx_page_context);
    _jspx_th_c_when_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
    _jspx_th_c_when_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${EDIT_HANGHOA.getTrangThai() == 'new'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_0 = _jspx_th_c_when_0.doStartTag();
    if (_jspx_eval_c_when_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                    <label class=\"btn btn-success\">\n");
        out.write("                                        <input type=\"radio\" name=\"trangThai\" value=\"installment\"/>Trả góp 0%\n");
        out.write("                                    </label>\n");
        out.write("                                    <label class=\"btn btn-success\">\n");
        out.write("                                        <input type=\"radio\" name=\"trangThai\" value=\"shockprice\" />Giá rẻ Online\n");
        out.write("                                    </label>\n");
        out.write("                                    <label class=\"btn btn-success active\">\n");
        out.write("                                        <input type=\"radio\" name=\"trangThai\" value=\"new\"/>Mới ra mắt\n");
        out.write("                                    </label>\n");
        out.write("                                ");
        int evalDoAfterBody = _jspx_th_c_when_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_0);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_0);
    return false;
  }

  private boolean _jspx_meth_c_when_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_1 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_1.setPageContext(_jspx_page_context);
    _jspx_th_c_when_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
    _jspx_th_c_when_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${EDIT_HANGHOA.getTrangThai() == 'shockprice'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_1 = _jspx_th_c_when_1.doStartTag();
    if (_jspx_eval_c_when_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                    <label class=\"btn btn-success\">\n");
        out.write("                                        <input type=\"radio\" name=\"trangThai\" value=\"installment\"/>Trả góp 0%\n");
        out.write("                                    </label>\n");
        out.write("                                    <label class=\"btn btn-success active\">\n");
        out.write("                                        <input type=\"radio\" name=\"trangThai\" value=\"shockprice\" />Giá rẻ Online\n");
        out.write("                                    </label>\n");
        out.write("                                    <label class=\"btn btn-success\">\n");
        out.write("                                        <input type=\"radio\" name=\"trangThai\" value=\"new\"/>Mới ra mắt\n");
        out.write("                                    </label>\n");
        out.write("                                ");
        int evalDoAfterBody = _jspx_th_c_when_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_1);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_1);
    return false;
  }

  private boolean _jspx_meth_c_otherwise_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_otherwise_0 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _jspx_tagPool_c_otherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    _jspx_th_c_otherwise_0.setPageContext(_jspx_page_context);
    _jspx_th_c_otherwise_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
    int _jspx_eval_c_otherwise_0 = _jspx_th_c_otherwise_0.doStartTag();
    if (_jspx_eval_c_otherwise_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                    <label class=\"btn btn-success active\">\n");
        out.write("                                        <input type=\"radio\" name=\"trangThai\" value=\"installment\"/>Trả góp 0%\n");
        out.write("                                    </label>\n");
        out.write("                                    <label class=\"btn btn-success\">\n");
        out.write("                                        <input type=\"radio\" name=\"trangThai\" value=\"shockprice\" />Giá rẻ Online\n");
        out.write("                                    </label>\n");
        out.write("                                    <label class=\"btn btn-success\">\n");
        out.write("                                        <input type=\"radio\" name=\"trangThai\" value=\"new\"/>Mới ra mắt\n");
        out.write("                                    </label>\n");
        out.write("                                ");
        int evalDoAfterBody = _jspx_th_c_otherwise_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_otherwise_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_0);
      return true;
    }
    _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_0);
    return false;
  }
}
