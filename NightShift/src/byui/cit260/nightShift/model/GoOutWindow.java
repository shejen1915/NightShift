/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.nightShift.model;

import java.util.Objects;

/**
 *
 * @author Ni shi shei
 */
public class GoOutWindow extends UpDown{
    
    private String windowEquation;
    private String requiresRope;
    private String gainGhostBuster;

    public GoOutWindow() {
    }

    public String getWindowEquation() {
        return windowEquation;
    }

    public void setWindowEquation(String windowEquation) {
        this.windowEquation = windowEquation;
    }

    public String getRequiresRope() {
        return requiresRope;
    }

    public void setRequiresRope(String requiresRope) {
        this.requiresRope = requiresRope;
    }

    public String getGainGhostBuster() {
        return gainGhostBuster;
    }

    public void setGainGhostBuster(String gainGhostBuster) {
        this.gainGhostBuster = gainGhostBuster;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.windowEquation);
        hash = 97 * hash + Objects.hashCode(this.requiresRope);
        hash = 97 * hash + Objects.hashCode(this.gainGhostBuster);
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
        final GoOutWindow other = (GoOutWindow) obj;
        if (!Objects.equals(this.windowEquation, other.windowEquation)) {
            return false;
        }
        if (!Objects.equals(this.requiresRope, other.requiresRope)) {
            return false;
        }
        if (!Objects.equals(this.gainGhostBuster, other.gainGhostBuster)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "GoOutWindow{" + "windowEquation=" + windowEquation + ", requiresRope=" + requiresRope + ", gainGhostBuster=" + gainGhostBuster + '}';
    }
    
    
    
}
