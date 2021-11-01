import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyTest {
    @Test
    public void testEvenOrOdd() {
        EvenOrOdd eoo = new EvenOrOdd();
        assertEquals("Even", eoo.even_or_odd(6));
        assertEquals("Odd", eoo.even_or_odd(7));
    }

    private class EvenOrOdd {
        public String even_or_odd(int number) {
            return (((number & 1) == 0) ? "Even" : "Odd");

        }
    }
}
