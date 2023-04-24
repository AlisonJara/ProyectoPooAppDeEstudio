package com.mycompany.proyectojpoo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Usuario {

    private String name;
    private String email;
    private String password;
    private Date fechaNacimiento;
    private String rut;
    public Operaciones operaciones = new Operaciones();
    private ArrayList<Usuario> User = new ArrayList<>();

    public Usuario() {

    }

    public Usuario(String rut, String name, Date fechaNacimiento, String email, String password) {
        this.rut = rut;
        this.name = name;
        this.fechaNacimiento = fechaNacimiento;
        this.email = email;
        this.password = password;
    }

    public void crearDatos() {
        String nombre;
        String email;
        String password;
        Date fecha;
        String rut;
        Reporte reporte = new Reporte("Usuario.csv");
        operaciones.Mensaje("Ingrese su Rut sin punto ni guion");
        rut = operaciones.ValidarAlfanumerico();
        while (null == rut) {
            operaciones.Mensaje("Ingrese su Rut sin punto ni guion");
            rut = operaciones.ValidarAlfanumerico();
        }
        operaciones.Mensaje("Ingrese su nombre");
        nombre = operaciones.ValidarCadena();
        while (nombre == null) {
            operaciones.Mensaje("Ingrese su nombre");
            nombre = operaciones.ValidarCadena();
        }
        operaciones.Mensaje("Ingrese su fecha de nacimiento");
        fecha = operaciones.ValidarFecha();
        while (fecha == null) {
            operaciones.Mensaje("Ingrese su fecha de nacimiento");
            fecha = operaciones.ValidarFecha();
        }

        operaciones.Mensaje("Ingrese su email");
        email = operaciones.ValidarAlfanumerico();
        while (email == null) {
            operaciones.Mensaje("Ingrese su email");
            email = operaciones.ValidarCadena();
        }

        operaciones.Mensaje("Ingrese su contraseña");
        password = operaciones.ValidarAlfanumerico();
        while (password == null) {
            operaciones.Mensaje("Ingrese su contraseña");
            password = operaciones.ValidarCadena();
        }

        User.add(new Usuario(rut, nombre, fecha, email, password));
        //se guarda en cvs
        String[] header = {"RUT", "Nombre", "Fecha de Nacimiento", "Email", "Password"};
        reporte.EscribirCliente(header, User);

    }

    public void modificarUser(String rut) {
        String nuevoRut;
        String nuevoNombre;
        String nuevoEmail;
        String nuevaPassword;
        Date nuevaFecha;
        Scanner Entrada = new Scanner(System.in);
        int opcion;
        if (User.isEmpty()) {
            operaciones.Mensaje("No existen Usuarios para modificar");
        } else {
            for (int i = 0; i < User.size(); i++) {
                if (User.get(i).getRut().equals(rut)) {
                    do {
                        System.out.println("1.- Modificar Rut ");
                        System.out.println("2.- Modificar Nombre ");
                        System.out.println("3.- Modificar Fecha de Nacimiento");
                        System.out.println("4.- Modificar Email");
                        System.out.println("5.- Modificar Password");
                        System.out.println("0.- Salir");
                        System.out.println("Ingrese una opción");
                        opcion = Entrada.nextInt();
                        switch (opcion) {
                            case 1 -> {
                                operaciones.Mensaje("Ingrese El nuevo Rut");
                                nuevoRut = Entrada.nextLine();
                                User.get(i).setRut(nuevoRut);
                                operaciones.Mensaje("Se ha modificado con éxito");
                            }
                            case 2 -> {
                                operaciones.Mensaje("Ingrese el nuevo nombre");
                                nuevoNombre = Entrada.nextLine();
                                User.get(i).setName(nuevoNombre);
                                operaciones.Mensaje("Se ha modificado con éxito");
                            }
                            case 3 -> {
                                operaciones.Mensaje("Ingrese la nueva Fecha de nacimiento");
                                nuevaFecha = operaciones.ValidarFecha();
                                User.get(i).setFechaNacimiento(nuevaFecha);
                                operaciones.Mensaje("Se ha modificado con éxito");
                            }
                            case 4 -> {
                                operaciones.Mensaje("Ingrese el nuevo Email");
                                nuevoEmail = Entrada.nextLine();
                                User.get(i).setEmail(nuevoEmail);
                                operaciones.Mensaje("Se ha modificado con éxito");
                            }
                            case 5 -> {
                                operaciones.Mensaje("Ingrese la nueva Contraeña");
                                nuevaPassword = Entrada.nextLine();
                                User.get(i).setPassword(nuevaPassword);
                                operaciones.Mensaje("Se ha modificado con éxito");
                            }
                            default ->
                                System.out.println("La opción ingresada no es valida");
                        }
                    } while (opcion != 0);

                }
            }

        }
    }

    public void eliminarUser(String rut) {
        if (User.isEmpty()) {
            operaciones.Mensaje("No existen Usuarios para Eliminar");
        } else {
            for (int i = 0; i < User.size(); i++) {
                if (User.get(i).getRut().equals(rut)) {
                    User.remove(i);
                    operaciones.Mensaje("Usuario eliminado con el rut : " + rut);

                }
            }
        }
    }

    //Getters 
    public String getRut() {
        return rut;
    }

    public String getName() {
        return name;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    //Setters Atributos
    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

}
