/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.nightShift.view;

import byui.cit260.nightShift.control.GameControl;
import java.util.Scanner;
import nightshift.NightShift;

/**
 *
 * @author Ni shi shei
 */
public class MainMenuView {

    private String menu;

    public MainMenuView() {
        this.menu = "\n"
                + "\n----------------------------------------"
                + "\n| Main Menu                            |"
                + "\n----------------------------------------"
                + "\nN - Unto a New Adventure!               "
                + "\nG - Get and start saved game            "
                + "\nH - I Need Help!                        "
                + "\nS - Take a Nap(Save)                    "
                + "\nQ - I'm Out!(Quit)                      "
                + "\n----------------------------------------";
    }

    public void displayMainMenuView() {
            
    
            boolean done = false; // set flag to not done
        do {
            // prompt for and get players name
            String menuOption = this.getMenuOption();
            if (menuOption.toUpperCase().equals("Q")) {
                return; // exit the game
            }

            // do the requested action and display the next view
            done = this.doAction(menuOption);

        } while (!done);
    }

    private String getMenuOption() {
        /*
        System.out.println("\n*** getMenuOption() function called ***");
        return "N";
        
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
            System.out.println("\n" + this.menu);
            
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
   

    public boolean doAction(String choice) {
        //System.out.println("\n*** doAction() function called ***");
        //return true;
    //private boolean doAction(String playersName) {
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
        
        
        choice = choice.toUpperCase();
        
        switch (choice) {
        case "N": // create and start a new game
            this.startNewGame();
            break;
        case "G": // get and start an existing game
            this.startExistingGame();
            break;
        case "H": // display the help menu
            this.displayHelpMenu();
            break;
        case "S": // save the current game
            this.saveGame();
            break;
        default:
            System.out.println("\n*** Invalid selection *** Try again");
            break;
    }
    
    return false;
}
        
        //call createPlayer() control function
        /*
        Player player = GameControl.createPlayer(playersName);
        
        if (player == null) { // if unsuccessful
            System.out.println("\nError creating the player.");
            return false;
        }
        
        this.displayNextView(player);
        */

    private void startNewGame() {
            // create a new game
        GameControl.createNewGame(NightShift.getPlayer());
                
        //display the game menu
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.displayMenu();
    }

    private void startExistingGame() {
        ExistingGameView existingGame = new ExistingGameview();
        existingGame.displayExistingGames();
    }

    private void displayHelpMenu() {
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.displayHelpMenuView();
    }

    private void saveGame() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static class ExistingGameview extends ExistingGameView {

        public ExistingGameview() {
        }
    }
        
    }
/*
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

    private Object toUpperCase() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
*/
