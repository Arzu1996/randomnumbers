package homework.hw7;

class DomesticCat extends Pet implements Foul{
    DomesticCat(Species species, String nickname, int age, int trickLevel, String[] habits) {
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
    public void foul(){
        System.out.println("Oops");
    }
}
