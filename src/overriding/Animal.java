package overriding;

// Class Animal jadi parent buat semua jenis hewan
public class Animal {

    // Method speak() ini bakal di-replace sama subclass
    // Versi default cuma return pesan generic
    public String speak() {
        return "Hewan berbicara"; // pesan umum kalo belum di-override
    }
}