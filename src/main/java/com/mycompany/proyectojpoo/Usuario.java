package com.mycompany.proyectojpoo;

import java.util.Date;

public class Usuario {

    private String Name;
    private String Email;
    private String Password;
    private Date FechaNacimiento;

    public Usuario() {

    }
    //Getters Atributos

    public String getName() {
        return Name;
    }

    public String getEmail() {
        return Email;
    }

    public String getPassword() {
        return Password;
    }

    public Date getFechaNacimiento() {
        return FechaNacimiento;
    }

    //Setters Atributos
    public void setName(String Name) {
        this.Name = Name;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public void setFechaNacimiento(Date FechaNacimiento) {
        this.FechaNacimiento = FechaNacimiento;
    }

}
