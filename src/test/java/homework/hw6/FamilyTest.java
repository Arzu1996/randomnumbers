package homework.hw6;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FamilyTest {
    private Family family;
    private Human mother;
    private Human father;
    private Human child;
    private Human child2;

    @Before
    public void setUp() {
        family= new Family(mother,father);
        mother = new Human("Sara", "Grey", 1977);
        father = new Human("Sam", "Grey", 1974);
        child = new Human("Selby", "Grey", 1998, 87,family);
        child2 = new Human("Jane", "Grey", 1988, 72,family);
    }


    @Test
    public void addChild() {
        family.addChild(child);
        assertEquals(1,family.getChildren().length);
    }

    @Test
    public void deleteChild() {
        family.addChild(child2);
        assertEquals(1,family.getChildren().length);
        family.deleteChild(0);
        assertEquals(0,family.getChildren().length);
    }

    @Test
    public void countFamily() {
        family.addChild(child);
        family.addChild(child2);
        assertEquals(4,family.countFamily());
    }

}