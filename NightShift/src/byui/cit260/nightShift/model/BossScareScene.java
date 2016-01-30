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
public class BossScareScene extends RegularScene{
    
    // class instance variables
    private String callBoss;
    private String summonGhost;
    private String bossEcounternullify;

    public BossScareScene() {
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + Objects.hashCode(this.callBoss);
        hash = 79 * hash + Objects.hashCode(this.summonGhost);
        hash = 79 * hash + Objects.hashCode(this.bossEcounternullify);
        return hash;
    }

    @Override
    public String toString() {
        return "BossScareScene{" + "callBoss=" + callBoss + ", summonGhost=" + summonGhost + ", bossEcounternullify=" + bossEcounternullify + '}';
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
        final BossScareScene other = (BossScareScene) obj;
        if (!Objects.equals(this.callBoss, other.callBoss)) {
            return false;
        }
        if (!Objects.equals(this.summonGhost, other.summonGhost)) {
            return false;
        }
        return Objects.equals(this.bossEcounternullify, other.bossEcounternullify);
    }

    
    
    public String getCallBoss() {
        return callBoss;
    }

    public void setCallBoss(String callBoss) {
        this.callBoss = callBoss;
    }

    public String getSummonGhost() {
        return summonGhost;
    }

    public void setSummonGhost(String summonGhost) {
        this.summonGhost = summonGhost;
    }

    public String getBossEcounternullify() {
        return bossEcounternullify;
    }

    public void setBossEcounternullify(String bossEcounternullify) {
        this.bossEcounternullify = bossEcounternullify;
    }
    
    
    
}
