/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetgroup.Models;

import java.util.Date;

/**
 *
 * @author salah
 */
public class Dooz {
    private int IdDooz;
    private int NumDooz;
    private Date DateDooz;
    private Personne personne;
    private Vaccin vaccin;
    public Dooz(int IdDooz, int NumDooz, Date DateDooz, Personne personne,Vaccin vaccin) {
        this.IdDooz = IdDooz;
        this.NumDooz = NumDooz;
        this.DateDooz = DateDooz;
        this.personne = personne;
        this.vaccin=vaccin;
    }

    public void setVaccin(Vaccin vaccin) {
        this.vaccin = vaccin;
    }

    public Vaccin getVaccin() {
        return vaccin;
    }

    public Dooz() {
    }

    public int getIdDooz() {
        return IdDooz;
    }

    public int getNumDooz() {
        return NumDooz;
    }

    public Date getDateDooz() {
        return DateDooz;
    }

    public Personne getPersonne() {
        return personne;
    }

    public void setIdDooz(int IdDooz) {
        this.IdDooz = IdDooz;
    }

    public void setNumDooz(int NumDooz) {
        this.NumDooz = NumDooz;
    }

    public void setDateDooz(Date DateDooz) {
        this.DateDooz = DateDooz;
    }

    public void setPersonne(Personne personne) {
        this.personne = personne;
    }
    
    
}
