package Warmup;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CompareTheTriplets {

    private static List<Integer> a = Arrays.asList(5, 6, 7);
    private static List<Integer> b = Arrays.asList(3, 6, 10);

    public static void main(String[] args) {
        List<Integer> integers = compareTriplets(a, b);
        System.out.println(integers);
    }

    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        ArrayList<Integer> c = new ArrayList<>();
        c.add(0);
        c.add(0);
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) < b.get(i)) {
                c.set(1, c.get(1) + 1);
            } else if (a.get(i) > b.get(i)) {
                c.set(0, c.get(0) + 1);
            }

        }
        return c;
    }
}
