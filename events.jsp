<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Events</title>
</head>
<body>
    <h1>Events</h1>
    <p>Here you can view and manage upcoming events.</p>
    
    <!-- Example event listing -->
    <div>
        <h2>Upcoming Events</h2>
        <ul>
            <li>
                <strong>Event Name:</strong> Community Picnic<br>
                <strong>Date:</strong> September 30, 2024<br>
                <strong>Description:</strong> A fun-filled day at the park for all community members.<br>
                <a href="eventDetails.jsp?id=1">View Details</a>
            </li>
            <!-- More events can be listed here -->
        </ul>
    </div>
    
    <a href="createEvent.jsp">Create New Event</a><br>
    <a href="index.jsp">Back to Home</a>
</body>
</html>
