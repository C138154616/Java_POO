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
public class PersonneVaccinerDTO {
    private int idPersonne;
    private int nbrDooz;
    private String CIN;
    private String Nom;
    private String Prenom;

    public PersonneVaccinerDTO(int idPersonne, int nbrDooz, String CIN, String Nom, String Prenom) {
        this.idPersonne = idPersonne;
        this.nbrDooz = nbrDooz;
        this.CIN = CIN;
        this.Nom = Nom;
        this.Prenom = Prenom;
    }

    public PersonneVaccinerDTO() {
    }

    public int getIdPersonne() {
        return idPersonne;
    }

    public int getNbrDooz() {
        return nbrDooz;
    }

    public String getCIN() {
        return CIN;
    }

    public String getNom() {
        return Nom;
    }

    public String getPrenom() {
        return Prenom;
    }

    public void setIdPersonne(int idPersonne) {
        this.idPersonne = idPersonne;
    }

    public void setNbrDooz(int nbrDooz) {
        this.nbrDooz = nbrDooz;
    }

    public void setCIN(String CIN) {
        this.CIN = CIN;
    }

    public void setNom(String Nom) {
        this.Nom = Nom;
    }

    public void setPrenom(String Prenom) {
        this.Prenom = Prenom;
    }


    
}
