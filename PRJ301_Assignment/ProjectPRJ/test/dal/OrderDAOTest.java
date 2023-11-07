/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package dal;

import java.util.List;
import model.Cart;
import model.Order;
import model.OrderDateDetail;
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
public class OrderDAOTest {
    
    public OrderDAOTest() {
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
     * Test of addOrder method, of class OrderDAO.
     */
    @Test
    public void testAddOrder() {
        System.out.println("addOrder");
        User u = null;
        Cart cart = null;
        OrderDAO instance = new OrderDAO();
        instance.addOrder(u, cart);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getNumOfOrder method, of class OrderDAO.
     */
    @Test
    public void testGetNumOfOrder() {
        System.out.println("getNumOfOrder");
        OrderDAO instance = new OrderDAO();
        int expResult = 0;
        int result = instance.getNumOfOrder();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getTotalRenevue method, of class OrderDAO.
     */
    @Test
    public void testGetTotalRenevue() {
        System.out.println("getTotalRenevue");
        OrderDAO instance = new OrderDAO();
        double expResult = 0.0;
        double result = instance.getTotalRenevue();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getAll method, of class OrderDAO.
     */
    @Test
    public void testGetAll() {
        System.out.println("getAll");
        OrderDAO instance = new OrderDAO();
        List<Order> expResult = null;
        List<Order> result = instance.getAll();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of numProductPerDay method, of class OrderDAO.
     */
    @Test
    public void testNumProductPerDay() {
        System.out.println("numProductPerDay");
        OrderDAO instance = new OrderDAO();
        List<Order> expResult = null;
        List<Order> result = instance.numProductPerDay();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of Date method, of class OrderDAO.
     */
    @Test
    public void testDate() {
        System.out.println("Date");
        OrderDAO instance = new OrderDAO();
        List<Order> expResult = null;
        List<Order> result = instance.Date();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of OrderDateDetail method, of class OrderDAO.
     */
    @Test
    public void testOrderDateDetail() {
        System.out.println("OrderDateDetail");
        String date = "";
        OrderDAO instance = new OrderDAO();
        List<OrderDateDetail> expResult = null;
        List<OrderDateDetail> result = instance.OrderDateDetail(date);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of mostOrderPerDay method, of class OrderDAO.
     */
    @Test
    public void testMostOrderPerDay() {
        System.out.println("mostOrderPerDay");
        OrderDAO instance = new OrderDAO();
        List<Order> expResult = null;
        List<Order> result = instance.mostOrderPerDay();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of leastOrderPerDay method, of class OrderDAO.
     */
    @Test
    public void testLeastOrderPerDay() {
        System.out.println("leastOrderPerDay");
        OrderDAO instance = new OrderDAO();
        List<Order> expResult = null;
        List<Order> result = instance.leastOrderPerDay();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of AllDate method, of class OrderDAO.
     */
    @Test
    public void testAllDate() {
        System.out.println("AllDate");
        OrderDAO instance = new OrderDAO();
        List<Order> expResult = null;
        List<Order> result = instance.AllDate();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of currentDate method, of class OrderDAO.
     */
    @Test
    public void testCurrentDate() {
        System.out.println("currentDate");
        OrderDAO instance = new OrderDAO();
        String expResult = "";
        String result = instance.currentDate();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of OrderDateDetailInXDays method, of class OrderDAO.
     */
    @Test
    public void testOrderDateDetailInXDays() {
        System.out.println("OrderDateDetailInXDays");
        int day = 0;
        OrderDAO instance = new OrderDAO();
        List<OrderDateDetail> expResult = null;
        List<OrderDateDetail> result = instance.OrderDateDetailInXDays(day);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of OrderDateDetailInAllDays method, of class OrderDAO.
     */
    @Test
    public void testOrderDateDetailInAllDays() {
        System.out.println("OrderDateDetailInAllDays");
        OrderDAO instance = new OrderDAO();
        List<OrderDateDetail> expResult = null;
        List<OrderDateDetail> result = instance.OrderDateDetailInAllDays();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of RevenueUp method, of class OrderDAO.
     */
    @Test
    public void testRevenueUp() {
        System.out.println("RevenueUp");
        OrderDAO instance = new OrderDAO();
        List<OrderDateDetail> expResult = null;
        List<OrderDateDetail> result = instance.RevenueUp();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of RevenueDown method, of class OrderDAO.
     */
    @Test
    public void testRevenueDown() {
        System.out.println("RevenueDown");
        OrderDAO instance = new OrderDAO();
        List<OrderDateDetail> expResult = null;
        List<OrderDateDetail> result = instance.RevenueDown();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of OrderPerDayUp method, of class OrderDAO.
     */
    @Test
    public void testOrderPerDayUp() {
        System.out.println("OrderPerDayUp");
        OrderDAO instance = new OrderDAO();
        List<Order> expResult = null;
        List<Order> result = instance.OrderPerDayUp();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of OrderPerDayDown method, of class OrderDAO.
     */
    @Test
    public void testOrderPerDayDown() {
        System.out.println("OrderPerDayDown");
        OrderDAO instance = new OrderDAO();
        List<Order> expResult = null;
        List<Order> result = instance.OrderPerDayDown();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of leastRevenuePerDay method, of class OrderDAO.
     */
    @Test
    public void testLeastRevenuePerDay() {
        System.out.println("leastRevenuePerDay");
        OrderDAO instance = new OrderDAO();
        List<OrderDateDetail> expResult = null;
        List<OrderDateDetail> result = instance.leastRevenuePerDay();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of mostRevenuePerDay method, of class OrderDAO.
     */
    @Test
    public void testMostRevenuePerDay() {
        System.out.println("mostRevenuePerDay");
        OrderDAO instance = new OrderDAO();
        List<OrderDateDetail> expResult = null;
        List<OrderDateDetail> result = instance.mostRevenuePerDay();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of main method, of class OrderDAO.
     */
    @Test
    public void testMain() throws Exception {
        System.out.println("main");
        String[] args = null;
        OrderDAO.main(args);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
