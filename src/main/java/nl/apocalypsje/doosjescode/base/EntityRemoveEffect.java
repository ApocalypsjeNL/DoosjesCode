package nl.apocalypsje.doosjescode.base;

import org.bukkit.entity.Entity;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public abstract class EntityRemoveEffect {

    protected int entityId;
    protected int effectId;

    public EntityRemoveEffect(Entity entity, PotionEffect potionEffect) {
        this.entityId = entity.getEntityId();
        this.effectId = potionEffect.getType().getId();
    }

    public EntityRemoveEffect(Entity entity, PotionEffectType potionEffectType) {
        this.entityId = entity.getEntityId();
        this.effectId = potionEffectType.getId();
    }

    public EntityRemoveEffect() {
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

    public void setEffectId(PotionEffect potionEffect) {
        this.effectId = potionEffect.getType().getId();
    }

    public void setEffectId(PotionEffectType potionEffectType) {
        this.effectId = potionEffectType.getId();
    }
}
