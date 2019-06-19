package com.codeup.adlister.models;

public class User {
    private long id;
    private String username;
    private String email;
    private String preferences;
    private String password;
    private String updated;
    private String profile_image;

    public User(long id, String username, String email, String preferences, String password, String profile_image) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.preferences = preferences;
        this.password = password;
        this.profile_image = profile_image;
    }

    public User() {
    }

    public User(String username, String email, String preferences, String password) {
        this.username = username;
        this.email = email;
        this.preferences = preferences;
        this.password = password;
    }

    public User(long id, String username, String email, String preferences, String password) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.preferences = preferences;
        this.password = password;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPreferences() {
        return preferences;
    }

    public void setPreferences(String preferences) {
        this.preferences = preferences;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getProfile_image() {
        return profile_image;
    }

    public void setProfile_image(String profile_image) {
        this.profile_image = profile_image;
    }

}
