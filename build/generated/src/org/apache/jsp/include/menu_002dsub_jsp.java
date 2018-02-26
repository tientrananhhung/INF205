package org.apache.jsp.include;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class menu_002dsub_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<style>\n");
      out.write("    body,html{\n");
      out.write("        height: 100%;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    nav.sidebar, .main{\n");
      out.write("        -webkit-transition: margin 200ms ease-out;\n");
      out.write("        -moz-transition: margin 200ms ease-out;\n");
      out.write("        -o-transition: margin 200ms ease-out;\n");
      out.write("        transition: margin 200ms ease-out;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    .main{\n");
      out.write("        padding: 10px 10px 0 10px;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    @media (min-width: 765px) {\n");
      out.write("\n");
      out.write("        .main{\n");
      out.write("            position: absolute;\n");
      out.write("            width: calc(100% - 40px); \n");
      out.write("            margin-left: 40px;\n");
      out.write("            float: right;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        nav.sidebar:hover + .main{\n");
      out.write("            margin-left: 200px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        nav.sidebar.navbar.sidebar>.container .navbar-brand, .navbar>.container-fluid .navbar-brand {\n");
      out.write("            margin-left: 0px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        nav.sidebar .navbar-brand, nav.sidebar .navbar-header{\n");
      out.write("            text-align: center;\n");
      out.write("            width: 100%;\n");
      out.write("            margin-left: 0px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        nav.sidebar a{\n");
      out.write("            padding-right: 13px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        nav.sidebar .navbar-nav > li:first-child{\n");
      out.write("            border-top: 1px #e5e5e5 solid;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        nav.sidebar .navbar-nav > li{\n");
      out.write("            border-bottom: 1px #e5e5e5 solid;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        nav.sidebar .navbar-nav .open .dropdown-menu {\n");
      out.write("            position: static;\n");
      out.write("            float: none;\n");
      out.write("            width: auto;\n");
      out.write("            margin-top: 0;\n");
      out.write("            background-color: transparent;\n");
      out.write("            border: 0;\n");
      out.write("            -webkit-box-shadow: none;\n");
      out.write("            box-shadow: none;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        nav.sidebar .navbar-collapse, nav.sidebar .container-fluid{\n");
      out.write("            padding: 0 0px 0 0px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .navbar-inverse .navbar-nav .open .dropdown-menu>li>a {\n");
      out.write("            color: #777;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        nav.sidebar{\n");
      out.write("            width: 200px;\n");
      out.write("            height: 100%;\n");
      out.write("            margin-left: -160px;\n");
      out.write("            float: left;\n");
      out.write("            margin-bottom: 0px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        nav.sidebar li {\n");
      out.write("            width: 100%;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        nav.sidebar:hover{\n");
      out.write("            margin-left: 0px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .forAnimate{\n");
      out.write("            opacity: 0;\n");
      out.write("        }\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    @media (min-width: 1330px) {\n");
      out.write("\n");
      out.write("        .main{\n");
      out.write("            width: calc(100% - 200px);\n");
      out.write("            margin-left: 200px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        nav.sidebar{\n");
      out.write("            margin-left: 0px;\n");
      out.write("            float: left;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        nav.sidebar .forAnimate{\n");
      out.write("            opacity: 1;\n");
      out.write("        }\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    nav.sidebar .navbar-nav .open .dropdown-menu>li>a:hover, nav.sidebar .navbar-nav .open .dropdown-menu>li>a:focus {\n");
      out.write("        color: #CCC;\n");
      out.write("        background-color: transparent;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    nav:hover .forAnimate{\n");
      out.write("        opacity: 1;\n");
      out.write("    }\n");
      out.write("    section{\n");
      out.write("        padding-left: 15px;\n");
      out.write("    }\n");
      out.write("</style>\n");

    if (session != null) {
        if (session.getAttribute("USERNAME") == null) {
            response.sendRedirect("login.jsp");
        }
    }

      out.write("\n");
      out.write("<nav class=\"navbar navbar-default sidebar\" role=\"navigation\">\n");
      out.write("    <div class=\"container-fluid\">\n");
      out.write("        <div class=\"navbar-header\">\n");
      out.write("            <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\"#bs-sidebar-navbar-collapse-1\">\n");
      out.write("                <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("                <span class=\"icon-bar\"></span>\n");
      out.write("                <span class=\"icon-bar\"></span>\n");
      out.write("                <span class=\"icon-bar\"></span>\n");
      out.write("            </button>      \n");
      out.write("        </div>\n");
      out.write("        <div class=\"collapse navbar-collapse\" id=\"bs-sidebar-navbar-collapse-1\">\n");
      out.write("            <ul class=\"nav navbar-nav\">\n");
      out.write("                <li ><a href=\"admin.jsp\">Trang Chủ<span style=\"font-size:16px;\" class=\"pull-right hidden-xs showopacity fa fa-home\"></span></a></li>\n");
      out.write("                <li ><a href=\"#\">Đơn hàng<span style=\"font-size:16px;\" class=\"pull-right hidden-xs showopacity glyphicon glyphicon-shopping-cart\"></span></a></li>        \n");
      out.write("                <li ><a href=\"hanghoa.jsp\">Hàng hóa<span style=\"font-size:16px;\" class=\"pull-right hidden-xs showopacity glyphicon glyphicon-barcode\"></span></a></li>\n");
      out.write("                <li ><a href=\"#\">Khánh hàng<span style=\"font-size:16px;\" class=\"pull-right hidden-xs showopacity glyphicon glyphicon-user\"></span></a></li>\n");
      out.write("                <li ><a href=\"#\">Nhập kho<span style=\"font-size:16px;\" class=\"pull-right hidden-xs showopacity glyphicon glyphicon-piggy-bank\"></span></a></li>\n");
      out.write("                <li ><a href=\"#\">Tồn kho<span style=\"font-size:16px;\" class=\"pull-right hidden-xs showopacity glyphicon glyphicon-list-alt\"></span></a></li>\n");
      out.write("                <li ><a href=\"LogoutServlet\">Đăng xuất<span style=\"font-size:16px;\" class=\"pull-right hidden-xs showopacity glyphicon glyphicon-list-alt\"></span></a></li>\n");
      out.write("            </ul>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <script>\n");
      out.write("        $(document).ready(function () {\n");
      out.write("            var url = window.location;\n");
      out.write("            // Will only work if string in href matches with location\n");
      out.write("            $('ul.nav a[href=\"' + url + '\"]').parent().addClass('active');\n");
      out.write("\n");
      out.write("            // Will also work for relative and absolute hrefs\n");
      out.write("            $('ul.nav a').filter(function () {\n");
      out.write("                return this.href == url;\n");
      out.write("            }).parent().addClass('active').parent().parent().addClass('active');\n");
      out.write("        });\n");
      out.write("    </script>\n");
      out.write("</nav>\n");
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
