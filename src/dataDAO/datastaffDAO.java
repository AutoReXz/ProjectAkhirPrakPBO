package dataDAO;

import java.sql.*;
import java.util.*;
import koneksi.connector;
import model.*;
import DAOimplement.datastaffimplement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class datastaffDAO implements datastaffimplement{
    Connection connection;
    
    final String select = "select * from staff;";
    final String insert = "INSERT INTO staff (id_staff, nama, alamat, sif) VALUES (null, ?, ?, ?);";
    final String update = "UPDATE staff set nama=?, alamat=?, sif=? WHERE id_staff=?";
    final String delete = "DELETE from staff where id_staff=?";
    public datastaffDAO(){
        connection = connector.connection();
    }

@Override
public void insert(Staff p) {
    PreparedStatement statement = null;
    try {

        statement = connection.prepareStatement(insert, Statement.RETURN_GENERATED_KEYS);
     //   statement.setInt(1, p.getId_staff());
        statement.setString(1, p.getNama());
        statement.setString(2, p.getAlamat());
        statement.setString(3, p.getSif());
        
        
        statement.executeUpdate();
        ResultSet rs = statement.getGeneratedKeys();
        while (rs.next()) {
            p.setId_staff(rs.getInt(1));
        }
        JOptionPane.showMessageDialog(null, "Data staff sukses ditambahkan", "COMPLETE", JOptionPane.PLAIN_MESSAGE);
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
    public void update(Staff p) {
            PreparedStatement statement = null;
           try {
            statement = connection.prepareStatement(update);
            statement.setString(1, p.getNama());
            statement.setString(2, p.getAlamat());
            statement.setString(3, p.getSif());
            statement.setInt(4, p.getId_staff());
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
    public void delete(int id_staff) {
        PreparedStatement statement = null;
        try{
            statement = connection.prepareStatement(delete);
            
            statement.setInt(1, id_staff);
            statement.executeUpdate();
        }catch(SQLException ex){
            ex.printStackTrace();
        }finally{
            try{
                statement.close();
            }catch(SQLException ex){
                ex.printStackTrace();
            }
        }
    }

    @Override
    public List<Staff> getAll() {
        List<Staff> dp = null;
        try{
            dp = new ArrayList<Staff>();
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(select);
            while(rs.next()){
                Staff fl = new Staff();
                fl.setId_staff(rs.getInt("id_staff"));
                fl.setNama(rs.getString("Nama"));
                fl.setAlamat(rs.getString("Alamat"));
                fl.setSif(rs.getString("Sif"));
                dp.add(fl);
                
            }
        }catch(SQLException ex){
            Logger.getLogger(datastaffDAO.class.getName()).log(Level.SEVERE, null,ex);
        }
        
        return dp;
    }
    
    @Override
public void clear() {
    try {
        Statement statement = connection.createStatement();
        statement.executeUpdate("DELETE FROM staff");
    } catch (SQLException e) {
        e.printStackTrace();
    }
}
}

