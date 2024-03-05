package JavaStreams.JavaNIO;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class BufferNIO {
    public static void main(String[] args) {
        Path filePath = Paths.get("JavaStreams/JavaIO/read.txt");
        try {
            FileChannel channel = FileChannel.open(filePath, StandardOpenOption.READ);
            ByteBuffer buffer = ByteBuffer.allocate(1024);
            int byteBuffer = channel.read(buffer);
            System.out.println(buffer);
            while (byteBuffer != -1) {
                buffer.flip(); // Flip the buffer for reading

                // Process the data in the buffer
                while (buffer.hasRemaining()) {
                    System.out.print((char) buffer.get());
                }

                buffer.clear(); // Clear the buffer for the next read
                byteBuffer = channel.read(buffer);
            }
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}
