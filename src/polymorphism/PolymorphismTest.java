package polymorphism;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

// Kelas pengujian untuk konsep Polymorphism
public class PolymorphismTest {

    @Test
    public void testCircleArea() {
        // Menggunakan referensi Shape tapi objek Circle
        Shape s = new Circle(5);
        double expectedArea = Math.PI * 25; // 5^2 * π
        assertEquals(expectedArea, s.getArea(), 0.0001);
    }

    @Test
    public void testRectangleArea() {
        // Menggunakan referensi Shape tapi objek Rectangle
        Shape s = new Rectangle(4, 6);
        double expectedArea = 24.0; // 4 * 6
        assertEquals(expectedArea, s.getArea(), 0.0001);
    }

    @Test
    public void testShapeAreaDefault() {
        // Shape biasa harus return 0
        Shape s = new Shape();
        assertEquals(0.0, s.getArea(), 0.0001);
    }
}
