package d.studio.messageapi


import net.md_5.bungee.api.chat.*
import org.bukkit.Bukkit
import org.bukkit.ChatColor
import org.bukkit.entity.Player
import org.bukkit.plugin.java.JavaPlugin

class Messageapi : JavaPlugin() {

    override fun onEnable() {
        /**
         * Crea un nuevo mensaje
         * @param player
         * @param msg
         * @param args
         */
        fun createMessage(p: Player, args: String) {

            return p.sendMessage(ChatColor.translateAlternateColorCodes('&', args))
        }

        /**
         * Crea un nuevo mensaje global
         * * Importante agregar permisos
         * @param args
         * @param perms
         */
        fun broadcast(args: String, perms: String): Int {


            return Bukkit.broadcast(ChatColor.translateAlternateColorCodes('&', args), perms)
        }

        /**
         * Crea un nuevo component, BaseComponent
         * * BaseComponent
         * @param args
         * @return BaseComponent
         */
        fun createComponent(args: String): BaseComponent {

            var bc: BaseComponent = TextComponent(args)

            return bc
        }


        /**
         * Crea un nuevo component, ComponentBuilder
         * * ComponentBuilder
         * @param args
         * @return ComponentBuilder
         */
        fun componentBuilder(args: Any): ComponentBuilder {

            return componentBuilder(args)
        }

        /**
         * Crea un nuevo hoverEvent con los parametros dados
         * * Tipos: TEXT, ITEM
         * @param args
         * @param hoverText
         * @param Types
         * @param broadcast?
         *
         * @return BaseComponent como HoverEvent
         */
        fun createHover(args: String, hoverText: Any, Types: Type, broadcast: Boolean): BaseComponent {

            var e = createComponent(args)
            var t = Types.Type()

            when (Types.Type()) {
                HoverEvent.Action.SHOW_TEXT -> e.hoverEvent =
                    HoverEvent(t, arrayOf(createComponent(hoverText as String)))

                HoverEvent.Action.SHOW_ITEM -> e.hoverEvent = HoverEvent(t, hoverText as Array<out BaseComponent>?)

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
            e.hoverEvent = HoverEvent(HoverEvent.Action.SHOW_ITEM, hoverText);

            return e
        }

        /**
         * Crea un nuevo clickEvent con los parametros dados
         * * Tipos: TEXT, ITEM
         * @param args
         * @param clickText
         * @param Type
         * @param broadcast?
         *
         * @return BaseComponent como HoverEvent
         */
        fun clickEvent(args: String, clickText: String, Type: ClickType, broadcast: Boolean): BaseComponent {
            var e = createComponent(args)
            var t = Type.ClickType()

            when (Type.ClickType()) {
                ClickEvent.Action.RUN_COMMAND -> e.clickEvent = ClickEvent(t, clickText)
                ClickEvent.Action.OPEN_URL -> e.clickEvent = ClickEvent(t, clickText)

                else -> {}
            }
            if (broadcast) {
                Bukkit.spigot().broadcast(e)
            }
            return e
        }



    }
    /**
     * Tipo de hover
     *
     * * TEXT, ACTION
     *
     * @return Action.TYPE
     */
    enum class Type(val Type: HoverEvent.Action) {
        /**
         * Tipo: Texto(Valor string)
         *
         * @return Action.SHOW_TEXT
         */
        TEXT(HoverEvent.Action.SHOW_TEXT),

        /**
         * Tipo: Item(Valor BaseComponent[])
         *
         * @return Action.SHOW_ITEM
         */
        ITEM(HoverEvent.Action.SHOW_ITEM);

        fun Type(): HoverEvent.Action {
            return this.Type
        }
    }

    /**
     * Tipo de click
     *
     * * COMMAND, URL
     *
     * @return Action.TYPE
     */
    enum class ClickType(val Type: ClickEvent.Action) {
        /**
         * Tipo: Command(Valor string)
         *
         * @return Action.Command
         */
        COMMAND(ClickEvent.Action.RUN_COMMAND),

        /**
         * Tipo: Url(Valor BaseComponent[])
         *
         * @return Action.Url
         */
        URL(ClickEvent.Action.OPEN_URL);


        fun ClickType(): ClickEvent.Action {
            return this.Type
        }
    }
}
