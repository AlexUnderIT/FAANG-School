package org.example.Kursa4.service;

import org.example.Kursa4.database.entity.Booking;
import org.example.Kursa4.database.repository.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BookingServiceImpl implements BookingService{

    @Autowired
    private BookingRepository repository;

    @Override
    public Iterable<Booking> findAll() {
        return repository.findAll();
    }

    @Override
    public Booking save(Booking booking) {
        return repository.save(booking);
    }

    @Override
    public Optional<Booking> findById(Long id) {
        return repository.findById(id);
    }

    @Override
    public void deleteByPrice(String price) {
        repository.deleteByPrice(price);
    }
}
