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
public class GameMenuView extends View {
    
    public GameMenuView() {
        super("\n"
                + "\n-----------------------------"
                + "\n| Game Menu                 |"
                + "\n-----------------------------"
                + "\n This is the Game Menu       "
                + "\n R - Return to Main Menu     ");
    }
    
    /*
    void displayMenu() {
        System.out.println("\n*** displayMenu stub function called ***");
    }
*/
    @Override
    public boolean doAction(String value) {
        value = value.toUpperCase(); //convert to all upper case
        
        value = value.toUpperCase();
        
        switch (value) {
        case "R": // R - Return to Main Menu
            this.MainMenuView();
            break;
            default:
            System.out.println("\n*** Invalid selection *** Try again");
            break;
        }
        return false;
    
    
}

    private void MainMenuView() {
        MainMenuView mainMenu = new MainMenuView();
        mainMenu.display();
    }
}