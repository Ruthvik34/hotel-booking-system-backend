package com.ruthvik.HotelBookingSystem.Dto;


import com.ruthvik.HotelBookingSystem.Enums.Gender;
import lombok.Data;

import java.time.LocalDate;

@Data
public class UserDTO {
    private Long id;
    private String email;
    private String name;
    private Gender gender;
    private LocalDate dateOfBirth;
}
