package org.example;

public class Coche extends Vehiculo {

    @Override
    public void setTipo(String tipoCoche) {
        super.setTipo(tipoCoche);
    }

    public Coche() {
        super(4);
        this.setTipo("compacto");
        this.setFamilia("coche");

    }
}
