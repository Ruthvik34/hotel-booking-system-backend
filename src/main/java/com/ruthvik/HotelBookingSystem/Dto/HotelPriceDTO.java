package com.ruthvik.HotelBookingSystem.Dto;

import com.ruthvik.HotelBookingSystem.Entities.HotelEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class HotelPriceDTO {
    private HotelEntity hotel;
    private Double price;
}
