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
    }    }
     
