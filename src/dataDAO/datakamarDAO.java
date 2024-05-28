package dataDAO;

import java.sql.*;
import java.util.ArrayList;
import java.util.*;
import javax.swing.JOptionPane;
import koneksi.connector;
import DAOimplement.datakamar;
import model.*;

public class datakamarDAO implements datakamar {
    Connection connection;
    
    final String select = "SELECT * FROM kamar;";
    final String select2 = "SELECT nomor_kamar, terisi FROM kamar;";
    //final String insert = "INSERT INTO kamar (id_pasien, nama, alamat, jenis_kelamin, nomor_telepon, kamar) VALUES (NULL, ?, ?, ?, ?, ?)";
    final String update = "UPDATE kamar SET terisi =? WHERE nomor_kamar=?";
    //final String delete = "DELETE FROM pasien WHERE id_pasien=?";
    
    public datakamarDAO() {
        connection = connector.connection();
    }

    @Override
    public void update(Kamar p) {
        PreparedStatement statement = null;
        try {
            
           /*Statement stt = connection.createStatement();
            ResultSet rss = stt.executeQuery(select);
            while (rss.next()) {
                int temp1 = rss.getInt("nomor_kamar");
                int temp2 = rss.getInt("terisi");
            }*/
            statement = connection.prepareStatement(update);
            statement.setInt(1, p.getTerisi()); //bagaimana baca data dari database
            statement.setInt(2, p.getId_kamar());
            statement.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {     
                    ex.printStackTrace();
                }
            }
        }
    }


    @Override
    public List<Kamar> getAll() {
        List<Kamar> dp = new ArrayList<>();
        try {
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(select);
            while (rs.next()) {
                Kamar kamar = new Kamar();
                kamar.setId_kamar(rs.getInt("id"));
                kamar.setNomor_kamar(rs.getInt("nomor_kamar"));
                kamar.setJenis_kamar(rs.getString("jenis_kamar"));
                kamar.setFasilitas(rs.getString("fasilitas"));
                kamar.setHarga(rs.getInt("harga"));
                kamar.setStatus(rs.getString("status"));
                kamar.setLantai_kamar(rs.getInt("lantai_kamar"));
                kamar.setTerisi(rs.getInt("terisi"));
                kamar.setKapasitas(rs.getInt("kapasitas"));
                dp.add(kamar);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return dp;
    }

    @Override
    public void clear() {
        try {
            Statement statement = connection.createStatement();
            statement.executeUpdate("DELETE FROM kamar");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
