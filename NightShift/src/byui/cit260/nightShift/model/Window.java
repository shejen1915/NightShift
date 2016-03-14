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
public class Window implements Serializable {
    private String description;
    private double height;
    private double distanceToCeiling;
    private double distanceToFloor;
    
    public Window() {
        this.description = "\n This is the description for the Window function.";
        this.height = 0;
        this.distanceToCeiling = 0;
        this.distanceToFloor = 0;
    }
}
