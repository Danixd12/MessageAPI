package d.studio.messageapi

import d.studio.messageapi.api.createMessage
import d.studio.messageapi.event.EventHandler
import d.studio.messageapi.event.registerEvent
import org.bukkit.event.player.PlayerJoinEvent
import org.bukkit.plugin.Plugin

class Test_events : EventHandler {

    @org.bukkit.event.EventHandler
     fun newEvent(e : PlayerJoinEvent) {
        createMessage(e.player, "Hola")
    }

}

class registerEvents {
    fun events(plugin: Plugin) {
        registerEvent(Test_events(), plugin)
    }
}