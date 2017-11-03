package com.webapp.servlets;

import com.webapp.models.Students;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Ian on 03/11/2017.
 */
@WebServlet(name = "view")
public class view extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int studentID = Integer.parseInt(request.getParameter("id"));
        Students students = new Students();
        String[] StudentsArr = students.GetStudent(studentID);
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println(StudentsArr[0]);
        out.println(StudentsArr[1]);
        out.println(StudentsArr[2]);
        out.println(StudentsArr[3]);
        out.println(StudentsArr[4]);
        out.println(StudentsArr[5]);
        out.println(StudentsArr[6]);
        out.println(StudentsArr[7]);
        out.println(StudentsArr[8]);
        out.println(StudentsArr[9]);
        out.println(StudentsArr[10]);
        out.println("<img src=\"assets/images/" + StudentsArr[11] + "\">");
    }
}
