/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.nightShift.control;

import byui.cit260.nightShift.exceptions.GhostEncounterControlException;

/**
 *
 * @author Ni shi shei
 */
public class GhostEncounterControl {
    public static void calcGhostEncounterProbability(double collectedItems, double collectableItems, double numberOfCharms, double superstitious, double unsuperstitious) 
                            throws GhostEncounterControlException {
        //declared variables
        double charmPoints = 1;
        
        double stair = 100;
        
        
	if (stair != 100) {
           
        }
        
	if (collectedItems < 0 || collectedItems > 5) {
           
        }
        
	if(charmPoints < 0 || charmPoints > 10) {
      
        }    
        

        double itemBonus = ((collectedItems/collectableItems)/2) * 100;
            //collectedItemBonus = ((collectedItems/possibleCollectedItems) / 2) * 100
            
        double charmBonus = ((numberOfCharms * charmPoints)/2) * 100;
            //charmPoints = ((numberOfCharms * charmItemPoints)/2) *100
                
        double probability = stair - itemBonus - superstitious - unsuperstitious - charmBonus;
            //ghostEncounterProbability = 100 – collectedItemBonus – (superstitiousCompanion OR unsuperstitiousCompanion) – (charmPoints)
            throw new GhostEncounterControlException("I am so scared "
                                                     + itemBonus + "," + charmBonus + "," + probability
                                                     + "Because I may have done this wrong"
                                                     + "so it may not work.");
    }

}
