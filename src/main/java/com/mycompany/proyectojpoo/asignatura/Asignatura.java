package com.mycompany.proyectojpoo.asignatura;

import com.mycompany.proyectojpoo.contenidoCursos.ContenidoPrimeroM;
import com.mycompany.proyectojpoo.contenidoCursos.ContenidoSegundoM;
import com.mycompany.proyectojpoo.contenidoCursos.ContenidoTerceroM;
import com.mycompany.proyectojpoo.contenidoCursos.ContenidoCuartoM;
import java.io.IOException;
import java.util.Scanner;

public class Asignatura {

    ContenidoPrimeroM Primero = new ContenidoPrimeroM();
    ContenidoSegundoM Segundo = new ContenidoSegundoM(); 
    ContenidoTerceroM Tercero = new ContenidoTerceroM();
    ContenidoCuartoM Cuarto = new ContenidoCuartoM();

    private int OpcionAsignatura;

    public Asignatura() {

    }

    public int getOpcionAsignatura() {
        return OpcionAsignatura;
    }

    public void setOpcionAsignatura(int OpcionAsignatura) {
        this.OpcionAsignatura = OpcionAsignatura;
    }

    public void PrimeroMedio() throws IOException {
        Scanner Entrada = new Scanner(System.in);
        
            System.out.println("1.- Lenguaje");
            System.out.println("2.- Matemáticas");
            System.out.println("3.- Historia");
            System.out.println("4.- Ciencias");
            System.out.println("Elija la materia que desea reforzar");
            OpcionAsignatura = Entrada.nextInt();
            switch (OpcionAsignatura) {
                case 1 ->
                    Primero.Lenguaje();
                case 2 ->
                    Primero.Matematicas();
                case 3 ->
                    Primero.Historia();
                case 4 ->
                    Primero.Ciencias();

                default ->
                    System.out.println("La opción que ingreso no es valida");
            }


    }

    public void SegundoMedio() throws IOException {
        Scanner Entrada = new Scanner(System.in);
       
            System.out.println("1.- Lenguaje");
            System.out.println("2.- Matemáticas");
            System.out.println("3.- Historia");
            System.out.println("4.- Ciencias");
            System.out.println("Elija la materia que desea reforzar");
            OpcionAsignatura = Entrada.nextInt();

            switch (OpcionAsignatura) {
                case 1 ->
                    Segundo.Lenguaje();
                case 2 ->
                    Segundo.Matematicas();
                case 3 ->
                    Segundo.Historia();
                case 4 ->
                    Segundo.Ciencias();

                default ->
                    System.out.println("La opción que ingreso no es valida");

            }
        
    }

    public void TerceroMedio() throws IOException {
        Scanner Entrada = new Scanner(System.in);
        
            System.out.println("1.- Lenguaje");
            System.out.println("2.- Matemáticas");
            System.out.println("3.- Historia");
            System.out.println("4.- Ciencias");
            System.out.println("Elija la materia que desea reforzar");
            OpcionAsignatura = Entrada.nextInt();
            switch (OpcionAsignatura) {
                case 1 ->
                    Tercero.Lenguaje();
                case 2 ->
                    Tercero.Matematicas();
                case 3 ->
                    Tercero.Historia();
                case 4 ->
                    Tercero.Ciencias();

                default ->
                    System.out.println("La opción que ingreso no es valida");
            }
        
    }

    public void CuartoMedio() throws IOException {
        Scanner Entrada = new Scanner(System.in);
        
            System.out.println("1.- Lenguaje");
            System.out.println("2.- Matemáticas");
            System.out.println("3.- Historia");
            System.out.println("4.- Ciencias");
            System.out.println("Elija la materia que desea reforzar");
            OpcionAsignatura = Entrada.nextInt();
            switch (OpcionAsignatura) {
                case 1 ->
                    Cuarto.Lenguaje();
                case 2 ->
                    Cuarto.Matematicas();
                case 3 ->
                    Cuarto.Historia();
                case 4 ->
                    Cuarto.Ciencias();

                default ->
                    System.out.println("La opción que ingreso no es valida");
            }
        

    }
}
