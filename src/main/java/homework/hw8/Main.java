package homework.hw8;


import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Map<String,String> schedule = new HashMap<>() ;
        schedule.put( DayOfWeek.MONDAY.name(),"Watch a film");
        schedule.put(DayOfWeek.TUESDAY.name(),"Go to courses and go to University" );
        schedule.put( DayOfWeek.WEDNESDAY.name(),"Do home work;go to University");
        schedule.put( DayOfWeek.THURSDAY.name(),"Go to courses;go to University");
        schedule.put(DayOfWeek.FRIDAY.name(),"Do some home work;go to University" );
        schedule.put( DayOfWeek.SATURDAY.name(),"Do some home work");
        schedule.put( DayOfWeek.SUNDAY.name(),"Do home work");


        Pet pet = new DomesticCat(Species.CAT, "Kitty", 3, 79, Set.of("play", "sleep"));
        Pet pet2 = new Dog(Species.DOG, "Doggy", 4, 48, Set.of("jumping", "walking"));
        Set<Pet> pets= new HashSet<>();
        pets.add(pet);
        pets.add(pet2);
        Family Greys = new Family(
                new Woman("Sara", "Grey", 1977),
                new Man("Sam", "Grey", 1974),pets);
        Human child = new Woman("Selby", "Grey", 1998, 87, schedule, Greys);
        Human child2 = new Woman("Jane", "Grey", 1988, 72, schedule);
        Greys.addChild(child2);
        pet2.respond();
        System.out.println(Greys);
        System.out.println(Greys.countFamily());
        Greys.deleteChild(0);
        System.out.println(Greys);
        System.out.println(Greys.countFamily());
    }
}
