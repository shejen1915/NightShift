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
public class MapControl {
    
    private static Map createMap() {
        // create the map
        Map map = new Map(20, 20);
        
        // create a list of the differet scenes in the game
        Scene[] scenes = createScenes();
        
        //assign the different scenes to locations in the map
        GameControl.assignScenesToLocation(map, scenes);
        
        return map;
}}
