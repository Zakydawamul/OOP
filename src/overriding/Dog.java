package overriding;

// Dog juga turunan Animal, konsepnya sama kayak Cat
public class Dog extends Animal {

    // Method speak() versi anjing
    // Ini yang dipanggil kalo objeknya Dog, bukan method dari Animal
    @Override
    public String speak() {
        return "Guk guk"; // gonggongan anjing
    }
}