package com.neoteric.bus;

import com.neoteric.bus.model.BusTicket;
import com.neoteric.bus.model.Passenger;
import com.neoteric.bus.service.BusTicketService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.sql.Date;

public class BusTicketServiceTest {

        @Test
        public void testCreateTicket() {
            // Arrange
            Passenger passenger = new Passenger();
            passenger.firstName = "John";
            passenger.lastName = "Doe";
            passenger.age = 30;
            passenger.seatNumber = "B1";

            BusTicketService service = new BusTicketService();

            // Act
            BusTicket ticket = service.createTicket("TICK123", "BUS456", new Date(21-1-24), 50.0, passenger);

            // Assert
            Assertions.assertNotNull(ticket);
            Assertions.assertEquals("TICK123", ticket.ticketNumber);
            Assertions.assertEquals("BUS456", ticket.busNumber);
            Assertions.assertEquals(50.0, ticket.price);
            Assertions.assertEquals(passenger, ticket.passenger);
        }

        @Test
        public void testIsValidTicket() {
            // Arrange
            Passenger passenger = new Passenger();
            passenger.firstName = "John";
            passenger.lastName = "Doe";
            passenger.age = 30;
            passenger.seatNumber = "B1";

            BusTicketService service = new BusTicketService();
            BusTicket ticket = service.createTicket("TICK123", "BUS456", new Date(21-1-24), 50.0, passenger);

            // Act & Assert
            Assertions.assertTrue(service.isValidTicket(ticket));
        }
    }


