/*
 * Copyright (C) 2016-2022 phantombot.github.io/PhantomBot
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.gmt2001.wsclient;

import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.http.websocketx.WebSocketFrame;
import io.netty.handler.codec.http.websocketx.WebSocketServerProtocolHandler;

/**
 * Represents a handler for WebSocket client frames
 *
 * @author gmt2001
 */
public interface WsClientFrameHandler {

    /**
     * Handles the WebSocket frame and sends a response back to the server, if necessary
     *
     * @param ctx The {@link ChannelHandlerContext} of the session
     * @param frame The {@link WebSocketFrame} to process
     */
    public void handleFrame(ChannelHandlerContext ctx, WebSocketFrame frame);

    /**
     * Handles the handshake complete event
     *
     * @param ctx The {@link ChannelHandlerContext} of the session
     * @param hc The {@link WebSocketServerProtocolHandler.HandshakeComplete} event
     */
    public void handshakeComplete(ChannelHandlerContext ctx, WebSocketServerProtocolHandler.HandshakeComplete hc);
}
