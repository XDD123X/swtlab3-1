/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package controller;

import dal.UserDAO;
import model.User;
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
public class LoginServletTest {

    public LoginServletTest() {
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
     * Test of processRequest method, of class LoginServlet.
     */
    @Test
    public void testLogin1() throws Exception {
        UserDAO ud = new UserDAO();
        String username = "truong";
        String password = "123456";
        LoginServlet instance = new LoginServlet();
        User expResult = ud.check(username, password);
        User result = instance.Login(username, password);
        assertEquals(expResult.getId(), result.getId());
    }

    @Test
    public void testLogin2() throws Exception {
        UserDAO ud = new UserDAO();
        String username = "";
        String password = "123456";
        LoginServlet instance = new LoginServlet();
        User expResult = null;
        User result = instance.Login(username, password);
        assertEquals(expResult, result);
    }

    @Test
    public void testLogin3() throws Exception {
        UserDAO ud = new UserDAO();
        String username = null;
        String password = "123456";
        LoginServlet instance = new LoginServlet();
        User expResult = null;
        User result = instance.Login(username, password);
        assertEquals(expResult, result);
    }

    @Test
    public void testLogin4() throws Exception {
        UserDAO ud = new UserDAO();
        String username = "wrong name";
        String password = "123456";
        LoginServlet instance = new LoginServlet();
        User expResult = null;
        User result = instance.Login(username, password);
        assertEquals(expResult, result);
    }

    @Test
    public void testLogin5() throws Exception {
        UserDAO ud = new UserDAO();
        String username = "truong";
        String password = "";
        LoginServlet instance = new LoginServlet();
        User expResult = null;
        User result = instance.Login(username, password);
        assertEquals(expResult, result);
    }

    @Test
    public void testLogin6() throws Exception {
        UserDAO ud = new UserDAO();
        String username = "truong";
        String password = null;
        LoginServlet instance = new LoginServlet();
        User expResult = null;
        User result = instance.Login(username, password);
        assertEquals(expResult, result);
    }

    @Test
    public void testLogin7() throws Exception {
        UserDAO ud = new UserDAO();
        String username = "truong";
        String password = "wrong pass";
        LoginServlet instance = new LoginServlet();
        User expResult = null;
        User result = instance.Login(username, password);
        assertEquals(expResult, result);
    }

    @Test
    public void testLogin8() throws Exception {
        UserDAO ud = new UserDAO();
        String username = "maura";
        String password = "1234321";
        LoginServlet instance = new LoginServlet();
        User expResult = ud.check(username, password);
        User result = instance.Login(username, password);
        assertEquals(expResult.getId(), result.getId());
    }

    @Test
    public void testLogin9() throws Exception {
        UserDAO ud = new UserDAO();
        String username = "wrong name";
        String password = "wrong pass";
        LoginServlet instance = new LoginServlet();
        User expResult = null;
        User result = instance.Login(username, password);
        assertEquals(expResult, result);
    }

    @Test
    public void testLogin10() throws Exception {
        UserDAO ud = new UserDAO();
        String username = null;
        String password = null;
        LoginServlet instance = new LoginServlet();
        User expResult = null;
        User result = instance.Login(username, password);
        assertEquals(expResult, result);
    }

    @Test
    public void testLogin11() throws Exception {
        UserDAO ud = new UserDAO();
        String username = "";
        String password = "";
        LoginServlet instance = new LoginServlet();
        User expResult = null;
        User result = instance.Login(username, password);
        assertEquals(expResult, result);
    }
}
