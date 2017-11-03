package com.webapp.models;

import java.sql.*;
import java.util.Arrays;

/**
 * Created by Ian on 30/10/2017.
 */
public class Students {
    Connection conn;
    Statement st;
    ResultSet rs;
    public ResultSet GetData(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/webapp", "root", "");
            st = conn.createStatement();
            rs = st.executeQuery("SELECT * FROM students");
        } catch (Exception e) {

        }
        return rs;
    }
    public void Close(){
        try{
            st.close();
            rs.close();
            conn.close();
        }
        catch (Exception e){
        }
    }
    public String[] GetStudent (int studentID){
        String[] StudentsArr = new String[12];
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/webapp", "root", "");
            st = conn.createStatement();
            rs = st.executeQuery("SELECT * FROM students WHERE id ='"+studentID+"'");
            while (rs.next()) {
                StudentsArr[0] = rs.getString("id");
                StudentsArr[1] = rs.getString("student_no");
                StudentsArr[2] = rs.getString("first_name");
                StudentsArr[3] = rs.getString("middle_name");
                StudentsArr[4] = rs.getString("last_name");
                StudentsArr[5] = rs.getString("birthdate");
                StudentsArr[6] = rs.getString("email");
                StudentsArr[7] = rs.getString("contact_no");
                StudentsArr[8] = rs.getString("address");
                StudentsArr[9] = rs.getString("gender");
                StudentsArr[10] = rs.getString("course");
                StudentsArr[11] = rs.getString("image");

            }
        } catch (Exception e) {}
        return StudentsArr;
    }
}

