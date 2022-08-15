/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ffos.model;


import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;

/**
 *
 * @author Ivor
 */
@Entity
public class Dijete extends Entitet{
    
    private String ime;
    private String prezime;
    @ManyToMany
    private List<Tata> tate = new ArrayList<>();

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public List<Tata> getTate() {
        return tate;
    }

    public void setTate(List<Tata> tate) {
        this.tate = tate;
    }
    
    
    @Override
    public String toString(){
    return ime + " " + prezime;
    }
}
