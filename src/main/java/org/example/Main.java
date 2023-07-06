package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        //Construir un coche
        Vehiculo coche = new Coche();
        Vehiculo moto = new Moto();

        // Matricularlo
        Matriculador matriculador = new Matriculador("ES");
        coche.setMatricula(matriculador.nuevaMatricula());


        ConfiguradorVehiculos configuradorVehiculos = new ConfiguradorVehiculos();
        configuradorVehiculos.setPolicia(coche);
        System.out.println(coche.getTipo());

        // Utilizarlo para las practicas de conducir

    }
}