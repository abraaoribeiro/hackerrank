package Algorithms.Warmup;

import java.util.List;

public class AVeryBigSum {

    public static void main(String[] args) { }

    public static long aVeryBigSum(List <Long> ar) {
        Long sum = 0l;
        for (Long x : ar) {
            sum = sum + x;
        }
        return sum;
    }


}
