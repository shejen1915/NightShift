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
public class ToolItem implements Serializable{
    
    private String ability;
    private String mapLocation;

    public ToolItem() {
    }

    public String getAbility() {
        return ability;
    }

    public void setAbility(String ability) {
        this.ability = ability;
    }

    public String getMapLocation() {
        return mapLocation;
    }

    public void setMapLocation(String mapLocation) {
        this.mapLocation = mapLocation;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.ability);
        hash = 97 * hash + Objects.hashCode(this.mapLocation);
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
        final ToolItem other = (ToolItem) obj;
        if (!Objects.equals(this.ability, other.ability)) {
            return false;
        }
        if (!Objects.equals(this.mapLocation, other.mapLocation)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ToolItem{" + "ability=" + ability + ", mapLocation=" + mapLocation + '}';
    }
    
    
    
}
