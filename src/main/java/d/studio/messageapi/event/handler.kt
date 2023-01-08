package d.studio.messageapi.event

import org.bukkit.Bukkit
import org.bukkit.event.Listener
import org.bukkit.plugin.Plugin

interface EventHandler : Listener {
}


fun registerEvent(listener: Listener, plugin: Plugin) {
    Bukkit.getPluginManager().registerEvents(listener, plugin)
}
