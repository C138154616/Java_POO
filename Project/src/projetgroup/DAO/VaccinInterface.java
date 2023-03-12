/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetgroup.DAO;

import java.util.List;
import projetgroup.Models.Vaccin;


/**
 *
 * @author salah
 */
public interface VaccinInterface {
    List<Vaccin> getAllVaccin();
    Vaccin getVaccinById(int id);
    boolean VaccinExist(int id);
    void addVaccin(Vaccin vaccin);
    void updateVaccin(Vaccin vaccin);
    void deleteVaccin (int id);
    
}
