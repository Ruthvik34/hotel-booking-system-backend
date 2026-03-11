package com.ruthvik.HotelBookingSystem.Dto;

import com.ruthvik.HotelBookingSystem.Enums.Gender;
import lombok.Data;

@Data
public class GuestDTO {
    private Long id;
    private String name;
    private Gender gender;
    private Integer age;
}
