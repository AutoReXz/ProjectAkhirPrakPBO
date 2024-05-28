/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
    package model;
    import java.util.List;
    import javax.swing.table.AbstractTableModel;
    public class modeltabelstaff extends AbstractTableModel{  
        List<Staff> dp;
        public modeltabelstaff(List<Staff>dp){
            this.dp = dp;
        }  
        @Override
        public int getRowCount() {
            return dp.size();
        }  
        @Override
        public int getColumnCount() {
             return 4;
        }
        @Override
        public String getColumnName(int column) {
        switch(column){
                case 0:
                    return "Id Staff";
                case 1:
                    return "Nama";
                case 2:
                    return "Alamat";
                case 3:
                    return "Shift";
                default:
                    return null;
            }  
        }
        @Override
        public Object getValueAt(int row, int column) {
        switch(column){
                case 0:
                    return dp.get(row).getId_staff();
                case 1:
                    return dp.get(row).getNama();
                case 2:
                    return dp.get(row).getAlamat();
                case 3:
                    return dp.get(row).getSif();
                default:
                    return null;
            }     
        }  
    }
