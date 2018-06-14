package nl.apocalypsje.doosjescode.base;

import org.bukkit.entity.Player;

public abstract class ProtocolManager {

    public abstract String getVersion();

    public abstract int getProtocolVersion();

    public abstract void sendPacket(Player player, Packet packet);
}
