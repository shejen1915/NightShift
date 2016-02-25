/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.nightShift.view;

/**
 *
 * @author Silver
 */
public class ExistingGameView {

   public void displayExistingGames() {
     
       boolean done = false; // set flag to not done
        do {
            // prompt for and get players name
            String existingGameOption = this.getExistingGameOption();
            if (existingGameOption.toUpperCase().equals("G")) //user want previous
                return; // exit the game
            

            // do the requested action and display the next view
            done = this.doAction(existingGameOption);

        } while (!done);
    }

    private String getExistingGameOption() {
        System.out.println("\n*** getExistingGameOption() function called ***");
       return "N";
   }
    private boolean doAction(String existingGameOption) { 
        System.out.println("\n*** doAction() function called ***)");
        return true;
    } }
