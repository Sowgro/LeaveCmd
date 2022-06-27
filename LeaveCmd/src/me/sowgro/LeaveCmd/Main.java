package me.sowgro.LeaveCmd;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin 
{
	@Override
	public void onEnable() 
	{
		this.saveDefaultConfig();
		//startup, reloads, plugin reloads
	}
	
	@Override
	public void onDisable()
	{
		//shutdown, reloads
	}
	
	// /leave
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) 
	{
		if (label.equalsIgnoreCase("leave"))
		{
			if (sender instanceof Player)
			{
				try
				{
					String world = ((Player) sender).getWorld().getName(); //gets world of player
					String game = this.getConfig().getConfigurationSection("worlds").getString(world); //gets the game of that world
					String command = this.getConfig().getConfigurationSection("commands").getString(game); //gets the command of that game
					((Player) sender).performCommand(command); //executes the command
				}
				catch(Exception e)
				{
					sender.sendMessage("The current game cannot be left.");
				}
			}
			else
			{
				getLogger().info("This command cannot be used by the console");
			}
		}
		if (label.equalsIgnoreCase("leaveCmd"))
		{
			if (args[0].equalsIgnoreCase("reload"))
			{
				this.reloadConfig();
				sender.sendMessage("Reloaded.");
			}
		}
		return false;
	} 
} 
