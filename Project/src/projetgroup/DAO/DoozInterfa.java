/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetgroup.DAO;

import java.util.List;
import projetgroup.Models.Dooz;
import projetgroup.Models.PersonneVaccinerDTO;
import projetgroup.Models.VaccinDTO;


/**
 *
 * @author salah
 */
public interface DoozInterfa {
    List<Dooz> getAllDoze(int id);
    Dooz getDozeById(int id);
    boolean DozeExist(int id);
    void addDoze(Dooz dooz);
    void updateDoze(Dooz dooz);
    void deleteDoze (int id);
    List<VaccinDTO> getAllVaccinDTO(int id);
    List<PersonneVaccinerDTO> getAllPersonneVacciner();
    List<PersonneVaccinerDTO> getAllPersonneVacciner1(String a);

    
}
