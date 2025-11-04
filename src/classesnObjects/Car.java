package classesnObjects;

public class Car {

    // Atribut publik untuk menyimpan merek dan tahun produksi mobil
    public String brand;
    public int year;

    // Konstruktor untuk membuat objek Car dengan merek dan tahun tertentu
    public Car(String brand, int year) {
        // Keyword 'this' merujuk pada atribut instance dari class ini
        this.brand = brand;
        this.year = year;
    }

    // Method untuk mengembalikan informasi lengkap mobil dalam format string
    public String displayInfo() {
        // Mengembalikan string yang berisi brand dan year dalam format tertentu
        return "Brand: " + brand + ", Year: " + year;
    }
}