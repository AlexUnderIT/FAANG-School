package org.example.Kursa4.controller;

import org.example.Kursa4.database.entity.Booking;
import org.example.Kursa4.database.repository.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class BookingController {

    @Autowired
    private BookingRepository bookingRepository;

    @GetMapping ("showBooking")
    public ModelAndView showBooking(Model model){

        List<Booking> bookings = (List<Booking>) this.bookingRepository.findAll();
        Map<String,Object> params = new HashMap<>();
        params.put("bookings", bookings);
        return new ModelAndView("showBooking", params);
    }
    @PostMapping("/postBooking")
    public String createBooking(@RequestParam("customer_id") Long customer_id,
                                 @RequestParam("price") Long price,
                                 @RequestParam("order_number") Long order_number,
                                 @RequestParam("employee_id") Long employee_id
    ){
        Booking booking = new Booking();
        booking.setCustomer_id(customer_id);
        booking.setPrice(price);
        booking.setOrder_number(order_number);
        booking.setEmployee_id(employee_id);
        bookingRepository.save(booking);
        return "get";
    }
}