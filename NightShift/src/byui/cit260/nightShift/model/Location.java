/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.nightShift.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Silver
 */
public class Location implements Serializable{
    
    // instance variables
   private String floor;
   private String room;
   private String visited;
   private String itemsRemaining;

    public Location() {
    }

    /**
     *
     * @return
     */
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 73 * hash + Objects.hashCode(this.floor);
        hash = 73 * hash + Objects.hashCode(this.room);
        hash = 73 * hash + Objects.hashCode(this.visited);
        hash = 73 * hash + Objects.hashCode(this.itemsRemaining);
        return hash;
    }

    @Override
    public String toString() {
        return "Location{" + "floor=" + floor + ", room=" + room + ", visited=" + visited + ", itemsRemaining=" + itemsRemaining + '}';
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
        final Location other = (Location) obj;
        if (!Objects.equals(this.floor, other.floor)) {
            return false;
        }
        if (!Objects.equals(this.room, other.room)) {
            return false;
        }
        if (!Objects.equals(this.visited, other.visited)) {
            return false;
        }
        return Objects.equals(this.itemsRemaining, other.itemsRemaining);
    }

   
   
    public String getFloor() {
        return floor;
    }

    public void setFloor(String floor) {
        this.floor = floor;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public String getVisited() {
        return visited;
    }

    public void setVisited(String visited) {
        this.visited = visited;
    }

    public String getItemsRemaining() {
        return itemsRemaining;
    }

    public void setItemsRemaining(String itemsRemaining) {
        this.itemsRemaining = itemsRemaining;
    }
   
   
    
}