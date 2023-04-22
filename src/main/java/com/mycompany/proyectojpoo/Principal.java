//Alison Jara Torres
//Lucas Altamirano Villaroel
package com.mycompany.proyectojpoo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Principal {

    public static String file = "src/test/listadocursos.txt";
    public static ArrayList<Curso> Cursos = new ArrayList<Curso>();

    public static void main(String[] args) throws IOException {
        Usuario User = new Usuario();
        int OpcionCurso;
        Scanner Entrada = new Scanner(System.in);

        do {
            //Prueba Github
            System.out.println("1.- Crear ");
            System.out.println("2.- Mostrar");
            System.out.println("3.- Modificar");
            System.out.println("4.- Eliminar");
            System.out.println("0.- Salir");
            System.out.println("Qué una opción para continuar");
            OpcionCurso = Entrada.nextInt();
            switch (OpcionCurso) {
                case 1 ->
                    User.CrearDatos();
                case 2 -> {
                    leerDatos();
                    mostrarDatos();
                }
                case 3 -> {
                    leerDatos();
                    mostrarDatos();
                }

                case 4 -> {
                    leerDatos();
                    mostrarDatos();
                }
                default ->
                    System.out.println("La opción ingresada no es valida");
            }
        } while (OpcionCurso != 0);
    }

    public static void leerDatos() {
        try {
            BufferedReader archivo = new BufferedReader(new FileReader(file));

            int i = 0;
            String linea;
            String[] campos = new String[4];
            while ((linea = archivo.readLine()) != null) {

                //System.out.println();
                if (i > 0) {
                    campos = linea.split(";");

                    Cursos.add(new Curso(campos[0], campos[1], campos[2], campos[3]));
                    //tratamiento para separar los ';'
                }

                i++;
            }

            System.out.println("el tamaño de objetos es " + Cursos.size());

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException e) {
        }
    }

    public static void mostrarDatos() {

        for (int i = 0; i < Cursos.size(); i++) {
            System.out.println("El listado de cursos es el siguiente: " + (i + 1) + " es");
            System.out.println("*" + Cursos.get(i).getPrimeroMedio() + "\n*" + Cursos.get(i).getSegundoMedio()
                    + "\n*" + Cursos.get(i).getTerceroMedio() + "\n*" + Cursos.get(i).getCuartoMedio());

        }

    }
}
