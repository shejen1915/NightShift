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
public class GhostEncounter extends UpDown{
    
    private String ghostEquation;

    public GhostEncounter() {
    }

    public String getGhostEquation() {
        return ghostEquation;
    }

    public void setGhostEquation(String ghostEquation) {
        this.ghostEquation = ghostEquation;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.ghostEquation);
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
        final GhostEncounter other = (GhostEncounter) obj;
        if (!Objects.equals(this.ghostEquation, other.ghostEquation)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "GhostEncounter{" + "ghostEquation=" + ghostEquation + '}';
    }
    
    
    
}
