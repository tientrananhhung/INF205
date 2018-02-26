/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;

/**
 *
 * @author Tien Tran
 */
public class HangHoa {

    private String maSP;
    private LoaiHang maLoaiSP;
    private String tenSP;
    private double gia;
    private String congNgheMH;
    private String doPhanGiai;
    private String kichThuocMH;
    private String matCamUng;
    private String camSau;
    private String quayPhim;
    private String denFlash;
    private String chupNangCao;
    private String camTruoc;
    private String videoCall;
    private String infoThem;
    private String HDH;
    private String chip;
    private String tocDoCPU;
    private String chipDoHoa;
    private String RAM;
    private String boNhoTrong;
    private String wifi;
    private String bluetooth;
    private String congKetNoi;
    private String ketNoiKhac;
    private String thietKe;
    private String chatLieu;
    private String kichThuoc;
    private String DLPin;
    private String loaiPin;
    private String congNghePin;
    private String baoMatNC;
    private String tinhNangNew;
    private Date ngayRaMat;
    private String CNAmThanh;
    private String trongLuong;
    private int soLuong;
    private String chuThich;
    private String linkAnh;
    private String trangThai;
    private String linkAnhBia;

    public HangHoa() {
    }

    public HangHoa(String maSP, LoaiHang maLoaiSP, String tenSP, double gia, String congNgheMH, String doPhanGiai, String kichThuocMH, String matCamUng, String camSau, String quayPhim, String denFlash, String chupNangCao, String camTruoc, String videoCall, String infoThem, String HDH, String chip, String tocDoCPU, String chipDoHoa, String RAM, String boNhoTrong, String wifi, String bluetooth, String congKetNoi, String ketNoiKhac, String thietKe, String chatLieu, String kichThuoc, String DLPin, String loaiPin, String congNghePin, String baoMatNC, String tinhNangNew, Date ngayRaMat, String CNAmThanh, String trongLuong, int soLuong, String chuThich, String linkAnh, String trangThai, String linkAnhBia) {
        this.maSP = maSP;
        this.maLoaiSP = maLoaiSP;
        this.tenSP = tenSP;
        this.gia = gia;
        this.congNgheMH = congNgheMH;
        this.doPhanGiai = doPhanGiai;
        this.kichThuocMH = kichThuocMH;
        this.matCamUng = matCamUng;
        this.camSau = camSau;
        this.quayPhim = quayPhim;
        this.denFlash = denFlash;
        this.chupNangCao = chupNangCao;
        this.camTruoc = camTruoc;
        this.videoCall = videoCall;
        this.infoThem = infoThem;
        this.HDH = HDH;
        this.chip = chip;
        this.tocDoCPU = tocDoCPU;
        this.chipDoHoa = chipDoHoa;
        this.RAM = RAM;
        this.boNhoTrong = boNhoTrong;
        this.wifi = wifi;
        this.bluetooth = bluetooth;
        this.congKetNoi = congKetNoi;
        this.ketNoiKhac = ketNoiKhac;
        this.thietKe = thietKe;
        this.chatLieu = chatLieu;
        this.kichThuoc = kichThuoc;
        this.DLPin = DLPin;
        this.loaiPin = loaiPin;
        this.congNghePin = congNghePin;
        this.baoMatNC = baoMatNC;
        this.tinhNangNew = tinhNangNew;
        this.ngayRaMat = ngayRaMat;
        this.CNAmThanh = CNAmThanh;
        this.trongLuong = trongLuong;
        this.soLuong = soLuong;
        this.chuThich = chuThich;
        this.linkAnh = linkAnh;
        this.trangThai = trangThai;
        this.linkAnhBia = linkAnhBia;
    }

