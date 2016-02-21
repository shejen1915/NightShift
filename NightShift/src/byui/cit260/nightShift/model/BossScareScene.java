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
public class BossScareScene extends RegularScene{
    
    private String callBoss;
    private String summonGhost;
    private String bossEncounterNullify;

    public BossScareScene() {
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

    public String getBossEncounterNullify() {
        return bossEncounterNullify;
    }

    public void setBossEncounterNullify(String bossEncounterNullify) {
        this.bossEncounterNullify = bossEncounterNullify;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.callBoss);
        hash = 53 * hash + Objects.hashCode(this.summonGhost);
        hash = 53 * hash + Objects.hashCode(this.bossEncounterNullify);
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
        final BossScareScene other = (BossScareScene) obj;
        if (!Objects.equals(this.callBoss, other.callBoss)) {
            return false;
        }
        if (!Objects.equals(this.summonGhost, other.summonGhost)) {
            return false;
        }
        if (!Objects.equals(this.bossEncounterNullify, other.bossEncounterNullify)) {
            return false;
    }
        return true;
    }

    @Override
    public String toString() {
        return "BossScareScene{" + "callBoss=" + callBoss + ", summonGhost=" + summonGhost + ", bossEncounterNullify=" + bossEncounterNullify + '}';
    }
    
    
    
}
