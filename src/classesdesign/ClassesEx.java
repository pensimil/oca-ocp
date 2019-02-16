package classesdesign;

import java.io.IOException;
import java.net.URISyntaxException;

public class ClassesEx {

    public static void main(String[] args) throws URISyntaxException, IOException {
        A1C a = new ClassesEx().new A2C();
        a(a);
        A2C a2 = new ClassesEx().new A2C();
        a(a2);
        a(new ClassesEx().new A1C());
        a(new ClassesEx().new A2C());

    }

    static void a(A1C a) {
        System.out.println("A1C: " + a.getClass());
    }

    static void a(A2C a) {
        System.out.println("A2C: " + a.getClass());
    }

    class A1C {

    }

    class A2C extends A1C {

    }
}
