import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculatorTestAddition {
    @Test
    public void testAddition() {
        double result = Calculator.calculate(2, 2, '+');
        assertEquals(4, result, 0);
    }
}
