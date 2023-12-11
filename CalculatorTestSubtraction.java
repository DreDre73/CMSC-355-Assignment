import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculatorTestSubtraction {
    @Test
    public void testSubtraction() {
        double result = Calculator.calculate(4, 2, '-');
        assertEquals(2, result, 0);
    }
}

