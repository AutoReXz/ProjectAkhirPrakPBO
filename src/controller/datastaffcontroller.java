package controller;

import java.util.List;
import dataDAO.datastaffDAO;
import DAOimplement.datastaffimplement;
import model.*;
import main.StaffView;

public class datastaffcontroller {
    StaffView frame;
    datastaffimplement impldata;
    List<Staff> dp;
    
    public datastaffcontroller(StaffView frame){
        this.frame = frame;
        impldata = new datastaffDAO();
        dp = impldata.getAll();
    }
    public void isitabel(){
        dp = impldata.getAll();
        modeltabelstaff mp = new modeltabelstaff(dp);
        frame.getTabelData().setModel(mp);
    }
    
     public void insert(){
        Staff dp = new Staff();
    //    dp.setId_staff(Integer.parseInt(frame.getjTextIdStaff().getText()));
        dp.setNama(frame.getjTextNama().getText());
        dp.setAlamat(frame.getjTextAlamat().getText());
        dp.setSif(frame.getjTextSif().getText());
        impldata.insert(dp);
        
    }
   
     public void update(){
        Staff dp = new Staff();
        dp.setId_staff(Integer.parseInt(frame.getjTextIdStaff().getText()));
        dp.setNama(frame.getjTextNama().getText());
        dp.setAlamat(frame.getjTextAlamat().getText());
        dp.setSif(frame.getjTextSif().getText());
        impldata.update(dp);
    }
     
     public void delete(){
        int id_staff = (Integer.parseInt(frame.getjTextIdStaff().getText()));
        impldata.delete(id_staff);
    }
}
