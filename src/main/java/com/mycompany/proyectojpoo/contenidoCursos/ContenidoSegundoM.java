package com.mycompany.proyectojpoo.contenidoCursos;

import com.mycompany.proyectojpoo.asignatura.Lenguaje;
import com.mycompany.proyectojpoo.asignatura.Matematica;
import com.mycompany.proyectojpoo.asignatura.Historia;
import com.mycompany.proyectojpoo.asignatura.Ciencias;
import java.io.IOException;

import java.util.Scanner;

public class ContenidoSegundoM {

    Lenguaje Lenguaje = new Lenguaje();
    Matematica Matematica = new Matematica();
    Historia Historia = new Historia();
    Ciencias Ciencias = new Ciencias();
    int OpcionTemas;
    Scanner Entrada = new Scanner(System.in);

    public ContenidoSegundoM() {

    }

    public void Lenguaje() throws IOException {

        System.out.println("1.- Narrativa y lírica");
        System.out.println("2.- Género dramático");
        System.out.println("3.- Medios de comunicación");
        System.out.println("0.- Salir");
        System.out.println("Elija la materia que desea reforzar");
        OpcionTemas = Entrada.nextInt();

        Lenguaje.LenguajeSegundoM(OpcionTemas);

    }

    public void Matematicas() throws IOException {
        System.out.println("1.-   Tema 1");
        System.out.println("2.- Tema 2");
        System.out.println("3.- Tema 3");
        System.out.println("0.- Salir");
        System.out.println("Elija la materia que desea reforzar");
        OpcionTemas = Entrada.nextInt();

        Matematica.MatematicaSegundoM(OpcionTemas);
    }

    public void Historia() throws IOException {
        System.out.println("1.- Tema 1");
        System.out.println("2.- Tema 2");
        System.out.println("3.- Tema 3");
        System.out.println("0.- Salir");
        System.out.println("Elija la materia que desea reforzar");
        OpcionTemas = Entrada.nextInt();

        Historia.HistoriaSegundoM(OpcionTemas);
    }

    public void Ciencias() throws IOException {
        System.out.println("1.- Tema 1");
        System.out.println("2.- Tema 2");
        System.out.println("3.- Tema 3");
        System.out.println("0.- Salir");
        System.out.println("Elija la materia que desea reforzar");
        OpcionTemas = Entrada.nextInt();

        Ciencias.CienciasSegundoM(OpcionTemas);
    }

}
