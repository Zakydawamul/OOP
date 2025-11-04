package classRelationships;

// Objek buat ngelola data departemen di perusahaan
public class Department {

    private String deptName;

    // Constructor dipanggil waktu bikin departemen baru
    // Langsung set nama departemennya dari parameter yang dikasih
    public Department(String deptName) {
        this.deptName = deptName;
    }

    // Method buat ngambil nama departemen yang udah disimpen
    // Returnnya berupa string nama departemen
    public String getDeptName() {
        return deptName;
    }
}