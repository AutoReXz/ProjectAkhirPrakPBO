package DAOimplement;

import java.util.List;
import model.*;

public interface datastaffimplement {

    void insert(Staff p);
    void update(Staff p);
    void delete(int id_staff);
    List<Staff> getAll();
    void clear();
}

