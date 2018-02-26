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
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Tien Tran
 */
public class HangHoaDAO {

    Connection conn;
    PreparedStatement pre, pre1, pre2, pre3;
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

    public List<HangHoa> getAllItems() throws SQLException {
        List<HangHoa> listHH = new ArrayList<>();
        ConnectDB cn = new ConnectDB();
        conn = cn.getConnect();
        try {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM `sanpham` INNER JOIN `loaisp` ON `sanpham`.`MaLoaiSP` = `loaisp`.`MaLoaiSP`");
            while (rs.next()) {
                HangHoa hh = new HangHoa(rs.getString(1), new LoaiHang(rs.getInt("MaLoaiSP"), rs.getString("TenLoaiSP")), rs.getString(3), rs.getDouble(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getString(10), rs.getString(11), rs.getString(12), rs.getString(13), rs.getString(14), rs.getString(15), rs.getString(16), rs.getString(17), rs.getString(18), rs.getString(19), rs.getString(20), rs.getString(21), rs.getString(22), rs.getString(23), rs.getString(24), rs.getString(25), rs.getString(26), rs.getString(27), rs.getString(28), rs.getString(29), rs.getString(30), rs.getString(31), rs.getString(32), rs.getString(33), sdf.parse(rs.getString(34)), rs.getString(35), rs.getString(36), rs.getInt(37), rs.getString(38), rs.getString(39), rs.getString(40), rs.getString(41));
                listHH.add(hh);
            }
            rs.close();
            stmt.close();
            conn.close();
        } catch (Exception e) {
            System.out.println("Error:" + e.toString());
        }
        return listHH;
    }

    public int checkStatus(String a) {
        if (a.equals("new")) {
            return 1;
        } else if (a.equals("shockprice")) {
            return 2;
        } else if (a.equals("installment")) {
            return 3;
        }
        return -1;
    }

    public int findByID(String ID) throws SQLException {
        for (int i = 0; i < getAllItems().size(); i++) {
            if (ID.equals(getAllItems().get(i).getMaSP())) {
                return i;
            }
        }
        return -1;
    }

    public int addItems(HangHoa hh) {
        conn = new ConnectDB().getConnect();
        try {
            pre1 = conn.prepareStatement("INSERT INTO `sanpham`(`MaSP`, `MaLoaiSP`, `TenSP`, `Gia`, `CongNgheMH`, `DoPhanGiai`, `KichThuocMH`, `MatCamUng`, `CamSau`, `QuayPhim`,"
                    + " `DenFlash`, `ChupNangCao`, `CamTruoc`, `VideoCall`, `InfoThem`, `HDH`, `Chip`, `TocDoCPU`, `ChipDoHoa`, `RAM`, `BoNhoTrong`, `Wifi`, `Bluetooth`, `CongKetNoi`,"
                    + " `KetNoiKhac`, `ThietKe`, `ChatLieu`, `KichThuoc`, `DLPin`, `LoaiPin`, `CongNghePin`, `BaoMatNC`, `TinhNangNew`, `NgayRaMat`, `CNAmThanh`, `TrongLuong`, `SoLuong`,"
                    + " `ChuThich`, `linkAnh`, `TrangThai`, `LinkAnhBia`) VALUES (null,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
            pre1.setInt(1, hh.getMaLoaiSP().getId());
            pre1.setString(2, hh.getTenSP());
            pre1.setDouble(3, hh.getGia());
            pre1.setString(4, hh.getCongNgheMH());
            pre1.setString(5, hh.getDoPhanGiai());
            pre1.setString(6, hh.getKichThuocMH());
            pre1.setString(7, hh.getMatCamUng());
            pre1.setString(8, hh.getCamSau());
            pre1.setString(9, hh.getQuayPhim());
            pre1.setString(10, hh.getDenFlash());
            pre1.setString(11, hh.getChupNangCao());
            pre1.setString(12, hh.getCamTruoc());
            pre1.setString(13, hh.getVideoCall());
            pre1.setString(14, hh.getInfoThem());
            pre1.setString(15, hh.getHDH());
            pre1.setString(16, hh.getChip());
            pre1.setString(17, hh.getTocDoCPU());
            pre1.setString(18, hh.getChipDoHoa());
            pre1.setString(19, hh.getRAM());
            pre1.setString(20, hh.getBoNhoTrong());
            pre1.setString(21, hh.getWifi());
            pre1.setString(22, hh.getBluetooth());
            pre1.setString(23, hh.getCongKetNoi());
            pre1.setString(24, hh.getKetNoiKhac());
            pre1.setString(25, hh.getThietKe());
            pre1.setString(26, hh.getChatLieu());
            pre1.setString(27, hh.getKichThuoc());
            pre1.setString(28, hh.getDLPin());
            pre1.setString(29, hh.getLoaiPin());
            pre1.setString(30, hh.getCongNghePin());
            pre1.setString(31, hh.getBaoMatNC());
            pre1.setString(32, hh.getTinhNangNew());
            pre1.setString(33, sdf.format(hh.getNgayRaMat()));
            pre1.setString(34, hh.getCNAmThanh());
            pre1.setString(35, hh.getTrongLuong());
            pre1.setInt(36, hh.getSoLuong());
            pre1.setString(37, hh.getChuThich());
            pre1.setString(38, hh.getLinkAnh());
            pre1.setString(39, hh.getTrangThai());
            pre1.setString(40, hh.getLinkAnhBia());
            if (pre1.executeUpdate() != 0) {
                return 1;
            }
            pre1.close();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(HangHoaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return -1;
    }

    public int updateItems(HangHoa hh) {
        conn = new ConnectDB().getConnect();
        try {
            pre2 = conn.prepareStatement("UPDATE `sanpham` SET `MaLoaiSP`=?,`TenSP`=?,`Gia`=?,`CongNgheMH`=?,`DoPhanGiai`=?,`KichThuocMH`=?,`MatCamUng`=?,`CamSau`=?,`QuayPhim`=?,"
                    + "`DenFlash`=?,`ChupNangCao`=?,`CamTruoc`=?,`VideoCall`=?,`InfoThem`=?,`HDH`=?,`Chip`=?,`TocDoCPU`=?,`ChipDoHoa`=?,`RAM`=?,`BoNhoTrong`=?,`Wifi`=?,`Bluetooth`=?,"
                    + "`CongKetNoi`=?,`KetNoiKhac`=?,`ThietKe`=?,`ChatLieu`=?,`KichThuoc`=?,`DLPin`=?,`LoaiPin`=?,`CongNghePin`=?,`BaoMatNC`=?,`TinhNangNew`=?,`NgayRaMat`=?,"
                    + "`CNAmThanh`=?,`TrongLuong`=?,`SoLuong`=?,`ChuThich`=?,`linkAnh`=?,`TrangThai`=?,`LinkAnhBia`=? WHERE `MaSP`=?");
            pre2.setInt(1, hh.getMaLoaiSP().getId());
            pre2.setString(2, hh.getTenSP());
            pre2.setDouble(3, hh.getGia());
            pre2.setString(4, hh.getCongNgheMH());
            pre2.setString(5, hh.getDoPhanGiai());
            pre2.setString(6, hh.getKichThuocMH());
            pre2.setString(7, hh.getMatCamUng());
            pre2.setString(8, hh.getCamSau());
            pre2.setString(9, hh.getQuayPhim());
            pre2.setString(10, hh.getDenFlash());
            pre2.setString(11, hh.getChupNangCao());
            pre2.setString(12, hh.getCamTruoc());
            pre2.setString(13, hh.getVideoCall());
            pre2.setString(14, hh.getInfoThem());
            pre2.setString(15, hh.getHDH());
            pre2.setString(16, hh.getChip());
            pre2.setString(17, hh.getTocDoCPU());
            pre2.setString(18, hh.getChipDoHoa());
            pre2.setString(19, hh.getRAM());
            pre2.setString(20, hh.getBoNhoTrong());
            pre2.setString(21, hh.getWifi());
            pre2.setString(22, hh.getBluetooth());
            pre2.setString(23, hh.getCongKetNoi());
            pre2.setString(24, hh.getKetNoiKhac());
            pre2.setString(25, hh.getThietKe());
            pre2.setString(26, hh.getChatLieu());
            pre2.setString(27, hh.getKichThuoc());
            pre2.setString(28, hh.getDLPin());
            pre2.setString(29, hh.getLoaiPin());
            pre2.setString(30, hh.getCongNghePin());
            pre2.setString(31, hh.getBaoMatNC());
            pre2.setString(32, hh.getTinhNangNew());
            pre2.setString(33, sdf.format(hh.getNgayRaMat()));
            pre2.setString(34, hh.getCNAmThanh());
            pre2.setString(35, hh.getTrongLuong());
            pre2.setInt(36, hh.getSoLuong());
            pre2.setString(37, hh.getChuThich());
            pre2.setString(38, hh.getLinkAnh());
            pre2.setString(39, hh.getTrangThai());
            pre2.setString(40, hh.getLinkAnhBia());
            pre2.setString(41, hh.getMaSP());
            if (pre2.executeUpdate() != 0) {
                return 1;
            }
            pre2.close();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(HangHoaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return -1;
    }

    public int deleteItems(String maSP) {
        conn = new ConnectDB().getConnect();
        try {
            pre3 = conn.prepareStatement("DELETE FROM `sanpham` WHERE `MaSP` = ?");
            pre3.setString(1, maSP);
            if (pre3.executeUpdate() != 0) {
                return 1;
            }
            pre3.close();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(HangHoaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return -1;
    }

    public HangHoa getHangHoaByID(String id) {
        try {
            HangHoaDAO hhDAO = new HangHoaDAO();
            for (int i = 0; i < hhDAO.getAllItems().size(); i++) {
                HangHoa hh = new HangHoa();
                if (hhDAO.getAllItems().get(i).getMaSP().equals(id)) {
                    hh.setMaSP(id + "");
                    hh.setMaLoaiSP(hhDAO.getAllItems().get(i).getMaLoaiSP());
                    hh.setTenSP(hhDAO.getAllItems().get(i).getTenSP());
                    hh.setGia(hhDAO.getAllItems().get(i).getGia());
                    hh.setCongNgheMH(hhDAO.getAllItems().get(i).getCongNgheMH());
                    hh.setDoPhanGiai(hhDAO.getAllItems().get(i).getDoPhanGiai());
                    hh.setKichThuocMH(hhDAO.getAllItems().get(i).getKichThuocMH());
                    hh.setMatCamUng(hhDAO.getAllItems().get(i).getMatCamUng());
                    hh.setCamSau(hhDAO.getAllItems().get(i).getCamSau());
                    hh.setQuayPhim(hhDAO.getAllItems().get(i).getQuayPhim());
                    hh.setDenFlash(hhDAO.getAllItems().get(i).getDenFlash());
                    hh.setChupNangCao(hhDAO.getAllItems().get(i).getChupNangCao());
                    hh.setCamTruoc(hhDAO.getAllItems().get(i).getCamTruoc());
                    hh.setVideoCall(hhDAO.getAllItems().get(i).getVideoCall());
                    hh.setInfoThem(hhDAO.getAllItems().get(i).getInfoThem());
                    hh.setHDH(hhDAO.getAllItems().get(i).getHDH());
                    hh.setChip(hhDAO.getAllItems().get(i).getChip());
                    hh.setTocDoCPU(hhDAO.getAllItems().get(i).getTocDoCPU());
                    hh.setChipDoHoa(hhDAO.getAllItems().get(i).getChipDoHoa());
                    hh.setRAM(hhDAO.getAllItems().get(i).getRAM());
                    hh.setBoNhoTrong(hhDAO.getAllItems().get(i).getBoNhoTrong());
                    hh.setWifi(hhDAO.getAllItems().get(i).getWifi());
                    hh.setBluetooth(hhDAO.getAllItems().get(i).getBluetooth());
                    hh.setCongKetNoi(hhDAO.getAllItems().get(i).getCongKetNoi());
                    hh.setKetNoiKhac(hhDAO.getAllItems().get(i).getKetNoiKhac());
                    hh.setThietKe(hhDAO.getAllItems().get(i).getThietKe());
                    hh.setChatLieu(hhDAO.getAllItems().get(i).getChatLieu());
                    hh.setKichThuoc(hhDAO.getAllItems().get(i).getKichThuoc());
                    hh.setDLPin(hhDAO.getAllItems().get(i).getDLPin());
                    hh.setLoaiPin(hhDAO.getAllItems().get(i).getLoaiPin());
                    hh.setCongNghePin(hhDAO.getAllItems().get(i).getCongNghePin());
                    hh.setBaoMatNC(hhDAO.getAllItems().get(i).getBaoMatNC());
                    hh.setTinhNangNew(hhDAO.getAllItems().get(i).getTinhNangNew());
                    hh.setNgayRaMat(hhDAO.getAllItems().get(i).getNgayRaMat());
                    hh.setCNAmThanh(hhDAO.getAllItems().get(i).getCNAmThanh());
                    hh.setTrongLuong(hhDAO.getAllItems().get(i).getTrongLuong());
                    hh.setSoLuong(hhDAO.getAllItems().get(i).getSoLuong());
                    hh.setChuThich(hhDAO.getAllItems().get(i).getChuThich());
                    hh.setLinkAnh(hhDAO.getAllItems().get(i).getLinkAnh());
                    hh.setTrangThai(hhDAO.getAllItems().get(i).getTrangThai());
                    hh.setLinkAnhBia(hhDAO.getAllItems().get(i).getLinkAnhBia());
                    return hh;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(HangHoaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

}
