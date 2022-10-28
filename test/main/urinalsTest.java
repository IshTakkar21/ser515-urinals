package main;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;


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

    @Test
    void checkIfCanHandleSizeOneString() {
        System.out.println("====== Ish Takkar == TEST FOUR EXECUTED =======");
        urinals u = new urinals();
        assertEquals(1, u.countUrinals("0"));
        assertEquals(0, u.countUrinals("1"));
    }

    @Test
    void checkLogic() {
        System.out.println("====== Ish Takkar == TEST FIVE EXECUTED =======");
        urinals u = new urinals();
        assertEquals(1, u.countUrinals("10001"));
        assertEquals(0, u.countUrinals("1001"));
        assertEquals(3, u.countUrinals("00000"));
        assertEquals(2, u.countUrinals("0000"));
        assertEquals(1, u.countUrinals("01000"));
    }

    @Test
    void checkIfUserInputFromKeyboard() {
        System.out.println("====== Ish Takkar == TEST SIX EXECUTED =======");
        urinals u = new urinals();
        String str = "1001";
        InputStream iStream = new ByteArrayInputStream(str.getBytes());
        System.setIn(iStream);
        assertEquals("1001", u.getInputString());
    }

}