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
public abstract class View implements ViewInterface {
    
    public String displayMessage;
    
    protected final BufferedReader keyboard = NightShift.getInFile();
    protected final PrintWriter console = NightShift.getOutFile();
    
    public View() {
    }
    
    public View(String message) {
        this.displayMessage = message;
    }
    
    @Override 
    public void display() {
           String value;
        boolean done = false; // set flag to not done
        do {
            // prompt for and get players name
            this.console.println(this.message);
            value = this.getInput(); // user wants to quit
            
            // do the requested action and display the next view
            done = this.doAction(value);
            
        } while (!done); // exit the view when done == true
    }
    
    @Override
    public String getInput() {

        Scanner keyboard = new Scanner(System.in); // get infile for keyboard
        boolean valid = false; // initialize to not valid
        String selection = null; // value to be returned
        
        while (!valid) { // loop while valid input has not been retrieved
            
            // prompt for the player's name
            System.out.println("\n" + this.displayMessage);
            
            select = keyboard.readLine(); // get next line typed on keyboard
            select = selection.trim(); // trim off leading and trailing blanks
            
            if (selection.length() < 1) { // value is blank
                System.out.println("\n*** Invalid value: value cannot be blank ***");
                continue;
            }
            
            break; // end the loop
        }
    } catch (Exception e) {
        System.out.println("Error reading input: " + e.getMessage());
}   
        return selection; // return the value entered
        
            
        
    }
}
