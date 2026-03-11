package com.ruthvik.HotelBookingSystem.Strategy;


import com.ruthvik.HotelBookingSystem.Entities.InventoryEntity;

import java.math.BigDecimal;
public interface PricingStrategy {

    BigDecimal calculatePrice(InventoryEntity inventory);
}
