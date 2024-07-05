package me.sowgro.LeaveCmd;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabCompleter;

import java.util.Collections;
import java.util.List;

import static me.sowgro.LeaveCmd.Main.plugin;

public class LeaveCmd implements CommandExecutor, TabCompleter {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (args[0].equals("reload")) {
            plugin.reloadConfig();
            sender.sendMessage("Reloaded.");
            return true;
        }

        sender.sendMessage("Unknown command");
        return false;
    }

    @Override
    public List<String> onTabComplete(CommandSender sender, Command command, String label, String[] args) {
        if (args.length == 1 && label.equals("leavecmd")) {
            return Collections.singletonList("reload");
        }

        return Collections.emptyList();
    }
}
