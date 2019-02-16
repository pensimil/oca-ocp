package exceptions;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ExceptionTest {
    String i = "1";

    public static void main(String[] args) throws Exception {
//        {
//            int i=0, j=0;
//            double dod = 1.0D;
//
//            ke:
//            for (i = 0; i < 10; i++) {
//                for (j = 0; j < 10; j++) {
//                    if (j == 2) {
//                        continue ke;
//                    }
//                    System.out.println("j");
//                }
//            }
//        }

        List<String> strs = new ArrayList<>();
        strs.add(0, "");
//        strs.add(5, ""); // outofbounds
        Deque<Integer> i = new LinkedList<>();
        System.out.println("sdfjh");

        i.push(1); //[1]
        i.offerLast(2); //[1,2]
        i.pop(); //[2]
        i.push(1); //[1,2]
        i.poll(); //[2]
        i.offer(1); // [2,1]
        i.poll(); //[1]
        i.offerLast(2); //[1,2]
        i.add(3); //[1,2,3]
        i.remove(); // [2,3]
        System.out.println(i.peek()); // je se koukne
        System.out.println(i.element()); // je se koukne
        System.out.println(i);

        System.out.println(true);

        Map<TTT, Integer> aa = new HashMap<>();
        TTT k1 = new TTT();
        TTT k2 = new TTT();
        k2.i = 1;

        aa.put(k1, 1);
        aa.put(k2, 3);
        // k1 -> 1, k2 -> 3 - rovnají se hashkody, ale klice se nerovnaji => ruzne objekty 2 entry
        System.out.println(aa);

        Map<String, Long> count = Stream.of("xs","ss").collect(Collectors.groupingBy(x->x, Collectors.counting()));
//        Stream.of("xs","ss").mapToInt(Integer::valueOf).sum(); // runtime fail

        System.out.println(IntStream.of(1,5).reduce((a, b) -> a+b));

        double dob = 1;
        float flea = 1;

        flea = (float) dob;
        int sda = (int) dob;
    }
}

class TTT {
    int i;

    @Override
    public int hashCode() {
        return 100;
    }

    @Override
    public boolean equals(Object obj) {
        return (obj instanceof TTT) && this.i == ((TTT)obj).i;
    }

    @Override
    public String toString() {
        return "exceptions.TTT{" +
                "i=" + i +
                '}';
    }
}