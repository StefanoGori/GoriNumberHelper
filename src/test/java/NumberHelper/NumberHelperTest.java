/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NumberHelper;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author stefa
 */
public class NumberHelperTest {
    
    public NumberHelperTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of isEven method, of class NumberHelper.
     */
    @Test
    public void testIsEven() {
        System.out.println("isEven");
        NumberHelper instance = new NumberHelper(53);
        boolean expResult = false;
        boolean result = instance.isEven();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of isOdd method, of class NumberHelper.
     */
    @Test
    public void testIsOdd() {
        System.out.println("isOdd");
        NumberHelper instance = new NumberHelper(542);
        boolean expResult = false;
        boolean result = instance.isOdd();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of sum method, of class NumberHelper.
     */
    @Test
    public void testSum() {
        System.out.println("sum");
        int n = 0;
        NumberHelper instance = new NumberHelper(12);
        int expResult = 12;
        int result = instance.sum(n);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of isPrime method, of class NumberHelper.
     */
    @Test
    public void testIsPrime() {
        System.out.println("isPrime");
        NumberHelper instance = new NumberHelper(17);
        boolean expResult = true;
        boolean result = instance.isPrime();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of isDivisibleBy method, of class NumberHelper.
     */
    @Test
    public void testIsDivisibleBy() {
        System.out.println("isDivisibleBy");
        int n = 4;
        NumberHelper instance = new NumberHelper(34);
        boolean expResult = false;
        boolean result = instance.isDivisibleBy(n);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }
    
}   