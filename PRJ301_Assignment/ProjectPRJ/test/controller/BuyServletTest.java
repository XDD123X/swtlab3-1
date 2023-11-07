/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package controller;

import dal.ProductDAO;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;
import model.Cart;
import model.Item;
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
public class BuyServletTest {

    public BuyServletTest() {
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

    @Test
    public void testBuy1() {
        System.out.println("Buy");
        Object o = null;
        String num = "";
        String id = "";
        BuyServlet instance = new BuyServlet();
        List<Item> expResult = null;
        List<Item> result = instance.Buy(o, num, id);
        assertEquals(expResult, result);
    }

    @Test
    public void testBuy2() {
        System.out.println("Buy");
        ProductDAO pd = new ProductDAO();
        Object o = null;
        String num = "1";
        String id = "20";
        BuyServlet instance = new BuyServlet();
        List<Item> expResult = new ArrayList<>();
        Product product = pd.getProductById(id);
        Item item = new Item(product, 1, product.getPrice());
        expResult.add(item);
        List<Item> result = instance.Buy(o, num, id);
        assertEquals(expResult.toString(), result.toString());
    }
    @Test
    public void testBuy3() {
        System.out.println("Buy");
        Object o = null;
        String num = "0";
        String id = "20";
        BuyServlet instance = new BuyServlet();
        List<Item> expResult = null;
        List<Item> result = instance.Buy(o, num, id);
        assertEquals(expResult, result);
    }

}
