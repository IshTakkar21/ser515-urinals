package main;

import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class urinalsTest {

    String input = urinals.input;
    String str = urinals.checkString(input);

    @Test
    void checkStringLength() {
        System.out.println("====== Ish Takkar == TEST ONE EXECUTED =======");
        assertTrue(str.length() < 20);
    }

    @Test
    void checkStringType() {
        System.out.println("====== Ish Takkar == TEST TWO EXECUTED =======");
        assertTrue(str.matches("^[01]+$"));
    }

}