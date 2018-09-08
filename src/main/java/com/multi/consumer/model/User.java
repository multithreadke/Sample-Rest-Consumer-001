package com.multi.consumer.model;

/**
 * User: git
 * Date: 08/09/2018
 * Time: 08:25
 */
public class User {
    private Long postObjectId;
    private String username;
    private String emailAddress;

    public User() {
    }

    public User(Long postObjectId, String username, String emailAddress) {
        this.postObjectId = postObjectId;
        this.username = username;
        this.emailAddress = emailAddress;
    }

    public Long getPostObjectId() {
        return postObjectId;
    }

    public void setPostObjectId(Long postObjectId) {
        this.postObjectId = postObjectId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    @Override
    public String toString() {
        return "User{" +
                "postObjectId=" + postObjectId +
                ", username='" + username + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                '}';
    }
}
