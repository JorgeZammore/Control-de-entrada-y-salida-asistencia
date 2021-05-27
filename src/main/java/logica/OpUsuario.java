/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import BaseDatos.Conexiones;
import dto.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jorge Zambrano
 */
public class OpUsuario {
    
    public int insertar(Usuario dato) {
        Conexiones c = new Conexiones();
        Connection cActiva = c.conectarse();
        if (cActiva != null){
            try {
                String sql = "insert into Empleado (nombre, apellido, identificacion, sueldo, horaingreso, horasalida, mes, comentario ) values (?,?,?,?,?,?,?,?)";
                PreparedStatement ps =  cActiva.prepareStatement(sql);
                ps.setString(1, dato.getNombre());
                ps.setString(2, dato.getApellido());
                ps.setLong(3, dato.getIdentificacion());
                ps.setInt(4, dato.getSueldo());
                ps.setInt(5, dato.getHoraIngreso());
                ps.setInt(6, dato.getHoraSalida());
                ps.setString(7, dato.getMesActual().getNombre());
                ps.setString(8, dato.getComentario());
                int rta = ps.executeUpdate();
                return rta;
            } catch (SQLException ex) {
                Logger.getLogger(OpUsuario.class.getName()).log(Level.SEVERE, null, ex);
            }finally{
                c.desconectarse(cActiva);
            }
            
        }
        return 0;
                
    }
    
    public int eliminarUsuario(Usuario usuario) {
        Conexiones c = new Conexiones();
        Usuario usuario1 = usuario;
        if(usuario != null){
            String sql = "DELETE FROM Empleado WHERE nombre = ?";
        try {
            Connection cActiva = c.conectarse();
            PreparedStatement ps = cActiva.prepareStatement(sql);
            ps.setString(1, usuario.getNombre());
            int respuesta = ps.executeUpdate();
            c.desconectarse(cActiva);
            return respuesta;
        } catch (SQLException ex) {
            Logger.getLogger(OpUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        }else{
        
        }
        return 0;
    }
    
}
