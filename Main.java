// ENUM UNTUK STATUS HIDUP
enum Status {
    DEAD(0), ALIVE(1);
    private int value;
    Status(int value) {
        this.value = value;
    }
    public int getValue() {
        return value;
    }
}

// ENUM UNTUK GENDER
enum Gender {
    MALE(0), FEMALE(1);
    private int value;
    Gender(int value) {
        this.value = value;
    }
    public int getValue() {
        return value;
    }
}

// ABSTRACT CLASS ANIMAL
abstract class Animal {
    protected String name;
    protected int age;
    protected String food;
    protected Gender gender;
    protected Status alive;

    public Animal(String name, int age, String food, Gender gender, Status alive) {
        this.name = name;
        this.age = age;
        this.food = food;
        this.gender = gender;
        this.alive = alive;
    }

    // ABSTRACT METHOD
    public abstract String printSound();

    // CEK HIDUP ATAU MATI
    public boolean isAlive() {
        return alive == Status.ALIVE;
    }

    // OVERLOADING MOVE
    public String move() {
        return name + " is moving...";
    }

    public String move(int distance) {
        return name + " moves for " + distance + " meters.";
    }

    // OVERRIDE DI CHILD
    public String printData() {
        return "Name: " + name +
                "\nAge: " + age +
                "\nFood: " + food +
                "\nGender: " + gender +
                "\nAlive: " + alive;
    }
}

// CLASS CAT
class Cat extends Animal {
    public Cat(String name, int age, String food, Gender gender, Status alive) {
        super(name, age, food, gender, alive);
    }

    @Override
    public String printSound() {
        return "Meowww!";
    }

    @Override
    public String move() {
        return "Cat " + name + " is walking.";
    }

    @Override
    public String move(int distance) {
        return "The cat " + name + " walks for " + distance + " meters.";
    }

    @Override
    public String printData() {
        return "Type: Cat\n" + super.printData();
    }
}

// CLASS DOG
class Dog extends Animal {
    public Dog(String name, int age, String food, Gender gender, Status alive) {
        super(name, age, food, gender, alive);
    }

    @Override
    public String printSound() {
        return "Gukk Gukk!";
    }

    @Override
    public String move() {
        return "Dog " + name + " is running.";
    }

    @Override
    public String move(int distance) {
        return "The dog " + name + " runs for " + distance + " meters.";
    }

    @Override
    public String printData() {
        return "Type: Dog\n" + super.printData();
    }
}

// CLASS DUCK
class Duck extends Animal {
    public Duck(String name, int age, String food, Gender gender, Status alive) {
        super(name, age, food, gender, alive);
    }

    @Override
    public String printSound() {
        return "Kwek Kwek!";
    }

    @Override
    public String move() {
        return "Duck " + name + " is swimming.";
    }

    @Override
    public String move(int distance) {
        return "The duck " + name + " swims for " + distance + " meters.";
    }

    @Override
    public String printData() {
        return "Type: Duck\n" + super.printData();
    }
}

// CLASS HORSE
class Horse extends Animal {
    public Horse(String name, int age, String food, Gender gender, Status alive) {
        super(name, age, food, gender, alive);
    }

    @Override
    public String printSound() {
        return "Neighhh!";
    }

    @Override
    public String move() {
        return "Horse " + name + " is galloping.";
    }

    @Override
    public String move(int distance) {
        return "The horse " + name + " gallops for " + distance + " meters.";
    }

    @Override
    public String printData() {
        return "Type: Horse\n" + super.printData();
    }
}

// MAIN CLASS
public class Main {
    public static void main(String[] args) {
        Animal cat = new Cat("Luna", 2, "Fish", Gender.FEMALE, Status.ALIVE);
        Animal dog = new Dog("Max", 3, "Meat", Gender.MALE, Status.ALIVE);
        Animal duck = new Duck("Stacy", 1, "Grains", Gender.FEMALE, Status.ALIVE);
        Animal horse = new Horse("Thunder", 5, "Grass", Gender.MALE, Status.DEAD);

        // Coba print sound
        System.out.println(cat.printSound());
        System.out.println(dog.printSound());
        System.out.println(duck.printSound());
        System.out.println(horse.printSound());

        // Coba move
        System.out.println(cat.move());
        System.out.println(dog.move(3));
        System.out.println(duck.move(5));
        System.out.println(horse.move(10));

        // Print data
        System.out.println("\n--- Animal Data ---");
        System.out.println(cat.printData());
        System.out.println();
        System.out.println(dog.printData());
        System.out.println();
        System.out.println(duck.printData());
        System.out.println();
        System.out.println(horse.printData());

        // Cek alive
        System.out.println("\nIs " + horse.name + " alive? " + horse.isAlive());
    }
}
