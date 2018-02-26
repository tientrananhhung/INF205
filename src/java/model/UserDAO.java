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
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Tien Tran
 */
public class UserDAO {

    Connection conn;
    PreparedStatement pre, pre1, pre2, pre3;
    static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

    public User checkLogin(String user, String pass) {
        User kq = null;
        conn = new ConnectDB().getConnect();
        try {
            pre = conn.prepareStatement("SELECT * FROM `taikhoan` WHERE `TenTaiKhoan` = ? AND `MatKhau` = ?");
            pre.setString(1, user);
            pre.setString(2, pass);
            ResultSet rs = pre.executeQuery();
            if (rs.next()) {
                kq = new User(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getDate(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getString(10));
            } else {
                kq = null;
            }
            pre.close();
            conn.close();
        } catch (Exception e) {

        }
        return kq;
    }

    public int reg(User user) {
        conn = new ConnectDB().getConnect();
        try {
            pre1 = conn.prepareStatement("INSERT INTO `taikhoan`(`IDTaiKhoan`, `TenTaiKhoan`, `MatKhau`, `ChucVu`, `TenNguoiDung`, `NgaySinh`, `GioiTinh`, `DiaChi`, `SDT`, `Email`) VALUES (NULL,?,?,?,?,?,?,?,?,?)");
            pre1.setString(1, user.getTenTK());
            pre1.setString(2, user.getMatKhau());
            pre1.setString(3, user.getChucVu());
            pre1.setString(4, user.getTenNguoiDung());
            pre1.setString(5, sdf.format(user.getNgaySinh()));
            pre1.setString(6, user.getGioiTinh());
            pre1.setString(7, user.getDiaChi());
            pre1.setString(8, user.getSdt());
            pre1.setString(9, user.getEmail());
            if (pre1.executeUpdate() != 0) {
                return 1;
            }
            pre1.close();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return -1;
    }

    public int delete(String id) {
        conn = new ConnectDB().getConnect();
        try {
            pre2 = conn.prepareStatement("DELETE FROM `taikhoan` WHERE `IDTaiKhoan` = ?");
            pre2.setString(1, id);
            if (pre2.executeUpdate() != 0) {
                return 1;
            }
            pre2.close();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return -1;
    }

    public int update(User user) {
        conn = new ConnectDB().getConnect();
        try {
            pre3 = conn.prepareStatement("UPDATE `taikhoan` SET `TenTaiKhoan`=?,`MatKhau`=?,`ChucVu`=?,`TenNguoiDung`=?,`NgaySinh`=?,`GioiTinh`=?,`DiaChi`=?,`SDT`=?,`Email`=? WHERE `IDTaiKhoan`=?");
            pre3.setString(1, user.getTenTK());
            pre3.setString(2, user.getMatKhau());
            pre3.setString(3, user.getChucVu());
            pre3.setString(4, user.getTenNguoiDung());
            pre3.setString(5, sdf.format(user.getNgaySinh()));
            pre3.setString(6, user.getGioiTinh());
            pre3.setString(7, user.getDiaChi());
            pre3.setString(8, user.getSdt());
            pre3.setString(9, user.getEmail());
            pre3.setString(10, user.getIdTK());
            if (pre3.executeUpdate() != 0) {
                return 1;
            }
            pre3.close();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return -1;
    }
}
