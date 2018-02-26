/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.GioHangDAO;
import model.HangHoaDAO;
import model.LoaiHangDAO;
import model.User;
import model.UserDAO;

/**
 *
 * @author Tien Tran
 */
public class AdminServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    UserDAO uDAO = new UserDAO();
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    HangHoaDAO hhDAO = new HangHoaDAO();
    LoaiHangDAO lhDAO = new LoaiHangDAO();
    GioHangDAO ghDAO = new GioHangDAO();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, ParseException, SQLException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            request.setCharacterEncoding("UTF-8");
            response.setCharacterEncoding("UTF-8");
            String user = request.getParameter("user");
            String pass = request.getParameter("pass");
            String role = request.getParameter("role");
            String name = request.getParameter("name");
            String birthday = request.getParameter("birthday");
            String gioitinh = request.getParameter("gioitinh");
            String address = request.getParameter("address");
            String phone = request.getParameter("phone");
            String mail = request.getParameter("mail");
            String action = request.getParameter("action");
            if (user == null) {
                request.setAttribute("LIST_DANHMUC", lhDAO.getAllDanhMuc());
                request.setAttribute("LIST_SANPHAM", hhDAO.getAllItems());
                request.getRequestDispatcher("themhanghoa.jsp").forward(request, response);
                return;
            }
            switch (action) {
                case "login":
                    if (uDAO.checkLogin(user, pass) != null) {
                        if (uDAO.checkLogin(user, pass).getChucVu().equals("Administrator")) {
                            HttpSession ss = request.getSession();
                            ss.setAttribute("USERNAME", user);
                            request.setAttribute("ADMIN", user);
                            request.setAttribute("SL_GIO_HANG", ghDAO.tongHang(ghDAO.getIDKH(user).get(0).toString()));
                            response.sendRedirect("admin.jsp");
                        } else {
                            HttpSession ss = request.getSession();
                            ss.setAttribute("USER", user);
                            request.setAttribute("SL_GIO_HANG", ghDAO.tongHang(ghDAO.getIDKH(user).get(0).toString()));
                            request.getRequestDispatcher("index.jsp").forward(request, response);
                        }
                    } else {
                        response.sendRedirect("login.jsp");
                    }
                    break;
                case "dangky":
                    User dy = new User(null, user, pass, role, name, sdf.parse(birthday), gioitinh, address, phone, mail);
                    if (uDAO.reg(dy) == 1) {
                        HttpSession ss = request.getSession();
                        ss.setAttribute("USER", user);
                        request.getRequestDispatcher("index.jsp").forward(request, response);
                    } else {
                        request.setAttribute("dkError", "Tài khoản đã tồn tại, xin vui lòng thử tên tài khoản khác");
                        request.getRequestDispatcher("index.jsp").forward(request, response);
                    }
                    break;
                case "Backhome":
                    request.setAttribute("SL_GIO_HANG", ghDAO.tongHang(ghDAO.getIDKH(user).get(0).toString()));
                    request.getRequestDispatcher("index.jsp").forward(request, response);
                    break;
                case "Home":
                    request.getRequestDispatcher("index.jsp").forward(request, response);
                    break;
            }
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (ParseException ex) {
            Logger.getLogger(AdminServlet.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(AdminServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (ParseException ex) {
            Logger.getLogger(AdminServlet.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(AdminServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
