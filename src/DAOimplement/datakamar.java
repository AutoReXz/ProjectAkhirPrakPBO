package DAOimplement;

import java.util.List;
import model.Kamar;

public interface datakamar {

    void update(Kamar p);
    List<Kamar> getAll();
    void clear();
}

