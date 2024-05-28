package org.excercise.bonus;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class TicketTest {

    @Test
    void testTicketWithNoDiscount() {
        BigDecimal km = new BigDecimal("100");
        Ticket ticket = new Ticket("John Doe", 30, km);

        BigDecimal expectedPrice = new BigDecimal("50.00");
        assertEquals(expectedPrice, ticket.getPrice());
    }

    @Test
    void testTicketWithChildDiscount() {
        BigDecimal km = new BigDecimal("100");
        Ticket ticket = new Ticket("Jane Doe", 10, km);

        BigDecimal expectedPrice = new BigDecimal("40.00");
        assertEquals(expectedPrice, ticket.getPrice());
    }

    @Test
    void testTicketWithSeniorDiscount() {
        BigDecimal km = new BigDecimal("100");
        Ticket ticket = new Ticket("John Smith", 70, km);

        BigDecimal expectedPrice = new BigDecimal("30.00");
        assertEquals(expectedPrice, ticket.getPrice());
    }

    @Test
    void testTicketWithNegativeAge() {
        BigDecimal km = new BigDecimal("100");

        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            new Ticket("Invalid Age", -1, km);
        });

        assertEquals("Not valid age", exception.getMessage());
    }

    @Test
    void testTicketWithExactKm() {
        BigDecimal km = new BigDecimal("100.555");
        Ticket ticket = new Ticket("Precision Test", 30, km);

        BigDecimal expectedPrice = new BigDecimal("50.28");
        assertEquals(expectedPrice, ticket.getPrice());
    }
}