package homework.hw4;

public class Main {
    public static void main(String[] args) {
        Pet dog = new Pet("dog", "Rock", 5, 75, new String[]{"eat", "drink", "sleep"});
        Pet cat = new Pet("dog", "Garfield", 4, 25, new String[]{"play", "drink", "sleep"});
        Human mother = new Human("Jane", "Karlone", 1954);
        Human father = new Human("Vito", "Karlone", 1953);
        Human child = new Human("Michael", "Karlone", 1977, 90, dog, mother, father);
        //new family
        Human grandmother = new Human("Anna", "Karl", 1944);
        Human grandfather = new Human("Tom", "Karl", 1946);
        Human mother2 = new Human("Maria", "Karl", 1964);
        Human father2 = new Human("Joseph", "Karl", 1964, 88, cat, grandmother, grandfather);
        Human child2 = new Human("Kate", "Karl", 1988, 100, cat, mother2, father2);

        dog.eat();
        dog.foul();
        dog.respond();
        cat.eat();
        cat.foul();
        cat.respond();
        child.greetPet();
        child.describePet();
        father2.describePet();
        child2.greetPet();
        child2.describePet();
        System.out.println(dog);
        System.out.println(child);
        System.out.println(cat);
        System.out.println(father2);
        System.out.println(child2);
    }
}
