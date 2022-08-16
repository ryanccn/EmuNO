package me.ryanccn.emuno.mixin;

import net.minecraft.client.Mouse;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;

/**
 * Adapted from https://github.com/nelson2tm/shift-scroll-fix/blob/master/src/main/java/tk/nelson2tm/shiftscrollfix/mixin/MouseMixin.java
 * MIT licensed by nelson2tm
 *
 * tysm!
 */

@Mixin(Mouse.class)
public class ShiftScrollMixin {
    @ModifyVariable(method = "onMouseScroll", at = @At("HEAD"), index = 5)
    private double scrollFix(double vertical1, long window, double horizontal, double vertical2) {
        return vertical1 == 0 ? horizontal : vertical1;
    }
}
