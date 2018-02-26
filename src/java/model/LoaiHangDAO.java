/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import common.ConnectDB;
import com.mysql.jdbc.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Tien Tran
 */
public class LoaiHangDAO {

    public List<LoaiHang> getAllDanhMuc() throws SQLException {
        Connection conn = null;
        List<LoaiHang> listDanhMuc = new ArrayList<>();
        ConnectDB con = new ConnectDB();
        conn = con.getConnect();
        try {
            Statement pre = conn.createStatement();
            ResultSet rs = pre.executeQuery("SELECT * FROM loaisp");
            while (rs.next()) {
                LoaiHang lh = new LoaiHang(rs.getInt(1), rs.getString(2));
                listDanhMuc.add(lh);
            }
        } catch (SQLException ex) {
            Logger.getLogger(LoaiHangDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listDanhMuc;
    }
    
}
