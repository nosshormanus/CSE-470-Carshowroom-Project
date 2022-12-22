/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package Controller;

import java.sql.ResultSet;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author hp
 */
public class adminTest {
    
    public adminTest() {
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
    public void testAddcar() {
        System.out.println("addcar");
        String id = "19";
        String pr = "Corolla";
        String man = "Tata";
        String mod = "Double Xl";
        String f = "Strong";
        String p = "123444";
        admin instance = new admin();
        instance.addcar(id, pr, man, mod, f, p);
        fail("The test case is a prototype.");
    }

    @Test
    public void testDeletecar() {
        System.out.println("deletecar");
        String id = "19";
        admin instance = new admin();
        instance.deletecar(id);
        fail("The test case is a prototype.");
    }

    @Test
    public void testUpdatecar() {
        System.out.println("updatecar");
        String id = "3";
        String f = "Large";
        String nv = "XL";
        admin instance = new admin();
        instance.updatecar(id, f, nv);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSignIn() {
        System.out.println("signIn");
        String email = "admin";
        String pass = "123";
        admin instance = new admin();
        instance.signIn(email, pass);
        fail("The test case is a prototype.");
    }

    @Test
    public void testStufflist() {
        System.out.println("stufflist");
        admin instance = new admin();
        ResultSet expResult = null;
        ResultSet result = instance.stufflist();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSeeuserreq() {
        System.out.println("seeuserreq");
        admin instance = new admin();
        ResultSet expResult = null;
        ResultSet result = instance.seeuserreq();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
    
}
