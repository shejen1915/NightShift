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
public class UpDown extends RegularScene{
    
    // class instance variables
    private String goUp;
    private String goDown;

    public UpDown() {
    }

    /**
     *
     * @return
     */
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 43 * hash + Objects.hashCode(this.goUp);
        hash = 43 * hash + Objects.hashCode(this.goDown);
        return hash;
    }

    @Override
    public String toString() {
        return "UpDown{" + "goUp=" + goUp + ", goDown=" + goDown + '}';
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
        final UpDown other = (UpDown) obj;
        if (!Objects.equals(this.goUp, other.goUp)) {
            return false;
        }
        return Objects.equals(this.goDown, other.goDown);
    }
    
    

    public String getGoUp() {
        return goUp;
    }

    public void setGoUp(String goUp) {
        this.goUp = goUp;
    }

    public String getGoDown() {
        return goDown;
    }

    public void setGoDown(String goDown) {
        this.goDown = goDown;
    }
    
    
    
}
