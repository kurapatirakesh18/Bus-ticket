package com.neoteric.bus.service;

import com.neoteric.bus.model.BusTicket;
import com.neoteric.bus.model.Passenger;

import java.util.Date;

public class BusTicketService {
        public BusTicket createTicket(String ticketNumber, String busNumber, Date travelDate, double price, Passenger passenger) {
            BusTicket ticket = new BusTicket(ticketNumber, busNumber, travelDate, price);
            ticket.passenger = passenger;
            return ticket;
        }

        public boolean isValidTicket(BusTicket ticket) {
            return ticket != null && ticket.ticketNumber != null && !ticket.ticketNumber.isEmpty();
        }
    }


