package streamslambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsTest {
    public static void main(String[] args) {
        Integer[] intArr = {1, 6, 4, 2, 1};

        List<Integer> list = new ArrayList<>(Arrays.asList(intArr));

        System.out.println(list.stream().map(String::valueOf).collect(Collectors.joining(",")));
    }
}
