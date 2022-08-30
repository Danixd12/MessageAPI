package d.studio.messageapi

import d.studio.messageapi.api.Msg
import org.bukkit.plugin.java.JavaPlugin


class MessageAPI : JavaPlugin() {

    lateinit var api: Msg
    lateinit var Instance: MessageAPI
    override fun onEnable() {
        Instance = this
        api = Msg()
    }

}