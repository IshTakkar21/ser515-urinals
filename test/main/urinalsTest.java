package main;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;


import static org.junit.jupiter.api.Assertions.*;

class urinalsTest {

    @Test
    void checkStringLength() {
        System.out.println("====== Ish Takkar == TEST ONE EXECUTED =======");

        assertTrue(urinals.checkStringLength("101010"));
    }

    @Test
    void checkStringType() {
        System.out.println("====== Ish Takkar == TEST TWO EXECUTED =======");

        assertTrue(urinals.checkStringType("101010"));
    }

    @Test
    void checkConsecutiveOnes() {
        System.out.println("====== Ish Takkar == TEST THREE EXECUTED =======");

        assertEquals(-1, urinals.countUrinals("10011"));
    }

    @Test
    void checkIfCanHandleSizeOneString() {
        System.out.println("====== Ish Takkar == TEST FOUR EXECUTED =======");

        assertEquals(1, urinals.countUrinals("0"));
        assertEquals(0, urinals.countUrinals("1"));
    }

    @Test
    void checkLogic() {
        System.out.println("====== Ish Takkar == TEST FIVE EXECUTED =======");

        assertEquals(1, urinals.countUrinals("10001"));
        assertEquals(0, urinals.countUrinals("1001"));
        assertEquals(3, urinals.countUrinals("00000"));
        assertEquals(2, urinals.countUrinals("0000"));
        assertEquals(1, urinals.countUrinals("01000"));
    }

}