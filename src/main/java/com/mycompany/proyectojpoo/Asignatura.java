package com.mycompany.proyectojpoo;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Asignatura {

    private ArrayList Lenguaje;
    private ArrayList Matematica;
    private ArrayList Historia;
    private ArrayList Ciencias;

    public Asignatura() {
    }

    public Asignatura(String Lenguaje, String Matematica, String Historia, String Ciencias) {
        this.Lenguaje = Lenguaje;
        this.Matematica = Matematica;
        this.Historia = Historia;
        this.Ciencias = Ciencias;
    }
public void Lenguaje() {

        System.out.println("1.- narrativa y lírica");
        System.out.println("2.- género dramático");
        System.out.println("3.- medios de comunicación");
        System.out.println("0.- Salir");
        System.out.println("Elija la materia que desea reforzar");
        

    }

    public void Matematicas() {
        System.out.println("1.- ");
        System.out.println("2.- ");
        System.out.println("3.- ");
        System.out.println("0.- Salir");
        System.out.println("Elija la materia que desea reforzar");
        
    }

    public void Historia() {
        System.out.println("1.- ");
        System.out.println("2.- ");
        System.out.println("3.- ");
        System.out.println("0.- Salir");
        System.out.println("Elija la materia que desea reforzar");
        
    }

    public void Ciencias() {
        System.out.println("1.- ");
        System.out.println("2.- ");
        System.out.println("3.- ");
        System.out.println("0.- Salir");
        System.out.println("Elija la materia que desea reforzar");
        
    }
    //Getters
    public ArrayList getLenguaje() {
        return Lenguaje;
    }

    public ArrayList getMatematica() {
        return Matematica;
    }

    public ArrayList getHistoria() {
        return Historia;
    }

    public ArrayList getCiencias() {
        return Ciencias;
    }

    //Setters
    public void setLenguaje(ArrayList Lenguaje) {
        this.Lenguaje = Lenguaje;
    }

    public void setMatematica(ArrayList Matematica) {
        this.Matematica = Matematica;
    }

    public void setHistoria(ArrayList Historia) {
        this.Historia = Historia;
    }

    public void setCiencias(ArrayList Ciencias) {
        this.Ciencias = Ciencias;
    }

}
