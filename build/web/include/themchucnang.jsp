<%-- 
    Document   : themchucnang
    Created on : 18-Oct-2017, 18:35:03
    Author     : Tien Tran
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<div class="container chuc-nang">
    <div class="row">
        <div class="col-md-6">
            <aside class="mobile-card" data-toggle="buttons">
                <h3>MUA MÃ THẺ CÀO ĐIỆN THOẠI</h3>
                <label class="btn btn-outline-success">
                    <input type="radio" name="menhgia" value="50000"/>50.000
                </label>
                <label class="btn btn-outline-success active">
                    <input type="radio" name="menhgia" value="100000" />100.000
                </label>
                <label class="btn btn-outline-success">
                    <input type="radio" name="menhgia" value="200000"/>200.000
                </label>
                <label class="btn btn-outline-success">
                    <input type="radio" name="menhgia" value="500000"/>500.000
                </label>
                <div>
                    Thành tiền: <div id="tien">98.000đ</div>
                </div>
                <form>
                    <div class="input-group">
                        <input type="text" class="form-control" placeholder="Nhập SĐT nhận mã thẻ" aria-label="Username" aria-describedby="basic-addon1">
                        <button type="button" class="btn btn-primary btn-card">Dùng thẻ ATM</button>
                        <button type="button" class="btn btn-primary btn-card">Dùng thẻ VISA</button>
                    </div>
                </form>
            </aside>

        </div>
        <div class="col-md-6">
            <aside class="mobile-card" data-toggle="buttons">
                <h3>ĐÓNG TIỀN TRẢ GÓP</h3>
                <div class="input-group">
                    <input type="text" class="form-control" placeholder="Nhập SĐT nhận mã thẻ" aria-label="Username" aria-describedby="basic-addon1">
                    <button type="button" class="btn btn-primary btn-card">Kiểm Tra</button>
                </div>
                <div class="helplink">
                    <span>Hướng dẫn xem mã khách hàng:</span>
                    <a href="#">Home Credit</a>
                    <a href="#">• FE Credit/VPBank</a>
                    <a href="#">• ACS</a>
                    <a href="#">• HD SaiSon</a>
                </div>
            </aside>
        </div>
    </div>
</div>
