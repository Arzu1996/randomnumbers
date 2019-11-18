package homework.hw8;

import java.util.*;

public class Family {
    private Human mother;
    private Human father;
    private ArrayList<Human> children;

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

    public List<Human>  getChildren() {
        return children;
    }

    public void setChildren(ArrayList<Human>  children) {
        this.children = children;
    }
    Family(Human mother, Human father) {
        this.mother = mother;
        this.father = father;
    }

    public Family(Human mother, Human father,ArrayList<Human>  children) {
        this.mother = mother;
        this.father = father;
        this.children = children;
    }

    @Override
    public String toString() {
        return "Family{" +
                "mother=" + mother +
                ", father=" + father +
                ", children=" + children +
                '}';
    }

    void addChild(Human child) {
        if (children == null) {
            children = new ArrayList<>() ;
            children.add(child);
        } else {
           children.add(child);
        }
    }

    void deleteChild(int index) {
        children.remove(index);
    }

    int countFamily() {
        return children.size() + 2;
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
