package d.studio.messageapi;

import d.studio.messageapi.api.ClickType;
import d.studio.messageapi.api.EzMessages;
import d.studio.messageapi.api.Type;
import net.md_5.bungee.api.chat.BaseComponent;
import net.md_5.bungee.api.chat.ComponentBuilder;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;
import org.jetbrains.annotations.NotNull;

public class Messageapi extends JavaPlugin {

    EzMessages messageAPI;

    @Override
    public void onEnable() {
        messageAPI = new EzMessages() {
            @NotNull
            @Override
            public BaseComponent clickEvent(@NotNull String args, @NotNull String clickText, @NotNull ClickType Type, boolean broadcast) {
                return EzMessages.super.clickEvent(args, clickText, Type, broadcast);
            }

            @NotNull
            @Override
            public BaseComponent createEmptyHover(@NotNull String args, @NotNull BaseComponent[] hoverText) {
                return EzMessages.super.createEmptyHover(args, hoverText);
            }

            @NotNull
            @Override
            public BaseComponent createHover(@NotNull String args, @NotNull Object hoverText, @NotNull Type Types, boolean broadcast) {
                return EzMessages.super.createHover(args, hoverText, Types, broadcast);
            }

            @NotNull
            @Override
            public ComponentBuilder componentBuilder(@NotNull Object args) {
                return EzMessages.super.componentBuilder(args);
            }

            @NotNull
            @Override
            public BaseComponent createComponent(@NotNull String args) {
                return EzMessages.super.createComponent(args);
            }

            @Override
            public int broadcast(@NotNull String args, @NotNull String perms) {
                return EzMessages.super.broadcast(args, perms);
            }

            @Override
            public void createMessage(@NotNull Player p, @NotNull String args) {
                EzMessages.super.createMessage(p, args);
            }
        };
    }
}

