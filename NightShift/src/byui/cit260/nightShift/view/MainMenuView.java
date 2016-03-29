/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.nightShift.view;

import byui.cit260.nightShift.control.GameControl;
import byui.cit260.nightShift.exceptions.GameControlException;
import java.util.Scanner;
import nightshift.NightShift;

/**
 *
 * @author Ni shi shei
 */
public class MainMenuView extends View {

    public MainMenuView() {
        super("\n"
                + "\n----------------------------------------"
                + "\n| Main Menu                            |"
                + "\n----------------------------------------"
                + "\nN - Unto a New Adventure!               "
                + "\nG - Get and start saved game            "
                + "\nH - I Need Help!                        "
                + "\nS - Take a Nap(Save)                    "
                + "\nQ - I'm Out!(Quit)                      "
                + "\n----------------------------------------");
    }
/*
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
   */
    @Override
    public boolean doAction(String value) {
     
        value = value.toUpperCase(); // convert to all upper case
        char choice = value.charAt(0);
        switch (value) {
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
            ErrorView.display("MainMenuView",
                    "*** Invalid selection *** Try again");
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
            try {
        GameControl.createNewGame(NightShift.getPlayer());
            } catch (GameControlException me) {
                System.out.println(me.getMessage());
            }
                
        //display the game menu? 
        /*
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
        */
        StartProgramView startProgram = new StartProgramView();
        startProgram.display();
    }

    private void startExistingGame() {
        ExistingGameView existingGame = new ExistingGameview();
        existingGame.display();
    }

    private void displayHelpMenu() {
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.display();
    }

    private void saveGame() {
        //prompt for and get the name of the file to save the game in
        this.console.println("\n\nEnter the file path for file where the game "
                            + "is to be saved.");
        String filePath = this.getInput();
        
        try { 
            // save the game to the speciried file
            GameControl.saveGame(NightShift.getCurrentGame(), filePath);
          } catch (Exception ex){
              ErrorView.display("MainMenuView", ex.getMessage());
          }
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
