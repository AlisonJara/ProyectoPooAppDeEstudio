package com.mycompany.proyectojpoo;

import java.util.ArrayList;

public class Curso {

    private ArrayList PrimeroMedio;
    private ArrayList SegundoMedio;
    private ArrayList TerceroMedio;
    private ArrayList CuartoMedio;

    public Curso() {
    }

    public Curso(ArrayList PrimeroMedio, ArrayList SegundoMedio, ArrayList TerceroMedio, ArrayList CuartoMedio) {
        this.PrimeroMedio = PrimeroMedio;
        this.SegundoMedio = SegundoMedio;
        this.TerceroMedio = TerceroMedio;
        this.CuartoMedio = CuartoMedio;
    }
    //Getters
    public ArrayList getPrimeroMedio() {
        return PrimeroMedio;
    }

    public ArrayList getSegundoMedio() {
        return SegundoMedio;
    }

    public ArrayList getTerceroMedio() {
        return TerceroMedio;
    }

    public ArrayList getCuartoMedio() {
        return CuartoMedio;
    }
    //Setters
    public void setPrimeroMedio(ArrayList PrimeroMedio) {
        this.PrimeroMedio = PrimeroMedio;
    }

    public void setSegundoMedio(ArrayList SegundoMedio) {
        this.SegundoMedio = SegundoMedio;
    }

    public void setTerceroMedio(ArrayList TerceroMedio) {
        this.TerceroMedio = TerceroMedio;
    }

    public void setCuartoMedio(ArrayList CuartoMedio) {
        this.CuartoMedio = CuartoMedio;
    }
    
}
