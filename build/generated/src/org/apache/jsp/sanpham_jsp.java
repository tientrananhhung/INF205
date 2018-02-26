package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class sanpham_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/jquery.scrolltop.min.css\">\n");
      out.write("        <link rel=\"stylesheet\"s href=\"css/bootstrap.css\">\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.2.1.slim.min.js\" integrity=\"sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.11.0/umd/popper.min.js\" integrity=\"sha384-b/U6ypiBEHpOf/4+1nzFpr53nxSS+GLCkfwBdFNTxtclqqenISfwAzpKaMNFNmj4\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"js/bootstrap.js\"></script>\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/css.css\">\n");
      out.write("        <script src=\"js/myjs.js\" type=\"text/javascript\"></script>\n");
      out.write("        <link href=\"css/font-awesome.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "include/menu.jsp", out, false);
      out.write("\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <h2>Điện thoại</h2>\n");
      out.write("            <hr/>\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-6\">\n");
      out.write("                    <img src=\"images/1.png\" alt=\"\" style=\"width: 100%;\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-6\">\n");
      out.write("                    <h4>22.490.000 <span>đ</span></h4>\n");
      out.write("                    <!-- Giá sản phẩm -->\n");
      out.write("                    <table border=\"1\" >\n");
      out.write("                        <tr>\n");
      out.write("                            <td>3 khuyến mãi áp dụng đến 32/10</td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td>\n");
      out.write("                                <ul>\n");
      out.write("                                    <li>Áo khoác (Nếu không có quà sẽ hoàn 100,000đ)</li>\n");
      out.write("                                    <li>Cơ hội trúng xe Honda SH150i (chỉ áp dụng 1 số tỉnh)</li>\n");
      out.write("                                    <li>Trả góp 0% qua thẻ tín dụng</li>\n");
      out.write("                                </ul>\n");
      out.write("                            </td>\n");
      out.write("                        </tr>\n");
      out.write("                    </table>\n");
      out.write("                    <!-- Khuyến mãi -->\n");
      out.write("                    <button>Thêm vào giỏ hàng</button>\n");
      out.write("                    <div class=\"ct\">\n");
      out.write("                        <span>Gọi đặt mua: <a href=\"tel:18001060\">1800.1060</a> (Miễn phí).</span> <span><a href=\"tel:02836221060\">028.3622.1060</a> (7:30-22:00)</span>\n");
      out.write("                    </div>\n");
      out.write("                    <hr>\n");
      out.write("                    <ul>\n");
      out.write("                        <li>Trong hộp có: Sạc, Tai nghe, Sách hướng dẫn, Cáp OTG, Bút cảm ứng, Cáp, Cây lấy sim, Ốp lưng</li>\n");
      out.write("                        <li>Bảo hành chính hãng: thân máy 12 tháng, pin 12 tháng, sạc 6 tháng, tai nghe 6 tháng</li>\n");
      out.write("                        <li>Giao hàng tận nơi miễn phí trong 30 phút.</li>\n");
      out.write("                        <li>1 đổi 1 trong 1 tháng với sản phẩm lỗi.</li>\n");
      out.write("                    </ul>\n");
      out.write("                    <!-- Phụ kiện kèm theo -->\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <hr>\n");
      out.write("            <!-- Hết header -->\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-8\">\n");
      out.write("                    <div class=\"thong-tin-san-pham\">\n");
      out.write("                        <p>Galaxy Note 8 là niềm hy vọng vực lại dòng Note danh tiếng của Samsung với diện mạo nam tính, sang trọng. Trang bị camera kép xóa phông thời thượng, màn hình vô cực như trên S8 Plus, bút Spen với nhiều tính năng mới và nhiều công nghệ được Samsung ưu ái đem lên Note 8.</p>\n");
      out.write("                        <p>Dù được giới thiệu là màn hình lên tới 6.3 inch nhưng thực sự máy khi cầm trên tay rất nhỏ gọn nhờ vào công nghệ \"màn hình vô cực\" tiên tiến nhất hiện nay của Samsung.</p>\n");
      out.write("                        <p>Các cạnh bên máy được làm cong đều khiến mình khi cầm có cảm giác ôm tay rất thoải mái và không hề bị cấn.</p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-4\">\n");
      out.write("                    <h3>Thông số kỹ thuật</h3>\n");
      out.write("                    <hr>\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-md-4\">\n");
      out.write("                            <span>Màn hình:</span>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-md-8\">\n");
      out.write("                            <span>Super AMOLED, 6.3\", Quad HD (2K)</span>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <hr>\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-md-4\">\n");
      out.write("                            <span>Hệ điều hành:</span>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-md-8\">\n");
      out.write("                            <span>Android 7.1</span>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <hr>\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-md-4\">\n");
      out.write("                            <span>Camera sau:</span>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-md-8\">\n");
      out.write("                            <span>2 camera 12 M</span>P\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <hr>\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-md-4\">\n");
      out.write("                            <span>Camera trước:</span>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-md-8\">\n");
      out.write("                            <span>8 MP</span>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <hr>\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-md-4\">\n");
      out.write("                            <span>CPU:</span>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-md-8\">\n");
      out.write("                            <span>Exynos 8895 8 nhân 64-bit</span>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <hr>\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-md-4\">\n");
      out.write("                            <span>RAM:</span>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-md-8\">\n");
      out.write("                            <span>6 GB</span>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <hr>\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-md-4\">\n");
      out.write("                            <span>Bộ nhớ trong:</span>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-md-8\">\n");
      out.write("                            <span>64 GB</span>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <hr>\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-md-4\">\n");
      out.write("                            <span>Thẻ nhớ:</span>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-md-8\">\n");
      out.write("                            <span>MicroSD, hỗ trợ tối đa 256 GB</span>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <hr>\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-md-4\">\n");
      out.write("                            <span>Thẻ SIM:</span>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-md-8\">\n");
      out.write("                            <span>2 Nano SIM, Hỗ trợ 4G</span>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <hr>\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-md-4\">\n");
      out.write("                            <span>Dung lượng pin:</span>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-md-8\">\n");
      out.write("                            <span>3300 mAh, có sạc nhanh</span>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <hr>\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <!-- Large modal -->\n");
      out.write("                    <button type=\"button\" class=\"btn btn-primary\" data-toggle=\"modal\" data-target=\".bd-example-modal-lg\">Xem cấu hình chi tiết</button>\n");
      out.write("\n");
      out.write("                    <div class=\"modal fade bd-example-modal-lg\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"myLargeModalLabel\" aria-hidden=\"true\">\n");
      out.write("                        <div class=\"modal-dialog modal-lg\">\n");
      out.write("                            <div class=\"modal-content\">\n");
      out.write("\n");
      out.write("                                <div class=\"modal-header\">\n");
      out.write("                                    <h5 class=\"modal-title\" id=\"exampleModalLongTitle\">Modal title</h5>\n");
      out.write("                                    <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\">\n");
      out.write("                                        <span aria-hidden=\"true\">&times;</span>\n");
      out.write("                                    </button>\n");
      out.write("                                </div>\n");
      out.write("                                <!-- Hết thẻ tiêu đề -->\n");
      out.write("                                <div class=\"modal-body\">\n");
      out.write("\n");
      out.write("                                    <table border=\"1\" style=\"width: 100%;\">\n");
      out.write("                                        <tr>\n");
      out.write("                                            <td colspan=\"2\"><h3>Màn hình</h3></td>\n");
      out.write("                                        </tr>\n");
      out.write("                                        <tr>\n");
      out.write("                                            <td>Công nghệ màn hình</td>\n");
      out.write("                                            <td>Super AMOLED</td>\n");
      out.write("                                        </tr>\n");
      out.write("                                        <tr>\n");
      out.write("                                            <td>Độ phân giải</td>\n");
      out.write("                                            <td>2K (1440 x 2960 Pixels)</td>\n");
      out.write("                                        </tr>\n");
      out.write("                                        <tr>\n");
      out.write("                                            <td>Màn hình rộng</td>\n");
      out.write("                                            <td>6.3\"</td>\n");
      out.write("                                        </tr>\n");
      out.write("                                        <tr>\n");
      out.write("                                            <td>Mặt kính cảm ứng</td>\n");
      out.write("                                            <td>Corning Gorilla Glass 5</td>\n");
      out.write("                                        </tr>\n");
      out.write("                                        <tr>\n");
      out.write("                                            <td colspan=\"2\"><h3>Camera sau</h3></td>\n");
      out.write("                                        </tr>\n");
      out.write("                                        <tr>\n");
      out.write("                                            <td>Độ phân giải</td>\n");
      out.write("                                            <td>2 camera 12 MP</td>\n");
      out.write("                                        </tr>\n");
      out.write("                                        <tr>\n");
      out.write("                                            <td>Quay phim</td>\n");
      out.write("                                            <td>Quay phim 4K 2160p@30fps</td>\n");
      out.write("                                        </tr>\n");
      out.write("                                        <tr>\n");
      out.write("                                            <td>Đèn Flash</td>\n");
      out.write("                                            <td>Test</td>\n");
      out.write("                                        </tr>\n");
      out.write("                                        <tr>\n");
      out.write("                                            <td>Chụp ảnh nâng cao</td>\n");
      out.write("                                            <td>Test</td>\n");
      out.write("                                        </tr>\n");
      out.write("                                        <tr>\n");
      out.write("                                            <td colspan=\"2\"><h3>Camera trước</h3></td>\n");
      out.write("                                        </tr>\n");
      out.write("                                        <tr>\n");
      out.write("                                            <td>Độ phân giải</td>\n");
      out.write("                                            <td>Test</td>\n");
      out.write("                                        </tr>\n");
      out.write("                                        <tr>\n");
      out.write("                                            <td>Videocall</td>\n");
      out.write("                                            <td>Test</td>\n");
      out.write("                                        </tr>\n");
      out.write("                                        <tr>\n");
      out.write("                                            <td>Thông tin khác</td>\n");
      out.write("                                            <td>Selfie ngược sáng HDR, Camera góc rộng, Chế độ làm đẹp, Nhận diện khuôn mặt, Selfie bằng cử chỉ, Chụp bằng giọng nói</td>\n");
      out.write("                                        </tr>\n");
      out.write("                                        <tr>\n");
      out.write("                                            <td colspan=\"2\"><h3>Hệ điều hành - CPU</h3></td>\n");
      out.write("                                        </tr>\n");
      out.write("                                        <tr>\n");
      out.write("                                            <td>Hệ điều hành</td>\n");
      out.write("                                            <td>Test</td>\n");
      out.write("                                        </tr>\n");
      out.write("                                        <tr>\n");
      out.write("                                            <td>Chipset (hãng SX CPU)</td>\n");
      out.write("                                            <td>Test</td>\n");
      out.write("                                        </tr>\n");
      out.write("                                        <tr>\n");
      out.write("                                            <td>Tốc độ CPU</td>\n");
      out.write("                                            <td>Test</td>\n");
      out.write("                                        </tr>\n");
      out.write("                                        <tr>\n");
      out.write("                                            <td>Chip đồ họa (GPU)</td>\n");
      out.write("                                            <td>Test</td>\n");
      out.write("                                        </tr>\n");
      out.write("                                        <tr>\n");
      out.write("                                            <td colspan=\"2\"><h3>Bộ nhớ & Lưu trữ</h3></td>\n");
      out.write("                                        </tr>\n");
      out.write("                                        <tr>\n");
      out.write("                                            <td>RAM</td>\n");
      out.write("                                            <td>Test</td>\n");
      out.write("                                        </tr>\n");
      out.write("                                        <tr>\n");
      out.write("                                            <td>Bộ nhớ trong</td>\n");
      out.write("                                            <td>Test</td>\n");
      out.write("                                        </tr>\n");
      out.write("                                        <tr>\n");
      out.write("                                            <td colspan=\"2\"><h3>Kết nối</h3></td>\n");
      out.write("                                        </tr>\n");
      out.write("                                        <tr>\n");
      out.write("                                            <td>Wifi</td>\n");
      out.write("                                            <td>Test</td>\n");
      out.write("                                        </tr>\n");
      out.write("                                        <tr>\n");
      out.write("                                            <td>Bluetooth</td>\n");
      out.write("                                            <td>Test</td>\n");
      out.write("                                        </tr>\n");
      out.write("                                        <tr>\n");
      out.write("                                            <td>Cổng kết nối/sạc</td>\n");
      out.write("                                            <td>Test</td>\n");
      out.write("                                        </tr>\n");
      out.write("                                        <tr>\n");
      out.write("                                            <td>Kết nối khác</td>\n");
      out.write("                                            <td>Test</td>\n");
      out.write("                                        </tr>\n");
      out.write("                                        <tr>\n");
      out.write("                                            <td colspan=\"2\"><h3>Thiết kế & Trọng lượng</h3></td>\n");
      out.write("                                        </tr>\n");
      out.write("                                        <tr>\n");
      out.write("                                            <td>Thiết kế</td>\n");
      out.write("                                            <td>Test</td>\n");
      out.write("                                        </tr>\n");
      out.write("                                        <tr>\n");
      out.write("                                            <td>Chất liệu</td>\n");
      out.write("                                            <td>Test</td>\n");
      out.write("                                        </tr>\n");
      out.write("                                        <tr>\n");
      out.write("                                            <td>Kích thước</td>\n");
      out.write("                                            <td>Test</td>\n");
      out.write("                                        </tr>\n");
      out.write("                                        <tr>\n");
      out.write("                                            <td>Trọng lượng</td>\n");
      out.write("                                            <td>Test</td>\n");
      out.write("                                        </tr>\n");
      out.write("                                        <tr>\n");
      out.write("                                            <td colspan=\"2\"><h3>Thông tin pin & Sạc</h3></td>\n");
      out.write("                                        </tr>\n");
      out.write("                                        <tr>\n");
      out.write("                                            <td>Dung lượng pin</td>\n");
      out.write("                                            <td>Test</td>\n");
      out.write("                                        </tr>\n");
      out.write("                                        <tr>\n");
      out.write("                                            <td>Loại pin</td>\n");
      out.write("                                            <td>Test</td>\n");
      out.write("                                        </tr>\n");
      out.write("                                        <tr>\n");
      out.write("                                            <td>Công nghệ pin</td>\n");
      out.write("                                            <td>Test</td>\n");
      out.write("                                        </tr>\n");
      out.write("                                        <tr>\n");
      out.write("                                            <td colspan=\"2\"><h3>Tiện ích</h3></td>\n");
      out.write("                                        </tr>\n");
      out.write("                                        <tr>\n");
      out.write("                                            <td>Bảo mật nâng cao</td>\n");
      out.write("                                            <td>Test</td>\n");
      out.write("                                        </tr>\n");
      out.write("                                        <tr>\n");
      out.write("                                            <td>Tính năng đặc biệt</td>\n");
      out.write("                                            <td>Test</td>\n");
      out.write("                                        </tr>\n");
      out.write("                                        <tr>\n");
      out.write("                                            <td>Nghe nhạc</td>\n");
      out.write("                                            <td>Test</td>\n");
      out.write("                                        </tr>\n");
      out.write("                                        <tr>\n");
      out.write("                                            <td>Thời điểm ra mắt</td>\n");
      out.write("                                            <td>Test</td>\n");
      out.write("                                        </tr>\n");
      out.write("                                    </table>\n");
      out.write("\n");
      out.write("                                </div>\n");
      out.write("                                <!-- Hết thẻ thân -->\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <!-- Hết button chi tiết -->\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
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
}
