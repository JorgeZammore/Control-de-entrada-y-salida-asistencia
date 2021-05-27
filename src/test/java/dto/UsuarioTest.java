/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

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
public class UsuarioTest {
    
    public UsuarioTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getId method, of class Usuario.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Usuario instance = new Usuario();
        Long expResult = null;
        Long result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class Usuario.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        Long id = null;
        Usuario instance = new Usuario();
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNombre method, of class Usuario.
     */
    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        Usuario instance = new Usuario();
        String expResult = "";
        String result = instance.getNombre();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNombre method, of class Usuario.
     */
    @Test
    public void testSetNombre() {
        System.out.println("setNombre");
        String nombre = "";
        Usuario instance = new Usuario();
        instance.setNombre(nombre);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getApellido method, of class Usuario.
     */
    @Test
    public void testGetApellido() {
        System.out.println("getApellido");
        Usuario instance = new Usuario();
        String expResult = "";
        String result = instance.getApellido();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setApellido method, of class Usuario.
     */
    @Test
    public void testSetApellido() {
        System.out.println("setApellido");
        String apellido = "";
        Usuario instance = new Usuario();
        instance.setApellido(apellido);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getIdentificacion method, of class Usuario.
     */
    @Test
    public void testGetIdentificacion() {
        System.out.println("getIdentificacion");
        Usuario instance = new Usuario();
        Integer expResult = null;
        Integer result = instance.getIdentificacion();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIdentificacion method, of class Usuario.
     */
    @Test
    public void testSetIdentificacion() {
        System.out.println("setIdentificacion");
        Integer identificacion = null;
        Usuario instance = new Usuario();
        instance.setIdentificacion(identificacion);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSueldo method, of class Usuario.
     */
    @Test
    public void testGetSueldo() {
        System.out.println("getSueldo");
        Usuario instance = new Usuario();
        Integer expResult = null;
        Integer result = instance.getSueldo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSueldo method, of class Usuario.
     */
    @Test
    public void testSetSueldo() {
        System.out.println("setSueldo");
        Integer sueldo = null;
        Usuario instance = new Usuario();
        instance.setSueldo(sueldo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getHoraIngreso method, of class Usuario.
     */
    @Test
    public void testGetHoraIngreso() {
        System.out.println("getHoraIngreso");
        Usuario instance = new Usuario();
        Integer expResult = null;
        Integer result = instance.getHoraIngreso();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setHoraIngreso method, of class Usuario.
     */
    @Test
    public void testSetHoraIngreso() {
        System.out.println("setHoraIngreso");
        Integer horaingreso = null;
        Usuario instance = new Usuario();
        instance.setHoraIngreso(horaingreso);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getHoraSalida method, of class Usuario.
     */
    @Test
    public void testGetHoraSalida() {
        System.out.println("getHoraSalida");
        Usuario instance = new Usuario();
        Integer expResult = null;
        Integer result = instance.getHoraSalida();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setHoraSalida method, of class Usuario.
     */
    @Test
    public void testSetHoraSalida() {
        System.out.println("setHoraSalida");
        Integer horasalida = null;
        Usuario instance = new Usuario();
        instance.setHoraSalida(horasalida);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMesActual method, of class Usuario.
     */
    @Test
    public void testGetMesActual() {
        System.out.println("getMesActual");
        Usuario instance = new Usuario();
        MesActual expResult = null;
        MesActual result = instance.getMesActual();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMesActual method, of class Usuario.
     */
    @Test
    public void testSetMesActual() {
        System.out.println("setMesActual");
        MesActual mes = null;
        Usuario instance = new Usuario();
        instance.setMesActual(mes);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getComentario method, of class Usuario.
     */
    @Test
    public void testGetComentario() {
        System.out.println("getComentario");
        Usuario instance = new Usuario();
        String expResult = "";
        String result = instance.getComentario();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setComentario method, of class Usuario.
     */
    @Test
    public void testSetComentario() {
        System.out.println("setComentario");
        String comentario = "";
        Usuario instance = new Usuario();
        instance.setComentario(comentario);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Usuario.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Usuario instance = new Usuario();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
