package collections.binarysearch;

import java.util.Arrays;

public class BinSearch {
    public static void main(String[] args) {
        // pole musí být seřazené, aby binary search fungoval, jinak by to mohlo vracet nesmysly
        Integer[] intArr = {1, 6, 4, 2, 1};
        Arrays.sort(intArr);

        // pokud prvek existuje vrátí se první nalezený index
        // pokud neexistuje výpočet návratové hodnoty => (-t - 1) -> t = index, kam by se vložil hledaný prvek, aby pole bylo stále seřazené
        System.out.println(Arrays.binarySearch(intArr, 0)); // -1 (t = 0)
        System.out.println(Arrays.binarySearch(intArr, 6)); // 4
        System.out.println(Arrays.binarySearch(intArr, 2)); // 2
        System.out.println(Arrays.binarySearch(intArr, 7)); // -6 (t = 5)
    }
}
