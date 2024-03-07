package JavaStreams.JavaNIO;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class ChannelSocketServerEx {

    public static void main(String[] args) {
        try {
            // Create a ServerSocket that listens on port 8080
            ServerSocket serverSocket = new ServerSocket(8080);

            System.out.println("Server is listening on port 8080...");

            // Wait for a client to connect
            Socket clientSocket = serverSocket.accept();
            System.out.println("Client connected: " + clientSocket.getInetAddress());

            // Read messages from the client
            BufferedReader reader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            String receivedMessage;

            while ((receivedMessage = reader.readLine()) != null) {
                System.out.println("Received from client: " + receivedMessage);
            }

            // Close the sockets
            reader.close();
            clientSocket.close();
            serverSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
