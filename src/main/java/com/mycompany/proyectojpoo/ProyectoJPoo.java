//Alison Jara Torres
//Lucas Altamirano Villaroel
package com.mycompany.proyectojpoo;

import java.io.IOException;
import java.util.Scanner;

public class ProyectoJPoo {

    public static void main(String[] args) throws IOException {
        Curso Curso = new Curso();
        int OpcionCurso;
        Scanner Entrada = new Scanner(System.in);

        do {
            //Prueba Github
            System.out.println("1.- Crear ");
            System.out.println("2.- Mostrar");
            System.out.println("3.- Modificar");
            System.out.println("4.- Eliminar");
            System.out.println("0.- Salir");
            System.out.println("Elija su curso para continuar");
            OpcionCurso = Entrada.nextInt();
            switch (OpcionCurso) {
                case 1 ->
                    
                case 2 ->
                    
                case 3 ->
                    
                case 4 ->
                    
                default ->
                    System.out.println("La opción ingresada no es valida");
            }
        } while (OpcionCurso != 0);
    }
}
