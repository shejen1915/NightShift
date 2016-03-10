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
public class ItemInteractionView extends View {
    
        public ItemInteractionView(){

        super("\n"
                + "\n----------------------------------------"
                + "\n|   Take-able Item Interaction Menu    |"
                + "\n----------------------------------------"
                + "\nX - Interact with Item                  "
                + "\nI - see item Information                "
                + "\nT - Take item and put in inventory      "
                + "\nY - Use Item                            "
                + "\nQ - Return to Help Menu                 "
                + "\n----------------------------------------");
        }
        
      /*
  
        this.otherMenu = "\n"
                + "\n----------------------------------------"
                + "\n|   Untake-able Item Interaction Menu   "
                + "\n----------------------------------------"
                + "\nX - Interact with item                  "
                + "\nY - User item                           "
                + "\nI - see item Information                "
                + "\nL - Leave menu                          "
                + "\n----------------------------------------";
    }
    
       
        private String promptMessage;

        public ItemInteractionView(){
            this.promptMessage = "\nYou see an item. Interact with item, yes[X] or no[N]?";
    }
    
    public void displayItemInteractionView(){
        boolean done = false; //set flag to not done
        do{
            //prompt for choice from player
            String itemInteractionChoice = this.getItemInteractionChoice();
            if (itemInteractionChoice.toUpperCase().equals("N"))// user doesn't want to interact with item
                return; // exit interaction
            
            // do the requested action and display the next view
            done = this.doAction(itemInteractionChoice);
            
        } while (!done);
    }

    private String getItemInteractionChoice() {
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
        */
/*
    private boolean doAction(String itemInteraction) {
        System.out.println("\n*** doAction function called***");
        return true;
    }
*/
/*
    public String getInput() {
        
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
*/ 
       public boolean doAction(String value) {
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
        
        
        value = value.toUpperCase();
        
        switch (value) {
        case "X": // what is your Quest?!
            this.itemInteraction();
            break;
        case "I": // how to move
            this.itemInfo();
            break;
        case "T": // use items
            this.takeItem();
            break;
        case "Y": // map locations
            this.useItem();
            break;
        case "Q": // Return to Help Menu
            this.HelpMenuView();
            break;
        default:
            System.out.println("\n*** Invalid selection *** Try again");
            break;
    }
    
    return false;
}

    private void itemInteraction() {
        System.out.println("\n*** itemInteraction function called***");
    }

    private void itemInfo() {
        System.out.println("\n***itemInfo function called***");
    }

    private void takeItem() {
        System.out.println("\n***takeItem function called***");
    }

    private void useItem() {
        System.out.println("\n***useItem function called***");
    }

    private void HelpMenuView() {
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.display();
    }
}