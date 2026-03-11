package com.ruthvik.HotelBookingSystem.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class HotelInfoDto {
    private HotelDTO hotel;
    private List<RoomDTO> rooms;
}
