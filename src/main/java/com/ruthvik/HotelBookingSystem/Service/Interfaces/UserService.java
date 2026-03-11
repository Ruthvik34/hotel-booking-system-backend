package com.ruthvik.HotelBookingSystem.Service.Interfaces;


import com.ruthvik.HotelBookingSystem.Dto.ProfileUpdateRequestDTO;
import com.ruthvik.HotelBookingSystem.Dto.UserDTO;
import com.ruthvik.HotelBookingSystem.Entities.UserEntity;

public interface UserService {
    UserEntity getUserById(Long id);

    void updateProfile(ProfileUpdateRequestDTO profileUpdateRequestDto);

    UserDTO getMyProfile();
}
