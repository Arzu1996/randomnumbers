package homework.hw9;

import java.util.Map;

public final class Man extends Human {
    Man(String name, String surname, int year) {
        super(name, surname, year);
    }

    Man(String name, String surname, int year, int iq, Family family) {
        super(name, surname, year, iq, family);
    }

    public Man(String name, String surname, int year, int iq,Map<String,String> schedule) {
        super(name, surname, year, iq,schedule);
    }

    public Man(String name, String surname, int year, int iq, Map<String,String> schedule, Family family) {
        super(name, surname, year, iq,schedule, family);
    }

    @Override
    void greetPet() {
        System.out.println("Hi");
    }
    void watchingTv(){
        System.out.println("I'm watching TV");
    }
}
