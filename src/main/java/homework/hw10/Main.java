package homework.hw10;


import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        FamilyController familyController = new FamilyController();
        Map<String, String> schedule = new HashMap<>();
        schedule.put(DayOfWeek.MONDAY.name(), "Watch a film");
        schedule.put(DayOfWeek.TUESDAY.name(), "Go to courses and go to University");
        schedule.put(DayOfWeek.WEDNESDAY.name(), "Do home work;go to University");
        schedule.put(DayOfWeek.THURSDAY.name(), "Go to courses;go to University");
        schedule.put(DayOfWeek.FRIDAY.name(), "Do some home work;go to University");
        schedule.put(DayOfWeek.SATURDAY.name(), "Do some home work");
        schedule.put(DayOfWeek.SUNDAY.name(), "Do home work");


        Pet pet = new DomesticCat(Species.CAT, "Kitty", 3, 79, Set.of("play", "sleep"));
        Pet pet2 = new Dog(Species.DOG, "Doggy", 4, 48, Set.of("jumping", "walking"));
        Set<Pet> pets = new HashSet<>();
        pets.add(pet);
        pets.add(pet2);
        Family Greys = new Family(
                new Woman("Sara", "Grey", LocalDate.of(1975,11,5)),
                new Man("Sam", "Grey",   LocalDate.of(1974,12,25)), pets);
        Family Whites = new Family(
                new Woman("Sarah", "White",  LocalDate.of(1957,3,15)),
                new Man("Sam", "White",  LocalDate.of(1954,1,12)), pets);
        Human child = new Woman("Selby", "Grey",  LocalDate.of(1998,7,23), 87);
        Human child2 = new Woman("Jane", "Grey",  LocalDate.of(1988,9, 5), 72, schedule);
        Greys.addChild(child2);
        familyController.saveFamily(Greys);
        familyController.saveFamily(Whites);
        familyController.createNewFamily(
                new Woman("Elizabeth", "Smith",  LocalDate.of(1974,8,29)),
                new Man("Jack", "Smith",  LocalDate.of(1972,9,15)));
        System.out.println(familyController.getFamiliesLessThan(3));
        System.out.println(familyController.getFamiliesBiggerThan(2));
        System.out.println(familyController.countFamiliesWithMemberNumber(3));
        familyController.deleteFamilyByIndex(2);
        familyController.bornChild("Ayla", "Mark", Whites);
        familyController.adoptChild(child, Whites);
        familyController.displayAllFamilies();
        familyController.addPet(0, new RoboCat(Species.CAT, "Cattie", 4, 45, Set.of("jumping", "walking")));
        System.out.println(familyController.getPets(0));
        System.out.println(familyController.count());
        familyController.deleteAllChildrenOlderThen(0);
        familyController.displayAllFamilies();
        child.describeAge();
    }
}
