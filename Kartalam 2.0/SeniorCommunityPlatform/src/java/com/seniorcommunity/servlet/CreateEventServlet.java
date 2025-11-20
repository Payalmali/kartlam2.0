package com.seniorcommunity.servlet;

import com.seniorcommunity.db.DatabaseConnection;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/CreateEventServlet")
public class CreateEventServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        
        String name = request.getParameter("eventName");
        String date = request.getParameter("eventDate");
        String description = request.getParameter("eventDescription");

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement("INSERT INTO events (name, date, description) VALUES (?, ?, ?)")) {
            
            ps.setString(1, name);
            ps.setDate(2, java.sql.Date.valueOf(date));
            ps.setString(3, description);
            ps.executeUpdate();
            
        } catch (SQLException e) {
            e.printStackTrace();
        }

        response.sendRedirect("events.jsp");
    }
}
