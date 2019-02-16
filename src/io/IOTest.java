package io;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class IOTest {

    public static void main(String[] args) throws Exception {
        copy("a", "b");

        //java.nio.file.NoSuchFileException: test.txt
        Path myfile = Paths.get("test.txt");
        try (BufferedReader bfr = Files.newBufferedReader(myfile, Charset.forName("US-ASCII"))) {
            String line = null;
            while ((line = bfr.readLine()) != null) {
                System.out.println(line);
            }
        } catch (Exception e) {
            System.out.println(e);
        }



        OutputStream os;
    }

    public static void copy(String fileName1, String fileName2) throws Exception {
        // kopiruje vsechno z prvniho souboru do druheho a prepise vsechno, co v nem bylo.
        try (InputStream is = new FileInputStream(fileName1); OutputStream os = new FileOutputStream(fileName2);) {
            byte[] buffer = new byte[1024];
            int bytesRead = 0;
            while ((bytesRead = is.read(buffer)) != -1) {
                os.write(buffer, 0, bytesRead);
                System.out.println("Read and written bytes " + bytesRead);
            }
        }
    }
}