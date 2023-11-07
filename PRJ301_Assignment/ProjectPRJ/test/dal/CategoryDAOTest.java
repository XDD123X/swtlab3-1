/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package dal;

import java.util.List;
import model.Category;
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
public class CategoryDAOTest {

    public CategoryDAOTest() {
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
     * Test of getAll method, of class CategoryDAO.
     */
    @Test
    public void testGetAll() {
        System.out.println("getAll");
        CategoryDAO instance = new CategoryDAO();
        List<Category> expResult = null;
        expResult.add(new Category(1, "Com"));
        List<Category> result = instance.getAll();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getCategoryById method, of class CategoryDAO.
     */
    @Test
    public void testGetCategoryById() {
        System.out.println("getCategoryById");
        int id = 1;
        CategoryDAO instance = new CategoryDAO();
//        Category expResult = new Category(1, "Com");
        Category expResult = new Category(1, "Com");
        Category result = instance.getCategoryById(id);
        
        assertEquals(expResult, result.equals(expResult));
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of delete method, of class CategoryDAO.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        int id = 0;
        CategoryDAO instance = new CategoryDAO();
        instance.delete(id);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of insert method, of class CategoryDAO.
     */
    @Test
    public void testInsert() {
        System.out.println("insert");
        Category c = null;
        CategoryDAO instance = new CategoryDAO();
        instance.insert(c);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of update method, of class CategoryDAO.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        Category c = null;
        CategoryDAO instance = new CategoryDAO();
        instance.update(c);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of main method, of class CategoryDAO.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        CategoryDAO.main(args);
        // TODO review the generated test code and remove the default call to fail.
    }

}
