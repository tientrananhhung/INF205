<%-- 
    Document   : homeproduct
    Created on : 17-Oct-2017, 13:35:35
    Author     : Tien Tran
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="java.text.DecimalFormat"%>
<%@page import="model.HangHoaDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%HangHoaDAO hhDAO = new HangHoaDAO();%>
<% DecimalFormat formatter = new DecimalFormat("###,###,###"); %>
<div class="container">
    <div class="row">
        <%for (int i = 0; i < hhDAO.getAllItems().size(); i++) {%>
        <div class="col-md-4 home-sp">
            <div class="homeproduct">

                <c:choose>
                    <c:when test="${USERNAME != null}">
                        <a href='<%="DelItemsServlet?action=View&MaSP=" + hhDAO.getAllItems().get(i).getMaSP() + "&id="%>${USERNAME}'>
                            <img src='<%="images/" + hhDAO.getAllItems().get(i).getLinkAnhBia()%>' alt="tientahpd01815"/>
                            <h3><%=hhDAO.getAllItems().get(i).getTenSP()%></h3>
                            <strong><%=formatter.format(hhDAO.getAllItems().get(i).getGia())%><sup>đ</sup></strong>
                        </a>
                    </c:when>
                    <c:when test="${USER != null}">
                        <a href='<%="DelItemsServlet?action=View&MaSP=" + hhDAO.getAllItems().get(i).getMaSP() + "&id="%>${USER}'>
                            <img src='<%="images/" + hhDAO.getAllItems().get(i).getLinkAnhBia()%>' alt="tientahpd01815"/>
                            <h3><%=hhDAO.getAllItems().get(i).getTenSP()%></h3>
                            <strong><%=formatter.format(hhDAO.getAllItems().get(i).getGia())%><sup>đ</sup></strong>
                        </a>
                    </c:when>
                    <c:otherwise>
                        <a href='<%="DelItemsServlet?action=View&MaSP=" + hhDAO.getAllItems().get(i).getMaSP()%>'>
                            <img src='<%="images/" + hhDAO.getAllItems().get(i).getLinkAnhBia()%>' alt="tientahpd01815"/>
                            <h3><%=hhDAO.getAllItems().get(i).getTenSP()%></h3>
                            <strong><%=formatter.format(hhDAO.getAllItems().get(i).getGia())%><sup>đ</sup></strong>
                        </a>
                    </c:otherwise>
                </c:choose>
                <figure class="bginfo">
                    <span class="name"><%=hhDAO.getAllItems().get(i).getTenSP()%></span>
                    <span><strong><%=formatter.format(hhDAO.getAllItems().get(i).getGia())%>₫</strong></span>
                    <span>Màn hình: <%=hhDAO.getAllItems().get(i).getKichThuocMH()%></span>
                    <span>HĐH: <%=hhDAO.getAllItems().get(i).getHDH()%></span>
                    <span>CPU: <%=hhDAO.getAllItems().get(i).getChip()%></span>
                    <span>RAM: <%=hhDAO.getAllItems().get(i).getRAM()%>, ROM: <%=hhDAO.getAllItems().get(i).getBoNhoTrong()%></span>
                    <span>Camera: <%=hhDAO.getAllItems().get(i).getCamSau()%>, Selfie: <%=hhDAO.getAllItems().get(i).getCamTruoc()%></span>
                    <span>PIN: <%=hhDAO.getAllItems().get(i).getDLPin()%></span>
                </figure>
            </div>
        </div>
        <%}%>
    </div>
</div>
