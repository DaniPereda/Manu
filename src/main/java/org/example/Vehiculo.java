package org.example;

public abstract class Vehiculo {
    int numRuedas = 4;
    private String color;
    private String matricula;
    private boolean encendido;
    private String tipo;

    private String familia;

    public Vehiculo(int numRuedas) {
        this.color = "Blanco";
        this.numRuedas = numRuedas;
    }

    public int getNumRuedas() {
        return numRuedas;
    }

    public String getFamilia() {
        return familia;
    }

    public void setFamilia(String familia) {
        this.familia = familia;
    }

    public void setNumRuedas(int numRuedas) {
        this.numRuedas = numRuedas;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipoCoche) {
        this.tipo = tipoCoche;
    }

    public void arrancar()
    {
        this.encendido = !this.encendido;
    }

    public void apagar()
    {
        this.encendido = false;
    }
}
