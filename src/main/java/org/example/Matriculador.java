package org.example;

public class Matriculador {
    String pais;

    public Matriculador(String pais) {
        this.pais = pais;
    }

    public String nuevaMatricula()
    {
        if (pais == "ES")
        {
            MatriculadorEspanol matriculadorEspanol = new MatriculadorEspanol();
            return matriculadorEspanol.newMatricula();
        }
        if (pais == "FR")
        {
            MatriculadorFrances matriculadorFrances = new MatriculadorFrances();
            return matriculadorFrances.newMatricula();
        }
        else
            return "ERROR";
    }
}
