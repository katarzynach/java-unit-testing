import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    public void testAdd() {
        int expected = 3;

        int actual = calculator.add(1, 2);

        assertEquals(expected, actual);
    }

    @Test
    public void testSubstract(){
        int actual = calculator.subtract(5,2);
        assertEquals(3,actual);
    }

    @Test
    public void testMultiply(){
        int actual = calculator.multiply(2,2);
        assertEquals(4, actual);
    }

    @Test
    public void testDivide(){
        int actual = calculator.divide(10,2);
        assertEquals(5, actual);
    }

    @Test
    public void testDivide_returnsInt(){
        int actual = calculator.divide(3,2);
        assertEquals(1, actual);
    }
}
