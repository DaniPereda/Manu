package org.example;

public class ConfiguradorVehiculos {
    Vehiculo setPolicia(Vehiculo vehiculo)
    {
        vehiculo.setColor("Blanco y azul");
        setTipoSegunFamiliaPolicia(vehiculo);
        return vehiculo;
    }

    private void setTipoSegunFamiliaPolicia(Vehiculo vehiculo) {
        if(vehiculo.getFamilia() == "coche")
        {
            vehiculo.setTipo("Deportivo");
        }
        if(vehiculo.getFamilia() == "moto")
        {
            vehiculo.setTipo("Harley");
        }
    }

    Vehiculo setBombero(Vehiculo vehiculo)
    {
        vehiculo.setColor("Roja");
       setTipoSegunFamiliaBombero(vehiculo);
        return vehiculo;
    }

    private void setTipoSegunFamiliaBombero(Vehiculo vehiculo) {
        if(vehiculo.getFamilia() == "coche")
        {
            vehiculo.setTipo("TodoTerreno");
        }
        if(vehiculo.getFamilia() == "moto")
        {
            vehiculo.setTipo("Enduro");
        }
    }
}
