package classesnObjects;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CarTest {

    @Test
    public void testCar() {
        // Membuat objek mobil
        Car car = new Car("Toyota", 2020);

        // Mengecek nilai atribut merk dan tahun
        assertEquals("Toyota", car.brand);
        assertEquals(2020, car.year);
    }

    @Test
    public void testDisplayInfo() {
        // Membuat objek mobil
        Car car = new Car("Honda", 2022);

        // Mengecek output dari method displayInfo()
        assertEquals("Brand: Honda, Year: 2022", car.displayInfo());
    }
}
