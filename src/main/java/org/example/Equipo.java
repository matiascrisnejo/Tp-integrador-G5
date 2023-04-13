package org.example;


import lombok.Data;
import lombok.NoArgsConstructor;

@Data@NoArgsConstructor
public class Equipo {

    private String nombre;
    private String descripcion;

    /*SETTER*/

    public Equipo(String nombre,String descripcion){
        this.nombre = nombre;
        this.descripcion = descripcion;

    }
    /*GETTER*/

    public String nombre(){
        return nombre;
    }

    public String descripcion(){
        return descripcion;
    }
}

