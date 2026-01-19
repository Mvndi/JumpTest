package net.mvndicraft.jumptest;

import com.destroystokyo.paper.event.player.PlayerJumpEvent;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityShootBowEvent;

public class JumpTestListener implements Listener {
    @EventHandler(ignoreCancelled = true)
    public void onShoot(EntityShootBowEvent event) {
        JumpTestPlugin.getInstance().getLogger().info("EntityShootBowEvent Shooting.");
        JumpTestPlugin.getInstance().getLogger().info("getEntity(): " + event.getEntity());
        JumpTestPlugin.getInstance().getLogger().info("isJumping(): " + event.getEntity().isJumping());
        JumpTestPlugin.getInstance().getLogger().info("getVelocity(): " + event.getEntity().getVelocity());
        JumpTestPlugin.getInstance().getLogger()
                .info("getVelocity().length(): " + event.getEntity().getVelocity().length());
    }

    @EventHandler(ignoreCancelled = true)
    public void onJump(PlayerJumpEvent event) {
        JumpTestPlugin.getInstance().getLogger().info("EntityJumpEvent Jumping ? ");
        JumpTestPlugin.getInstance().getLogger().info("getEntity(): " + event.getPlayer());
        JumpTestPlugin.getInstance().getLogger().info("isJumping(): " + event.getPlayer().isJumping());
        JumpTestPlugin.getInstance().getLogger().info("getVelocity(): " + event.getPlayer().getVelocity());
        JumpTestPlugin.getInstance().getLogger()
                .info("getVelocity().length(): " + event.getPlayer().getVelocity().length());
    }
}
