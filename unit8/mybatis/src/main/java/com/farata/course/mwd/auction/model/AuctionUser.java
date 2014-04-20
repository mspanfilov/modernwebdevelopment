package com.farata.course.mwd.auction.model;

import java.math.BigDecimal;

public class AuctionUser {
    private BigDecimal userId;

    private String userName;

    private String email;

    private BigDecimal getOverbidNotifications;

    public BigDecimal getUserId() {
        return userId;
    }

    public void setUserId(BigDecimal userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public BigDecimal getGetOverbidNotifications() {
        return getOverbidNotifications;
    }

    public void setGetOverbidNotifications(BigDecimal getOverbidNotifications) {
        this.getOverbidNotifications = getOverbidNotifications;
    }
}