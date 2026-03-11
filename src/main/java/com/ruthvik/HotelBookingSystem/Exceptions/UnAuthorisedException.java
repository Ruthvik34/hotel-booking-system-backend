package com.ruthvik.HotelBookingSystem.Exceptions;

public class UnAuthorisedException extends RuntimeException{
    public UnAuthorisedException(String message) {
        super(message);
    }
}
