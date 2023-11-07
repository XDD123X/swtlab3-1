/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package dal;

import java.util.ArrayList;
import java.util.List;
import model.Product;
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
public class ProductDAOTest {
    
    public ProductDAOTest() {
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
     * Test of getAll method, of class ProductDAO.
     */
    @Test
    public void testGetAll() {
        System.out.println("getAll");
        ProductDAO instance = new ProductDAO();
        List<Product> expResult = null;
        List<Product> result = instance.getAll();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getLast method, of class ProductDAO.
     */
    @Test
    public void testGetLast() {
        System.out.println("getLast");
        ProductDAO instance = new ProductDAO();
        Product expResult = null;
        Product result = instance.getLast();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getMinPrice method, of class ProductDAO.
     */
    @Test
    public void testGetMinPrice() {
        System.out.println("getMinPrice");
        ProductDAO instance = new ProductDAO();
        Product expResult = null;
        Product result = instance.getMinPrice();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getMaxPrice method, of class ProductDAO.
     */
    @Test
    public void testGetMaxPrice() {
        System.out.println("getMaxPrice");
        ProductDAO instance = new ProductDAO();
        Product expResult = null;
        Product result = instance.getMaxPrice();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getProductById method, of class ProductDAO.
     */
    @Test
    public void testGetProductById() {
        System.out.println("getProductById");
        String id = "";
        ProductDAO instance = new ProductDAO();
        Product expResult = null;
        Product result = instance.getProductById(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of delete method, of class ProductDAO.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        String id = "";
        ProductDAO instance = new ProductDAO();
        instance.delete(id);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of insert method, of class ProductDAO.
     */
    @Test
    public void testInsert() {
        System.out.println("insert");
        Product c = null;
        ProductDAO instance = new ProductDAO();
        instance.insert(c);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of update method, of class ProductDAO.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        Product c = null;
        ProductDAO instance = new ProductDAO();
        instance.update(c);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of searchProductByname method, of class ProductDAO.
     */
    @Test
    public void testSearchProductByname() throws Exception {
        System.out.println("searchProductByname");
        String name = "";
        ProductDAO instance = new ProductDAO();
        List<Product> expResult = null;
        List<Product> result = instance.searchProductByname(name);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of sortProductByPriceUp method, of class ProductDAO.
     */
    @Test
    public void testSortProductByPriceUp() throws Exception {
        System.out.println("sortProductByPriceUp");
        String cid = "";
        ProductDAO instance = new ProductDAO();
        List<Product> expResult = null;
        List<Product> result = instance.sortProductByPriceUp(cid);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of sortProductByPriceDown method, of class ProductDAO.
     */
    @Test
    public void testSortProductByPriceDown() throws Exception {
        System.out.println("sortProductByPriceDown");
        String cid = "";
        ProductDAO instance = new ProductDAO();
        List<Product> expResult = null;
        List<Product> result = instance.sortProductByPriceDown(cid);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of sortProductByNameUp method, of class ProductDAO.
     */
    @Test
    public void testSortProductByNameUp() throws Exception {
        System.out.println("sortProductByNameUp");
        String cid = "";
        ProductDAO instance = new ProductDAO();
        List<Product> expResult = null;
        List<Product> result = instance.sortProductByNameUp(cid);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of sortProductByNameDown method, of class ProductDAO.
     */
    @Test
    public void testSortProductByNameDown() throws Exception {
        System.out.println("sortProductByNameDown");
        String cid = "";
        ProductDAO instance = new ProductDAO();
        List<Product> expResult = null;
        List<Product> result = instance.sortProductByNameDown(cid);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of searchProductByPrice method, of class ProductDAO.
     */
    @Test
    public void testSearchProductByPrice() throws Exception {
        System.out.println("searchProductByPrice");
        String pricehead = "";
        String priceend = "";
        ProductDAO instance = new ProductDAO();
        List<Product> expResult = null;
        List<Product> result = instance.searchProductByPrice(pricehead, priceend);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getProductByCidPrice method, of class ProductDAO.
     */
    @Test
    public void testGetProductByCidPrice() throws Exception {
        System.out.println("getProductByCidPrice");
        String cid = "";
        String head = "";
        String end = "";
        ProductDAO instance = new ProductDAO();
        ArrayList<Product> expResult = null;
        ArrayList<Product> result = instance.getProductByCidPrice(cid, head, end);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of randomRelative method, of class ProductDAO.
     */
    @Test
    public void testRandomRelative() throws Exception {
        System.out.println("randomRelative");
        String id = "";
        String cid = "";
        ProductDAO instance = new ProductDAO();
        List<Product> expResult = null;
        List<Product> result = instance.randomRelative(id, cid);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of topNew method, of class ProductDAO.
     */
    @Test
    public void testTopNew() throws Exception {
        System.out.println("topNew");
        ProductDAO instance = new ProductDAO();
        List<Product> expResult = null;
        List<Product> result = instance.topNew();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of mostSold method, of class ProductDAO.
     */
    @Test
    public void testMostSold() throws Exception {
        System.out.println("mostSold");
        ProductDAO instance = new ProductDAO();
        List<Product> expResult = null;
        List<Product> result = instance.mostSold();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of topFeature method, of class ProductDAO.
     */
    @Test
    public void testTopFeature() throws Exception {
        System.out.println("topFeature");
        ProductDAO instance = new ProductDAO();
        List<Product> expResult = null;
        List<Product> result = instance.topFeature();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getHighestEarningProduct method, of class ProductDAO.
     */
    @Test
    public void testGetHighestEarningProduct() {
        System.out.println("getHighestEarningProduct");
        ProductDAO instance = new ProductDAO();
        Product expResult = null;
        Product result = instance.getHighestEarningProduct();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getLowestEarningProduct method, of class ProductDAO.
     */
    @Test
    public void testGetLowestEarningProduct() {
        System.out.println("getLowestEarningProduct");
        ProductDAO instance = new ProductDAO();
        Product expResult = null;
        Product result = instance.getLowestEarningProduct();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of mostSoldInXDay method, of class ProductDAO.
     */
    @Test
    public void testMostSoldInXDay() throws Exception {
        System.out.println("mostSoldInXDay");
        int last = 0;
        ProductDAO instance = new ProductDAO();
        List<Product> expResult = null;
        List<Product> result = instance.mostSoldInXDay(last);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of mostRevenueInXDay method, of class ProductDAO.
     */
    @Test
    public void testMostRevenueInXDay() throws Exception {
        System.out.println("mostRevenueInXDay");
        int last = 0;
        ProductDAO instance = new ProductDAO();
        List<Product> expResult = null;
        List<Product> result = instance.mostRevenueInXDay(last);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of main method, of class ProductDAO.
     */
    @Test
    public void testMain() throws Exception {
        System.out.println("main");
        String[] args = null;
        ProductDAO.main(args);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
