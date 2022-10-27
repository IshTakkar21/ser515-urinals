package main;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class urinalsTest {

    @Test
    @DisplayName("Good String!")
    void goodString() {
        Funcs f = new Funcs();
        assert (f.goodString("Helloo") == true);
        System.out.println("====== Ish Takkar == TEST ONE EXECUTED =======");
    }
}