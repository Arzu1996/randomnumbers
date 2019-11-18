package homework.hw7;

import java.util.Arrays;
import java.util.Objects;

public class Family {
    private Human mother;
    private Human father;
    private Human[] children;

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
    Family(Human mother, Human father) {
        this.mother = mother;
        this.father = father;
    }

    public Family(Human mother, Human father, Human[] children) {
        this.mother = mother;
        this.father = father;
        this.children = children;
    }

    @Override
    public String toString() {
        return "Family{" +
                "mother=" + mother +
                ", father=" + father +
                ", children=" + Arrays.toString(children) +
                '}';
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
        if((index < 0) || (index > (children.length - 1))){
            System.out.println("Wrong index");
            return false;
        }
        else {
            for (int i = 0; i < children.length; i++) {
                if (i == index) {
                    System.arraycopy(children, 0, copy, 0, i);
                    System.arraycopy(children, i + 1, copy, i, children.length - i - 1);
                    System.out.println(children[index].getName()+" "+"got removed");
                }
            }
        }
        children = copy;
        return true;
    }

    int countFamily() {
        return children.length + 2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Family)) return false;
        Family family = (Family) o;
        return Objects.equals(mother, family.mother) &&
                Objects.equals(father, family.father);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mother, father);
    }

    @Override
    protected void finalize() {
        System.out.println("Removal of object");
    }
}
