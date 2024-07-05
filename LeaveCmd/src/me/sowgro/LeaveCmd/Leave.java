package me.sowgro.LeaveCmd;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabCompleter;
import org.bukkit.configuration.ConfigurationSection;
import org.bukkit.entity.Player;

import java.util.Collections;
import java.util.List;

import static me.sowgro.LeaveCmd.Main.plugin;

public class Leave implements CommandExecutor, TabCompleter {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

        if (!(sender instanceof Player p)) {
            sender.sendMessage("This cannot be run by the console");
            return false;
        }

        ConfigurationSection cfgSection = plugin.getConfig().getConfigurationSection("commands");
        if (cfgSection == null) {
            sender.sendMessage("The LeaveCmd config file is not setup correctly.");
            return false;
        }

        String worldName = p.getWorld().getName();
        for (String s : cfgSection.getKeys(false)) {
            if (worldName.contains(s)) {

                String command = cfgSection.getString(s);
                if (command == null) {
                    sender.sendMessage("An error occurred leaving the current game. ");
                    return false;
                }

                p.performCommand(command);
                return true;
            }
        }
        sender.sendMessage("Unable to leave current game.");
        return true;
    }

    @Override
    public List<String> onTabComplete(CommandSender sender, Command command, String label, String[] args) {
        return Collections.emptyList();
    }
}
