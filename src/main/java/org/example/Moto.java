package org.example;

public class Moto extends Vehiculo {

    @Override
    public void setTipo(String tipoMoto) {
        super.setTipo(tipoMoto);

        if(super.getTipo() == "MotoRaraDe3Ruedas")
        {
            super.setNumRuedas(3);
        }else {
            super.setNumRuedas(2);
        }
    }

    public Moto() {
        super(2);
        this.setTipo("scooter");
        this.setFamilia("moto");
    }

}