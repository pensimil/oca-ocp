package io.trywithresources;

import java.io.*;

public class TestClass1 {

    public static void main(String[] args) {
        try {
            OutputStream os = new FileOutputStream("");
            InputStream is = new FileInputStream("");
            is.read();
        } catch (Exception e) {
            e = new FileNotFoundException();
            e.printStackTrace();
        }
    }

//    private int assert() {
//
//    }
}
