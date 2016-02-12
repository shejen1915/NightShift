/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.nightShift.control;

/**
 *
 * @author Ni shi shei
 */
public class GhostEncounterControl {
    public double calcGhostEncounterProbability(double collectedItems, double collectableItems, double numberOfCharms, double superstitious, double unsuperstitious) {

        //declared variables
        double charmPoints = 1;
        
        double stair = 100;
        
        
	if (stair != 100) {
            return -1;
        }
        
	if (collectedItems < 0 || collectedItems > 5) {
            return -1;
        }
        
	if(charmPoints < 0 || charmPoints > 10) {
            return -1;
        }    
        

        double itemBonus = ((collectedItems/collectableItems)/2) * 100;
            //collectedItemBonus = ((collectedItems/possibleCollectedItems) / 2) * 100
            
        double charmBonus = ((numberOfCharms * charmPoints)/2) * 100;
            //charmPoints = ((numberOfCharms * charmItemPoints)/2) *100
                
        double probability = stair - itemBonus - superstitious - unsuperstitious - charmBonus;
            //ghostEncounterProbability = 100 – collectedItemBonus – (superstitiousCompanion OR unsuperstitiousCompanion) – (charmPoints)
            return probability;
    }

}
