package net.mvndicraft.jumptest;

import org.bukkit.plugin.java.JavaPlugin;

/**
 * Tool functions
 */
public class JumpTestPlugin extends JavaPlugin {

    private static JumpTestPlugin instance;

    public JumpTestPlugin() {
        instance = this;
    }

    public static JumpTestPlugin getInstance() {
        return instance;
    }

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new JumpTestListener(), this);
    }
}
