package org.example;

import lombok.Data;

@Data
public class Pronostico {
    private Partido partido;
    private Equipo equipo;
    private Resultado pronostico;
    /*SETTER*/

    public Pronostico(Partido partido,Equipo equipo,Resultado pronostico) {
        this.partido = partido;
        this.equipo = equipo;
        this.pronostico = pronostico;
    }

    public int puntos(){
        int puntos = 0;
        if (partido.resultadoPartido(equipo) == pronostico) && (Resultado.EMPATE == pronostico){
            return puntos;
        }
    }

}
