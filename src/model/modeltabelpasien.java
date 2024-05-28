package model;

import java.util.List;
import javax.swing.table.AbstractTableModel;

public class modeltabelpasien extends AbstractTableModel {  
    List<Pasien> dp;

    public modeltabelpasien(List<Pasien> dp){
        this.dp = dp;
    }  

    @Override
    public int getRowCount() {
        return dp.size();
    }  

    @Override
    public int getColumnCount() {
         return 6; // Ada 6 kolom dalam tabel pasien
    }

    @Override
    public String getColumnName(int column) {
        switch(column){
            case 0:
                return "ID Pasien";
            case 1:
                return "Nama";
            case 2:
                return "Alamat";
            case 3:
                return "Jenis Kelamin";
            case 4:
                return "Nomor Telepon";
            case 5:
                return "Kamar";
            default:
                return null;
        }  
    }

    @Override
    public Object getValueAt(int row, int column) {
        Pasien pasien = dp.get(row);
        switch(column){
            case 0:
                return pasien.getIdPasien();
            case 1:
                return pasien.getNama();
            case 2:
                return pasien.getAlamat();
            case 3:
                return pasien.getJenisKelamin();
            case 4:
                return pasien.getNomorTelepon();
            case 5:
                return pasien.getKamar();
            default:
                return null;
        }     
    }  
}

