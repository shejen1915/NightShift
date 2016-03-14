/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.nightShift.model;

/**
 *
 * @author Ni shi shei
 */
public class Pillar implements Serializable {
    
    private String description;
    private double width;
    private double distanceToWindow;
    
    public Pillar() {
        this.description = "\n This is a description of the Pillar function.";
        this.width = 0;
        this.distanceToWindow = 0;
    }
    
}
