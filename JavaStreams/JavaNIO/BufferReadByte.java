package JavaStreams.JavaNIO;

import java.nio.ByteBuffer;

public class BufferReadByte {
    public static void main(String[] args) {
        
    ByteBuffer buffer = ByteBuffer.allocate(10);

        // Writing to the ByteBuffer
        buffer.put((byte) 'H');
        buffer.put((byte) 'e');
        buffer.put((byte) 'l');
        buffer.put((byte) 'l');
        buffer.put((byte) 'o');

        // Reading from the ByteBuffer
        buffer.flip();  // Prepare the buffer for reading

        System.out.print("Read from ByteBuffer: ");
        while (buffer.hasRemaining()) {
            System.out.print((char) buffer.get());
        }
        System.out.println();

        // Clear the ByteBuffer for reuse
        buffer.clear();

        // Writing more data to the ByteBuffer
        buffer.put("Java NIO".getBytes());

        // Reading again from the ByteBuffer
        buffer.flip();

        System.out.print("Read from ByteBuffer: ");
        while (buffer.hasRemaining()) {
            System.out.print((char) buffer.get());
        }
        System.out.println();
    }
}
