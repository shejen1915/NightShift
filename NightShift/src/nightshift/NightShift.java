/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nightshift;

import byui.cit260.nightShift.model.Actor;
import byui.cit260.nightShift.model.AttackItem;
import byui.cit260.nightShift.model.BossEncounter;
import byui.cit260.nightShift.model.BossScareScene;
import byui.cit260.nightShift.model.CharmItem;
import byui.cit260.nightShift.model.Game;
import byui.cit260.nightShift.model.GhostBusterScene;
import byui.cit260.nightShift.model.GhostEncounter;
import byui.cit260.nightShift.model.GoOutWindow;
import byui.cit260.nightShift.model.InventoryItem;
import byui.cit260.nightShift.model.Location;
import byui.cit260.nightShift.model.Map;
import byui.cit260.nightShift.model.Player;
import byui.cit260.nightShift.model.RegularScene;
import byui.cit260.nightShift.model.ToolItem;
import byui.cit260.nightShift.model.UpDown;
import byui.cit260.nightShift.view.StartProgramView;

/**
 *
 * @author Ni shi shei
 */
public class NightShift {

    /**
     * @param args the command line arguments
     */
    private static Game currentGame = null;
    private static Player player = null;
    
    public static void main(String[] args) {
        
        StartProgramView startProgramView = new StartProgramView();
        try {
        startProgramView.display();
        }catch (Throwable te) {
            System.out.println(te.getMessage());
            te.printStackTrace();
            startProgramView.display();
        }
    }

    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        NightShift.currentGame = currentGame;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        NightShift.player = player;
    }
    
}
    /** SHOULD I REALLY DELETE ALL THIS?
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
        mapOne.setRoomNumber(2);
        
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
        
        
        BossScareScene bossScareSceneOne = new BossScareScene();
        
        bossScareSceneOne.setCallBoss("Boss, can you come down here for a sec?");
        bossScareSceneOne.setSummonGhost("You summon the Ghost.");
        bossScareSceneOne.setBossEncounterNullify("Congrats, your Boss has gone home early");
        
        String bossScareSceneInfo = bossScareSceneOne.toString();
        System.out.println(bossScareSceneInfo);
        
        
        BossEncounter bossEncounterOne = new BossEncounter();
        
        bossEncounterOne.setBossEquation("Boss Equation");
        
        String bossEncounterInfo = bossEncounterOne.toString();
        System.out.println(bossEncounterInfo);
        
        
        GhostBusterScene ghostBusterSceneOne = new GhostBusterScene();
        
        ghostBusterSceneOne.setCallGhost("Are you out there?");
        ghostBusterSceneOne.setTrapGhost("Gotcha! You have acquired the Ghost.");
        ghostBusterSceneOne.setGhostEncounterNullify("Congrats, you will no longer run into the Ghost.");
        
        String ghostBusterSceneInfo = ghostBusterSceneOne.toString();
        System.out.println(ghostBusterSceneInfo);
        
        
        GhostEncounter ghostEncounterOne = new GhostEncounter();
        
        ghostEncounterOne.setGhostEquation("Ghost Equation");
        
        String ghostEncounterInfo = ghostEncounterOne.toString();
        System.out.println(ghostEncounterInfo);
        
        
        GoOutWindow goOutWindowOne = new GoOutWindow();
        
        goOutWindowOne.setWindowEquation("Would you like to go out the Window?");
        goOutWindowOne.setRequiresRope("You need a rope.");
        goOutWindowOne.setGainGhostBuster("You have found the Ghost Buster!");
        
        String goOutWindowInfo = goOutWindowOne.toString();
        System.out.println(goOutWindowInfo);
        
                
        Location locationOne = new Location();
        
        locationOne.setFloor("Floor 2");
        locationOne.setRoom("Room 3");
        locationOne.setVisited("Rooms 1 & 2 on this floor have been visited.");
        locationOne.setItemsRemaining("There are 5 undiscovered items on this floor.");
        
        String locationInfo = locationOne.toString();
        System.out.println(locationInfo);
        
        
        RegularScene regularSceneOne = new RegularScene();
        
        regularSceneOne.setDescription("Dragon's Cave");
        regularSceneOne.setLockedStatus("Unlocked");
        regularSceneOne.setDoorUnlockItem("None");
        regularSceneOne.setActorStatus("Princess");
        regularSceneOne.setCounterpart("Sammy's");
        regularSceneOne.setSceneItems("Club, Gold Statue, Magic Necklace, Magic Potion.");
        
        String regularSceneInfo = regularSceneOne.toString();
        System.out.println(regularSceneInfo);
        
        
        UpDown upDownOne = new UpDown();
        
        upDownOne.setGoUp("Go up?");
        upDownOne.setGoDown("Go down?");
        
        String upDownInfo = upDownOne.toString();
        System.out.println(upDownInfo);
    }    
    */

     
