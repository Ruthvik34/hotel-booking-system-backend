package com.ruthvik.HotelBookingSystem.Utils;


import com.ruthvik.HotelBookingSystem.Entities.UserEntity;
import org.springframework.security.core.context.SecurityContextHolder;

public class AppUtils {

    public static UserEntity getCurrentUser() {
        return (UserEntity) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
    }
}
