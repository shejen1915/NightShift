/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.nightShift.control;

import byui.cit260.nightShift.model.Actor;
import byui.cit260.nightShift.model.Map;
import byui.cit260.nightShift.model.Point;
import byui.cit260.nightShift.model.RegularScene;
import nightshift.NightShift;

/**
 *
 * @author Ni shi shei
 */
public class MapControl {
    
    public static Map createMap() {
        // create the map
        Map map = new Map(9, 5);
        
        // create a list of the differet scenes in the game
        //Scene[] scenes = createScenes();
        
                RegularScene[] alternateScenes = createAlternateScenes();

        RegularScene[] scenes = createScenes(alternateScenes);
        
        
        
        //assign the different scenes to locations in the map
        MapControl.assignScenesToLocation(map, scenes);
        
        return map;
}

    public static RegularScene[] createScenes(RegularScene[] alternateScenes) {
        
        RegularScene[] regularScene =
                new RegularScene[37];
                        
                        /*
                + "\nR - Roof            5 scenes             "
                + "\nM - Melalucre        5                   "
                + "\nS - Sammy's           5                  "
                + "\nB - Cocoa Bean         5                 "
                + "\nK - The Kraze           5                "
                + "\nC - The Cross Roads      5               "
                + "\nF - Fight Club            5
                stairs 6 or just 1
                elevator 5 or just 1
        
               private String description;
       private String lockedStatus;
       private String doorUnlockItem;
       private String actorStatus;
       private String counterpart;
       private String sceneItems;
                        */
        RegularScene roof = new RegularScene();
        roof.setDescription("Roof Desription");
        roof.setLockedStatus("Locked status: UNLOCKED");
        roof.setDoorUnlockItem("Key");
        roof.setAlternateScene(alternateScenes[0]);
        
        RegularScene roofNorth = new RegularScene();
        roofNorth.setDescription("roofNorth Desription");
        roofNorth.setLockedStatus("Locked status: UNLOCKED");
        
        RegularScene roofSouth = new RegularScene();
        roofSouth.setDescription("roofSouth Desription");
        roofSouth.setLockedStatus("Locked status: UNLOCKED");
        
        RegularScene roofEast = new RegularScene();
        roofEast.setDescription("roofEast Desription");
        roofEast.setLockedStatus("Locked status: UNLOCKED");
        
        RegularScene roofWest = new RegularScene();
        roofWest.setDescription("roofWest Desription");
        roofWest.setLockedStatus("Locked status: UNLOCKED");
        
        RegularScene melalucre = new RegularScene();
        melalucre.setDescription("Melalucre Desription");
        melalucre.setLockedStatus("Locked status: LOCKED until you get the key");
        melalucre.setDoorUnlockItem("Key");
        
        RegularScene melalucreNorth = new RegularScene();
        melalucreNorth.setDescription("melalucreNorth Desription");
        melalucreNorth.setLockedStatus("Locked status: UNLOCKED");
        
        RegularScene melalucreSouth = new RegularScene();
        melalucreSouth.setDescription("melalucreSouth Desription");
        melalucreSouth.setLockedStatus("Locked status: UNLOCKED");
        
        RegularScene melalucreEast = new RegularScene();
        melalucreEast.setDescription("melalucreEast Desription");
        melalucreEast.setLockedStatus("Locked status: UNLOCKED");
        
        RegularScene melalucreWest = new RegularScene();
        melalucreWest.setDescription("melalucreWest Desription");
        melalucreWest.setLockedStatus("Locked status: UNLOCKED");
        
        RegularScene sammys = new RegularScene();
        sammys.setDescription("Sammy's Desription");
        sammys.setLockedStatus("Locked status: LOCKED until you get the key");
        sammys.setDoorUnlockItem("Key");
        
        RegularScene sammysNorth = new RegularScene();
        sammysNorth.setDescription("sammysNorth Desription");
        sammysNorth.setLockedStatus("Locked status: UNLOCKED");
        
        RegularScene sammysSouth = new RegularScene();
        sammysSouth.setDescription("sammysSouth Desription");
        sammysSouth.setLockedStatus("Locked status: UNLOCKED");
        
        RegularScene sammysEast = new RegularScene();
        sammysEast.setDescription("sammysEast Desription");
        sammysEast.setLockedStatus("Locked status: UNLOCKED");
        
        RegularScene sammysWest = new RegularScene();
        sammysWest.setDescription("sammysWest Desription");
        sammysWest.setLockedStatus("Locked status: UNLOCKED");
        
        RegularScene cocoaBean = new RegularScene();
        cocoaBean.setDescription("Cocoa Bean Desription");
        cocoaBean.setLockedStatus("Locked status: LOCKED until you get the key");
        cocoaBean.setDoorUnlockItem("Key");
        
        RegularScene cocoaBeanNorth = new RegularScene();
        cocoaBeanNorth.setDescription("cocoaBeanNorth Desription");
        cocoaBeanNorth.setLockedStatus("Locked status: UNLOCKED");
        
        RegularScene cocoaBeanSouth = new RegularScene();
        cocoaBeanSouth.setDescription("cocoaBeanSouth Desription");
        cocoaBeanSouth.setLockedStatus("Locked status: UNLOCKED");
        
        RegularScene cocoaBeanEast = new RegularScene();
        cocoaBeanEast.setDescription("cocoaBeanEast Desription");
        cocoaBeanEast.setLockedStatus("Locked status: UNLOCKED");
        
        RegularScene cocoaBeanWest = new RegularScene();
        cocoaBeanWest.setDescription("cocoaBeanWest Desription");
        cocoaBeanWest.setLockedStatus("Locked status: UNLOCKED");
        
        RegularScene theKraze = new RegularScene();
        theKraze.setDescription("The Kraze Desription");
        theKraze.setLockedStatus("Locked status: LOCKED until you get the key");
        theKraze.setDoorUnlockItem("Key");
        
        RegularScene theKrazeNorth = new RegularScene();
        theKrazeNorth.setDescription("theKrazeNorth Desription");
        theKrazeNorth.setLockedStatus("Locked status: UNLOCKED");
        
        RegularScene theKrazeSouth = new RegularScene();
        theKrazeSouth.setDescription("theKrazeSouth Desription");
        theKrazeSouth.setLockedStatus("Locked status: UNLOCKED");
        
        RegularScene theKrazeEast = new RegularScene();
        theKrazeEast.setDescription("theKrazeEast Desription");
        theKrazeEast.setLockedStatus("Locked status: UNLOCKED");
        
        RegularScene theKrazeWest = new RegularScene();
        theKrazeWest.setDescription("theKrazeWest Desription");
        theKrazeWest.setLockedStatus("Locked status: UNLOCKED");
        
        RegularScene crossRoads = new RegularScene();
        crossRoads.setDescription("The Cross Roads Desription");
        crossRoads.setLockedStatus("Locked status: LOCKED until you get the key");
        crossRoads.setDoorUnlockItem("Key");
        
        RegularScene crossRoadsNorth = new RegularScene();
        crossRoadsNorth.setDescription("crossRoadsNorth Desription");
        crossRoadsNorth.setLockedStatus("Locked status: UNLOCKED");
        
        RegularScene crossRoadsSouth = new RegularScene();
        crossRoadsSouth.setDescription("crossRoadsSouth Desription");
        crossRoadsSouth.setLockedStatus("Locked status: UNLOCKED");
        
        RegularScene crossRoadsEast = new RegularScene();
        crossRoadsEast.setDescription("crossRoadsEast Desription");
        crossRoadsEast.setLockedStatus("Locked status: UNLOCKED");
        
        RegularScene crossRoadsWest = new RegularScene();
        crossRoadsWest.setDescription("crossRoadsWest Desription");
        crossRoadsWest.setLockedStatus("Locked status: UNLOCKED");
        
        RegularScene fightClub = new RegularScene();
        fightClub.setDescription("Fight Club Desription");
        fightClub.setLockedStatus("Locked status: LOCKED until you get the key");
        fightClub.setDoorUnlockItem("Key");
        
        RegularScene fightClubNorth = new RegularScene();
        fightClubNorth.setDescription("fightClubNorth Desription");
        fightClubNorth.setLockedStatus("Locked status: UNLOCKED");
        
        RegularScene fightClubSouth = new RegularScene();
        fightClubSouth.setDescription("fightClubSouth Desription");
        fightClubSouth.setLockedStatus("Locked status: UNLOCKED");
        
        RegularScene fightClubEast = new RegularScene();
        fightClubEast.setDescription("fightClubEast Desription");
        fightClubEast.setLockedStatus("Locked status: UNLOCKED");
        
        RegularScene fightClubWest = new RegularScene();
        fightClubWest.setDescription("fightClubWest Desription");
        fightClubWest.setLockedStatus("Locked status: UNLOCKED");
        
        RegularScene stairs = new RegularScene();
        stairs.setDescription("Stairs Desription");
        stairs.setLockedStatus("Locked status: LOCKED until you get the key");
        stairs.setDoorUnlockItem("Key");
        
        RegularScene elevator = new RegularScene();
        elevator.setDescription("Elevator Desription");
        elevator.setLockedStatus("Locked status: LOCKED until you get the key");
        elevator.setDoorUnlockItem("Key");
        
        return regularScene;
    }
    
