package homework.hw8;
import java.util.Map;

final class Woman extends Human {
    Woman(String name, String surname, int year) {
        super(name, surname, year);
    }

    Woman(String name, String surname, int year, int iq, Family family) {
        super(name, surname, year, iq, family);
    }

    Woman(String name, String surname, int year, int iq, Pet pet, Map<String,String> schedule) {
        super(name, surname, year, iq, pet, schedule);
    }

    Woman(String name, String surname, int year, int iq, Pet pet, Map<String,String> schedule, Family family) {
        super(name, surname, year, iq, pet, schedule, family);
    }

    @Override
    void greetPet() {
        System.out.println("Hello");
    }
    void readBook(){
        System.out.println("I'm reading");
    }
}
