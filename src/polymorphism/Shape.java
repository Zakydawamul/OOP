package polymorphism;

// Shape jadi parent class buat semua bangun datar
// Ini contoh polymorphism, satu interface tapi banyak implementasi
public class Shape {

    // Method getArea() ini placeholder aja
    // Tiap subclass bakal override sesuai rumus bangun datarnya masing-masing
    public double getArea() {
        // Return 0 sebagai default value
        return 0.0;
    }
}
