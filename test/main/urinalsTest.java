package main;

import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class urinalsTest {
    urinals u = new urinals();
    String input = u.input;

    @Test
    void checkStringLength() {
        System.out.println("====== Ish Takkar == TEST ONE EXECUTED =======");
        assertAll(() -> assertTrue(input.length() < 20), () -> assertTrue(input.length() > 1));
    }

    @Test
    void checkStringType() {
        System.out.println("====== Ish Takkar == TEST TWO EXECUTED =======");
        assertTrue(input.matches("^[01]+$"));
    }


}