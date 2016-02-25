/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.nightShift.view;

import byui.cit260.nightShift.control.GameControl;
import byui.cit260.nightShift.model.Player;
import java.util.Scanner;

/**
 *
 * @author Ni shi shei
 */
    
public class StartProgramView {
    
    private String promptMessage;
    
    public StartProgramView() {
        
        this.promptMessage = "\nPlease enter your name: ";
        this.displayBanner();
        
    }

    private void displayBanner() {
        
    System.out.println(
        "\n***********************************************************"
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
        );
    }

    public void displayStartProgramView() {
        /*
        do
            Prompt for and get the players name
            if (playersName == "Q") then exit
        
            do the action and display the next view
        while the action is not successful
        */
        boolean done = false; // set flag to not done
        do {
            // prompt for and get players name
            String playersName = this.getPlayersName();
            if (playersName.toUpperCase().equals("Q")) // user wants to quit
                return; // exit the game
            
            // do the requested action and display the next view
            done = this.doAction(playersName);
            
        } while (!done);
    }

    private String getPlayersName() {
        /*
        WHILE valid value has not been entered
            DISPLAY promptMessage
            GET the value entered from the keboard
             Trim front and trailing blanks off of the name
        
            IF the length of the value is blank THEN
                DISPLAY "Invalid value: The value cannot be blank"
                CONTINUE
            ENDIF
        
            BREAK
        
        ENDWHILE
        RETURN name
        */
        Scanner keyboard = new Scanner(System.in); // get infile for keyboard
        String value = ""; // value to be returned
        boolean valid = false; // initialize to not valid
        
        while (!valid) { // loop while an invalid value is entered
            System.out.println("\n" + this.promptMessage);
            
            value = keyboard.nextLine(); // get next line typed on keyboard
            value = value.trim(); // trim off leading and trailing blanks
            
            if (value.length() < 1) { // value is blank
                System.out.println("\nInvalid value: value cannot be blank");
                continue;
            }
            
            break; // end the loop
        }
        
        return value; // return the value entered
        
            
        
    }

    private boolean doAction(String playersName) {
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
        
        if (playersName.length() < 2) {
            System.out.println("\nInvalid players name: " + 
                    "The name must be greater than one character in lenth");
            return false;
        }
        
        //call createPlayer() control function
        Player player = GameControl.createPlayer(playersName);
        
        if (player == null) { // if unsuccessful
            System.out.println("\nError creating the player.");
            return false;
        }
        this.displayNextView(player);
        return true;
        
    }


    private void displayNextView(Player player) {
        System.out.println("\n========================================="
                           +"\n Welcome to the game " + player.getName()
                           +"\n We hope you have a lot of fun!"
                           +"\n========================================"
                            );
        //create MainMenuView object
        MainMenuView mainMenuView = new MainMenuView();
                
        //Display the main menu view
        mainMenuView.displayMainMenuView();
    }
    
}
