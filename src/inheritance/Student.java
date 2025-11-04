package inheritance;

public class Student extends Person {

    // Student punya data tambahan yaitu ID mahasiswa
    // ID ini unik per student dan cuma dipake di class Student aja
    private String studentId;

    // Constructor Student lebih kompleks karena butuh 2 parameter
    // name diterusin ke parent class Person pake super(), studentId disimpen sendiri
    public Student(String name, String studentId) {
        super(name); // panggil constructor Person buat handle name
        this.studentId = studentId;
    }

    // Method buat dapetin ID mahasiswa
    // Berguna waktu mau cek identitas student atau validasi data
    public String getStudentId() {
        return studentId;
    }
}