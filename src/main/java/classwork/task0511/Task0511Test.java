package classwork.task0511;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task0511Test {

    @Test
    void calc() {
        Task0511 t= new Task0511();
        assertEquals(1,t.calc("()()()()()"));
    }
    @Test
    void calc1() {
        Task0511 t= new Task0511();
        assertEquals(2,t.calc("()(()())()()"));
    }
    @Test
    void calc2() {
        Task0511 t= new Task0511();
        assertEquals(3,t.calc("()((()()))()()"));
    }
}