package com.ruthvik.HotelBookingSystem.Repositories;


import com.ruthvik.HotelBookingSystem.Entities.BookingEntity;
import com.ruthvik.HotelBookingSystem.Entities.HotelEntity;
import com.ruthvik.HotelBookingSystem.Entities.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Repository
public interface BookingRepository extends JpaRepository<BookingEntity, Long> {
    Optional<BookingEntity> findByPaymentSessionId(String sessionId);

    List<BookingEntity> findByHotel(HotelEntity hotel);

    List<BookingEntity> findByHotelAndCreatedAtBetween(HotelEntity hotel, LocalDateTime startDateTime, LocalDateTime endDateTime);

    List<BookingEntity> findByUser(UserEntity user);
}
