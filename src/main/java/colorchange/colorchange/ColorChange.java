package colorchange.colorchange;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class ColorChange extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        Bukkit.getLogger().info("ChangeColor loaded successfully!");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        Bukkit.getLogger().info("Shutting down ChangeColor...");
    }
}

