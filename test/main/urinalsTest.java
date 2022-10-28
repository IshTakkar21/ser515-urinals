package main;

import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class urinalsTest {

    @Test
    void checkStringLength() {
        System.out.println("====== Ish Takkar == TEST ONE EXECUTED =======");
        urinals u = new urinals();
        assertTrue(u.checkStringLength("101010"));
    }

    @Test
    void checkStringType() {
        System.out.println("====== Ish Takkar == TEST TWO EXECUTED =======");
        urinals u = new urinals();
        assertTrue(u.checkStringType("101010"));
    }

    @Test
    void checkConsecutiveOnes() {
        System.out.println("====== Ish Takkar == TEST THREE EXECUTED =======");
        urinals u = new urinals();
        assertEquals(-1, u.countUrinals("10011"));
    }

}