package org.example.Kursa4.service;

import org.example.Kursa4.database.entity.Booking;

import java.util.Optional;

public interface BookingService {
    Iterable<Booking> findAll();
    Booking save(Booking booking);
    Optional<Booking> findById(Long id);
    void deleteByPrice(String price);
}
