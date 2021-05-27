/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaseDatos;

import BaseDatos.Conexiones;
import java.sql.Connection;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jorge Zambrano
 */
public class ConexionesTest {
    
    @Test
    public void testConectarse() {
        Conexiones c = new Conexiones();
        Connection cActiva = c.conectarse();
        assertNotNull(cActiva);
    }
 @Test
    public void testDesconectarse() {
        Conexiones c = new Conexiones();
        Connection cActiva = c.conectarse();
        c.desconectarse(cActiva);
        assertNotNull(c);
    }
    
}
