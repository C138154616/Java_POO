/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetgroup.DAO;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import projetgroup.Models.Dooz;
import projetgroup.Models.Personne;
import projetgroup.Models.PersonneVaccinerDTO;
import projetgroup.utils.DbConnection;
import projetgroup.Models.VaccinDTO;
/**
 *
 * @author salah
 */
public class DozeDaoImpl implements DoozInterfa {
    private ResultSet result;
    private Connection cnx;
    private PreparedStatement query;
    
     public DozeDaoImpl() {
       cnx=DbConnection.Seconnecter();
    }
    @Override
    public List<Dooz> getAllDoze(int id) {
         try{
        List<Dooz>doze = new ArrayList<>();
        query =cnx.prepareStatement("SELECT * FROM dooz where idPersonne=?");
        query.setInt(1,id);
        result =query.executeQuery();
        while(result.next()){
            Dooz d= new Dooz();
            PersonneDAO P=new PersonneDAO();
            VaccinDaoImpl v= new VaccinDaoImpl();
            d.setIdDooz(result.getInt(1));
            d.setNumDooz(result.getInt(2));
            d.setDateDooz(result.getDate(3));
            d.setPersonne(P.getPersonneById(result.getInt(4)));
            d.setVaccin(v.getVaccinById(result.getInt(5)));
             doze.add(d);
        }
        return doze;
    } catch (SQLException ex) {
         Logger.getLogger(DozeDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
     }
         return null;
    }
    @Override
    public Dooz getDozeById(int IdDoze) {
         try{
        query=cnx.prepareStatement("SELECT * FROM dooz WHERE idDooz=?");
        query.setInt(1,IdDoze);
        result=query.executeQuery();
        if(result.next()){
            Dooz d= new Dooz();
            VaccinDaoImpl v= new VaccinDaoImpl();
            PersonneDAO P=new PersonneDAO();
            d.setIdDooz(result.getInt("idDooz"));
           
            d.setDateDooz(result.getDate("DateDooz"));
            d.setPersonne(P.getPersonneById(result.getInt("idPersonne")));
            d.setVaccin(v.getVaccinById(result.getInt("idVaccin")));
            return d;
    }
         }
         catch (SQLException ex) {   
         Logger.getLogger(DozeDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
     }
         return null;}

    @Override
    public boolean DozeExist(int IdP) {
         try{
            int nbr=0;
             query = cnx.prepareStatement("SELECT count(idDooz)from dooz where idPersonne=?");
             query.setInt(1, IdP);
             result =query.executeQuery();
             
             if(result.next())
                 nbr=(int)result.getInt(1);
                 if(nbr==3){
                 return true;
                 }
             
            
        } catch (SQLException ex) {
         Logger.getLogger(DozeDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
     }
     return false;
    }

    @Override
    public void addDoze(Dooz doze) {
        try {
            String strQuery = "INSERT INTO dooz (idDooz,IdPersonne,idVaccin) VALUES (default,?,?)";
            query = cnx.prepareStatement(strQuery);
            
            
            query.setInt(1, doze.getPersonne().getIdPersonne());
            query.setInt(2, doze.getVaccin().getVaccinId());
            query.executeUpdate();
        } catch (SQLException ex) {
         Logger.getLogger(DozeDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
     }
    }

    @Override
    public void updateDoze(Dooz doze) {
        try {
            String strQuery = "UPDATE dooz  set idVaccin=? WHERE idDooz =? AND idPersonne=?";
            query = cnx.prepareStatement(strQuery);
            
            query.setInt(1, doze.getVaccin().getVaccinId());
            
            query.setInt(2, doze.getIdDooz());
            query.setInt(3, doze.getPersonne().getIdPersonne());
            
            query.executeUpdate();
        } catch (SQLException ex) {
         Logger.getLogger(DozeDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
     }
    }

    @Override
    public void deleteDoze(int IdDoze) {
        try{
                String strQuery="DELETE FROM dooz WHERE idDooz=?";
               query = cnx.prepareStatement(strQuery);
               query.setInt(1, IdDoze);
               query.executeUpdate();
    } catch (SQLException ex) { 
         Logger.getLogger(DozeDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
     } 
    }
    @Override
    public List<VaccinDTO> getAllVaccinDTO(int id) {
        try{
        List<VaccinDTO>VaccinDTOD = new ArrayList<>();
        query =cnx.prepareStatement("SELECT * FROM houssam where idPersonne=?");
        query.setInt(1,id);
        result =query.executeQuery();
        while(result.next()){
            VaccinDTO V= new VaccinDTO();
            V.setIdDooz(result.getInt(1));
            V.setIdPersonne(result.getInt(2));
            V.setDateDooz(result.getDate(3));
            V.setType_Dooz(result.getString(4));
            VaccinDTOD.add(V);
        }
        return VaccinDTOD;
    } catch (SQLException ex) {
         Logger.getLogger(DozeDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
     }
         return null; 
    }

    @Override
    public List<PersonneVaccinerDTO> getAllPersonneVacciner() {
       try{
        List<PersonneVaccinerDTO>VaccinDTOD = new ArrayList<>();
        query =cnx.prepareStatement("SELECT * FROM vu2");
        
        result =query.executeQuery();
        while(result.next()){
            PersonneVaccinerDTO V= new PersonneVaccinerDTO();
            V.setIdPersonne(result.getInt(1));
            V.setNbrDooz(result.getInt(2));
            V.setCIN(result.getString(3));
            V.setNom(result.getString(4));
            V.setPrenom(result.getString(5));
            VaccinDTOD.add(V);
        }
        return VaccinDTOD;
    } catch (SQLException ex) {
         Logger.getLogger(DozeDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
     }
         return null;  //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<PersonneVaccinerDTO> getAllPersonneVacciner1(String a) {
                 List<PersonneVaccinerDTO> personnes=new ArrayList<>();
        try{
                    System.out.println(a);

            query=cnx.prepareStatement("Select * from vu2 where CIN LIKE CONCAT( '%',?,'%')");
            query.setString(1, a);
            
            result=query.executeQuery();
            while(result.next()){
                PersonneVaccinerDTO P=new PersonneVaccinerDTO();
                P.setIdPersonne(result.getInt(1));
                P.setNbrDooz(result.getInt(2));
                P.setCIN(result.getString(3));
                P.setNom(result.getString(4));
                P.setPrenom(result.getString(5));
                personnes.add(P);
            }
            return personnes;
            
        }catch(SQLException ex){
            Logger.getLogger(PersonneDAO.class.getName()).log(Level.SEVERE,null,ex);
            
            
        }
        return null; //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
