package me.ryanccn.emuno.mixin;

import net.minecraft.client.gui.screen.Screen;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(Screen.class)
public class KeyboardMixin {
    @Redirect(method = "hasControlDown", at = @At(value = "FIELD", target = "Lnet/minecraft/client/MinecraftClient;IS_SYSTEM_MAC:Z"))
    private static boolean pretendToNotBeMacOSYESAGAIN() {
        // amogus
        return false;
    }
}
