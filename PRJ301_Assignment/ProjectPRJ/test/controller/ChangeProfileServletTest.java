/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package controller;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.apache.catalina.connector.Request;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author quanh
 */
public class ChangeProfileServletTest {

    public ChangeProfileServletTest() {
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
     * Test of processRequest method, of class ChangeProfileServlet.
     */
    @Test
    public void testProcessRequest() throws Exception {
        System.out.println("processRequest");
        HttpServletRequest request = null;
        HttpServletResponse response = null;
        ChangeProfileServlet instance = new ChangeProfileServlet();
        instance.processRequest(request, response);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of doGet method, of class ChangeProfileServlet.
     */
    @Test
    public void testDoGet() throws Exception {
        System.out.println("doGet");
        HttpServletRequest request = null;
        HttpServletResponse response = null;
        ChangeProfileServlet instance = new ChangeProfileServlet();
        instance.doGet(request, response);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of doPost method, of class ChangeProfileServlet.
     */
    @Test
    public void testDoPost() throws Exception {
        System.out.println("doPost");
        HttpServletRequest request = null;
        HttpServletResponse response = null;
        ChangeProfileServlet instance = new ChangeProfileServlet();
        instance.doPost(request, response);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getServletInfo method, of class ChangeProfileServlet.
     */
    @Test
    public void testGetServletInfo() {
        System.out.println("getServletInfo");
        ChangeProfileServlet instance = new ChangeProfileServlet();
        String expResult = "";
        String result = instance.getServletInfo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

}
