package JavaStreams.JavaIO.InputStreams;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class BufferedInputStreamEx {
    public static void main(String[] args) {
        
        String filePath = "C:\\Users\\swfn0\\Java basics\\JavaStreams\\JavaIO\\read.txt";

        try{
            FileInputStream fileInputStream = new FileInputStream(filePath);
            BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
            int data;
            while((data=bufferedInputStream.read())!=-1){
                System.out.print((char)data);
            }
            bufferedInputStream.close();
            fileInputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
