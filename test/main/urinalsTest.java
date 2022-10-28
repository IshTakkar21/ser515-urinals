package main;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class urinalsTest {

    @Test
    void checkStringLength() {
        System.out.println("====== Ish Takkar == TEST ONE EXECUTED =======");
        assertTrue(urinals.checkStringLength("101010"));
        assertFalse(urinals.checkStringLength(""));
    }

    @Test
    void checkStringType() {
        System.out.println("====== Ish Takkar == TEST TWO EXECUTED =======");
        assertTrue(urinals.checkStringType("101010"));
        assertFalse(urinals.checkStringType("3466"));
    }

    @Test
    void checkConsecutiveOnes() {
        System.out.println("====== Ish Takkar == TEST THREE EXECUTED =======");
        assertEquals(-1, urinals.countUrinals("10011"));
        assertEquals(2, urinals.countUrinals("100010001"));
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

    @Test
    void checkFileExists() {
        System.out.println("====== Ish Takkar == TEST SIX EXECUTED =======");
        assertEquals(0, urinals.openFile());
    }

    @Test
    void checkFileContent() {
        System.out.println("====== Ish Takkar == TEST SEVEN EXECUTED =======");
        urinals.openFile();
        assertEquals(0, urinals.readFromFile());
    }

    @Test
    void checkIOExcept() {
        System.out.println("====== Ish Takkar == TEST EIGHT EXECUTED =======");
        urinals.openFile();
        urinals.readFromFile();
        assertEquals(0, urinals.writeToFile());
    }

}