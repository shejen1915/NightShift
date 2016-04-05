/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.nightShift.model;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Ni shi shei
 */
public class Game implements Serializable{
    
    private double score;
    private double startTime;
    private Player player;
    private String[] actor;
    private Map map;
    private Item[] inventroyItems;
    private ArrayList<Item> collectedItems;
    private RegularScene[] scene;
    private Pillar pillar;
    private Window window;

    public Game() {
    }
    
    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public double getStartTime() {
        return startTime;
    }

    public void setStartTime(double startTime) {
        this.startTime = startTime;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.score) ^ (Double.doubleToLongBits(this.score) >>> 32));
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.startTime) ^ (Double.doubleToLongBits(this.startTime) >>> 32));
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
        final Game other = (Game) obj;
        if (Double.doubleToLongBits(this.score) != Double.doubleToLongBits(other.score)) {
            return false;
        }
        return Double.doubleToLongBits(this.startTime) == Double.doubleToLongBits(other.startTime);
    }

    @Override
    public String toString() {
        return "Game{" + "score=" + score + ", startTime=" + startTime + '}';
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public String[] getActor() {
        return actor;
    }

    public void setActor(String[] actor) {
        this.actor = actor;
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    public Item[] getInventroyItems() {
        return inventroyItems;
    }

    public void setInventroyItems(Item[] inventroyItems) {
        this.inventroyItems = inventroyItems;
    }

    public ArrayList<Item> getCollectedItems() {
        return collectedItems;
    }

    public void setCollectedItems(ArrayList<Item> collectedItems) {
        this.collectedItems = collectedItems;
    }

    public RegularScene[] getScene() {
        return scene;
    }

    public void setScene(RegularScene[] scene) {
        this.scene = scene;
    }

    public Pillar getPillar() {
        return pillar;
    }

    public void setPillar(Pillar pillar) {
        this.pillar = pillar;
    }

    public Window getWindow() {
        return window;
    }

    public void setWindow(Window window) {
        this.window = window;
    }

    
    
    
}
