package com.ruthvik.HotelBookingSystem.Service.Interfaces;


import com.ruthvik.HotelBookingSystem.Entities.BookingEntity;

public interface CheckoutService {

    String getCheckoutSession(BookingEntity booking, String successUrl, String failureUrl);

}
