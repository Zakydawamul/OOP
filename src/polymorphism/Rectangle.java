package polymorphism;

// Rectangle buat representasi persegi panjang
public class Rectangle extends Shape {

    private double width;  // lebar persegi panjang
    private double height; // tinggi persegi panjang

    // Constructor butuh 2 parameter: lebar dan tinggi
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // Override getArea() pake rumus luas persegi panjang
    // Tinggal kali panjang x lebar
    @Override
    public double getArea() {
        return width * height; // rumus simpel tapi efektif
    }
}