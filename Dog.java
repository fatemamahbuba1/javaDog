public class Dog {
    private String name;
    private int age;
    private Breed breed;
    public Dog(String name, int age, Breed breed) {
        this.name = name;
        this.age = age;
        this.breed = breed;
    }
    public Dog(String name, Breed breed) {
        this(name, 0, breed);
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public Breed getBreed() {
        return breed;
    }
    public void setBreed(Breed breed) {
        this.breed = breed;
    }
    public void bark() {
        System.out.println("\n"+ name + " barking Woof! Woof!");
    }

    public void sleep() {
        System.out.println("\n"+ name + " is sleeping.");
    }
    public void eat() {
        System.out.println("\n"+ name + " is eating.");
    }

    public static void main(String[] args) {
        Dog wolf = new Dog("Wolf",1, Breed.GERMAN_SHEPHERD);
        Dog spot = new Dog("Snoopy", 6,Breed.DALMATIAN);
        Dog snoopy = new Dog("Spot", 4, Breed.BEAGLE);
        snoopy.eat();
        spot.sleep();
        wolf.bark();
        System.out.println("\nName: " + snoopy.getName() + ", Age: " + snoopy.getAge() + ", Breed: " + snoopy.getBreed());
        System.out.println("\nName: " + wolf.getName() + ", Age: " + wolf.getAge() + ", Breed: " + wolf.getBreed());
        System.out.println("\nName: " + spot.getName() + ", Age: " + spot.getAge() + ", Breed: " + spot.getBreed());

    }
}
