package com.bblink.data.transfer.netty;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;

public class SimpleServerHandler extends ChannelInboundHandlerAdapter {

    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {

        ByteBuf buf = (ByteBuf)msg;
        byte [] req = new byte[buf.readableBytes()];

        buf.readBytes(req);

        String message = new String(req,"UTF-8");

        System.out.println("Netty-Server:Receive Message,"+ message);

    }
}