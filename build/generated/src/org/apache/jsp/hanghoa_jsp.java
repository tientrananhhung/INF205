package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.HangHoaDAO;
import java.text.DecimalFormat;
import java.util.Vector;

public final class hanghoa_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Hàng hóa</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("        <link href=\"css/css.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <script src=\"css/myjs.js\" type=\"text/javascript\"></script>\n");
      out.write("    </head>\n");
      out.write("    ");
HangHoaDAO hhDAO = new HangHoaDAO();
      out.write("\n");
      out.write("    ");
 DecimalFormat formatter = new DecimalFormat("###,###,###"); 
      out.write("\n");
      out.write("    <body>\n");
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
      out.write("                <div class=\"title-hanghoa\">\n");
      out.write("                    <div class=\"col-md-10\">\n");
      out.write("                        <h3>Hàng hóa</h3>\n");
      out.write("                        <a href=\"DelItemsServlet?action=AddNewSP\" class=\"btn btn-primary bt-tool-bar\"><i class=\"fa fa-plus\"></i><span> Thêm hàng hóa</span></a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-10\">\n");
      out.write("                    <table class=\"table table-hover\" style=\"background: white\">\n");
      out.write("                        <thead>\n");
      out.write("                            <tr>\n");
      out.write("                                <th>Mã hàng hóa</th>\n");
      out.write("                                <th>Tên hàng hóa</th>\n");
      out.write("                                <th>Số lượng</th>\n");
      out.write("                                <th>Giá bán</th>\n");
      out.write("                                <th>Loại sản phẩm</th>\n");
      out.write("                                <th></th>\n");
      out.write("                            </tr>\n");
      out.write("                        </thead>\n");
      out.write("                        <tbody>\n");
      out.write("                        ");

                            for (int i = 0; i < hhDAO.getAllItems().size(); i++) {

                        
      out.write("\n");
      out.write("                        <tr>\n");
      out.write("                            <td>");
      out.print(hhDAO.getAllItems().get(i).getMaSP());
      out.write("</td>\n");
      out.write("                            <td>");
      out.print(hhDAO.getAllItems().get(i).getTenSP());
      out.write("</td>\n");
      out.write("                            <td>");
      out.print(hhDAO.getAllItems().get(i).getSoLuong());
      out.write("</td>\n");
      out.write("                            <td>");
      out.print(formatter.format(hhDAO.getAllItems().get(i).getGia()) + " VNĐ");
      out.write("</td>\n");
      out.write("                            <td>");
      out.print(hhDAO.getAllItems().get(i).getMaLoaiSP().getName());
      out.write("</td>\n");
      out.write("                            <td>\n");
      out.write("                                <a href='");
      out.print("DelItemsServlet?action=Edit&MaSP=" + hhDAO.getAllItems().get(i).getMaSP());
      out.write("'><span class=\"fa fa-pencil\" title=\"Cập nhật hàng hóa\"></span></a>\n");
      out.write("                                <a href='");
      out.print("DelItemsServlet?action=Del&MaSP=" + hhDAO.getAllItems().get(i).getMaSP());
      out.write("'><span class=\"fa fa-trash\" title=\"Xóa hàng hóa\"></span></a>\n");
      out.write("                            </td>\n");
      out.write("                        </tr>\n");
      out.write("                        ");

                            }
                        
      out.write("\n");
      out.write("                    </tbody>\n");
      out.write("                </table>\n");
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
