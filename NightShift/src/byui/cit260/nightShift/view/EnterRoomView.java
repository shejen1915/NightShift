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
public class EnterRoomView extends View{

    public EnterRoomView() {
        super("\n"
                + "\n----------------------------------------"
                + "\n| You have just entered the:           |"
                + "\n      " + "room.getName function"//+ room.getName()
                + ""                
                + "\n|                                      |"
                + "\n----------------------------------------"
                + "\nI - Room Info (Description)             "
                + "\nN - Move North                          "
                + "\nE - Move East                           "
                + "\nS - Move South                          "
                + "\nW - Move West                           "
                + "\nD - Map                                 "
                + "\nM - Go to Main Menu                     "
                + "\nQ - I'm Out!(Quit)                      "
                + "\n----------------------------------------");
    }
    
    @Override
    public boolean doAction(String value) {
        value = value.toUpperCase();
        
        switch (value) {
        case "I": // room information or description
            this.roomDescription();
            break;
        case "N": // move North
            this.moveNorth();
            break;
        case "E": // move East
            this.moveEast();
            break;
        case "S": // move South
            this.moveSouth();
            break;
        case "W": // move West
            this.moveWest();
            break;            
        case "D": // map locations
            this.ImTheMapView();
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


    private void roomDescription() {
            System.out.println("\n***Called roomDescription function***");
    }

    private void moveNorth() {
            System.out.println("\n***Called moveNorth function***");
    }

    private void moveEast() {
            System.out.println("\n***Called moveEast function***");
    }

    private void moveSouth() {
            System.out.println("\n***Called moveSouth function***");
    }

    private void moveWest() {
            System.out.println("\n***Called moveWest function***");
    }

    private void ImTheMapView() {
      ImTheMapView imTheMap = new ImTheMapView();
        imTheMap.display();
    }

    private void MainMenuView() {
        MainMenuView mainMenu = new MainMenuView();
        mainMenu.display();
    }
    
}
