package com.restaurants.BookingService;

import com.restaurants.BookingModel.Booking;
import com.restaurants.BookingRepository.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookingService {

    @Autowired
    BookingRepository repository;

    public Booking saveBooking(Booking booking) {
        return repository.save(booking);
    }

    public List<Booking> saveBookings(List<Booking> booking) {
        return repository.saveAll(booking);
    }

    public List<Booking> getBookings() {
        return repository.findAll();
    }

    public Booking getBookingById(int id) {
        return repository.findById(id).orElse(null);
    }

    public Booking getBookingByName(String name) {
        return repository.findByName(name);
    }

    public String deleteBooking(int id) {
        repository.deleteById(id);
        return "booking removed !! " + id;
    }

    public Booking updateBooking(Booking booking) {
        Booking existingBooking = repository.findById(booking.getId()).orElse(null);
        existingBooking.setName(booking.getName());
        existingBooking.setEmail(booking.getEmail());
        existingBooking.setTotalPeople(booking.getTotalPeople());
        existingBooking.setDate(booking.getDate());
        return repository.save(existingBooking);
    }
}
