package com.seniorcommunity.servlet;

import com.seniorcommunity.model.Group;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/CreateGroupServlet")
public class CreateGroupServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        
        String name = request.getParameter("groupName");
        String description = request.getParameter("groupDescription");

        // Create a group object
        Group group = new Group(name, description);

        // For demonstration, we'll just print it to the console
        System.out.println("Group Created: " + group.getName());

        // Redirect to the groups page
        response.sendRedirect("groups.jsp");
    }
}

