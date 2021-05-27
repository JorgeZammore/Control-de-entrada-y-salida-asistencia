/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web;

import dto.MesActual;
import dto.Usuario;
import javax.faces.bean.ManagedBean;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable; 
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import logica.OpUsuario;
/**
 *
 * @author Jorge Zambrano
 */
@ManagedBean
@SessionScoped
public class ManejadorBean implements Serializable {
    private Long id;
    private String nombre;
    private String apellido;
    private Integer sueldo;
    private Integer identificacion;
    private Integer horaingreso;
    private Integer horasalida;
    private Integer mes;
    private String comentario;
    private String mensaje;

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

    public Integer getSueldo() {
        return sueldo;
    }

    public void setSueldo(Integer sueldo) {
        this.sueldo = sueldo;
    }
    
    public Integer getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(Integer identificacion) {
        this.identificacion = identificacion;
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
    
    public Integer getMesActual() {
        return mes;
    }

    public void setMesActual(Integer mes) {
        this.mes = mes;
    }
    
    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
    
    
    public ManejadorBean() {
    }
    
    public void limpiar(){
        System.out.println("Registrar ");
        System.out.println(" Nombre "+nombre);
        System.out.println(" Apellido "+apellido);
        System.out.println(" Sueldo "+sueldo);
        System.out.println(" Identificacion "+identificacion);
        System.out.println(" Hora Ingreso "+horaingreso);
        System.out.println(" Hora Salida "+horasalida);
        System.out.println(" Mes ACtual "+mes); 
        System.out.println(" Comentario "+comentario);  
        /**Usuario X = new Usuario();
        X.setApellido(" ");
        X.setComentario(" ");
        X.setHoraIngreso(this.horaingreso);
        X.setHoraSalida(this.horasalida);
        X.setIdentificacion(null);
        X.setMesActual(null);
        X.setNombre(" ");
        X.setSueldo(null);
        if (this.mes == 1)
            X.setMesActual(MesActual.ENERO);
        if (this.mes == 2)
            X.setMesActual(MesActual.FEBRERO);
        if (this.mes == 3)
            X.setMesActual(MesActual.MARZO);
        if (this.mes == 4)
            X.setMesActual(MesActual.ABRIL);
        if (this.mes== 5)
            X.setMesActual(MesActual.MAYO);
        if (this.mes== 6)
            X.setMesActual(MesActual.JUNIO);
        if (this.mes== 7)
            X.setMesActual(MesActual.JULIO);
        if (this.mes== 8)
            X.setMesActual(MesActual.AGOSTO);
        if (this.mes== 9)
            X.setMesActual(MesActual.SEPTIEMBRE);
        if (this.mes== 10)
            X.setMesActual(MesActual.OCTUBRE);
        if (this.mes== 11)
            X.setMesActual(MesActual.NOVIEMBRE);
        if (this.mes== 12)
            X.setMesActual(MesActual.DICIEMBRE);
        this.mensaje = "Se limpio";*/
        
    }
    
    public void guardar(){
        System.out.println("Registrar ");
        System.out.println(" Nombre "+nombre);
        System.out.println(" Apellido "+apellido);
        System.out.println(" Identificacion "+identificacion);
        System.out.println(" Sueldo "+sueldo);
        System.out.println(" Hora Ingreso "+horaingreso);
        System.out.println(" Hora Salida "+horasalida);
        System.out.println(" Mes Actual "+mes);   
        System.out.println(" Comentario "+comentario);
        OpUsuario oper = new OpUsuario();
        Usuario e = new Usuario();
        e.setNombre(nombre);
        e.setIdentificacion(identificacion);
        e.setApellido(apellido);
        e.setSueldo(sueldo);
        e.setHoraIngreso(horaingreso);
        e.setHoraSalida(horasalida);
        e.setComentario(comentario);
        e.setMesActual(MesActual.ENERO);
        e.setMesActual(MesActual.FEBRERO);
        e.setMesActual(MesActual.MARZO);
        e.setMesActual(MesActual.ABRIL);
        e.setMesActual(MesActual.MAYO);
        e.setMesActual(MesActual.JUNIO);
        e.setMesActual(MesActual.JULIO);
        e.setMesActual(MesActual.AGOSTO);
        e.setMesActual(MesActual.SEPTIEMBRE);
        e.setMesActual(MesActual.OCTUBRE);
        e.setMesActual(MesActual.NOVIEMBRE);
        e.setMesActual(MesActual.DICIEMBRE);
        if (oper.insertar(e) >= 0) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Warning", "Se guardaron los datos del empleado"));   
           
        } else {
             FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, "Info", "No se pudo almacenar los datos del empleado "));
        }
    }
    
    
    public void eliminar() {
        OpUsuario oper = new OpUsuario();
        Usuario e = new Usuario();
        e.setNombre(nombre);
        System.out.println(" Nombre" + e);
        this.mensaje = "Se ha eliminado \n";
        if (oper.eliminarUsuario(e) >= 0) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Nombre eliminada", ""));
        } else {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, "Warning", "No se pudo eliminar"));
        }

    }
}
