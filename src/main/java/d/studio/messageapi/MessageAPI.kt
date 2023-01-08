package d.studio.messageapi

import org.bukkit.plugin.java.JavaPlugin

class MessageAPI : JavaPlugin() {

    override fun onEnable() {


        getCommand("hovertest").executor = test


    }

}