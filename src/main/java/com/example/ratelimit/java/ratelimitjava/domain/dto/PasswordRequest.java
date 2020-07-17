package com.example.ratelimit.java.ratelimitjava.domain.dto;

public class PasswordRequest {

    private String oldPassword;
    private String newPassword;

    public String getNewPassword() {
        return newPassword;
    }

    public void setNewPassword(String password) {
        this.newPassword = newPassword;
    }

    public String getOldPassword() {
        return oldPassword;
    }

    public void setOldPassword(String oldPassword) {
        this.oldPassword = oldPassword;
    }
}
