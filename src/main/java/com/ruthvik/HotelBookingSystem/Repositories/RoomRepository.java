package com.ruthvik.HotelBookingSystem.Repositories;


import com.ruthvik.HotelBookingSystem.Entities.RoomEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomRepository extends JpaRepository<RoomEntity,Long> {
}
