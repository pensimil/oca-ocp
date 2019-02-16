package io;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class SerializeTest {

    public static void main(String[] args) throws IOException {

        try (ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("test_seri"))) {
            os.writeObject(new SerializableClass(new NotserializableSubclass("abc")));
        }

        try (ObjectInputStream is = new ObjectInputStream(Files.newInputStream(Paths.get("test_seri")))) {
            SerializableClass c = (SerializableClass) is.readObject();
            System.out.println(c.getNotserializableSubclass().getSou());
            c.s = "sadf";
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        PrintWriter owr = null;
        Console c = System.console();
        c.readLine();
        owr.checkError();
        // no errors - caught
//        owr.write();

        File f = new File("x");
        BufferedReader bfr1 = new BufferedReader(new FileReader(f));
        BufferedReader bfr2 = new BufferedReader(bfr1);
//        PrintWriter pw = new PrintWriter(new FileReader(f));

        OtherPackage op = new OtherPackage();
    }
}
