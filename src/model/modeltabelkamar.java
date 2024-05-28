package model;

import java.util.List;
import javax.swing.table.AbstractTableModel;

public class modeltabelkamar extends AbstractTableModel {  
    List<Kamar> dp;

    public modeltabelkamar(List<Kamar> dp){
        this.dp = dp;
    }  

    @Override
    public int getRowCount() {
        return dp.size();
    }  

    @Override
    public int getColumnCount() {
         return 9;
    }

    @Override
    public String getColumnName(int column) {
        switch(column){
            case 0:
                return "ID Kamar";
            case 1:
                return "Nomor Kamar";
            case 2:
                return "Jenis Kamar";
            case 3:
                return "Fasilitas";
            case 4:
                return "Harga Kamar";
            case 5:
                return "Status";
            case 6:
                return "Lantai Kamar";
            case 7:
                return "Terisi";
            case 8:
                return "Kapasitas";
            default:
                return null;
        }  
    }

    @Override
    public Object getValueAt(int row, int column) {
        Kamar kamar = dp.get(row);
        switch(column){
            case 0:
                return kamar.getId_kamar();
            case 1:
                return kamar.getNomor_kamar();
            case 2:
                return kamar.getJenis_kamar();
            case 3:
                return kamar.getFasilitas();
            case 4:
                return kamar.getHarga();
            case 5:
                return kamar.getStatus();
            case 6:
                return kamar.getLantai_kamar();
            case 7:
                return kamar.getTerisi();
            case 8:
                return kamar.getKapasitas();
            default:
                return null;
        }     
    }  
}

