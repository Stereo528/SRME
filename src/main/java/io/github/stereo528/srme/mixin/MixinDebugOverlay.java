package io.github.stereo528.srme.mixin;

import io.github.stereo528.srme.SheRa;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.client.gui.components.DebugScreenOverlay;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.List;

@Environment(EnvType.CLIENT)
@Mixin(DebugScreenOverlay.class)
public class MixinDebugOverlay {
    @Inject(method = "getGameInformation", at = @At("TAIL"))
    private void appendInfo(CallbackInfoReturnable<List<String>> cir) {
        if (FabricLoader.getInstance().isDevelopmentEnvironment()) {
            List<String> messages = cir.getReturnValue();

            messages.add("");
            messages.add("[" + SheRa.MOD_NAME + " - Dev Env]");
            messages.add("Version: " + SheRa.VERSION);
            messages.add("");
        }
    }
}

