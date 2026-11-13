package com.bastionmc.dungeons;

import org.bukkit.plugin.java.JavaPlugin;

public final class BastionDungeons extends JavaPlugin {

    private static BastionDungeons instance;

    @Override
    public void onEnable() {
        instance = this;

        saveDefaultConfig();

        getLogger().info("================================");
        getLogger().info("       BASTION DUNGEONS");
        getLogger().info("================================");
        getLogger().info("Plugin iniciado correctamente.");
        getLogger().info("Version: 1.0.0");
        getLogger().info("================================");
    }

    @Override
    public void onDisable() {
        getLogger().info("BASTION DUNGEONS desactivado.");
    }

    public static BastionDungeons getInstance() {
        return instance;
    }
}
