/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetgroup.DAO;

import java.util.List;
import projetgroup.Models.Personne;

/**
 *
 * @author salah
 */
public interface PersonneInterface {
    List<Personne> getAllPersonne();
    Personne getPersonneById(int id);
    boolean personneExist(int id);
    void addPersonne(Personne personne);
    void updatePersonne(Personne personne);
    void deletePersonne (int id);
    boolean getPersonneByCIN(String CIN);
    List<Personne> getAllPersonne1(String a);
    Personne getPersonneByCIN2(String CIN);
}
