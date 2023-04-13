package org.example;

import lombok.Data;

@Data
public class Partido {

    private Equipo equipo1;
    private Equipo equipo2;
    private int golesEquipo1;
    private int golesEquipo2;
    private Resultado resultado;

    public Partido(Equipo equipo1, Equipo equipo2,int golesEquipo1,int golesEquipo2) {
        this.equipo1 = equipo1;
        this.equipo2 = equipo2;
        this.golesEquipo1 =golesEquipo1;
        this.golesEquipo2=golesEquipo2;
    }

    public Resultado resultadoPartido(Equipo equipo){

        if(golesEquipo1 == golesEquipo2){
            resultado = Resultado.EMPATE;
        }
        else if(golesEquipo1 > golesEquipo2){
            resultado = Resultado.GANADOR_EQUIPO1;
        }
        else resultado = Resultado.GANADOR_EQUIPO2;

        return resultado;
    };
}
