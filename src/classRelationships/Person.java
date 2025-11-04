package classRelationships;

// Class paling dasar yang jadi parent dari semua orang di sistem
// Sifatnya general banget, cuma nyimpen data nama aja
public class Person {

    // Pake protected biar subclass bisa akses langsung
    // Kalo private, subclass gabisa akses variabel ini
    protected String name;

    // Constructor yang wajib dipanggil sama semua subclass
    // Fungsinya ngeset nama person yang dibuat
    public Person(String name) {
        this.name = name;
    }

    // Method sederhana buat ngambil nama person
    // Bisa dipanggil dari mana aja karena public
    public String getName() {
        return name;
    }
}