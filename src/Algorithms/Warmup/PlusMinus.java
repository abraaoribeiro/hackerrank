package Algorithms.Warmup;

import java.util.Arrays;
import java.util.List;

public class PlusMinus {

    private static List<Integer> a = Arrays.asList(-4, 3, -9, 0, 4, 1);
    public static void main(String[] args) {

        double negative = 0;
        double positive =0;
        double zero = 0;

        negative =  a.stream().filter(n -> n < 0).count();

        positive = a.stream().filter(n -> n > 0).count();

        zero = a.stream().filter(n -> n == 0).count();

        System.out.println("Proporção negative " + negative / a.size());
        System.out.printf("%.6f", positive / a.size());
        System.out.println("Proporção Zero " + zero / a.size());
    }
}
