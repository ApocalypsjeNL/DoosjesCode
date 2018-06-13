package nl.apocalypsje.doosjescode.v340;

import nl.apocalypsje.doosjescode.Packet;
import org.bukkit.craftbukkit.v1_12_R1.entity.CraftPlayer;
import org.bukkit.entity.Player;

public class ProtocolManager {

    public void sendPacket(Player player, Packet packet) {
        ((CraftPlayer) player).getHandle().playerConnection.sendPacket(packet.generatePacket());
    }
}
