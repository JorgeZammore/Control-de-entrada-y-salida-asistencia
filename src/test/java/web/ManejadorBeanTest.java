/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web;

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
public class ManejadorBeanTest {
    
    public ManejadorBeanTest() {
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
     * Test of getId method, of class ManejadorBean.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        ManejadorBean instance = new ManejadorBean();
        Long expResult = null;
        Long result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class ManejadorBean.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        Long id = null;
        ManejadorBean instance = new ManejadorBean();
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNombre method, of class ManejadorBean.
     */
    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        ManejadorBean instance = new ManejadorBean();
        String expResult = "";
        String result = instance.getNombre();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNombre method, of class ManejadorBean.
     */
    @Test
    public void testSetNombre() {
        System.out.println("setNombre");
        String nombre = "";
        ManejadorBean instance = new ManejadorBean();
        instance.setNombre(nombre);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getApellido method, of class ManejadorBean.
     */
    @Test
    public void testGetApellido() {
        System.out.println("getApellido");
        ManejadorBean instance = new ManejadorBean();
        String expResult = "";
        String result = instance.getApellido();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setApellido method, of class ManejadorBean.
     */
    @Test
    public void testSetApellido() {
        System.out.println("setApellido");
        String apellido = "";
        ManejadorBean instance = new ManejadorBean();
        instance.setApellido(apellido);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSueldo method, of class ManejadorBean.
     */
    @Test
    public void testGetSueldo() {
        System.out.println("getSueldo");
        ManejadorBean instance = new ManejadorBean();
        Integer expResult = null;
        Integer result = instance.getSueldo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSueldo method, of class ManejadorBean.
     */
    @Test
    public void testSetSueldo() {
        System.out.println("setSueldo");
        Integer sueldo = null;
        ManejadorBean instance = new ManejadorBean();
        instance.setSueldo(sueldo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getIdentificacion method, of class ManejadorBean.
     */
    @Test
    public void testGetIdentificacion() {
        System.out.println("getIdentificacion");
        ManejadorBean instance = new ManejadorBean();
        Integer expResult = null;
        Integer result = instance.getIdentificacion();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIdentificacion method, of class ManejadorBean.
     */
    @Test
    public void testSetIdentificacion() {
        System.out.println("setIdentificacion");
        Integer identificacion = null;
        ManejadorBean instance = new ManejadorBean();
        instance.setIdentificacion(identificacion);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getHoraIngreso method, of class ManejadorBean.
     */
    @Test
    public void testGetHoraIngreso() {
        System.out.println("getHoraIngreso");
        ManejadorBean instance = new ManejadorBean();
        Integer expResult = null;
        Integer result = instance.getHoraIngreso();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setHoraIngreso method, of class ManejadorBean.
     */
    @Test
    public void testSetHoraIngreso() {
        System.out.println("setHoraIngreso");
        Integer horaingreso = null;
        ManejadorBean instance = new ManejadorBean();
        instance.setHoraIngreso(horaingreso);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getHoraSalida method, of class ManejadorBean.
     */
    @Test
    public void testGetHoraSalida() {
        System.out.println("getHoraSalida");
        ManejadorBean instance = new ManejadorBean();
        Integer expResult = null;
        Integer result = instance.getHoraSalida();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setHoraSalida method, of class ManejadorBean.
     */
    @Test
    public void testSetHoraSalida() {
        System.out.println("setHoraSalida");
        Integer horasalida = null;
        ManejadorBean instance = new ManejadorBean();
        instance.setHoraSalida(horasalida);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMesActual method, of class ManejadorBean.
     */
    @Test
    public void testGetMesActual() {
        System.out.println("getMesActual");
        ManejadorBean instance = new ManejadorBean();
        Integer expResult = null;
        Integer result = instance.getMesActual();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMesActual method, of class ManejadorBean.
     */
    @Test
    public void testSetMesActual() {
        System.out.println("setMesActual");
        Integer mes = null;
        ManejadorBean instance = new ManejadorBean();
        instance.setMesActual(mes);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getComentario method, of class ManejadorBean.
     */
    @Test
    public void testGetComentario() {
        System.out.println("getComentario");
        ManejadorBean instance = new ManejadorBean();
        String expResult = "";
        String result = instance.getComentario();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setComentario method, of class ManejadorBean.
     */
    @Test
    public void testSetComentario() {
        System.out.println("setComentario");
        String comentario = "";
        ManejadorBean instance = new ManejadorBean();
        instance.setComentario(comentario);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMensaje method, of class ManejadorBean.
     */
    @Test
    public void testGetMensaje() {
        System.out.println("getMensaje");
        ManejadorBean instance = new ManejadorBean();
        String expResult = "";
        String result = instance.getMensaje();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMensaje method, of class ManejadorBean.
     */
    @Test
    public void testSetMensaje() {
        System.out.println("setMensaje");
        String mensaje = "";
        ManejadorBean instance = new ManejadorBean();
        instance.setMensaje(mensaje);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of limpiar method, of class ManejadorBean.
     */
    @Test
    public void testLimpiar() {
        System.out.println("limpiar");
        ManejadorBean instance = new ManejadorBean();
        instance.limpiar();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of guardar method, of class ManejadorBean.
     */
    @Test
    public void testGuardar() {
        System.out.println("guardar");
        ManejadorBean instance = new ManejadorBean();
        instance.guardar();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of eliminar method, of class ManejadorBean.
     */
    @Test
    public void testEliminar() {
        System.out.println("eliminar");
        ManejadorBean instance = new ManejadorBean();
        instance.eliminar();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
