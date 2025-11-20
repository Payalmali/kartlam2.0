package com.seniorcommunity.servlet;

import com.seniorcommunity.model.Workshop;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/CreateWorkshopServlet")
public class CreateWorkshopServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        
        String name = request.getParameter("workshopName");
        String date = request.getParameter("workshopDate");
        String description = request.getParameter("workshopDescription");

        // Create a workshop object
        Workshop workshop = new Workshop(name, date, description);

        // For demonstration, we'll just print it to the console
        System.out.println("Workshop Created: " + workshop.getName());

        // Redirect to the workshops page
        response.sendRedirect("workshops.jsp");
    }
}
