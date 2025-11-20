<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Groups</title>
</head>
<body>
    <h1>Groups</h1>
    <p>Find and join groups based on your interests.</p>
    
    <!-- Example group listing -->
    <div>
        <h2>Available Groups</h2>
        <ul>
            <li>
                <strong>Group Name:</strong> Gardening Enthusiasts<br>
                <strong>Description:</strong> A group for those who love gardening and want to share tips and advice.<br>
                <a href="groupDetails.jsp?id=1">Join Group</a>
            </li>
            <!-- More groups can be listed here -->
        </ul>
    </div>
    
    <a href="createGroup.jsp">Create New Group</a><br>
    <a href="index.jsp">Back to Home</a>
</body>
</html>
