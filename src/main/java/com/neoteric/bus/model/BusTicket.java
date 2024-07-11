package com.neoteric.bus.model;

import java.util.Date;

public class BusTicket {
        public String ticketNumber;
        public String busNumber;
        public Date travelDate;
        public double price;
        public Passenger passenger;

        public BusTicket(String ticketNumber, String busNumber, Date travelDate, double price) {
            this.ticketNumber = ticketNumber;
            this.busNumber = busNumber;
            this.travelDate = travelDate;
            this.price = price;
        }
    }



