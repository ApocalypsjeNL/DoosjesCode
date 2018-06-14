package nl.apocalypsje.doosjescode.base;

import org.bukkit.entity.Entity;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public abstract class EntityEffect extends Packet {

    protected int entityId = -1;
    protected int effectId = -1;
    protected int amplifier = 1;
    protected int duration = 30;
    protected boolean ambient = false;
    protected boolean showParticles = true;

    public EntityEffect(Entity entity, PotionEffect potionEffect, int amplifier, int duration, boolean ambient, boolean showParticles) {
        this.entityId = entity.getEntityId();
        this.effectId = potionEffect.getType().getId();
        this.amplifier = amplifier;
        this.duration = duration;
        this.ambient = ambient;
        this.showParticles = showParticles;
    }

    public EntityEffect(Entity entity, PotionEffectType potionEffectType, int amplifier, int duration, boolean ambient, boolean showParticles) {
        this.entityId = entity.getEntityId();
        this.effectId = potionEffectType.getId();
        this.amplifier = amplifier;
        this.duration = duration;
        this.ambient = ambient;
        this.showParticles = showParticles;
    }

    public EntityEffect() {
    }

    public int getEntityId() {
        return entityId;
    }

    public void setEntityId(Entity entity) {
        this.entityId = entity.getEntityId();
    }

    public int getEffectId() {
        return effectId;
    }

    public void setEffectId(PotionEffectType potionEffectType) {
        this.effectId = potionEffectType.getId();
    }

    public void setEffectId(PotionEffect potionEffect) {
        this.effectId = potionEffect.getType().getId();
    }

    public int getAmplifier() {
        return amplifier;
    }

    public void setAmplifier(int amplifier) {
        this.amplifier = amplifier;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public boolean isAmbient() {
        return ambient;
    }

    public void setAmbient(boolean ambient) {
        this.ambient = ambient;
    }

    public boolean isShowParticles() {
        return showParticles;
    }

    public void setShowParticles(boolean showParticles) {
        this.showParticles = showParticles;
    }
}
