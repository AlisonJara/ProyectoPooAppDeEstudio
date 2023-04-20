//Alison Jara Torres
//Lucas Altamirano Villaroel
package com.mycompany.proyectojpoo;
import com.mycompany.proyectojpoo.asignatura.Asignatura;
import java.io.IOException;
import java.util.Scanner;

public class ProyectoJPoo {

    public static void main(String[] args) throws IOException {
        Asignatura Asignaturas = new Asignatura();
        int OpcionCurso;
        Scanner Entrada = new Scanner(System.in);

        do {
            
            System.out.println("1.- Primero Medio");
            System.out.println("2.- Segundo Medio");
            System.out.println("3.- Tercero Medio");
            System.out.println("4.- Cuarto Medio");
            System.out.println("0.- Salir");
            System.out.println("Elija su curso para continuar");
            OpcionCurso=Entrada.nextInt();
            switch (OpcionCurso) {
                case 1 ->
                    Asignaturas.PrimeroMedio();
                case 2 ->
                    Asignaturas.SegundoMedio();
                case 3 ->
                    Asignaturas.TerceroMedio();
                case 4 ->
                    Asignaturas.CuartoMedio();

                default ->
                    System.out.println("La opción ingresada no es valida");
            }
        } while (OpcionCurso != 0);
    }
    }
    

