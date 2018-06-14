package nl.apocalypsje.doosjescode.v340;

import net.minecraft.server.v1_12_R1.MobEffectList;
import net.minecraft.server.v1_12_R1.Packet;
import net.minecraft.server.v1_12_R1.PacketPlayOutRemoveEntityEffect;
import nl.apocalypsje.doosjescode.base.EntityRemoveEffect;

public class v340EntityRemoveEffect extends EntityRemoveEffect {

    public Packet generatePacket() {
        if(entityId == -1 || effectId == -1) {
            throw new RuntimeException("Can't build packet, entity or effect is missing.");
        }
        return new PacketPlayOutRemoveEntityEffect(entityId, MobEffectList.fromId(effectId));
    }
}
