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
public class GhostEncounterControlTest {
    
    public GhostEncounterControlTest() {
    }

    /**
     * Test of calcGhostEncounterProbability method, of class GhostEncounterControl.
     */
    @Test
    public void testCalcGhostEncounterProbability() {
        System.out.println("calcGhostEncounterProbability");
        
        System.out.println("test case #1");
        double collectedItems = 3.0;
        double collectableItems = 4.0;
        double numberOfCharms = 0.0;
        double superstitious = 0.0;
        double unsuperstitious = 0.0;
        GhostEncounterControl instance = new GhostEncounterControl();
        double expResult = 62.5;
        double result = instance.calcGhostEncounterProbability(collectedItems, collectableItems, numberOfCharms, superstitious, unsuperstitious);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
