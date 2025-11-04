package classRelationships;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class ClassRelationshipsTest {

    @Test
    public void testDepartmentAndEmployee() {
        Department department = new Department("IT");
        Employee emp = new Employee("Budi");
        emp.setDepartment(department);

        // Cek relasi Employee dengan Department
        assertEquals("IT", emp.getDepartment().getDeptName());
    }

    @Test
    public void testManagerAndProject() {
        Manager mgr = new Manager("Dina");
        Project proj = new Project("System Upgrade");
        mgr.setProject(proj);

        // Cek relasi Manager dengan Project
        assertEquals("System Upgrade", mgr.getProject().getProjectName());
    }

    @Test
    public void testTaskName() {
        Task t = new Task("Database Migration");
        assertEquals("Database Migration", t.getTaskName());
    }
}
