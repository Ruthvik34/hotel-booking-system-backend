package com.ruthvik.HotelBookingSystem.Repositories;


import com.ruthvik.HotelBookingSystem.Entities.HotelEntity;
import com.ruthvik.HotelBookingSystem.Entities.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HotelRepository extends JpaRepository<HotelEntity,Long> {
    List<HotelEntity> findByOwner(UserEntity user);
}
