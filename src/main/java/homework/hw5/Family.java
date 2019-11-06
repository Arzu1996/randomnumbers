package homework.hw5;


import java.util.Arrays;
import java.util.Objects;

public class Family {
    private Human mother;
    private Human father;
    private Human[] children;
    private Pet pet;

    public Human getMother() {
        return mother;
    }

    public void setMother(Human mother) {
        this.mother = mother;
    }

    public Human getFather() {
        return father;
    }

    public void setFather(Human father) {
        this.father = father;
    }

    public Human[] getChildren() {
        return children;
    }

    public void setChildren(Human[] children) {
        this.children = children;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    Family(Human mother, Human father) {
        this.mother = mother;
        this.father = father;
    }

    @Override
    public String toString() {
        return "Family{" +
                "mother=" + mother +
                ", father=" + father +
                ", children=" + Arrays.toString(children) +
                ", pet=" + pet +
                '}';
    }

    public Family(Human mother, Human father, Human[] children) {
        this.mother = mother;
        this.father = father;
        this.children = children;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Family)) return false;
        Family family = (Family) o;
        return mother.equals(family.mother) &&
                father.equals(family.father) &&
                Arrays.equals(children, family.children) &&
                Objects.equals(pet, family.pet);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(mother, father, pet);
        result = 31 * result + Arrays.hashCode(children);
        return result;
    }

    void addChild(Human child) {
        if (children == null) {
            children = new Human[]{child};
        } else {
            children = Arrays.copyOf(children, children.length + 1);
            children[children.length - 1] = child;
        }
    }

    boolean deleteChild(int index) {
        if (children == null) {
            return false;
        }
        Human[] copy = new Human[children.length - 1];
        for (int i = 0; i < children.length; i++) {
            if (i == index) {
                System.arraycopy(children, 0, copy, 0, i);
                System.arraycopy(children, i + 1, copy, i, children.length - i - 1);

            }
        }
        children = copy;
        return true;
    }

    int countFamily() {
        return children.length + 2;
    }
}
