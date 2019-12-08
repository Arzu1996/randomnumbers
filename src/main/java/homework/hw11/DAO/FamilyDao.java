package homework.hw11.DAO;

import java.util.List;

public interface FamilyDao<T> {
    List<T> getAllFamilies();
    T getFamilyByIndex(int index);
    boolean deleteFamily(int index);
    boolean deleteFamily(T f);
    void saveFamily(T f);
}
