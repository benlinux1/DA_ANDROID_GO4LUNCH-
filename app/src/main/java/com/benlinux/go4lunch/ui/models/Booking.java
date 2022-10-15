package com.benlinux.go4lunch.ui.models;

import java.util.Date;

public class Booking {

    private String restaurantId;
    private String restaurantName;
    // user who booked
    private String userId;
    private String bookingDate;


    public Booking(String restaurantId, String restaurantName, String userId, String bookingDate) {
        this.restaurantId = restaurantId;
        this.restaurantName = restaurantName;
        this.userId = userId;
        this.bookingDate = bookingDate;
    }

    public String getRestaurantId() {
        return restaurantId;
    }
    public void setRestaurantId(String restaurantId) {
        this.restaurantId = restaurantId;
    }

    public String getRestaurantName() {
        return restaurantName;
    }
    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public String getUserId() {
        return userId;
    }
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getBookingDate() {
        return bookingDate;
    }
    public void setBookingDate(String bookingDate) {
        this.bookingDate = bookingDate;
    }


}
