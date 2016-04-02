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
 * @author Ni shi shei
 */
public enum CharmItem implements Serializable{
    
    buffaloCharm(1,new Point(2,3)),
    bobcatCharm(1,new Point(1,3));
    
    private final double defenseBoost;
    private final Point mapLocation;

    CharmItem(double defenseBoost, Point mapLocation) {
        this.defenseBoost = defenseBoost;
        this.mapLocation = mapLocation;
    }


    public double getDefenseBoost() {
        return defenseBoost;
    }


    public Point getMapLocation() {
        return mapLocation;
    }



    

    @Override
    public String toString() {
        return "CharmItem{" + "defenseBoost=" + defenseBoost + ", mapLocation=" + mapLocation + '}';
    }
    
    
    
}
