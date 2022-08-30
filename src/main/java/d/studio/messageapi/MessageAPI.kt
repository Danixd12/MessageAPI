package d.studio.messageapi

import d.studio.messageapi.api.Msgapi
import org.bukkit.plugin.java.JavaPlugin

class MessageAPI : JavaPlugin() {

    lateinit var plugin: MessageAPI
    lateinit var MessageAPI: Msgapi
    override fun onEnable() {



        MessageAPI = Msgapi()
        plugin = this

    }

}