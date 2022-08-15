/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ffos.controller;

import ffos.model.Tata;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Ivor
 */

public class ObradaTata extends Obrada<Tata> {

    public void SetData(String ime,String godine, String datum){
    if(getEntitet()==null){
    Tata t = new Tata();
     SimpleDateFormat df = new SimpleDateFormat("dd.MM.yyyy.");
        try {
            t.setIme(ime);
            t.setGodine(Integer.parseInt(godine));
            t.setDatum((Date)df.parse(datum));
        } catch (Exception e) {
        } setEntitet(t);
    } else {
            SimpleDateFormat df = new SimpleDateFormat("dd.MM.yyyy.");
        try {
            getEntitet().setIme(ime);
            getEntitet().setGodine(Integer.parseInt(godine));
            getEntitet().setDatum((Date)df.parse(datum));
        } catch (Exception e) {
        }
    }
        
    }
    
      public List <Tata> read(){
    return session.createQuery("from Tata").list();
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    @Override
    public void kontrolaCreate() throws Exception {
    }

    @Override
    public void kontrolaUpdate() throws Exception {
    }

    @Override
    public void kontrolaDelete() throws Exception {
    }
    
}
