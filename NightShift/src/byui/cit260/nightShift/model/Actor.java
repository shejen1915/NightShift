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
public class Actor implements Serializable{
    
    private String name;
    private String description;
    private String startLocation;
    private double interactionBonus;
    private double interactionPenalty;

    public Actor() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStartLocation() {
        return startLocation;
    }

    public void setStartLocation(String startLocation) {
        this.startLocation = startLocation;
    }

    public double getInteractionBonus() {
        return interactionBonus;
    }

    public void setInteractionBonus(double interactionBonus) {
        this.interactionBonus = interactionBonus;
    }

    public double getInteractionPenalty() {
        return interactionPenalty;
    }

    public void setInteractionPenalty(double interactionPenalty) {
        this.interactionPenalty = interactionPenalty;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.name);
        hash = 97 * hash + Objects.hashCode(this.description);
        hash = 97 * hash + Objects.hashCode(this.startLocation);
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.interactionBonus) ^ (Double.doubleToLongBits(this.interactionBonus) >>> 32));
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.interactionPenalty) ^ (Double.doubleToLongBits(this.interactionPenalty) >>> 32));
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
        final Actor other = (Actor) obj;
        if (Double.doubleToLongBits(this.interactionBonus) != Double.doubleToLongBits(other.interactionBonus)) {
            return false;
        }
        if (Double.doubleToLongBits(this.interactionPenalty) != Double.doubleToLongBits(other.interactionPenalty)) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (!Objects.equals(this.startLocation, other.startLocation)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Actor{" + "name=" + name + ", description=" + description + ", startLocation=" + startLocation + ", interactionBonus=" + interactionBonus + ", interactionPenalty=" + interactionPenalty + '}';
    }
    
    
    
}
