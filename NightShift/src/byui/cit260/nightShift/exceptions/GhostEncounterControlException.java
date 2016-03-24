/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.nightShift.exceptions;

/**
 *
 * @author Silver
 */
public class GhostEncounterControlException extends Exception{

    public GhostEncounterControlException() {
    }

    public GhostEncounterControlException(String string) {
        super(string);
    }

    public GhostEncounterControlException(String string, Throwable thrwbl) {
        super(string, thrwbl);
    }

    public GhostEncounterControlException(Throwable thrwbl) {
        super(thrwbl);
    }

    public GhostEncounterControlException(String string, Throwable thrwbl, boolean bln, boolean bln1) {
        super(string, thrwbl, bln, bln1);
    }
    
}
