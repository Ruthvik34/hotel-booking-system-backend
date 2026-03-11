package com.ruthvik.HotelBookingSystem.Service.Interfaces;




import com.ruthvik.HotelBookingSystem.Dto.GuestDTO;

import java.util.List;

public interface GuestService {

    List<GuestDTO> getAllGuests();

    void updateGuest(Long guestId, GuestDTO guestDto);

    void deleteGuest(Long guestId);

    GuestDTO addNewGuest(GuestDTO guestDto);
}
