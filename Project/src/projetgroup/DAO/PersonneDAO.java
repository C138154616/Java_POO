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
import projetgroup.Models.Personne;
import projetgroup.utils.DbConnection;
/**
 *
 * @author salah
 */
public class PersonneDAO implements PersonneInterface {
    private PreparedStatement query;
    private ResultSet rs;
    private Connection cnx;
    public PersonneDAO() {
        cnx=DbConnection.Seconnecter();
    }
    @Override
    public List<Personne> getAllPersonne() {
       

        List<Personne> personnes=new ArrayList<>();
        try{
            query=cnx.prepareStatement("Select * from personne");
            rs=query.executeQuery();
            while(rs.next()){
                Personne P=new Personne();
                P.setIdPersonne(rs.getInt(1));
                P.setCIN(rs.getString(2));
                P.setNom(rs.getString(3));
                P.setPrenom(rs.getString(4));
                P.setSexe(rs.getString(5));
                P.setDateNaissance(rs.getString(6));
                P.setAdresse(rs.getString(7));
                personnes.add(P);
            }
            return personnes;
            
        }catch(SQLException ex){
            Logger.getLogger(PersonneDAO.class.getName()).log(Level.SEVERE,null,ex);
            
            
        }
        return null; //To change body of generated methods, choose Tools | Templates.
    
    }

    @Override
    public Personne getPersonneById(int id) {
        try{
            query=cnx.prepareStatement("Select * from personne where idPersonne=?");
            query.setInt(1, id);
            rs=query.executeQuery();
            while(rs.next()){
                Personne P=new Personne();
                P.setCIN(rs.getString(2));
                P.setNom(rs.getString(3));
                P.setPrenom(rs.getString(4));
                P.setSexe(rs.getString(5));
                P.setDateNaissance(rs.getString(6));
                P.setAdresse(rs.getString(7));
                
                return P;
            }
            
            
        }catch(SQLException ex){
            Logger.getLogger(PersonneDAO.class.getName()).log(Level.SEVERE,null,ex);
            
            
        }
        return null; //To change body of generated methods, choose Tools | Templates. //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean personneExist(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void addPersonne(Personne personne) {
      try {
            String strQuery = "INSERT INTO personne VALUES (default,?, ?, ?, ?,?,?)";
            query = cnx.prepareStatement(strQuery);
            query.setString(1, personne.getCIN());
            query.setString(2, personne.getNom());
            query.setString(3, personne.getPrenom());
            query.setString(4, personne.getSexe());
            query.setString(5, personne.getDateNaissance());
            query.setString(6, personne.getAdresse());
            query.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(PersonneDAO.class.getName()).log(Level.SEVERE, null, ex);
        } //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updatePersonne(Personne personne) {
       try {
            String strQuery = "Update  personne Set CIN=?,Nom=?,Prenom=?,Sexe=?,DateNaissance=?,Adresse=? WHERE idPersonne=?";
            query = cnx.prepareStatement(strQuery);
            query.setInt(7, personne.getIdPersonne());
            query.setString(1, personne.getCIN());
            query.setString(2, personne.getNom());
            query.setString(3, personne.getPrenom());
            query.setString(4, personne.getSexe());
            query.setString(5, personne.getDateNaissance());
            query.setString(6, personne.getAdresse());
            query.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(PersonneDAO.class.getName()).log(Level.SEVERE, null, ex);
        } //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deletePersonne(int id) {
        try {
            query=cnx.prepareStatement("delete from personne where idPersonne=?");
            query.setInt(1, id);
            query.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(PersonneDAO.class.getName()).log(Level.SEVERE, null, ex);
        } //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean getPersonneByCIN(String CIN) {
         try{
            query=cnx.prepareStatement("Select * from personne where CIN=?");
            query.setString(1, CIN);
            rs=query.executeQuery();
            while(rs.next()){
                return true;
            }
            
            
        }catch(SQLException ex){
            Logger.getLogger(PersonneDAO.class.getName()).log(Level.SEVERE,null,ex);
            
            
        }
        return false; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Personne> getAllPersonne1(String a) {
         List<Personne> personnes=new ArrayList<>();
        try{
                  

            query=cnx.prepareStatement("Select * from personne where CIN LIKE CONCAT( '%',?,'%')");
            query.setString(1, a);
            
            rs=query.executeQuery();
            while(rs.next()){
                Personne P=new Personne();
                P.setIdPersonne(rs.getInt(1));
                P.setCIN(rs.getString(2));
                P.setNom(rs.getString(3));
                P.setPrenom(rs.getString(4));
                P.setSexe(rs.getString(5));
                P.setDateNaissance(rs.getString(6));
                P.setAdresse(rs.getString(7));
                personnes.add(P);
            }
            return personnes;
            
        }catch(SQLException ex){
            Logger.getLogger(PersonneDAO.class.getName()).log(Level.SEVERE,null,ex);
            
            
        }
        return null; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Personne getPersonneByCIN2(String CIN) {
       Personne p=new Personne();
        try{
            query=cnx.prepareStatement("Select * from personne where CIN='"+CIN+"'");
            
            rs=query.executeQuery();
            while(rs.next()){
                p.setIdPersonne(rs.getInt(1));
                p.setCIN(rs.getString(2));
                p.setNom(rs.getString(3));
                p.setPrenom(rs.getString(4));
                p.setSexe(rs.getString(5));
                p.setAdresse(rs.getString(7));
                p.setDateNaissance(rs.getString(6));
                return p;
            }
            
            
        }catch(SQLException ex){
            Logger.getLogger(PersonneDAO.class.getName()).log(Level.SEVERE,null,ex);
            
            
        }
        return p;
       
    }

    
    
    
}
