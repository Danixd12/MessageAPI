package d.studio.messageapi

import d.studio.messageapi.api.Msg
import org.bukkit.plugin.java.JavaPlugin

class MessageAPI : JavaPlugin() {

    lateinit var api: Msg
    override fun onEnable() {
        api = Msg()
    }

}