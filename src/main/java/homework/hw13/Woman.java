package homework.hw13;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Map;

final class Woman extends Human {
    Woman(String name, String surname, LocalDate birthDate) {
        super(name, surname, birthDate);
    }

    Woman(String name, String surname, LocalDate birthDate, int iq, Family family) {
        super(name, surname, birthDate, iq, family);
    }

    Woman(String name, String surname, LocalDate birthDate, int iq, Map<String,String> schedule) {
        super(name, surname, birthDate, iq, schedule);
    }

    Woman(String name, String surname, LocalDate birthDate, int iq, Map<String,String> schedule, Family family) {
        super(name, surname, birthDate, iq, schedule, family);
    }

    Woman(String name, String surname, LocalDate birthDate, int iq) {
        super(name, surname, birthDate, iq);
    }


    @Override
    void greetPet() {
        System.out.println("Hello");
    }
    void readBook(){
        System.out.println("I'm reading");
    }
}
