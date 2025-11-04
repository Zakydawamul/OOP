package inheritance;

public class Person {

    // Variabel name pake protected biar class turunannya bisa langsung akses
    // Kalo pake private, subclass gabisa pake variabel ini secara langsung
    protected String name;

    // Constructor dipanggil pas bikin objek Person baru
    // Parameter name bakal langsung disimpen ke variabel instance
    public Person(String name) {
        this.name = name;
    }

    // Method getter standar buat ngambil nama person
    // Bisa dipanggil dari mana aja karena aksesnya public
    public String getName() {
        return name;
    }
}