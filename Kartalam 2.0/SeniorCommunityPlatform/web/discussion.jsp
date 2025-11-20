<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Discussion Forums</title>
</head>
<body>
    <h1>Discussion Forums</h1>
    <p>Join the conversation and share your thoughts.</p>
    
    <!-- Example discussion forum listing -->
    <div>
        <h2>Active Discussions</h2>
        <ul>
            <li>
                <strong>Topic:</strong> Best Travel Destinations<br>
                <strong>Started By:</strong> John Doe<br>
                <a href="discussionDetails.jsp?id=1">Join Discussion</a>
            </li>
            <!-- More discussions can be listed here -->
        </ul>
    </div>
    
    <a href="createDiscussion.jsp">Start a New Discussion</a><br>
    <a href="index.jsp">Back to Home</a>
</body>
</html>
