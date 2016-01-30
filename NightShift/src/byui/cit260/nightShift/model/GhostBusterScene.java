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
public class GhostBusterScene extends RegularScene{
    
    // class instance variables
    private String callGhost;
    private String trapGhost;
    private String ghostEncounterNullify;

    public GhostBusterScene() {
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 11 * hash + Objects.hashCode(this.callGhost);
        hash = 11 * hash + Objects.hashCode(this.trapGhost);
        hash = 11 * hash + Objects.hashCode(this.ghostEncounterNullify);
        return hash;
    }

    @Override
    public String toString() {
        return "GhostBusterScene{" + "callGhost=" + callGhost + ", trapGhost=" + trapGhost + ", ghostEncounterNullify=" + ghostEncounterNullify + '}';
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
        final GhostBusterScene other = (GhostBusterScene) obj;
        if (!Objects.equals(this.callGhost, other.callGhost)) {
            return false;
        }
        if (!Objects.equals(this.trapGhost, other.trapGhost)) {
            return false;
        }
        return Objects.equals(this.ghostEncounterNullify, other.ghostEncounterNullify);
    }
    
    

    public String getCallGhost() {
        return callGhost;
    }

    public void setCallGhost(String callGhost) {
        this.callGhost = callGhost;
    }

    public String getTrapGhost() {
        return trapGhost;
    }

    public void setTrapGhost(String trapGhost) {
        this.trapGhost = trapGhost;
    }

    public String getGhostEncounterNullify() {
        return ghostEncounterNullify;
    }

    public void setGhostEncounterNullify(String ghostEncounterNullify) {
        this.ghostEncounterNullify = ghostEncounterNullify;
    }
    
    
}
