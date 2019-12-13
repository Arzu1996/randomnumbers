package homework.hw12;


import homework.hw12.io.Command;
import homework.hw12.io.Parser;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Core {

  private final Console console;
  private final Menu menu;
  private final FamilyController familyController;
  private final Parser parser;
  private final MainController mainController;

  public Core(Console console) {
    this.console = console;
    this.familyController = new FamilyController();
    this.menu = new Menu();
    this.parser = new Parser();
    this.mainController = new MainController();
  }

  public void run() throws Exception {
    boolean cont = true;
    console.printLn(menu.show());
    while (cont) {

      String line = console.readLn();
      Command user_input = parser.parse(line);
      switch (user_input) {
        case TEST_DATA_CREATE:
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
          familyController.bornChild("Ayla", "Mark", Whites);
          familyController.adoptChild(child, Whites);
          familyController.addPet(0, new RoboCat(Species.CAT, "Cattie", 4, 45, Set.of("jumping", "walking")));
          console.printLn("Test data created!");
          break;
        case ENTIRE_LIST_SHOW:
          familyController.displayAllFamilies();
          break;
        case FAMILY_MEMBERS_MORE_THAN_SHOW:
          console.printLn("Enter the value");
          int value1 = Integer.parseInt(console.readLn());
          System.out.println(familyController.getFamiliesBiggerThan(value1));
          break;
        case FAMILY_MEMBERS_LESS_THAN_SHOW:
          console.printLn("Enter the value");
          int value2 = Integer.parseInt(console.readLn());
          System.out.println(familyController.getFamiliesLessThan(value2));
          break;
        case FAMILY_MEMBERS_EQUALS_COUNT:
          console.printLn("Enter the value");
          int value3 = Integer.parseInt(console.readLn());
          System.out.println(familyController.countFamiliesWithMemberNumber(value3));
          break;
        case FAMILY_CREATE:
          console.printLn("Enter the mother's name");
          String mFname = console.readLn();
          console.printLn("Enter the mother's last name");
          String mLname = console.readLn();
          console.printLn("Enter the mother's birth year");
          int mYear = Integer.parseInt(console.readLn());
          console.printLn("Enter the mother's month of birth(with number)");
          int mMonth = Integer.parseInt(console.readLn());
          console.printLn("Enter the mother's birthday");
          int mDay = Integer.parseInt(console.readLn());
          console.printLn("Enter the mother's iq");
          int mIq = Integer.parseInt(console.readLn());
          console.printLn("Enter the father's name");
          String fFname = console.readLn();
          console.printLn("Enter the father's last name");
          String fLname = console.readLn();
          console.printLn("Enter the father's birth year");
          int fYear = Integer.parseInt(console.readLn());
          console.printLn("Enter the father's month of birth");
          int fMonth = Integer.parseInt(console.readLn());
          console.printLn("Enter the father's birthday");
          int fDay = Integer.parseInt(console.readLn());
          console.printLn("Enter the father's iq");
          int fIq = Integer.parseInt(console.readLn());
          familyController.createNewFamily(
                  new Woman(mFname,mLname,LocalDate.of(mYear,mMonth,mDay),mIq),
                  new Man(fFname,fLname,LocalDate.of(fYear,fMonth,fDay),fIq));
          break;
        case FAMILY_INDEX_DELETE:
          console.printLn("Enter the index");
          int index1 = Integer.parseInt(console.readLn())-1;
          familyController.deleteFamilyByIndex(index1);
          break;
        case FAMILY_INDEX_EDIT:
          console.printLn("Choose a number between 1-3");
          console.printLn("1. Give birth to a baby");
          console.printLn("2. Adopt a child");
          console.printLn("3. Return to main menu ");
          int number = Integer.parseInt(console.readLn());
          switch (number){
            case 1:
              console.printLn("Enter the index");
              int index2 = Integer.parseInt(console.readLn())-1;
              console.printLn("Enter girl name");
              String girlName = console.readLn();
              console.printLn("Enter boy name");
              String boyName = console.readLn();
              familyController.bornChild(girlName,boyName,familyController.getFamilyById(index2));
              break;
            case 2:
              console.printLn("Enter the index");
              int index3 = Integer.parseInt(console.readLn())-1;
              console.printLn("Enter the name");
              String cName = console.readLn();
              console.printLn("Enter the surname name");
              String cSname = console.readLn();
              console.printLn("Enter the birth year");
              int cYear = Integer.parseInt(console.readLn());
              console.printLn("Enter the birth month");
              int cMonth = Integer.parseInt(console.readLn());
              console.printLn("Enter the birth day");
              int cDay = Integer.parseInt(console.readLn());
              console.printLn("Enter the iq");
              int cIq  = Integer.parseInt(console.readLn());
              familyController.adoptChild(
                      new Human(cName,cSname,LocalDate.of(cYear,cMonth,cDay),cIq),
                      familyController.getFamilyById(index3));
              break;
            case 3:
              menu.show();
              break;
          }
          break;
        case ALL_CHILDREN_ABOVE_AGE_REMOVE:
          console.printLn("Enter the age");
          int cAge = Integer.parseInt(console.readLn());
          familyController.deleteAllChildrenOlderThen(cAge);
          break;
        case EXIT:
          cont = false;
          break;
        case HELP:
          //default:
          console.printLn(mainController.help());
          break;
      }
    }
  }
}
