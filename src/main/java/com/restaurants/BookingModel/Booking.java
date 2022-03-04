package com.restaurants.BookingModel;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "BOOKING_TBL")
public class Booking {

    @Id
    @GeneratedValue
    private int id;
    private String name;
    private int totalPeople;
    private String email;
    private LocalDate date;


}
