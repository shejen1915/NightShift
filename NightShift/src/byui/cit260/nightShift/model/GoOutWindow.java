/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.nightShift.model;

import java.util.Objects;

/**
 *
 * @author Silver
 */
public class GoOutWindow extends UpDown{
    
    // class instance variable
    private String requireRope;
    private String gainGhostBuster;
    private double windowEquation;

    public GoOutWindow() {
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + Objects.hashCode(this.requireRope);
        hash = 67 * hash + Objects.hashCode(this.gainGhostBuster);
        hash = 67 * hash + (int) (Double.doubleToLongBits(this.windowEquation) ^ (Double.doubleToLongBits(this.windowEquation) >>> 32));
        return hash;
    }

    @Override
    public String toString() {
        return "GoOutWindow{" + "requireRope=" + requireRope + ", gainGhostBuster=" + gainGhostBuster + ", windowEquation=" + windowEquation + '}';
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
        final GoOutWindow other = (GoOutWindow) obj;
        if (Double.doubleToLongBits(this.windowEquation) != Double.doubleToLongBits(other.windowEquation)) {
            return false;
        }
        if (!Objects.equals(this.requireRope, other.requireRope)) {
            return false;
        }
        return Objects.equals(this.gainGhostBuster, other.gainGhostBuster);
    }

    
    
    public String getRequireRope() {
        return requireRope;
    }

    public void setRequireRope(String requireRope) {
        this.requireRope = requireRope;
    }

    public String getGainGhostBuster() {
        return gainGhostBuster;
    }

    public void setGainGhostBuster(String gainGhostBuster) {
        this.gainGhostBuster = gainGhostBuster;
    }

    public double getWindowEquation() {
        return windowEquation;
    }

    public void setWindowEquation(double windowEquation) {
        this.windowEquation = windowEquation;
    }
    
    
}
