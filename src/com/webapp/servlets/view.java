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

        request.setAttribute("id", StudentsArr[0]);
        request.setAttribute("student_no", StudentsArr[1]);
        request.setAttribute("first_name", StudentsArr[2]);
        request.setAttribute("middle_name", StudentsArr[3]);
        request.setAttribute("last_name", StudentsArr[4]);
        request.setAttribute("birthdate", StudentsArr[5]);
        request.setAttribute("email", StudentsArr[6]);
        request.setAttribute("contact_no", StudentsArr[7]);
        request.setAttribute("address", StudentsArr[8]);
        request.setAttribute("gender", StudentsArr[9]);
        request.setAttribute("course", StudentsArr[10]);
        request.setAttribute("image", StudentsArr[11]);

        request.getRequestDispatcher("/view.jsp").forward(request, response);

    }
}
