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
public class Item implements Serializable{


    



    public enum ItemType{
        charm,
        weapon,
        special;
    }
    
    private String itemName;
    private String inventoryType;
    private boolean equipStatus;
    private String description;
    private String specialAbility;
    private double requiredAmount;
    private double quanityInStock;
    private double quantityUncollected;
    private double defenseBoost;
    private double attackBoost;
    

    public Item() {
    }

    
    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getInventoryType() {
        return inventoryType;
    }

    public void setInventoryType(String inventoryType) {
        this.inventoryType = inventoryType;
    }

    public boolean getEquipStatus() {
        return equipStatus;
    }

    public void setEquipStatus(boolean equipStatus) {
        this.equipStatus = equipStatus;
    }

    public double getQuanityInStock() {
        return quanityInStock;
    }

    public void setQuanityInStock(double quanityInStock) {
        this.quanityInStock = quanityInStock;
    }

    public double getQuantityUncollected() {
        return quantityUncollected;
    }

    public void setQuantityUncollected(double quantityUncollected) {
        this.quantityUncollected = quantityUncollected;
    }

    public double getRequiredAmount() {
        return requiredAmount;
    }

    public void setRequiredAmount(double requiredAmount) {
        this.requiredAmount = requiredAmount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSpecialAbility() {
        return specialAbility;
    }

    public void setSpecialAbility(String specialAbility) {
        this.specialAbility = specialAbility;
    }

    public double getDefenseBoost() {
        return defenseBoost;
    }

    public void setDefenseBoost(double defenseBoost) {
        this.defenseBoost = defenseBoost;
    }

    public double getAttackBoost() {
        return attackBoost;
    }

    public void setAttackBoost(double attackBoost) {
        this.attackBoost = attackBoost;
    }

    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.itemName);
        hash = 37 * hash + Objects.hashCode(this.inventoryType);
        hash = 37 * hash + Objects.hashCode(this.equipStatus);
        hash = 37 * hash + (int) (Double.doubleToLongBits(this.quanityInStock) ^ (Double.doubleToLongBits(this.quanityInStock) >>> 32));
        hash = 37 * hash + (int) (Double.doubleToLongBits(this.quantityUncollected) ^ (Double.doubleToLongBits(this.quantityUncollected) >>> 32));
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
        final Item other = (Item) obj;
        if (Double.doubleToLongBits(this.quanityInStock) != Double.doubleToLongBits(other.quanityInStock)) {
            return false;
        }
        if (Double.doubleToLongBits(this.quantityUncollected) != Double.doubleToLongBits(other.quantityUncollected)) {
            return false;
        }
        if (!Objects.equals(this.itemName, other.itemName)) {
            return false;
        }
        if (!Objects.equals(this.inventoryType, other.inventoryType)) {
            return false;
        }
        if (!Objects.equals(this.equipStatus, other.equipStatus)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "InventoryItem{" + "itemName=" + itemName + ", inventoryType=" + inventoryType + ", equipStatus=" + equipStatus + ", quanityInStock=" + quanityInStock + ", quantityUncollected=" + quantityUncollected + '}';
    }
    
    
    
}
