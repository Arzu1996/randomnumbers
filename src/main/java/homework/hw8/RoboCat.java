package homework.hw8;

import java.util.Set;

public class RoboCat extends Pet implements Foul{
    RoboCat(Species species, String nickname, int age, int trickLevel, Set<String> habits) {
        super(species, nickname, age, trickLevel, habits);
    }

    @Override
    void respond() {
        System.out.println("I'm a robocat");
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
