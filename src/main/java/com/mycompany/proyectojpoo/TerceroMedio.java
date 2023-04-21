package com.mycompany.proyectojpoo;

import java.io.IOException;

import java.util.Scanner;

public class TerceroMedio {

    int OpcionTemas;
    Scanner Entrada = new Scanner(System.in);

    public TerceroMedio() {

    }

    public void ContenidoTerceroM() throws IOException {
        Scanner Entrada = new Scanner(System.in);

        System.out.println("1.- Lenguaje");
        System.out.println("2.- Matemáticas");
        System.out.println("3.- Historia");
        System.out.println("4.- Ciencias");
        System.out.println("Elija la materia que desea reforzar");
        int OpcionAsignatura = Entrada.nextInt();
        switch (OpcionAsignatura) {
            case 1 -> {
                System.out.println("1.- Narrativa y lírica");
                System.out.println("2.- Género dramático");
                System.out.println("3.- Medios de comunicación");
                System.out.println("0.- Salir");
                System.out.println("Elija la materia que desea reforzar");
                OpcionTemas = Entrada.nextInt();
            }
            case 2 -> {
                System.out.println("1.- Narrativa y lírica");
                System.out.println("2.- Género dramático");
                System.out.println("3.- Medios de comunicación");
                System.out.println("0.- Salir");
                System.out.println("Elija la materia que desea reforzar");
                OpcionTemas = Entrada.nextInt();
            }

            case 3 -> {
                System.out.println("1.- Narrativa y lírica");
                System.out.println("2.- Género dramático");
                System.out.println("3.- Medios de comunicación");
                System.out.println("0.- Salir");
                System.out.println("Elija la materia que desea reforzar");
                OpcionTemas = Entrada.nextInt();
            }

            case 4 -> {
                System.out.println("1.- Narrativa y lírica");
                System.out.println("2.- Género dramático");
                System.out.println("3.- Medios de comunicación");
                System.out.println("0.- Salir");
                System.out.println("Elija la materia que desea reforzar");
                OpcionTemas = Entrada.nextInt();
            }

            default ->
                System.out.println("La opción que ingreso no es valida");
        }

    }

}
