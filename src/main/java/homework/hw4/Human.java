package homework.hw4;

import homework.hw3.Schedule;

public class Human {

    private String name;
    private String surname;
    private int year;
    private int iq;
    private Pet pet;
    private Human mother;
    private Human father;
    Schedule schedule;

    Human(String name, String surname, int year) {
        this.name = name;
        this.surname = surname;
        this.year = year;
    }

    public Human(String name, String surname, int year, Human mother, Human father) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.mother = mother;
        this.father = father;
    }

    Human(String name, String surname, int year, int iq, Pet pet, Human mother, Human father) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
        this.pet = pet;
        this.mother = mother;
        this.father = father;
    }

    public Human() {
    }

    void greetPet() {
        System.out.printf("Hello, %s", pet.nickname);
    }

    void describePet() {
        String trick = " ";
        if (pet.trickLevel > 50) trick = "very sly";
        else if (pet.trickLevel < 50)
            trick = "almost not sly";
        System.out.printf
                ("I have a %s, " +
                                "he is %d years old, " +
                                "he is %s\n"
                        , pet.species, pet.age, trick);
    }

    public String toString() {
        return ("Human{name=" + name + ",surname=" + surname + ",year=" + year + ",iq=" + iq + ",mother=" + mother.name + " " + mother.surname + ",father=" + father.name + " " + father.surname + ",pet=" + pet + "}"
        );
    }
}


