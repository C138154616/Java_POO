/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetgroup.Models;
/**
 *
 * @author salah
 */
public class Admin {
    private String Login;
    private String Password;
    public Admin(String Login, String Password) {
        this.Login = Login;
        this.Password = Password;
    }

    public Admin() {
    }

    public String getLogin() {
        return Login;
    }

    public String getPassword() {
        return Password;
    }

    public void setLogin(String Login) {
        this.Login = Login;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }
    
    
}
