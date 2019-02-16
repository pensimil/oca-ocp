package concurrency;

import io.*;

import java.io.Console;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class ConcurencyTest {
    static int i = 4;

    {
        i = 2;
    }

    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList(null, "b", "c"));
        System.out.println(list);
        list.remove(0);
        System.out.println(list);

        List<String> list2 = new ArrayList<>(Arrays.asList(null, "b", "c"));
//        for (int i = 0; i < list2.size(); i++) {
//            list.remove(i);
//        }

        Thread t = new Thread(() -> System.out.println("a"));

        t.start();

        OtherPackage o = new OtherPackage();

        AtomicInteger integer = new AtomicInteger(0);
        new Boolean("");

        boolean bool = true | false;

        Integer i = 2_______6;
        i.equals(3);

        int j, k = 2;
        i = j = k;

        Console c = null;

        float f = 2.12_5f;

        char a = 5555;
//        byte bd = 302;
        float floa = 320;

        Integer is = new Integer(4);
//        Double asadf = 5;

        int fer;

        if (is > 0) fer = 2;
        if (is <= 0) fer = 5;
//        System.out.println(fer);

        switch (i) {
            default:
                System.out.println("");
            case 1:
                break;
        }

        Thread t1 = new Thread(() -> {
            while (true) {
                System.out.println(Thread.currentThread().getName());
            }
        });

        t1.start();
//        t1.join();
    }
}
