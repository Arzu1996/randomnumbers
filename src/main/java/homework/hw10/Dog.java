package homework.hw10;

import java.util.Set;

class Dog extends Pet implements Foulable {
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
    public void foul(){
        System.out.println("Oops");
    }
}
