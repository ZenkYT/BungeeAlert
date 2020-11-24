package dima.main;

import net.md_5.bungee.api.plugin.Plugin;

public class main extends Plugin{
	
	public void onEnable() {
		getProxy().getPluginManager().registerCommand(this, new AlertCommand());
	}

}
