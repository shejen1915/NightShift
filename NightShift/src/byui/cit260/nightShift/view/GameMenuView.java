/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.nightShift.view;

import byui.cit260.nightShift.control.GameControl;
import byui.cit260.nightShift.model.InventoryItem;

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
                + "\n Q - Return to Main Menu     ");
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
        case "V": // Travel to new location
            this.ImTheMapView();
            break;
        case "Q": // R - Return to Main Menu
            this.MainMenuView();
            break;
        case "I": // I - Show me them items
            this.InventoryView();
            break;
            case "C": // I - Show me them items
            this.QuestCompleted();
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

    private void InventoryView() {
        // get the sorted list of inventory items for the current game
        InventoryItem[] inventory = GameControl.getSortedInventoryList();
       
        System.out.println("\nList of Inventory");
        System.out.println("Description" + "\t" +
                            "Required" + "\t" +
                            "In Stock");
        // for each inventory item
        for (InventoryItem inventoryItem : inventory ) {
            //DISPLAY the description, the required amount and amount in stock
            System.out.println(inventoryItem.getDescription()+ "\t " +
                               inventoryItem.getRequiredAmount()+ "\t"
            );
                               // + inventoryItem.getQuantityInStock());
        }
    }

    private void ImTheMapView() {
     System.out.println("*** ImTheMapView stub function called ***");
    }
     private void QuestCompleted() {
     System.out.println("*** ImTheMapView stub function called ***");
    }
    
}