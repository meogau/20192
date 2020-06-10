/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thainguyen.dao;

import static com.thainguyen.dao.HoSoDAO.conn;
import com.thainguyen.model.BenhNhan;
import com.thainguyen.model.HoSo;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.naming.spi.DirStateFactory;

/**
 *
 * @author Admin
 */
public class BenhNhanDAO {

    public static final Connection conn = DBConnection.getConnection();

    public boolean checkID(int id) throws SQLException {
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery("select * from benh_nhan");
        while (rs.next()) {
            if (rs.getInt("id") == id) {
                return true;
            }
        }

        return false;
    }
   public  BenhNhan findPatient(int id) throws SQLException {
        BenhNhan benhnhan = new BenhNhan();
        String sql = "select * from BENH_NHAN where ID= " + id;
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery(sql);
        benhnhan.setId(id);
        while (rs.next()) {
            benhnhan.setTen(rs.getString("TEN"));
            benhnhan.setDiaChi(rs.getString("DIA_CHI"));
            benhnhan.setNgaySinh(rs.getString("NGAY_SINH"));
            benhnhan.setSoBh(rs.getString("SO_BH"));

        }
        return benhnhan;
    }
    public void createNewProfile(BenhNhan benhnhan ) throws SQLException{
        Statement st = conn.createStatement();
        String sql = "INSERT INTO `project2_db`.`benh_nhan` (`ID`, `TEN`, `NGAY_SINH`, `DIA_CHI`, `SO_BH`) VALUES (";
        sql= sql +"'"+benhnhan.getId()+"', ";
        sql= sql +"'"+benhnhan.getTen()+"' ,";
        sql= sql +"'"+benhnhan.getNgaySinh()+"', ";
        sql= sql +"'"+benhnhan.getDiaChi()+"', ";
        sql= sql +"'"+benhnhan.getSoBh()+"') ";
        System.out.println(sql);
        st.executeUpdate(sql);
    }
    public HoSo findHistoryFile(int benhnhanID) throws SQLException{
    HoSo hoso = new HoSo();
    Statement st = conn.createStatement();
    String sql = "select * from ho_so where id_benh_nhan="+benhnhanID+" and trang_thai =0";
    ResultSet rs = st.executeQuery(sql);
    while(rs.next()){
    hoso.setIdBenhNhan(benhnhanID);
    hoso.setChanDoan(rs.getString("chan_doan"));
    hoso.setIdHoSo(rs.getInt("ID_HO_SO"));
    hoso.setTrieuChung(rs.getString("trieu_chung"));
    hoso.setKetLuan(rs.getString("ket_luan"));
    hoso.setXetNghiem(rs.getString("xet_nghiem"));
    
    }
    return hoso;
    }
}
