/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.nightShift.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;
import javafx.scene.Scene;

/**
 *
 * @author Silver
 */
public class Location implements Serializable{
    
    // instance variables
   private int floor;
   private int room;
   private boolean visited;
   private int itemsRemaining;
   private Scene scene;
   private ArrayList<Actor> actors;
   private CharmItem charItem;

    public Location() {
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public int getRoom() {
        return room;
    }

    public void setRoom(int room) {
        this.room = room;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public int getItemsRemaining() {
        return itemsRemaining;
    }

    public void setItemsRemaining(int itemsRemaining) {
        this.itemsRemaining = itemsRemaining;
    }

    public Scene getScene() {
        return scene;
    }

    public void setScene(Scene scene) {
        this.scene = scene;
    }

    public ArrayList<Actor> getActors() {
        return actors;
    }

    public void setActors(ArrayList<Actor> actors) {
        this.actors = actors;
    }

    public CharmItem getCharItem() {
        return charItem;
    }

    public void setCharItem(CharmItem charItem) {
        this.charItem = charItem;
    }

 
   

   
    
}
