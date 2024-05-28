package dataDAO;

import java.sql.*;
import java.util.ArrayList;
import java.util.*;
import javax.swing.JOptionPane;
import koneksi.connector;
import DAOimplement.dataimplement;
import model.*;

public class datapasienDAO implements dataimplement {
    Connection connection;
    
    final String select = "SELECT * FROM pasien;";
    final String insert = "INSERT INTO pasien (id_pasien, nama, alamat, jenis_kelamin, nomor_telepon, kamar) VALUES (NULL, ?, ?, ?, ?, ?)";
    final String update = "UPDATE pasien SET nama =?, alamat=?, jenis_kelamin=?, nomor_telepon=?, kamar=? WHERE id_pasien=?";
    final String delete = "DELETE FROM pasien WHERE id_pasien=?";
    
    public datapasienDAO() {
        connection = connector.connection();
    }

    @Override
    public void insert(Pasien p) {
        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(insert);
            statement.setString(1, p.getNama());
            statement.setString(2, p.getAlamat());
            statement.setString(3, p.getJenisKelamin());
            statement.setString(4, p.getNomorTelepon());
            statement.setInt(5, p.getKamar());
            
            statement.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data pasien berhasil ditambahkan", "COMPLETE", JOptionPane.PLAIN_MESSAGE);
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
public void update(Pasien p) {
    PreparedStatement statement = null;
    try {
        statement = connection.prepareStatement(update);
        statement.setString(1, p.getNama());
        statement.setString(2, p.getAlamat());
        statement.setString(3, p.getJenisKelamin());
        statement.setString(4, p.getNomorTelepon());
        statement.setInt(5, p.getKamar());
        statement.setInt(6, p.getIdPasien());
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
    public void delete(int id_pasien) {
        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(delete);
            statement.setInt(1, id_pasien);
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
    public List<Pasien> getAll() {
        List<Pasien> dp = new ArrayList<>();
        try {
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(select);
            while (rs.next()) {
                Pasien pasien = new Pasien();
                pasien.setIdPasien(rs.getInt("id_pasien"));
                pasien.setNama(rs.getString("nama"));
                pasien.setAlamat(rs.getString("alamat"));
                pasien.setJenisKelamin(rs.getString("jenis_kelamin"));
                pasien.setNomorTelepon(rs.getString("nomor_telepon"));
                pasien.setKamar(rs.getInt("kamar"));
                dp.add(pasien);
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
            statement.executeUpdate("DELETE FROM pasien");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
