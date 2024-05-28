package DAOimplement;

import java.util.List;
import model.Pasien;

public interface dataimplement {

    void insert(Pasien p);
    void update(Pasien p);
    void delete(int id_pasien);
    List<Pasien> getAll();
    void clear();
}