    public String getMaSP() {
        return maSP;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public LoaiHang getMaLoaiSP() {
        return maLoaiSP;
    }

    public void setMaLoaiSP(LoaiHang maLoaiSP) {
        this.maLoaiSP = maLoaiSP;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public String getCongNgheMH() {
        return congNgheMH;
    }

    public void setCongNgheMH(String congNgheMH) {
        this.congNgheMH = congNgheMH;
    }

    public String getDoPhanGiai() {
        return doPhanGiai;
    }

    public void setDoPhanGiai(String doPhanGiai) {
        this.doPhanGiai = doPhanGiai;
    }

    public String getKichThuocMH() {
        return kichThuocMH;
    }

    public void setKichThuocMH(String kichThuocMH) {
        this.kichThuocMH = kichThuocMH;
    }

    public String getMatCamUng() {
        return matCamUng;
    }

    public void setMatCamUng(String matCamUng) {
        this.matCamUng = matCamUng;
    }

    public String getCamSau() {
        return camSau;
    }

    public void setCamSau(String camSau) {
        this.camSau = camSau;
    }

    public String getQuayPhim() {
        return quayPhim;
    }

    public void setQuayPhim(String quayPhim) {
        this.quayPhim = quayPhim;
    }

    public String getDenFlash() {
        return denFlash;
    }

    public void setDenFlash(String denFlash) {
        this.denFlash = denFlash;
    }

    public String getChupNangCao() {
        return chupNangCao;
    }

    public void setChupNangCao(String chupNangCao) {
        this.chupNangCao = chupNangCao;
    }

    public String getCamTruoc() {
        return camTruoc;
    }

    public void setCamTruoc(String camTruoc) {
        this.camTruoc = camTruoc;
    }

    public String getVideoCall() {
        return videoCall;
    }

    public void setVideoCall(String videoCall) {
        this.videoCall = videoCall;
    }

    public String getInfoThem() {
        return infoThem;
    }

    public void setInfoThem(String infoThem) {
        this.infoThem = infoThem;
    }

    public String getHDH() {
        return HDH;
    }

    public void setHDH(String HDH) {
        this.HDH = HDH;
    }

    public String getChip() {
        return chip;
    }

    public void setChip(String chip) {
        this.chip = chip;
    }

    public String getTocDoCPU() {
        return tocDoCPU;
    }

    public void setTocDoCPU(String tocDoCPU) {
        this.tocDoCPU = tocDoCPU;
    }

    public String getChipDoHoa() {
        return chipDoHoa;
    }

    public void setChipDoHoa(String chipDoHoa) {
        this.chipDoHoa = chipDoHoa;
    }

    public String getRAM() {
        return RAM;
    }

    public void setRAM(String RAM) {
        this.RAM = RAM;
    }

    public String getBoNhoTrong() {
        return boNhoTrong;
    }

    public void setBoNhoTrong(String boNhoTrong) {
        this.boNhoTrong = boNhoTrong;
    }

    public String getWifi() {
        return wifi;
    }

    public void setWifi(String wifi) {
        this.wifi = wifi;
    }

    public String getBluetooth() {
        return bluetooth;
    }

    public void setBluetooth(String bluetooth) {
        this.bluetooth = bluetooth;
    }

    public String getCongKetNoi() {
        return congKetNoi;
    }

    public void setCongKetNoi(String congKetNoi) {
        this.congKetNoi = congKetNoi;
    }

    public String getKetNoiKhac() {
        return ketNoiKhac;
    }

    public void setKetNoiKhac(String ketNoiKhac) {
        this.ketNoiKhac = ketNoiKhac;
    }

    public String getThietKe() {
        return thietKe;
    }

    public void setThietKe(String thietKe) {
        this.thietKe = thietKe;
    }

    public String getChatLieu() {
        return chatLieu;
    }

    public void setChatLieu(String chatLieu) {
        this.chatLieu = chatLieu;
    }

    public String getKichThuoc() {
        return kichThuoc;
    }

    public void setKichThuoc(String kichThuoc) {
        this.kichThuoc = kichThuoc;
    }

    public String getDLPin() {
        return DLPin;
    }

    public void setDLPin(String DLPin) {
        this.DLPin = DLPin;
    }

    public String getLoaiPin() {
        return loaiPin;
    }

    public void setLoaiPin(String loaiPin) {
        this.loaiPin = loaiPin;
    }

    public String getCongNghePin() {
        return congNghePin;
    }

    public void setCongNghePin(String congNghePin) {
        this.congNghePin = congNghePin;
    }

    public String getBaoMatNC() {
        return baoMatNC;
    }

    public void setBaoMatNC(String baoMatNC) {
        this.baoMatNC = baoMatNC;
    }

    public String getTinhNangNew() {
        return tinhNangNew;
    }

    public void setTinhNangNew(String tinhNangNew) {
        this.tinhNangNew = tinhNangNew;
    }

    public Date getNgayRaMat() {
        return ngayRaMat;
    }

    public void setNgayRaMat(Date ngayRaMat) {
        this.ngayRaMat = ngayRaMat;
    }

    public String getCNAmThanh() {
        return CNAmThanh;
    }

    public void setCNAmThanh(String CNAmThanh) {
        this.CNAmThanh = CNAmThanh;
    }

    public String getTrongLuong() {
        return trongLuong;
    }

    public void setTrongLuong(String trongLuong) {
        this.trongLuong = trongLuong;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public String getChuThich() {
        return chuThich;
    }

    public void setChuThich(String chuThich) {
        this.chuThich = chuThich;
    }

    public String getLinkAnh() {
        return linkAnh;
    }

    public void setLinkAnh(String linkAnh) {
        this.linkAnh = linkAnh;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

    public String getLinkAnhBia() {
        return linkAnhBia;
    }

    public void setLinkAnhBia(String linkAnhBia) {
        this.linkAnhBia = linkAnhBia;
    }

}
