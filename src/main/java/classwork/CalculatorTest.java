package classwork;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
   public void add() {
        Calculator c = new Calculator();
        int a = 5;
        int b = 2;
        int added = c.add(a, b);
        assertEquals(7, added);
    }

    @Test
    public void sub() {
        Calculator c = new Calculator();
        int a = 3;
        int b = 2;
        int subed = c.sub(a,b);
        assertEquals(1, subed);
    }

    @Test
   public void mul() {
        Calculator c = new Calculator();
        int a = 2;
        int b = 3;
        int muled = c.mul(a,b);
        assertEquals(6, muled);
    }

    @Test
  public void div() {
        Calculator c = new Calculator();
        int a = 10;
        int b = 5;
        int dived = c.div(a,b);
        assertEquals(2, dived);
    }
}

