package homework.hw9;

import homework.hw9.DAO.CollectionFamilyDao;
import homework.hw9.DAO.FamilyDao;

import java.time.Year;
import java.util.*;

public class FamilyService {
    private FamilyDao<Family> familyDao = new CollectionFamilyDao();

    public List<Family> getAllFamilies() {
        return familyDao.getAllFamilies();
    }

    public void saveFamily(Family f) {
        familyDao.saveFamily(f);
    }

    public void displayAllFamilies() {
        getAllFamilies().forEach(System.out::println);
    }

    public List<Family> getFamiliesBiggerThan(int value) {
        List<Family> familiesBiggerThan = new ArrayList<>();
        List<Family> families = getAllFamilies();
        for (Family fam : families) {
            if (fam.countFamily() > value) {
                familiesBiggerThan.add(fam);
            }
        }
        return familiesBiggerThan;
    }

    public List<Family> getFamiliesLessThan(int value) {
        List<Family> familiesLessThan = new ArrayList<>();
        List<Family> families = getAllFamilies();
        for (Family family : families) {
            if (family.countFamily() < value) {
                familiesLessThan.add(family);
            }
        }
        return familiesLessThan;
    }

    public int countFamiliesWithMemberNumber(int value) {
        int count = 0;
        List<Family> families = getAllFamilies();
        for (Family fam : families) {
            if (fam.countFamily() == value) {
                count++;
            }
        }
        return count;
    }

    public void createNewFamily(Woman mother, Man father) {
        Family family = new Family(mother, father);
        saveFamily(family);
    }

    public void deleteFamilyByIndex(int index) {
        familyDao.deleteFamily(index);
    }

    public Family bornChild(String feminine, String masculine, Family family) {
        String surname = family.getMother().getSurname();
        int year = Year.now().getValue();
        Random generator = new Random();
        String[] gender = {"Male", "Female"};
        int a = generator.nextInt(gender.length);
        String setGender = gender[a];
        if ("male".equalsIgnoreCase(setGender)) {
            Man child = new Man(masculine, surname, year);
            family.addChild(child);
        }
        if ("female".equalsIgnoreCase(setGender)) {
            Woman child = new Woman(feminine, surname, year);
            family.addChild(child);
        }
        return family;
    }

    public Family adoptChild(Human child, Family family) {
        family.getChildren().add(child);

        return family;
    }

    public void deleteAllChildrenOlderThen(int age) {
        List<Family> families = getAllFamilies();
        int year = Year.now().getValue();
        for (Family family : families) {
            if (family.getChildren() != null) {
                for (int i = 0; i < family.getChildren().size(); i++) {
                    if (year - family.getChildren().get(i).getYear() > age) {
                        family.deleteChild(i);
                    }
                }
            }
        }
    }

    public int count() {
        return getAllFamilies().size();
    }

    public Family getFamilyById(int index) {
        return familyDao.getFamilyByIndex(index);
    }

    public Set<Pet> getPets(int index) {
        return getFamilyById(index).getPets();
    }

    public void addPet(int index, Pet pet) {
        getFamilyById(index).getPets().add(pet);
    }
}
