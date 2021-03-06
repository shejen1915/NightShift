/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.nightShift.view;

import byui.cit260.nightShift.control.GameControl;
import byui.cit260.nightShift.exceptions.GameControlException;
import byui.cit260.nightShift.model.Player;
import java.util.Scanner;

/**
 *
 * @author Ni shi shei
 */
    
public class StartProgramView extends View {
    
    //private String promptMessage;
    
    public StartProgramView() {
        super("\n***********************************************************                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          "
       +"\n                                                           "
       +"\n                      NIGHT SHIFT                          "
       +"\n You are Victor a twenty something year old college student"
       +"\n who is working shifts in the local mall in order to pay   "
       +"\n for college. You will be going home for your track in a   "
       +"\n week and so this is your last day at the JOB and honestly "
       +"\n you simply want your shift to end so that you can go home."
       +"\n Your Manager can be really annoying and enjoys forcing    "
       +"\n you to work. For that reason you are trying to outsmart   "
       +"\n him. There are many rooms in the mall, and this is your   "
       +"\n last day, so make the most of it! But becareful to not get"
       +"\n to careless. Now go make this night shift fun!            "         
       +"\n***********************************************************"
       + "\nPlease enter your name: ");
       
        
    }

    


    
    @Override
    public boolean doAction(String value) {
        // if the lenth of the playersName < 2 then 
            // display "Invalid name: The name must be > 1 character"
            // return false
            
        // create Player with specified name
        // if unsuccessful then
            // display "Invalid name: The name is too short"
            // return false
            // display next view
            
            
        // display customized welcome message
        // display mainMenuView        
        // return true
        /*
        if (value.length() < 2) {
            this.console.println("\nInvalid players name: " + 
                    "The name must be greater than one character in lenth");
            return false;
        }
        */
        //call createPlayer() control function
        Player player = null;
        /*
        Player player = GameControl.createPlayer(value);
        
        if (player == null) {
            ErrorView.display("StartProgramView", "\nError creating the player.");
            return false;
        }
*/
        
        try {
        player = GameControl.createPlayer(value);
        } catch (GameControlException me) {
            System.out.println(me.getMessage());
        }
        
        /*
        if (player == null) { // if unsuccessful
            System.out.println("\nError creating the player.");
            return false;
        }
*/
        this.displayNextView(player);
        return true;
        
    }


    private void displayNextView(Player player) {
        System.out.println("\n========================================="
                           +"\n Welcome to the game " + player.getName() + "!"
                           +"\n We hope you have a lot of fun!"
                           +"\n========================================"
                            );
        //create MainMenuView object
        MainMenuView mainMenuView = new MainMenuView();
                
        //Display the main menu view
        mainMenuView.display();
    }
    
}
