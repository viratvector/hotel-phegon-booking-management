package com.phegondev.HotelPhegon.service.impl.interfac;
import com.phegondev.HotelPhegon.dto.Response;
import com.phegondev.HotelPhegon.entity.Booking;

public interface IBookingService {
    Response saveBooking(Long roomId, Long userId, Booking bookingRequest);
    Response findBookingByConfirmationCode(String confirmationCode);
    Response getAllBookings();
    Response cancelBooking(Long bookingId);

}