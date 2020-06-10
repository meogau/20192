/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thainguyen.dao;

import com.thainguyen.model.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Admin
 */
public class DonThuocDAO {

    public static Connection conn = DBConnection.getConnection();

    public void createNewPrecription(int id) throws SQLException {
        String sql = "INSERT INTO `project2_db`.`don_thuoc` (`ID_HO_SO`) VALUES ('" + id + "');";
        System.out.println(sql);
        Statement st = conn.createStatement();
        st.executeUpdate(sql);
    }

    public void updateStatus(int id, int status) throws SQLException {
        Statement st = conn.createStatement();
        String sql = "UPDATE `project2_db`.`don_thuoc` SET `trang_thai` = '" + status + "' WHERE (`ID_HO_SO` = '" + id + "');";
       System.out.println(sql);
        st.executeUpdate(sql);
    }

    public void updateDrug1(int id, String name, int number) throws SQLException {
        Statement st = conn.createStatement();
        String sql = "UPDATE `project2_db`.`don_thuoc` SET `TEN_THUOC_1` = '" + name + "', `SO_LUONG_1` = '" + number + "' WHERE (`ID_HO_SO` = '" + id + "');";
        
        System.out.println(sql);st.executeUpdate(sql);

    }

    public void updateDrug2(int id, String name, int number) throws SQLException {
        Statement st = conn.createStatement();
        String sql = "UPDATE `project2_db`.`don_thuoc` SET `TEN_THUOC_2` = '" + name + "', `SO_LUONG_2` = '" + number + "' WHERE (`ID_HO_SO` = '" + id + "');";
        System.out.println(sql);st.executeUpdate(sql);
    }

    public void updateDrug3(int id, String name, int number) throws SQLException {
        Statement st = conn.createStatement();
        String sql = "UPDATE `project2_db`.`don_thuoc` SET `TEN_THUOC_3` = '" + name + "', `SO_LUONG_3` = '" + number + "' WHERE (`ID_HO_SO` = '" + id + "');";
       System.out.println(sql); st.executeUpdate(sql);

    }

    public void updateDrug4(int id, String name, int number) throws SQLException {
        Statement st = conn.createStatement();
        String sql = "UPDATE `project2_db`.`don_thuoc` SET `TEN_THUOC_4` = '" + name + "', `SO_LUONG_4` = '" + number + "' WHERE (`ID_HO_SO` = '" + id + "');";
       System.out.println(sql); st.executeUpdate(sql);

    }

    public void updateDrug5(int id, String name, int number) throws SQLException {
        Statement st = conn.createStatement();
        String sql = "UPDATE `project2_db`.`don_thuoc` SET `TEN_THUOC_5` = '" + name + "', `SO_LUONG_5` = '" + number + "' WHERE (`ID_HO_SO` = '" + id + "');";
       System.out.println(sql); st.executeUpdate(sql);

    }
    public DonThuoc getFirstPrescription() throws SQLException{
    DonThuoc donthuoc = new DonThuoc();
    String sql = "select * from don_thuoc where trang_thai =1";
    Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery(sql);
        while(rs.next()){
        donthuoc.setIdHoSo(rs.getInt("id_ho_so"));
        donthuoc.setTenThuoc1(rs.getString("ten_thuoc_1"));
        donthuoc.setSoLuong1(rs.getInt("so_luong_1"));
        donthuoc.setTenThuoc2(rs.getString("ten_thuoc_2"));
        donthuoc.setSoLuong2(rs.getInt("so_luong_2"));
        donthuoc.setTenThuoc3(rs.getString("ten_thuoc_3"));
        donthuoc.setSoLuong3(rs.getInt("so_luong_3"));
        donthuoc.setTenThuoc4(rs.getString("ten_thuoc_4"));
        donthuoc.setSoLuong4(rs.getInt("so_luong_4"));
        donthuoc.setTenThuoc5(rs.getString("ten_thuoc_5"));
        donthuoc.setSoLuong5(rs.getInt("so_luong-5"));
        return donthuoc;
        }
    return donthuoc;
    }
}
