/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetgroup.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import projetgroup.Models.Vaccin;
import projetgroup.utils.DbConnection;

/**
 *
 * @author salah
 */
public class VaccinDaoImpl implements VaccinInterface {
    private PreparedStatement query;
    private ResultSet result;
    private Connection cnx;

    public VaccinDaoImpl() {
       cnx=DbConnection.Seconnecter();
    }
    @Override
    public List<Vaccin> getAllVaccin() {
        List<Vaccin>vaccin = new ArrayList<>();
        try{
        
        query =cnx.prepareStatement("SELECT * FROM vaccin");
        result =query.executeQuery();
        while(result.next()){
            Vaccin v= new Vaccin();
            v.setVaccinId(result.getInt(1));
            v.setDescription(result.getString(3));
            v.setType(result.getString(2));

             vaccin.add(v);
        }
        return vaccin;
    }   catch (SQLException ex) {
            Logger.getLogger(VaccinDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return vaccin;
       
    }

    @Override
    public Vaccin getVaccinById(int VaccinId) {
          try{
        query=cnx.prepareStatement("SELECT * FROM vaccin WHERE idVaccin=?");
        query.setInt(1,VaccinId);
        result=query.executeQuery();
        if(result.next()){
            Vaccin v= new Vaccin();
            v.setVaccinId(result.getInt(1));
            v.setDescription(result.getString(3));
            v.setType(result.getString(2));     
            return v;
    }
         } catch (SQLException ex) {
            Logger.getLogger(VaccinDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public boolean VaccinExist(int VaccinId) {
        try{
             query = cnx.prepareStatement("SELECT count(idVaccin)from vaccin where idVaccin=?");
             query.setInt(0, VaccinId);
             result=query.executeQuery();
             if(result.next())
                 return true;
             
            
        } catch (SQLException ex) {
            Logger.getLogger(VaccinDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    @Override
    public void addVaccin(Vaccin vaccin) {
        try {
            String strQuery = "INSERT INTO vaccin VALUES (?, ?, ?)";
            query = cnx.prepareStatement(strQuery);
            query.setInt(1, vaccin.getVaccinId());
            query.setString(2, vaccin.getType());
            query.setString(3, vaccin.getDescription());
            query.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(VaccinDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void updateVaccin(Vaccin vaccin) {
        try {
            String strQuery = "UPDATE vaccin  set TypeVaccin=?,Description=? WHERE idVaccin =?";
          query = cnx.prepareStatement(strQuery);
            query.setInt(3, vaccin.getVaccinId());
            query.setString(1, vaccin.getType());
            query.setString(2, vaccin.getDescription());
            query.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(VaccinDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void deleteVaccin(int VaccinId) {
          try{
                
               query=(PreparedStatement) cnx.prepareStatement ("Call proc1('"+VaccinId+"')");
               
               query.executeUpdate();
    }   catch (SQLException ex) {
            Logger.getLogger(VaccinDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
