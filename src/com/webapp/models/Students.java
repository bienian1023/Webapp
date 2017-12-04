package com.webapp.models;

import java.io.PrintWriter;
import java.sql.*;
import java.util.Arrays;

/**
 * Created by Ian on 30/10/2017.
 */
public class Students {
    Connection conn;
    PreparedStatement ps;
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

    public String updateStudent(String id,
                                 String student_no,
                                 String first_name,
                                 String middle_name,
                                 String last_name,
                                 String birthdate,
                                 String email,
                                 String contact_no,
                                 String address,
                                 String gender,
                                 String course){
        boolean bln = false;
        String debug = null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/webapp", "root", "");
            String sql = "UPDATE students set " +
                    "first_name=?, " +
                    "middle_name=?, " +
                    "last_name=?, " +
                    "birthdate=?, " +
                    "email=?, " +
                    "contact_no=?, " +
                    "address=?, " +
                    "gender=?, " +
                    "course=? " +
                    "WHERE id=?";
            ps = conn.prepareStatement(sql);
            ps.setString( 1, first_name);
            ps.setString( 2, middle_name);
            ps.setString( 3, last_name);
            ps.setString( 4, birthdate);
            ps.setString( 5, email);
            ps.setString( 6, contact_no);
            ps.setString( 7, address);
            ps.setString( 8, gender);
            ps.setString( 9, course);
            ps.setString( 10, id);

            int result = ps.executeUpdate();
            if ( result > 0){
                bln = true;
            }
        } catch (Exception e){ debug=e.getMessage(); }
        return debug;
    }
    public ResultSet searchStudent(String search){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/webapp", "root", "");
            st = conn.createStatement();
            rs = st.executeQuery("SELECT * FROM students WHERE"
                    + " first_name LIKE '%"+search+"%' OR "
                    + "miiddle_name LIKE '%"+search+"%' OR "
                    + "last_name LIKE '%"+search+"%'");

        } catch (Exception e) {

        }
        return rs;
    }
}

