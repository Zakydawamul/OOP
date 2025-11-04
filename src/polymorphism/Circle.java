package polymorphism;

// Circle adalah salah satu bentuk geometris turunan Shape
public class Circle extends Shape {

    private double radius; // variabel nyimpen jari-jari lingkaran

    // Constructor nerima radius pas bikin objek Circle
    public Circle(double radius) {
        this.radius = radius;
    }

    // Override getArea() buat hitung luas lingkaran
    // Pake rumus pi * r kuadrat
    @Override
    public double getArea() {
        return Math.PI * radius * radius; // Math.PI udah built-in di Java
    }
}