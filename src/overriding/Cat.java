package overriding;

// Cat extend Animal, jadi otomatis dapet method speak()
// Tapi kita override biar return suara kucing yang bener
public class Cat extends Animal {

    // Override method speak() dari parent
    // Sekarang kalo dipanggil bakal return "Meong" bukan pesan default
    @Override
    public String speak() {
        return "Meong"; // suara asli kucing
    }
}