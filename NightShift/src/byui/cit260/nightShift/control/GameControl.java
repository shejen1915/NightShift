/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.nightShift.control;

import byui.cit260.nightShift.exceptions.GameControlException;
import byui.cit260.nightShift.model.Game;
import byui.cit260.nightShift.model.InventoryItem;
import byui.cit260.nightShift.model.InventoryItem.ItemType;
import byui.cit260.nightShift.model.Map;
import byui.cit260.nightShift.model.Pillar;
import byui.cit260.nightShift.model.Player;
import byui.cit260.nightShift.model.RegularScene;
import byui.cit260.nightShift.model.Window;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import nightshift.NightShift;

/**
 *
 * @author Ni shi shei
 */
public class GameControl {

    private static String filepath;
    

    
    public static void createNewGame (Player player)
                            throws GameControlException {
        //System.out.println("\n*** createNewGame stub function called ***");
        
        Game game = new Game(); //create new game
        NightShift.setCurrentGame(game); // save in NightShift
        
        game.setPlayer(player); // save player in game
        
        //create the inventory list and save in the game
        InventoryItem[] inventoryList = GameControl.createInventoryList();
        game.setInventory(inventoryList);
        
        //create or call enum of Locked Items (items that you can interact with but 
        //cannot be taken and put in your inventory: e.g. doors, pillar, window, 
        
        
        
        Pillar pillar = new Pillar(); // create new pillar
        game.setPillar(pillar); // save pillar in game
        
        Window window = new Window(); // create new window
        game.setWindow(window); // save window in game
        
        Map map = MapControl.createMap(); // create and initialize new Map
        game.setMap(map); // save map in game
        
        // move actors to starting position in the map
        MapControl.moveActorToStartingLocation(map);
    }
    

    public static Player createPlayer(String name) 
                                throws GameControlException {
        /*if (name == null) {
            return null;
        }
        
        
        if (name == null) {
            throw new GameControlException("Cannot enter a blank name");
        }
        */
        Player player = new Player();
        player.setName(name);
        

        NightShift.setPlayer(player); // save the player
        
        return player;
    }

    private static InventoryItem[] createInventoryList() {
        // created array(list) of inventory items
        InventoryItem[] inventory =
            new InventoryItem[3];
        
        InventoryItem charm = new InventoryItem();
        charm.setDescription("Charm");
        charm.setRequiredAmount(0);
        inventory[ItemType.charm.ordinal()] = charm;
        
        InventoryItem weapon = new InventoryItem();
        weapon.setDescription("Weapon");
        weapon.setQuanityInStock(0);
        weapon.setRequiredAmount(0);
        inventory[ItemType.weapon.ordinal()] = weapon;
        
        InventoryItem special = new InventoryItem();
        special.setDescription("Special Item");
        special.setRequiredAmount(0);
        inventory[ItemType.special.ordinal()] = special;
        
        return inventory;
    }

    static void assignScenesToLocation(Map map, RegularScene[] scenes) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static InventoryItem[] getSortedInventoryList() {
   System.out.println("\n*** getSortedInventoryList stub function called ***");
    return null;
    }
    public static void saveGame(Game game, String filepath)
            throws GameControlException {
        try( FileOutputStream fops = new FileOutputStream(filepath)) {
            ObjectOutputStream output = new ObjectOutputStream(fops);
            
            output.writeObject(game); //write the game object out to file
        }
        catch(Exception e) {
            throw new GameControlException(e.getMessage());
        }
    }

    public static void getExistingGame(String filePath) 
                        throws GameControlException {
            Game game = null;
        
        try( FileInputStream fips = new FileInputStream(filepath)) {
            ObjectInputStream input = new ObjectInputStream(fips);
            
            game = (Game) input.readObject(); //read the game object from 
        }
        catch(Exception e) {
            throw new GameControlException(e.getMessage());
        }
        //close the output file
        NightShift.setCurrentGame(game);// save in NightShift
    }}
