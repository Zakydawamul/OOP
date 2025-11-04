package encapsulation;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class StudentTest {

    @Test
    public void testSetAndGetName() {
        Student student = new Student();
        student.setName("Budi");
        assertEquals("Budi", student.getName());
    }

    @Test
    public void testSetAndGetAge() {
        Student student = new Student();
        student.setAge(20);
        assertEquals(20, student.getAge());
    }

    @Test
    public void testSetAndGetGpa() {
        Student student = new Student();
        student.setGpa(3.75);
        assertEquals(3.75, student.getGpa(), 0.001);
    }
}
