/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetgroup.DAO;

import java.util.List;
import projetgroup.Models.PassVacc;

/**
 *
 * @author salah
 */
public interface PassVaccInterface {
    List<PassVacc> getAllPassVacc();
    PassVacc getPassVaccById(int id);
    boolean PassVaccExist(int id);
    void addPassVacc(PassVacc passvacc);
    void updatePassVacc(PassVacc passvac);
    void deletePassVacc (int id);
    
}
