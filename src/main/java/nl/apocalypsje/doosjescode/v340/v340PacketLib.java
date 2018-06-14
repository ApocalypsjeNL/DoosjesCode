package nl.apocalypsje.doosjescode.v340;

import nl.apocalypsje.doosjescode.base.EntityEffect;
import nl.apocalypsje.doosjescode.base.EntityRemoveEffect;
import nl.apocalypsje.doosjescode.base.Packet;
import nl.apocalypsje.doosjescode.base.ProtocolManager;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class v340PacketLib {

    private static ProtocolManager protocolManager = new v340ProtocolManager();

    public static void sendPacket(Player player, Packet packet) {
        protocolManager.sendPacket(player, packet);
    }

    public static EntityEffect generateEntityEffect(Entity entity, PotionEffect potionEffect) {
        EntityEffect entityEffect = new v340EntityEffect();
        entityEffect.setEntityId(entity);
        entityEffect.setEffectId(potionEffect);
        return entityEffect;
    }

    public static EntityEffect generateEntityEffect(Entity entity, PotionEffectType potionEffectType) {
        EntityEffect  entityEffect = new v340EntityEffect();
        entityEffect.setEntityId(entity);
        entityEffect.setEffectId(potionEffectType);
        return entityEffect;
    }

    public static EntityRemoveEffect generateRemoveEntityEffect(Entity entity, PotionEffectType potionEffectType) {
        EntityRemoveEffect entityRemoveEffect = new v340EntityRemoveEffect();
        entityRemoveEffect.setEntityId(entity);
        entityRemoveEffect.setEffectId(potionEffectType);
        return entityRemoveEffect;
    }
}
