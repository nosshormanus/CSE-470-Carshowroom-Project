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
public class userTest {
    
    public userTest() {
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
    public void testSignup() {
        System.out.println("signup");
        String n = "showmen";
        String e = "showmen";
        String a = "showmen@gmail.com";
        String p = "123";
        user instance = new user();
        instance.signup(n, e, a, p);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSignIn() {
        System.out.println("signIn");
        String email = "showmen";
        String pass = "123";
        user instance = new user();
        instance.signIn(email, pass);
        fail("The test case is a prototype.");
    }

    @Test
    public void testShowcar() {
        System.out.println("showcar");
        user instance = new user();
        ResultSet expResult = null;
        ResultSet result = instance.showcar();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testBuycar() {
        System.out.println("buycar");
        String id = "21";
        user instance = new user();
        ResultSet expResult = null;
        ResultSet result = instance.buycar(id);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testExcahngecar() {
        System.out.println("excahngecar");
        int price = 0;
        user instance = new user();
        ResultSet expResult = null;
        ResultSet result = instance.excahngecar(price);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSellcar() {
        System.out.println("sellcar");
        String model = "bugati";
        String yop = "veron";
        String des = "sjhd";
        user instance = new user();
        instance.sellcar(model, yop, des);
        fail("The test case is a prototype.");
    }

    @Test
    public void testAddaccount() {
        System.out.println("addaccount");
        String accname = "12";
        String accno = "124dxf";
        user instance = new user();
        instance.addaccount(accname, accno);
        fail("The test case is a prototype.");
    }

    @Test
    public void testMakemoney() {
        System.out.println("makemoney");
        String model = "Bugati";
        String yop = "124";
        String des = "cheron";
        user instance = new user();
        instance.makemoney(model, yop, des);
        fail("The test case is a prototype.");
    }

    @Test
    public void testRepair() {
        System.out.println("repair");
        String model = "";
        String des = "";
        user instance = new user();
        instance.repair(model, des);
        fail("The test case is a prototype.");
    }

    @Test
    public void testReqcar() {
        System.out.println("reqcar");
        String model = "Corolla";
        String m = "Tata";
        String f = "Double XL";
        String p = "12444";
        user instance = new user();
        instance.reqcar(model, m, f, p);
        fail("The test case is a prototype.");
    }
    
}
