package homework.hw8;

import java.util.*;

public class Family {
    private Human mother;
    private Human father;
    private ArrayList<Human> children;
    private Pet pet;
    private Set<Pet> pets= new HashSet<>();


    public Family(Human mother, Human father) {
        this.mother = mother;
        this.father = father;
    }

    public Family(Human mother, Human father, ArrayList<Human> children) {
        this.mother = mother;
        this.father = father;
        this.children = children;
    }

    public Family(Human mother, Human father, Set<Pet> pets) {
        this.mother = mother;
        this.father = father;
        this.pets = pets;
    }

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

    public ArrayList<Human> getChildren() {
        return children;
    }

    public void setChildren(ArrayList<Human> children) {
        this.children = children;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public Set<Pet> getPets() {
        return pets;
    }

    public void setPets(Set<Pet> pets) {
        this.pets = pets;
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
    public String toString() {
        return "Family{" +
                "mother=" + mother +
                ", father=" + father +
                ", children=" + children +
                ", pets=" + pets +
                '}';
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
