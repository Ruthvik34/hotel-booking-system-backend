package com.ruthvik.HotelBookingSystem.Dto;


import com.ruthvik.HotelBookingSystem.Enums.Gender;
import lombok.Data;

import java.time.LocalDate;

@Data
public class ProfileUpdateRequestDTO {
    private String name;
    private LocalDate dateOfBirth;
    private Gender gender;
}
