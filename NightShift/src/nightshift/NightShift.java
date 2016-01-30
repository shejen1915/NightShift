/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nightshift;

import byui.cit260.nightShift.model.Actor;
import byui.cit260.nightShift.model.AttackItem;
import byui.cit260.nightShift.model.CharmItem;
import byui.cit260.nightShift.model.Game;
import byui.cit260.nightShift.model.InventoryItem;
import byui.cit260.nightShift.model.Map;
import byui.cit260.nightShift.model.Player;
import byui.cit260.nightShift.model.ToolItem;

/**
 *
 * @author Ni shi shei
 */
public class NightShift {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Player playerOne = new Player();
        
        playerOne.setName("Vlad Impaler");
        playerOne.setHighScore(7.00);
        
        String playerInfo = playerOne.toString();
        System.out.println(playerInfo);
        
        
        Game gameOne = new Game();
        
        gameOne.setScore(8.00);
        gameOne.setStartTime(9.00);
        
        String gameInfo = gameOne.toString();
        System.out.println(gameInfo);
        
        
        Map mapOne = new Map();
        
        mapOne.setFloorNumber(3);
        mapOne.setRoomNumber(02);
        
        String mapInfo = mapOne.toString();
        System.out.println(mapInfo);
        
        
        InventoryItem inventoryItemOne = new InventoryItem();
        
        inventoryItemOne.setItemName("Amazing Tiki Man");
        inventoryItemOne.setInventoryType("Charm");
        inventoryItemOne.setEquipStatus("Equiped");
        inventoryItemOne.setQuanityInStock(1);
        inventoryItemOne.setQuantityUncollected(0);
        
        String inventoryItemInfo = inventoryItemOne.toString();
        System.out.println(inventoryItemInfo);
        
        
        ToolItem toolItemOne = new ToolItem();
        
        toolItemOne.setAbility("Tie");
        toolItemOne.setMapLocation("Room 302");
        
        String toolItemInfo = toolItemOne.toString();
        System.out.println(toolItemInfo);
        
        
        CharmItem charmItemOne = new CharmItem();
        
        charmItemOne.setDefenseBoost(15);
        charmItemOne.setMapLocation("Room 405");
        
        String charmItemInfo = charmItemOne.toString();
        System.out.println(charmItemInfo);
        
        
        AttackItem attackItemOne = new AttackItem();
        
        attackItemOne.setAttack(15);
        attackItemOne.setMapLocation("Room 207");
        
        String attackItemInfo = attackItemOne.toString();
        System.out.println(attackItemInfo);
        
        
        Actor actorOne = new Actor();
        
        actorOne.setName("Jack Black");
        actorOne.setDescription("Janitor");
        actorOne.setStartLocation("Room 401");
        actorOne.setInteractionBonus(15);
        actorOne.setInteractionPenalty(-15);
        
        String actorInfo = actorOne.toString();
        System.out.println(actorInfo);
    }
    
}
