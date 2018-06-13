package nl.apocalypsje.doosjescode;

import nl.apocalypsje.doosjescode.v340.EntityEffect;
import nl.apocalypsje.doosjescode.v340.ProtocolManager;
import org.bukkit.entity.Player;

public class PacketLib {

    private static ProtocolManager protocolManager = new ProtocolManager();

    public void sendPacket(Player player, Packet packet) {
        protocolManager.sendPacket(player, packet);
    }

    public EntityEffect generateEntityEffect() {
        return new EntityEffect();
    }
}
