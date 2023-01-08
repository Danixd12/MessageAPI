package d.studio.messageapi;

import d.studio.messageapi.api.ClickType;
import d.studio.messageapi.api.Msg;
import net.md_5.bungee.api.chat.BaseComponent;
import net.md_5.bungee.api.chat.ComponentBuilder;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;
import org.jetbrains.annotations.NotNull;

public class Messageapi extends JavaPlugin {

    Msg messageAPI;

    @Override
    public void onEnable() {
        messageAPI = new Msg() {
            @NotNull
            @Override
            public BaseComponent clickEvent(@NotNull String args, @NotNull String clickText, @NotNull ClickType Type, boolean broadcast) {
                return Msg.super.clickEvent(args, clickText, Type, broadcast);
            }

            @NotNull
            @Override
            public BaseComponent createEmptyHover(@NotNull String args, @NotNull BaseComponent[] hoverText) {
                return Msg.super.createEmptyHover(args, hoverText);
            }

            @NotNull
            @Override
            public BaseComponent createHover(@NotNull String args, @NotNull Object hoverText, @NotNull Type Types, boolean broadcast) {
                return Msg.super.createHover(args, hoverText, Types, broadcast);
            }

            @NotNull
            @Override
            public ComponentBuilder componentBuilder(@NotNull Object args) {
                return Msg.super.componentBuilder(args);
            }

            @NotNull
            @Override
            public BaseComponent createComponent(@NotNull String args) {
                return Msg.super.createComponent(args);
            }

            @Override
            public int broadcast(@NotNull String args, @NotNull String perms) {
                return Msg.super.broadcast(args, perms);
            }

            @Override
            public void createMessage(@NotNull Player p, @NotNull String args) {
                Msg.super.createMessage(p, args);
            }
        };
    }
}

