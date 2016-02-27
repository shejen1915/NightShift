/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.nightShift.view;

import java.util.Scanner;

/**
 *
 * @author Ni shi shei
 */
public class HelpMenuView {
        private String menu;
   public HelpMenuView() {


        this.menu = "\n"
                + "\n----------------------------------------"
                + "\n| Help Menu                            |"
                + "\n----------------------------------------"
                + "\nG - The Quest?!                         "
                + "\nM - How to Move                         "
                + "\nE - Collect Items                       "
                + "\nH - Use Items                           "
                + "\nD - Map Locations                       "
                + "\nT - Talk to NPC Actor simulation        "
                + "\nI - Item interaction simulation         "
                + "\nQ - I'm Out!(Quit)                      "
                + "\n----------------------------------------";
    }

    public void displayHelpMenuView() {

        boolean done = false; // set flag to not done
        do {
            // prompt for and get players name
            String helpMenuOption = this.getHelpMenuOption();
            if (helpMenuOption.toUpperCase().equals("Q")) {
                return; // exit the game
            }

            // do the requested action and display the next view
            done = this.doAction(helpMenuOption);

        } while (!done);
    }

    private String getHelpMenuOption() {
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
   

    private boolean doAction(String choice) {
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
        case "G": // what is your Quest?!
            this.questDescription();
            break;
        case "M": // how to move
            this.happyFeet();
            break;
        case "E": // collect Items
            this.packrat();
            break;
        case "H": // use items
            this.userAndAbuser();
            break;
        case "D": // map locations
            this.ImTheMapView();
            break;
        case "T": // temporary simulation of an interaction with an npc actor
            this.ActorInteractionView();
            break;
        case "I": // temporary simulation of an interaction with an item
            this.ItemInteractionView();
            break;
        default:
            System.out.println("\n*** Invalid selection *** Try again");
            break;
    }
    
    return false;
}

    private void questDescription() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void happyFeet() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void packrat() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void userAndAbuser() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void ImTheMapView() {
      ImTheMapView imTheMap = new ImTheMapView();
        imTheMap.displayImTheMapView();
    }
/*
    void displayHelpMenu() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
*/

    private void ActorInteractionView() {
        ActorInteractionView actorInteraction = new ActorInteractionView();
        actorInteraction.displayActorInteractionView();
    }

    private void ItemInteractionView() {
        ItemInteractionView itemInteraction = new ItemInteractionView();
        itemInteraction.displayItemInteractionView();
    }
}
