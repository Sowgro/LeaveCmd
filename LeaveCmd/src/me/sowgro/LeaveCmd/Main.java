package me.sowgro.LeaveCmd;

import org.bukkit.plugin.java.JavaPlugin;

import java.util.Objects;

public class Main extends JavaPlugin {
	public static Main plugin;

	@Override
	public void onEnable() {
		plugin = this;
		Objects.requireNonNull(getCommand("leavecmd")).setExecutor(new LeaveCmd());
		Objects.requireNonNull(getCommand("leave")).setExecutor(new Leave());
	}
}
