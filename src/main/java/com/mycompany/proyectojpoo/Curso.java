package com.mycompany.proyectojpoo;

import java.util.ArrayList;

public class Curso {

    private String PrimeroMedio;
    private String SegundoMedio;
    private String TerceroMedio;
    private String CuartoMedio;

    public Curso() {
    }

    public Curso(String PrimeroMedio, String SegundoMedio, String TerceroMedio, String CuartoMedio) {
        this.PrimeroMedio = PrimeroMedio;
        this.SegundoMedio = SegundoMedio;
        this.TerceroMedio = TerceroMedio;
        this.CuartoMedio = CuartoMedio;
    }
    //Getters
    public String getPrimeroMedio() {
        return PrimeroMedio;
    }

    public String getSegundoMedio() {
        return SegundoMedio;
    }

    public String getTerceroMedio() {
        return TerceroMedio;
    }

    public String getCuartoMedio() {
        return CuartoMedio;
    }
    //Setters
    public void setPrimeroMedio(String PrimeroMedio) {
        this.PrimeroMedio = PrimeroMedio;
    }

    public void setSegundoMedio(String SegundoMedio) {
        this.SegundoMedio = SegundoMedio;
    }

    public void setTerceroMedio(String TerceroMedio) {
        this.TerceroMedio = TerceroMedio;
    }

    public void setCuartoMedio(String CuartoMedio) {
        this.CuartoMedio = CuartoMedio;
    }
    
}
