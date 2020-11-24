package dima.main;

import net.md_5.bungee.api.ChatColor;
import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.ProxyServer;
import net.md_5.bungee.api.plugin.Command;

public class AlertCommand extends Command{

	public AlertCommand() {
		super("alert");
	}

	@Override
	public void execute(CommandSender sender, String[] args) {
		if(sender.hasPermission("bungeecord.command.alert")) {
			if(args.length >= 1) {
				String alert = "";
				for(String msg : args) {
					alert = (alert + msg.replace("&", "\u00a7") + " ");
				}
				ProxyServer.getInstance().broadcast("[" + ChatColor.RED + "ALERT" + ChatColor.WHITE + "] " + sender.getName() + ": " + alert);
			}else {
				sender.sendMessage(ChatColor.RED + "Usage: /alert <Message>");
			}
			
			
			
		}else {
			sender.sendMessage(ChatColor.RED + "You do not have permission.");
		}
	}

}
