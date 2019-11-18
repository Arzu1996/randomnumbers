package homework.hw7;


public class Main {
    public static void main(String[] args) {
        String[] schedule = new String[7];
        schedule[0] = String.format("%s:Watch a film", DayOfWeek.MONDAY.name());
        schedule[1] = String.format("%s:Go to courses;go to University", DayOfWeek.TUESDAY.name());
        schedule[2] = String.format("%s:Do home work;go to University", DayOfWeek.WEDNESDAY.name());
        schedule[3] = String.format("%s:Go to courses;go to University", DayOfWeek.THURSDAY.name());
        schedule[4] = String.format("%s:Do home work;go to University", DayOfWeek.FRIDAY.name());
        schedule[5] = String.format("%s:Do home work", DayOfWeek.SATURDAY.name());
        schedule[6] = String.format("%s:Do home work", DayOfWeek.SUNDAY.name());


        Pet pet = new DomesticCat(Species.CAT, "Kitty", 3, 79, new String[]{"play", "sleep"});
        Pet pet2 = new Dog(Species.DOG, "Doggy", 4, 48, new String[]{"jumping", "walking"});
        Family Greys = new Family(
                new Woman("Sara", "Grey", 1977),
                new Man("Sam", "Grey", 1974));
        Human child = new Woman("Selby", "Grey", 1998, 87, pet,schedule,Greys);
        Human child2 = new Woman("Jane", "Grey", 1988, 72, pet2,schedule);
        Greys.addChild(child2);
        pet2.respond();
        System.out.println(Greys);
        System.out.println(Greys.countFamily());
        Greys.deleteChild(0);
        System.out.println(Greys);
        System.out.println(Greys.countFamily());
    }
}
