package controller;

import java.util.List;
import dataDAO.datakamarDAO;
import DAOimplement.datakamar;
import model.*;
import main.MainView;

public class datakamarcontroller {
    MainView frame;
    datakamar implmnData;
    List<Kamar> daftarkamar;

    public datakamarcontroller(MainView frame) {
        this.frame = frame;
        implmnData = new datakamarDAO();
        daftarkamar = implmnData.getAll();
    }

 public void updateKamar() {
        Kamar kamar = new Kamar();
        //kamar.setId_kamar(Integer.parseInt(frame.getjTextIdPasien().getText()));/////////
        kamar.setId_kamar(Integer.parseInt(frame.getjTextKamar().getText()));
        kamar.setTerisi(Integer.parseInt(frame.getTemp().getText())+1);//terisi
        kamar.setKapasitas(Integer.parseInt(frame.getTemp2().getText()));//kapasitas
        implmnData.update(kamar);
    }

 public void isiTabelKamar() {
        daftarkamar = implmnData.getAll();
        modeltabelkamar v = new  modeltabelkamar(daftarkamar);
        frame.getJTabelKamar().setModel(v);
    }
 
  public void deletekamar(){
        Kamar kamar2 = new Kamar();
        kamar2.setId_kamar(Integer.parseInt(frame.getjTextKamar().getText()));
        kamar2.setTerisi(Integer.parseInt(frame.getTemp().getText())-1);//terisi
        implmnData.update(kamar2);
        }
}
