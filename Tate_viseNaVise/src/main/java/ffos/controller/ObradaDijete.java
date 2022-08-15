/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ffos.controller;

import ffos.model.Dijete;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Ivor
 */
public class ObradaDijete extends Obrada <Dijete> {

    
    public void SetData(String ime, String prezime){
    if(getEntitet()==null){
    Dijete d = new Dijete();
        try {
            d.setIme(ime);
            d.setPrezime(prezime);
        } catch (Exception e) {
        } setEntitet(d);
    } else {
        try {
            getEntitet().setIme(ime);
            getEntitet().setPrezime(prezime);
        } catch (Exception e) {
        }
    }
        
    }
    
    
    public List <Dijete> read(){
    return session.createQuery("from Dijete").list();
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
