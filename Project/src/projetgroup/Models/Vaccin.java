/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetgroup.Models;

import java.util.ArrayList;

/**
 *
 * @author salah
 */
public class Vaccin {
    private int VaccinId;
    private String Type;
    private String Description;
    private ArrayList<Dooz> liste;
    public Vaccin(int VaccinId, String Type, String Description) {
        this.VaccinId = VaccinId;
        this.Type = Type;
        this.Description = Description;
        this.liste=new ArrayList<Dooz>();
      
    }

    @Override
    public String toString() {
        return  Type ;
    }

    public Vaccin() {
        
    }

    public void setListe(ArrayList<Dooz> liste) {
        this.liste = liste;
    }

    public ArrayList<Dooz> getListe() {
        return liste;
    }

    public int getVaccinId() {
        return VaccinId;
    }

    public String getType() {
        return Type;
    }

    public String getDescription() {
        return Description;
    }

    

    public void setVaccinId(int VaccinId) {
        this.VaccinId = VaccinId;
    }

    public void setType(String Type) {
        this.Type = Type;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    
    
}
