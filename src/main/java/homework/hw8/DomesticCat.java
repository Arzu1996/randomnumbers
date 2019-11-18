package homework.hw8;

import java.util.Set;

class DomesticCat extends Pet {
    DomesticCat(Species species, String nickname, int age, int trickLevel, Set<String> habits) {
        super(species, nickname, age, trickLevel, habits);
    }

    @Override
    void respond() {
        System.out.println("Hi");
    }

    @Override
    void eat() {
        super.eat();
    }

    @Override
    void foul() {
        super.foul();
    }
}
