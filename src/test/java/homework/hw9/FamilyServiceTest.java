package homework.hw9;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class FamilyServiceTest {
    private List<Family> families;
    private Family Whites;
    private Family Greys;

    @Before
    public void setUp() {
        families =new ArrayList<>();
        Greys = new Family(
                new Woman("Sara", "Grey", 1977),
                new Man("Sam", "Grey", 1974));
        Whites = new Family(
                new Woman("Sarah", "White", 1957),
                new Man("Sam", "White", 1954));
        Human child = new Woman("Selby", "Grey", 1998, 87, Greys);
        Human child2 = new Woman("Jane", "Grey", 1988, 72, Whites);
        Greys.addChild(child);
        Whites.addChild(child2);
        families.add(Greys);
    }

    @Test
    public void testGetAllFamilies() {
        assertEquals(1,families.size());
    }

    @Test
    public void testSaveFamily() {
        families.add(Whites);
        assertEquals(2,families.size());
    }

    @Test
    public void testCount() {
        assertEquals(1,families.size());
    }

    @Test
    public void testGetFamilyById() {
        assertEquals(Greys,families.get(0));
    }

    @Test
    public void testDeleteFamilyByIndex() {
        families.remove(Greys);
        assertEquals(0,families.size());
    }

}