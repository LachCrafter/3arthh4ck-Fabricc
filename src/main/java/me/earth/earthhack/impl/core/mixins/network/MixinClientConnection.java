package me.earth.earthhack.impl.core.mixins.network;

import me.earth.earthhack.impl.core.ducks.network.IClientPlayNetworkHandler;
import net.minecraft.network.ClientConnection;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(ClientConnection.class)
public abstract class MixinClientConnection implements IClientPlayNetworkHandler {
    /*
    @Inject(method = "channelRead0(Lio/netty/channel/ChannelHandlerContext;Lnet/minecraft/network/packet/Packet;)V",
            at = @At("HEAD"),
            cancellable = true)
    private void onPacketReceive(ChannelHandlerContext ctx, Packet<?> packet, CallbackInfo info) {
        PacketEvent.Receive<?> event = getReceive(packet);

        try
        {
            Bus.EVENT_BUS.post(event, packet.getClass());
        }
        catch (Throwable t)
        {
            t.printStackTrace();
        }

        if (event.isCancelled())
        {
            info.cancel();
        }
    }
    */
}