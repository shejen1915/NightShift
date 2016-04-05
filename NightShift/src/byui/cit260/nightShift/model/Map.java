/*
 * To chance this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.nightShift.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 *
 * @author Ni shi shei
 */
public class Map implements Serializable{
    
    private int floorNumber;
    private int roomNumber;
    private int dimensionNumber;
    private Location[][][] locations;

    public Map() {
    }
    
    public Map(int floorNumber, int roomNumber, int dimensionNumber) {
        if (floorNumber < 1 || roomNumber < 1) {
            System.out.println("\nFloor number and room number must be greater"
                    + "than zero");
            return;
            //How do I incorporate the dimension into the user interaction since
            //it was supposed to be drinking the right potion that switches your 
            //dimension
        }
        
        this.floorNumber = floorNumber;
        this.roomNumber = roomNumber;
        this.dimensionNumber = dimensionNumber;
        
        // create a 2-D array for Location objects
        this.locations = new Location[floorNumber][roomNumber][dimensionNumber];
        
        for (int floor = 0; floor < floorNumber; floor++) {
            for(int room = 0; room < roomNumber; room++) {
                for(int dimension = 0; dimension < dimensionNumber; dimension++) {
            // create and initialize new Location object instance
            Location location = new Location();
            location.setRoom(room);
            location.setFloor(floor);
            location.setDimension(dimension);
            location.setVisited(false);
            
            // assign the Location object to the current position in array
            locations[floor][room][dimension] = location;
                }
            }
        }
    }
    
    
    
    public void assignCharmsToLocations() {
        
       
        ArrayList<Integer> rooms = new ArrayList<>();
        
        for (int i = 0; i < 4; i++) {
            rooms.add(i);
        }
        
        ArrayList<CharmItem> charms = new ArrayList<CharmItem>();
        CharmItem[] charsArray = CharmItem.values();
        for (CharmItem charmItem : charsArray) {
            charms.add(charmItem);
        }
        
        Collections.shuffle(charms);
        
        int floor = 0;
        int dimension = 0;
        Collections.shuffle(rooms);
        int randomRoom = rooms.get(0);
        this.locations[floor][randomRoom][dimension].setCharmItem(charms.get(0));
        
        randomRoom = rooms.get(1);
        this.locations[floor][randomRoom][dimension].setCharmItem(charms.get(1));
        
        randomRoom = rooms.get(2);
        this.locations[floor][randomRoom][dimension].setCharmItem(charms.get(2));

        floor = 1;
        dimension = 0;
        Collections.shuffle(rooms);
        randomRoom = rooms.get(0);
        this.locations[floor][randomRoom][dimension].setCharmItem(charms.get(3));
        
        randomRoom = rooms.get(1);
        this.locations[floor][randomRoom][dimension].setCharmItem(charms.get(4));
        
        randomRoom = rooms.get(2);
        this.locations[floor][randomRoom][dimension].setCharmItem(charms.get(5));
        
        floor = 2;
        dimension = 0;
        Collections.shuffle(rooms);
        randomRoom = rooms.get(0);
        this.locations[floor][randomRoom][dimension].setCharmItem(charms.get(6));
        
        randomRoom = rooms.get(1);
        this.locations[floor][randomRoom][dimension].setCharmItem(charms.get(7));
        
        randomRoom = rooms.get(2);
        this.locations[floor][randomRoom][dimension].setCharmItem(charms.get(8));
       
        floor = 3;
        dimension = 0;
        Collections.shuffle(rooms);
        randomRoom = rooms.get(0);
        this.locations[floor][randomRoom][dimension].setCharmItem(charms.get(9));
        
        randomRoom = rooms.get(1);
        this.locations[floor][randomRoom][dimension].setCharmItem(charms.get(10));
        
        randomRoom = rooms.get(2);
        this.locations[floor][randomRoom][dimension].setCharmItem(charms.get(11));
        
        floor = 4;
        dimension = 0;
        Collections.shuffle(rooms);
        randomRoom = rooms.get(0);
        this.locations[floor][randomRoom][dimension].setCharmItem(charms.get(12));
        
        randomRoom = rooms.get(1);
        this.locations[floor][randomRoom][dimension].setCharmItem(charms.get(13));
        
        randomRoom = rooms.get(2);
        this.locations[floor][randomRoom][dimension].setCharmItem(charms.get(14));        
        
        floor = 5;
        dimension = 0;
        Collections.shuffle(rooms);
        randomRoom = rooms.get(0);
        this.locations[floor][randomRoom][dimension].setCharmItem(charms.get(15));
        
        randomRoom = rooms.get(1);
        this.locations[floor][randomRoom][dimension].setCharmItem(charms.get(16));
        
        randomRoom = rooms.get(2);
        this.locations[floor][randomRoom][dimension].setCharmItem(charms.get(17));        
        
        floor = 6;
        dimension = 0;
        Collections.shuffle(rooms);
        randomRoom = rooms.get(0);
        this.locations[floor][randomRoom][dimension].setCharmItem(charms.get(18));
        
        randomRoom = rooms.get(1);
        this.locations[floor][randomRoom][dimension].setCharmItem(charms.get(19));
        
        randomRoom = rooms.get(2);
        this.locations[floor][randomRoom][dimension].setCharmItem(charms.get(20));        
        
    }
    
        public static void assignScenesToLocation(Map map, RegularScene[] scenes) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            
    }
        
        public static void moveActorToStartingLocation(Map map) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.

    }
    
/*
    public Map(int i, int i0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
*/
    public int getFloorNumber() {
        return floorNumber;
    }

    public void setFloorNumber(int floorNumber) {
        this.floorNumber = floorNumber;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public Location[][][] getLocations() {
        return locations;
    }

    public void setLocations(Location[][][] locations) {
        this.locations = locations;
    }

    public int getDimensionNumber() {
        return dimensionNumber;
    }

    public void setDimensionNumber(int dimensionNumber) {
        this.dimensionNumber = dimensionNumber;
    }


   

    
    
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 31 * hash + (int) (Double.doubleToLongBits(this.floorNumber) ^ (Double.doubleToLongBits(this.floorNumber) >>> 32));
        hash = 31 * hash + (int) (Double.doubleToLongBits(this.roomNumber) ^ (Double.doubleToLongBits(this.roomNumber) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Map other = (Map) obj;
        if (Double.doubleToLongBits(this.floorNumber) != Double.doubleToLongBits(other.floorNumber)) {
            return false;
        }
        if (Double.doubleToLongBits(this.roomNumber) != Double.doubleToLongBits(other.roomNumber)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Map{" + "floorNumber=" + floorNumber + ", roomNumber=" + roomNumber + '}';
    }
    
    
    
}
