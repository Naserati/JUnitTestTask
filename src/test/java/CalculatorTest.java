import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {
    Calculator calculator = new Calculator();

    @Test
    public void testAddition() {
        Assert.assertEquals(calculator.calculate("2+3"), 5, 0.0001);
        Assert.assertEquals(calculator.calculate("2.455 + 3,445"), 5.9, 0.0001);
    }

    @Test
    public void testSubtraction() {
        Assert.assertEquals(calculator.calculate("3-2"), 1, 0.0001);
        Assert.assertEquals(calculator.calculate("3,4455-2.1235"), 1.322, 0.0001);
    }

    @Test
    public void testMultiplication() {
        Assert.assertEquals(calculator.calculate("3*2"), 6, 0.0001);
        Assert.assertEquals(calculator.calculate("3,2*2.33"), 7.456, 0.0001);
    }

    @Test
    public void testDivision() {
        Assert.assertEquals(calculator.calculate("3/2"), 1.5, 0.0001);
        Assert.assertEquals(calculator.calculate("10,5/2.5"), 4.2, 0.0001);
    }

    @Test
    public void testProblem() {
        Assert.assertEquals(calculator.calculate("2*(3-2)/1(3+2)+(10/2)-(2*3)"), 9, 0.0001);
    }
}
