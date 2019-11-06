package homework.hw5;

public class Main {
    public static void main(String[] args) {
        Pet pet = new Pet("cat", "Kitty", 3, 79, new String[]{"play", "sleep"});
        Pet pet2 = new Pet("dog", "Doggy", 4, 48, new String[]{"jumping", "walking"});
        Human mother = new Human("Miley", "Grey", 1977);
        Human father = new Human("Jack", "Grey", 1974);
        Family Greys = new Family(mother, father);
        Human child = new Human("Layla", "Grey", 1998, 87, pet, Greys);
        System.out.println(Greys);
        Greys.addChild(child);
        System.out.println(Greys);
        Greys.deleteChild(0);
        System.out.println(Greys);
        System.out.println(Greys.countFamily());
    }
}
