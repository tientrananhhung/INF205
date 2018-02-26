/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.GioHang;
import model.GioHangDAO;
import model.HangHoa;
import model.HangHoaDAO;
import model.LoaiHangDAO;

/**
 *
 * @author Tien Tran
 */
public class DelItemsServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
    HangHoaDAO hhDAO = new HangHoaDAO();
    LoaiHangDAO lhDAO = new LoaiHangDAO();
    GioHangDAO ghDAO = new GioHangDAO();
    HangHoa hh;
    DecimalFormat formatter = new DecimalFormat("###,###,###");

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            request.setCharacterEncoding("UTF-8");
            response.setCharacterEncoding("UTF-8");
            String action = request.getParameter("action");
            String MaSP = request.getParameter("MaSP");
            String id = request.getParameter("id");
            String soLuong = request.getParameter("soLuong");
            String tt = request.getParameter("tt");
            switch (action) {
                case "AddNewSP":
                    request.setAttribute("LIST_LOAIHANG", lhDAO.getAllDanhMuc());
                    request.getRequestDispatcher("themhanghoa.jsp").forward(request, response);
                    break;
                case "Del":
                    if (hhDAO.deleteItems(MaSP) == 1) {
                        response.sendRedirect("hanghoa.jsp");
                    }
                    break;
                case "Edit":
                    request.setAttribute("GET_NGAY", sdf.format(hhDAO.getAllItems().get(hhDAO.findByID(MaSP)).getNgayRaMat()));
                    request.setAttribute("LIST_LOAIHANG", lhDAO.getAllDanhMuc());
                    request.setAttribute("EDIT_HANGHOA", hhDAO.getAllItems().get(hhDAO.findByID(MaSP)));
                    request.getRequestDispatcher("themhanghoa.jsp").forward(request, response);
                    break;
                case "View":
                    if (id != null) {
                        request.setAttribute("SL_GIO_HANG", ghDAO.tongHang(ghDAO.getIDKH(id).get(0).toString()));
                        request.setAttribute("SAN_PHAM_CT", hhDAO.getAllItems().get(hhDAO.findByID(MaSP)));
                        request.setAttribute("GIA_SAN_PHAM_CT", formatter.format(hhDAO.getAllItems().get(hhDAO.findByID(MaSP)).getGia()));
                        request.setAttribute("TG_SAN_PHAM_CT", sdf1.format(hhDAO.getAllItems().get(hhDAO.findByID(MaSP)).getNgayRaMat()));
                        request.getRequestDispatcher("sanpham.jsp").forward(request, response);
                    } else {
                        request.setAttribute("SL_GIO_HANG", 0);
                        request.setAttribute("SAN_PHAM_CT", hhDAO.getAllItems().get(hhDAO.findByID(MaSP)));
                        request.setAttribute("GIA_SAN_PHAM_CT", formatter.format(hhDAO.getAllItems().get(hhDAO.findByID(MaSP)).getGia()));
                        request.setAttribute("TG_SAN_PHAM_CT", sdf1.format(hhDAO.getAllItems().get(hhDAO.findByID(MaSP)).getNgayRaMat()));
                        request.getRequestDispatcher("sanpham.jsp").forward(request, response);
                    }
                    break;
                case "Cart":
                    GioHang gh = new GioHang(ghDAO.getIDKH(id).get(0).toString(), MaSP, 1);
                    if (ghDAO.addItems(gh) == 1) {
                        request.setAttribute("SL_GIO_HANG", ghDAO.tongHang(ghDAO.getIDKH(id).get(0).toString()));
                    } else if (ghDAO.addItems(gh) == 2) {
                        request.setAttribute("SL_GIO_HANG", ghDAO.tongHang(ghDAO.getIDKH(id).get(0).toString()));
                    }
                    request.getRequestDispatcher("index.jsp").forward(request, response);
                    break;
                case "CartID":
                    request.setAttribute("GIO_HANG", ghDAO.getAllCart(id));
                    request.setAttribute("TONG_HANG", ghDAO.tongHang(ghDAO.getIDKH(id).get(0).toString()));
                    int tong = 0;
                    for (int i = 0; i < ghDAO.getAllCart(id).size(); i++) {
                        Vector t = (Vector) ghDAO.getAllCart(id).get(i);
                        tong = tong + Integer.parseInt(t.get(6).toString());
                    }
                    request.setAttribute("SL_GIO_HANG", ghDAO.tongHang(ghDAO.getIDKH(id).get(0).toString()));
                    request.setAttribute("TONG_TIEN", formatter.format(tong));
                    request.setAttribute("TONG_TIEN1", tong);
                    request.getRequestDispatcher("giohang.jsp").forward(request, response);
                    break;
                case "CartUp":
                    GioHang gh1 = new GioHang(ghDAO.getIDKH(id).get(0).toString(), MaSP, Integer.parseInt(soLuong));
                    if (ghDAO.updateItems(gh1) == 1) {
                        request.setAttribute("GIO_HANG", ghDAO.getAllCart(id));
                        request.setAttribute("TONG_HANG", ghDAO.tongHang(ghDAO.getIDKH(id).get(0).toString()));
                        int tong1 = 0;
                        for (int i = 0; i < ghDAO.getAllCart(id).size(); i++) {
                            Vector t = (Vector) ghDAO.getAllCart(id).get(i);
                            tong1 = tong1 + Integer.parseInt(t.get(6).toString());
                        }
                        request.setAttribute("TONG_TIEN", formatter.format(tong1));
                        request.setAttribute("TONG_TIEN1", tong1);
                        request.setAttribute("SL_GIO_HANG", ghDAO.tongHang(ghDAO.getIDKH(id).get(0).toString()));
                        request.getRequestDispatcher("giohang.jsp").forward(request, response);
                    } else {
                        request.setAttribute("GIO_HANG", ghDAO.getAllCart(id));
                        request.setAttribute("TONG_HANG", ghDAO.tongHang(ghDAO.getIDKH(id).get(0).toString()));
                        int tong2 = 0;
                        for (int i = 0; i < ghDAO.getAllCart(id).size(); i++) {
                            Vector t = (Vector) ghDAO.getAllCart(id).get(i);
                            tong2 = tong2 + Integer.parseInt(t.get(6).toString());
                        }
                        request.setAttribute("TONG_TIEN", formatter.format(tong2));
                        request.setAttribute("TONG_TIEN1", tong2);
                        request.getRequestDispatcher("giohang.jsp").forward(request, response);
                    }
                    break;
                case "CartDown":
                    GioHang gh2 = new GioHang(ghDAO.getIDKH(id).get(0).toString(), MaSP, Integer.parseInt(soLuong));
                    if (ghDAO.updateItems1(gh2) == 1) {
                        request.setAttribute("GIO_HANG", ghDAO.getAllCart(id));
                        request.setAttribute("TONG_HANG", ghDAO.tongHang(ghDAO.getIDKH(id).get(0).toString()));
                        int tong1 = 0;
                        for (int i = 0; i < ghDAO.getAllCart(id).size(); i++) {
                            Vector t = (Vector) ghDAO.getAllCart(id).get(i);
                            tong1 = tong1 + Integer.parseInt(t.get(6).toString());
                        }
                        request.setAttribute("TONG_TIEN", formatter.format(tong1));
                        request.setAttribute("TONG_TIEN1", tong1);
                        request.getRequestDispatcher("giohang.jsp").forward(request, response);
                    } else {
                        request.setAttribute("GIO_HANG", ghDAO.getAllCart(id));
                        request.setAttribute("TONG_HANG", ghDAO.tongHang(ghDAO.getIDKH(id).get(0).toString()));
                        int tong2 = 0;
                        for (int i = 0; i < ghDAO.getAllCart(id).size(); i++) {
                            Vector t = (Vector) ghDAO.getAllCart(id).get(i);
                            tong2 = tong2 + Integer.parseInt(t.get(6).toString());
                        }
                        request.setAttribute("TONG_TIEN", formatter.format(tong2));
                        request.setAttribute("TONG_TIEN1", tong2);
                        request.setAttribute("SL_GIO_HANG", ghDAO.tongHang(ghDAO.getIDKH(id).get(0).toString()));
                        request.getRequestDispatcher("giohang.jsp").forward(request, response);
                    }
                    break;
                case "DelGH":
                    GioHang gh3 = new GioHang(ghDAO.getIDKH(id).get(0).toString(), MaSP, Integer.parseInt(soLuong));
                    if (ghDAO.delItems(gh3) == 1) {
                        request.setAttribute("GIO_HANG", ghDAO.getAllCart(id));
                        request.setAttribute("TONG_HANG", ghDAO.tongHang(ghDAO.getIDKH(id).get(0).toString()));
                        int tong2 = 0;
                        for (int i = 0; i < ghDAO.getAllCart(id).size(); i++) {
                            Vector t = (Vector) ghDAO.getAllCart(id).get(i);
                            tong2 = tong2 + Integer.parseInt(t.get(6).toString());
                        }
                        request.setAttribute("SL_GIO_HANG", ghDAO.tongHang(ghDAO.getIDKH(id).get(0).toString()));
                        request.setAttribute("TONG_TIEN", formatter.format(tong2));
                        request.setAttribute("TONG_TIEN1", tong2);
                        request.getRequestDispatcher("giohang.jsp").forward(request, response);
                    }
                    break;
                case "CartPay":
                    if (ghDAO.addOrder(ghDAO.getIDKH(id).get(0).toString(), tt, 1) == 1) {
                        if (ghDAO.delItems1(ghDAO.getIDKH(id).get(0).toString()) == 1) {
                            request.setAttribute("TONG_HANG", ghDAO.tongHang(ghDAO.getIDKH(id).get(0).toString()));
                            int tong2 = 0;
                            for (int i = 0; i < ghDAO.getAllCart(id).size(); i++) {
                                Vector t = (Vector) ghDAO.getAllCart(id).get(i);
                                tong2 = tong2 + Integer.parseInt(t.get(6).toString());
                            }
                            request.setAttribute("SL_GIO_HANG", ghDAO.tongHang(ghDAO.getIDKH(id).get(0).toString()));
                            request.setAttribute("TONG_TIEN", formatter.format(tong2));
                            request.setAttribute("TONG_TIEN1", tong2);
                        }
                    }
                    request.getRequestDispatcher("index.jsp").forward(request, response);
                    break;
                case "DonHangCT":
                    for (int i = 0; i < ghDAO.getAllOrder().size(); i++) {
                        Vector t = (Vector) ghDAO.getAllOrder().get(i);
                        request.setAttribute("TRANG_THAI", t.get(6));
                    }
                    request.getRequestDispatcher("donhang.jsp").forward(request, response);
                    break;
                case "Confirm":
                    if (ghDAO.updateOđer(2, ghDAO.getIDKH(id).get(0).toString()) == 1) {
                        for (int i = 0; i < ghDAO.getAllOrder().size(); i++) {
                            Vector t = (Vector) ghDAO.getAllOrder().get(i);
                            request.setAttribute("TRANG_THAI", t.get(6));
                        }

                    }
                    request.getRequestDispatcher("donhang.jsp").forward(request, response);
                    break;
                case "DelOrder":
                    if (ghDAO.delOrder(ghDAO.getIDKH(id).get(0).toString()) == 1) {
                        for (int i = 0; i < ghDAO.getAllOrder().size(); i++) {
                            Vector t = (Vector) ghDAO.getAllOrder().get(i);
                            request.setAttribute("TRANG_THAI", t.get(6));
                        }
                    }
                    request.getRequestDispatcher("donhang.jsp").forward(request, response);
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
        } catch (SQLException ex) {
            Logger.getLogger(DelItemsServlet.class.getName()).log(Level.SEVERE, null, ex);
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
        } catch (SQLException ex) {
            Logger.getLogger(DelItemsServlet.class.getName()).log(Level.SEVERE, null, ex);
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
