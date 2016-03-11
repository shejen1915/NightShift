/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.nightShift.control;

import byui.cit260.nightShift.model.Player;
import nightshift.NightShift;

/**
 *
 * @author Ni shi shei
 */
public class GameControl {
    
    public static void createNewGame (Player player) {
        //System.out.println("\n*** createNewGame stub function called ***");
        
        Game game = new Game(); //create new game
        NightShift.setCurrentGame(game); // save in NightShift
        
        game.setPlayer(player); // save player in game
        
        //create the inventory list and save in the game
        InventoryItem[] inventoryList = GameControl.createInventoryList();
        game.setInventory(inventoryList);
        
        Map map = MapControl.createMap(); // create and initialize new Map
        game.setMap(map); // save map in game
        
        // move actors to starting position in the map
        MapControl.moveActorToStartingLocation(map);
    }
    

    public static Player createPlayer(String name) {
        if (name == null) {
            return null;
        }
        
        Player player = new Player();
        player.setName(name);
        
        NightShift.setPlayer(player); // save the player
        
        return player;
    }
   
}
