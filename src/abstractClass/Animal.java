package abstractClass;

// Kelas abstrak Animal sebagai blueprint untuk hewan
public abstract class Animal {
    // Method abstrak untuk menghasilkan suara hewan
    // Harus diimplementasikan oleh setiap subclass
    public abstract String makeSound(String name);
}

// Kelas Dog mewarisi Animal untuk merepresentasikan anjing
class Dog extends Animal {
    // Override method makeSound untuk menentukan suara anjing
    @Override
    public String makeSound(String name) {
        return name + " says Woof!";
    }
}

// Kelas Cat mewarisi Animal untuk merepresentasikan kucing
class Cat extends Animal {
    // Override method makeSound untuk menentukan suara kucing
    @Override
    public String makeSound(String name) {
        return name + " says Meow!";
    }
}