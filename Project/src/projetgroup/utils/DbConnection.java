/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetgroup.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author salah
 */
public abstract class DbConnection {
    public static Connection Seconnecter(){
        Connection cnx = null;
        String DRIVER="com.mysql.jdbc.Driver";
        String user="root";
        String password="@-Sa2001";
        String url="jdbc:mysql://localhost/gestion_vacc?serverTimezone=UTC";
        try{
          Class.forName(DRIVER);
          cnx=(Connection) DriverManager.getConnection(url,user,password);
          System.out.println("Pilote MySQL JDBC chargé");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println("Erreur lors du chargmement du pilote");
        }catch (SQLException e) {
           e.printStackTrace();
         System.out.println("Erreur lors de l’établissement de la connexion");
        }
        return cnx;
        
    }
    
}
