package d.studio.messageapi

import d.studio.messageapi.api.ClickType
import d.studio.messageapi.api.Msgapi
import d.studio.messageapi.api.Type
import org.bukkit.command.Command
import org.bukkit.command.CommandExecutor
import org.bukkit.command.CommandSender

object test: CommandExecutor {
    override fun onCommand(
        sender: CommandSender?,
        command: Command?,
        label: String?,
        args: Array<out String>?
    ): Boolean {

        var api: Msgapi = Msgapi()

        var h = api.createHover("test", "test", Type.TEXT, true);
        api.clickEvent("d", "/asd", ClickType.URL, true)

        return true;
    }
}