package nl.apocalypsje.doosjescode.v340;

import net.minecraft.server.v1_12_R1.MobEffect;
import net.minecraft.server.v1_12_R1.MobEffectList;
import net.minecraft.server.v1_12_R1.PacketPlayOutEntityEffect;
import nl.apocalypsje.doosjescode.Packet;

public class EntityEffect implements Packet {

    private int entityId = -1;
    private int effectId = -1;
    private int amplifier = 1;
    private int duration = 30;
    private boolean ambient = false;
    private boolean showParticles = true;

    public EntityEffect(int entityId, int effectId, int amplifier, int duration, boolean ambient, boolean showParticles) {
        this.entityId = entityId;
        this.effectId = effectId;
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

    public void setEntityId(int entityId) {
        if(entityId > 0) {
            this.entityId = entityId;
        } else {
            throw new RuntimeException("EntityID must be greater then 0.");
        }
    }

    public int getEffectId() {
        return effectId;
    }

    public void setEffectId(int effectId) {
        if(effectId > 0  && effectId <= 30) {
            this.effectId = effectId;
        } else {
            throw new RuntimeException("Invalid effectID. EffectID must be greater then 0 and lower then 31.");
        }
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

    public net.minecraft.server.v1_12_R1.Packet generatePacket() {
        if(entityId == -1 || effectId == -1) {
            throw new RuntimeException("Can't build packet, entityId of effectId is missing.");
        }
        return new PacketPlayOutEntityEffect(entityId, new MobEffect(MobEffectList.fromId(effectId), amplifier, duration, ambient, showParticles));
    }
}
