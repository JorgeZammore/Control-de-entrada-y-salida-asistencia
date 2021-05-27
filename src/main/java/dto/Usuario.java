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
public class Usuario {
    private Long id;
    private String nombre;
    private String apellido;
    private Integer sueldo;
    private Integer identificacion;
    private Integer horaingreso;
    private Integer horasalida;
    private MesActual mes;
    private String comentario;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    public Integer getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(Integer identificacion) {
        this.identificacion = identificacion;
    }
    
    public Integer getSueldo() {
        return sueldo;
    }

    public void setSueldo(Integer sueldo) {
        this.sueldo = sueldo;
    }
    
    public Integer getHoraIngreso() {
        return horaingreso;
    }

    public void setHoraIngreso(Integer horaingreso) {
        this.horaingreso = horaingreso;
    }
    
    public Integer getHoraSalida() {
        return horasalida;
    }

    public void setHoraSalida(Integer horasalida) {
        this.horasalida = horasalida;
    }

    public MesActual getMesActual() {
        return mes;
    }

    public void setMesActual(MesActual mes) {
        this.mes = mes;
    }
    
     public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }
    
    
    @Override
    public String toString() {
        return this.nombre +""+
                this.apellido+""+
                this.identificacion+""+
                this.sueldo+""+
                this.horaingreso+""+
                this.horasalida+""+
                this.mes.getNombre()+""+
                this.comentario;
    } 
   
}
