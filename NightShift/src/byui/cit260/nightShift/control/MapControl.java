/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.nightShift.control;

import byui.cit260.nightShift.model.Map;
import byui.cit260.nightShift.model.RegularScene;

/**
 *
 * @author Ni shi shei
 */
public class MapControl {
    
    public static Map createMap() {
        // create the map
        Map map = new Map(20, 20);
        
        // create a list of the differet scenes in the game
        RegularScene[] scenes = createScenes();
        
        //assign the different scenes to locations in the map
        GameControl.assignScenesToLocation(map, scenes);
        
        return map;
}

    public static RegularScene[] createScenes() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    static void moveActorToStartingLocation(Map map) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
