package nl.apocalypsje.doosjescode.v340;

import nl.apocalypsje.doosjescode.base.Packet;
import nl.apocalypsje.doosjescode.base.ProtocolManager;
import org.bukkit.craftbukkit.v1_12_R1.entity.CraftPlayer;
import org.bukkit.entity.Player;

public class v340ProtocolManager extends ProtocolManager {

    @Override
    public String getVersion() {
        return "1.12.2 - 1.12.2";
    }

    @Override
    public int getProtocolVersion() {
        return 340;
    }

    public void sendPacket(Player player, Packet packet) {
        if(packet instanceof v340Packet) {
            ((CraftPlayer) player).getHandle().playerConnection.sendPacket(((v340Packet) packet).generatePacket());
        } else {
            throw new RuntimeException("Invalid packet version");
        }
    }
}
