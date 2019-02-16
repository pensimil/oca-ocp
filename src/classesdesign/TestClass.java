package classesdesign;

import java.util.Map;
import java.util.stream.DoubleStream;

interface House {
    int a = 2;

    public default String getAddress() {
        return "101 Main Str";
    }
}

interface Office {
    public static String getAddress() {
        return "101 Smart Str";
    }
}

interface WFH extends House, Office {
}

class HomeOffice implements House, Office {
    public String getAddress() {
        return "R No 1, Home";
    }

    public static String getS() {
        return "ss";
    }

    static class StClass {
        public void stat() {
            System.out.println();
            Map<String, String> map;
            DoubleStream is = DoubleStream.of(0, 2, 4);
            double sum = is.filter(i -> i % 2 != 0).sum();
            System.out.println(sum); //3
        }
    }


}

public class TestClass {
    public static void main(String[] args) {
        Office off = new HomeOffice();
        double doub = 5.1 % 2;

        System.out.println(doub);


//        System.out.println(off.getAddress());
    }
}

interface II1 {
    default void m1() {
        System.out.println();
    }
}

interface II2 extends II1 {
    void m1();
}