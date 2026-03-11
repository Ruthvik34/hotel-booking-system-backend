package com.ruthvik.HotelBookingSystem.Repositories;


import com.ruthvik.HotelBookingSystem.Entities.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
    Optional<UserEntity> findByEmail(String email);
}
