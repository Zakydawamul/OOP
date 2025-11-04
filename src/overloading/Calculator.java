package overloading;

// Calculator ini contoh bagus buat ngerti konsep overloading
// Satu nama method tapi bisa punya banyak versi dengan parameter berbeda
public class Calculator {

    // Versi pertama: tambah 2 angka bulat
    // Dipake kalo kita passing 2 parameter integer
    public int add(int a, int b) {
        return a + b; // return hasil tambah langsung
    }

    // Versi kedua: tambah 2 angka desimal
    // Java otomatis milih method ini kalo parameternya double
    public double add(double a, double b) {
        return a + b; // returnnya juga double biar presisi
    }

    // Versi ketiga: tambah 3 angka bulat sekaligus
    // Kepake kalo butuh jumlah lebih dari 2 angka
    public int add(int a, int b, int c) {
        return a + b + c; // jumlah ketiga angka
    }
}