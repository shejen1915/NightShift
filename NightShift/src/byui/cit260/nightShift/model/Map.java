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
import nightshift.NightShift;

/**
 *
 * @author Ni shi shei
 */
public class Map implements Serializable{
    
    private int floorNumber;
    private int roomNumber;
    private Location[][] locations;
    //wed april, 13 1:30 appointment with doctor remington

    public Map() {
    }
    
    
    public Map(int floorNumber, int roomNumber) {
        if (floorNumber < 1 || roomNumber < 1) {
            System.out.println("\nFloor number and room number must be greater"
                    + "than zero");
            return;

        }
        
        this.floorNumber = floorNumber;
        this.roomNumber = roomNumber;
 
        
        // create a 2-D array for Location objects
        this.locations = new Location[floorNumber][roomNumber];
        
        for (int floor = 0; floor < floorNumber; floor++) {
            for(int room = 0; room < roomNumber; room++) {
            // create and initialize new Location object instance
            Location location = new Location();
            location.setRoom(room);
            location.setFloor(floor);
            location.setVisited(false);
            
            // assign the Location object to the current position in array
            locations[floor][room] = location;
                
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
        Collections.shuffle(rooms);
        int randomRoom = rooms.get(0);
        this.locations[floor][randomRoom].getItems().add(NightShift.getCurrentGame().getInventroyItems()[0]);
        
        randomRoom = rooms.get(1);
        this.locations[floor][randomRoom].getItems().add(NightShift.getCurrentGame().getInventroyItems()[1]);
        
        randomRoom = rooms.get(2);
        this.locations[floor][randomRoom].getItems().add(NightShift.getCurrentGame().getInventroyItems()[2]);

        floor = 1;
        Collections.shuffle(rooms);
        randomRoom = rooms.get(0);
        this.locations[floor][randomRoom].getItems().add(NightShift.getCurrentGame().getInventroyItems()[3]);
        
        randomRoom = rooms.get(1);
        this.locations[floor][randomRoom].getItems().add(NightShift.getCurrentGame().getInventroyItems()[4]);
        
        randomRoom = rooms.get(2);
        this.locations[floor][randomRoom].getItems().add(NightShift.getCurrentGame().getInventroyItems()[5]);
        
        floor = 2;
        Collections.shuffle(rooms);
        randomRoom = rooms.get(0);
        this.locations[floor][randomRoom].getItems().add(NightShift.getCurrentGame().getInventroyItems()[6]);
        
        randomRoom = rooms.get(1);
        this.locations[floor][randomRoom].getItems().add(NightShift.getCurrentGame().getInventroyItems()[7]);
        
        randomRoom = rooms.get(2);
        this.locations[floor][randomRoom].getItems().add(NightShift.getCurrentGame().getInventroyItems()[8]);
       
        floor = 3;
        Collections.shuffle(rooms);
        randomRoom = rooms.get(0);
        this.locations[floor][randomRoom].getItems().add(NightShift.getCurrentGame().getInventroyItems()[9]);
        
        randomRoom = rooms.get(1);
        this.locations[floor][randomRoom].getItems().add(NightShift.getCurrentGame().getInventroyItems()[10]);
        
        randomRoom = rooms.get(2);
        this.locations[floor][randomRoom].getItems().add(NightShift.getCurrentGame().getInventroyItems()[11]);
        
        floor = 4;
        Collections.shuffle(rooms);
        randomRoom = rooms.get(0);
        this.locations[floor][randomRoom].getItems().add(NightShift.getCurrentGame().getInventroyItems()[12]);
        
        randomRoom = rooms.get(1);
        this.locations[floor][randomRoom].getItems().add(NightShift.getCurrentGame().getInventroyItems()[13]);
        
        randomRoom = rooms.get(2);
        this.locations[floor][randomRoom].getItems().add(NightShift.getCurrentGame().getInventroyItems()[14]);
        
        floor = 5;
        Collections.shuffle(rooms);
        randomRoom = rooms.get(0);
        this.locations[floor][randomRoom].getItems().add(NightShift.getCurrentGame().getInventroyItems()[15]);
        
        randomRoom = rooms.get(1);
        this.locations[floor][randomRoom].getItems().add(NightShift.getCurrentGame().getInventroyItems()[16]);
        
        randomRoom = rooms.get(2);
        this.locations[floor][randomRoom].getItems().add(NightShift.getCurrentGame().getInventroyItems()[17]);
        
        floor = 6;
        Collections.shuffle(rooms);
        randomRoom = rooms.get(0);
        this.locations[floor][randomRoom].getItems().add(NightShift.getCurrentGame().getInventroyItems()[18]);
        
        randomRoom = rooms.get(1);
        this.locations[floor][randomRoom].getItems().add(NightShift.getCurrentGame().getInventroyItems()[19]);
        
        randomRoom = rooms.get(2);
        this.locations[floor][randomRoom].getItems().add(NightShift.getCurrentGame().getInventroyItems()[20]);
        
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

    public Location[][] getLocations() {
        return locations;
    }

    public void setLocations(Location[][] locations) {
        this.locations = locations;
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
