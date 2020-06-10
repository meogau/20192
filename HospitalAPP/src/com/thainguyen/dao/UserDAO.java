/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thainguyen.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Admin
 */
public class UserDAO {

    public static int checkuser(String username, String password) throws SQLException {
        Connection conn = DBConnection.getConnection();
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery("Select * from User");
        while (rs.next()) {
            System.out.println("Username : " + rs.getString("username") + "pass: " + rs.getString("password"));
            if (rs.getString("username").equals(username)) {
                if (rs.getString("password").equals(password)) {
                    return rs.getInt("access");
                } else {
                    return 0;
                }
            }
        }
        return 0;
    }


}