    public static RegularScene[] createAlternateScenes() {
        RegularScene[] alternateScenes =
                new RegularScene[37];
        
        RegularScene roof = new RegularScene();
        roof.setDescription("Roof Description");
        roof.setLockedStatus("Locked status: ?");
        roof.setDoorUnlockItem("Key");
        alternateScenes[0] = roof;
        
         RegularScene roofNorth = new RegularScene();
        roofNorth.setDescription("roofNorth Desription");
        roofNorth.setLockedStatus("Locked status: UNLOCKED");
        
        RegularScene roofSouth = new RegularScene();
        roofSouth.setDescription("roofSouth Desription");
        roofSouth.setLockedStatus("Locked status: UNLOCKED");
        
        RegularScene roofEast = new RegularScene();
        roofEast.setDescription("roofEast Desription");
        roofEast.setLockedStatus("Locked status: UNLOCKED");
        
        RegularScene roofWest = new RegularScene();
        roofWest.setDescription("roofWest Desription");
        roofWest.setLockedStatus("Locked status: UNLOCKED");
        
        RegularScene melalucre = new RegularScene();
        melalucre.setDescription("Melalucre Desription");
        melalucre.setLockedStatus("Locked status: LOCKED until you get the key");
        melalucre.setDoorUnlockItem("Key");
        
        RegularScene melalucreNorth = new RegularScene();
        melalucreNorth.setDescription("melalucreNorth Desription");
        melalucreNorth.setLockedStatus("Locked status: UNLOCKED");
        
        RegularScene melalucreSouth = new RegularScene();
        melalucreSouth.setDescription("melalucreSouth Desription");
        melalucreSouth.setLockedStatus("Locked status: UNLOCKED");
        
        RegularScene melalucreEast = new RegularScene();
        melalucreEast.setDescription("melalucreEast Desription");
        melalucreEast.setLockedStatus("Locked status: UNLOCKED");
        
        RegularScene melalucreWest = new RegularScene();
        melalucreWest.setDescription("melalucreWest Desription");
        melalucreWest.setLockedStatus("Locked status: UNLOCKED");
        
        RegularScene sammys = new RegularScene();
        sammys.setDescription("Sammy's Desription");
        sammys.setLockedStatus("Locked status: LOCKED until you get the key");
        sammys.setDoorUnlockItem("Key");
        
        RegularScene sammysNorth = new RegularScene();
        sammysNorth.setDescription("sammysNorth Desription");
        sammysNorth.setLockedStatus("Locked status: UNLOCKED");
        
        RegularScene sammysSouth = new RegularScene();
        sammysSouth.setDescription("sammysSouth Desription");
        sammysSouth.setLockedStatus("Locked status: UNLOCKED");
        
        RegularScene sammysEast = new RegularScene();
        sammysEast.setDescription("sammysEast Desription");
        sammysEast.setLockedStatus("Locked status: UNLOCKED");
        
        RegularScene sammysWest = new RegularScene();
        sammysWest.setDescription("sammysWest Desription");
        sammysWest.setLockedStatus("Locked status: UNLOCKED");
        
        RegularScene cocoaBean = new RegularScene();
        cocoaBean.setDescription("Cocoa Bean Desription");
        cocoaBean.setLockedStatus("Locked status: LOCKED until you get the key");
        cocoaBean.setDoorUnlockItem("Key");
        
        RegularScene cocoaBeanNorth = new RegularScene();
        cocoaBeanNorth.setDescription("cocoaBeanNorth Desription");
        cocoaBeanNorth.setLockedStatus("Locked status: UNLOCKED");
        
        RegularScene cocoaBeanSouth = new RegularScene();
        cocoaBeanSouth.setDescription("cocoaBeanSouth Desription");
        cocoaBeanSouth.setLockedStatus("Locked status: UNLOCKED");
        
        RegularScene cocoaBeanEast = new RegularScene();
        cocoaBeanEast.setDescription("cocoaBeanEast Desription");
        cocoaBeanEast.setLockedStatus("Locked status: UNLOCKED");
        
        RegularScene cocoaBeanWest = new RegularScene();
        cocoaBeanWest.setDescription("cocoaBeanWest Desription");
        cocoaBeanWest.setLockedStatus("Locked status: UNLOCKED");
        
        RegularScene theKraze = new RegularScene();
        theKraze.setDescription("The Kraze Desription");
        theKraze.setLockedStatus("Locked status: LOCKED until you get the key");
        theKraze.setDoorUnlockItem("Key");
        
        RegularScene theKrazeNorth = new RegularScene();
        theKrazeNorth.setDescription("theKrazeNorth Desription");
        theKrazeNorth.setLockedStatus("Locked status: UNLOCKED");
        
        RegularScene theKrazeSouth = new RegularScene();
        theKrazeSouth.setDescription("theKrazeSouth Desription");
        theKrazeSouth.setLockedStatus("Locked status: UNLOCKED");
        
        RegularScene theKrazeEast = new RegularScene();
        theKrazeEast.setDescription("theKrazeEast Desription");
        theKrazeEast.setLockedStatus("Locked status: UNLOCKED");
        
        RegularScene theKrazeWest = new RegularScene();
        theKrazeWest.setDescription("theKrazeWest Desription");
        theKrazeWest.setLockedStatus("Locked status: UNLOCKED");
        
        RegularScene crossRoads = new RegularScene();
        crossRoads.setDescription("The Cross Roads Desription");
        crossRoads.setLockedStatus("Locked status: LOCKED until you get the key");
        crossRoads.setDoorUnlockItem("Key");
        
        RegularScene crossRoadsNorth = new RegularScene();
        crossRoadsNorth.setDescription("crossRoadsNorth Desription");
        crossRoadsNorth.setLockedStatus("Locked status: UNLOCKED");
        
        RegularScene crossRoadsSouth = new RegularScene();
        crossRoadsSouth.setDescription("crossRoadsSouth Desription");
        crossRoadsSouth.setLockedStatus("Locked status: UNLOCKED");
        
        RegularScene crossRoadsEast = new RegularScene();
        crossRoadsEast.setDescription("crossRoadsEast Desription");
        crossRoadsEast.setLockedStatus("Locked status: UNLOCKED");
        
        RegularScene crossRoadsWest = new RegularScene();
        crossRoadsWest.setDescription("crossRoadsWest Desription");
        crossRoadsWest.setLockedStatus("Locked status: UNLOCKED");
        
        RegularScene fightClub = new RegularScene();
        fightClub.setDescription("Fight Club Desription");
        fightClub.setLockedStatus("Locked status: LOCKED until you get the key");
        fightClub.setDoorUnlockItem("Key");
        
        RegularScene fightClubNorth = new RegularScene();
        fightClubNorth.setDescription("fightClubNorth Desription");
        fightClubNorth.setLockedStatus("Locked status: UNLOCKED");
        
        RegularScene fightClubSouth = new RegularScene();
        fightClubSouth.setDescription("fightClubSouth Desription");
        fightClubSouth.setLockedStatus("Locked status: UNLOCKED");
        
        RegularScene fightClubEast = new RegularScene();
        fightClubEast.setDescription("fightClubEast Desription");
        fightClubEast.setLockedStatus("Locked status: UNLOCKED");
        
        RegularScene fightClubWest = new RegularScene();
        fightClubWest.setDescription("fightClubWest Desription");
        fightClubWest.setLockedStatus("Locked status: UNLOCKED");
        
        RegularScene stairs = new RegularScene();
        stairs.setDescription("Stairs Desription");
        stairs.setLockedStatus("Locked status: LOCKED until you get the key");
        stairs.setDoorUnlockItem("Key");
        
        RegularScene elevator = new RegularScene();
        elevator.setDescription("Elevator Desription");
        elevator.setLockedStatus("Locked status: LOCKED until you get the key");
        elevator.setDoorUnlockItem("Key");
        
        return alternateScenes;
    }
/*
    public static int moveActorToStartingLocation(Actor actor, Point coordinates) {
        
        Map map = NightShift.getCurrentGame().getMap();
        int newFloor = coordinates.x-1;
        int newRoom = coordinates.y-1;
        
        if (newFloor < 0 || newFloor >= map.getFloorNumber() ||
            newRoom < 0 || newRoom >= map.getRoomNumber()) {
            return -1;
        }
        return 0;
    }
*/
    /*
    static void moveActorToStartingLocation(Map map) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
*/
    
            public static void assignScenesToLocation(Map map, RegularScene[] scenes) {
            //locations[0][0].getActors().add("actor name")
            /*
                OldJoe("He is your mentor"),
    CleaningLady("Love Interest"),
    GuyFromRoom6("Creeper"),
    KyleTheIntern("KyleTheDragonSlayer!"),
    CocoaBeanClerk("Wants Change Not Money"),
    Daniel("Dang Daniel!"),
    Dude("Radical!"),
    It("Don't question the gender"),
    AmandaHugginKiss("In love with you"),
    Seamor("The Earl"),
    KevinVanNord("Model"),
    Minion("Banana"),
    Hippy("Free the potatas!"),
    BruceTheDog("Cats are friends not food"),
    Caitlin("A spunky loud mouth"),
    Brutus("He is trying to steal stuff"),
    Vlad("He never sleeps"),
    KeyserSoza("Fashionista from India");
            */
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            
    }
        
        public static void moveActorToStartingLocation(Map map) {
        //locations[0][0].getItems().add(game.getInventoryItems()[0]
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
