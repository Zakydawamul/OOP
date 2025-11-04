package overloading;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

// Kelas pengujian untuk class Calculator
public class CalculatorTest {

    @Test
    public void testAddIntInt() {
        // --- Test: add(int, int) ---

        int codeInputA = 2;
        int codeInputB = 3;

        Calculator calc = new Calculator();
        int codeOutput = calc.add(codeInputA, codeInputB);

        int expectedOutput = 5;

        assertEquals("add(int, int) test:", expectedOutput, codeOutput);
    }

    @Test
    public void testAddDoubleDouble() {
        // --- Test: add(double, double) ---

        double codeInputA = 2.3;
        double codeInputB = 3.4;

        Calculator calc = new Calculator();
        double codeOutput = calc.add(codeInputA, codeInputB);

        double expectedOutput = 5.7;

        assertEquals("add(double, double) test:", expectedOutput, codeOutput, 0.0001);
    }

    @Test
    public void testAddIntIntInt() {
        // --- Test: add(int, int, int) ---

        int codeInputA = 3;
        int codeInputB = 4;
        int codeInputC = 5;

        Calculator calc = new Calculator();
        int codeOutput = calc.add(codeInputA, codeInputB, codeInputC);

        int expectedOutput = 12;

        assertEquals("add(int, int, int) test:", expectedOutput, codeOutput);
    }
}
