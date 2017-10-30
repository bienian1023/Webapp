package com.webapp.models;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Users {
    public boolean authentication(String username, String password) {
        String usernames = null;
        boolean bln = false;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/webapp", "root", "");
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM user WHERE username='"+username+"' AND password='"+password+"'");
            while (rs.next()) {
                usernames = rs.getString("username");
                if(!usernames.equals("") || !usernames.equals(null))
                    bln = true;
            }
            st.close();
            rs.close();
            conn.close();
        } catch (Exception e) {

        }
        return bln;
    }

}
