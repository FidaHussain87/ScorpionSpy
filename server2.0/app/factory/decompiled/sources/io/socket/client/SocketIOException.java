package io.socket.client;

public class SocketIOException extends Exception {
    public SocketIOException() {
    }

    public SocketIOException(String str) {
        super(str);
    }

    public SocketIOException(String str, Throwable th) {
        super(str, th);
    }

    public SocketIOException(Throwable th) {
        super(th);
    }
}
