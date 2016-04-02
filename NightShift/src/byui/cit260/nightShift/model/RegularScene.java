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
 * @author Silver
 */
public class RegularScene implements Serializable{

    
    
      // class instance variables
       private String description;
       private String lockedStatus;
       private String doorUnlockItem;
       private String actorStatus;
       private String counterpart;
       private String sceneItems;

    public RegularScene() {
    }
       

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLockedStatus() {
        return lockedStatus;
    }

    public void setLockedStatus(String lockedStatus) {
        this.lockedStatus = lockedStatus;
    }

    public String getDoorUnlockItem() {
        return doorUnlockItem;
    }

    public void setDoorUnlockItem(String doorUnlockItem) {
        this.doorUnlockItem = doorUnlockItem;
    }

    public String getActorStatus() {
        return actorStatus;
    }

    public void setActorStatus(String actorStatus) {
        this.actorStatus = actorStatus;
    }

    public String getCounterpart() {
        return counterpart;
    }

    public void setCounterpart(String counterpart) {
        this.counterpart = counterpart;
    }

    public String getSceneItems() {
        return sceneItems;
    }

    public void setSceneItems(String sceneItems) {
        this.sceneItems = sceneItems;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 71 * hash + Objects.hashCode(this.description);
        hash = 71 * hash + Objects.hashCode(this.lockedStatus);
        hash = 71 * hash + Objects.hashCode(this.doorUnlockItem);
        hash = 71 * hash + Objects.hashCode(this.actorStatus);
        hash = 71 * hash + Objects.hashCode(this.counterpart);
        hash = 71 * hash + Objects.hashCode(this.sceneItems);
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
        final RegularScene other = (RegularScene) obj;
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (!Objects.equals(this.lockedStatus, other.lockedStatus)) {
            return false;
        }
        if (!Objects.equals(this.doorUnlockItem, other.doorUnlockItem)) {
            return false;
        }
        if (!Objects.equals(this.actorStatus, other.actorStatus)) {
            return false;
        }
        if (!Objects.equals(this.counterpart, other.counterpart)) {
            return false;
        }
        if (!Objects.equals(this.sceneItems, other.sceneItems)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "RegularScene{" + "description=" + description + ", lockedStatus=" + lockedStatus + ", doorUnlockItem=" + doorUnlockItem + ", actorStatus=" + actorStatus + ", counterpart=" + counterpart + ", sceneItems=" + sceneItems + '}';
    }

    public void setDescription() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
       
       
       
}
