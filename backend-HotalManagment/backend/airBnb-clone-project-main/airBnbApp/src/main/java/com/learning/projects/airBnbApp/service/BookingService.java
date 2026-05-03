package com.learning.projects.airBnbApp.service;

import com.learning.projects.airBnbApp.dto.BookingDto;
import com.learning.projects.airBnbApp.dto.BookingRequest;
import com.learning.projects.airBnbApp.dto.GuestDto;

import java.util.List;

public interface BookingService {

    BookingDto initialiseBooking(BookingRequest bookingRequest);

    BookingDto addGuests(Long bookingId, List<GuestDto> guestDtoList);
}
