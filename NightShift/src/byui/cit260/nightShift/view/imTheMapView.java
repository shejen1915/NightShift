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
public class imTheMapView {
        private String menu;
    void displayimTheMapMenu() {
        this.menu = "\n"
                + "\n----------------------------------------"
                + "\n|  Map Menu                            |"
                + "\n----------------------------------------"
                + "\nR - Roof                                "
                + "\nM - Melalucre                           "
                + "\nS - Sammy's                             "
                + "\nB - Cocoa Bean                          "
                + "\nK - The Kraze                           "
                + "\nC - The Cross Roads                     "
                + "\nF - Fight Club                          "
                + "\nQ - I'm Out!(Return)                      "
                + "\n----------------------------------------";
    }

    public void displayimTheMapView() {

        boolean done = false; // set flag to not done
        do {
            // prompt for map level
           String menuOption = this.getMenuOption();
            if (menuOption.toUpperCase().equals("Q")) {
                return; // exit the game
            }

            // do the requested action and display the next view
            done = this.doAction(menuOption);

        } while (!done);
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
            this.toDroof();
            break;
        case "M": // Melaleuca
            this.melaMagic();
            break;
        case "S": // Sammy's 
            this.pieShake();
            break;
        case "B": // The CoCoa Bean
            this.cupCake();
            break;
        case "K": // The Craze
            this.lazerTag();
            break;
        case "C": // Cross Roads
            this.peopleWatching();
            break;
        case "F": // Fight Club
            this.firstRule();
            break;
        default:
            System.out.println("\n*** Invalid selection *** Try again");
            break;
    }
    
    return false;
}

    private void toDroof() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void melaMagic() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void pieShake() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void cupCake() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void lazerTag() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void peopleWatching() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void firstRule() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private String getMenuOption() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    }
    

