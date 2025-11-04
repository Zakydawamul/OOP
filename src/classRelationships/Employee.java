package classRelationships;

// Employee ini inherit dari Person, tapi dia juga punya hubungan sama Department
// Jadi setiap karyawan bisa di-assign ke departemen tertentu
public class Employee extends Person {

    // Variabel ini nyimpen departemen tempat si employee kerja
    // Ini contoh association relationship antara Employee dan Department
    private Department department;

    // Constructor Employee cuma butuh nama doang
    // Terus dia panggil constructor parent (Person) pake super()
    public Employee(String name) {
        super(name);
    }

    // Method buat ngeset departemen si employee
    // Biasanya dipanggil setelah objek Employee dibuat
    public void setDepartment(Department department) {
        this.department = department;
    }

    // Method buat dapetin info departemen si employee
    // Returnnya objek Department lengkap, bukan cuma namanya
    public Department getDepartment() {
        return department;
    }
}
