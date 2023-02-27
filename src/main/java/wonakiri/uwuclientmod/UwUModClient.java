package wonakiri.uwuclientmod;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.client.util.InputUtil;
import net.minecraft.text.Text;
import org.lwjgl.glfw.GLFW;

public class UwUModClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {

        //Setting keybinding for UwU GUI.
        KeyBinding keyBinding;
        keyBinding = KeyBindingHelper.registerKeyBinding(new KeyBinding(
                "UwU GUI", InputUtil.Type.KEYSYM, GLFW.GLFW_KEY_RIGHT_SHIFT,"UwU Client"));

        ClientTickEvents.END_CLIENT_TICK.register(client -> {
            while (keyBinding.wasPressed()) {
                client.player.sendMessage(Text.literal("GUI Key Pressed"), false);
            }
        });
        //Finished setting keybinding.

    }
}
