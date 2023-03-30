package org.example.Kursa4.database.repository;

import com.sun.istack.NotNull;
import org.example.Kursa4.database.entity.Booking;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;

public interface BookingRepository extends CrudRepository<Booking, Long> {

    @Transactional
    void deleteByPrice(@NotNull String price);
}
