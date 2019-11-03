package homework.hw4;

public class Main {
    public static void main(String[] args) {
        Pet dog = new Pet("dog", "Rock", 5, 75, new String[]{"eat", "drink", "sleep"});
        Human mother = new Human("Jane", "Karlone", 1954);
        Human father = new Human("Vito", "Karlone", 1953);
        Human child = new Human("Michael", "Karlone", 1977, 90, dog, mother, father);
        dog.eat();
        dog.foul();
        dog.respond();
        child.greetPet();
        child.describePet();
        System.out.println(dog);
        System.out.println(child);
    }
}
