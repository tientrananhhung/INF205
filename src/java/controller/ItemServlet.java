/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.HangHoa;
import model.HangHoaDAO;
import model.LoaiHang;
import model.LoaiHangDAO;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

/**
 *
 * @author Tien Tran
 */
public class ItemServlet extends HttpServlet {

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
    HangHoaDAO hhDAO = new HangHoaDAO();
    LoaiHangDAO lhDAO = new LoaiHangDAO();

    private static final long serialVersionUID = 1L;

    // location to store file uploaded
    private static final String UPLOAD_DIRECTORY = "images";

    // upload settings
    private static final int MEMORY_THRESHOLD = 1024 * 1024 * 3;  // 3MB
    private static final int MAX_FILE_SIZE = 1024 * 1024 * 40; // 40MB
    private static final int MAX_REQUEST_SIZE = 1024 * 1024 * 50; // 50MB

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            request.setCharacterEncoding("UTF-8");
            response.setCharacterEncoding("UTF-8");
            String action = request.getParameter("action");
            String MaSP = request.getParameter("MaSP");
            switch (action) {
                case "Del":
                    if (hhDAO.deleteItems(MaSP) == 1) {
                        response.sendRedirect("hanghoa.jsp");
                    } else {
                        System.out.println("Lỗi");
                    }
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
            request.setAttribute("ALLITEMS", hhDAO.getAllItems());
            request.setCharacterEncoding("UTF-8");
            response.setCharacterEncoding("UTF-8");
            String upAnh = null;
            String MaSP = null;
            String idDanhMuc = null;
            String tenHH = null;
            String soLuong = null;
            String gia = null;
            String congNgheMH = null;
            String doPhanGiai = null;
            String kichThuocMH = null;
            String matCamUng = null;
            String camSau = null;
            String quayPhim = null;
            String denFlash = null;
            String chupNangCao = null;
            String camTruoc = null;
            String videoCall = null;
            String infoThem = null;
            String HDH = null;
            String chipset = null;
            String cpu = null;
            String chipDoHoa = null;
            String RAM = null;
            String boNhoTrong = null;
            String wifi = null;
            String bluetooth = null;
            String congKetNoi = null;
            String ketNoiKhac = null;
            String thietKe = null;
            String chatLieu = null;
            String kichThuocMay = null;
            String dungLuongPin = null;
            String loaiPin = null;
            String CNPin = null;
            String baoMatNC = null;
            String tinhNangDacBiet = null;
            String ngayRaMat = null;
            String CNAmThanh = null;
            String trongLuong = null;
            String chuThich = null;
            String trangThai = null;
            String upAnhBia = null;
            String action = null;
            String fileName = null;
            String fileName1 = null;
            String slugHH = null;
            try {
                request.setAttribute("LIST_DANHMUC", lhDAO.getAllDanhMuc());
            } catch (SQLException ex) {
                Logger.getLogger(ItemServlet.class.getName()).log(Level.SEVERE, null, ex);
            }
            request.setAttribute("HANGHOA", hhDAO.getHangHoaByID(MaSP));
            if (!ServletFileUpload.isMultipartContent(request)) {
                // if not, we stop here
                PrintWriter writer = response.getWriter();
                writer.println("Error: Form must has enctype=multipart/form-data.");
                writer.flush();
                return;
            }

            // configures upload settings
            DiskFileItemFactory factory = new DiskFileItemFactory();
            // sets memory threshold - beyond which files are stored in disk 
            factory.setSizeThreshold(MEMORY_THRESHOLD);
            // sets temporary location to store files
            factory.setRepository(new File(System.getProperty("java.io.tmpdir")));

            ServletFileUpload upload = new ServletFileUpload(factory);

            // sets maximum size of upload file
            upload.setFileSizeMax(MAX_FILE_SIZE);

            // sets maximum size of request (include file + form data)
            upload.setSizeMax(MAX_REQUEST_SIZE);

            // constructs the directory path to store upload file
            // this path is relative to application's directory
            String uploadPath = getServletContext().getRealPath("")
                    + File.separator + UPLOAD_DIRECTORY;

            // creates the directory if it does not exist
            File uploadDir = new File(uploadPath);
            if (!uploadDir.exists()) {
                uploadDir.mkdir();
            }

            // parses the request's content to extract file data
            @SuppressWarnings("unchecked")
            List<FileItem> formItems = upload.parseRequest(request);
            if (formItems != null && formItems.size() > 0) {
                // iterates over form's fields
                for (FileItem item : formItems) {
                    if (item.getFieldName().equals("action")) {
                        action = item.getString("UTF-8");
                    }
                    if (item.getFieldName().equals("slugHH")) {
                        slugHH = item.getString("UTF-8");
                    }
                    if (item.getFieldName().equals("upAnh")) {
                        upAnh = item.getString("UTF-8");
                    }
                    if (item.getFieldName().equals("MaSP")) {
                        MaSP = item.getString("UTF-8");
                    }
                    if (item.getFieldName().equals("idDanhMuc")) {
                        idDanhMuc = item.getString("UTF-8");
                    }
                    if (item.getFieldName().equals("tenHH")) {
                        tenHH = item.getString("UTF-8");
                    }
                    if (item.getFieldName().equals("soLuong")) {
                        soLuong = item.getString("UTF-8");
                    }
                    if (item.getFieldName().equals("gia")) {
                        gia = item.getString("UTF-8");
                    }
                    if (item.getFieldName().equals("congNgheMH")) {
                        congNgheMH = item.getString("UTF-8");
                    }
                    if (item.getFieldName().equals("doPhanGiai")) {
                        doPhanGiai = item.getString("UTF-8");
                    }
                    if (item.getFieldName().equals("kichThuocMH")) {
                        kichThuocMH = item.getString("UTF-8");
                    }
                    if (item.getFieldName().equals("matCamUng")) {
                        matCamUng = item.getString("UTF-8");
                    }
                    if (item.getFieldName().equals("camSau")) {
                        camSau = item.getString("UTF-8");
                    }
                    if (item.getFieldName().equals("quayPhim")) {
                        quayPhim = item.getString("UTF-8");
                    }
                    if (item.getFieldName().equals("denFlash")) {
                        denFlash = item.getString("UTF-8");
                    }
                    if (item.getFieldName().equals("chupNangCao")) {
                        chupNangCao = item.getString("UTF-8");
                    }
                    if (item.getFieldName().equals("camTruoc")) {
                        camTruoc = item.getString("UTF-8");
                    }
                    if (item.getFieldName().equals("videoCall")) {
                        videoCall = item.getString("UTF-8");
                    }
                    if (item.getFieldName().equals("infoThem")) {
                        infoThem = item.getString("UTF-8");
                    }
                    if (item.getFieldName().equals("HDH")) {
                        HDH = item.getString("UTF-8");
                    }
                    if (item.getFieldName().equals("chipset")) {
                        chipset = item.getString("UTF-8");
                    }
                    if (item.getFieldName().equals("cpu")) {
                        cpu = item.getString("UTF-8");
                    }
                    if (item.getFieldName().equals("chipDoHoa")) {
                        chipDoHoa = item.getString("UTF-8");
                    }
                    if (item.getFieldName().equals("RAM")) {
                        RAM = item.getString("UTF-8");
                    }
                    if (item.getFieldName().equals("boNhoTrong")) {
                        boNhoTrong = item.getString("UTF-8");
                    }
                    if (item.getFieldName().equals("wifi")) {
                        wifi = item.getString("UTF-8");
                    }
                    if (item.getFieldName().equals("bluetooth")) {
                        bluetooth = item.getString("UTF-8");
                    }
                    if (item.getFieldName().equals("congKetNoi")) {
                        congKetNoi = item.getString("UTF-8");
                    }
                    if (item.getFieldName().equals("ketNoiKhac")) {
                        ketNoiKhac = item.getString("UTF-8");
                    }
                    if (item.getFieldName().equals("thietKe")) {
                        thietKe = item.getString("UTF-8");
                    }
                    if (item.getFieldName().equals("chatLieu")) {
                        chatLieu = item.getString("UTF-8");
                    }
                    if (item.getFieldName().equals("kichThuocMay")) {
                        kichThuocMay = item.getString("UTF-8");
                    }
                    if (item.getFieldName().equals("dungLuongPin")) {
                        dungLuongPin = item.getString("UTF-8");
                    }
                    if (item.getFieldName().equals("loaiPin")) {
                        loaiPin = item.getString("UTF-8");
                    }
                    if (item.getFieldName().equals("CNPin")) {
                        CNPin = item.getString("UTF-8");
                    }
                    if (item.getFieldName().equals("baoMatNC")) {
                        baoMatNC = item.getString("UTF-8");
                    }
                    if (item.getFieldName().equals("tinhNangDacBiet")) {
                        tinhNangDacBiet = item.getString("UTF-8");
                    }
                    if (item.getFieldName().equals("loaiPin")) {
                        loaiPin = item.getString("UTF-8");
                    }
                    if (item.getFieldName().equals("ngayRaMat")) {
                        ngayRaMat = item.getString("UTF-8");
                    }
                    if (item.getFieldName().equals("CNAmThanh")) {
                        CNAmThanh = item.getString("UTF-8");
                    }
                    if (item.getFieldName().equals("trongLuong")) {
                        trongLuong = item.getString("UTF-8");
                    }
                    if (item.getFieldName().equals("chuThich")) {
                        chuThich = item.getString("UTF-8");
                    }
                    if (item.getFieldName().equals("trangThai")) {
                        trangThai = item.getString("UTF-8");
                    }
                    if (item.getFieldName().equals("upAnhBia")) {
                        upAnhBia = item.getString("UTF-8");
                    }

                }
                switch (action) {
                    case "Add":
                        if (formItems != null && formItems.size() > 0) {
                            // iterates over form's fields
                            for (FileItem item : formItems) {
                                if (!item.isFormField()) {
                                    if (item.getFieldName().equals("upAnh")) {
                                        fileName = slugHH + "_anh.jpg";
                                        String filePath = uploadPath + File.separator + fileName;
                                        File storeFile = new File(filePath);
                                        item.write(storeFile);
                                    }
                                    if (item.getFieldName().equals("upAnhBia")) {
                                        fileName1 = slugHH + "_anhbia.jpg";
                                        String filePath = uploadPath + File.separator + fileName1;
                                        File storeFile = new File(filePath);
                                        item.write(storeFile);
                                    }
                                }
                            }
                        }
                        HangHoa hh = new HangHoa(MaSP, new LoaiHang(Integer.parseInt(idDanhMuc), ""), tenHH, Double.parseDouble(gia), congNgheMH, doPhanGiai, kichThuocMH, matCamUng, camSau, quayPhim, denFlash, chupNangCao, camTruoc,
                                videoCall, infoThem, HDH, chipset, cpu, chipDoHoa, RAM, boNhoTrong, wifi, bluetooth, congKetNoi, ketNoiKhac, thietKe, chatLieu, kichThuocMay, dungLuongPin,
                                loaiPin, CNPin, baoMatNC, tinhNangDacBiet, sdf.parse(ngayRaMat), CNAmThanh, trongLuong, Integer.parseInt(soLuong), chuThich, fileName, trangThai, fileName1);
                        if (hhDAO.addItems(hh) == 1) {
                            request.setAttribute("LIST_LOAIHANG", lhDAO.getAllDanhMuc());
                            request.getRequestDispatcher("themhanghoa.jsp").forward(request, response);
                        }
                        break;
                    case "Update":
                        if (formItems != null && formItems.size() > 0) {
                            // iterates over form's fields
                            for (FileItem item : formItems) {
                                if (!item.isFormField()) {
                                    if (item.getFieldName().equals("upAnh")) {
                                        fileName = slugHH + "_anh.jpg";
                                        String filePath = uploadPath + File.separator + fileName;
                                        File storeFile = new File(filePath);
                                        item.write(storeFile);
                                    }
                                    if (item.getFieldName().equals("upAnhBia")) {
                                        fileName1 = slugHH + "_anhbia.jpg";
                                        String filePath = uploadPath + File.separator + fileName1;
                                        File storeFile = new File(filePath);
                                        item.write(storeFile);
                                    }
                                }
                            }
                        }
                        HangHoa hh1 = new HangHoa(MaSP, new LoaiHang(Integer.parseInt(idDanhMuc), ""), tenHH, Double.parseDouble(gia), congNgheMH, doPhanGiai, kichThuocMH, matCamUng, camSau, quayPhim, denFlash, chupNangCao, camTruoc,
                                videoCall, infoThem, HDH, chipset, cpu, chipDoHoa, RAM, boNhoTrong, wifi, bluetooth, congKetNoi, ketNoiKhac, thietKe, chatLieu, kichThuocMay, dungLuongPin,
                                loaiPin, CNPin, baoMatNC, tinhNangDacBiet, sdf.parse(ngayRaMat), CNAmThanh, trongLuong, Integer.parseInt(soLuong), chuThich, fileName, trangThai, fileName1);
                        if (hhDAO.updateItems(hh1) == 1) {
                            request.setAttribute("LIST_LOAIHANG", lhDAO.getAllDanhMuc());
                            request.getRequestDispatcher("themhanghoa.jsp").forward(request, response);
                        }
                        break;
                }
            }
        } catch (FileUploadException ex) {
            Logger.getLogger(ItemServlet.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(ItemServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
