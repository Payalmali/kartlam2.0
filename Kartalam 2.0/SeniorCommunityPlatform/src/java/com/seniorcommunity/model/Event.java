package com.seniorcommunity.model;

public class Event {
    private String name;
    private String date;
    private String description;

    public Event(String name, String date, String description) {
        this.name = name;
        this.date = date;
        this.description = description;
    }

    // Getters and setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getDate() { return date; }
    public void setDate(String date) { this.date = date; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
}
