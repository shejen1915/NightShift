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
public class ImTheMapView extends View{
    
    public ImTheMapView() {
        super("\n"
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
                + "\nQ - I'm Out!(Return)                      "
                + "\n----------------------------------------");
    }

  

 
    @Override
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
        default:
            System.out.println("\n*** Invalid selection *** Try again");
            break;
    }
    
    return false;
}

    private void ToDroof() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void MelaMagic() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void PieShake() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void CupCake() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void LazerTag() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void PeopleWatching() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void FirstRule() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
