package homework.hw8;

import java.util.Set;

class Dog extends Pet {
    Dog(Species species, String nickname, int age, int trickLevel, Set<String> habits) {
        super(species, nickname, age, trickLevel, habits);
    }

    @Override
    void respond() {
        System.out.println("Hey");
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
