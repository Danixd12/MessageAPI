package d.studio.messageapi

import d.studio.messageapi.api.Msgapi
import org.bukkit.plugin.java.JavaPlugin

class MessageAPI : JavaPlugin() {

    lateinit var plugin: MessageAPI
    lateinit var api: Msgapi
    override fun onEnable() {

        api = api
        plugin = this

    }

}