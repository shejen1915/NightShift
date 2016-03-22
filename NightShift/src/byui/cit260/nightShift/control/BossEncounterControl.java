/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.nightShift.control;

import byui.cit260.nightShift.exceptions.BossEncounterControlException;

/**
 *
 * @author Ni shi shei
 */
public class BossEncounterControl {
        public static int bossEquation(double goingUp, double goingDown) throws BossEncounterControlException
        {
        

        if (goingDown <= 7) { // going down is null?
            return -1; 
        }
        if (goingUp <= 7) {
            // goingUp is always 100
            return -1 ;
        } else {                      }
        double slyNess ;
        slyNess = goingUp - goingDown;
        
        double sneakY = 100/6 ;
        
        double gettingCought ;
        gettingCought = (Math.PI* slyNess * sneakY);
        throw new BossEncounterControlException("Can determine encounter"
                                               + goingUp + "," + goingDown
                                               + " because you are being sneaky"
                                               + " the bounds og the map");
    }
}