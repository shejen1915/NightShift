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
public class BossEncounter extends UpDown{
    
    //class instance variables
    private double bossEquation;

    public BossEncounter() {
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 41 * hash + (int) (Double.doubleToLongBits(this.bossEquation) ^ (Double.doubleToLongBits(this.bossEquation) >>> 32));
        return hash;
    }

    @Override
    public String toString() {
        return "BossEncounter{" + "bossEquation=" + bossEquation + '}';
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
        final BossEncounter other = (BossEncounter) obj;
        return Double.doubleToLongBits(this.bossEquation) == Double.doubleToLongBits(other.bossEquation);
    }
    
    

    public double getBossEquation() {
        return bossEquation;
    }

    public void setBossEquation(double bossEquation) {
        this.bossEquation = bossEquation;
    }
    
            
    
}
