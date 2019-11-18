package homework.hw7;

public class Fish extends Pet {
    Fish(Species species, String nickname, int age, int trickLevel, String[] habits) {
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
}
