/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thainguyen.dao;

import com.thainguyen.*;
import com.thainguyen.model.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Admin
 */
public class HoSoDAO {

    public static Connection conn = DBConnection.getConnection();

    public int createNewFile(int  id_benhnhan) throws SQLException {
        Statement st = conn.createStatement();
        String sql = "INSERT INTO `project2_db`.`ho_so` (`ID_BENH_NHAN`, `TRANG_THAI`) VALUES ('" + id_benhnhan + "', '1');";
        st.executeUpdate(sql);
        sql = "select * from ho_so";
        int id =0;
        ResultSet rs = st.executeQuery(sql);
        while(rs.next())
        {
        id = rs.getInt("id_ho_so");
        }
        
        
        return id;
    }

    public  HoSo getFirstFile() throws SQLException {
        HoSo hoso = new HoSo();
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery("select * from HO_SO");
        while (rs.next()) {
            if (rs.getInt("TRANG_THAI") == 1) {
                hoso.setIdHoSo(rs.getInt("id_ho_so"));
                hoso.setIdBenhNhan(rs.getInt("ID_BENH_NHAN"));
                hoso.setChanDoan(rs.getString("CHAN_DOAN"));
                hoso.setTrieuChung(rs.getString("TRIEU_CHUNG"));
                hoso.setXetNghiem(rs.getString("XET_NGHIEM"));
                return hoso;
            }
        }

        return hoso;

    }
    public  HoSo getFirstTestFile() throws SQLException {
        HoSo hoso = new HoSo();
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery("select * from HO_SO");
        while (rs.next()) {
            if (rs.getInt("TRANG_THAI") == 2) {
                hoso.setIdHoSo(rs.getInt("id_ho_so"));
                hoso.setIdBenhNhan(rs.getInt("ID_BENH_NHAN"));
                hoso.setChanDoan(rs.getString("CHAN_DOAN"));
                hoso.setTrieuChung(rs.getString("TRIEU_CHUNG"));
                hoso.setXetNghiem(rs.getString("XET_NGHIEM"));
                return hoso;
            }
        }

        return hoso;

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
             return benhnhan;
        }
        return benhnhan;
    }

    public  void updateSymptom(HoSo hoso, String symptom) throws SQLException {
        String sql = "UPDATE `project2_db`.`ho_so` SET `TRIEU_CHUNG` = '" + symptom + "' WHERE (`ID_HO_SO` = '" + hoso.getIdHoSo() + "');";
        Statement st = conn.createStatement();
        st.executeUpdate(sql);
    }
    public  void updateDiagnose(HoSo hoso, String diagnore) throws SQLException {
        String sql = "UPDATE `project2_db`.`ho_so` SET `CHAN_DOAN` = '" + diagnore + "' WHERE (`ID_HO_SO` = '" + hoso.getIdHoSo() + "');";
        Statement st = conn.createStatement();
        st.executeUpdate(sql);
    }
    public  void updateTestResult(int id, String result) throws SQLException {
        String sql = "UPDATE `project2_db`.`ho_so` SET `XET_NGHIEM` = '" + result + "' WHERE (`ID_HO_SO` = '" + id + "');";
        Statement st = conn.createStatement();
        st.executeUpdate(sql);
    }
public  void updateConclusion(HoSo hoso, String conclusion) throws SQLException {
        String sql = "UPDATE `project2_db`.`ho_so` SET `Ket_luan` = '" + conclusion + "' WHERE (`ID_HO_SO` = '" + hoso.getIdHoSo() + "');";
        Statement st = conn.createStatement();
        st.executeUpdate(sql);
    }
public  void updateStatus(int id, int status) throws SQLException {
        String sql = "UPDATE `project2_db`.`ho_so` SET `trang_thai` = '" + status+ "' WHERE (`ID_HO_SO` = '" + id + "');";
        Statement st = conn.createStatement();
        st.executeUpdate(sql);
    }
 public HoSo findFile(int id) throws SQLException{
 HoSo hoso = new HoSo();
 Statement st = conn.createStatement();
 String sql = "select * from Ho_so where ID_ho_so= " + id;
 ResultSet rs = st.executeQuery(sql);
 while(rs.next()){
     hoso.setIdBenhNhan(rs.getInt("id_benh_nhan"));
     hoso.setIdHoSo(id);
     hoso.setChanDoan(rs.getString("chan_doan"));
     hoso.setTrieuChung(rs.getString("trieu_chung"));
     hoso.setXetNghiem(rs.getString("xet_nghiem"));
     hoso.setKetLuan(rs.getString("ket_luan"));
 }
 return hoso ;
 }
}
