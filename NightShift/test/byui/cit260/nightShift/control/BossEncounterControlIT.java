/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.nightShift.control;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Silver
 */
public class BossEncounterControlIT {
    
    public BossEncounterControlIT() {
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
     * Test of bossEquation method, of class BossEncounterControl.
     */
    @Test
    public void testBossEquation() {
        System.out.println("bossEquation");
        double goingUp = 0.0;
        double goingDown = 0.0;
        BossEncounterControl instance = new BossEncounterControl();
        double expResult = 0.0;
        double result = instance.bossEquation(goingUp, goingDown);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
