package com.mycompany.proyectojpoo;

import java.util.ArrayList;
import java.util.Date;

public class Usuario {

    private String Name;
    private String Email;
    private String Password;
    private Date FechaNacimiento;
    public Operaciones operaciones = new Operaciones();
    private ArrayList<Usuario> User = new ArrayList<Usuario>();

    public Usuario() {

    }

    public Usuario(String Name, String Email, String Password, Date FechaNacimiento) {
        this.Name = Name;
        this.Email = Email;
        this.Password = Password;
        this.FechaNacimiento = FechaNacimiento;
    }

    public void CrearDatos() {
        String Nombre;
        String Email;
        String Password;
        Date Fecha;
        Reporte reporte = new Reporte("Usuario.csv");

        operaciones.Mensaje("Ingrese su nombre");
        Nombre = operaciones.ValidarCadena();
        while (Nombre.equals(null)) {
            operaciones.Mensaje("Ingrese su nombre");
            Nombre = operaciones.ValidarCadena();
        }

        operaciones.Mensaje("Ingrese su email");
        Email = operaciones.ValidarAlfanumerico();
        while (Nombre.equals(null)) {
            operaciones.Mensaje("Ingrese su email");
            Nombre = operaciones.ValidarCadena();
        }

        operaciones.Mensaje("Ingrese su contraseña");
        Password = operaciones.ValidarAlfanumerico();
        while (Nombre.equals(null)) {
            operaciones.Mensaje("Ingrese su contraseña");
            Nombre = operaciones.ValidarCadena();
        }

        operaciones.Mensaje("Ingrese su fecha de nacimiento");
        Fecha = operaciones.ValidarFecha();
        while (Nombre.equals(null)) {
            operaciones.Mensaje("Ingrese su fecha de nacimiento");
            Nombre = operaciones.ValidarCadena();
        }

        User.add(new Usuario(Nombre, Email, Password, Fecha));
        //se guarda en cvs
        String[] header = {"RUT", "Nombre"};
        reporte.EscribirCliente(header, User);

    }

    //Getters 
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
