package com.seniorcommunity.servlet;

import com.seniorcommunity.model.Discussion;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/CreateDiscussionServlet")
public class CreateDiscussionServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        
        String topic = request.getParameter("discussionTopic");
        String description = request.getParameter("discussionDescription");

        // Create a discussion object
        Discussion discussion = new Discussion(topic, description);

        // For demonstration, we'll just print it to the console
        System.out.println("Discussion Created: " + discussion.getTopic());

        // Redirect to the discussion page
        response.sendRedirect("discussion.jsp");
    }
}
