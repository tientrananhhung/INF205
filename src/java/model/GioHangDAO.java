/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import common.ConnectDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Tien Tran
 */
public class GioHangDAO {

    Connection conn;
    PreparedStatement pre, pre1, pre2, pre3, pre4, pre5, pre6, pre7, pre8, pre9, pre10, pre11;
    ArrayList<GioHang> list;

    public Vector getIDKH(String name) {
        Vector kq = new Vector();
        conn = new ConnectDB().getConnect();
        try {
            pre4 = conn.prepareStatement("SELECT `IDTaiKhoan` FROM `taikhoan` WHERE `TenTaiKhoan` = ?");
            pre4.setString(1, name);
            ResultSet rs = pre4.executeQuery();
            while (rs.next()) {
                kq.add(rs.getString(1));
            }
            pre4.close();
            rs.close();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(GioHangDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return kq;
    }

    public Vector getAllOrder() {
        conn = new ConnectDB().getConnect();
        Vector kq = new Vector();
        try {
            pre8 = conn.prepareStatement("SELECT `taikhoan`.`IDTaiKhoan`, `taikhoan`.`TenTaiKhoan`,`taikhoan`.`TenNguoiDung`, `taikhoan`.`DiaChi`, `taikhoan`.`SDT`, "
                    + "`donhang`.`TongTien`, `donhang`.`TrangThai` FROM `donhang` INNER JOIN `taikhoan` ON `taikhoan`.`IDTaiKhoan` = `donhang`.`IDTaiKhoan`");
            ResultSet rs = pre8.executeQuery();
            ResultSetMetaData rsmd = rs.getMetaData();
            while (rs.next()) {
                Vector t = new Vector();
                for (int i = 1; i <= rsmd.getColumnCount(); i++) {
                    t.add(rs.getString(i));
                }
                kq.add(t);
            }
            rs.close();
            pre8.close();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(GioHangDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return kq;
    }

    public int tongHang(String id) {
        conn = new ConnectDB().getConnect();
        int tong = 0;
        try {
            pre6 = conn.prepareStatement("SELECT SUM(`SoLuong`) FROM `giohang` WHERE `IdTaiKhoan` = ?");
            pre6.setString(1, id);
            ResultSet rs = pre6.executeQuery();
            if (rs.next()) {
                tong = rs.getInt(1);
            }
            pre6.close();
            rs.close();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(GioHangDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return tong;
    }

    public Vector getAllCart(String user) {
        conn = new ConnectDB().getConnect();
        Vector kq = new Vector();
        try {
            pre7 = conn.prepareStatement("SELECT `taikhoan`.`TenTaiKhoan`,`sanpham`.`MaSP`,`sanpham`.`TenSP`,`sanpham`.`LinkAnhBia`, `sanpham`.`Gia`, `giohang`.`SoLuong`, `sanpham`."
                    + "`Gia`*`giohang`.`SoLuong` AS `TongTien` FROM `giohang` INNER JOIN `taikhoan` ON `taikhoan`.`IDTaiKhoan` = `giohang`.`IdTaiKhoan` INNER JOIN `sanpham` ON "
                    + "`sanpham`.`MaSP` = `giohang`.`MaSP` WHERE `taikhoan`.`TenTaiKhoan` = ?");
            pre7.setString(1, user);
            ResultSet rs = pre7.executeQuery();
            ResultSetMetaData rsmd = rs.getMetaData();
            while (rs.next()) {
                Vector t = new Vector();
                for (int i = 1; i <= rsmd.getColumnCount(); i++) {
                    t.add(rs.getString(i));
                }
                kq.add(t);
            }
            pre7.close();
            rs.close();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(GioHangDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return kq;
    }

    public int addItems(GioHang gh) {
        conn = new ConnectDB().getConnect();
        try {
            pre5 = conn.prepareStatement("SELECT * FROM `giohang` WHERE `IdTaiKhoan`=? AND `MaSP` =?");
            pre5.setString(1, gh.getId());
            pre5.setString(2, gh.getMaSP());
            ResultSet rs = pre5.executeQuery();
            if (rs.next()) {
                pre2 = conn.prepareStatement("UPDATE `giohang` SET `SoLuong`=? WHERE `IdTaiKhoan` = ? AND `MaSP` = ?");
                pre2.setInt(1, (rs.getInt(3) + 1));
                pre2.setString(2, gh.getId());
                pre2.setString(3, gh.getMaSP());
                pre2.executeUpdate();
                pre2.close();
                return 2;
            } else {
                pre1 = conn.prepareStatement("INSERT INTO `giohang`(`IdTaiKhoan`, `MaSP`, `SoLuong`) VALUES (?,?,?)");
                pre1.setString(1, gh.getId());
                pre1.setString(2, gh.getMaSP());
                pre1.setInt(3, gh.getSoLuong());
                if (pre1.executeUpdate() != 0) {
                    pre1.close();
                    return 1;
                }
            }
            rs.close();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(HangHoaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return -1;
    }

    public int delOrder(String id) {
        conn = new ConnectDB().getConnect();
        try {
            pre11 = conn.prepareStatement("DELETE FROM `donhang` WHERE `IDTaiKhoan` = ?");
            pre11.setString(1, id);
            if (pre11.executeUpdate() != 0) {
                return 1;
            }
            pre11.close();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(GioHangDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return -1;
    }

    public int delItems(GioHang gh) {
        conn = new ConnectDB().getConnect();
        try {
            pre = conn.prepareStatement("DELETE FROM `giohang` WHERE `IdTaiKhoan` = ? AND `MaSP` = ?");
            pre.setString(1, gh.getId());
            pre.setString(2, gh.getMaSP());
            if (pre.executeUpdate() != 0) {
                return 1;
            }
            pre.close();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(GioHangDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return -1;
    }

    public int delItems1(String id) {
        conn = new ConnectDB().getConnect();
        try {
            pre9 = conn.prepareStatement("DELETE FROM `giohang` WHERE `IdTaiKhoan` = ?");
            pre9.setString(1, id);
            if (pre9.executeUpdate() != 0) {
                return 1;
            }
            pre9.close();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(GioHangDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return -1;
    }

    public int addOrder(String id, String tongTien, int trangThai) {
        conn = new ConnectDB().getConnect();
        try {
            pre10 = conn.prepareStatement("INSERT INTO `donhang`(`IDTaiKhoan`, `TongTien`, `TrangThai`) VALUES (?,?,?)");
            pre10.setString(1, id);
            pre10.setString(2, tongTien);
            pre10.setInt(3, trangThai);
            if (pre10.executeUpdate() != 0) {
                return 1;
            }
            pre10.close();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(GioHangDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return -1;
    }

    public int updateOđer(int trangThai, String id) {
        conn = new ConnectDB().getConnect();
        try {
            pre2 = conn.prepareStatement("UPDATE `donhang` SET `TrangThai`= ? WHERE `IDTaiKhoan` = ?");
            pre2.setInt(1, trangThai);
            pre2.setString(2, id);
            if (pre2.executeUpdate() != 0) {
                return 1;
            }
            pre2.close();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(GioHangDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return -1;
    }

    public int updateItems(GioHang gh) {
        conn = new ConnectDB().getConnect();
        try {
            pre2 = conn.prepareStatement("UPDATE `giohang` SET `SoLuong`=? WHERE `IdTaiKhoan` = ? AND `MaSP` = ?");
            pre2.setInt(1, (gh.getSoLuong() + 1));
            pre2.setString(2, gh.getId());
            pre2.setString(3, gh.getMaSP());
            if (pre2.executeUpdate() != 0) {
                return 1;
            }
            pre2.close();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(GioHangDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return -1;
    }

    public int updateItems1(GioHang gh) {
        conn = new ConnectDB().getConnect();
        try {
            pre2 = conn.prepareStatement("UPDATE `giohang` SET `SoLuong`=? WHERE `IdTaiKhoan` = ? AND `MaSP` = ?");
            pre2.setInt(1, (gh.getSoLuong() - 1));
            pre2.setString(2, gh.getId());
            pre2.setString(3, gh.getMaSP());
            if (pre2.executeUpdate() != 0) {
                return 1;
            }
            pre2.close();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(GioHangDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return -1;
    }

    public static void main(String[] args) {
        GioHangDAO ghDAO = new GioHangDAO();
        System.out.println(ghDAO.getAllOrder().get(0));
    }

}
