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
public class InventoryView extends View{

    public InventoryView() {
           super("\n"
                + "\n----------------------------------------"
                + "\n| What item would you like:           |"
                + "\n      " + "item.getName function"//+ item.getName()
                + ""                
                + "\n|                                      |"
                + "\n----------------------------------------"
                + "\nI - Item info (Description)             "
                + "\nA - Action item                         "
                + "\nJ - Mission item                        "
                + "\nS - Special item                        "
                + "\nM - Go to Main Menu                     "
                + "\nQ - I'm Out!(Quit)                      "
                + "\n----------------------------------------");
    }

@Override
    public boolean doAction(String value) {
        value = value.toUpperCase();
        
        switch (value) {
        case "I": // item information or description
            this.itemDescription();
            break;
        case "A": // use action item
            this.actionItem();
            break;
        case "J": // use mission item
            this.missionItem();
            break;
        case "S": // use special item
            this.specialItem();
            break;
        case "M": // go to Main Menu
            this.MainMenuView();
            break;
        case "Q": // Q - Quit (what will this do? for now it goes to Main Menu)
            this.MainMenuView();
            break;
        default:
            System.out.println("\n*** Invalid selection *** Try again");
            break;
    }        
        return false;
    }


    private void itemDescription() {
            System.out.println("\n***Called itemDescription function***");
    }

    private void actionItem() {
            System.out.println("\n***Called actionItem function***");
    }

    private void missionItem() {
            System.out.println("\n***Called missionItem function***");
    }
    private void specialItem() {
            System.out.println("\n***Called specialItem function***");
    }
    private void MainMenuView() {
        MainMenuView mainMenu = new MainMenuView();
        mainMenu.display();
    }
    
}