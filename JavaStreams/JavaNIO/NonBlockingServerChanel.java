package JavaStreams.JavaNIO;


import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.Iterator;
import java.util.Set;

public class NonBlockingServerChanel {

    public static void main(String[] args) {
        try {
            // Create a Selector
            Selector selector = Selector.open();

            // Create a ServerSocketChannel
            ServerSocketChannel serverSocketChannel = ServerSocketChannel.open();
            serverSocketChannel.bind(new InetSocketAddress(8080));
            serverSocketChannel.configureBlocking(false); // Set non-blocking mode

            // Register the ServerSocketChannel with the Selector for accepting connections
            serverSocketChannel.register(selector, SelectionKey.OP_ACCEPT);

            System.out.println("Server is listening on port 8080...");

            while (true) {
                // Wait for events
                selector.select();

                // Get the selected keys
                Set<SelectionKey> selectedKeys = selector.selectedKeys();
                Iterator<SelectionKey> keyIterator = selectedKeys.iterator();

    
                while (keyIterator.hasNext()) {
                    SelectionKey key = keyIterator.next();

                    if (key.isAcceptable()) {
                        // Accept a new connection
                        SocketChannel clientChannel = serverSocketChannel.accept();
                        clientChannel.configureBlocking(false);
                        clientChannel.register(selector, SelectionKey.OP_READ);
                        System.out.println("New client connected: " + clientChannel.getRemoteAddress());
                    } else if (key.isReadable()) {
                        // Read data from the client
                        SocketChannel clientChannel = (SocketChannel) key.channel();
                        ByteBuffer buffer = ByteBuffer.allocate(1024);
                        int bytesRead = clientChannel.read(buffer);

                        if (bytesRead > 0) {
                            buffer.flip();
                            byte[] data = new byte[buffer.remaining()];
                            buffer.get(data);
                            String receivedMessage = new String(data);
                            System.out.println("Received from client " + clientChannel.getRemoteAddress() + ": " + receivedMessage);

                            // Echo the message back to the client
                            ByteBuffer responseBuffer = ByteBuffer.wrap(("Server echoes: " + receivedMessage).getBytes());
                            clientChannel.write(responseBuffer);
                        } else {
                            // Client closed the connection
                            System.out.println("Client " + clientChannel.getRemoteAddress() + " closed the connection.");
                            clientChannel.close();
                        }
                    }

                    keyIterator.remove(); // Remove the current key to avoid processing it again
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

