package me.sowgro.LeaveCmd;

import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.ConfigurationSection;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public class Main extends JavaPlugin {
	public static Main plugin;

	@Override
	public void onEnable() {
		plugin = this;
		Objects.requireNonNull(getCommand("leavecmd")).setExecutor(new LeaveCmd());
		Objects.requireNonNull(getCommand("leave")).setExecutor(new Leave());
	}
}
