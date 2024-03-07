package JavaStreams.JavaNIO;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class ClientSocketEx {
    public static void main(String[] args) {

        try {
            // Connect to the server at localhost:8080
            Socket socket = new Socket("localhost", 8080);

            // Send messages to the server
            String[] messages = { "Hello, server!", "How are you?", "Goodbye!" };

            for (String message : messages) {
                OutputStream outputStream = socket.getOutputStream();
                outputStream.write(message.getBytes());
                outputStream.write('\n'); // Add a newline to separate messages
                outputStream.flush();
                System.out.println("Sent to server: " + message);
            }

            // Close the socket
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
