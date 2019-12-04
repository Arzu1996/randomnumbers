package homework.hw10;

import homework.hw10.DAO.CollectionFamilyDao;
import homework.hw10.DAO.FamilyDao;

import java.time.LocalDate;
import java.time.Period;
import java.time.Year;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Set;

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

    public void bornChild(String feminine, String masculine, Family family) {
        String surname = family.getMother().getSurname();
        LocalDate birthDate = LocalDate.now();
        Random generator = new Random();
        String[] gender = {"Male", "Female"};
        int a = generator.nextInt(gender.length);
        String setGender = gender[a];
        if ("male".equalsIgnoreCase(setGender)) {
            Man child = new Man(masculine, surname,birthDate);
            family.addChild(child);
        }
        if ("female".equalsIgnoreCase(setGender)) {
            Woman child = new Woman(feminine, surname, birthDate);
            family.addChild(child);
        }
    }

    public void adoptChild(Human child, Family family) {
        family.getChildren().add(child);

    }

    public void deleteAllChildrenOlderThen(int age) {
        List<Family> families = getAllFamilies();
        LocalDate now = LocalDate.now();
        for (Family family : families) {
            if (family.getChildren() != null) {
                for (int i = 0; i < family.getChildren().size(); i++) {
                    if (Period.between(family.getChildren().get(i).getBirthDate(), now).getYears() > age) {
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
