package nl.apocalypsje.doosjescode.v340;

import net.minecraft.server.v1_12_R1.MobEffect;
import net.minecraft.server.v1_12_R1.MobEffectList;
import net.minecraft.server.v1_12_R1.Packet;
import net.minecraft.server.v1_12_R1.PacketPlayOutEntityEffect;
import nl.apocalypsje.doosjescode.base.EntityEffect;

public class v340EntityEffect extends EntityEffect {

    public Packet generatePacket() {
        if(entityId == -1 || effectId == -1) {
            throw new RuntimeException("Can't build packet, entity or effect is missing.");
        }
        return new PacketPlayOutEntityEffect(entityId, new MobEffect(MobEffectList.fromId(effectId), amplifier, duration, ambient, showParticles));
    }
}
