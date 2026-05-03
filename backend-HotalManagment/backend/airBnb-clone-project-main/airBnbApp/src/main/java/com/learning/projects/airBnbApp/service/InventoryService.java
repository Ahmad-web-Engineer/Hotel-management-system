package com.learning.projects.airBnbApp.service;

import com.learning.projects.airBnbApp.dto.HotelDto;
import com.learning.projects.airBnbApp.dto.HotelSearchRequest;
import com.learning.projects.airBnbApp.entity.Room;
import org.springframework.data.domain.Page;

public interface InventoryService {

    void initializeRoomForAYear(Room room);

    void deleteAllInventories(Room room);

    Page<HotelDto> searchHotels(HotelSearchRequest hotelSearchRequest);
}