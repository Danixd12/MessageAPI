package d.studio.messageapi;

import d.studio.messageapi.api.MsgKt;
import org.bukkit.plugin.java.JavaPlugin;

public class Messageapi extends JavaPlugin {

    MsgKt messageAPI;

    @Override
    public void onEnable() {
        messageAPI = new MsgKt();
    }
}

