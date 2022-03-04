package com.restaurants.BookingController;

import com.restaurants.BookingModel.Booking;
import com.restaurants.BookingService.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/booking")
@CrossOrigin("*")
public class BookingController {

    @Autowired
    private BookingService service;

    @PostMapping("/addBooking")
    public Booking addBooking(@RequestBody Booking booking) {
        return service.saveBooking(booking);
    }

    @GetMapping("/bookings")
    public List<Booking> findAllBookings() {
        return service.getBookings();
    }

    @GetMapping("/bookingById/{id}")
    public Booking findBookingById(@PathVariable int id) {
        return service.getBookingById(id);
    }

    @GetMapping("/booking/{name}")
    public Booking findBookingByName(@PathVariable String name) {
        return service.getBookingByName(name);
    }

    @PutMapping("/update")
    public Booking updateBooking(@RequestBody Booking booking) {
        return service.updateBooking(booking);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteBooking(@PathVariable int id) {
        return service.deleteBooking(id);
    }

}
