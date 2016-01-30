/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.nightShift.model;

/**
 *
 * @author Silver
 */
public class GhostEncounter extends UpDown{
    
    // class instance variables
    private double ghostEncounter;

    public GhostEncounter() {
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + (int) (Double.doubleToLongBits(this.ghostEncounter) ^ (Double.doubleToLongBits(this.ghostEncounter) >>> 32));
        return hash;
    }

    @Override
    public String toString() {
        return "GhostEncounter{" + "ghostEncounter=" + ghostEncounter + '}';
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
        final GhostEncounter other = (GhostEncounter) obj;
        if (Double.doubleToLongBits(this.ghostEncounter) != Double.doubleToLongBits(other.ghostEncounter)) {
            return false;
        }
        return true;
    }

    
    
    public double getGhostEncounter() {
        return ghostEncounter;
    }

    public void setGhostEncounter(double ghostEncounter) {
        this.ghostEncounter = ghostEncounter;
    }
    
    
}
