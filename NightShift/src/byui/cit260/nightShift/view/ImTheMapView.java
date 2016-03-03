/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.nightShift.view;

/**
 *
 * @author Ni shi shei
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

/**
 *
 * @author Silver
 */
public class ImTheMapView {
        private String menu;
    public ImTheMapView() {
        this.menu = "\n"
                + "\n----------------------------------------"
                + "\n|  ImTheMap                            |"
                + "\n----------------------------------------"
                + "\nR - Roof                                "
                + "\nM - Melalucre                           "
                + "\nS - Sammy's                             "
                + "\nB - Cocoa Bean                          "
                + "\nK - The Kraze                           "
                + "\nC - The Cross Roads                     "
                + "\nF - Fight Club                          "
                + "\nA - Return to Room Menu                 "
                + "\nQ - I'm Out!(Return)                    "
                + "\n----------------------------------------";
    }

    public void displayImTheMapView() {

        boolean done = false; // set flag to not done
        do {
            // prompt for map level
           String imTheMapOption = this.getImTheMapOption();
            if (imTheMapOption.toUpperCase().equals("Q")) {
                return; // exit the game
            }

            // do the requested action and display the next view
            done = this.doAction(imTheMapOption);

        } while (!done);
    }
    private String getImTheMapOption() {
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
        case "R": // To the roof!
            this.ToDroof();
            break;
        case "M": // Melaleuca
            this.MelaMagic();
            break;
        case "S": // Sammy's 
            this.PieShake();
            break;
        case "B": // The CoCoa Bean
            this.CupCake();
            break;
        case "K": // The Craze
            this.LazerTag();
            break;
        case "C": // Cross Roads
            this.PeopleWatching();
            break;
        case "F": // Fight Club
            this.FirstRule();
            break;
        case "A": // return to Room Menu
            this.EnterRoomView();
            break;
        default:
            System.out.println("\n*** Invalid selection *** Try again");
            break;
    }
    
    return false;
}

    private void ToDroof() {
            System.out.println("\n*** You have enter the roof function ***");
    }

    private void MelaMagic() {
            System.out.println("\n*** You have entered the Melaleuca function***");
    }

    private void PieShake() {
            System.out.println("\n*** You have entered the Sammy's function***");
    }

    private void CupCake() {
            System.out.println("\n*** You have entered the Cocoa Bean function***");
    }

    private void LazerTag() {
            System.out.println("\n*** You have entered The Kraze function***");
    }

    private void PeopleWatching() {
            System.out.println("\n*** You have entered the Cross Roads function***");
    }

    private void FirstRule() {
            System.out.println("\n*** You have enterd the Fight Club function***");
    }

    private void EnterRoomView() {
        EnterRoomView enterRoom = new EnterRoomView();
        enterRoom.display();
    }

    
}
