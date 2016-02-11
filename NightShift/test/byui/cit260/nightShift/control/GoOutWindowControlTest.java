/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.nightShift.control;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Ni shi shei
 */
public class GoOutWindowControlTest {
    
    public GoOutWindowControlTest() {
    }

    /**
     * Test of calcRopeLength method, of class GoOutWindowControl.
     */
    @Test
    public void testCalcRopeLength() {
        System.out.println("calcRopeLength");
        
        /*Test Case #1*/
        System.out.println("\tTest case #1");
        
        // input values for test case 1
        double length = 13.0;
        double expResult = 13.0;
        
        GoOutWindowControl instance = new GoOutWindowControl();
        
        double result = instance.calcRopeLength(length);
        
        assertEquals(expResult, result, 0.1);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
