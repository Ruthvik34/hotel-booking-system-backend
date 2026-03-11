package com.ruthvik.HotelBookingSystem.Repositories;


import com.ruthvik.HotelBookingSystem.Dto.GuestDTO;
import com.ruthvik.HotelBookingSystem.Entities.GuestEntity;
import com.ruthvik.HotelBookingSystem.Entities.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GuestRepository extends JpaRepository<GuestEntity, Long> {
    List<GuestDTO> findByUser(UserEntity user);
}