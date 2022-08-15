/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ffos.model;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Ivor
 */
@Entity
public class Tata extends Entitet {
    private String ime;
    private Integer  godine;     //SVE VELIKIM SLOVOM 
     @Temporal(TemporalType.DATE)
     private Date datum;

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public Integer getGodine() {
        return godine;
    }

    public void setGodine(Integer godine) {
        this.godine = godine;
    }

    public Date getDatum() {
        return datum;
    }

    public void setDatum(Date datum) {
        this.datum = datum;
    }
     
     @Override
     public String toString(){
     return ime;
     }
}
