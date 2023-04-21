//Alison Jara Torres
//Lucas Altamirano Villaroel
package com.mycompany.proyectojpoo;

import java.io.IOException;
import java.util.Scanner;

public class ProyectoJPoo {

    public static void main(String[] args) throws IOException {
        ContenidoPrimeroM Primero = new ContenidoPrimeroM();
        SegundoMedio Segundo = new SegundoMedio();
        TerceroMedio Tercero= new TerceroMedio();
        CuartoMedio Cuarto= new CuartoMedio();
        int OpcionCurso;
        Scanner Entrada = new Scanner(System.in);

        do {
            //Prueba Github
            System.out.println("1.- Primero Medio");
            System.out.println("2.- Segundo Medio");
            System.out.println("3.- Tercero Medio");
            System.out.println("4.- Cuarto Medio");
            System.out.println("0.- Salir");
            System.out.println("Elija su curso para continuar");
            OpcionCurso = Entrada.nextInt();
            switch (OpcionCurso) {
                case 1 ->
                    Primero.ContenidoPrimeroM();
                case 2 ->
                    Segundo.ContenidoSegundoM();
                case 3 ->
                    Tercero.ContenidoTerceroM();
                case 4 ->
                    Cuarto.ContenidoCuartoM();
                default ->
                    System.out.println("La opción ingresada no es valida");
            }
        } while (OpcionCurso != 0);
    }
}
