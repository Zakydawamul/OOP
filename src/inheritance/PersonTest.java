package inheritance;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class PersonTest {

    @Test
    public void testPersonName() {
        // Membuat objek Person
        Person person = new Person("Amin");
        // Mengecek apakah nama sesuai
        assertEquals("Amin", person.getName());
    }

    @Test
    public void testStudentInheritance() {
        // Membuat objek Student yang mewarisi dari Person
        Student student = new Student("Budi", "S123");
        // Mengecek nama dan studentId
        assertEquals("Budi", student.getName());
        assertEquals("S123", student.getStudentId());
    }
}
