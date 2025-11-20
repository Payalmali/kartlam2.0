package com.seniorcommunity.model;

public class Discussion {
    private String topic;
    private String description;

    public Discussion(String topic, String description) {
        this.topic = topic;
        this.description = description;
    }

    // Getters and setters
    public String getTopic() { return topic; }
    public void setTopic(String topic) { this.topic = topic; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
}
