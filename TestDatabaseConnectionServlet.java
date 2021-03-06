package com.aadimcollege.servlet;

import com.aadimcollege.db.JDBCConnection;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TestDatabaseConnectionServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");

        PrintWriter pwriter = response.getWriter();
        Connection cn = JDBCConnection.getConnection();

        if (cn != null) {
            pwriter.print("<h1>");
            pwriter.print("DB Connection Successfull.");
            pwriter.print("</h1>");
        } else {
            pwriter.print("<h1>");
            pwriter.print("DB Connection Failed!!");
            pwriter.print("</h1>");
        }
    }
}
