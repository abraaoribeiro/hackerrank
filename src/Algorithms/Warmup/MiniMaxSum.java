package Algorithms.Warmup;

import java.util.Arrays;
import java.util.List;

public class MiniMaxSum {


    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        miniMaxSum(list);
    }

    public static void miniMaxSum (List<Integer> arr) {
        long sum = 0;
        long min = arr.get(0);
        long max = 0;

        for (int i = 0; i < arr.size(); i ++) {
            sum += arr.get(i);
            if (arr.get(i) < min) {
                min = arr.get(i);
            }
            if (arr.get(i) > max) {
                max = arr.get(i);
            }
        }
        System.out.println((sum - max) +" "+ (sum - min));


        // Solution alternative
        //IntSummaryStatistics stat =  Arrays.stream(arr).summaryStatistics();
        //long min = stat.getSum() - stat.getMax();
        //long max = stat.getSum() - stat.getMin();

    }



}
