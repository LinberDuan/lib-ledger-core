// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from websocket_client.djinni

package co.ledger.core;

public abstract class WebSocketClient {
    public abstract void connect(String url, WebSocketConnection connection);

    public abstract void send(WebSocketConnection connection, String data);

    public abstract void disconnect(WebSocketConnection connection);
}
