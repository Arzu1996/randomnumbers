package classwork.task2910;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExceptionTest {
 private Calculatable c;
    @BeforeEach
    void setUp() {
        this.c = new Exception();
    }

    @Test
    void calcSum() {
        String origin = "1 2 3";
        assertEquals(6, c.calcSum(origin));

    }
}