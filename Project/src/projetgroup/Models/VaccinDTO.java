/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetgroup.Models;

import java.util.Date;

/**
 *
 * @author salah
 */
public class VaccinDTO {
    private int idDooz;
    private int idPersonne;
    private Date DateDooz;
    private String Type_Dooz;

    public VaccinDTO(int idDooz,int idPersonne, Date DateDooz, String Type_Dooz) {
        this.idPersonne = idPersonne;
        this.DateDooz = DateDooz;
        this.Type_Dooz = Type_Dooz;
        this.idDooz=idDooz;
    }

    public int getIdPersonne() {
        return idPersonne;
    }

    public Date getDateDooz() {
        return DateDooz;
    }

    public String getType_Dooz() {
        return Type_Dooz;
    }

    public void setIdDooz(int idDooz) {
        this.idDooz = idDooz;
    }

    public int getIdDooz() {
        return idDooz;
    }

    public void setIdPersonne(int idPersonne) {
        this.idPersonne = idPersonne;
    }

    public void setDateDooz(Date DateDooz) {
        this.DateDooz = DateDooz;
    }

    public void setType_Dooz(String Type_Dooz) {
        this.Type_Dooz = Type_Dooz;
    }

    public VaccinDTO() {
    }
    
    
    
}
