package com.ruthvik.HotelBookingSystem.Service.Interfaces;


import com.ruthvik.HotelBookingSystem.Dto.HotelPriceDTO;
import com.ruthvik.HotelBookingSystem.Dto.HotelSearchRequest;
import com.ruthvik.HotelBookingSystem.Dto.InventoryDTO;
import com.ruthvik.HotelBookingSystem.Dto.UpdateInventoryRequestDTO;
import com.ruthvik.HotelBookingSystem.Entities.RoomEntity;
import org.springframework.data.domain.Page;

import java.util.List;

public interface InventoryService {
    void initializeRoomForAYear(RoomEntity room);

    void deleteAllInventories(RoomEntity room);

    Page<HotelPriceDTO> searchHotels(HotelSearchRequest hotelSearchRequest);

    List<InventoryDTO> getAllInventoryByRoom(Long roomId);

    void updateInventory(Long roomId, UpdateInventoryRequestDTO updateInventoryRequestDto);
}
