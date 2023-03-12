/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetgroup.Models;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author salah
 */
public class Personne {
    private int IdPersonne;
    private String CIN;
    private String Nom;
    private String Prenom;
    private String Sexe;
    private String Adresse;
    private String DateNaissance;
   private ArrayList<Dooz> liste;
    public Personne() {
    }

    public Personne(int IdPersonne, String CIN, String Nom, String Prenom, String Sexe, String Adresse, String DateNaissance) {
        this.IdPersonne = IdPersonne;
        this.CIN = CIN;
        this.Nom = Nom;
        this.Prenom = Prenom;
        this.Sexe = Sexe;
        this.Adresse = Adresse;
        this.DateNaissance = DateNaissance;
        this.liste=new ArrayList<Dooz>();
    }

    public ArrayList<Dooz> getListe() {
        return liste;
    }

    public void setListe(ArrayList<Dooz> liste) {
        this.liste = liste;
    }
    

    public void setIdPersonne(int IdPersonne) {
        this.IdPersonne = IdPersonne;
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

    public void setSexe(String Sexe) {
        this.Sexe = Sexe;
    }

    public void setAdresse(String Adresse) {
        this.Adresse = Adresse;
    }

    public void setDateNaissance(String DateNaissance) {
        this.DateNaissance = DateNaissance;
    }

    public int getIdPersonne() {
        return IdPersonne;
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

    public String getSexe() {
        return Sexe;
    }

    public String getAdresse() {
        return Adresse;
    }

    public String getDateNaissance() {
        return DateNaissance;
    }
    
    
    
    
}
