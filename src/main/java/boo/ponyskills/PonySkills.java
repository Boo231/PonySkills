package boo.ponyskills;

import org.bukkit.plugin.java.JavaPlugin;

public class PonySkills extends JavaPlugin {

    @Override
    public void onLoad() {
System.out.println("onLoad");
    }

    @Override
    public void onEnable() {
        System.out.println("onEnable");
        getServer().getPluginManager().registerEvents(new PlayerJoinListener(), this);

    }

    @Override
    public void onDisable() {
        System.out.println("onDisable");
    }


}
