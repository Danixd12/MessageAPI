package d.studio.messageapi.api

import net.md_5.bungee.api.chat.BaseComponent
import net.md_5.bungee.api.chat.ComponentBuilder
import net.md_5.bungee.api.chat.HoverEvent
import net.md_5.bungee.api.chat.HoverEvent.Action
import net.md_5.bungee.api.chat.TextComponent
import org.bukkit.Bukkit
import org.bukkit.ChatColor
import org.bukkit.entity.Player

class Msgapi {


        /**
         * Crea un nuevo mensaje
         * @param player
         * @param msg
         * @param args
         */
        fun createMessage(p: Player, args: String) {

            return p.sendMessage(ChatColor.translateAlternateColorCodes('&', args))
        }

        fun broadcast(args: String, perms: String): Int {


            return Bukkit.broadcast(args, perms)
        }

        fun createComponent(args: String): BaseComponent {

            var bc: BaseComponent = TextComponent(args)

            return bc
        }

        fun componentBuilder(args: Any): ComponentBuilder {

            return componentBuilder(args)
        }

        /**
         * Crea un nuevo hoverEvent con los parametros dados
         * * Tipos: TEXT, ITEM
         * @param args
         * @param hoverText
         * @param Types
         * @param broadcast
         */
        fun createHover(args: String, hoverText: Any, Types: Type, broadcast: Boolean): BaseComponent {

            var e = createComponent(args)
            var t = Types.Type()

            when (Types.Type()) {
                Action.SHOW_TEXT -> e.hoverEvent = HoverEvent(t, arrayOf(createComponent(hoverText as String)))
                Action.SHOW_ITEM -> e.hoverEvent = HoverEvent(t, hoverText as Array<out BaseComponent>?)

                else -> {}
            }
            if (broadcast) {
                Bukkit.spigot().broadcast(e)
            }
            return e
        }

        @Deprecated("Cambiada en favor de message#createHover")
        fun createEmptyHover(args: String, hoverText: Array<BaseComponent>): BaseComponent {

            var e = createComponent(args)
            e.hoverEvent = HoverEvent(Action.SHOW_ITEM, hoverText);

            return e
        }



}

enum class Type(val Type: Action) {
    TEXT(Action.SHOW_TEXT),
    ITEM(Action.SHOW_ITEM),
    ENTITY(Action.SHOW_ENTITY);

    fun Type(): Action {
        return this.Type
    }
}
