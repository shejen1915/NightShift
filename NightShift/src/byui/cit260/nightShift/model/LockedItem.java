/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.nightShift.model;

import java.io.Serializable;

/**
 *
 * @author Ni shi shei
 */
public enum LockedItem implements Serializable{
    door("This is where the description of the door pops up"),
    pillar("This is where the description of the pillar pops up"),
    window("This is where the description of the window pops up");
    
    private final String description;
    private final Point coordinates;
    
    LockedItem(String description) {
        this.description = description;
        coordinates = new Point(1,1);
    }
    
    public String getDescription() {
        return description;
    }
    
    public Point getCoordinates() {
        return coordinates;
    }
}


