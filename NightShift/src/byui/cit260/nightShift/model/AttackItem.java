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
public class AttackItem implements Serializable{
    
    private double attack;
    private String mapLocation;

    public AttackItem() {
    }

    public double getAttack() {
        return attack;
    }

    public void setAttack(double attack) {
        this.attack = attack;
    }

    public String getMapLocation() {
        return mapLocation;
    }

    public void setMapLocation(String mapLocation) {
        this.mapLocation = mapLocation;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + (int) (Double.doubleToLongBits(this.attack) ^ (Double.doubleToLongBits(this.attack) >>> 32));
        hash = 29 * hash + Objects.hashCode(this.mapLocation);
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
        final AttackItem other = (AttackItem) obj;
        if (Double.doubleToLongBits(this.attack) != Double.doubleToLongBits(other.attack)) {
            return false;
        }
        if (!Objects.equals(this.mapLocation, other.mapLocation)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "AttackItem{" + "attack=" + attack + ", mapLocation=" + mapLocation + '}';
    }
    
    
    
}
