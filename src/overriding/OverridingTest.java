package overriding;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

// Kelas pengujian untuk konsep overriding
public class OverridingTest {

    @Test
    public void testAnimalSpeak() {
        // Objek Animal menggunakan method aslinya
        Animal animal = new Animal();
        assertEquals("Hewan berbicara", animal.speak());
    }

    @Test
    public void testDogSpeak() {
        // Objek Dog memanggil method hasil override
        Animal dog = new Dog();
        assertEquals("Guk guk", dog.speak());
    }

    @Test
    public void testCatSpeak() {
        // Objek Cat memanggil method hasil override
        Animal cat = new Cat();
        assertEquals("Meong", cat.speak());
    }
}
