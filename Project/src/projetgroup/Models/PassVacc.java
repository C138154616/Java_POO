/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetgroup.Models;

/**
 *
 * @author salah
 */
public class PassVacc {
    private int PassVaccId;
    private int NumDooz;
    private Personne personne;

    public PassVacc(int PassVaccId, int NumDooz, Personne personne) {
        this.PassVaccId = PassVaccId;
        this.NumDooz = NumDooz;
        this.personne = personne;
    }

    public int getPassVaccId() {
        return PassVaccId;
    }

    public int getNumDooz() {
        return NumDooz;
    }

    public Personne getPersonne() {
        return personne;
    }

    public void setPassVaccId(int PassVaccId) {
        this.PassVaccId = PassVaccId;
    }

    public void setNumDooz(int NumDooz) {
        this.NumDooz = NumDooz;
    }

    public void setPersonne(Personne personne) {
        this.personne = personne;
    }
    
    
}
