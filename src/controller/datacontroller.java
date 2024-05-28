package controller;

import java.util.List;
import dataDAO.datapasienDAO;
import DAOimplement.dataimplement;
import model.*;
import main.MainView;

public class datacontroller {
    MainView frame;
    dataimplement implData;
    List<Pasien> daftarPasien;

    public datacontroller(MainView frame) {
        this.frame = frame;
        implData = new datapasienDAO();
        daftarPasien = implData.getAll();
    }

    public void insert() {
        Pasien pasien = new Pasien();
        pasien.setNama(frame.getjTextNama().getText());
        pasien.setAlamat(frame.getjTextAlamat().getText());
        pasien.setJenisKelamin(frame.getjTextJenisKelamin().getText());
        pasien.setNomorTelepon(frame.getjTextNomorTelepon().getText());
        pasien.setKamar(Integer.parseInt(frame.getjTextKamar().getText()));
        implData.insert(pasien);
    }

 public void update() {
        Pasien pasien = new Pasien();
        pasien.setIdPasien(Integer.parseInt(frame.getjTextIdPasien().getText()));
        pasien.setNama(frame.getjTextNama().getText());
        pasien.setAlamat(frame.getjTextAlamat().getText());
        pasien.setJenisKelamin(frame.getjTextJenisKelamin().getText());
        pasien.setNomorTelepon(frame.getjTextNomorTelepon().getText());
        pasien.setKamar(Integer.parseInt(frame.getjTextKamar().getText()));
        implData.update(pasien);
    }

 public void isiTabel() {
        daftarPasien = implData.getAll();
        modeltabelpasien modelPasien = new  modeltabelpasien(daftarPasien);
        frame.getJTabelData().setModel(modelPasien);
        
       
    }
 
 public void delete(){
    int id_pasien = Integer.parseInt(frame.getjTextIdPasien().getText());
    implData.delete(id_pasien);
    }
}
