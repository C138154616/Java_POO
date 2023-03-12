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
import java.util.logging.Level;
import java.util.logging.Logger;
import projetgroup.Models.Admin;
import projetgroup.utils.DbConnection;

/**
 *
 * @author salah
 */
public class AdminDaoImpl implements AdminDao {
    private ResultSet result;
    private Connection cnx;
    private PreparedStatement query;

    public AdminDaoImpl() {
        cnx=DbConnection.Seconnecter();
    }
    

    @Override
    public Admin getAdminByLogin(Admin admin) {
        Admin d=new Admin();
       try{
        query=cnx.prepareStatement("SELECT * FROM Admin WHERE Login='"+admin.getLogin()+"'");
        result=query.executeQuery();
        
        if(result.next()){
            d.setLogin(result.getString("Login"));
            d.setPassword(result.getString("password"));
            
            
          
    }  return d;}
         
      catch (SQLException ex) {
            Logger.getLogger(AdminDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }return null; //To change body of generated methods, choose Tools | Templates.
    }
    
}
