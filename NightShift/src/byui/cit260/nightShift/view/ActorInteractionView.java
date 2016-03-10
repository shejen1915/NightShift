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
public class ActorInteractionView extends View {
   public ActorInteractionView() {


        super("\n"
                + "\n----------------------------------------"
                + "\n| Actor Interaction Menu               |"
                + "\n----------------------------------------"
                + "\nS - Start a conversation                "
                + "\nC - Turn this person into a Companion   "
                + "\nD - Drop companion                      "
                + "\nQ - Return to Help Menu                 "
                + "\nG - Say Goodbye and return to Gameplay  "
                + "\n----------------------------------------");
    }
    
/*
    public void displayActorInteractionView(){
        boolean done = false; //set flag to not done
        do{
            //prompt for choice from player
            String actorInteractionOption = this.getActorInteractionOption();
            if (actorInteractionOption.toUpperCase().equals("N"))// user doesn't want to interact with actor
                return; // exit interaction
            
            // do the requested action and display the next view
            done = this.doAction(actorInteractionOption);
            
        } while (!done);
    }

    private String getActorInteractionOption() {
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
/*
    private boolean doAction(String actorInteraction) {
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
        
        value = value.toUpperCase();
        
        switch (value) {
            case "S": // start conversation unique to actor
                this.startConversation();
                break;
            case "C": // have actor join you as a companion
                this.joinCompanion();
                break;
            case "D": // leave companion
                this.dropCompanion();
                break;
            case "Q": // Return to Help Menu
                this.HelpMenuView();
                break;
            case "G": // say goodbye and leave conversation
                this.leaveConversation();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
        return false;
    }

    private void startConversation() {
        
        System.out.println("\n*** startConversation function has been called***");
    }

    private void joinCompanion() {
        
        System.out.println("\n*** joinCompanion function has been called ***");
    }

    private void leaveConversation() {
           
        System.out.println("\n *** leaveConversation and go to GamePlay "
                + "function has been called***");
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
    }

    private void dropCompanion() {
        System.out.println("\n*** dropCompanion function called***");
    }

    private void HelpMenuView() {
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.display();
    }
    
}
