package classwork;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task1Test {

    public boolean isCharValid(char c) {
        return (c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z');
    }

    @Test
    public void gen_random1() {
        Task1 t = new Task1();
        String generated = t.gen_random(10);
        assertEquals(10, generated.length());
    }

    @Test
    public void gen_random2() {
        Task1 t = new Task1();
        String generated = t.gen_random(10);
        char charAt0 = generated.charAt(0);
        assertTrue(isCharValid(charAt0));
    }

    @Test
    public void gen_random3() {
        Task1 t = new Task1();
        String generated = t.gen_random(10);
        for (int i = 0; i < generated.length(); i++) {
            char c = generated.charAt(i);
            assertTrue(isCharValid(c));
        }
    }

    @Test
    public void gen_random4() {
        Task1 t = new Task1();
        String generated = t.gen_random(10);
        for (int i = 0; i < generated.length(); i++) {
            char c = generated.charAt(i);
            boolean isValid = isCharValid(c);
            assertTrue(isCharValid(c));
        }
    }

}