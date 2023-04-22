package com.mycompany.proyectojpoo;

import au.com.bytecode.opencsv.CSVWriter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Reporte {

    private String Ruta;

    public Reporte(String Ruta) {
        this.Ruta = Ruta;

    }


    public void EscribirCliente(String[] header, ArrayList<Usuario> Datos) {
        File file = new File(this.Ruta);
        try {
            // Crea el File
            FileWriter outputfile = new FileWriter(file);

            // crea el escritor 
            CSVWriter writer = new CSVWriter(outputfile);

            // Crea la cabecera
            writer.writeNext(header);

            // añade los datos al archivo
            for (int i = 0; i < Datos.size(); i++) {
                String[] data = {Datos.get(i).getName(), Datos.get(i).getEmail(), Datos.get(i).getPassword()};
                writer.writeNext(data);
            }

            // se cierra el escritor
            writer.close();
        } catch (IOException e) {
            
            e.printStackTrace();
        }

    }

    public String getRuta() {
        return Ruta;
    }

    public void setRuta(String Ruta) {
        this.Ruta = Ruta;
    }

}
