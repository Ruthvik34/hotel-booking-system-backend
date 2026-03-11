package com.ruthvik.HotelBookingSystem.Service.Interfaces;


import com.ruthvik.HotelBookingSystem.Dto.BookingDTO;
import com.ruthvik.HotelBookingSystem.Dto.BookingRequest;
import com.ruthvik.HotelBookingSystem.Dto.GuestDTO;
import com.ruthvik.HotelBookingSystem.Dto.HotelReportDTO;
import com.ruthvik.HotelBookingSystem.Enums.BookingStatus;
import com.stripe.model.Event;

import java.time.LocalDate;
import java.util.List;

public interface BookingService {
    BookingDTO initialiseBooking(BookingRequest bookingRequest);

    BookingDTO addGuests(Long bookingId, List<GuestDTO> guestDtoList);

    String initiatePayments(Long bookingId);

    void capturePayment(Event event);

    void cancelBooking(Long bookingId);

    BookingStatus getBookingStatus(Long bookingId);

    List<BookingDTO> getAllBookingsByHotelId(Long hotelId);

    HotelReportDTO getHotelReport(Long hotelId, LocalDate startDate, LocalDate endDate);

    List<BookingDTO> getMyBookings();
}
