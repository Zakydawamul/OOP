package encapsulation;

public class Student {

    // Semua variabel di sini dipake modifier private supaya gak bisa diakses sembarangan dari luar
    // Ini konsep encapsulation, jadi data mahasiswa cuma bisa diubah lewat method khusus (getter/setter)
    private String name;
    private int age;
    private double gpa;

    // Method buat ngeset nama mahasiswa
    // Dipanggil waktu mau ngisi atau update nama student
    public void setName(String name) {
        // this.name itu variabel class-nya, name yang kanan itu parameter yang masuk
        // Jadi nilai dari parameter bakal disimpen ke variabel instance
        this.name = name;
    }

    // Method buat ngambil nama mahasiswa yang udah disimpen
    // Returnnya berupa string nama
    public String getName() {
        // Ngereturn isi variabel name yang ada di objek ini
        return name;
    }

    // Method setter buat umur mahasiswa
    // Biasanya dipanggil pas input data atau update profil
    public void setAge(int age) {
        // Assign nilai umur dari parameter ke variabel instance age
        this.age = age;
    }

    // Method getter buat dapetin umur mahasiswa
    // Kepake pas mau validasi atau nampilin data
    public int getAge() {
        // Return umur mahasiswa dalam bentuk integer
        return age;
    }

    // Method setter khusus buat IPK mahasiswa
    // GPA itu nilai akademik penting yang sering di-update tiap semester
    public void setGpa(double gpa) {
        // Simpen nilai GPA yang dikasih ke variabel gpa di objek ini
        this.gpa = gpa;
    }

    // Method getter buat ngecek berapa IPK mahasiswa
    // Biasa dipake buat cek syarat kelulusan atau beasiswa
    public double getGpa() {
        // Ngirim balik nilai IPK dalam bentuk double (desimal)
        return gpa;
    }
}