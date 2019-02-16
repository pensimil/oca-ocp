package trash;

import java.util.Comparator;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class InitTest {

    static String s() {
        return ";";
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        a += (a = 4);
        b = b + (b = 5);
        System.out.println(a + ",  " + b);

        char cha = 1;

        byte sss = 22;
        short shor = 12345;

        switch (cha) {
            case 2:
                System.out.println();
        }

        char[] stringRadoby = {};

        new String(stringRadoby);

//        System.out.println(stringRadoby[5]);
        int[] intArr = new int[0];
        // ArrayIndexOutOfBoundsException
//        intArr[0] = 2;

        int intArr1[] = new int[1];
        System.out.println(intArr1[0]);
        InitTest instance = new InitTest();
        System.out.println(instance.s());

        Stream.of("a", "b")
                .sorted(Comparator.comparing(op -> op))
                .collect(Collectors.toList());

        AtomicInteger integer1 = new AtomicInteger();
        integer1.getAndIncrement();
        System.out.println(integer1);

        Stream.of(1, 10)
                .map(ASta::new)
                .forEach(ASta::test);
    }


}

class ASta {
    final int i;


    public ASta(int i) {
        this.i = i;
    }

    void test() {
        System.out.println(i);
    }
}