/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

/**
 *
 * @author Jorge Zambrano
 */
public enum MesActual {
    ENERO("Enero"),
    FEBRERO("Febrero"),
    MARZO("Marzo"),
    ABRIL("Abril"),
    MAYO("Mayo"),
    JUNIO("Junio"),
    JULIO("Julio"),
    AGOSTO("Agosto"),
    SEPTIEMBRE("Septiembre"),
    OCTUBRE("Octubre"),
    NOVIEMBRE("Noviembre"),
    DICIEMBRE("Diciembre");
    final private String nombre;

    MesActual (String nombre){
        this.nombre = nombre;
        
    }

    public String getNombre() {
        return nombre;
    }
}
