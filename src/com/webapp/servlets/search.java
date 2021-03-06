package com.webapp.servlets;

import javax.imageio.metadata.IIOMetadataNode;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import java.util.ArrayList;

import com.webapp.models.Students;
import com.webapp.models.Users;


@WebServlet(name = "search")
public class search extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String search = request.getParameter("search");
        Students students = new Students();
        ResultSet rs = students.searchStudent(search);
        String studentsData = "";
        try {
            while (rs.next()) {
                studentsData +=
                        "<tr>" +
                                "<td>" + rs.getString("student_no") + "</td>" +
                                "<td>" + rs.getString("first_name") + "</td>" +
                                "<td>" + rs.getString("middle_name") + "</td>" +
                                "<td>" + rs.getString("last_name") + "</td>" +
                                "<td><img class=\"profile-img\" " +
                                "src=\"assets/images/" + rs.getString("image") + "\">" + "</td>" +
                                "<td>" +
                                "<a href=\"view?id=" + rs.getString("id") + "\">" +
                                "<i class=\"fa fa-eye\" aria-hidden=\"true\"></i>" +
                                "</a>" +
                                "&nbsp;" +
                                "<a href=\"update?id=" + rs.getString("id") + "\">" +
                                "<i class=\"fa fa-pencil\" aria-hidden=\"true\"></i>" +
                                "</a>" +
                                "&nbsp;" +
                                "<i class=\"fa fa-trash-o\" aria-hidden=\"true\"></i>" +
                                "</td>" +
                                "</tr>";


            }
        }


        catch (Exception e) {
        }

        students.Close();
        request.setAttribute("studentsData", studentsData);
        request.getRequestDispatcher("/index.jsp").forward(request, response);

    }
}


