/*
 * To chance this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.nightShift.model;

import java.io.Serializable;

/**
 *
 * @author Ni shi shei
 */
public class Map implements Serializable{
    
    private int floorNumber;
    private int roomNumber;
    private Location[][] locations;

    public Map() {
    }
    
    public Map(int floorNumber, int roomNumber) {
        if (floorNumber < 1 || roomNumber < 1) {
            System.out.println("\nFloor number and room number must be greater than zero");
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
